package data;

/**
 * The type Administrators password.
 */
public class AdministratorsPassword
{
    private Long administratorNo;

    private String administratorPassword;

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
     * Gets administrator password.
     *
     * @return the administrator password
     */
    public String getAdministratorPassword()
    {
        return administratorPassword;
    }

    /**
     * Sets administrator password.
     *
     * @param administratorPassword the administrator password
     */
    public void setAdministratorPassword(String administratorPassword)
    {
        this.administratorPassword = administratorPassword;
    }

    @Override
    @SuppressWarnings("all")
    public String toString()
    {
        final StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("administratorNo：").append(administratorNo).append('\n');
        stringbuilder.append("administratorPassword：").append(administratorPassword).append('\n');
        return stringbuilder.toString();
    }
}