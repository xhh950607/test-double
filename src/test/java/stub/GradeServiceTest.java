package stub;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.mockito.Mockito.*;

public class GradeServiceTest {
    /* 需求描述：
    编写GradeService类的单元测试，单元测试calculateAverageGrades方法
    * */

    @Test
    public void shouldReturn90WhenCalculateStudentAverageGradeAndGradeIs80And90And100() {
        GradeSystem mockedGradeSystem = mock(GradeSystem.class);
        when(mockedGradeSystem.gradesFor(1)).thenReturn(Arrays.asList(80.0,90.0,100.0));
        GradeService gradeService = new GradeService(mockedGradeSystem);
        double result = gradeService.calculateAverageGrades(1);
        Assertions.assertEquals(90.0, result);
    }
}
