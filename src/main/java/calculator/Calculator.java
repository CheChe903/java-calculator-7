package calculator;

import camp.nextstep.edu.missionutils.Console;
import java.util.NoSuchElementException;

public class Calculator {

    private final Delimiters delimiters = new Delimiters();
    private final Converter converter = new Converter();

    public void startCalculate() {
        System.out.println("덧셈할 문자열을 입력해주세요.");

        String inputString;

        try {
            inputString = Console.readLine();
        } catch (NoSuchElementException e) {
            System.out.println("결과 : 0");
            return;
        }

        String[] numList = delimiters.getNumList(inputString);

        double sum = 0;

        for (String token : numList) {

            String trimToken = token.trim();

            sum += converter.convertToValidNumber(trimToken);

        }

        if (Math.floor(sum) == sum) {
            System.out.println("결과 : " + (int) sum);
        } else {
            System.out.println("결과 : " + sum);
        }
    }
}
