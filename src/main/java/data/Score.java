package data;

/**
 * The type Score.
 */
public class Score
{
    private Long no;

    private Long courseNo;

    private Float usualScore;

    private Float endScore;

    private Float finalScore;

    private Float gradePoint;

    private String semester;

    /**
     * Gets no.
     *
     * @return the no
     */
    public Long getNo()
    {
        return no;
    }

    /**
     * Sets no.
     *
     * @param no the no
     */
    public void setNo(Long no)
    {
        this.no = no;
    }

    /**
     * Gets course no.
     *
     * @return the course no
     */
    public Long getCourseNo()
    {
        return courseNo;
    }

    /**
     * Sets course no.
     *
     * @param courseNo the course no
     */
    public void setCourseNo(Long courseNo)
    {
        this.courseNo = courseNo;
    }

    /**
     * Gets usual score.
     *
     * @return the usual score
     */
    public Float getUsualScore()
    {
        return usualScore;
    }

    /**
     * Sets usual score.
     *
     * @param usualScore the usual score
     */
    public void setUsualScore(Float usualScore)
    {
        this.usualScore = usualScore;
    }

    /**
     * Gets end score.
     *
     * @return the end score
     */
    public Float getEndScore()
    {
        return endScore;
    }

    /**
     * Sets end score.
     *
     * @param endScore the end score
     */
    public void setEndScore(Float endScore)
    {
        this.endScore = endScore;
    }

    /**
     * Gets final score.
     *
     * @return the final score
     */
    public Float getFinalScore()
    {
        return finalScore;
    }

    /**
     * Sets final score.
     *
     * @param finalScore the final score
     */
    public void setFinalScore(Float finalScore)
    {
        this.finalScore = finalScore;
    }

    /**
     * Gets grade point.
     *
     * @return the grade point
     */
    public Float getGradePoint()
    {
        return gradePoint;
    }

    /**
     * Sets grade point.
     *
     * @param gradePoint the grade point
     */
    public void setGradePoint(Float gradePoint)
    {
        this.gradePoint = gradePoint;
    }

    /**
     * Gets semester.
     *
     * @return the semester
     */
    public String getSemester()
    {
        return semester;
    }

    /**
     * Sets semester.
     *
     * @param semester the semester
     */
    public void setSemester(String semester)
    {
        this.semester = semester;
    }

    @Override
    @SuppressWarnings("all")
    public String toString()
    {
        final StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("no：").append(no).append('\n');
        stringbuilder.append("courseNo：").append(courseNo).append('\n');
        stringbuilder.append("usualScore：").append(usualScore).append('\n');
        stringbuilder.append("endScore：").append(endScore).append('\n');
        stringbuilder.append("finalScore：").append(finalScore).append('\n');
        stringbuilder.append("gradePoint：").append(gradePoint).append('\n');
        stringbuilder.append("semester：").append(semester).append('\n');
        return stringbuilder.toString();
    }
}