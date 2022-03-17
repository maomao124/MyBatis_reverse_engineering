package mapper;

import data.Score;
import data.ScoreExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * The interface Score mapper.
 */
public interface ScoreMapper
{
    /**
     * Count by example long.
     *
     * @param example the example
     * @return the long
     */
    long countByExample(ScoreExample example);

    /**
     * Delete by example int.
     *
     * @param example the example
     * @return the int
     */
    int deleteByExample(ScoreExample example);

    /**
     * Insert int.
     *
     * @param row the row
     * @return the int
     */
    int insert(Score row);

    /**
     * Insert selective int.
     *
     * @param row the row
     * @return the int
     */
    int insertSelective(Score row);

    /**
     * Select by example list.
     *
     * @param example the example
     * @return the list
     */
    List<Score> selectByExample(ScoreExample example);

    /**
     * Update by example selective int.
     *
     * @param row     the row
     * @param example the example
     * @return the int
     */
    int updateByExampleSelective(@Param("row") Score row, @Param("example") ScoreExample example);

    /**
     * Update by example int.
     *
     * @param row     the row
     * @param example the example
     * @return the int
     */
    int updateByExample(@Param("row") Score row, @Param("example") ScoreExample example);
}