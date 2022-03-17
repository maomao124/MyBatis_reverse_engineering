package data;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Forum example.
 */
public class ForumExample
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
     * Instantiates a new Forum example.
     */
    public ForumExample()
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
         * And forum no is null criteria.
         *
         * @return the criteria
         */
        public Criteria andForumNoIsNull()
        {
            addCriterion("forum_no is null");
            return (Criteria) this;
        }

        /**
         * And forum no is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andForumNoIsNotNull()
        {
            addCriterion("forum_no is not null");
            return (Criteria) this;
        }

        /**
         * And forum no equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andForumNoEqualTo(Long value)
        {
            addCriterion("forum_no =", value, "forumNo");
            return (Criteria) this;
        }

        /**
         * And forum no not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andForumNoNotEqualTo(Long value)
        {
            addCriterion("forum_no <>", value, "forumNo");
            return (Criteria) this;
        }

        /**
         * And forum no greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andForumNoGreaterThan(Long value)
        {
            addCriterion("forum_no >", value, "forumNo");
            return (Criteria) this;
        }

        /**
         * And forum no greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andForumNoGreaterThanOrEqualTo(Long value)
        {
            addCriterion("forum_no >=", value, "forumNo");
            return (Criteria) this;
        }

        /**
         * And forum no less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andForumNoLessThan(Long value)
        {
            addCriterion("forum_no <", value, "forumNo");
            return (Criteria) this;
        }

        /**
         * And forum no less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andForumNoLessThanOrEqualTo(Long value)
        {
            addCriterion("forum_no <=", value, "forumNo");
            return (Criteria) this;
        }

        /**
         * And forum no in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andForumNoIn(List<Long> values)
        {
            addCriterion("forum_no in", values, "forumNo");
            return (Criteria) this;
        }

        /**
         * And forum no not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andForumNoNotIn(List<Long> values)
        {
            addCriterion("forum_no not in", values, "forumNo");
            return (Criteria) this;
        }

        /**
         * And forum no between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andForumNoBetween(Long value1, Long value2)
        {
            addCriterion("forum_no between", value1, value2, "forumNo");
            return (Criteria) this;
        }

        /**
         * And forum no not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andForumNoNotBetween(Long value1, Long value2)
        {
            addCriterion("forum_no not between", value1, value2, "forumNo");
            return (Criteria) this;
        }

        /**
         * And forum people no is null criteria.
         *
         * @return the criteria
         */
        public Criteria andForumPeopleNoIsNull()
        {
            addCriterion("forum_people_no is null");
            return (Criteria) this;
        }

        /**
         * And forum people no is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andForumPeopleNoIsNotNull()
        {
            addCriterion("forum_people_no is not null");
            return (Criteria) this;
        }

        /**
         * And forum people no equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andForumPeopleNoEqualTo(Long value)
        {
            addCriterion("forum_people_no =", value, "forumPeopleNo");
            return (Criteria) this;
        }

        /**
         * And forum people no not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andForumPeopleNoNotEqualTo(Long value)
        {
            addCriterion("forum_people_no <>", value, "forumPeopleNo");
            return (Criteria) this;
        }

        /**
         * And forum people no greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andForumPeopleNoGreaterThan(Long value)
        {
            addCriterion("forum_people_no >", value, "forumPeopleNo");
            return (Criteria) this;
        }

        /**
         * And forum people no greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andForumPeopleNoGreaterThanOrEqualTo(Long value)
        {
            addCriterion("forum_people_no >=", value, "forumPeopleNo");
            return (Criteria) this;
        }

        /**
         * And forum people no less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andForumPeopleNoLessThan(Long value)
        {
            addCriterion("forum_people_no <", value, "forumPeopleNo");
            return (Criteria) this;
        }

        /**
         * And forum people no less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andForumPeopleNoLessThanOrEqualTo(Long value)
        {
            addCriterion("forum_people_no <=", value, "forumPeopleNo");
            return (Criteria) this;
        }

        /**
         * And forum people no in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andForumPeopleNoIn(List<Long> values)
        {
            addCriterion("forum_people_no in", values, "forumPeopleNo");
            return (Criteria) this;
        }

        /**
         * And forum people no not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andForumPeopleNoNotIn(List<Long> values)
        {
            addCriterion("forum_people_no not in", values, "forumPeopleNo");
            return (Criteria) this;
        }

        /**
         * And forum people no between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andForumPeopleNoBetween(Long value1, Long value2)
        {
            addCriterion("forum_people_no between", value1, value2, "forumPeopleNo");
            return (Criteria) this;
        }

        /**
         * And forum people no not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andForumPeopleNoNotBetween(Long value1, Long value2)
        {
            addCriterion("forum_people_no not between", value1, value2, "forumPeopleNo");
            return (Criteria) this;
        }

        /**
         * And forum name is null criteria.
         *
         * @return the criteria
         */
        public Criteria andForumNameIsNull()
        {
            addCriterion("forum_name is null");
            return (Criteria) this;
        }

        /**
         * And forum name is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andForumNameIsNotNull()
        {
            addCriterion("forum_name is not null");
            return (Criteria) this;
        }

        /**
         * And forum name equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andForumNameEqualTo(String value)
        {
            addCriterion("forum_name =", value, "forumName");
            return (Criteria) this;
        }

        /**
         * And forum name not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andForumNameNotEqualTo(String value)
        {
            addCriterion("forum_name <>", value, "forumName");
            return (Criteria) this;
        }

        /**
         * And forum name greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andForumNameGreaterThan(String value)
        {
            addCriterion("forum_name >", value, "forumName");
            return (Criteria) this;
        }

        /**
         * And forum name greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andForumNameGreaterThanOrEqualTo(String value)
        {
            addCriterion("forum_name >=", value, "forumName");
            return (Criteria) this;
        }

        /**
         * And forum name less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andForumNameLessThan(String value)
        {
            addCriterion("forum_name <", value, "forumName");
            return (Criteria) this;
        }

        /**
         * And forum name less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andForumNameLessThanOrEqualTo(String value)
        {
            addCriterion("forum_name <=", value, "forumName");
            return (Criteria) this;
        }

        /**
         * And forum name like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andForumNameLike(String value)
        {
            addCriterion("forum_name like", value, "forumName");
            return (Criteria) this;
        }

        /**
         * And forum name not like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andForumNameNotLike(String value)
        {
            addCriterion("forum_name not like", value, "forumName");
            return (Criteria) this;
        }

        /**
         * And forum name in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andForumNameIn(List<String> values)
        {
            addCriterion("forum_name in", values, "forumName");
            return (Criteria) this;
        }

        /**
         * And forum name not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andForumNameNotIn(List<String> values)
        {
            addCriterion("forum_name not in", values, "forumName");
            return (Criteria) this;
        }

        /**
         * And forum name between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andForumNameBetween(String value1, String value2)
        {
            addCriterion("forum_name between", value1, value2, "forumName");
            return (Criteria) this;
        }

        /**
         * And forum name not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andForumNameNotBetween(String value1, String value2)
        {
            addCriterion("forum_name not between", value1, value2, "forumName");
            return (Criteria) this;
        }

        /**
         * And forum identity is null criteria.
         *
         * @return the criteria
         */
        public Criteria andForumIdentityIsNull()
        {
            addCriterion("forum_identity is null");
            return (Criteria) this;
        }

        /**
         * And forum identity is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andForumIdentityIsNotNull()
        {
            addCriterion("forum_identity is not null");
            return (Criteria) this;
        }

        /**
         * And forum identity equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andForumIdentityEqualTo(String value)
        {
            addCriterion("forum_identity =", value, "forumIdentity");
            return (Criteria) this;
        }

        /**
         * And forum identity not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andForumIdentityNotEqualTo(String value)
        {
            addCriterion("forum_identity <>", value, "forumIdentity");
            return (Criteria) this;
        }

        /**
         * And forum identity greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andForumIdentityGreaterThan(String value)
        {
            addCriterion("forum_identity >", value, "forumIdentity");
            return (Criteria) this;
        }

        /**
         * And forum identity greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andForumIdentityGreaterThanOrEqualTo(String value)
        {
            addCriterion("forum_identity >=", value, "forumIdentity");
            return (Criteria) this;
        }

        /**
         * And forum identity less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andForumIdentityLessThan(String value)
        {
            addCriterion("forum_identity <", value, "forumIdentity");
            return (Criteria) this;
        }

        /**
         * And forum identity less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andForumIdentityLessThanOrEqualTo(String value)
        {
            addCriterion("forum_identity <=", value, "forumIdentity");
            return (Criteria) this;
        }

        /**
         * And forum identity like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andForumIdentityLike(String value)
        {
            addCriterion("forum_identity like", value, "forumIdentity");
            return (Criteria) this;
        }

        /**
         * And forum identity not like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andForumIdentityNotLike(String value)
        {
            addCriterion("forum_identity not like", value, "forumIdentity");
            return (Criteria) this;
        }

        /**
         * And forum identity in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andForumIdentityIn(List<String> values)
        {
            addCriterion("forum_identity in", values, "forumIdentity");
            return (Criteria) this;
        }

        /**
         * And forum identity not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andForumIdentityNotIn(List<String> values)
        {
            addCriterion("forum_identity not in", values, "forumIdentity");
            return (Criteria) this;
        }

        /**
         * And forum identity between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andForumIdentityBetween(String value1, String value2)
        {
            addCriterion("forum_identity between", value1, value2, "forumIdentity");
            return (Criteria) this;
        }

        /**
         * And forum identity not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andForumIdentityNotBetween(String value1, String value2)
        {
            addCriterion("forum_identity not between", value1, value2, "forumIdentity");
            return (Criteria) this;
        }

        /**
         * And forum time is null criteria.
         *
         * @return the criteria
         */
        public Criteria andForumTimeIsNull()
        {
            addCriterion("forum_time is null");
            return (Criteria) this;
        }

        /**
         * And forum time is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andForumTimeIsNotNull()
        {
            addCriterion("forum_time is not null");
            return (Criteria) this;
        }

        /**
         * And forum time equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andForumTimeEqualTo(String value)
        {
            addCriterion("forum_time =", value, "forumTime");
            return (Criteria) this;
        }

        /**
         * And forum time not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andForumTimeNotEqualTo(String value)
        {
            addCriterion("forum_time <>", value, "forumTime");
            return (Criteria) this;
        }

        /**
         * And forum time greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andForumTimeGreaterThan(String value)
        {
            addCriterion("forum_time >", value, "forumTime");
            return (Criteria) this;
        }

        /**
         * And forum time greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andForumTimeGreaterThanOrEqualTo(String value)
        {
            addCriterion("forum_time >=", value, "forumTime");
            return (Criteria) this;
        }

        /**
         * And forum time less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andForumTimeLessThan(String value)
        {
            addCriterion("forum_time <", value, "forumTime");
            return (Criteria) this;
        }

        /**
         * And forum time less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andForumTimeLessThanOrEqualTo(String value)
        {
            addCriterion("forum_time <=", value, "forumTime");
            return (Criteria) this;
        }

        /**
         * And forum time like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andForumTimeLike(String value)
        {
            addCriterion("forum_time like", value, "forumTime");
            return (Criteria) this;
        }

        /**
         * And forum time not like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andForumTimeNotLike(String value)
        {
            addCriterion("forum_time not like", value, "forumTime");
            return (Criteria) this;
        }

        /**
         * And forum time in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andForumTimeIn(List<String> values)
        {
            addCriterion("forum_time in", values, "forumTime");
            return (Criteria) this;
        }

        /**
         * And forum time not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andForumTimeNotIn(List<String> values)
        {
            addCriterion("forum_time not in", values, "forumTime");
            return (Criteria) this;
        }

        /**
         * And forum time between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andForumTimeBetween(String value1, String value2)
        {
            addCriterion("forum_time between", value1, value2, "forumTime");
            return (Criteria) this;
        }

        /**
         * And forum time not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andForumTimeNotBetween(String value1, String value2)
        {
            addCriterion("forum_time not between", value1, value2, "forumTime");
            return (Criteria) this;
        }

        /**
         * And forum content is null criteria.
         *
         * @return the criteria
         */
        public Criteria andForumContentIsNull()
        {
            addCriterion("forum_content is null");
            return (Criteria) this;
        }

        /**
         * And forum content is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andForumContentIsNotNull()
        {
            addCriterion("forum_content is not null");
            return (Criteria) this;
        }

        /**
         * And forum content equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andForumContentEqualTo(String value)
        {
            addCriterion("forum_content =", value, "forumContent");
            return (Criteria) this;
        }

        /**
         * And forum content not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andForumContentNotEqualTo(String value)
        {
            addCriterion("forum_content <>", value, "forumContent");
            return (Criteria) this;
        }

        /**
         * And forum content greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andForumContentGreaterThan(String value)
        {
            addCriterion("forum_content >", value, "forumContent");
            return (Criteria) this;
        }

        /**
         * And forum content greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andForumContentGreaterThanOrEqualTo(String value)
        {
            addCriterion("forum_content >=", value, "forumContent");
            return (Criteria) this;
        }

        /**
         * And forum content less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andForumContentLessThan(String value)
        {
            addCriterion("forum_content <", value, "forumContent");
            return (Criteria) this;
        }

        /**
         * And forum content less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andForumContentLessThanOrEqualTo(String value)
        {
            addCriterion("forum_content <=", value, "forumContent");
            return (Criteria) this;
        }

        /**
         * And forum content like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andForumContentLike(String value)
        {
            addCriterion("forum_content like", value, "forumContent");
            return (Criteria) this;
        }

        /**
         * And forum content not like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andForumContentNotLike(String value)
        {
            addCriterion("forum_content not like", value, "forumContent");
            return (Criteria) this;
        }

        /**
         * And forum content in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andForumContentIn(List<String> values)
        {
            addCriterion("forum_content in", values, "forumContent");
            return (Criteria) this;
        }

        /**
         * And forum content not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andForumContentNotIn(List<String> values)
        {
            addCriterion("forum_content not in", values, "forumContent");
            return (Criteria) this;
        }

        /**
         * And forum content between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andForumContentBetween(String value1, String value2)
        {
            addCriterion("forum_content between", value1, value2, "forumContent");
            return (Criteria) this;
        }

        /**
         * And forum content not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andForumContentNotBetween(String value1, String value2)
        {
            addCriterion("forum_content not between", value1, value2, "forumContent");
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