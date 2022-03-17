package data;

/**
 * The type Student password.
 */
public class StudentPassword
{
    private Long no;

    private String password;

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
     * Gets password.
     *
     * @return the password
     */
    public String getPassword()
    {
        return password;
    }

    /**
     * Sets password.
     *
     * @param password the password
     */
    public void setPassword(String password)
    {
        this.password = password;
    }

    @Override
    @SuppressWarnings("all")
    public String toString()
    {
        final StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("no：").append(no).append('\n');
        stringbuilder.append("password：").append(password).append('\n');
        return stringbuilder.toString();
    }
}