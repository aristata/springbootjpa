package kr.co.aristatait.springbootjpa1;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository
public class MemberRepository {

    @PersistenceContext
    private EntityManager em;

    public Long save(Member member) {
        em.persist(member);

        // Id 만 반환하는 이유
        // 커맨드와 쿼리를 구분하기 위함
        return member.getId();
    }

    public Member find(Long id) {
        return em.find(Member.class, id);
    }
}
