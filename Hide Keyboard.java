import android.view.inputmethod.InputMethodManager;



private void hideSoftKeyboard(View v) {
        InputMethodManager imm = (InputMethodManager)getSystemService(INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(v.getWindowToken(),0);
    }
	
	
	// put this where you want
	hideSoftKeyboard(v);
	
	//  .clearFocus(); για searhView
	
	// for fragments
	getActivity().getWindow().setSoftInputMode(
            WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);