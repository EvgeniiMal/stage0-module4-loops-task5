package school.mjc.stage0.loops.task5;

public class Square {
    public void printSquareFrom8s(int sideLength){
        String result = "";
        char c = '8';

        if (sideLength <= 0) {
            return;
        }

        for (int i = 0; i < sideLength; i++) {
            for (int j = 0; j < sideLength; j++) {
                if(i == 0 || i == sideLength - 1) {
                    result += c;
                } else if (j == 0 || j == sideLength - 1) {
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
