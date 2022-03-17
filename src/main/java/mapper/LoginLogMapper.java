package mapper;

import data.LoginLog;
import data.LoginLogExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * The interface Login log mapper.
 */
public interface LoginLogMapper
{
    /**
     * Count by example long.
     *
     * @param example the example
     * @return the long
     */
    long countByExample(LoginLogExample example);

    /**
     * Delete by example int.
     *
     * @param example the example
     * @return the int
     */
    int deleteByExample(LoginLogExample example);

    /**
     * Delete by primary key int.
     *
     * @param logNo the log no
     * @return the int
     */
    int deleteByPrimaryKey(Long logNo);

    /**
     * Insert int.
     *
     * @param row the row
     * @return the int
     */
    int insert(LoginLog row);

    /**
     * Insert selective int.
     *
     * @param row the row
     * @return the int
     */
    int insertSelective(LoginLog row);

    /**
     * Select by example list.
     *
     * @param example the example
     * @return the list
     */
    List<LoginLog> selectByExample(LoginLogExample example);

    /**
     * Select by primary key login log.
     *
     * @param logNo the log no
     * @return the login log
     */
    LoginLog selectByPrimaryKey(Long logNo);

    /**
     * Update by example selective int.
     *
     * @param row     the row
     * @param example the example
     * @return the int
     */
    int updateByExampleSelective(@Param("row") LoginLog row, @Param("example") LoginLogExample example);

    /**
     * Update by example int.
     *
     * @param row     the row
     * @param example the example
     * @return the int
     */
    int updateByExample(@Param("row") LoginLog row, @Param("example") LoginLogExample example);

    /**
     * Update by primary key selective int.
     *
     * @param row the row
     * @return the int
     */
    int updateByPrimaryKeySelective(LoginLog row);

    /**
     * Update by primary key int.
     *
     * @param row the row
     * @return the int
     */
    int updateByPrimaryKey(LoginLog row);
}