package spring;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

// DAO : Data Access Object -> Repository
public class MemberDao {
    private static long nextId = 0;
    private Map<String, Member> map_base_email = new HashMap<>();
   // private Map<Long, Member> map_base_id = new HashMap<>();

    /**
     * 회원 조회(단건)
     */
    public Member selectByEmail(String email) {
        return map_base_email.get(email);
    }

    /** 회원 등록 목적 */
    public void insert(Member member) {
        // 회원 번호
        member.setId(++nextId);

        map_base_email.put(member.getEmail(), member);
     //   map_base_id.put(member.getId(), member);

    }

    /**
     * 회원 수정(단건)
     */
    public void update(Member member) {
        map_base_email.put(member.getEmail(), member);
    }

    public Collection<Member> selectAll() {
        return map_base_email.values();
    }

}
