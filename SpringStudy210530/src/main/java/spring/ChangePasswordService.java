package spring;

import org.springframework.beans.factory.annotation.Autowired;

public class ChangePasswordService {
    @Autowired
    private MemberDao memberDao;

    public ChangePasswordService() { }

//    public ChangePasswordService(MemberDao memberDao) {
//        this.memberDao = memberDao;
//    }

    public void changePassword(String email, String oldPwd, String newPwd) {
        Member member = memberDao.selectByEmail(email);

        memberDao.update(member);
    }

    public void setMemberDao(MemberDao memberDao) {
        this.memberDao = memberDao;
    }
}
