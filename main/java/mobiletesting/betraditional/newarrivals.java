package mobiletesting.betraditional;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class newarrivals extends AppCompatActivity {

    Button button9_sbm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newarrivals);
        button9_sbm = (Button) findViewById(R.id.button_bk2home);
        button9_sbm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("\"mobiletesting.betraditional.Homepage");
                startActivity(intent);
            }
    });

    }
}
