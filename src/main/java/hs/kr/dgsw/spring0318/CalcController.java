package hs.kr.dgsw.spring0318;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalcController {

    @Autowired
    CalculatorService cs;

    //fv: First Value
    //op: Operator
    //lv: Last Value
    @GetMapping("/calc")
    public String calc(@RequestParam double fv, @RequestParam String op, @RequestParam double lv){
        return cs.calculate(fv, op ,lv);
    }
}
