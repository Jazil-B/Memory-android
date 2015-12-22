package com.example.alyss.memory;
import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.widget.ProgressBar;
import android.widget.TextView;
import java.lang.InterruptedException;
import java.lang.Override;
import java.lang.Runnable;
import java.lang.Thread;

/**
 * Android ProgressBar example.
 * @author Prabu Dhanapal
 * @version 1.0
 * @since Sep 01 2013
 *
 */
public class Progress extends Activity {
	private ProgressBar progressBar;
	private int progressStatus = 60;
	private TextView textView;
	private Handler handler = new Handler();


    public void load(){


		setContentView(R.layout.main);
		progressBar = (ProgressBar) findViewById(R.id.pBAsync);
		//textView = (TextView) findViewById(R.id.textView1);
		// Start long running operation in a background thread
		new Thread(new Runnable() {
			public void run() {
				while (progressStatus > 0) {
					progressStatus -= 1;
					// Update the progress bar and display the current value in the text view

							progressBar.setProgress(progressStatus);
							//textView.setText(progressStatus+"/"+progressBar.getMax());


					try {
						// Sleep for 200 milliseconds. Just to display the progress slowly
						Thread.sleep(200);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}).start();
	}
}