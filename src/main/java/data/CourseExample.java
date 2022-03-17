package data;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Course example.
 */
public class CourseExample
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
     * Instantiates a new Course example.
     */
    public CourseExample()
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
         * And cno is null criteria.
         *
         * @return the criteria
         */
        public Criteria andCnoIsNull()
        {
            addCriterion("cno is null");
            return (Criteria) this;
        }

        /**
         * And cno is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andCnoIsNotNull()
        {
            addCriterion("cno is not null");
            return (Criteria) this;
        }

        /**
         * And cno equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCnoEqualTo(Integer value)
        {
            addCriterion("cno =", value, "cno");
            return (Criteria) this;
        }

        /**
         * And cno not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCnoNotEqualTo(Integer value)
        {
            addCriterion("cno <>", value, "cno");
            return (Criteria) this;
        }

        /**
         * And cno greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCnoGreaterThan(Integer value)
        {
            addCriterion("cno >", value, "cno");
            return (Criteria) this;
        }

        /**
         * And cno greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCnoGreaterThanOrEqualTo(Integer value)
        {
            addCriterion("cno >=", value, "cno");
            return (Criteria) this;
        }

        /**
         * And cno less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCnoLessThan(Integer value)
        {
            addCriterion("cno <", value, "cno");
            return (Criteria) this;
        }

        /**
         * And cno less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCnoLessThanOrEqualTo(Integer value)
        {
            addCriterion("cno <=", value, "cno");
            return (Criteria) this;
        }

        /**
         * And cno in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andCnoIn(List<Integer> values)
        {
            addCriterion("cno in", values, "cno");
            return (Criteria) this;
        }

        /**
         * And cno not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andCnoNotIn(List<Integer> values)
        {
            addCriterion("cno not in", values, "cno");
            return (Criteria) this;
        }

        /**
         * And cno between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andCnoBetween(Integer value1, Integer value2)
        {
            addCriterion("cno between", value1, value2, "cno");
            return (Criteria) this;
        }

        /**
         * And cno not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andCnoNotBetween(Integer value1, Integer value2)
        {
            addCriterion("cno not between", value1, value2, "cno");
            return (Criteria) this;
        }

        /**
         * And name is null criteria.
         *
         * @return the criteria
         */
        public Criteria andNameIsNull()
        {
            addCriterion("name is null");
            return (Criteria) this;
        }

        /**
         * And name is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andNameIsNotNull()
        {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        /**
         * And name equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andNameEqualTo(String value)
        {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        /**
         * And name not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andNameNotEqualTo(String value)
        {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        /**
         * And name greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andNameGreaterThan(String value)
        {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        /**
         * And name greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andNameGreaterThanOrEqualTo(String value)
        {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        /**
         * And name less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andNameLessThan(String value)
        {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        /**
         * And name less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andNameLessThanOrEqualTo(String value)
        {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        /**
         * And name like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andNameLike(String value)
        {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        /**
         * And name not like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andNameNotLike(String value)
        {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        /**
         * And name in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andNameIn(List<String> values)
        {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        /**
         * And name not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andNameNotIn(List<String> values)
        {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        /**
         * And name between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andNameBetween(String value1, String value2)
        {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        /**
         * And name not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andNameNotBetween(String value1, String value2)
        {
            addCriterion("name not between", value1, value2, "name");
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