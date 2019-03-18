package hs.kr.dgsw.spring0318;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public String calculate(int fv, String op, int lv) {
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
                result = (double)fv / lv;
                break;
        }
        return Double.toString(result);
    }
}
