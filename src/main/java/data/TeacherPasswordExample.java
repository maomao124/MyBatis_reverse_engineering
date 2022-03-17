package data;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Teacher password example.
 */
public class TeacherPasswordExample
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
     * Instantiates a new Teacher password example.
     */
    public TeacherPasswordExample()
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
         * And teacher password is null criteria.
         *
         * @return the criteria
         */
        public Criteria andTeacherPasswordIsNull()
        {
            addCriterion("teacher_password is null");
            return (Criteria) this;
        }

        /**
         * And teacher password is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andTeacherPasswordIsNotNull()
        {
            addCriterion("teacher_password is not null");
            return (Criteria) this;
        }

        /**
         * And teacher password equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andTeacherPasswordEqualTo(String value)
        {
            addCriterion("teacher_password =", value, "teacherPassword");
            return (Criteria) this;
        }

        /**
         * And teacher password not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andTeacherPasswordNotEqualTo(String value)
        {
            addCriterion("teacher_password <>", value, "teacherPassword");
            return (Criteria) this;
        }

        /**
         * And teacher password greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andTeacherPasswordGreaterThan(String value)
        {
            addCriterion("teacher_password >", value, "teacherPassword");
            return (Criteria) this;
        }

        /**
         * And teacher password greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andTeacherPasswordGreaterThanOrEqualTo(String value)
        {
            addCriterion("teacher_password >=", value, "teacherPassword");
            return (Criteria) this;
        }

        /**
         * And teacher password less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andTeacherPasswordLessThan(String value)
        {
            addCriterion("teacher_password <", value, "teacherPassword");
            return (Criteria) this;
        }

        /**
         * And teacher password less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andTeacherPasswordLessThanOrEqualTo(String value)
        {
            addCriterion("teacher_password <=", value, "teacherPassword");
            return (Criteria) this;
        }

        /**
         * And teacher password like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andTeacherPasswordLike(String value)
        {
            addCriterion("teacher_password like", value, "teacherPassword");
            return (Criteria) this;
        }

        /**
         * And teacher password not like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andTeacherPasswordNotLike(String value)
        {
            addCriterion("teacher_password not like", value, "teacherPassword");
            return (Criteria) this;
        }

        /**
         * And teacher password in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andTeacherPasswordIn(List<String> values)
        {
            addCriterion("teacher_password in", values, "teacherPassword");
            return (Criteria) this;
        }

        /**
         * And teacher password not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andTeacherPasswordNotIn(List<String> values)
        {
            addCriterion("teacher_password not in", values, "teacherPassword");
            return (Criteria) this;
        }

        /**
         * And teacher password between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andTeacherPasswordBetween(String value1, String value2)
        {
            addCriterion("teacher_password between", value1, value2, "teacherPassword");
            return (Criteria) this;
        }

        /**
         * And teacher password not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andTeacherPasswordNotBetween(String value1, String value2)
        {
            addCriterion("teacher_password not between", value1, value2, "teacherPassword");
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