package spring.Service;

import exception.MemberNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import spring.empty.Member;
import spring.Dao.MemberDao;

public class ChangePasswordService {
    @Autowired
    private MemberDao memberDao;

    public ChangePasswordService() { }

//    public ChangePasswordService(MemberDao memberDao) {
//        this.memberDao = memberDao;
//    }

    public void changePassword(String email, String oldPwd, String newPwd) {
        Member member = memberDao.selectByEmail(email);
        if (member == null)
            throw new MemberNotFoundException();

        member.changePassword(oldPwd, newPwd);
        memberDao.update(member);
    }

    public void setMemberDao(MemberDao memberDao) {
        this.memberDao = memberDao;
    }
}
