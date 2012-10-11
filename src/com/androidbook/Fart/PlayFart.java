package com.androidbook.Fart;

import java.io.IOException;


import com.admob.android.ads.AdManager;

import android.R.*;
import android.R.raw;
import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class PlayFart extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
      /*  
        AdManager.setTestDevices( new String[] {
       		AdManager.TEST_EMULATOR,
        		// Android emulator
       	"emulator-5554", // SVD
       		} );
*/
    }
    
    public void playFartOne(View view){
    	MediaPlayer mp = MediaPlayer.create(this, R.raw.fart_1);
        try {
			mp.prepare();
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	mp.start();
        mp.release();
    }

    public void playFartTwo(View view){
    	MediaPlayer mp = MediaPlayer.create(this, R.raw.fart_2);
        
    	try {
			mp.prepare();
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	mp.start();
        mp.release();
    }
    
    public void playFartThree(View view){
    	MediaPlayer mp = MediaPlayer.create(this, R.raw.fart_3);
    	try {
			mp.prepare();
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	mp.start();
        mp.release();
    }
    
    public void playFartFour(View view){
    	MediaPlayer mp = MediaPlayer.create(this, R.raw.fart_4);
        
    	try {
			mp.prepare();
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	mp.start();
        mp.release();
    }
    
    public void playFartFive(View view){
    	MediaPlayer mp = MediaPlayer.create(this, R.raw.fart_5);
        
    	try {
			mp.prepare();
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	mp.start();
        mp.release();
    }

    public void playFartSix(View view){
    	MediaPlayer mp = MediaPlayer.create(this, R.raw.fart_6);
    	try {
			mp.prepare();
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	mp.start();
        mp.release();
    }
    
    public void playFartSeven(View view){
    	MediaPlayer mp = MediaPlayer.create(this, R.raw.fart_7);
        
    	try {
			mp.prepare();
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	mp.start();
        mp.release();
    }
    
    public void playFartEight(View view){
    	MediaPlayer mp = MediaPlayer.create(this, R.raw.fart_8);
    	try {
			mp.prepare();
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	mp.start();
        mp.release();
    }
    
    public void playFartNine(View view){
    	MediaPlayer mp = MediaPlayer.create(this, R.raw.fart_9);
    	try {
			mp.prepare();
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	mp.start();
        mp.release();
    }



}