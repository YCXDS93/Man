package com.hc.manbuy.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;

/**
 * 实体必须具有 long或 Long属性作为其主键。这是Android和SQLite的推荐做法
 */
@Entity
public class User {
    @Id(autoincrement = true)//id自增长
    private  long  id;
    @Generated
    private String name;
    @Generated
    private String powsword;
    @Generated(hash = 1976474591)
    public User(long id, String name, String powsword) {
        this.id = id;
        this.name = name;
        this.powsword = powsword;
    }
    @Generated(hash = 586692638)
    public User() {
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPowsword() {
        return powsword;
    }

    public void setPowsword(String powsword) {
        this.powsword = powsword;
    }
}