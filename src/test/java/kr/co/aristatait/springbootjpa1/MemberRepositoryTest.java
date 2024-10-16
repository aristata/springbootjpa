package kr.co.aristatait.springbootjpa1;

import kr.co.aristatait.springbootjpa1.domain.Member;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.transaction.annotation.Transactional;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class MemberRepositoryTest {

    @Autowired MemberRepository memberRepository;
    
    @Test
    @Transactional // 테스트에 있으면 테스트가 끝난다음에 롤백함
    @Rollback(false) // 이렇게 하면 롤백 안됨
    public void testMember() throws Exception {
        //given
        Member member = new Member();
        member.setName("memberA");

        //when
        Long saveId = memberRepository.save(member);
        Member findMember = memberRepository.find(saveId);

        //then
        Assertions.assertEquals(findMember.getId(), member.getId());
        Assertions.assertEquals(findMember.getName(), member.getName());
        Assertions.assertEquals(findMember, member);
        System.out.println("findMember == member: " + (findMember == member));
    }
}