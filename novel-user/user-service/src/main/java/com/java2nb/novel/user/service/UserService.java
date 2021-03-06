package com.java2nb.novel.user.service;


import com.java2nb.novel.common.bean.UserDetails;
import com.java2nb.novel.user.entity.User;
import com.java2nb.novel.user.form.UserForm;

import java.util.List;

/**
 * 用户服务接口
 * @author xiongxiaoyang
 * @version 1.0
 * @since 2020/5/28
 */
public interface UserService {

    /**
     * 根据用户名密码查询记录
     * @param username 用户名
     * @param password 密码
     * @return 用户对象，不存在返回null
     * */
    User queryByUsernameAndPassword(String username, String password);

    /**
     * 用户登陆
     * @param form 用户登陆提交信息类
     * @return jwt载体信息类
     * */
    UserDetails login(UserForm form);


    /**
     * 根据用户名ID集合查询用户集合信息
     * @param ids 用户ID集合
     * @return 用户集合对象
     * */
    List<User> queryById(List<Long> ids);
}
