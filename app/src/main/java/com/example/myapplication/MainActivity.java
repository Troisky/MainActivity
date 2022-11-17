package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import java.text.BreakIterator;
public class MainActivity extends AppCompatActivity {
    private Button btn;
    private EditText editTexta;
    private EditText editTextb;
    private EditText editTextc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.button);
        editTexta = findViewById(R.id.a);
        editTextb = findViewById(R.id.b);
        editTextc = findViewById(R.id.c);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BreakIterator editText;
                String str_value_a = editTexta.getText().toString();
                double a = Integer.parseInt(str_value_a);
                String str_value_b = editTextb.getText().toString();
                double b = Integer.parseInt(str_value_b);
                String str_value_c = editTextb.getText().toString();
                double c = Integer.parseInt(str_value_c);
                D = b * b - 4 * a * c;
                if (D > 0) {
                    double x1, x2;
                    x1 = (-b - Math.sqrt(D)) / (2 * a);
                    x2 = (-b + Math.sqrt(D)) / (2 * a);
                    System.out.println("Корни уравнения: x1 = " + x1 + ", x2 = " + x2);
                }
                else if (D == 0) {
                    double x;
                    x = -b / (2 * a);
                    System.out.println("Уравнение имеет единственный корень: x = " + x);
                }
                else {
                    System.out.println("Уравнение не имеет действительных корней!");
                }
            }
        });
    }
}
