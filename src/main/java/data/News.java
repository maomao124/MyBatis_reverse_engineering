package data;

/**
 * The type News.
 */
public class News
{
    private Long newNo;

    private String newAuthor;

    private String newIdentity;

    private String newTime;

    private String newTitle;

    private String newText;

    /**
     * Gets new no.
     *
     * @return the new no
     */
    public Long getNewNo()
    {
        return newNo;
    }

    /**
     * Sets new no.
     *
     * @param newNo the new no
     */
    public void setNewNo(Long newNo)
    {
        this.newNo = newNo;
    }

    /**
     * Gets new author.
     *
     * @return the new author
     */
    public String getNewAuthor()
    {
        return newAuthor;
    }

    /**
     * Sets new author.
     *
     * @param newAuthor the new author
     */
    public void setNewAuthor(String newAuthor)
    {
        this.newAuthor = newAuthor;
    }

    /**
     * Gets new identity.
     *
     * @return the new identity
     */
    public String getNewIdentity()
    {
        return newIdentity;
    }

    /**
     * Sets new identity.
     *
     * @param newIdentity the new identity
     */
    public void setNewIdentity(String newIdentity)
    {
        this.newIdentity = newIdentity;
    }

    /**
     * Gets new time.
     *
     * @return the new time
     */
    public String getNewTime()
    {
        return newTime;
    }

    /**
     * Sets new time.
     *
     * @param newTime the new time
     */
    public void setNewTime(String newTime)
    {
        this.newTime = newTime;
    }

    /**
     * Gets new title.
     *
     * @return the new title
     */
    public String getNewTitle()
    {
        return newTitle;
    }

    /**
     * Sets new title.
     *
     * @param newTitle the new title
     */
    public void setNewTitle(String newTitle)
    {
        this.newTitle = newTitle;
    }

    /**
     * Gets new text.
     *
     * @return the new text
     */
    public String getNewText()
    {
        return newText;
    }

    /**
     * Sets new text.
     *
     * @param newText the new text
     */
    public void setNewText(String newText)
    {
        this.newText = newText;
    }

    @Override
    @SuppressWarnings("all")
    public String toString()
    {
        final StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("newNo：").append(newNo).append('\n');
        stringbuilder.append("newAuthor：").append(newAuthor).append('\n');
        stringbuilder.append("newIdentity：").append(newIdentity).append('\n');
        stringbuilder.append("newTime：").append(newTime).append('\n');
        stringbuilder.append("newTitle：").append(newTitle).append('\n');
        stringbuilder.append("newText：").append(newText).append('\n');
        return stringbuilder.toString();
    }
}