package mapper;

import data.Class;
import data.ClassExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * The interface Class mapper.
 */
public interface ClassMapper
{
    /**
     * Count by example long.
     *
     * @param example the example
     * @return the long
     */
    long countByExample(ClassExample example);

    /**
     * Delete by example int.
     *
     * @param example the example
     * @return the int
     */
    int deleteByExample(ClassExample example);

    /**
     * Delete by primary key int.
     *
     * @param classNo the class no
     * @return the int
     */
    int deleteByPrimaryKey(Long classNo);

    /**
     * Insert int.
     *
     * @param row the row
     * @return the int
     */
    int insert(Class row);

    /**
     * Insert selective int.
     *
     * @param row the row
     * @return the int
     */
    int insertSelective(Class row);

    /**
     * Select by example list.
     *
     * @param example the example
     * @return the list
     */
    List<Class> selectByExample(ClassExample example);

    /**
     * Select by primary key class.
     *
     * @param classNo the class no
     * @return the class
     */
    Class selectByPrimaryKey(Long classNo);

    /**
     * Update by example selective int.
     *
     * @param row     the row
     * @param example the example
     * @return the int
     */
    int updateByExampleSelective(@Param("row") Class row, @Param("example") ClassExample example);

    /**
     * Update by example int.
     *
     * @param row     the row
     * @param example the example
     * @return the int
     */
    int updateByExample(@Param("row") Class row, @Param("example") ClassExample example);

    /**
     * Update by primary key selective int.
     *
     * @param row the row
     * @return the int
     */
    int updateByPrimaryKeySelective(Class row);

    /**
     * Update by primary key int.
     *
     * @param row the row
     * @return the int
     */
    int updateByPrimaryKey(Class row);
}