package com.example.jo.movieranking;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView thumbUpButton;
    ImageView thumbDownButton;
    TextView thumbUpText;
    TextView thumbDownText;
    boolean thumbUpState;
    boolean thumbDownState;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        thumbUpText = findViewById(R.id.thumb_up_text);
        thumbDownText = findViewById(R.id.thumb_down_text);
        thumbUpButton = findViewById(R.id.thumb_up_button);
        thumbDownButton = findViewById(R.id.thumb_down_button);



        thumbUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int upCount = Integer.parseInt(thumbUpText.getText().toString());
                if (thumbDownState) {

                } else if (thumbUpState) {
                    thumbUpButton.setImageResource(R.drawable.ic_thumb_up);
                    thumbUpText.setText(String.valueOf(upCount - 1));
                    thumbUpState = false;
                } else if (thumbDownState == false) {
                    thumbUpButton.setImageResource(R.drawable.ic_thumb_up_selected);
                    thumbUpText.setText(String.valueOf(upCount + 1));
                    thumbUpState = true;
                }
            }
        });

        thumbDownButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int downCount = Integer.parseInt(thumbDownText.getText().toString());
                if (thumbUpState) {

                }else if (thumbDownState) {
                    thumbDownButton.setImageResource(R.drawable.ic_thumb_down);
                    thumbDownText.setText(String.valueOf(downCount - 1));
                    thumbDownState = false;
                }else if (thumbUpState == false) {
                    thumbDownButton.setImageResource(R.drawable.ic_thumb_down_selected);
                    thumbDownText.setText(String.valueOf(downCount + 1));
                    thumbDownState = true;
                }
            }
        });
    }
}
