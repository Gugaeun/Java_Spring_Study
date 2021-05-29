package spring;

import Reception.WrongIdPasswordException;

import java.lang.invoke.WrongMethodTypeException;
import java.time.LocalDateTime;

/*
    회원 정보 Entity(DB)
 */
public class Member {
    private Long id;                            //회원 정보
    private String email;                       // 회원이 가지는 이메일
    private String password;                    //비밀번호(고객 입력)
    private String name;                        //회원 이름
    private LocalDateTime registerDateTime;     // 가입 날짜


    public Member(String email, String name, String password, LocalDateTime confirmPassword) {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public LocalDateTime getRegisterDateTime() {
        return registerDateTime;
    }

    public void setRegisterDateTime(LocalDateTime registerDateTime) {
        this.registerDateTime = registerDateTime;
    }

    // 암호 변경 기능을 구현
    public void changePassword(String oldPassword, String newPassword) {
        if(!password.equals(oldPassword))
            throw new WrongIdPasswordException();

        this.password = newPassword;
    }
}
