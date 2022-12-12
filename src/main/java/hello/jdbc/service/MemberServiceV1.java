package hello.jdbc.service;

import hello.jdbc.domain.Member;
import hello.jdbc.repository.MemberRepositoryV1;
import lombok.RequiredArgsConstructor;

import java.sql.SQLException;

@RequiredArgsConstructor
public class MemberServiceV1 {

    private final MemberRepositoryV1 memberRepository;

    /**
     * formId의 회원을 조회해서 toId의 회원에게 money 만큼의 돈을 계좌이체하는 로직이다.
     */
    public void accountTransfer(String fromId, String toId, int money) throws SQLException {
        // 시작
        Member fromMember = memberRepository.findById(fromId);
        Member toMember = memberRepository.findById(toId);

        // 계좌이체 fromId 회원의 돈을 money 만큼 감소한다.
        memberRepository.update(fromId, fromMember.getMoney() - money);
        validation(toMember);
        // toId 회원의 돈을 money 만큼 증가한다.
        memberRepository.update(toId, toMember.getMoney() + money);
        // 커밋, 롤백
    }

    private void validation(Member toMember) {
        if (toMember.getMemberId().equals("ex")) {
            throw new IllegalStateException("이체중 예외 발생");
        }
    }
}
