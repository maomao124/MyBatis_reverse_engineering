package mapper;

import data.Administrators;
import data.AdministratorsExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * The interface Administrators mapper.
 */
public interface AdministratorsMapper
{
    /**
     * Count by example long.
     *
     * @param example the example
     * @return the long
     */
    long countByExample(AdministratorsExample example);

    /**
     * Delete by example int.
     *
     * @param example the example
     * @return the int
     */
    int deleteByExample(AdministratorsExample example);

    /**
     * Delete by primary key int.
     *
     * @param administratorNo the administrator no
     * @return the int
     */
    int deleteByPrimaryKey(Long administratorNo);

    /**
     * Insert int.
     *
     * @param row the row
     * @return the int
     */
    int insert(Administrators row);

    /**
     * Insert selective int.
     *
     * @param row the row
     * @return the int
     */
    int insertSelective(Administrators row);

    /**
     * Select by example list.
     *
     * @param example the example
     * @return the list
     */
    List<Administrators> selectByExample(AdministratorsExample example);

    /**
     * Select by primary key administrators.
     *
     * @param administratorNo the administrator no
     * @return the administrators
     */
    Administrators selectByPrimaryKey(Long administratorNo);

    /**
     * Update by example selective int.
     *
     * @param row     the row
     * @param example the example
     * @return the int
     */
    int updateByExampleSelective(@Param("row") Administrators row, @Param("example") AdministratorsExample example);

    /**
     * Update by example int.
     *
     * @param row     the row
     * @param example the example
     * @return the int
     */
    int updateByExample(@Param("row") Administrators row, @Param("example") AdministratorsExample example);

    /**
     * Update by primary key selective int.
     *
     * @param row the row
     * @return the int
     */
    int updateByPrimaryKeySelective(Administrators row);

    /**
     * Update by primary key int.
     *
     * @param row the row
     * @return the int
     */
    int updateByPrimaryKey(Administrators row);
}