package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        String result = "";
        char c = '8';

        if (height == 0) {
            return;
        }

        for (int i = 0; i < height / 2; i++) {
            for (int j = 0; j < height; j++) {
                if (j < i || j > height - i - 1) {
                    result += ' ';
                    continue;
                }

                result += c;
            }
            result += '\n';
        }
        for (int i = height / 2; i < height; i++) {
            for (int j = 0; j < height; j++) {
                if (i < j || height - i - 1 > j) {
                    result += ' ';
                    continue;
                }

                result += c;
            }
            result += '\n';
        }
        System.out.println(result.trim());
    }
}
