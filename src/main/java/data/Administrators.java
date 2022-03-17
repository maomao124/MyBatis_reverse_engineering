package data;

/**
 * The type Administrators.
 */
public class Administrators
{
    private Long administratorNo;

    private String administratorName;

    private String administratorSex;

    private String administratorTelephoneNumber;

    private String administratorJob;

    private String administratorIdcard;

    /**
     * Gets administrator no.
     *
     * @return the administrator no
     */
    public Long getAdministratorNo()
    {
        return administratorNo;
    }

    /**
     * Sets administrator no.
     *
     * @param administratorNo the administrator no
     */
    public void setAdministratorNo(Long administratorNo)
    {
        this.administratorNo = administratorNo;
    }

    /**
     * Gets administrator name.
     *
     * @return the administrator name
     */
    public String getAdministratorName()
    {
        return administratorName;
    }

    /**
     * Sets administrator name.
     *
     * @param administratorName the administrator name
     */
    public void setAdministratorName(String administratorName)
    {
        this.administratorName = administratorName;
    }

    /**
     * Gets administrator sex.
     *
     * @return the administrator sex
     */
    public String getAdministratorSex()
    {
        return administratorSex;
    }

    /**
     * Sets administrator sex.
     *
     * @param administratorSex the administrator sex
     */
    public void setAdministratorSex(String administratorSex)
    {
        this.administratorSex = administratorSex;
    }

    /**
     * Gets administrator telephone number.
     *
     * @return the administrator telephone number
     */
    public String getAdministratorTelephoneNumber()
    {
        return administratorTelephoneNumber;
    }

    /**
     * Sets administrator telephone number.
     *
     * @param administratorTelephoneNumber the administrator telephone number
     */
    public void setAdministratorTelephoneNumber(String administratorTelephoneNumber)
    {
        this.administratorTelephoneNumber = administratorTelephoneNumber;
    }

    /**
     * Gets administrator job.
     *
     * @return the administrator job
     */
    public String getAdministratorJob()
    {
        return administratorJob;
    }

    /**
     * Sets administrator job.
     *
     * @param administratorJob the administrator job
     */
    public void setAdministratorJob(String administratorJob)
    {
        this.administratorJob = administratorJob;
    }

    /**
     * Gets administrator idcard.
     *
     * @return the administrator idcard
     */
    public String getAdministratorIdcard()
    {
        return administratorIdcard;
    }

    /**
     * Sets administrator idcard.
     *
     * @param administratorIdcard the administrator idcard
     */
    public void setAdministratorIdcard(String administratorIdcard)
    {
        this.administratorIdcard = administratorIdcard;
    }

    @Override
    @SuppressWarnings("all")
    public String toString()
    {
        final StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("administratorNo：").append(administratorNo).append('\n');
        stringbuilder.append("administratorName：").append(administratorName).append('\n');
        stringbuilder.append("administratorSex：").append(administratorSex).append('\n');
        stringbuilder.append("administratorTelephoneNumber：").append(administratorTelephoneNumber).append('\n');
        stringbuilder.append("administratorJob：").append(administratorJob).append('\n');
        stringbuilder.append("administratorIdcard：").append(administratorIdcard).append('\n');
        return stringbuilder.toString();
    }
}