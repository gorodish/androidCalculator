package example.codeclan.com.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class OutputActivity extends AppCompatActivity {


    TextView output_textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_output);

        output_textview = (TextView) findViewById(R.id.output_text);


        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String answer = extras.getString("answer");

        output_textview.setText(answer);
    }
}
