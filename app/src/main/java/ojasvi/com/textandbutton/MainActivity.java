package ojasvi.com.textandbutton;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int counter = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        final TextView textOne = (TextView) findViewById(R.id.textView);
        Button pushMe = (Button) findViewById(R.id.button);

        pushMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++;
                if(counter%2==0)
                    textOne.setText("Hello World!!");
                else
                    textOne.setText("GoodBye World!!");

            }


        });


    }
}
