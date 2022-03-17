package mapper;

import data.Forum;
import data.ForumExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * The interface Forum mapper.
 */
public interface ForumMapper
{
    /**
     * Count by example long.
     *
     * @param example the example
     * @return the long
     */
    long countByExample(ForumExample example);

    /**
     * Delete by example int.
     *
     * @param example the example
     * @return the int
     */
    int deleteByExample(ForumExample example);

    /**
     * Delete by primary key int.
     *
     * @param forumNo the forum no
     * @return the int
     */
    int deleteByPrimaryKey(Long forumNo);

    /**
     * Insert int.
     *
     * @param row the row
     * @return the int
     */
    int insert(Forum row);

    /**
     * Insert selective int.
     *
     * @param row the row
     * @return the int
     */
    int insertSelective(Forum row);

    /**
     * Select by example list.
     *
     * @param example the example
     * @return the list
     */
    List<Forum> selectByExample(ForumExample example);

    /**
     * Select by primary key forum.
     *
     * @param forumNo the forum no
     * @return the forum
     */
    Forum selectByPrimaryKey(Long forumNo);

    /**
     * Update by example selective int.
     *
     * @param row     the row
     * @param example the example
     * @return the int
     */
    int updateByExampleSelective(@Param("row") Forum row, @Param("example") ForumExample example);

    /**
     * Update by example int.
     *
     * @param row     the row
     * @param example the example
     * @return the int
     */
    int updateByExample(@Param("row") Forum row, @Param("example") ForumExample example);

    /**
     * Update by primary key selective int.
     *
     * @param row the row
     * @return the int
     */
    int updateByPrimaryKeySelective(Forum row);

    /**
     * Update by primary key int.
     *
     * @param row the row
     * @return the int
     */
    int updateByPrimaryKey(Forum row);
}