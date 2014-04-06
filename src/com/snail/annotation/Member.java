package com.snail.annotation;

/**
 * Uesr : MacSzh2013
 * Date : 14-1-15
 * Time : 下午9:16
 * Description :
 */
@DBTable(name = "MEMBER")
public class Member {
    @SQLString(30)
    String firstName;
    @SQLString(50)
    String lastName;
    @SQLInteger()
    Integer age;
    @SQLString(value = 30 , constraints = @Constraints(primaryKey = true))
    String handle;

    public String getHandle(){
        return handle;
    }

    public String getFirstName() {
        return firstName;
    }

    public Integer getAge() {
        return age;
    }

    public String getLastName() {
        return lastName;
    }
}
