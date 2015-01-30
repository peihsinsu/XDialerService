package com.xdialerservice;

import com.google.ads.AdRequest;
import com.google.ads.AdSize;
import com.google.ads.AdView;
import com.google.ads.InterstitialAd;
import com.xdialer.AdSenseUtil;

import android.app.Activity;
import android.os.Bundle;
import android.telephony.PhoneNumberUtils;
import android.widget.LinearLayout;
import android.widget.TextView;

public class HelpActivity extends Activity {
	private static final String MY_BANNER_UNIT_ID = //"ca-mb-app-pub-a14dc6cd4211f96"; 
		//"ca-pub-9235334520140030";
		"a14dc6cd4211f96";

	/**
	 * @see android.app.Activity#onCreate(Bundle)
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.help);
		findViews();
		
		
	}

	private TextView helpContent ;
	private void findViews() {
		helpContent = (TextView) findViewById(R.id.help_content);
		String text = String.valueOf(helpContent.getText());
		text = text.concat("\n\nPhone specific number:");
		text = text.concat("\n*Wait is [" + PhoneNumberUtils.WAIT + "]");
		text = text.concat("\n*Wild is [" + PhoneNumberUtils.WILD + "]");
		text = text.concat("\n*Pause is [" + PhoneNumberUtils.PAUSE + "]");
		System.out.println(">>>>"+text);
		helpContent.setText(text);
		
		
//		//Add the AdSense
//		LinearLayout layout = (LinearLayout) findViewById(R.id.adinhelp);
//		AdView adView = new AdView(this, AdSize.BANNER, MY_BANNER_UNIT_ID);
//		layout.addView(adView);
//		// Initiate a generic request to load it with an ad
//	    AdRequest request = new AdRequest();
//	    request.setTesting(true);
//		adView.loadAd(request);

		// Look up the AdView as a resource and load a request.
//	    AdView adView = (AdView)this.findViewById(R.id.adView);
//	    AdRequest request = new AdRequest();
//	    request.setTesting(true);
//	    adView.loadAd(request);
		
		AdSenseUtil.addAdSense(this, R.id.adView);
	}
	
}
