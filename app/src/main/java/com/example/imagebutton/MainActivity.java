package com.example.imagebutton;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import static android.R.attr.button;


public class MainActivity extends AppCompatActivity {

    private TextView textImageButton;
    private boolean flg = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // リニアレイアウトの設定
        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);

        layout.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT));

        // レイアウト中央寄せ
        layout.setGravity(Gravity.CENTER);
        setContentView(layout);

        // ボタンの設定
        ImageButton imageButton = new ImageButton(this);

        // ボタンに画像を設定
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.icon);
        Drawable drawable = new BitmapDrawable(getResources(), bitmap);

        // Bitmapで画像を設定
//        imageButton.setImageBitmap(bitmap);
        // 背景に画像を設定
        imageButton.setBackground(drawable);
        // Drawableで画像設定
        imageButton.setImageDrawable(drawable);

        LinearLayout.LayoutParams buttonLayoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        // マージン 20dp に設定

        imageButton.setLayoutParams(buttonLayoutParams);
        layout.addView(imageButton);

        // リスナーをボタンに登録
        imageButton.setOnClickListener(new View.OnClickListener() {
            //@Override
            public void onClick(View v) {
                Log.d("debug","tapped");
            }
        });
    }
}

//public class MainActivity extends AppCompatActivity {
//
//    private TextView textImageButton;
//    private boolean flg = false;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        // TextView の設定
//        textImageButton = (TextView)findViewById(R.id.text_imagebutton);
//
//        // イメージボタンを設定
//        ImageButton imageButton = (ImageButton)findViewById(R.id.image_button);
//        imageButton.setOnClickListener(new View.OnClickListener() {
//            //@Override
//            public void onClick(View v) {
//                if (flg) {
//                    textImageButton.setText(R.string.touchme);
//                    flg = false;
//                } else {
//                    textImageButton.setText(R.string.thanks);
//                    flg = true;
//                }
//            }
//        });
//    }
//}

//public class MainActivity extends AppCompatActivity {
//
//    private TextView textImageButton;
//    private TextView textButton;
//    private boolean flg = true;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        // TextView の設定
//        textImageButton = (TextView)findViewById(R.id.text_imagebutton);
//
//        // イメージボタンを設定
//        ImageButton imageButton = (ImageButton)findViewById(R.id.image_button);
//        imageButton.setOnClickListener(new View.OnClickListener() {
//            //@Override
//            public void onClick(View v) {
//                if (flg) {
//                    textImageButton.setText(R.string.tapped);
//                    flg = false;
//                } else {
//                    textImageButton.setText(R.string.image_button);
//                    flg = true;
//                }
//            }
//        });
//
//        textButton = (TextView)findViewById(R.id.text_button);
//        // ボタンを設定
//        Button button = (Button)findViewById(R.id.button);
//        button.setOnClickListener(new View.OnClickListener() {
//            //@Override
//            public void onClick(View v) {
//                if (flg) {
//                    textButton.setText(R.string.tapped);
//                    flg = false;
//                } else {
//                    textButton.setText(R.string.button);
//                    flg = true;
//                }
//            }
//        });
//    }
//}
