/*
 * @author      rx1310 <rx1310@inbox.ru>
 * @copyright   Copyright (c) o1310, 2020
 * @license     MIT License
 */

package o1310.rx1310.app.aideweb.projer.ui.preference;

import android.content.Context;
import android.preference.PreferenceCategory;
import android.util.AttributeSet;

import o1310.rx1310.app.aideweb.projer.R;

public class CategoryPreference extends PreferenceCategory {

	public CategoryPreference(Context c, AttributeSet attrs) {
		super(c, attrs);
		setSelectable(false);
		setLayoutResource(R.layout.ui_preference_category);
	}
	
}
