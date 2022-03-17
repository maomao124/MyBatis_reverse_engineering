package data;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Student password example.
 */
public class StudentPasswordExample
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
     * Instantiates a new Student password example.
     */
    public StudentPasswordExample()
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
         * And no is null criteria.
         *
         * @return the criteria
         */
        public Criteria andNoIsNull()
        {
            addCriterion("no is null");
            return (Criteria) this;
        }

        /**
         * And no is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andNoIsNotNull()
        {
            addCriterion("no is not null");
            return (Criteria) this;
        }

        /**
         * And no equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andNoEqualTo(Long value)
        {
            addCriterion("no =", value, "no");
            return (Criteria) this;
        }

        /**
         * And no not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andNoNotEqualTo(Long value)
        {
            addCriterion("no <>", value, "no");
            return (Criteria) this;
        }

        /**
         * And no greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andNoGreaterThan(Long value)
        {
            addCriterion("no >", value, "no");
            return (Criteria) this;
        }

        /**
         * And no greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andNoGreaterThanOrEqualTo(Long value)
        {
            addCriterion("no >=", value, "no");
            return (Criteria) this;
        }

        /**
         * And no less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andNoLessThan(Long value)
        {
            addCriterion("no <", value, "no");
            return (Criteria) this;
        }

        /**
         * And no less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andNoLessThanOrEqualTo(Long value)
        {
            addCriterion("no <=", value, "no");
            return (Criteria) this;
        }

        /**
         * And no in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andNoIn(List<Long> values)
        {
            addCriterion("no in", values, "no");
            return (Criteria) this;
        }

        /**
         * And no not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andNoNotIn(List<Long> values)
        {
            addCriterion("no not in", values, "no");
            return (Criteria) this;
        }

        /**
         * And no between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andNoBetween(Long value1, Long value2)
        {
            addCriterion("no between", value1, value2, "no");
            return (Criteria) this;
        }

        /**
         * And no not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andNoNotBetween(Long value1, Long value2)
        {
            addCriterion("no not between", value1, value2, "no");
            return (Criteria) this;
        }

        /**
         * And password is null criteria.
         *
         * @return the criteria
         */
        public Criteria andPasswordIsNull()
        {
            addCriterion("password is null");
            return (Criteria) this;
        }

        /**
         * And password is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andPasswordIsNotNull()
        {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        /**
         * And password equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andPasswordEqualTo(String value)
        {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        /**
         * And password not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andPasswordNotEqualTo(String value)
        {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        /**
         * And password greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andPasswordGreaterThan(String value)
        {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        /**
         * And password greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andPasswordGreaterThanOrEqualTo(String value)
        {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        /**
         * And password less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andPasswordLessThan(String value)
        {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        /**
         * And password less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andPasswordLessThanOrEqualTo(String value)
        {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        /**
         * And password like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andPasswordLike(String value)
        {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        /**
         * And password not like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andPasswordNotLike(String value)
        {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        /**
         * And password in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andPasswordIn(List<String> values)
        {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        /**
         * And password not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andPasswordNotIn(List<String> values)
        {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        /**
         * And password between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andPasswordBetween(String value1, String value2)
        {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        /**
         * And password not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andPasswordNotBetween(String value1, String value2)
        {
            addCriterion("password not between", value1, value2, "password");
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