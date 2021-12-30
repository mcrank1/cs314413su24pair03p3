package edu.luc.etl.cs313.android.shapes.android;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class SimpleDrawActivity extends Activity {

  private static String TAG = "simplebatch-android";

  @Override
  public void onCreate(final Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    Log.i(TAG, "onCreate");
    setContentView(R.layout.activity_main);
  }
}
