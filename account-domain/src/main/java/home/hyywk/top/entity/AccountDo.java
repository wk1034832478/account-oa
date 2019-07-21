package home.hyywk.top.entity;

import home.hyywk.top.Domain;

/**
 * 账户信息表，存储用户的账户信息，密码使用MD5进行加密
 * @author 王凯
 * @createdDate 2019/7/18 0018-23:57
 */
public class AccountDo extends Domain {
    private Long id;
    private String username;
    private String password;
    private String name;
    private String createdDate;
    private String platform; // 平台名称
    private short canUse;

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public short getCanUse() {
        return canUse;
    }

    public void setCanUse(short canUse) {
        this.canUse = canUse;
    }

    @Override
    public String toString() {
        return "隐藏数据";
    }
}
