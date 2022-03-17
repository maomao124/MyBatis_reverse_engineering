package data;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Administrators example.
 */
public class AdministratorsExample
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
     * Instantiates a new Administrators example.
     */
    public AdministratorsExample()
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
         * And administrator no is null criteria.
         *
         * @return the criteria
         */
        public Criteria andAdministratorNoIsNull()
        {
            addCriterion("administrator_no is null");
            return (Criteria) this;
        }

        /**
         * And administrator no is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andAdministratorNoIsNotNull()
        {
            addCriterion("administrator_no is not null");
            return (Criteria) this;
        }

        /**
         * And administrator no equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andAdministratorNoEqualTo(Long value)
        {
            addCriterion("administrator_no =", value, "administratorNo");
            return (Criteria) this;
        }

        /**
         * And administrator no not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andAdministratorNoNotEqualTo(Long value)
        {
            addCriterion("administrator_no <>", value, "administratorNo");
            return (Criteria) this;
        }

        /**
         * And administrator no greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andAdministratorNoGreaterThan(Long value)
        {
            addCriterion("administrator_no >", value, "administratorNo");
            return (Criteria) this;
        }

        /**
         * And administrator no greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andAdministratorNoGreaterThanOrEqualTo(Long value)
        {
            addCriterion("administrator_no >=", value, "administratorNo");
            return (Criteria) this;
        }

        /**
         * And administrator no less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andAdministratorNoLessThan(Long value)
        {
            addCriterion("administrator_no <", value, "administratorNo");
            return (Criteria) this;
        }

        /**
         * And administrator no less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andAdministratorNoLessThanOrEqualTo(Long value)
        {
            addCriterion("administrator_no <=", value, "administratorNo");
            return (Criteria) this;
        }

        /**
         * And administrator no in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andAdministratorNoIn(List<Long> values)
        {
            addCriterion("administrator_no in", values, "administratorNo");
            return (Criteria) this;
        }

        /**
         * And administrator no not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andAdministratorNoNotIn(List<Long> values)
        {
            addCriterion("administrator_no not in", values, "administratorNo");
            return (Criteria) this;
        }

        /**
         * And administrator no between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andAdministratorNoBetween(Long value1, Long value2)
        {
            addCriterion("administrator_no between", value1, value2, "administratorNo");
            return (Criteria) this;
        }

        /**
         * And administrator no not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andAdministratorNoNotBetween(Long value1, Long value2)
        {
            addCriterion("administrator_no not between", value1, value2, "administratorNo");
            return (Criteria) this;
        }

        /**
         * And administrator name is null criteria.
         *
         * @return the criteria
         */
        public Criteria andAdministratorNameIsNull()
        {
            addCriterion("administrator_name is null");
            return (Criteria) this;
        }

        /**
         * And administrator name is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andAdministratorNameIsNotNull()
        {
            addCriterion("administrator_name is not null");
            return (Criteria) this;
        }

        /**
         * And administrator name equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andAdministratorNameEqualTo(String value)
        {
            addCriterion("administrator_name =", value, "administratorName");
            return (Criteria) this;
        }

        /**
         * And administrator name not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andAdministratorNameNotEqualTo(String value)
        {
            addCriterion("administrator_name <>", value, "administratorName");
            return (Criteria) this;
        }

        /**
         * And administrator name greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andAdministratorNameGreaterThan(String value)
        {
            addCriterion("administrator_name >", value, "administratorName");
            return (Criteria) this;
        }

        /**
         * And administrator name greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andAdministratorNameGreaterThanOrEqualTo(String value)
        {
            addCriterion("administrator_name >=", value, "administratorName");
            return (Criteria) this;
        }

        /**
         * And administrator name less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andAdministratorNameLessThan(String value)
        {
            addCriterion("administrator_name <", value, "administratorName");
            return (Criteria) this;
        }

        /**
         * And administrator name less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andAdministratorNameLessThanOrEqualTo(String value)
        {
            addCriterion("administrator_name <=", value, "administratorName");
            return (Criteria) this;
        }

        /**
         * And administrator name like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andAdministratorNameLike(String value)
        {
            addCriterion("administrator_name like", value, "administratorName");
            return (Criteria) this;
        }

        /**
         * And administrator name not like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andAdministratorNameNotLike(String value)
        {
            addCriterion("administrator_name not like", value, "administratorName");
            return (Criteria) this;
        }

        /**
         * And administrator name in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andAdministratorNameIn(List<String> values)
        {
            addCriterion("administrator_name in", values, "administratorName");
            return (Criteria) this;
        }

        /**
         * And administrator name not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andAdministratorNameNotIn(List<String> values)
        {
            addCriterion("administrator_name not in", values, "administratorName");
            return (Criteria) this;
        }

        /**
         * And administrator name between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andAdministratorNameBetween(String value1, String value2)
        {
            addCriterion("administrator_name between", value1, value2, "administratorName");
            return (Criteria) this;
        }

        /**
         * And administrator name not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andAdministratorNameNotBetween(String value1, String value2)
        {
            addCriterion("administrator_name not between", value1, value2, "administratorName");
            return (Criteria) this;
        }

        /**
         * And administrator sex is null criteria.
         *
         * @return the criteria
         */
        public Criteria andAdministratorSexIsNull()
        {
            addCriterion("administrator_sex is null");
            return (Criteria) this;
        }

        /**
         * And administrator sex is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andAdministratorSexIsNotNull()
        {
            addCriterion("administrator_sex is not null");
            return (Criteria) this;
        }

        /**
         * And administrator sex equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andAdministratorSexEqualTo(String value)
        {
            addCriterion("administrator_sex =", value, "administratorSex");
            return (Criteria) this;
        }

        /**
         * And administrator sex not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andAdministratorSexNotEqualTo(String value)
        {
            addCriterion("administrator_sex <>", value, "administratorSex");
            return (Criteria) this;
        }

        /**
         * And administrator sex greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andAdministratorSexGreaterThan(String value)
        {
            addCriterion("administrator_sex >", value, "administratorSex");
            return (Criteria) this;
        }

        /**
         * And administrator sex greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andAdministratorSexGreaterThanOrEqualTo(String value)
        {
            addCriterion("administrator_sex >=", value, "administratorSex");
            return (Criteria) this;
        }

        /**
         * And administrator sex less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andAdministratorSexLessThan(String value)
        {
            addCriterion("administrator_sex <", value, "administratorSex");
            return (Criteria) this;
        }

        /**
         * And administrator sex less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andAdministratorSexLessThanOrEqualTo(String value)
        {
            addCriterion("administrator_sex <=", value, "administratorSex");
            return (Criteria) this;
        }

        /**
         * And administrator sex like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andAdministratorSexLike(String value)
        {
            addCriterion("administrator_sex like", value, "administratorSex");
            return (Criteria) this;
        }

        /**
         * And administrator sex not like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andAdministratorSexNotLike(String value)
        {
            addCriterion("administrator_sex not like", value, "administratorSex");
            return (Criteria) this;
        }

        /**
         * And administrator sex in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andAdministratorSexIn(List<String> values)
        {
            addCriterion("administrator_sex in", values, "administratorSex");
            return (Criteria) this;
        }

        /**
         * And administrator sex not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andAdministratorSexNotIn(List<String> values)
        {
            addCriterion("administrator_sex not in", values, "administratorSex");
            return (Criteria) this;
        }

        /**
         * And administrator sex between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andAdministratorSexBetween(String value1, String value2)
        {
            addCriterion("administrator_sex between", value1, value2, "administratorSex");
            return (Criteria) this;
        }

        /**
         * And administrator sex not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andAdministratorSexNotBetween(String value1, String value2)
        {
            addCriterion("administrator_sex not between", value1, value2, "administratorSex");
            return (Criteria) this;
        }

        /**
         * And administrator telephone number is null criteria.
         *
         * @return the criteria
         */
        public Criteria andAdministratorTelephoneNumberIsNull()
        {
            addCriterion("administrator_telephone_number is null");
            return (Criteria) this;
        }

        /**
         * And administrator telephone number is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andAdministratorTelephoneNumberIsNotNull()
        {
            addCriterion("administrator_telephone_number is not null");
            return (Criteria) this;
        }

        /**
         * And administrator telephone number equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andAdministratorTelephoneNumberEqualTo(String value)
        {
            addCriterion("administrator_telephone_number =", value, "administratorTelephoneNumber");
            return (Criteria) this;
        }

        /**
         * And administrator telephone number not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andAdministratorTelephoneNumberNotEqualTo(String value)
        {
            addCriterion("administrator_telephone_number <>", value, "administratorTelephoneNumber");
            return (Criteria) this;
        }

        /**
         * And administrator telephone number greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andAdministratorTelephoneNumberGreaterThan(String value)
        {
            addCriterion("administrator_telephone_number >", value, "administratorTelephoneNumber");
            return (Criteria) this;
        }

        /**
         * And administrator telephone number greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andAdministratorTelephoneNumberGreaterThanOrEqualTo(String value)
        {
            addCriterion("administrator_telephone_number >=", value, "administratorTelephoneNumber");
            return (Criteria) this;
        }

        /**
         * And administrator telephone number less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andAdministratorTelephoneNumberLessThan(String value)
        {
            addCriterion("administrator_telephone_number <", value, "administratorTelephoneNumber");
            return (Criteria) this;
        }

        /**
         * And administrator telephone number less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andAdministratorTelephoneNumberLessThanOrEqualTo(String value)
        {
            addCriterion("administrator_telephone_number <=", value, "administratorTelephoneNumber");
            return (Criteria) this;
        }

        /**
         * And administrator telephone number like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andAdministratorTelephoneNumberLike(String value)
        {
            addCriterion("administrator_telephone_number like", value, "administratorTelephoneNumber");
            return (Criteria) this;
        }

        /**
         * And administrator telephone number not like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andAdministratorTelephoneNumberNotLike(String value)
        {
            addCriterion("administrator_telephone_number not like", value, "administratorTelephoneNumber");
            return (Criteria) this;
        }

        /**
         * And administrator telephone number in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andAdministratorTelephoneNumberIn(List<String> values)
        {
            addCriterion("administrator_telephone_number in", values, "administratorTelephoneNumber");
            return (Criteria) this;
        }

        /**
         * And administrator telephone number not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andAdministratorTelephoneNumberNotIn(List<String> values)
        {
            addCriterion("administrator_telephone_number not in", values, "administratorTelephoneNumber");
            return (Criteria) this;
        }

        /**
         * And administrator telephone number between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andAdministratorTelephoneNumberBetween(String value1, String value2)
        {
            addCriterion("administrator_telephone_number between", value1, value2, "administratorTelephoneNumber");
            return (Criteria) this;
        }

        /**
         * And administrator telephone number not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andAdministratorTelephoneNumberNotBetween(String value1, String value2)
        {
            addCriterion("administrator_telephone_number not between", value1, value2, "administratorTelephoneNumber");
            return (Criteria) this;
        }

        /**
         * And administrator job is null criteria.
         *
         * @return the criteria
         */
        public Criteria andAdministratorJobIsNull()
        {
            addCriterion("administrator_job is null");
            return (Criteria) this;
        }

        /**
         * And administrator job is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andAdministratorJobIsNotNull()
        {
            addCriterion("administrator_job is not null");
            return (Criteria) this;
        }

        /**
         * And administrator job equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andAdministratorJobEqualTo(String value)
        {
            addCriterion("administrator_job =", value, "administratorJob");
            return (Criteria) this;
        }

        /**
         * And administrator job not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andAdministratorJobNotEqualTo(String value)
        {
            addCriterion("administrator_job <>", value, "administratorJob");
            return (Criteria) this;
        }

        /**
         * And administrator job greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andAdministratorJobGreaterThan(String value)
        {
            addCriterion("administrator_job >", value, "administratorJob");
            return (Criteria) this;
        }

        /**
         * And administrator job greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andAdministratorJobGreaterThanOrEqualTo(String value)
        {
            addCriterion("administrator_job >=", value, "administratorJob");
            return (Criteria) this;
        }

        /**
         * And administrator job less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andAdministratorJobLessThan(String value)
        {
            addCriterion("administrator_job <", value, "administratorJob");
            return (Criteria) this;
        }

        /**
         * And administrator job less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andAdministratorJobLessThanOrEqualTo(String value)
        {
            addCriterion("administrator_job <=", value, "administratorJob");
            return (Criteria) this;
        }

        /**
         * And administrator job like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andAdministratorJobLike(String value)
        {
            addCriterion("administrator_job like", value, "administratorJob");
            return (Criteria) this;
        }

        /**
         * And administrator job not like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andAdministratorJobNotLike(String value)
        {
            addCriterion("administrator_job not like", value, "administratorJob");
            return (Criteria) this;
        }

        /**
         * And administrator job in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andAdministratorJobIn(List<String> values)
        {
            addCriterion("administrator_job in", values, "administratorJob");
            return (Criteria) this;
        }

        /**
         * And administrator job not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andAdministratorJobNotIn(List<String> values)
        {
            addCriterion("administrator_job not in", values, "administratorJob");
            return (Criteria) this;
        }

        /**
         * And administrator job between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andAdministratorJobBetween(String value1, String value2)
        {
            addCriterion("administrator_job between", value1, value2, "administratorJob");
            return (Criteria) this;
        }

        /**
         * And administrator job not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andAdministratorJobNotBetween(String value1, String value2)
        {
            addCriterion("administrator_job not between", value1, value2, "administratorJob");
            return (Criteria) this;
        }

        /**
         * And administrator idcard is null criteria.
         *
         * @return the criteria
         */
        public Criteria andAdministratorIdcardIsNull()
        {
            addCriterion("administrator_idcard is null");
            return (Criteria) this;
        }

        /**
         * And administrator idcard is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andAdministratorIdcardIsNotNull()
        {
            addCriterion("administrator_idcard is not null");
            return (Criteria) this;
        }

        /**
         * And administrator idcard equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andAdministratorIdcardEqualTo(String value)
        {
            addCriterion("administrator_idcard =", value, "administratorIdcard");
            return (Criteria) this;
        }

        /**
         * And administrator idcard not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andAdministratorIdcardNotEqualTo(String value)
        {
            addCriterion("administrator_idcard <>", value, "administratorIdcard");
            return (Criteria) this;
        }

        /**
         * And administrator idcard greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andAdministratorIdcardGreaterThan(String value)
        {
            addCriterion("administrator_idcard >", value, "administratorIdcard");
            return (Criteria) this;
        }

        /**
         * And administrator idcard greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andAdministratorIdcardGreaterThanOrEqualTo(String value)
        {
            addCriterion("administrator_idcard >=", value, "administratorIdcard");
            return (Criteria) this;
        }

        /**
         * And administrator idcard less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andAdministratorIdcardLessThan(String value)
        {
            addCriterion("administrator_idcard <", value, "administratorIdcard");
            return (Criteria) this;
        }

        /**
         * And administrator idcard less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andAdministratorIdcardLessThanOrEqualTo(String value)
        {
            addCriterion("administrator_idcard <=", value, "administratorIdcard");
            return (Criteria) this;
        }

        /**
         * And administrator idcard like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andAdministratorIdcardLike(String value)
        {
            addCriterion("administrator_idcard like", value, "administratorIdcard");
            return (Criteria) this;
        }

        /**
         * And administrator idcard not like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andAdministratorIdcardNotLike(String value)
        {
            addCriterion("administrator_idcard not like", value, "administratorIdcard");
            return (Criteria) this;
        }

        /**
         * And administrator idcard in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andAdministratorIdcardIn(List<String> values)
        {
            addCriterion("administrator_idcard in", values, "administratorIdcard");
            return (Criteria) this;
        }

        /**
         * And administrator idcard not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andAdministratorIdcardNotIn(List<String> values)
        {
            addCriterion("administrator_idcard not in", values, "administratorIdcard");
            return (Criteria) this;
        }

        /**
         * And administrator idcard between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andAdministratorIdcardBetween(String value1, String value2)
        {
            addCriterion("administrator_idcard between", value1, value2, "administratorIdcard");
            return (Criteria) this;
        }

        /**
         * And administrator idcard not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andAdministratorIdcardNotBetween(String value1, String value2)
        {
            addCriterion("administrator_idcard not between", value1, value2, "administratorIdcard");
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