package mapper;

import data.Student;
import data.StudentExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * The interface Student mapper.
 */
public interface StudentMapper
{
    /**
     * Count by example long.
     *
     * @param example the example
     * @return the long
     */
    long countByExample(StudentExample example);

    /**
     * Delete by example int.
     *
     * @param example the example
     * @return the int
     */
    int deleteByExample(StudentExample example);

    /**
     * Delete by primary key int.
     *
     * @param studentNo the student no
     * @return the int
     */
    int deleteByPrimaryKey(Long studentNo);

    /**
     * Insert int.
     *
     * @param row the row
     * @return the int
     */
    int insert(Student row);

    /**
     * Insert selective int.
     *
     * @param row the row
     * @return the int
     */
    int insertSelective(Student row);

    /**
     * Select by example list.
     *
     * @param example the example
     * @return the list
     */
    List<Student> selectByExample(StudentExample example);

    /**
     * Select by primary key student.
     *
     * @param studentNo the student no
     * @return the student
     */
    Student selectByPrimaryKey(Long studentNo);

    /**
     * Update by example selective int.
     *
     * @param row     the row
     * @param example the example
     * @return the int
     */
    int updateByExampleSelective(@Param("row") Student row, @Param("example") StudentExample example);

    /**
     * Update by example int.
     *
     * @param row     the row
     * @param example the example
     * @return the int
     */
    int updateByExample(@Param("row") Student row, @Param("example") StudentExample example);

    /**
     * Update by primary key selective int.
     *
     * @param row the row
     * @return the int
     */
    int updateByPrimaryKeySelective(Student row);

    /**
     * Update by primary key int.
     *
     * @param row the row
     * @return the int
     */
    int updateByPrimaryKey(Student row);
}