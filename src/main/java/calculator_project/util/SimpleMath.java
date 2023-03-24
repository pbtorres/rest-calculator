package calculator_project.util;

import calculator_project.exception.UnsupportedMathOperation;

public class SimpleMath {

    // SOMA
    public Double sum(String numberOne, String numberTwo) {
        if(!Operations.isNumeric(numberOne) || !Operations.isNumeric(numberTwo)) {
            throw new UnsupportedMathOperation("Please set a numeric value!");
        }

        return Operations.convertToDouble(numberOne) + Operations.convertToDouble(numberTwo);

    }

    // SUBTRAÇÃO
    public Double subtraction(String numberOne, String numberTwo) {
        if(!Operations.isNumeric(numberOne) || !Operations.isNumeric(numberTwo)) {
            throw new UnsupportedMathOperation("Please set a numeric value!");
        }

        return Operations.convertToDouble(numberOne) - Operations.convertToDouble(numberTwo);
    }

    // MULTIPLICAÇÃO
    public Double multiplication(String numberOne, String numberTwo) {
        if(!Operations.isNumeric(numberOne) || !Operations.isNumeric(numberTwo)) {
            throw new UnsupportedMathOperation("Please set a numeric value!");
        }

        return Operations.convertToDouble(numberOne) * Operations.convertToDouble(numberTwo);
    }

    // DIVISÃO
    public Double division(String numberOne, String numberTwo) {
        if(!Operations.isNumeric(numberOne) || !Operations.isNumeric(numberTwo)) {
            throw new UnsupportedMathOperation("Please set a numeric value!");
        }

        return Operations.convertToDouble(numberOne) / Operations.convertToDouble(numberTwo);
    }

    // MÉDIA
    public Double average(String numberOne, String numberTwo) {
        if(!Operations.isNumeric(numberOne) || !Operations.isNumeric(numberTwo)) {
            throw new UnsupportedMathOperation("Please set a numeric value!");
        }

        return (Operations.convertToDouble(numberOne) + Operations.convertToDouble(numberTwo)) / 2;
    }

    // RAIZ QUADRADA
    public Double squareRoot(String numberOne) {
        if(!Operations.isNumeric(numberOne)) {
            throw new UnsupportedMathOperation("Please set a numeric value!");
        }

        return Math.sqrt(Operations.convertToDouble(numberOne));
    }

}
