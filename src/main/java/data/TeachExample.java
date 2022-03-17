package data;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Teach example.
 */
public class TeachExample
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
     * Instantiates a new Teach example.
     */
    public TeachExample()
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
         * And teach no is null criteria.
         *
         * @return the criteria
         */
        public Criteria andTeachNoIsNull()
        {
            addCriterion("teach_no is null");
            return (Criteria) this;
        }

        /**
         * And teach no is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andTeachNoIsNotNull()
        {
            addCriterion("teach_no is not null");
            return (Criteria) this;
        }

        /**
         * And teach no equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andTeachNoEqualTo(Long value)
        {
            addCriterion("teach_no =", value, "teachNo");
            return (Criteria) this;
        }

        /**
         * And teach no not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andTeachNoNotEqualTo(Long value)
        {
            addCriterion("teach_no <>", value, "teachNo");
            return (Criteria) this;
        }

        /**
         * And teach no greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andTeachNoGreaterThan(Long value)
        {
            addCriterion("teach_no >", value, "teachNo");
            return (Criteria) this;
        }

        /**
         * And teach no greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andTeachNoGreaterThanOrEqualTo(Long value)
        {
            addCriterion("teach_no >=", value, "teachNo");
            return (Criteria) this;
        }

        /**
         * And teach no less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andTeachNoLessThan(Long value)
        {
            addCriterion("teach_no <", value, "teachNo");
            return (Criteria) this;
        }

        /**
         * And teach no less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andTeachNoLessThanOrEqualTo(Long value)
        {
            addCriterion("teach_no <=", value, "teachNo");
            return (Criteria) this;
        }

        /**
         * And teach no in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andTeachNoIn(List<Long> values)
        {
            addCriterion("teach_no in", values, "teachNo");
            return (Criteria) this;
        }

        /**
         * And teach no not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andTeachNoNotIn(List<Long> values)
        {
            addCriterion("teach_no not in", values, "teachNo");
            return (Criteria) this;
        }

        /**
         * And teach no between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andTeachNoBetween(Long value1, Long value2)
        {
            addCriterion("teach_no between", value1, value2, "teachNo");
            return (Criteria) this;
        }

        /**
         * And teach no not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andTeachNoNotBetween(Long value1, Long value2)
        {
            addCriterion("teach_no not between", value1, value2, "teachNo");
            return (Criteria) this;
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
         * And class no is null criteria.
         *
         * @return the criteria
         */
        public Criteria andClassNoIsNull()
        {
            addCriterion("class_no is null");
            return (Criteria) this;
        }

        /**
         * And class no is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andClassNoIsNotNull()
        {
            addCriterion("class_no is not null");
            return (Criteria) this;
        }

        /**
         * And class no equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andClassNoEqualTo(Long value)
        {
            addCriterion("class_no =", value, "classNo");
            return (Criteria) this;
        }

        /**
         * And class no not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andClassNoNotEqualTo(Long value)
        {
            addCriterion("class_no <>", value, "classNo");
            return (Criteria) this;
        }

        /**
         * And class no greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andClassNoGreaterThan(Long value)
        {
            addCriterion("class_no >", value, "classNo");
            return (Criteria) this;
        }

        /**
         * And class no greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andClassNoGreaterThanOrEqualTo(Long value)
        {
            addCriterion("class_no >=", value, "classNo");
            return (Criteria) this;
        }

        /**
         * And class no less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andClassNoLessThan(Long value)
        {
            addCriterion("class_no <", value, "classNo");
            return (Criteria) this;
        }

        /**
         * And class no less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andClassNoLessThanOrEqualTo(Long value)
        {
            addCriterion("class_no <=", value, "classNo");
            return (Criteria) this;
        }

        /**
         * And class no in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andClassNoIn(List<Long> values)
        {
            addCriterion("class_no in", values, "classNo");
            return (Criteria) this;
        }

        /**
         * And class no not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andClassNoNotIn(List<Long> values)
        {
            addCriterion("class_no not in", values, "classNo");
            return (Criteria) this;
        }

        /**
         * And class no between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andClassNoBetween(Long value1, Long value2)
        {
            addCriterion("class_no between", value1, value2, "classNo");
            return (Criteria) this;
        }

        /**
         * And class no not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andClassNoNotBetween(Long value1, Long value2)
        {
            addCriterion("class_no not between", value1, value2, "classNo");
            return (Criteria) this;
        }

        /**
         * And course no is null criteria.
         *
         * @return the criteria
         */
        public Criteria andCourseNoIsNull()
        {
            addCriterion("course_no is null");
            return (Criteria) this;
        }

        /**
         * And course no is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andCourseNoIsNotNull()
        {
            addCriterion("course_no is not null");
            return (Criteria) this;
        }

        /**
         * And course no equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCourseNoEqualTo(Long value)
        {
            addCriterion("course_no =", value, "courseNo");
            return (Criteria) this;
        }

        /**
         * And course no not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCourseNoNotEqualTo(Long value)
        {
            addCriterion("course_no <>", value, "courseNo");
            return (Criteria) this;
        }

        /**
         * And course no greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCourseNoGreaterThan(Long value)
        {
            addCriterion("course_no >", value, "courseNo");
            return (Criteria) this;
        }

        /**
         * And course no greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCourseNoGreaterThanOrEqualTo(Long value)
        {
            addCriterion("course_no >=", value, "courseNo");
            return (Criteria) this;
        }

        /**
         * And course no less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCourseNoLessThan(Long value)
        {
            addCriterion("course_no <", value, "courseNo");
            return (Criteria) this;
        }

        /**
         * And course no less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCourseNoLessThanOrEqualTo(Long value)
        {
            addCriterion("course_no <=", value, "courseNo");
            return (Criteria) this;
        }

        /**
         * And course no in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andCourseNoIn(List<Long> values)
        {
            addCriterion("course_no in", values, "courseNo");
            return (Criteria) this;
        }

        /**
         * And course no not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andCourseNoNotIn(List<Long> values)
        {
            addCriterion("course_no not in", values, "courseNo");
            return (Criteria) this;
        }

        /**
         * And course no between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andCourseNoBetween(Long value1, Long value2)
        {
            addCriterion("course_no between", value1, value2, "courseNo");
            return (Criteria) this;
        }

        /**
         * And course no not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andCourseNoNotBetween(Long value1, Long value2)
        {
            addCriterion("course_no not between", value1, value2, "courseNo");
            return (Criteria) this;
        }

        /**
         * And semester is null criteria.
         *
         * @return the criteria
         */
        public Criteria andSemesterIsNull()
        {
            addCriterion("semester is null");
            return (Criteria) this;
        }

        /**
         * And semester is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andSemesterIsNotNull()
        {
            addCriterion("semester is not null");
            return (Criteria) this;
        }

        /**
         * And semester equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andSemesterEqualTo(String value)
        {
            addCriterion("semester =", value, "semester");
            return (Criteria) this;
        }

        /**
         * And semester not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andSemesterNotEqualTo(String value)
        {
            addCriterion("semester <>", value, "semester");
            return (Criteria) this;
        }

        /**
         * And semester greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andSemesterGreaterThan(String value)
        {
            addCriterion("semester >", value, "semester");
            return (Criteria) this;
        }

        /**
         * And semester greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andSemesterGreaterThanOrEqualTo(String value)
        {
            addCriterion("semester >=", value, "semester");
            return (Criteria) this;
        }

        /**
         * And semester less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andSemesterLessThan(String value)
        {
            addCriterion("semester <", value, "semester");
            return (Criteria) this;
        }

        /**
         * And semester less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andSemesterLessThanOrEqualTo(String value)
        {
            addCriterion("semester <=", value, "semester");
            return (Criteria) this;
        }

        /**
         * And semester like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andSemesterLike(String value)
        {
            addCriterion("semester like", value, "semester");
            return (Criteria) this;
        }

        /**
         * And semester not like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andSemesterNotLike(String value)
        {
            addCriterion("semester not like", value, "semester");
            return (Criteria) this;
        }

        /**
         * And semester in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andSemesterIn(List<String> values)
        {
            addCriterion("semester in", values, "semester");
            return (Criteria) this;
        }

        /**
         * And semester not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andSemesterNotIn(List<String> values)
        {
            addCriterion("semester not in", values, "semester");
            return (Criteria) this;
        }

        /**
         * And semester between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andSemesterBetween(String value1, String value2)
        {
            addCriterion("semester between", value1, value2, "semester");
            return (Criteria) this;
        }

        /**
         * And semester not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andSemesterNotBetween(String value1, String value2)
        {
            addCriterion("semester not between", value1, value2, "semester");
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