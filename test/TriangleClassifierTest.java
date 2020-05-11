import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

    @Test
    @DisplayName("Case: sizeA = 3, sizeB = 3, sizeC = 3")
    public void testTriangleClassifier_333() {
        int inputFirstSize = 3;
        int inputSecondSize = 3;
        int inputLastSize = 3;
        String expected = "Equilateral triangle";
        String result = TriangleClassifier.checkTriangleClassifier(inputFirstSize, inputSecondSize, inputLastSize);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Case: sizeA = 3, sizeB = 3, sizeC = 4")
    public void testTriangleClassifier_334() {
        int inputFirstSize = 3;
        int inputSecondSize = 3;
        int inputLastSize = 4;
        String expected = "Isosceles triangle";
        String result = TriangleClassifier.checkTriangleClassifier(inputFirstSize, inputSecondSize, inputLastSize);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Case: sizeA = 3, sizeB = 4, sizeC = 5")
    public void testCheckTriangle(){
        int inputFirstSize = 5;
        int inputSecondSize = 4;
        int inputLastSize = 4;
        boolean expected = true;
        boolean result=TriangleClassifier.checkTriangle(inputFirstSize,inputSecondSize,inputLastSize);
        assertEquals(expected,result);
    }

    @Test
    @DisplayName("Case: sizeA = 5, sizeB = 4, sizeC = 4")
    public void testTriangleClassifier_544() {
        int inputFirstSize = 5;
        int inputSecondSize = 4;
        int inputLastSize = 4;
        String expected = "Isosceles triangle";
        String result = TriangleClassifier.checkTriangleClassifier(inputFirstSize, inputSecondSize, inputLastSize);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Case: sizeA = 3, sizeB = 4, sizeC = 5")
    public void testTriangleClassifier_345() {
        int inputFirstSize = 3;
        int inputSecondSize = 4;
        int inputLastSize = 5;
        String expected = "Triangle is often";
        String result = TriangleClassifier.checkTriangleClassifier(inputFirstSize, inputSecondSize, inputLastSize);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Case: sizeA = 8, sizeB = 2, sizeC = 3")
    public void testTriangleClassifier_823() {
        int inputFirstSize = 8;
        int inputSecondSize = 2;
        int inputLastSize = 3;
        String expected = "Not a triangle";
        String result = TriangleClassifier.checkTriangleClassifier(inputFirstSize, inputSecondSize, inputLastSize);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Case: sizeA = -1, sizeB = 2, sizeC = 1")
    public void testTriangleClassifier_121() {
        int inputFirstSize = -1;
        int inputSecondSize = 2;
        int inputLastSize = 1;
        String expected = "Not a triangle";
        String result = TriangleClassifier.checkTriangleClassifier(inputFirstSize, inputSecondSize, inputLastSize);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Case: sizeA = 0, sizeB = 1, sizeC = 1")
    public void testTriangleClassifier_011() {
        int inputFirstSize = 0;
        int inputSecondSize = 1;
        int inputLastSize = 1;
        String expected = "Not a triangle";
        String result = TriangleClassifier.checkTriangleClassifier(inputFirstSize, inputSecondSize, inputLastSize);
        assertEquals(expected, result);
    }
}