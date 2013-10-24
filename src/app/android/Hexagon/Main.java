package app.android.Hexagon;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import com.example.Hexagon.R;

public class Main extends Activity implements OnClickListener {

  Button startgame;
    Button settings;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.menu);

     startgame = (Button) findViewById(R.id.startgame);
       startgame.setOnClickListener(this);

        settings = (Button) findViewById(R.id.settings);
        settings.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.startgame:
                Intent intent = new Intent(this, Game.class);
                startActivity(intent);


                break;
            case
            R.id.settings:
            Intent intent2 = new Intent(this, Settings.class);
            startActivity(intent2);
                break;
            default:
                break;
        }
    }


}