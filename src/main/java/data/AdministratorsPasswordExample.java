package data;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Administrators password example.
 */
public class AdministratorsPasswordExample
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
     * Instantiates a new Administrators password example.
     */
    public AdministratorsPasswordExample()
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
         * And administrator password is null criteria.
         *
         * @return the criteria
         */
        public Criteria andAdministratorPasswordIsNull()
        {
            addCriterion("administrator_password is null");
            return (Criteria) this;
        }

        /**
         * And administrator password is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andAdministratorPasswordIsNotNull()
        {
            addCriterion("administrator_password is not null");
            return (Criteria) this;
        }

        /**
         * And administrator password equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andAdministratorPasswordEqualTo(String value)
        {
            addCriterion("administrator_password =", value, "administratorPassword");
            return (Criteria) this;
        }

        /**
         * And administrator password not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andAdministratorPasswordNotEqualTo(String value)
        {
            addCriterion("administrator_password <>", value, "administratorPassword");
            return (Criteria) this;
        }

        /**
         * And administrator password greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andAdministratorPasswordGreaterThan(String value)
        {
            addCriterion("administrator_password >", value, "administratorPassword");
            return (Criteria) this;
        }

        /**
         * And administrator password greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andAdministratorPasswordGreaterThanOrEqualTo(String value)
        {
            addCriterion("administrator_password >=", value, "administratorPassword");
            return (Criteria) this;
        }

        /**
         * And administrator password less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andAdministratorPasswordLessThan(String value)
        {
            addCriterion("administrator_password <", value, "administratorPassword");
            return (Criteria) this;
        }

        /**
         * And administrator password less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andAdministratorPasswordLessThanOrEqualTo(String value)
        {
            addCriterion("administrator_password <=", value, "administratorPassword");
            return (Criteria) this;
        }

        /**
         * And administrator password like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andAdministratorPasswordLike(String value)
        {
            addCriterion("administrator_password like", value, "administratorPassword");
            return (Criteria) this;
        }

        /**
         * And administrator password not like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andAdministratorPasswordNotLike(String value)
        {
            addCriterion("administrator_password not like", value, "administratorPassword");
            return (Criteria) this;
        }

        /**
         * And administrator password in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andAdministratorPasswordIn(List<String> values)
        {
            addCriterion("administrator_password in", values, "administratorPassword");
            return (Criteria) this;
        }

        /**
         * And administrator password not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andAdministratorPasswordNotIn(List<String> values)
        {
            addCriterion("administrator_password not in", values, "administratorPassword");
            return (Criteria) this;
        }

        /**
         * And administrator password between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andAdministratorPasswordBetween(String value1, String value2)
        {
            addCriterion("administrator_password between", value1, value2, "administratorPassword");
            return (Criteria) this;
        }

        /**
         * And administrator password not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andAdministratorPasswordNotBetween(String value1, String value2)
        {
            addCriterion("administrator_password not between", value1, value2, "administratorPassword");
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