package calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        while(true) {
            System.out.println("Please input numberA");
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            double numberA=Double.parseDouble(br.readLine());

            System.out.println("Please input numberB");
            double numberB=Double.parseDouble(br.readLine());

            System.out.println("Please input operator");
            String operator=br.readLine();

            Operation operation = OperationFactory.createOperate(operator);
            operation.setNumberA(numberA);
            operation.setNumberB(numberB);
            System.out.println(operation.GetResult());

            System.out.println("Continue or not? Please input y to continue, n to break");
            String continueInput = br.readLine();
            if(!continueInput.equals("y")) {
                break;
            }
        }
    }
}
