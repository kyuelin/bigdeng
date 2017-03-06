package dev.kyuelin.bigdeng.beaniodemo.mains;

import dev.kyuelin.bigdeng.beaniodemo.model.SATSchoolResult;
import org.beanio.BeanReader;
import org.beanio.StreamFactory;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by kennethlin on 3/5/17.
 */
public class DemoApp {
    public void readCsvUsingBeanio() {
        StreamFactory factory = StreamFactory.newInstance();
        factory.loadResource("SATSchoolResult.xml");
        InputStream is = this.getClass().getResourceAsStream("/data/SAT__College_Board__2010_School_Level_Results.csv");
        //verifyInputStream(is);
        BeanReader reader = factory.createReader("satschoolresult", new InputStreamReader(is));
        List<SATSchoolResult> satSchoolResultList = new ArrayList<SATSchoolResult>();
        Object record;
        while ((record = reader.read()) != null) {
            if ("header".equals(reader.getRecordName())) {
                Map<String, Object> header = (Map<String, Object>) record;
                System.out.println(header.toString());
            } else if ("result".equals(reader.getRecordName())) {
                SATSchoolResult result = (SATSchoolResult) record;
                satSchoolResultList.add(result);
            }
        }
        satSchoolResultList.forEach(System.out::println);
        //satSchoolResultList.forEach(result -> System.out.println(result));
    }

    private void verifyInputStream(InputStream is) {
        int counter = 0;
        int data;
        try {
            data = is.read();
            while (data != -1) {
                if (data == (char) 0x0A) {
                    counter++;
                }
                System.out.print((char) data);
                data = is.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(counter);
    }

    public static void main(String[] args) {
        new DemoApp().readCsvUsingBeanio();
    }
}
