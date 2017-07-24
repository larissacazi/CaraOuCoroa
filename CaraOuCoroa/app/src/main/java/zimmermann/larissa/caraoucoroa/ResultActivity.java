package zimmermann.larissa.caraoucoroa;

import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class ResultActivity extends AppCompatActivity {

    private ImageView backButton;
    private ImageView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        backButton = (ImageView)findViewById(R.id.backButtonId);
        result = (ImageView)findViewById(R.id.resultId);

        Bundle extra = getIntent().getExtras();
        if(extra != null) {
            String option = extra.getString("option");
            if(option.compareTo("cara") == 0) {
                result.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.moeda_cara));
            }
            else if(option.compareTo("coroa") == 0) {
                result.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.moeda_coroa));
            }
        }

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ResultActivity.this, MainActivity.class));
            }
        });
    }
}
