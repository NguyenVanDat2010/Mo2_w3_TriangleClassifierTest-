public class TriangleClassifier {
    public static String checkTriangleClassifier(int firstSide, int secondSize, int lastSize) {
//        throw new UnsupportedOperationException("Error");
        if (checkTriangle(firstSide, secondSize, lastSize) && firstSide == secondSize && firstSide == lastSize) {
            return "Equilateral triangle";
        } else if ((checkTriangle(firstSide, secondSize, lastSize) && firstSide == secondSize && firstSide < lastSize) ||
                (checkTriangle(firstSide, secondSize, lastSize) && firstSide == lastSize && firstSide < secondSize) ||
                (checkTriangle(firstSide, secondSize, lastSize) && secondSize == lastSize && secondSize < firstSide)) {
            return "Isosceles triangle";
        } else if (checkTriangle(firstSide, secondSize, lastSize) && firstSide != secondSize && firstSide != lastSize && secondSize != lastSize) {
            return "Triangle is often";
        }
        return "Not a triangle";
    }

    public static boolean checkTriangle(int firstSide, int secondSize, int lastSize) {
        if (firstSide + secondSize > lastSize && firstSide + lastSize > secondSize && secondSize + lastSize > firstSide) {
            return true;
        }
        return false;
    }
}
