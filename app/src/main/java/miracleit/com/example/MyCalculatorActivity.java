package miracleit.com.example;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Ярик on 08.01.2018.
 */

public class MyCalculatorActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mycalculator_activiti);
    }

    public void onButtonClick(View view) {
        EditText elem1 = findViewById(R.id.num_1);
        EditText elem2 = findViewById(R.id.num_2);
        TextView resText = findViewById(R.id.result);

        int num1 = Integer.parseInt(elem1.getText().toString());
        int num2 = Integer.parseInt(elem2.getText().toString());
        int res = num1 + num2;

        resText.setText(Integer.toString(res));
    }

}
