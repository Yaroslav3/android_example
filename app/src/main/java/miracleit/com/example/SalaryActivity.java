package miracleit.com.example;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Ярик on 07.01.2018.
 */

public class SalaryActivity extends AppCompatActivity {
    private EditText editText;
    private EditText editText2;
    private EditText editText3;
    private EditText editText4;
    private EditText editText5;
    private EditText editText6;
    private Button button;
    private Button button2;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.salary_activity);
        editText = findViewById(R.id.int_Oclad);
        editText2 = findViewById(R.id.double_ball);
        editText3 = findViewById(R.id.int_workDay);
        editText4 = findViewById(R.id.double_Sever);
        editText5 = findViewById(R.id.int_dayPol);
        editText6 = findViewById(R.id.double_res);

        button = findViewById(R.id.btn_OK);
        button2 = findViewById(R.id.btnClear);
        button.setOnClickListener(onClickListener);
        button2.setOnClickListener(onClickListener);
    }


    View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.btn_OK:
                    editText6.setText(salary());
                    break;
                case R.id.btnClear:
                    editText.setText("");
                    editText2.setText("");
                    editText3.setText("");
                    editText4.setText("");
                    editText5.setText("");
                    editText6.setText("");
                    break;
            }
        }
    };

    private String salary() {
        int oclad = Integer.parseInt(String.valueOf(editText.getText()));
        double prirabotovc = Double.parseDouble(String.valueOf(editText2.getText()));
        int workDay = Integer.parseInt(String.valueOf(editText3.getText()));
        double sever = Double.parseDouble(String.valueOf(editText4.getText()));
        int workDayPole = Integer.parseInt(String.valueOf(editText5.getText()));
        int f = oclad * 2;// оклад за месяц
        int h = f / 30; // вычисление день по окладу
        int pol = workDayPole * 200; // вычисление полевых
        int v = h * workDay; // оклад за день * на количество раб.дней
        double n1 = v * 0.25; // вычесление премии 25% от оклада
        double k = oclad * prirabotovc / 100;// вычисляем приработока
        double m = k + v + n1; // приработок + оклад + премия 25%
        double g = m * sever;  // умножение на северный коэффициент
        double t = g * 0.87 + pol;// вычитаем 13% подоходный налог + полевые
        String formattedDouble = String.format("%.2f", t);
        String ress = String.valueOf(f);
        return ress;
    }
}
