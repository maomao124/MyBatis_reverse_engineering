package mapper;

import data.Course;
import data.CourseExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * The interface Course mapper.
 */
public interface CourseMapper
{
    /**
     * Count by example long.
     *
     * @param example the example
     * @return the long
     */
    long countByExample(CourseExample example);

    /**
     * Delete by example int.
     *
     * @param example the example
     * @return the int
     */
    int deleteByExample(CourseExample example);

    /**
     * Insert int.
     *
     * @param row the row
     * @return the int
     */
    int insert(Course row);

    /**
     * Insert selective int.
     *
     * @param row the row
     * @return the int
     */
    int insertSelective(Course row);

    /**
     * Select by example list.
     *
     * @param example the example
     * @return the list
     */
    List<Course> selectByExample(CourseExample example);

    /**
     * Update by example selective int.
     *
     * @param row     the row
     * @param example the example
     * @return the int
     */
    int updateByExampleSelective(@Param("row") Course row, @Param("example") CourseExample example);

    /**
     * Update by example int.
     *
     * @param row     the row
     * @param example the example
     * @return the int
     */
    int updateByExample(@Param("row") Course row, @Param("example") CourseExample example);
}