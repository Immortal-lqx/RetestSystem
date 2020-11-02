package RetestSystem;

import java.util.ArrayList;

public class ExamPaper {
    //TODO
    // 似乎少了一个构造函数，是否有必要呢？

    private ArrayList<TestItem> testItems;

    /**
     * Get the total score of this ExamPaper object.
     */
    public double getTotalScore() {
        double totalScore = 0.0d;
        for (TestItem testItem : testItems) {
            totalScore += testItem.getScore();
        }
        return totalScore;
    }

    /**
     * Add a testItem in this examPaper.
     *
     * @param testItem TestItem arguments. The testItem you want to add in this examPaper.
     */
    public void addTestItem(TestItem testItem) {
        testItems.add(testItem);
    }

    /**
     * Remove a testItem in this ExamPaper object.
     *
     * @param testItem TestItem arguments. The testItem you want to remove in this examPaper.
     */
    public void removeTestItem(TestItem testItem) {
        testItems.remove(testItem);
    }

    /**
     * Get the testItem by its id.
     *
     * @param index int arguments. The id of the testItem you want to get.
     */
    public TestItem getTestItem(int index) {
        return testItems.get(index);
    }

    /**
     * Get the number of TestItem object in this ExamPaper object.
     */
    public int getNumberOfItems() {
        return testItems.size();
    }

}
