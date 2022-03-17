package mapper;

import data.Teacher;
import data.TeacherExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * The interface Teacher mapper.
 */
public interface TeacherMapper
{
    /**
     * Count by example long.
     *
     * @param example the example
     * @return the long
     */
    long countByExample(TeacherExample example);

    /**
     * Delete by example int.
     *
     * @param example the example
     * @return the int
     */
    int deleteByExample(TeacherExample example);

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
    int insert(Teacher row);

    /**
     * Insert selective int.
     *
     * @param row the row
     * @return the int
     */
    int insertSelective(Teacher row);

    /**
     * Select by example list.
     *
     * @param example the example
     * @return the list
     */
    List<Teacher> selectByExample(TeacherExample example);

    /**
     * Select by primary key teacher.
     *
     * @param teacherNo the teacher no
     * @return the teacher
     */
    Teacher selectByPrimaryKey(Long teacherNo);

    /**
     * Update by example selective int.
     *
     * @param row     the row
     * @param example the example
     * @return the int
     */
    int updateByExampleSelective(@Param("row") Teacher row, @Param("example") TeacherExample example);

    /**
     * Update by example int.
     *
     * @param row     the row
     * @param example the example
     * @return the int
     */
    int updateByExample(@Param("row") Teacher row, @Param("example") TeacherExample example);

    /**
     * Update by primary key selective int.
     *
     * @param row the row
     * @return the int
     */
    int updateByPrimaryKeySelective(Teacher row);

    /**
     * Update by primary key int.
     *
     * @param row the row
     * @return the int
     */
    int updateByPrimaryKey(Teacher row);
}