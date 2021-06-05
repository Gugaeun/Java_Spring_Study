package spring.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import spring.Dao.MemberDao;
import spring.empty.Member;
import spring.printer.MemberPrinter;

@Component("infoPrinter")
public class MemberInfoPrinterService {
    private MemberDao memberDao;
    private MemberPrinter printer;

    public void printMemberInfo(String email) {
        Member member = memberDao.selectByEmail(email);
        if(member == null) {
            System.out.println("데이터 없음\n");

            return;
        }
        printer.print(member);
        System.out.println();
    }

    @Autowired
    public void setMemberDao(MemberDao memberDao) {
        this.memberDao = memberDao;
    }
    @Autowired
    public void setMemberPinter(MemberPrinter printer) {
        this.printer = printer;
    }
}
