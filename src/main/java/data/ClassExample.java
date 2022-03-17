package data;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Class example.
 */
public class ClassExample
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
     * Instantiates a new Class example.
     */
    public ClassExample()
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
         * And class name is null criteria.
         *
         * @return the criteria
         */
        public Criteria andClassNameIsNull()
        {
            addCriterion("class_name is null");
            return (Criteria) this;
        }

        /**
         * And class name is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andClassNameIsNotNull()
        {
            addCriterion("class_name is not null");
            return (Criteria) this;
        }

        /**
         * And class name equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andClassNameEqualTo(String value)
        {
            addCriterion("class_name =", value, "className");
            return (Criteria) this;
        }

        /**
         * And class name not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andClassNameNotEqualTo(String value)
        {
            addCriterion("class_name <>", value, "className");
            return (Criteria) this;
        }

        /**
         * And class name greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andClassNameGreaterThan(String value)
        {
            addCriterion("class_name >", value, "className");
            return (Criteria) this;
        }

        /**
         * And class name greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andClassNameGreaterThanOrEqualTo(String value)
        {
            addCriterion("class_name >=", value, "className");
            return (Criteria) this;
        }

        /**
         * And class name less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andClassNameLessThan(String value)
        {
            addCriterion("class_name <", value, "className");
            return (Criteria) this;
        }

        /**
         * And class name less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andClassNameLessThanOrEqualTo(String value)
        {
            addCriterion("class_name <=", value, "className");
            return (Criteria) this;
        }

        /**
         * And class name like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andClassNameLike(String value)
        {
            addCriterion("class_name like", value, "className");
            return (Criteria) this;
        }

        /**
         * And class name not like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andClassNameNotLike(String value)
        {
            addCriterion("class_name not like", value, "className");
            return (Criteria) this;
        }

        /**
         * And class name in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andClassNameIn(List<String> values)
        {
            addCriterion("class_name in", values, "className");
            return (Criteria) this;
        }

        /**
         * And class name not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andClassNameNotIn(List<String> values)
        {
            addCriterion("class_name not in", values, "className");
            return (Criteria) this;
        }

        /**
         * And class name between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andClassNameBetween(String value1, String value2)
        {
            addCriterion("class_name between", value1, value2, "className");
            return (Criteria) this;
        }

        /**
         * And class name not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andClassNameNotBetween(String value1, String value2)
        {
            addCriterion("class_name not between", value1, value2, "className");
            return (Criteria) this;
        }

        /**
         * And class college is null criteria.
         *
         * @return the criteria
         */
        public Criteria andClassCollegeIsNull()
        {
            addCriterion("class_college is null");
            return (Criteria) this;
        }

        /**
         * And class college is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andClassCollegeIsNotNull()
        {
            addCriterion("class_college is not null");
            return (Criteria) this;
        }

        /**
         * And class college equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andClassCollegeEqualTo(String value)
        {
            addCriterion("class_college =", value, "classCollege");
            return (Criteria) this;
        }

        /**
         * And class college not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andClassCollegeNotEqualTo(String value)
        {
            addCriterion("class_college <>", value, "classCollege");
            return (Criteria) this;
        }

        /**
         * And class college greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andClassCollegeGreaterThan(String value)
        {
            addCriterion("class_college >", value, "classCollege");
            return (Criteria) this;
        }

        /**
         * And class college greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andClassCollegeGreaterThanOrEqualTo(String value)
        {
            addCriterion("class_college >=", value, "classCollege");
            return (Criteria) this;
        }

        /**
         * And class college less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andClassCollegeLessThan(String value)
        {
            addCriterion("class_college <", value, "classCollege");
            return (Criteria) this;
        }

        /**
         * And class college less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andClassCollegeLessThanOrEqualTo(String value)
        {
            addCriterion("class_college <=", value, "classCollege");
            return (Criteria) this;
        }

        /**
         * And class college like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andClassCollegeLike(String value)
        {
            addCriterion("class_college like", value, "classCollege");
            return (Criteria) this;
        }

        /**
         * And class college not like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andClassCollegeNotLike(String value)
        {
            addCriterion("class_college not like", value, "classCollege");
            return (Criteria) this;
        }

        /**
         * And class college in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andClassCollegeIn(List<String> values)
        {
            addCriterion("class_college in", values, "classCollege");
            return (Criteria) this;
        }

        /**
         * And class college not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andClassCollegeNotIn(List<String> values)
        {
            addCriterion("class_college not in", values, "classCollege");
            return (Criteria) this;
        }

        /**
         * And class college between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andClassCollegeBetween(String value1, String value2)
        {
            addCriterion("class_college between", value1, value2, "classCollege");
            return (Criteria) this;
        }

        /**
         * And class college not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andClassCollegeNotBetween(String value1, String value2)
        {
            addCriterion("class_college not between", value1, value2, "classCollege");
            return (Criteria) this;
        }

        /**
         * And class major is null criteria.
         *
         * @return the criteria
         */
        public Criteria andClassMajorIsNull()
        {
            addCriterion("class_major is null");
            return (Criteria) this;
        }

        /**
         * And class major is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andClassMajorIsNotNull()
        {
            addCriterion("class_major is not null");
            return (Criteria) this;
        }

        /**
         * And class major equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andClassMajorEqualTo(String value)
        {
            addCriterion("class_major =", value, "classMajor");
            return (Criteria) this;
        }

        /**
         * And class major not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andClassMajorNotEqualTo(String value)
        {
            addCriterion("class_major <>", value, "classMajor");
            return (Criteria) this;
        }

        /**
         * And class major greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andClassMajorGreaterThan(String value)
        {
            addCriterion("class_major >", value, "classMajor");
            return (Criteria) this;
        }

        /**
         * And class major greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andClassMajorGreaterThanOrEqualTo(String value)
        {
            addCriterion("class_major >=", value, "classMajor");
            return (Criteria) this;
        }

        /**
         * And class major less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andClassMajorLessThan(String value)
        {
            addCriterion("class_major <", value, "classMajor");
            return (Criteria) this;
        }

        /**
         * And class major less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andClassMajorLessThanOrEqualTo(String value)
        {
            addCriterion("class_major <=", value, "classMajor");
            return (Criteria) this;
        }

        /**
         * And class major like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andClassMajorLike(String value)
        {
            addCriterion("class_major like", value, "classMajor");
            return (Criteria) this;
        }

        /**
         * And class major not like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andClassMajorNotLike(String value)
        {
            addCriterion("class_major not like", value, "classMajor");
            return (Criteria) this;
        }

        /**
         * And class major in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andClassMajorIn(List<String> values)
        {
            addCriterion("class_major in", values, "classMajor");
            return (Criteria) this;
        }

        /**
         * And class major not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andClassMajorNotIn(List<String> values)
        {
            addCriterion("class_major not in", values, "classMajor");
            return (Criteria) this;
        }

        /**
         * And class major between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andClassMajorBetween(String value1, String value2)
        {
            addCriterion("class_major between", value1, value2, "classMajor");
            return (Criteria) this;
        }

        /**
         * And class major not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andClassMajorNotBetween(String value1, String value2)
        {
            addCriterion("class_major not between", value1, value2, "classMajor");
            return (Criteria) this;
        }

        /**
         * And class enrollment year is null criteria.
         *
         * @return the criteria
         */
        public Criteria andClassEnrollmentYearIsNull()
        {
            addCriterion("class_enrollment_year is null");
            return (Criteria) this;
        }

        /**
         * And class enrollment year is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andClassEnrollmentYearIsNotNull()
        {
            addCriterion("class_enrollment_year is not null");
            return (Criteria) this;
        }

        /**
         * And class enrollment year equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andClassEnrollmentYearEqualTo(Integer value)
        {
            addCriterion("class_enrollment_year =", value, "classEnrollmentYear");
            return (Criteria) this;
        }

        /**
         * And class enrollment year not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andClassEnrollmentYearNotEqualTo(Integer value)
        {
            addCriterion("class_enrollment_year <>", value, "classEnrollmentYear");
            return (Criteria) this;
        }

        /**
         * And class enrollment year greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andClassEnrollmentYearGreaterThan(Integer value)
        {
            addCriterion("class_enrollment_year >", value, "classEnrollmentYear");
            return (Criteria) this;
        }

        /**
         * And class enrollment year greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andClassEnrollmentYearGreaterThanOrEqualTo(Integer value)
        {
            addCriterion("class_enrollment_year >=", value, "classEnrollmentYear");
            return (Criteria) this;
        }

        /**
         * And class enrollment year less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andClassEnrollmentYearLessThan(Integer value)
        {
            addCriterion("class_enrollment_year <", value, "classEnrollmentYear");
            return (Criteria) this;
        }

        /**
         * And class enrollment year less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andClassEnrollmentYearLessThanOrEqualTo(Integer value)
        {
            addCriterion("class_enrollment_year <=", value, "classEnrollmentYear");
            return (Criteria) this;
        }

        /**
         * And class enrollment year in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andClassEnrollmentYearIn(List<Integer> values)
        {
            addCriterion("class_enrollment_year in", values, "classEnrollmentYear");
            return (Criteria) this;
        }

        /**
         * And class enrollment year not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andClassEnrollmentYearNotIn(List<Integer> values)
        {
            addCriterion("class_enrollment_year not in", values, "classEnrollmentYear");
            return (Criteria) this;
        }

        /**
         * And class enrollment year between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andClassEnrollmentYearBetween(Integer value1, Integer value2)
        {
            addCriterion("class_enrollment_year between", value1, value2, "classEnrollmentYear");
            return (Criteria) this;
        }

        /**
         * And class enrollment year not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andClassEnrollmentYearNotBetween(Integer value1, Integer value2)
        {
            addCriterion("class_enrollment_year not between", value1, value2, "classEnrollmentYear");
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