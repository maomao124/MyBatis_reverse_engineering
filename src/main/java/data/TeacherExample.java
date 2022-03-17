package data;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Teacher example.
 */
public class TeacherExample
{
    /**
     * The Order by clause.
     */
    protected String orderByClause;

    /**
     * The Distinct.
     */
    protected boolean distinct;

    /**
     * The Ored criteria.
     */
    protected List<Criteria> oredCriteria;

    /**
     * Instantiates a new Teacher example.
     */
    public TeacherExample()
    {
        oredCriteria = new ArrayList<>();
    }

    /**
     * Sets order by clause.
     *
     * @param orderByClause the order by clause
     */
    public void setOrderByClause(String orderByClause)
    {
        this.orderByClause = orderByClause;
    }

    /**
     * Gets order by clause.
     *
     * @return the order by clause
     */
    public String getOrderByClause()
    {
        return orderByClause;
    }

    /**
     * Sets distinct.
     *
     * @param distinct the distinct
     */
    public void setDistinct(boolean distinct)
    {
        this.distinct = distinct;
    }

    /**
     * Is distinct boolean.
     *
     * @return the boolean
     */
    public boolean isDistinct()
    {
        return distinct;
    }

    /**
     * Gets ored criteria.
     *
     * @return the ored criteria
     */
    public List<Criteria> getOredCriteria()
    {
        return oredCriteria;
    }

    /**
     * Or.
     *
     * @param criteria the criteria
     */
    public void or(Criteria criteria)
    {
        oredCriteria.add(criteria);
    }

    /**
     * Or criteria.
     *
     * @return the criteria
     */
    public Criteria or()
    {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * Create criteria criteria.
     *
     * @return the criteria
     */
    public Criteria createCriteria()
    {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0)
        {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * Create criteria internal criteria.
     *
     * @return the criteria
     */
    protected Criteria createCriteriaInternal()
    {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * Clear.
     */
    public void clear()
    {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * The type Generated criteria.
     */
    protected abstract static class GeneratedCriteria
    {
        /**
         * The Criteria.
         */
        protected List<Criterion> criteria;

        /**
         * Instantiates a new Generated criteria.
         */
        protected GeneratedCriteria()
        {
            super();
            criteria = new ArrayList<>();
        }

        /**
         * Is valid boolean.
         *
         * @return the boolean
         */
        public boolean isValid()
        {
            return criteria.size() > 0;
        }

        /**
         * Gets all criteria.
         *
         * @return the all criteria
         */
        public List<Criterion> getAllCriteria()
        {
            return criteria;
        }

        /**
         * Gets criteria.
         *
         * @return the criteria
         */
        public List<Criterion> getCriteria()
        {
            return criteria;
        }

        /**
         * Add criterion.
         *
         * @param condition the condition
         */
        protected void addCriterion(String condition)
        {
            if (condition == null)
            {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        /**
         * Add criterion.
         *
         * @param condition the condition
         * @param value     the value
         * @param property  the property
         */
        protected void addCriterion(String condition, Object value, String property)
        {
            if (value == null)
            {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        /**
         * Add criterion.
         *
         * @param condition the condition
         * @param value1    the value 1
         * @param value2    the value 2
         * @param property  the property
         */
        protected void addCriterion(String condition, Object value1, Object value2, String property)
        {
            if (value1 == null || value2 == null)
            {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        /**
         * And teacher no is null criteria.
         *
         * @return the criteria
         */
        public Criteria andTeacherNoIsNull()
        {
            addCriterion("teacher_no is null");
            return (Criteria) this;
        }

        /**
         * And teacher no is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andTeacherNoIsNotNull()
        {
            addCriterion("teacher_no is not null");
            return (Criteria) this;
        }

        /**
         * And teacher no equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andTeacherNoEqualTo(Long value)
        {
            addCriterion("teacher_no =", value, "teacherNo");
            return (Criteria) this;
        }

        /**
         * And teacher no not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andTeacherNoNotEqualTo(Long value)
        {
            addCriterion("teacher_no <>", value, "teacherNo");
            return (Criteria) this;
        }

        /**
         * And teacher no greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andTeacherNoGreaterThan(Long value)
        {
            addCriterion("teacher_no >", value, "teacherNo");
            return (Criteria) this;
        }

        /**
         * And teacher no greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andTeacherNoGreaterThanOrEqualTo(Long value)
        {
            addCriterion("teacher_no >=", value, "teacherNo");
            return (Criteria) this;
        }

        /**
         * And teacher no less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andTeacherNoLessThan(Long value)
        {
            addCriterion("teacher_no <", value, "teacherNo");
            return (Criteria) this;
        }

        /**
         * And teacher no less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andTeacherNoLessThanOrEqualTo(Long value)
        {
            addCriterion("teacher_no <=", value, "teacherNo");
            return (Criteria) this;
        }

        /**
         * And teacher no in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andTeacherNoIn(List<Long> values)
        {
            addCriterion("teacher_no in", values, "teacherNo");
            return (Criteria) this;
        }

        /**
         * And teacher no not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andTeacherNoNotIn(List<Long> values)
        {
            addCriterion("teacher_no not in", values, "teacherNo");
            return (Criteria) this;
        }

        /**
         * And teacher no between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andTeacherNoBetween(Long value1, Long value2)
        {
            addCriterion("teacher_no between", value1, value2, "teacherNo");
            return (Criteria) this;
        }

        /**
         * And teacher no not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andTeacherNoNotBetween(Long value1, Long value2)
        {
            addCriterion("teacher_no not between", value1, value2, "teacherNo");
            return (Criteria) this;
        }

        /**
         * And teacher name is null criteria.
         *
         * @return the criteria
         */
        public Criteria andTeacherNameIsNull()
        {
            addCriterion("teacher_name is null");
            return (Criteria) this;
        }

        /**
         * And teacher name is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andTeacherNameIsNotNull()
        {
            addCriterion("teacher_name is not null");
            return (Criteria) this;
        }

        /**
         * And teacher name equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andTeacherNameEqualTo(String value)
        {
            addCriterion("teacher_name =", value, "teacherName");
            return (Criteria) this;
        }

        /**
         * And teacher name not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andTeacherNameNotEqualTo(String value)
        {
            addCriterion("teacher_name <>", value, "teacherName");
            return (Criteria) this;
        }

        /**
         * And teacher name greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andTeacherNameGreaterThan(String value)
        {
            addCriterion("teacher_name >", value, "teacherName");
            return (Criteria) this;
        }

        /**
         * And teacher name greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andTeacherNameGreaterThanOrEqualTo(String value)
        {
            addCriterion("teacher_name >=", value, "teacherName");
            return (Criteria) this;
        }

        /**
         * And teacher name less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andTeacherNameLessThan(String value)
        {
            addCriterion("teacher_name <", value, "teacherName");
            return (Criteria) this;
        }

        /**
         * And teacher name less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andTeacherNameLessThanOrEqualTo(String value)
        {
            addCriterion("teacher_name <=", value, "teacherName");
            return (Criteria) this;
        }

        /**
         * And teacher name like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andTeacherNameLike(String value)
        {
            addCriterion("teacher_name like", value, "teacherName");
            return (Criteria) this;
        }

        /**
         * And teacher name not like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andTeacherNameNotLike(String value)
        {
            addCriterion("teacher_name not like", value, "teacherName");
            return (Criteria) this;
        }

        /**
         * And teacher name in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andTeacherNameIn(List<String> values)
        {
            addCriterion("teacher_name in", values, "teacherName");
            return (Criteria) this;
        }

        /**
         * And teacher name not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andTeacherNameNotIn(List<String> values)
        {
            addCriterion("teacher_name not in", values, "teacherName");
            return (Criteria) this;
        }

        /**
         * And teacher name between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andTeacherNameBetween(String value1, String value2)
        {
            addCriterion("teacher_name between", value1, value2, "teacherName");
            return (Criteria) this;
        }

        /**
         * And teacher name not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andTeacherNameNotBetween(String value1, String value2)
        {
            addCriterion("teacher_name not between", value1, value2, "teacherName");
            return (Criteria) this;
        }

        /**
         * And teacher sex is null criteria.
         *
         * @return the criteria
         */
        public Criteria andTeacherSexIsNull()
        {
            addCriterion("teacher_sex is null");
            return (Criteria) this;
        }

        /**
         * And teacher sex is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andTeacherSexIsNotNull()
        {
            addCriterion("teacher_sex is not null");
            return (Criteria) this;
        }

        /**
         * And teacher sex equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andTeacherSexEqualTo(String value)
        {
            addCriterion("teacher_sex =", value, "teacherSex");
            return (Criteria) this;
        }

        /**
         * And teacher sex not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andTeacherSexNotEqualTo(String value)
        {
            addCriterion("teacher_sex <>", value, "teacherSex");
            return (Criteria) this;
        }

        /**
         * And teacher sex greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andTeacherSexGreaterThan(String value)
        {
            addCriterion("teacher_sex >", value, "teacherSex");
            return (Criteria) this;
        }

        /**
         * And teacher sex greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andTeacherSexGreaterThanOrEqualTo(String value)
        {
            addCriterion("teacher_sex >=", value, "teacherSex");
            return (Criteria) this;
        }

        /**
         * And teacher sex less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andTeacherSexLessThan(String value)
        {
            addCriterion("teacher_sex <", value, "teacherSex");
            return (Criteria) this;
        }

        /**
         * And teacher sex less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andTeacherSexLessThanOrEqualTo(String value)
        {
            addCriterion("teacher_sex <=", value, "teacherSex");
            return (Criteria) this;
        }

        /**
         * And teacher sex like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andTeacherSexLike(String value)
        {
            addCriterion("teacher_sex like", value, "teacherSex");
            return (Criteria) this;
        }

        /**
         * And teacher sex not like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andTeacherSexNotLike(String value)
        {
            addCriterion("teacher_sex not like", value, "teacherSex");
            return (Criteria) this;
        }

        /**
         * And teacher sex in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andTeacherSexIn(List<String> values)
        {
            addCriterion("teacher_sex in", values, "teacherSex");
            return (Criteria) this;
        }

        /**
         * And teacher sex not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andTeacherSexNotIn(List<String> values)
        {
            addCriterion("teacher_sex not in", values, "teacherSex");
            return (Criteria) this;
        }

        /**
         * And teacher sex between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andTeacherSexBetween(String value1, String value2)
        {
            addCriterion("teacher_sex between", value1, value2, "teacherSex");
            return (Criteria) this;
        }

        /**
         * And teacher sex not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andTeacherSexNotBetween(String value1, String value2)
        {
            addCriterion("teacher_sex not between", value1, value2, "teacherSex");
            return (Criteria) this;
        }

        /**
         * And teacher telephone number is null criteria.
         *
         * @return the criteria
         */
        public Criteria andTeacherTelephoneNumberIsNull()
        {
            addCriterion("teacher_telephone_number is null");
            return (Criteria) this;
        }

        /**
         * And teacher telephone number is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andTeacherTelephoneNumberIsNotNull()
        {
            addCriterion("teacher_telephone_number is not null");
            return (Criteria) this;
        }

        /**
         * And teacher telephone number equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andTeacherTelephoneNumberEqualTo(String value)
        {
            addCriterion("teacher_telephone_number =", value, "teacherTelephoneNumber");
            return (Criteria) this;
        }

        /**
         * And teacher telephone number not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andTeacherTelephoneNumberNotEqualTo(String value)
        {
            addCriterion("teacher_telephone_number <>", value, "teacherTelephoneNumber");
            return (Criteria) this;
        }

        /**
         * And teacher telephone number greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andTeacherTelephoneNumberGreaterThan(String value)
        {
            addCriterion("teacher_telephone_number >", value, "teacherTelephoneNumber");
            return (Criteria) this;
        }

        /**
         * And teacher telephone number greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andTeacherTelephoneNumberGreaterThanOrEqualTo(String value)
        {
            addCriterion("teacher_telephone_number >=", value, "teacherTelephoneNumber");
            return (Criteria) this;
        }

        /**
         * And teacher telephone number less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andTeacherTelephoneNumberLessThan(String value)
        {
            addCriterion("teacher_telephone_number <", value, "teacherTelephoneNumber");
            return (Criteria) this;
        }

        /**
         * And teacher telephone number less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andTeacherTelephoneNumberLessThanOrEqualTo(String value)
        {
            addCriterion("teacher_telephone_number <=", value, "teacherTelephoneNumber");
            return (Criteria) this;
        }

        /**
         * And teacher telephone number like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andTeacherTelephoneNumberLike(String value)
        {
            addCriterion("teacher_telephone_number like", value, "teacherTelephoneNumber");
            return (Criteria) this;
        }

        /**
         * And teacher telephone number not like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andTeacherTelephoneNumberNotLike(String value)
        {
            addCriterion("teacher_telephone_number not like", value, "teacherTelephoneNumber");
            return (Criteria) this;
        }

        /**
         * And teacher telephone number in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andTeacherTelephoneNumberIn(List<String> values)
        {
            addCriterion("teacher_telephone_number in", values, "teacherTelephoneNumber");
            return (Criteria) this;
        }

        /**
         * And teacher telephone number not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andTeacherTelephoneNumberNotIn(List<String> values)
        {
            addCriterion("teacher_telephone_number not in", values, "teacherTelephoneNumber");
            return (Criteria) this;
        }

        /**
         * And teacher telephone number between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andTeacherTelephoneNumberBetween(String value1, String value2)
        {
            addCriterion("teacher_telephone_number between", value1, value2, "teacherTelephoneNumber");
            return (Criteria) this;
        }

        /**
         * And teacher telephone number not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andTeacherTelephoneNumberNotBetween(String value1, String value2)
        {
            addCriterion("teacher_telephone_number not between", value1, value2, "teacherTelephoneNumber");
            return (Criteria) this;
        }

        /**
         * And teacher email is null criteria.
         *
         * @return the criteria
         */
        public Criteria andTeacherEmailIsNull()
        {
            addCriterion("teacher_email is null");
            return (Criteria) this;
        }

        /**
         * And teacher email is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andTeacherEmailIsNotNull()
        {
            addCriterion("teacher_email is not null");
            return (Criteria) this;
        }

        /**
         * And teacher email equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andTeacherEmailEqualTo(String value)
        {
            addCriterion("teacher_email =", value, "teacherEmail");
            return (Criteria) this;
        }

        /**
         * And teacher email not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andTeacherEmailNotEqualTo(String value)
        {
            addCriterion("teacher_email <>", value, "teacherEmail");
            return (Criteria) this;
        }

        /**
         * And teacher email greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andTeacherEmailGreaterThan(String value)
        {
            addCriterion("teacher_email >", value, "teacherEmail");
            return (Criteria) this;
        }

        /**
         * And teacher email greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andTeacherEmailGreaterThanOrEqualTo(String value)
        {
            addCriterion("teacher_email >=", value, "teacherEmail");
            return (Criteria) this;
        }

        /**
         * And teacher email less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andTeacherEmailLessThan(String value)
        {
            addCriterion("teacher_email <", value, "teacherEmail");
            return (Criteria) this;
        }

        /**
         * And teacher email less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andTeacherEmailLessThanOrEqualTo(String value)
        {
            addCriterion("teacher_email <=", value, "teacherEmail");
            return (Criteria) this;
        }

        /**
         * And teacher email like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andTeacherEmailLike(String value)
        {
            addCriterion("teacher_email like", value, "teacherEmail");
            return (Criteria) this;
        }

        /**
         * And teacher email not like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andTeacherEmailNotLike(String value)
        {
            addCriterion("teacher_email not like", value, "teacherEmail");
            return (Criteria) this;
        }

        /**
         * And teacher email in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andTeacherEmailIn(List<String> values)
        {
            addCriterion("teacher_email in", values, "teacherEmail");
            return (Criteria) this;
        }

        /**
         * And teacher email not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andTeacherEmailNotIn(List<String> values)
        {
            addCriterion("teacher_email not in", values, "teacherEmail");
            return (Criteria) this;
        }

        /**
         * And teacher email between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andTeacherEmailBetween(String value1, String value2)
        {
            addCriterion("teacher_email between", value1, value2, "teacherEmail");
            return (Criteria) this;
        }

        /**
         * And teacher email not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andTeacherEmailNotBetween(String value1, String value2)
        {
            addCriterion("teacher_email not between", value1, value2, "teacherEmail");
            return (Criteria) this;
        }

        /**
         * And teacher address is null criteria.
         *
         * @return the criteria
         */
        public Criteria andTeacherAddressIsNull()
        {
            addCriterion("teacher_address is null");
            return (Criteria) this;
        }

        /**
         * And teacher address is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andTeacherAddressIsNotNull()
        {
            addCriterion("teacher_address is not null");
            return (Criteria) this;
        }

        /**
         * And teacher address equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andTeacherAddressEqualTo(String value)
        {
            addCriterion("teacher_address =", value, "teacherAddress");
            return (Criteria) this;
        }

        /**
         * And teacher address not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andTeacherAddressNotEqualTo(String value)
        {
            addCriterion("teacher_address <>", value, "teacherAddress");
            return (Criteria) this;
        }

        /**
         * And teacher address greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andTeacherAddressGreaterThan(String value)
        {
            addCriterion("teacher_address >", value, "teacherAddress");
            return (Criteria) this;
        }

        /**
         * And teacher address greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andTeacherAddressGreaterThanOrEqualTo(String value)
        {
            addCriterion("teacher_address >=", value, "teacherAddress");
            return (Criteria) this;
        }

        /**
         * And teacher address less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andTeacherAddressLessThan(String value)
        {
            addCriterion("teacher_address <", value, "teacherAddress");
            return (Criteria) this;
        }

        /**
         * And teacher address less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andTeacherAddressLessThanOrEqualTo(String value)
        {
            addCriterion("teacher_address <=", value, "teacherAddress");
            return (Criteria) this;
        }

        /**
         * And teacher address like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andTeacherAddressLike(String value)
        {
            addCriterion("teacher_address like", value, "teacherAddress");
            return (Criteria) this;
        }

        /**
         * And teacher address not like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andTeacherAddressNotLike(String value)
        {
            addCriterion("teacher_address not like", value, "teacherAddress");
            return (Criteria) this;
        }

        /**
         * And teacher address in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andTeacherAddressIn(List<String> values)
        {
            addCriterion("teacher_address in", values, "teacherAddress");
            return (Criteria) this;
        }

        /**
         * And teacher address not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andTeacherAddressNotIn(List<String> values)
        {
            addCriterion("teacher_address not in", values, "teacherAddress");
            return (Criteria) this;
        }

        /**
         * And teacher address between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andTeacherAddressBetween(String value1, String value2)
        {
            addCriterion("teacher_address between", value1, value2, "teacherAddress");
            return (Criteria) this;
        }

        /**
         * And teacher address not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andTeacherAddressNotBetween(String value1, String value2)
        {
            addCriterion("teacher_address not between", value1, value2, "teacherAddress");
            return (Criteria) this;
        }

        /**
         * And teacher idcard is null criteria.
         *
         * @return the criteria
         */
        public Criteria andTeacherIdcardIsNull()
        {
            addCriterion("teacher_idcard is null");
            return (Criteria) this;
        }

        /**
         * And teacher idcard is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andTeacherIdcardIsNotNull()
        {
            addCriterion("teacher_idcard is not null");
            return (Criteria) this;
        }

        /**
         * And teacher idcard equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andTeacherIdcardEqualTo(String value)
        {
            addCriterion("teacher_idcard =", value, "teacherIdcard");
            return (Criteria) this;
        }

        /**
         * And teacher idcard not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andTeacherIdcardNotEqualTo(String value)
        {
            addCriterion("teacher_idcard <>", value, "teacherIdcard");
            return (Criteria) this;
        }

        /**
         * And teacher idcard greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andTeacherIdcardGreaterThan(String value)
        {
            addCriterion("teacher_idcard >", value, "teacherIdcard");
            return (Criteria) this;
        }

        /**
         * And teacher idcard greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andTeacherIdcardGreaterThanOrEqualTo(String value)
        {
            addCriterion("teacher_idcard >=", value, "teacherIdcard");
            return (Criteria) this;
        }

        /**
         * And teacher idcard less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andTeacherIdcardLessThan(String value)
        {
            addCriterion("teacher_idcard <", value, "teacherIdcard");
            return (Criteria) this;
        }

        /**
         * And teacher idcard less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andTeacherIdcardLessThanOrEqualTo(String value)
        {
            addCriterion("teacher_idcard <=", value, "teacherIdcard");
            return (Criteria) this;
        }

        /**
         * And teacher idcard like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andTeacherIdcardLike(String value)
        {
            addCriterion("teacher_idcard like", value, "teacherIdcard");
            return (Criteria) this;
        }

        /**
         * And teacher idcard not like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andTeacherIdcardNotLike(String value)
        {
            addCriterion("teacher_idcard not like", value, "teacherIdcard");
            return (Criteria) this;
        }

        /**
         * And teacher idcard in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andTeacherIdcardIn(List<String> values)
        {
            addCriterion("teacher_idcard in", values, "teacherIdcard");
            return (Criteria) this;
        }

        /**
         * And teacher idcard not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andTeacherIdcardNotIn(List<String> values)
        {
            addCriterion("teacher_idcard not in", values, "teacherIdcard");
            return (Criteria) this;
        }

        /**
         * And teacher idcard between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andTeacherIdcardBetween(String value1, String value2)
        {
            addCriterion("teacher_idcard between", value1, value2, "teacherIdcard");
            return (Criteria) this;
        }

        /**
         * And teacher idcard not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andTeacherIdcardNotBetween(String value1, String value2)
        {
            addCriterion("teacher_idcard not between", value1, value2, "teacherIdcard");
            return (Criteria) this;
        }
    }

    /**
     * The type Criteria.
     */
    public static class Criteria extends GeneratedCriteria
    {
        /**
         * Instantiates a new Criteria.
         */
        protected Criteria()
        {
            super();
        }
    }

    /**
     * The type Criterion.
     */
    public static class Criterion
    {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        /**
         * Gets condition.
         *
         * @return the condition
         */
        public String getCondition()
        {
            return condition;
        }

        /**
         * Gets value.
         *
         * @return the value
         */
        public Object getValue()
        {
            return value;
        }

        /**
         * Gets second value.
         *
         * @return the second value
         */
        public Object getSecondValue()
        {
            return secondValue;
        }

        /**
         * Is no value boolean.
         *
         * @return the boolean
         */
        public boolean isNoValue()
        {
            return noValue;
        }

        /**
         * Is single value boolean.
         *
         * @return the boolean
         */
        public boolean isSingleValue()
        {
            return singleValue;
        }

        /**
         * Is between value boolean.
         *
         * @return the boolean
         */
        public boolean isBetweenValue()
        {
            return betweenValue;
        }

        /**
         * Is list value boolean.
         *
         * @return the boolean
         */
        public boolean isListValue()
        {
            return listValue;
        }

        /**
         * Gets type handler.
         *
         * @return the type handler
         */
        public String getTypeHandler()
        {
            return typeHandler;
        }

        /**
         * Instantiates a new Criterion.
         *
         * @param condition the condition
         */
        protected Criterion(String condition)
        {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        /**
         * Instantiates a new Criterion.
         *
         * @param condition   the condition
         * @param value       the value
         * @param typeHandler the type handler
         */
        protected Criterion(String condition, Object value, String typeHandler)
        {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>)
            {
                this.listValue = true;
            }
            else
            {
                this.singleValue = true;
            }
        }

        /**
         * Instantiates a new Criterion.
         *
         * @param condition the condition
         * @param value     the value
         */
        protected Criterion(String condition, Object value)
        {
            this(condition, value, null);
        }

        /**
         * Instantiates a new Criterion.
         *
         * @param condition   the condition
         * @param value       the value
         * @param secondValue the second value
         * @param typeHandler the type handler
         */
        protected Criterion(String condition, Object value, Object secondValue, String typeHandler)
        {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        /**
         * Instantiates a new Criterion.
         *
         * @param condition   the condition
         * @param value       the value
         * @param secondValue the second value
         */
        protected Criterion(String condition, Object value, Object secondValue)
        {
            this(condition, value, secondValue, null);
        }
    }
}