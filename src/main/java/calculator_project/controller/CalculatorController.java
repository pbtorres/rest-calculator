package calculator_project.controller;

import calculator_project.util.SimpleMath;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @Autowired
    private SimpleMath math;

    // SOMA
    @RequestMapping(
            value = "/sum/{numberOne}/{numberTwo}",
            method = RequestMethod.GET
    )
    public Double sum(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo
    ) throws Exception {
        return math.sum(numberOne, numberTwo);
    }

    // SUBTRAÇÃO
    @RequestMapping(
            value = "/subtraction/{numberOne}/{numberTwo}",
            method = RequestMethod.GET
    )
    public Double subtraction(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo
    ) throws Exception {
        return math.subtraction(numberOne, numberTwo);
    }

    // MULTIPLICAÇÃO
    @RequestMapping(
            value = "/multiplication/{numberOne}/{numberTwo}",
            method = RequestMethod.GET
    )
    public Double multiplication(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo
    ) throws Exception {
        return math.multiplication(numberOne, numberTwo);
    }

    // DIVISÃO
    @RequestMapping(
            value = "/division/{numberOne}/{numberTwo}",
            method = RequestMethod.GET
    )
    public Double division(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo
    ) throws Exception {
       return math.division(numberOne, numberTwo);
    }

    // MÉDIA
    @RequestMapping(
            value = "/average/{numberOne}/{numberTwo}",
            method = RequestMethod.GET
    )
    public Double average(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo
    ) throws Exception {
        return math.average(numberOne, numberTwo);
    }

    // RAIZ QUADRADA
    @RequestMapping(
            value = "/squareRoot/{numberOne}",
            method = RequestMethod.GET
    )
    public Double squareRoot(
            @PathVariable(value = "numberOne") String numberOne
    ) throws Exception {
        return math.squareRoot(numberOne);
    }

}
