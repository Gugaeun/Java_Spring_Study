package spring.printer;

import org.springframework.beans.factory.annotation.Autowired;
import spring.helper.MemberPrinter;

public class MemberInfoPrinter2 {
    @Autowired
    private MemberPrinter printer;

}
