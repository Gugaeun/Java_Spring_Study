package spring.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import spring.Dao.MemberDao;
import spring.empty.Member;
import spring.printer.MemberPrinter;
import spring.printer.MemberSummaryPrinter;

import java.util.Collection;

@Component("listPrinter")
public class MemberListPrinterService {
    private MemberDao memberDao;
    private MemberPrinter printer;

    public MemberListPrinterService(MemberDao memberDao, MemberPrinter printer) {
        this.memberDao = memberDao;
        this.printer = printer;
    }

    public void printAll() {
        Collection<Member> members = memberDao.selectAll();
        members.forEach(m -> printer.print(m));
        System.out.println();
    }

    @Autowired
    public void setMemberDao(MemberDao memberDao) {
        this.memberDao = memberDao;
    }
    @Autowired
    @Qualifier("summaryPrinter")
    public void setMemberPrinter(MemberSummaryPrinter printer) {
        this.printer = printer;         //MemberSummary 객체 주입
    }
}
