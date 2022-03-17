package data;

import java.util.ArrayList;
import java.util.List;

/**
 * The type News example.
 */
public class NewsExample
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
     * Instantiates a new News example.
     */
    public NewsExample()
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
         * And new no is null criteria.
         *
         * @return the criteria
         */
        public Criteria andNewNoIsNull()
        {
            addCriterion("new_no is null");
            return (Criteria) this;
        }

        /**
         * And new no is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andNewNoIsNotNull()
        {
            addCriterion("new_no is not null");
            return (Criteria) this;
        }

        /**
         * And new no equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andNewNoEqualTo(Long value)
        {
            addCriterion("new_no =", value, "newNo");
            return (Criteria) this;
        }

        /**
         * And new no not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andNewNoNotEqualTo(Long value)
        {
            addCriterion("new_no <>", value, "newNo");
            return (Criteria) this;
        }

        /**
         * And new no greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andNewNoGreaterThan(Long value)
        {
            addCriterion("new_no >", value, "newNo");
            return (Criteria) this;
        }

        /**
         * And new no greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andNewNoGreaterThanOrEqualTo(Long value)
        {
            addCriterion("new_no >=", value, "newNo");
            return (Criteria) this;
        }

        /**
         * And new no less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andNewNoLessThan(Long value)
        {
            addCriterion("new_no <", value, "newNo");
            return (Criteria) this;
        }

        /**
         * And new no less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andNewNoLessThanOrEqualTo(Long value)
        {
            addCriterion("new_no <=", value, "newNo");
            return (Criteria) this;
        }

        /**
         * And new no in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andNewNoIn(List<Long> values)
        {
            addCriterion("new_no in", values, "newNo");
            return (Criteria) this;
        }

        /**
         * And new no not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andNewNoNotIn(List<Long> values)
        {
            addCriterion("new_no not in", values, "newNo");
            return (Criteria) this;
        }

        /**
         * And new no between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andNewNoBetween(Long value1, Long value2)
        {
            addCriterion("new_no between", value1, value2, "newNo");
            return (Criteria) this;
        }

        /**
         * And new no not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andNewNoNotBetween(Long value1, Long value2)
        {
            addCriterion("new_no not between", value1, value2, "newNo");
            return (Criteria) this;
        }

        /**
         * And new author is null criteria.
         *
         * @return the criteria
         */
        public Criteria andNewAuthorIsNull()
        {
            addCriterion("new_author is null");
            return (Criteria) this;
        }

        /**
         * And new author is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andNewAuthorIsNotNull()
        {
            addCriterion("new_author is not null");
            return (Criteria) this;
        }

        /**
         * And new author equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andNewAuthorEqualTo(String value)
        {
            addCriterion("new_author =", value, "newAuthor");
            return (Criteria) this;
        }

        /**
         * And new author not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andNewAuthorNotEqualTo(String value)
        {
            addCriterion("new_author <>", value, "newAuthor");
            return (Criteria) this;
        }

        /**
         * And new author greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andNewAuthorGreaterThan(String value)
        {
            addCriterion("new_author >", value, "newAuthor");
            return (Criteria) this;
        }

        /**
         * And new author greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andNewAuthorGreaterThanOrEqualTo(String value)
        {
            addCriterion("new_author >=", value, "newAuthor");
            return (Criteria) this;
        }

        /**
         * And new author less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andNewAuthorLessThan(String value)
        {
            addCriterion("new_author <", value, "newAuthor");
            return (Criteria) this;
        }

        /**
         * And new author less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andNewAuthorLessThanOrEqualTo(String value)
        {
            addCriterion("new_author <=", value, "newAuthor");
            return (Criteria) this;
        }

        /**
         * And new author like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andNewAuthorLike(String value)
        {
            addCriterion("new_author like", value, "newAuthor");
            return (Criteria) this;
        }

        /**
         * And new author not like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andNewAuthorNotLike(String value)
        {
            addCriterion("new_author not like", value, "newAuthor");
            return (Criteria) this;
        }

        /**
         * And new author in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andNewAuthorIn(List<String> values)
        {
            addCriterion("new_author in", values, "newAuthor");
            return (Criteria) this;
        }

        /**
         * And new author not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andNewAuthorNotIn(List<String> values)
        {
            addCriterion("new_author not in", values, "newAuthor");
            return (Criteria) this;
        }

        /**
         * And new author between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andNewAuthorBetween(String value1, String value2)
        {
            addCriterion("new_author between", value1, value2, "newAuthor");
            return (Criteria) this;
        }

        /**
         * And new author not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andNewAuthorNotBetween(String value1, String value2)
        {
            addCriterion("new_author not between", value1, value2, "newAuthor");
            return (Criteria) this;
        }

        /**
         * And new identity is null criteria.
         *
         * @return the criteria
         */
        public Criteria andNewIdentityIsNull()
        {
            addCriterion("new_identity is null");
            return (Criteria) this;
        }

        /**
         * And new identity is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andNewIdentityIsNotNull()
        {
            addCriterion("new_identity is not null");
            return (Criteria) this;
        }

        /**
         * And new identity equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andNewIdentityEqualTo(String value)
        {
            addCriterion("new_identity =", value, "newIdentity");
            return (Criteria) this;
        }

        /**
         * And new identity not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andNewIdentityNotEqualTo(String value)
        {
            addCriterion("new_identity <>", value, "newIdentity");
            return (Criteria) this;
        }

        /**
         * And new identity greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andNewIdentityGreaterThan(String value)
        {
            addCriterion("new_identity >", value, "newIdentity");
            return (Criteria) this;
        }

        /**
         * And new identity greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andNewIdentityGreaterThanOrEqualTo(String value)
        {
            addCriterion("new_identity >=", value, "newIdentity");
            return (Criteria) this;
        }

        /**
         * And new identity less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andNewIdentityLessThan(String value)
        {
            addCriterion("new_identity <", value, "newIdentity");
            return (Criteria) this;
        }

        /**
         * And new identity less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andNewIdentityLessThanOrEqualTo(String value)
        {
            addCriterion("new_identity <=", value, "newIdentity");
            return (Criteria) this;
        }

        /**
         * And new identity like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andNewIdentityLike(String value)
        {
            addCriterion("new_identity like", value, "newIdentity");
            return (Criteria) this;
        }

        /**
         * And new identity not like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andNewIdentityNotLike(String value)
        {
            addCriterion("new_identity not like", value, "newIdentity");
            return (Criteria) this;
        }

        /**
         * And new identity in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andNewIdentityIn(List<String> values)
        {
            addCriterion("new_identity in", values, "newIdentity");
            return (Criteria) this;
        }

        /**
         * And new identity not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andNewIdentityNotIn(List<String> values)
        {
            addCriterion("new_identity not in", values, "newIdentity");
            return (Criteria) this;
        }

        /**
         * And new identity between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andNewIdentityBetween(String value1, String value2)
        {
            addCriterion("new_identity between", value1, value2, "newIdentity");
            return (Criteria) this;
        }

        /**
         * And new identity not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andNewIdentityNotBetween(String value1, String value2)
        {
            addCriterion("new_identity not between", value1, value2, "newIdentity");
            return (Criteria) this;
        }

        /**
         * And new time is null criteria.
         *
         * @return the criteria
         */
        public Criteria andNewTimeIsNull()
        {
            addCriterion("new_time is null");
            return (Criteria) this;
        }

        /**
         * And new time is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andNewTimeIsNotNull()
        {
            addCriterion("new_time is not null");
            return (Criteria) this;
        }

        /**
         * And new time equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andNewTimeEqualTo(String value)
        {
            addCriterion("new_time =", value, "newTime");
            return (Criteria) this;
        }

        /**
         * And new time not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andNewTimeNotEqualTo(String value)
        {
            addCriterion("new_time <>", value, "newTime");
            return (Criteria) this;
        }

        /**
         * And new time greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andNewTimeGreaterThan(String value)
        {
            addCriterion("new_time >", value, "newTime");
            return (Criteria) this;
        }

        /**
         * And new time greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andNewTimeGreaterThanOrEqualTo(String value)
        {
            addCriterion("new_time >=", value, "newTime");
            return (Criteria) this;
        }

        /**
         * And new time less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andNewTimeLessThan(String value)
        {
            addCriterion("new_time <", value, "newTime");
            return (Criteria) this;
        }

        /**
         * And new time less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andNewTimeLessThanOrEqualTo(String value)
        {
            addCriterion("new_time <=", value, "newTime");
            return (Criteria) this;
        }

        /**
         * And new time like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andNewTimeLike(String value)
        {
            addCriterion("new_time like", value, "newTime");
            return (Criteria) this;
        }

        /**
         * And new time not like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andNewTimeNotLike(String value)
        {
            addCriterion("new_time not like", value, "newTime");
            return (Criteria) this;
        }

        /**
         * And new time in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andNewTimeIn(List<String> values)
        {
            addCriterion("new_time in", values, "newTime");
            return (Criteria) this;
        }

        /**
         * And new time not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andNewTimeNotIn(List<String> values)
        {
            addCriterion("new_time not in", values, "newTime");
            return (Criteria) this;
        }

        /**
         * And new time between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andNewTimeBetween(String value1, String value2)
        {
            addCriterion("new_time between", value1, value2, "newTime");
            return (Criteria) this;
        }

        /**
         * And new time not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andNewTimeNotBetween(String value1, String value2)
        {
            addCriterion("new_time not between", value1, value2, "newTime");
            return (Criteria) this;
        }

        /**
         * And new title is null criteria.
         *
         * @return the criteria
         */
        public Criteria andNewTitleIsNull()
        {
            addCriterion("new_title is null");
            return (Criteria) this;
        }

        /**
         * And new title is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andNewTitleIsNotNull()
        {
            addCriterion("new_title is not null");
            return (Criteria) this;
        }

        /**
         * And new title equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andNewTitleEqualTo(String value)
        {
            addCriterion("new_title =", value, "newTitle");
            return (Criteria) this;
        }

        /**
         * And new title not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andNewTitleNotEqualTo(String value)
        {
            addCriterion("new_title <>", value, "newTitle");
            return (Criteria) this;
        }

        /**
         * And new title greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andNewTitleGreaterThan(String value)
        {
            addCriterion("new_title >", value, "newTitle");
            return (Criteria) this;
        }

        /**
         * And new title greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andNewTitleGreaterThanOrEqualTo(String value)
        {
            addCriterion("new_title >=", value, "newTitle");
            return (Criteria) this;
        }

        /**
         * And new title less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andNewTitleLessThan(String value)
        {
            addCriterion("new_title <", value, "newTitle");
            return (Criteria) this;
        }

        /**
         * And new title less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andNewTitleLessThanOrEqualTo(String value)
        {
            addCriterion("new_title <=", value, "newTitle");
            return (Criteria) this;
        }

        /**
         * And new title like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andNewTitleLike(String value)
        {
            addCriterion("new_title like", value, "newTitle");
            return (Criteria) this;
        }

        /**
         * And new title not like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andNewTitleNotLike(String value)
        {
            addCriterion("new_title not like", value, "newTitle");
            return (Criteria) this;
        }

        /**
         * And new title in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andNewTitleIn(List<String> values)
        {
            addCriterion("new_title in", values, "newTitle");
            return (Criteria) this;
        }

        /**
         * And new title not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andNewTitleNotIn(List<String> values)
        {
            addCriterion("new_title not in", values, "newTitle");
            return (Criteria) this;
        }

        /**
         * And new title between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andNewTitleBetween(String value1, String value2)
        {
            addCriterion("new_title between", value1, value2, "newTitle");
            return (Criteria) this;
        }

        /**
         * And new title not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andNewTitleNotBetween(String value1, String value2)
        {
            addCriterion("new_title not between", value1, value2, "newTitle");
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