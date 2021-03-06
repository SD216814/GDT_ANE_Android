package com.ale1900.myhelloane.funcs;

import android.app.Activity;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;
import com.ale1900.myhelloane.ExContext;

public class RewardVideoCreate  implements FREFunction {
	public FREObject call(FREContext context, FREObject[] args) {
		// Try to process the call
		try {
			// Get The Extension Context
			ExContext cnt	= (ExContext) context;
			Activity act			= context.getActivity();
			// Set the passed parameter
			String videoId			= args[0].getAsString();
			// Get the Extension context instance
			cnt.createRewardVideo(act, videoId);
		} catch (Exception e) {
			// Print the exception stack trace
			e.printStackTrace();
		}
		// Return
		return null;
	}
}