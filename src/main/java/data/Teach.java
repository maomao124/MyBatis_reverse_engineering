package data;

/**
 * The type Teach.
 */
public class Teach
{
    private Long teachNo;

    private Long teacherNo;

    private Long classNo;

    private Long courseNo;

    private String semester;

    /**
     * Gets teach no.
     *
     * @return the teach no
     */
    public Long getTeachNo()
    {
        return teachNo;
    }

    /**
     * Sets teach no.
     *
     * @param teachNo the teach no
     */
    public void setTeachNo(Long teachNo)
    {
        this.teachNo = teachNo;
    }

    /**
     * Gets teacher no.
     *
     * @return the teacher no
     */
    public Long getTeacherNo()
    {
        return teacherNo;
    }

    /**
     * Sets teacher no.
     *
     * @param teacherNo the teacher no
     */
    public void setTeacherNo(Long teacherNo)
    {
        this.teacherNo = teacherNo;
    }

    /**
     * Gets class no.
     *
     * @return the class no
     */
    public Long getClassNo()
    {
        return classNo;
    }

    /**
     * Sets class no.
     *
     * @param classNo the class no
     */
    public void setClassNo(Long classNo)
    {
        this.classNo = classNo;
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
        stringbuilder.append("teachNo：").append(teachNo).append('\n');
        stringbuilder.append("teacherNo：").append(teacherNo).append('\n');
        stringbuilder.append("classNo：").append(classNo).append('\n');
        stringbuilder.append("courseNo：").append(courseNo).append('\n');
        stringbuilder.append("semester：").append(semester).append('\n');
        return stringbuilder.toString();
    }
}