package com.bean;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "tb_user", schema = "framework-learning", catalog = "")
public class TbUser {
    private int id;
    private String username;
    private String nickname;
    private String password;
    private Boolean sex;
    private Integer age;
    private String email;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "username", nullable = false, length = 32)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "nickname", nullable = true, length = 32)
    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Basic
    @Column(name = "password", nullable = false, length = 32)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "sex", nullable = true)
    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    @Basic
    @Column(name = "age", nullable = true)
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Basic
    @Column(name = "email", nullable = true, length = 64)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TbUser tbUser = (TbUser) o;
        return id == tbUser.id &&
                Objects.equals(username, tbUser.username) &&
                Objects.equals(nickname, tbUser.nickname) &&
                Objects.equals(password, tbUser.password) &&
                Objects.equals(sex, tbUser.sex) &&
                Objects.equals(age, tbUser.age) &&
                Objects.equals(email, tbUser.email);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, username, nickname, password, sex, age, email);
    }
}
