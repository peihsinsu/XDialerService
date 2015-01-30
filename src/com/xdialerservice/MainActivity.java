package com.xdialerservice;

import com.google.ads.AdRequest;
import com.google.ads.AdView;
import com.xdialer.AdSenseUtil;

import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;
	
public class MainActivity extends TabActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tab);
		Resources res = getResources(); // Resource object to get Drawables
	    
		/** TabHost will have Tabs */
		TabHost tabHost = (TabHost) findViewById(android.R.id.tabhost);
		tabHost.setBackgroundDrawable(res.getDrawable(R.drawable.bg));
		/**
		 * TabSpec used to create a new tab. By using TabSpec only we can able
		 * to setContent to the tab. By using TabSpec setIndicator() we can set
		 * name to tab.
		 */

		/** tid1 is firstTabSpec Id. Its used to access outside. */
		TabSpec thirdTabSpec = tabHost.newTabSpec("tid1");
		TabSpec forthTabSpec = tabHost.newTabSpec("tid1");

		thirdTabSpec.setIndicator(res.getString(R.string.tab_config), res.getDrawable(R.drawable.tabconfig)).setContent(
				new Intent(this, ConfigureActivity.class));
		forthTabSpec.setIndicator(res.getString(R.string.tab_help), res.getDrawable(R.drawable.tabhelp)).setContent(
				new Intent(this, HelpActivity.class));
		
		/** Add tabSpec to the TabHost to display. */
		tabHost.addTab(thirdTabSpec);
		tabHost.addTab(forthTabSpec);
		
//		// Look up the AdView as a resource and load a request.
//	    AdView adView = (AdView)this.findViewById(R.id.adViewTab);
//	    AdRequest request = new AdRequest();
//	    request.setTesting(true);
//	    adView.loadAd(request);
		
		AdSenseUtil.addAdSense(this, R.id.adViewTab);
    }
}