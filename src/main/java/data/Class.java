package data;

/**
 * The type Class.
 */
public class Class
{
    private Long classNo;

    private String className;

    private String classCollege;

    private String classMajor;

    private Integer classEnrollmentYear;

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
     * Gets class name.
     *
     * @return the class name
     */
    public String getClassName()
    {
        return className;
    }

    /**
     * Sets class name.
     *
     * @param className the class name
     */
    public void setClassName(String className)
    {
        this.className = className;
    }

    /**
     * Gets class college.
     *
     * @return the class college
     */
    public String getClassCollege()
    {
        return classCollege;
    }

    /**
     * Sets class college.
     *
     * @param classCollege the class college
     */
    public void setClassCollege(String classCollege)
    {
        this.classCollege = classCollege;
    }

    /**
     * Gets class major.
     *
     * @return the class major
     */
    public String getClassMajor()
    {
        return classMajor;
    }

    /**
     * Sets class major.
     *
     * @param classMajor the class major
     */
    public void setClassMajor(String classMajor)
    {
        this.classMajor = classMajor;
    }

    /**
     * Gets class enrollment year.
     *
     * @return the class enrollment year
     */
    public Integer getClassEnrollmentYear()
    {
        return classEnrollmentYear;
    }

    /**
     * Sets class enrollment year.
     *
     * @param classEnrollmentYear the class enrollment year
     */
    public void setClassEnrollmentYear(Integer classEnrollmentYear)
    {
        this.classEnrollmentYear = classEnrollmentYear;
    }

    @Override
    @SuppressWarnings("all")
    public String toString()
    {
        final StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("classNo：").append(classNo).append('\n');
        stringbuilder.append("className：").append(className).append('\n');
        stringbuilder.append("classCollege：").append(classCollege).append('\n');
        stringbuilder.append("classMajor：").append(classMajor).append('\n');
        stringbuilder.append("classEnrollmentYear：").append(classEnrollmentYear).append('\n');
        return stringbuilder.toString();
    }
}