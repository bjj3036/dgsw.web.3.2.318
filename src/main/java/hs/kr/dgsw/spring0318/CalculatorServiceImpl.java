package hs.kr.dgsw.spring0318;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public String calculate(double fv, String op, double lv) {
        double result = 0;
        switch (op){
            case "+":
                result = fv + lv;
                break;
            case "-":
                result = fv - lv;
                break;
            case "*":
                result = fv * lv;
                break;
            case "/":
                result = fv / lv;
                break;
        }
        return Double.toString(result);
    }
}
