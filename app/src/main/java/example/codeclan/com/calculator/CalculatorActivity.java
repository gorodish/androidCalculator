package example.codeclan.com.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class CalculatorActivity extends AppCompatActivity {


    EditText num1EditText;
    EditText num2EditText;
    Button calcButton;
    Calculator calculator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        num1EditText = (EditText) findViewById(R.id.num1_edittext);
        num2EditText = (EditText) findViewById(R.id.num2_edittext);
        calcButton = (Button) findViewById(R.id.calc_button);

        String output = calculator.add();

        Intent intent = new Intent(CalculatorActivity.this, OutputActivity.class);
        intent.putExtra("output", (int)output));

        startActivity(intent);

    }
}
