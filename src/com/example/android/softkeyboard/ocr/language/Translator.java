/*
 * Copyright 2011 Robert Theis
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.softkeyboard.ocr.language;

import com.example.android.softkeyboard.ocr.CaptureActivity;
import com.example.android.softkeyboard.ocr.PreferencesActivity;

import android.app.Activity;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;


/**
 * Delegates translation requests to the appropriate translation service.
 */
public class Translator {

  public static final String BAD_TRANSLATION_MSG = "[Translation unavailable]";
  
  private Translator(Activity activity) {  
    // Private constructor to enforce noninstantiability
  }
  
  static String translate(Activity activity, String sourceLanguageCode, String targetLanguageCode, String sourceText) {   
    
    // Check preferences to determine which translation API to use--Google, or Bing.
    SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(activity);
    String api = prefs.getString(PreferencesActivity.KEY_TRANSLATOR, CaptureActivity.DEFAULT_TRANSLATOR);
    
    // Delegate the translation based on the user's preference.
    return BAD_TRANSLATION_MSG;
  }
}