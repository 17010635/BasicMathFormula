package sg.edu.rp.c346.basicmathformula;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvMathFormula;
    ArrayList<MathFormula> alMathFormula;
    CustomAdapter caMathFormula;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvMathFormula = findViewById(R.id.listViewMathFormula);

        alMathFormula = new ArrayList<>();
        MathFormula item1 = new MathFormula("Area of rectangle","Length x Length","Formula type is: Area");
        MathFormula item2 = new MathFormula("Area of triangle","(Length of base x Length) / 2","Formula type is: Area");
        MathFormula item3 = new MathFormula("Volume of cube","Length x Length x Length","Formula type is: Volume");
        alMathFormula.add(item1);
        alMathFormula.add(item2);
        alMathFormula.add(item3);

        caMathFormula = new CustomAdapter(this,R.layout.math_formula,alMathFormula);

        lvMathFormula.setAdapter(caMathFormula);
    }
}
