package home.hyywk.top.entity;

import java.util.Date;

/**
 * @Author 王凯
 * @Created 2019/7/18 0018-23:57
 */
public class AccountDomain implements java.io.Serializable {
    private Long id;
    private String username;
    private String password;
    private String name;
    private Date createdDate;
    private short canUse;

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

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
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
