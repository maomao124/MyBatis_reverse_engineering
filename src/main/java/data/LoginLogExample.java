package data;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Login log example.
 */
public class LoginLogExample
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
     * Instantiates a new Login log example.
     */
    public LoginLogExample()
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
         * And log no is null criteria.
         *
         * @return the criteria
         */
        public Criteria andLogNoIsNull()
        {
            addCriterion("log_no is null");
            return (Criteria) this;
        }

        /**
         * And log no is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andLogNoIsNotNull()
        {
            addCriterion("log_no is not null");
            return (Criteria) this;
        }

        /**
         * And log no equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLogNoEqualTo(Long value)
        {
            addCriterion("log_no =", value, "logNo");
            return (Criteria) this;
        }

        /**
         * And log no not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLogNoNotEqualTo(Long value)
        {
            addCriterion("log_no <>", value, "logNo");
            return (Criteria) this;
        }

        /**
         * And log no greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLogNoGreaterThan(Long value)
        {
            addCriterion("log_no >", value, "logNo");
            return (Criteria) this;
        }

        /**
         * And log no greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLogNoGreaterThanOrEqualTo(Long value)
        {
            addCriterion("log_no >=", value, "logNo");
            return (Criteria) this;
        }

        /**
         * And log no less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLogNoLessThan(Long value)
        {
            addCriterion("log_no <", value, "logNo");
            return (Criteria) this;
        }

        /**
         * And log no less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLogNoLessThanOrEqualTo(Long value)
        {
            addCriterion("log_no <=", value, "logNo");
            return (Criteria) this;
        }

        /**
         * And log no in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andLogNoIn(List<Long> values)
        {
            addCriterion("log_no in", values, "logNo");
            return (Criteria) this;
        }

        /**
         * And log no not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andLogNoNotIn(List<Long> values)
        {
            addCriterion("log_no not in", values, "logNo");
            return (Criteria) this;
        }

        /**
         * And log no between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andLogNoBetween(Long value1, Long value2)
        {
            addCriterion("log_no between", value1, value2, "logNo");
            return (Criteria) this;
        }

        /**
         * And log no not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andLogNoNotBetween(Long value1, Long value2)
        {
            addCriterion("log_no not between", value1, value2, "logNo");
            return (Criteria) this;
        }

        /**
         * And log time is null criteria.
         *
         * @return the criteria
         */
        public Criteria andLogTimeIsNull()
        {
            addCriterion("log_time is null");
            return (Criteria) this;
        }

        /**
         * And log time is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andLogTimeIsNotNull()
        {
            addCriterion("log_time is not null");
            return (Criteria) this;
        }

        /**
         * And log time equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLogTimeEqualTo(String value)
        {
            addCriterion("log_time =", value, "logTime");
            return (Criteria) this;
        }

        /**
         * And log time not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLogTimeNotEqualTo(String value)
        {
            addCriterion("log_time <>", value, "logTime");
            return (Criteria) this;
        }

        /**
         * And log time greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLogTimeGreaterThan(String value)
        {
            addCriterion("log_time >", value, "logTime");
            return (Criteria) this;
        }

        /**
         * And log time greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLogTimeGreaterThanOrEqualTo(String value)
        {
            addCriterion("log_time >=", value, "logTime");
            return (Criteria) this;
        }

        /**
         * And log time less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLogTimeLessThan(String value)
        {
            addCriterion("log_time <", value, "logTime");
            return (Criteria) this;
        }

        /**
         * And log time less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLogTimeLessThanOrEqualTo(String value)
        {
            addCriterion("log_time <=", value, "logTime");
            return (Criteria) this;
        }

        /**
         * And log time like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLogTimeLike(String value)
        {
            addCriterion("log_time like", value, "logTime");
            return (Criteria) this;
        }

        /**
         * And log time not like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLogTimeNotLike(String value)
        {
            addCriterion("log_time not like", value, "logTime");
            return (Criteria) this;
        }

        /**
         * And log time in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andLogTimeIn(List<String> values)
        {
            addCriterion("log_time in", values, "logTime");
            return (Criteria) this;
        }

        /**
         * And log time not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andLogTimeNotIn(List<String> values)
        {
            addCriterion("log_time not in", values, "logTime");
            return (Criteria) this;
        }

        /**
         * And log time between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andLogTimeBetween(String value1, String value2)
        {
            addCriterion("log_time between", value1, value2, "logTime");
            return (Criteria) this;
        }

        /**
         * And log time not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andLogTimeNotBetween(String value1, String value2)
        {
            addCriterion("log_time not between", value1, value2, "logTime");
            return (Criteria) this;
        }

        /**
         * And log login no is null criteria.
         *
         * @return the criteria
         */
        public Criteria andLogLoginNoIsNull()
        {
            addCriterion("log_login_no is null");
            return (Criteria) this;
        }

        /**
         * And log login no is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andLogLoginNoIsNotNull()
        {
            addCriterion("log_login_no is not null");
            return (Criteria) this;
        }

        /**
         * And log login no equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLogLoginNoEqualTo(Long value)
        {
            addCriterion("log_login_no =", value, "logLoginNo");
            return (Criteria) this;
        }

        /**
         * And log login no not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLogLoginNoNotEqualTo(Long value)
        {
            addCriterion("log_login_no <>", value, "logLoginNo");
            return (Criteria) this;
        }

        /**
         * And log login no greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLogLoginNoGreaterThan(Long value)
        {
            addCriterion("log_login_no >", value, "logLoginNo");
            return (Criteria) this;
        }

        /**
         * And log login no greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLogLoginNoGreaterThanOrEqualTo(Long value)
        {
            addCriterion("log_login_no >=", value, "logLoginNo");
            return (Criteria) this;
        }

        /**
         * And log login no less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLogLoginNoLessThan(Long value)
        {
            addCriterion("log_login_no <", value, "logLoginNo");
            return (Criteria) this;
        }

        /**
         * And log login no less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLogLoginNoLessThanOrEqualTo(Long value)
        {
            addCriterion("log_login_no <=", value, "logLoginNo");
            return (Criteria) this;
        }

        /**
         * And log login no in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andLogLoginNoIn(List<Long> values)
        {
            addCriterion("log_login_no in", values, "logLoginNo");
            return (Criteria) this;
        }

        /**
         * And log login no not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andLogLoginNoNotIn(List<Long> values)
        {
            addCriterion("log_login_no not in", values, "logLoginNo");
            return (Criteria) this;
        }

        /**
         * And log login no between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andLogLoginNoBetween(Long value1, Long value2)
        {
            addCriterion("log_login_no between", value1, value2, "logLoginNo");
            return (Criteria) this;
        }

        /**
         * And log login no not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andLogLoginNoNotBetween(Long value1, Long value2)
        {
            addCriterion("log_login_no not between", value1, value2, "logLoginNo");
            return (Criteria) this;
        }

        /**
         * And log name is null criteria.
         *
         * @return the criteria
         */
        public Criteria andLogNameIsNull()
        {
            addCriterion("log_name is null");
            return (Criteria) this;
        }

        /**
         * And log name is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andLogNameIsNotNull()
        {
            addCriterion("log_name is not null");
            return (Criteria) this;
        }

        /**
         * And log name equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLogNameEqualTo(String value)
        {
            addCriterion("log_name =", value, "logName");
            return (Criteria) this;
        }

        /**
         * And log name not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLogNameNotEqualTo(String value)
        {
            addCriterion("log_name <>", value, "logName");
            return (Criteria) this;
        }

        /**
         * And log name greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLogNameGreaterThan(String value)
        {
            addCriterion("log_name >", value, "logName");
            return (Criteria) this;
        }

        /**
         * And log name greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLogNameGreaterThanOrEqualTo(String value)
        {
            addCriterion("log_name >=", value, "logName");
            return (Criteria) this;
        }

        /**
         * And log name less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLogNameLessThan(String value)
        {
            addCriterion("log_name <", value, "logName");
            return (Criteria) this;
        }

        /**
         * And log name less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLogNameLessThanOrEqualTo(String value)
        {
            addCriterion("log_name <=", value, "logName");
            return (Criteria) this;
        }

        /**
         * And log name like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLogNameLike(String value)
        {
            addCriterion("log_name like", value, "logName");
            return (Criteria) this;
        }

        /**
         * And log name not like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLogNameNotLike(String value)
        {
            addCriterion("log_name not like", value, "logName");
            return (Criteria) this;
        }

        /**
         * And log name in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andLogNameIn(List<String> values)
        {
            addCriterion("log_name in", values, "logName");
            return (Criteria) this;
        }

        /**
         * And log name not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andLogNameNotIn(List<String> values)
        {
            addCriterion("log_name not in", values, "logName");
            return (Criteria) this;
        }

        /**
         * And log name between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andLogNameBetween(String value1, String value2)
        {
            addCriterion("log_name between", value1, value2, "logName");
            return (Criteria) this;
        }

        /**
         * And log name not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andLogNameNotBetween(String value1, String value2)
        {
            addCriterion("log_name not between", value1, value2, "logName");
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