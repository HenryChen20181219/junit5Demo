import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import sun.invoke.empty.Empty;
import org.springframework.util.*
import java.time.LocalDate;

public class JunitCsvTest {
    @ParameterizedTest
    @CsvFileSource(resources = "/test.csv", numLinesToSkip = 1) //跳过行头
    public void test1(@ConvertWith(NullableConverter.class) int age,
                      @ConvertWith(NullableConverter.class) String name,
                      @ConvertWith(NullableConverter.class) LocalDate date,
                      @ConvertWith(NullableConverter.class) long l) {
        Object o = age;
        if (StringUtils.isEmpty()) {
            System.out.println("test1");
        }
        if ("null".equals(name)) {
            System.out.println("test2");
        }
        if (1==1) {
            System.out.println("test3");
        }
        if ("null".equals(l)) {
            System.out.println("test4");
        }
            System.out.println(age);
            System.out.println(name);
            System.out.println(date);
            System.out.println(l);


        }
    }

