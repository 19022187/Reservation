package sg.edu.rp.c346.id19022187.reservation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etName, etNum, etSize;
    DatePicker dp;
    TimePicker tp;
    Button btnSubmit, btnReset;
    RadioButton rbtnSmoke, rbtnNonsmoke;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dp = findViewById(R.id.datePicker);
        tp = findViewById(R.id.timePicker);
        rbtnSmoke =findViewById(R.id.radioButtonSmoking);
        rbtnNonsmoke = findViewById(R.id.radioButtonNonsmoking);
        btnSubmit = findViewById(R.id.buttonSubmitt);
        btnReset = findViewById(R.id.buttonReset);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (etName.getText().toString().trim().length() == 0){
                    Toast.makeText(MainActivity.this, "Please enter your full name", Toast.LENGTH_LONG).show();
                }
                if (etNum.getText().toString().trim().length() == 0){
                    Toast.makeText(MainActivity.this, "Please enter your full name", Toast.LENGTH_LONG).show();
                }
                if (etSize.getText().toString().trim().length() == 0){
                    Toast.makeText(MainActivity.this, "Please enter your full name", Toast.LENGTH_LONG).show();
                }
                Toast.makeText(MainActivity.this, "You have made a reservation for " + etName.getText().toString().trim() + " pax for " + dp.getDayOfMonth()+"/"+dp.getMonth()+"/"+dp.getYear()+", "+tp.getCurrentHour()+":"+tp.getCurrentMinute(), Toast.LENGTH_LONG).show();
            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etName.setText("");
                etNum.setText("");
                etSize.setText("");
                rbtnNonsmoke.setChecked(false);
                rbtnSmoke.setChecked(false);
                dp.updateDate(2020, 5, 1);
                tp.setCurrentHour(19);
                tp.setCurrentMinute(30);
            }
        });
    }
}
