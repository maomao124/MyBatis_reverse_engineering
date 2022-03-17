package mapper;

import data.Teach;
import data.TeachExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * The interface Teach mapper.
 */
public interface TeachMapper
{
    /**
     * Count by example long.
     *
     * @param example the example
     * @return the long
     */
    long countByExample(TeachExample example);

    /**
     * Delete by example int.
     *
     * @param example the example
     * @return the int
     */
    int deleteByExample(TeachExample example);

    /**
     * Delete by primary key int.
     *
     * @param teachNo the teach no
     * @return the int
     */
    int deleteByPrimaryKey(Long teachNo);

    /**
     * Insert int.
     *
     * @param row the row
     * @return the int
     */
    int insert(Teach row);

    /**
     * Insert selective int.
     *
     * @param row the row
     * @return the int
     */
    int insertSelective(Teach row);

    /**
     * Select by example list.
     *
     * @param example the example
     * @return the list
     */
    List<Teach> selectByExample(TeachExample example);

    /**
     * Select by primary key teach.
     *
     * @param teachNo the teach no
     * @return the teach
     */
    Teach selectByPrimaryKey(Long teachNo);

    /**
     * Update by example selective int.
     *
     * @param row     the row
     * @param example the example
     * @return the int
     */
    int updateByExampleSelective(@Param("row") Teach row, @Param("example") TeachExample example);

    /**
     * Update by example int.
     *
     * @param row     the row
     * @param example the example
     * @return the int
     */
    int updateByExample(@Param("row") Teach row, @Param("example") TeachExample example);

    /**
     * Update by primary key selective int.
     *
     * @param row the row
     * @return the int
     */
    int updateByPrimaryKeySelective(Teach row);

    /**
     * Update by primary key int.
     *
     * @param row the row
     * @return the int
     */
    int updateByPrimaryKey(Teach row);
}