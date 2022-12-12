# jdbc
jdbc 관련 학습

### class 역할
MemberRepositoryV0
* JDBC - DriverManager 사용

MemberServiceV1
* formId의 회원을 조회해서 toId의 회원에게 money 만큼의 돈을 계좌이체하는 로직이다.

MemberServiceV2
* 트랜잭션 - 파라미터 연동, 풀을 고려한 종료

MemberRepositoryV1
* JDBC - DataSource 사용, JdbcUtils 사용

MemberRepositoryV1
* JDBC - DataSource 사용, JdbcUtils 사용
* Connection con 매개변수 추가

MemberRepositoryV3
* 트랜잭션 매니저
 * DataSourceUtils.getConnection()

### test class 역할
MemberRepositoryV0Test
* JDBC DriverManager 추가, 조회, 수정, 삭제 테스트

MemberRepositoryV1Test
* DriverManagerDataSource, HikariDataSource 테스트

ConnectionTest
* 커넥션 연결 테스트
  * driverManager
  * DriverManagerDataSource
  * HikariDataSource

MemberServiceV1Test
* 정상 이체 test
* 이체중 예외 발생 test

MemberServiceV2Test
* 트랜잭션 - 커넥션 파라미터 전달 방식 동기화
* 정상 이체 test
* 이체중 예외 발생 test
  * 롤백 처리 기능 추가

MemberServiceV3_1Test
* 트랜잭션 - 트랜잭션 매니저 사용 (파라미터 제거)
* 정상 이체 test
* 이체중 예외 발생 test
  * 롤백 처리 기능 추가

MemberServiceV3_2Test
* 트랜잭션 - 트랜잭션 템플릿 콜백패턴 사용 (반복코드 제거)
* 정상 이체 test
* 이체중 예외 발생 test
  * 롤백 처리 기능 추가

MemberServiceV3_3Test
* 트랜잭션 - @Transactional AOP
* AOP 체크
* 정상 이체 test
* 이체중 예외 발생 test
  * 롤백 처리 기능 추가

MemberServiceV3_3Test
* 트랜잭션 - DataSource, transactionManager 자동 등록
  * application.properties 에서 등록
* AOP 체크
* 정상 이체 test
* 이체중 예외 발생 test
  * 롤백 처리 기능 추가

CheckedTest
* Exception을 상속받은 예외는 체크 예외가 된다.

UnCheckedTest
* RuntimeException을 상속받은 예외는 언체크 예외가 된다.