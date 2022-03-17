package data;

/**
 * The type Course.
 */
public class Course
{
    private Integer cno;

    private String name;

    /**
     * Gets cno.
     *
     * @return the cno
     */
    public Integer getCno()
    {
        return cno;
    }

    /**
     * Sets cno.
     *
     * @param cno the cno
     */
    public void setCno(Integer cno)
    {
        this.cno = cno;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName()
    {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name)
    {
        this.name = name;
    }

    @Override
    @SuppressWarnings("all")
    public String toString()
    {
        final StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("cno：").append(cno).append('\n');
        stringbuilder.append("name：").append(name).append('\n');
        return stringbuilder.toString();
    }
}