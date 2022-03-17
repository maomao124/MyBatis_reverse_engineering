package data;

/**
 * The type Teacher.
 */
public class Teacher
{
    private Long teacherNo;

    private String teacherName;

    private String teacherSex;

    private String teacherTelephoneNumber;

    private String teacherEmail;

    private String teacherAddress;

    private String teacherIdcard;

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
     * Gets teacher name.
     *
     * @return the teacher name
     */
    public String getTeacherName()
    {
        return teacherName;
    }

    /**
     * Sets teacher name.
     *
     * @param teacherName the teacher name
     */
    public void setTeacherName(String teacherName)
    {
        this.teacherName = teacherName;
    }

    /**
     * Gets teacher sex.
     *
     * @return the teacher sex
     */
    public String getTeacherSex()
    {
        return teacherSex;
    }

    /**
     * Sets teacher sex.
     *
     * @param teacherSex the teacher sex
     */
    public void setTeacherSex(String teacherSex)
    {
        this.teacherSex = teacherSex;
    }

    /**
     * Gets teacher telephone number.
     *
     * @return the teacher telephone number
     */
    public String getTeacherTelephoneNumber()
    {
        return teacherTelephoneNumber;
    }

    /**
     * Sets teacher telephone number.
     *
     * @param teacherTelephoneNumber the teacher telephone number
     */
    public void setTeacherTelephoneNumber(String teacherTelephoneNumber)
    {
        this.teacherTelephoneNumber = teacherTelephoneNumber;
    }

    /**
     * Gets teacher email.
     *
     * @return the teacher email
     */
    public String getTeacherEmail()
    {
        return teacherEmail;
    }

    /**
     * Sets teacher email.
     *
     * @param teacherEmail the teacher email
     */
    public void setTeacherEmail(String teacherEmail)
    {
        this.teacherEmail = teacherEmail;
    }

    /**
     * Gets teacher address.
     *
     * @return the teacher address
     */
    public String getTeacherAddress()
    {
        return teacherAddress;
    }

    /**
     * Sets teacher address.
     *
     * @param teacherAddress the teacher address
     */
    public void setTeacherAddress(String teacherAddress)
    {
        this.teacherAddress = teacherAddress;
    }

    /**
     * Gets teacher idcard.
     *
     * @return the teacher idcard
     */
    public String getTeacherIdcard()
    {
        return teacherIdcard;
    }

    /**
     * Sets teacher idcard.
     *
     * @param teacherIdcard the teacher idcard
     */
    public void setTeacherIdcard(String teacherIdcard)
    {
        this.teacherIdcard = teacherIdcard;
    }

    @Override
    @SuppressWarnings("all")
    public String toString()
    {
        final StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("teacherNo：").append(teacherNo).append('\n');
        stringbuilder.append("teacherName：").append(teacherName).append('\n');
        stringbuilder.append("teacherSex：").append(teacherSex).append('\n');
        stringbuilder.append("teacherTelephoneNumber：").append(teacherTelephoneNumber).append('\n');
        stringbuilder.append("teacherEmail：").append(teacherEmail).append('\n');
        stringbuilder.append("teacherAddress：").append(teacherAddress).append('\n');
        stringbuilder.append("teacherIdcard：").append(teacherIdcard).append('\n');
        return stringbuilder.toString();
    }
}