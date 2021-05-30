package spring;

public class MemberInfoPrinter {
    private MemberDao memberDao;
    private MemberPrinter printer;

    public void printMemberInfo(String email) {
        Member member = memberDao.selectByEmail(email);
        if(member == null) {
            System.out.println("데이터 없음");

            return;
        }

        printer.print(member);
        System.out.println();
    }

    //의존 주입을 위한 setter 메서드

    public void setMemberDao(MemberDao memberDao) {
        this.memberDao = memberDao;
    }

    public void setPrinter(MemberPrinter memberPrinter) {
        this.printer = printer;
    }
}
