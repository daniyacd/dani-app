package com.example.daniapp;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private String[] imageName = new String[]{"formyapp", "apict2", "apict3"};

    private List<ImageView> images = new ArrayList<ImageView>();

    private static final List<Integer> drawables1 = PhotoLoader.getPhotoIds();

    private int flg = 0, count = 0;

    private ImageView imageView;
    Boolean pswitch = true;

    public void photoSwitch(View view) {
        // imageView3.setImageResource(R.drawable.apict2)

        ImageView img= (ImageView)findViewById(R.id.imageView2);
        ImageView img1= (ImageView)findViewById(R.id.imageView3);
  if(pswitch){
      pswitch=false;
      img.animate().alpha(0).setDuration(2000);
      img1.animate().alpha(1).setDuration(2000);
          Log.i("info","inside if"+pswitch);
     // img.animate().translationXBy(3000).setDuration(1000);
      img.animate().translationXBy(-3000).setDuration(1000);
      img.animate().translationXBy(1000).rotation(3600).setDuration(1000);
  }
  else
  {
      pswitch=true;
      img1.animate().alpha(0).setDuration(2000);
      img.animate().alpha(1).setDuration(2000);
      Log.i("info","inside else"+pswitch);
     // img1.animate().translationYBy(300).setDuration(5000);
      //img1.animate().translationYBy(-300).setDuration(5000);
      img1.animate().rotation(300).setDuration(5000);

  }






        //images.add()
        //ImageView img1 = new ImageView(getApplicationContext()).setImageResource(R.drawable.apict2);
        // images.add(new ImageView(getApplication()).setImageResource(R.drawable.apict2))

    /* Log.i("info","inside photoswitch");
    ImageView imageView = (ImageView)findViewById(R.id.imageView2);
    if(flg==0){
     imageView.setImageResource(R.drawable.apict2);
     flg=1;
    }
    else
    {
        ImageView imageView2 = (ImageView)findViewById(R.id.imageView2);
        Log.i("info","inside else");
        imageView.setImageResource(R.drawable.formyapp);
        flg=0;
    }*/

    }

    public void previousImage(View view) {

        // findViewById()
        Log.i("info", "previous image " + count);
        if (count < 0) {
            count = drawables1.size() - 1;
        }
        Log.i("info", "previous image1 for loop " + count);
        imageView = (ImageView) findViewById(R.id.imageView2);
        imageView.setImageResource(drawables1.get(count));
        count--;
    }

    public void nextImage(View view) {

        // String s2=imageName[count];
        if (count > 3) {
            count = 0;
        }
        imageView = (ImageView) findViewById(R.id.imageView2);

        Log.i("info", "next image1 " + count);
        imageView.setImageResource(drawables1.get(count));
        count++;
    }

    public void playVideo(View view) {

        EditText nameEditText = (EditText) findViewById(R.id.currency);

        Log.i("info", "No video to play");
        Log.i("Values", nameEditText.getText().toString());
        Toast toast = Toast.makeText(getApplicationContext(), " Indian Rupee equal to the amount is ", Toast.LENGTH_LONG);
        toast.show();
    }

    /*
     * @param view
     */
    public void printContent(View view) {


        Log.i("info", "working image button");
    }

    public void currencyConvert(View view) {

        EditText nameEditText = (EditText) findViewById(R.id.currency);
        String s = nameEditText.getText().toString();
        int i = Integer.parseInt(s);
        int k = i * 73;
        String rupee = Integer.toString(k);

        Toast toast = Toast.makeText(getApplicationContext(), "your amount is " + rupee + " rs", Toast.LENGTH_LONG);
        toast.show();
        Log.i("info", "inside convert buttun");
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}