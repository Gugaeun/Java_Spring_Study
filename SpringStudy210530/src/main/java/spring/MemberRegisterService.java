package spring;

import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;

public class MemberRegisterService {
    @Autowired
    private MemberDao memberDao;

    public MemberRegisterService() { }

    public MemberRegisterService(MemberDao memberDao) {
        this.memberDao = memberDao;
    }

    public void register(RegisterRequest req) {

        // 회원 등록
        Member newMember = new Member(
                req.getEmail(), req.getPassword(), req.getName(),
                LocalDateTime.now());

        memberDao.insert(newMember);
    }
}
