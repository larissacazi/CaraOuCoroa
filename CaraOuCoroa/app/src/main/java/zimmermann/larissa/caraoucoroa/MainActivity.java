package zimmermann.larissa.caraoucoroa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView playButton;
    String[] option = {"cara", "coroa"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        playButton = (ImageView)findViewById(R.id.playButtonId);

        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                int randomNumber = random.nextInt(2);//0 ou 1

                intent.putExtra("option", option[randomNumber]);
                startActivity(intent);
            }
        });
    }
}
