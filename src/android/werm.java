package com.cordova.werm;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import android.app.*;
import android.os.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * This class echoes a string called from JavaScript.
 */
public class werm extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("wermRun")) {
            String message = args.getString(0);
            this.wermRun(message, callbackContext);
            return true;
        }
        return false;
    }

    private void wermRun(String command, CallbackContext callbackContext) {
        if (message != null && command.length() > 0) {
	        StringBuffer return_ = new StringBuffer();
        	try {
		     Process p = Runtime.getRuntime().exec(command);
		     p.waitFor();
		     BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
		     String str = "";
		     while (true) {
			     str = reader.readLine();
			     if (str == null) {
				     break;
			     }
			     return_.append(str + "\n");
		     }
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 
		callbackContext.success(return_.toString());
        } else {
            callbackContext.error("Expected one non-empty string argument.");
        }

    }


}
