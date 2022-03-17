package mapper;

import data.AdministratorsPassword;
import data.AdministratorsPasswordExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * The interface Administrators password mapper.
 */
public interface AdministratorsPasswordMapper
{
    /**
     * Count by example long.
     *
     * @param example the example
     * @return the long
     */
    long countByExample(AdministratorsPasswordExample example);

    /**
     * Delete by example int.
     *
     * @param example the example
     * @return the int
     */
    int deleteByExample(AdministratorsPasswordExample example);

    /**
     * Insert int.
     *
     * @param row the row
     * @return the int
     */
    int insert(AdministratorsPassword row);

    /**
     * Insert selective int.
     *
     * @param row the row
     * @return the int
     */
    int insertSelective(AdministratorsPassword row);

    /**
     * Select by example list.
     *
     * @param example the example
     * @return the list
     */
    List<AdministratorsPassword> selectByExample(AdministratorsPasswordExample example);

    /**
     * Update by example selective int.
     *
     * @param row     the row
     * @param example the example
     * @return the int
     */
    int updateByExampleSelective(@Param("row") AdministratorsPassword row, @Param("example") AdministratorsPasswordExample example);

    /**
     * Update by example int.
     *
     * @param row     the row
     * @param example the example
     * @return the int
     */
    int updateByExample(@Param("row") AdministratorsPassword row, @Param("example") AdministratorsPasswordExample example);
}