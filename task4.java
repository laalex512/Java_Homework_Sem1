// *+Задано уравнение вида q + w = e, 
// q, w, e >= 0. 
// Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69. 
// Требуется восстановить выражение до верного равенства. 
// Предложить хотя бы одно решение или сообщить, что его нет.

package Homework;

public class task4 {
    public static void main(String[] args) {
        String initEq = "3? + ?3 = 5?";
        int countQuestions = 0;
        for (int i = 0; i < initEq.length(); i++) {
            if (initEq.charAt(i) == '?') {
                countQuestions++;
            }
        }
        String result = changeQuestion(initEq, countQuestions);
        System.out.println(result);
    }

    public static String changeQuestion(String str, int count) {
        String noSolution = "No solution";
        if (count > 1) {
            for (int i = 0; i < 10; i++) {
                String temp = changeQuestion(str.replaceFirst("\\?", Integer.toString(i)), count - 1);
                if (temp != noSolution) {
                    return temp;
                }
            }
        } else {
            for (int i = 0; i < 10; i++) {
                String temp = str.replace("?", Integer.toString(i));
                String[] arrEq = temp.split("\\+|\\=");
                for (int j = 0; j < arrEq.length; j++) {
                    arrEq[j] = arrEq[j].trim();
                }
                if (Integer.parseInt(arrEq[0]) + Integer.parseInt(arrEq[1]) == Integer.parseInt(arrEq[2])) {
                    return temp;
                }
            }
            return noSolution;
        }
        return noSolution;
    }
}
