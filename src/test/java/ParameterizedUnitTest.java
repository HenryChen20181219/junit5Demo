import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

public class ParameterizedUnitTest {
    @ParameterizedTest
//    @NullAndEmptySource
    @ValueSource(ints = {2, 4, 9, 8})
    void testNumberShouldBeEven(int num) {
        if (1 == 1) System.out.println("hell");
//        if (2l.equals(2)) System.out.println("ahhhh");
        Assertions.assertEquals(0, num % 2);
    }

    @ParameterizedTest
    @ValueSource(strings = {"Effective Java", "Code Complete", "Clean Code"})
    void testPrintTitle(String title) {
        System.out.println(title);
    }

    @ParameterizedTest

    @CsvSource({"1,One,1",
            "0,,1",
            "3,Three,2"})
//    @CsvFileSource() 指定的资源文件路径时要以 / 开始，寻找当前测试资源目录下文件
    void testDataFromCsv(long id, String name,String age) {
        if (null!=name) {
            System.out.printf("id: %d, name: %s", id, name);
        }
    }
}
