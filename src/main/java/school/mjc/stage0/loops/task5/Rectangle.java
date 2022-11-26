package school.mjc.stage0.loops.task5;

public class Rectangle {
    public void printRectangleFrom8s(int length, int height){
        String result = "";
        char c = '8';

        if (length == 0 || height == 0) {
            return;
        }

        for (int i = 0; i <= height - 1; i++) {
            for (int j = 0; j <= length - 1; j++) {
                if(i == 0 || i == height - 1) {
                    result += c;
                } else if (j == 0 || j == length - 1) {
                    result += c;
                } else {
                    result += ' ';
                }
            }
            if (i != height - 1) {
                result += '\n';
            }
        }
        System.out.println(result);
    }
}
