package mapper;

import data.News;
import data.NewsExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * The interface News mapper.
 */
public interface NewsMapper
{
    /**
     * Count by example long.
     *
     * @param example the example
     * @return the long
     */
    long countByExample(NewsExample example);

    /**
     * Delete by example int.
     *
     * @param example the example
     * @return the int
     */
    int deleteByExample(NewsExample example);

    /**
     * Delete by primary key int.
     *
     * @param newNo the new no
     * @return the int
     */
    int deleteByPrimaryKey(Long newNo);

    /**
     * Insert int.
     *
     * @param row the row
     * @return the int
     */
    int insert(News row);

    /**
     * Insert selective int.
     *
     * @param row the row
     * @return the int
     */
    int insertSelective(News row);

    /**
     * Select by example with blo bs list.
     *
     * @param example the example
     * @return the list
     */
    List<News> selectByExampleWithBLOBs(NewsExample example);

    /**
     * Select by example list.
     *
     * @param example the example
     * @return the list
     */
    List<News> selectByExample(NewsExample example);

    /**
     * Select by primary key news.
     *
     * @param newNo the new no
     * @return the news
     */
    News selectByPrimaryKey(Long newNo);

    /**
     * Update by example selective int.
     *
     * @param row     the row
     * @param example the example
     * @return the int
     */
    int updateByExampleSelective(@Param("row") News row, @Param("example") NewsExample example);

    /**
     * Update by example with blo bs int.
     *
     * @param row     the row
     * @param example the example
     * @return the int
     */
    int updateByExampleWithBLOBs(@Param("row") News row, @Param("example") NewsExample example);

    /**
     * Update by example int.
     *
     * @param row     the row
     * @param example the example
     * @return the int
     */
    int updateByExample(@Param("row") News row, @Param("example") NewsExample example);

    /**
     * Update by primary key selective int.
     *
     * @param row the row
     * @return the int
     */
    int updateByPrimaryKeySelective(News row);

    /**
     * Update by primary key with blo bs int.
     *
     * @param row the row
     * @return the int
     */
    int updateByPrimaryKeyWithBLOBs(News row);

    /**
     * Update by primary key int.
     *
     * @param row the row
     * @return the int
     */
    int updateByPrimaryKey(News row);
}