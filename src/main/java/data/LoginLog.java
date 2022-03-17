package data;

/**
 * The type Login log.
 */
public class LoginLog
{
    private Long logNo;

    private String logTime;

    private Long logLoginNo;

    private String logName;

    /**
     * Gets log no.
     *
     * @return the log no
     */
    public Long getLogNo()
    {
        return logNo;
    }

    /**
     * Sets log no.
     *
     * @param logNo the log no
     */
    public void setLogNo(Long logNo)
    {
        this.logNo = logNo;
    }

    /**
     * Gets log time.
     *
     * @return the log time
     */
    public String getLogTime()
    {
        return logTime;
    }

    /**
     * Sets log time.
     *
     * @param logTime the log time
     */
    public void setLogTime(String logTime)
    {
        this.logTime = logTime;
    }

    /**
     * Gets log login no.
     *
     * @return the log login no
     */
    public Long getLogLoginNo()
    {
        return logLoginNo;
    }

    /**
     * Sets log login no.
     *
     * @param logLoginNo the log login no
     */
    public void setLogLoginNo(Long logLoginNo)
    {
        this.logLoginNo = logLoginNo;
    }

    /**
     * Gets log name.
     *
     * @return the log name
     */
    public String getLogName()
    {
        return logName;
    }

    /**
     * Sets log name.
     *
     * @param logName the log name
     */
    public void setLogName(String logName)
    {
        this.logName = logName;
    }

    @Override
    @SuppressWarnings("all")
    public String toString()
    {
        final StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("logNo：").append(logNo).append('\n');
        stringbuilder.append("logTime：").append(logTime).append('\n');
        stringbuilder.append("logLoginNo：").append(logLoginNo).append('\n');
        stringbuilder.append("logName：").append(logName).append('\n');
        return stringbuilder.toString();
    }
}