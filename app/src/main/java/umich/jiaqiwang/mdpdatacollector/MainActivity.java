package umich.jiaqiwang.mdpdatacollector;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.location.Location;
import android.location.LocationListener;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{

    Button btnStart;
    Button btnStop;
    Button btnPause;
    TextView txtState;
    Thread locationThread;
    Thread sensorThread;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnStart = (Button)findViewById(R.id.btnStart);
        btnStop = (Button)findViewById(R.id.btnStop);
        btnPause = (Button)findViewById(R.id.btnPause);
        txtState = (TextView)findViewById(R.id.txtState);

        btnStart.setOnClickListener(new View.OnClickListener() {
            volatile boolean pauseFlag = false;
            @Override
            public void onClick(View view) {
                txtState.setText("Start to collect data");
            }
        });

        btnStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtState.setText("Stop to Collect data");
            }
        });


    }

}
