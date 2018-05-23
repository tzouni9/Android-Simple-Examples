//animations


//make item scale from x0 y0 to 1x y1
 fab.setScaleY(0);
fab.setScaleX(0);
fab.animate().scaleX(1).scaleY(1).start();
	
// make item to expand from 0 to 1 scale to bottom way
	
int trackStartValue = trackPanel.getTop();
int trackEndValue = trackPanel.getBottom();
ObjectAnimator.ofInt(trackPanel, "bottom", trackStartValue, trackEndValue).start();

// Animation set (play together)
AnimatorSet set = new AnimatorSet();  
set.playTogether(obj1,obj2...);
set.start();

// Animation set (play one after another)
AnimatorSet set = new AnimatorSet();
set.playSequentially(obj1,obj2...);
set.start()

