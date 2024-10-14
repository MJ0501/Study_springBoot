import org.junit.jupiter.api.*;

public class JUnitCycleTest {
    @BeforeAll
    static void beforeAll(){
        System.out.println("@BeforeAll:전체 테스트 시작 전 1회만 실행");
    }
    @BeforeEach
    public void beforeEach(){
        System.out.println("@BeforeEach:테스트케이스 시작 전마다");
    }
    @Test
    public void test1(){
        System.out.println("t1");
    }
    @Test
    public void test2(){
        System.out.println("t2");
    }
    @AfterAll
    static void afterAll(){
        System.out.println("@AfterAll:테스트 마치고 종료전 딱 1회만");
    }
    @AfterEach
    public void afterEach(){
        System.out.println("@AfterEach:테스트케이스 종료하기 전마다");
    }
}
