package data;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Score example.
 */
public class ScoreExample
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
     * Instantiates a new Score example.
     */
    public ScoreExample()
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
         * And usual score is null criteria.
         *
         * @return the criteria
         */
        public Criteria andUsualScoreIsNull()
        {
            addCriterion("usual_score is null");
            return (Criteria) this;
        }

        /**
         * And usual score is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andUsualScoreIsNotNull()
        {
            addCriterion("usual_score is not null");
            return (Criteria) this;
        }

        /**
         * And usual score equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andUsualScoreEqualTo(Float value)
        {
            addCriterion("usual_score =", value, "usualScore");
            return (Criteria) this;
        }

        /**
         * And usual score not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andUsualScoreNotEqualTo(Float value)
        {
            addCriterion("usual_score <>", value, "usualScore");
            return (Criteria) this;
        }

        /**
         * And usual score greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andUsualScoreGreaterThan(Float value)
        {
            addCriterion("usual_score >", value, "usualScore");
            return (Criteria) this;
        }

        /**
         * And usual score greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andUsualScoreGreaterThanOrEqualTo(Float value)
        {
            addCriterion("usual_score >=", value, "usualScore");
            return (Criteria) this;
        }

        /**
         * And usual score less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andUsualScoreLessThan(Float value)
        {
            addCriterion("usual_score <", value, "usualScore");
            return (Criteria) this;
        }

        /**
         * And usual score less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andUsualScoreLessThanOrEqualTo(Float value)
        {
            addCriterion("usual_score <=", value, "usualScore");
            return (Criteria) this;
        }

        /**
         * And usual score in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andUsualScoreIn(List<Float> values)
        {
            addCriterion("usual_score in", values, "usualScore");
            return (Criteria) this;
        }

        /**
         * And usual score not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andUsualScoreNotIn(List<Float> values)
        {
            addCriterion("usual_score not in", values, "usualScore");
            return (Criteria) this;
        }

        /**
         * And usual score between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andUsualScoreBetween(Float value1, Float value2)
        {
            addCriterion("usual_score between", value1, value2, "usualScore");
            return (Criteria) this;
        }

        /**
         * And usual score not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andUsualScoreNotBetween(Float value1, Float value2)
        {
            addCriterion("usual_score not between", value1, value2, "usualScore");
            return (Criteria) this;
        }

        /**
         * And end score is null criteria.
         *
         * @return the criteria
         */
        public Criteria andEndScoreIsNull()
        {
            addCriterion("end_score is null");
            return (Criteria) this;
        }

        /**
         * And end score is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andEndScoreIsNotNull()
        {
            addCriterion("end_score is not null");
            return (Criteria) this;
        }

        /**
         * And end score equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andEndScoreEqualTo(Float value)
        {
            addCriterion("end_score =", value, "endScore");
            return (Criteria) this;
        }

        /**
         * And end score not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andEndScoreNotEqualTo(Float value)
        {
            addCriterion("end_score <>", value, "endScore");
            return (Criteria) this;
        }

        /**
         * And end score greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andEndScoreGreaterThan(Float value)
        {
            addCriterion("end_score >", value, "endScore");
            return (Criteria) this;
        }

        /**
         * And end score greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andEndScoreGreaterThanOrEqualTo(Float value)
        {
            addCriterion("end_score >=", value, "endScore");
            return (Criteria) this;
        }

        /**
         * And end score less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andEndScoreLessThan(Float value)
        {
            addCriterion("end_score <", value, "endScore");
            return (Criteria) this;
        }

        /**
         * And end score less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andEndScoreLessThanOrEqualTo(Float value)
        {
            addCriterion("end_score <=", value, "endScore");
            return (Criteria) this;
        }

        /**
         * And end score in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andEndScoreIn(List<Float> values)
        {
            addCriterion("end_score in", values, "endScore");
            return (Criteria) this;
        }

        /**
         * And end score not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andEndScoreNotIn(List<Float> values)
        {
            addCriterion("end_score not in", values, "endScore");
            return (Criteria) this;
        }

        /**
         * And end score between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andEndScoreBetween(Float value1, Float value2)
        {
            addCriterion("end_score between", value1, value2, "endScore");
            return (Criteria) this;
        }

        /**
         * And end score not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andEndScoreNotBetween(Float value1, Float value2)
        {
            addCriterion("end_score not between", value1, value2, "endScore");
            return (Criteria) this;
        }

        /**
         * And final score is null criteria.
         *
         * @return the criteria
         */
        public Criteria andFinalScoreIsNull()
        {
            addCriterion("final_score is null");
            return (Criteria) this;
        }

        /**
         * And final score is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andFinalScoreIsNotNull()
        {
            addCriterion("final_score is not null");
            return (Criteria) this;
        }

        /**
         * And final score equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andFinalScoreEqualTo(Float value)
        {
            addCriterion("final_score =", value, "finalScore");
            return (Criteria) this;
        }

        /**
         * And final score not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andFinalScoreNotEqualTo(Float value)
        {
            addCriterion("final_score <>", value, "finalScore");
            return (Criteria) this;
        }

        /**
         * And final score greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andFinalScoreGreaterThan(Float value)
        {
            addCriterion("final_score >", value, "finalScore");
            return (Criteria) this;
        }

        /**
         * And final score greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andFinalScoreGreaterThanOrEqualTo(Float value)
        {
            addCriterion("final_score >=", value, "finalScore");
            return (Criteria) this;
        }

        /**
         * And final score less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andFinalScoreLessThan(Float value)
        {
            addCriterion("final_score <", value, "finalScore");
            return (Criteria) this;
        }

        /**
         * And final score less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andFinalScoreLessThanOrEqualTo(Float value)
        {
            addCriterion("final_score <=", value, "finalScore");
            return (Criteria) this;
        }

        /**
         * And final score in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andFinalScoreIn(List<Float> values)
        {
            addCriterion("final_score in", values, "finalScore");
            return (Criteria) this;
        }

        /**
         * And final score not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andFinalScoreNotIn(List<Float> values)
        {
            addCriterion("final_score not in", values, "finalScore");
            return (Criteria) this;
        }

        /**
         * And final score between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andFinalScoreBetween(Float value1, Float value2)
        {
            addCriterion("final_score between", value1, value2, "finalScore");
            return (Criteria) this;
        }

        /**
         * And final score not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andFinalScoreNotBetween(Float value1, Float value2)
        {
            addCriterion("final_score not between", value1, value2, "finalScore");
            return (Criteria) this;
        }

        /**
         * And grade point is null criteria.
         *
         * @return the criteria
         */
        public Criteria andGradePointIsNull()
        {
            addCriterion("grade_point is null");
            return (Criteria) this;
        }

        /**
         * And grade point is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andGradePointIsNotNull()
        {
            addCriterion("grade_point is not null");
            return (Criteria) this;
        }

        /**
         * And grade point equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andGradePointEqualTo(Float value)
        {
            addCriterion("grade_point =", value, "gradePoint");
            return (Criteria) this;
        }

        /**
         * And grade point not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andGradePointNotEqualTo(Float value)
        {
            addCriterion("grade_point <>", value, "gradePoint");
            return (Criteria) this;
        }

        /**
         * And grade point greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andGradePointGreaterThan(Float value)
        {
            addCriterion("grade_point >", value, "gradePoint");
            return (Criteria) this;
        }

        /**
         * And grade point greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andGradePointGreaterThanOrEqualTo(Float value)
        {
            addCriterion("grade_point >=", value, "gradePoint");
            return (Criteria) this;
        }

        /**
         * And grade point less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andGradePointLessThan(Float value)
        {
            addCriterion("grade_point <", value, "gradePoint");
            return (Criteria) this;
        }

        /**
         * And grade point less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andGradePointLessThanOrEqualTo(Float value)
        {
            addCriterion("grade_point <=", value, "gradePoint");
            return (Criteria) this;
        }

        /**
         * And grade point in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andGradePointIn(List<Float> values)
        {
            addCriterion("grade_point in", values, "gradePoint");
            return (Criteria) this;
        }

        /**
         * And grade point not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andGradePointNotIn(List<Float> values)
        {
            addCriterion("grade_point not in", values, "gradePoint");
            return (Criteria) this;
        }

        /**
         * And grade point between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andGradePointBetween(Float value1, Float value2)
        {
            addCriterion("grade_point between", value1, value2, "gradePoint");
            return (Criteria) this;
        }

        /**
         * And grade point not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andGradePointNotBetween(Float value1, Float value2)
        {
            addCriterion("grade_point not between", value1, value2, "gradePoint");
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