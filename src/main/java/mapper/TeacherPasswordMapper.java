package mapper;

import data.TeacherPassword;
import data.TeacherPasswordExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * The interface Teacher password mapper.
 */
public interface TeacherPasswordMapper
{
    /**
     * Count by example long.
     *
     * @param example the example
     * @return the long
     */
    long countByExample(TeacherPasswordExample example);

    /**
     * Delete by example int.
     *
     * @param example the example
     * @return the int
     */
    int deleteByExample(TeacherPasswordExample example);

    /**
     * Delete by primary key int.
     *
     * @param teacherNo the teacher no
     * @return the int
     */
    int deleteByPrimaryKey(Long teacherNo);

    /**
     * Insert int.
     *
     * @param row the row
     * @return the int
     */
    int insert(TeacherPassword row);

    /**
     * Insert selective int.
     *
     * @param row the row
     * @return the int
     */
    int insertSelective(TeacherPassword row);

    /**
     * Select by example list.
     *
     * @param example the example
     * @return the list
     */
    List<TeacherPassword> selectByExample(TeacherPasswordExample example);

    /**
     * Select by primary key teacher password.
     *
     * @param teacherNo the teacher no
     * @return the teacher password
     */
    TeacherPassword selectByPrimaryKey(Long teacherNo);

    /**
     * Update by example selective int.
     *
     * @param row     the row
     * @param example the example
     * @return the int
     */
    int updateByExampleSelective(@Param("row") TeacherPassword row, @Param("example") TeacherPasswordExample example);

    /**
     * Update by example int.
     *
     * @param row     the row
     * @param example the example
     * @return the int
     */
    int updateByExample(@Param("row") TeacherPassword row, @Param("example") TeacherPasswordExample example);

    /**
     * Update by primary key selective int.
     *
     * @param row the row
     * @return the int
     */
    int updateByPrimaryKeySelective(TeacherPassword row);

    /**
     * Update by primary key int.
     *
     * @param row the row
     * @return the int
     */
    int updateByPrimaryKey(TeacherPassword row);
}