# jdbc
jdbc 관련 학습

### class 역할
MemberRepositoryV0
* JDBC - DriverManager 사용

MemberRepositoryV1
* JDBC - DataSource 사용, JdbcUtils 사용 

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