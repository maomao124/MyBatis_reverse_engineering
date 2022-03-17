package mapper;

import data.StudentPassword;
import data.StudentPasswordExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * The interface Student password mapper.
 */
public interface StudentPasswordMapper
{
    /**
     * Count by example long.
     *
     * @param example the example
     * @return the long
     */
    long countByExample(StudentPasswordExample example);

    /**
     * Delete by example int.
     *
     * @param example the example
     * @return the int
     */
    int deleteByExample(StudentPasswordExample example);

    /**
     * Insert int.
     *
     * @param row the row
     * @return the int
     */
    int insert(StudentPassword row);

    /**
     * Insert selective int.
     *
     * @param row the row
     * @return the int
     */
    int insertSelective(StudentPassword row);

    /**
     * Select by example list.
     *
     * @param example the example
     * @return the list
     */
    List<StudentPassword> selectByExample(StudentPasswordExample example);

    /**
     * Update by example selective int.
     *
     * @param row     the row
     * @param example the example
     * @return the int
     */
    int updateByExampleSelective(@Param("row") StudentPassword row, @Param("example") StudentPasswordExample example);

    /**
     * Update by example int.
     *
     * @param row     the row
     * @param example the example
     * @return the int
     */
    int updateByExample(@Param("row") StudentPassword row, @Param("example") StudentPasswordExample example);
}