package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
        String result = "";
        char c = '8';

        if (sideLength == 0) {
            return;
        }

        for (int i = 0; i < sideLength; i++) {
            for (int j = 0; j < sideLength; j++) {
                if (i == sideLength / 2 || j == sideLength / 2) {
                    result += c;
                } else {
                    result += ' ';
                }
            }
            if (i != sideLength -1) {
                result += '\n';
            }
        }
        System.out.println(result);
    }
}
