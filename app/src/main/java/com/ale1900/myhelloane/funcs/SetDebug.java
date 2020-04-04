package com.ale1900.myhelloane.funcs;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;
import com.ale1900.myhelloane.ExContext;

public class SetDebug implements FREFunction {
        public FREObject call(FREContext context, FREObject[] args) {
            // Try to process the call
            try {
                // Get The Extension Context
                ExContext cnt = (ExContext) context;

                // Set the passed parameter
                boolean enableDebug = args[0].getAsBool();
                // Get the Extension context instance
                cnt.setEnabeDebug(enableDebug);
                return FREObject.newObject(true);
            } catch (Exception e) {
                // Print the exception stack trace
                e.printStackTrace();
            }
            // Return
            return null;
        }
}

