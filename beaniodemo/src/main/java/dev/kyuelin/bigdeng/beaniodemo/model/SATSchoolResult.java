package dev.kyuelin.bigdeng.beaniodemo.model;

/**
 * Created by kennethlin on 3/5/17.
 DBN,School Name,Number of Test Takers,Critical Reading Mean,Mathematics Mean,Writing Mean
 01M292,Henry Street School for Stringernational Studies ,31,391,425,385
 */
public class SATSchoolResult {
    private String dbn;
    private String schoolName;
    private String numberOfTestTaker;
    private String criticalReadingMean;
    private String mathematicsMean;
    private String writingMean;

    @Override
    public String toString() {
        return "SATSchoolResult{" +
                "dbn='" + dbn + '\'' +
                ", schoolName='" + schoolName + '\'' +
                ", numberOfTestTaker=" + numberOfTestTaker +
                ", criticalReadingMean=" + criticalReadingMean +
                ", mathematicsMean=" + mathematicsMean +
                ", writingMean=" + writingMean +
                '}';
    }

    public String getDbn() {
        return dbn;
    }

    public void setDbn(String dbn) {
        this.dbn = dbn;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getNumberOfTestTaker() {
        return numberOfTestTaker;
    }

    public void setNumberOfTestTaker(String numberOfTestTaker) {
        this.numberOfTestTaker = numberOfTestTaker;
    }

    public String getCriticalReadingMean() {
        return criticalReadingMean;
    }

    public void setCriticalReadingMean(String criticalReadingMean) {
        this.criticalReadingMean = criticalReadingMean;
    }

    public String getMathematicsMean() {
        return mathematicsMean;
    }

    public void setMathematicsMean(String mathematicsMean) {
        this.mathematicsMean = mathematicsMean;
    }

    public String getWritingMean() {
        return writingMean;
    }

    public void setWritingMean(String writingMean) {
        this.writingMean = writingMean;
    }

}
