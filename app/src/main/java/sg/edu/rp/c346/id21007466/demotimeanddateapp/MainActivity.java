package sg.edu.rp.c346.id21007466.demotimeanddateapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {
    DatePicker dp;
    TimePicker tp;
    Button btnDisplayDate;
    Button btnDisplayTime;
    TextView tvDisplay;
    Button btnReset;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dp=findViewById(R.id.DatePicker);
        tp=findViewById(R.id.TimePicker);
        btnDisplayDate=findViewById(R.id.buttonDisplayDate);
        btnDisplayTime=findViewById(R.id.buttonDiaplayTime);
        tvDisplay=findViewById(R.id.textViewDisplay);
        btnReset=findViewById(R.id.buttonReset);


        btnDisplayTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int hour, minute;


                    hour = tp.getCurrentHour();
                    minute = tp.getCurrentMinute();



                String timeString = String.format("Time is %02d:%02d", hour, minute);


                tvDisplay.setText(timeString);



            }
        });
        btnDisplayDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int day = dp.getDayOfMonth();
                int month = dp.getMonth() + 1;
                int year = dp.getYear();


                String dateString = String.format("Date is %02d/%02d/%04d", day, month, year);


                tvDisplay.setText(dateString);
            }
        });
        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                    tp.setCurrentHour(0);
                    tp.setCurrentMinute(0);



                dp.updateDate(2020, 0, 1);
            }
        });





    }
}