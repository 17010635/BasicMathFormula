package sg.edu.rp.c346.basicmathformula;

public class MathFormula {
    private String formulaName;
    private String formula;
    private String formulaType;

    public MathFormula(String formulaName, String formula, String formulaType) {
        this.formulaName = formulaName;
        this.formula = formula;
        this.formulaType = formulaType;
    }


    public String getFormulaName() {
        return formulaName;
    }

    public void setFormulaName(String formulaName) {
        this.formulaName = formulaName;
    }

    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    public String getFormulaType() {
        return formulaType;
    }

    public void setFormulaType(String formulaType) {
        this.formulaType = formulaType;
    }

    @Override
    public String toString() {
        return "MathFormula{" +
                "formulaName='" + formulaName + '\'' +
                ", formula='" + formula + '\'' +
                ", formulaType='" + formulaType + '\'' +
                '}';
    }
}
