package RetestSystem;

/**
 * This class implements a Test.
 */
public class Test {

    private final String code;
    private final String title;
    private final int difficultyDegree;
    private final String scoreCriteria;

    /**
     * Constructs a <code>Test</code> object.
     *
     * @param initial_code             String arguments. Means a test's code.
     * @param initial_title            String arguments. Means a test's title.
     * @param initial_difficultyDegree int arguments. Means a test's difficultyDegree.
     * @param initial_scoreCriteria    String arguments. Means a test's scoreCriteria.
     */
    public Test(String initial_code,
                String initial_title,
                int initial_difficultyDegree,
                String initial_scoreCriteria) {

        this.code = initial_code;
        this.title = initial_title;
        this.difficultyDegree = initial_difficultyDegree;
        this.scoreCriteria = initial_scoreCriteria;
    }

    /**
     * Get the code of a test object.
     *
     * @return the code of this test.
     */
    public String getCode() {
        return this.code;
    }

    /**
     * Get the title of a test object.
     *
     * @return the title of this test.
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * Get the difficultyDegree of a test object.
     *
     * @return the difficultyDegree of this test.
     */
    public int getDifficultyDegree() {
        return this.difficultyDegree;
    }

    /**
     * Get the scoreCriteria of a test object.
     *
     * @return the scoreCriteria of this test.
     */
    public String getScoreCriteria() {
        return this.scoreCriteria;
    }

    @Override
    public String toString() {
        return "Test{" +
                "difficultyDegree=" + difficultyDegree +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
