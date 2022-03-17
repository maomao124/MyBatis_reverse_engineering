package data;

/**
 * The type Forum.
 */
public class Forum
{
    private Long forumNo;

    private Long forumPeopleNo;

    private String forumName;

    private String forumIdentity;

    private String forumTime;

    private String forumContent;

    /**
     * Gets forum no.
     *
     * @return the forum no
     */
    public Long getForumNo()
    {
        return forumNo;
    }

    /**
     * Sets forum no.
     *
     * @param forumNo the forum no
     */
    public void setForumNo(Long forumNo)
    {
        this.forumNo = forumNo;
    }

    /**
     * Gets forum people no.
     *
     * @return the forum people no
     */
    public Long getForumPeopleNo()
    {
        return forumPeopleNo;
    }

    /**
     * Sets forum people no.
     *
     * @param forumPeopleNo the forum people no
     */
    public void setForumPeopleNo(Long forumPeopleNo)
    {
        this.forumPeopleNo = forumPeopleNo;
    }

    /**
     * Gets forum name.
     *
     * @return the forum name
     */
    public String getForumName()
    {
        return forumName;
    }

    /**
     * Sets forum name.
     *
     * @param forumName the forum name
     */
    public void setForumName(String forumName)
    {
        this.forumName = forumName;
    }

    /**
     * Gets forum identity.
     *
     * @return the forum identity
     */
    public String getForumIdentity()
    {
        return forumIdentity;
    }

    /**
     * Sets forum identity.
     *
     * @param forumIdentity the forum identity
     */
    public void setForumIdentity(String forumIdentity)
    {
        this.forumIdentity = forumIdentity;
    }

    /**
     * Gets forum time.
     *
     * @return the forum time
     */
    public String getForumTime()
    {
        return forumTime;
    }

    /**
     * Sets forum time.
     *
     * @param forumTime the forum time
     */
    public void setForumTime(String forumTime)
    {
        this.forumTime = forumTime;
    }

    /**
     * Gets forum content.
     *
     * @return the forum content
     */
    public String getForumContent()
    {
        return forumContent;
    }

    /**
     * Sets forum content.
     *
     * @param forumContent the forum content
     */
    public void setForumContent(String forumContent)
    {
        this.forumContent = forumContent;
    }

    @Override
    @SuppressWarnings("all")
    public String toString()
    {
        final StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("forumNo：").append(forumNo).append('\n');
        stringbuilder.append("forumPeopleNo：").append(forumPeopleNo).append('\n');
        stringbuilder.append("forumName：").append(forumName).append('\n');
        stringbuilder.append("forumIdentity：").append(forumIdentity).append('\n');
        stringbuilder.append("forumTime：").append(forumTime).append('\n');
        stringbuilder.append("forumContent：").append(forumContent).append('\n');
        return stringbuilder.toString();
    }
}