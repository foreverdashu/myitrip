package cn.itrip.dao;

import cn.itrip.beans.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    /**
     * 根据参数分页查询用户
     * @param params
     * @return
     */
    List<User> getUsers(Map<String,Object> params);

    int getUsersCount(Map<String,Object> params);
}
