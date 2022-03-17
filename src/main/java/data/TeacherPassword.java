package data;

/**
 * The type Teacher password.
 */
public class TeacherPassword
{
    private Long teacherNo;

    private String teacherPassword;

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
     * Gets teacher password.
     *
     * @return the teacher password
     */
    public String getTeacherPassword()
    {
        return teacherPassword;
    }

    /**
     * Sets teacher password.
     *
     * @param teacherPassword the teacher password
     */
    public void setTeacherPassword(String teacherPassword)
    {
        this.teacherPassword = teacherPassword;
    }

    @Override
    @SuppressWarnings("all")
    public String toString()
    {
        final StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("teacherNo：").append(teacherNo).append('\n');
        stringbuilder.append("teacherPassword：").append(teacherPassword).append('\n');
        return stringbuilder.toString();
    }
}