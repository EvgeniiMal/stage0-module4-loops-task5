package school.mjc.stage0.loops.task5;

public class Triangle {
    public void printTriangle(int cathetusLength) {
        String result = "";
        char c = '8';

        if (cathetusLength <= 0) {
            return;
        }

        for (int i = 1; i <= cathetusLength; i++) {
            for (int j = 1; j<= cathetusLength; j++) {
                if (j <= i) {
                    result += c;
                } else {
                    result += ' ';
                }
            }
            if (i != cathetusLength) {
                result += '\n';
            }
        }
        System.out.println(result);
    }
}
