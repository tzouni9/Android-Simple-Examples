implementation 'com.android.support:design:26.1.0'

Snackbar.make(view, "Recording has Start", Snackbar.LENGTH_LONG)
                                .setAction("Action", null).show();
								
								
								


final Snackbar snackBar = Snackbar.make(findViewById(R.id.constrainLayoutMain), "hey", Snackbar.LENGTH_LONG);
        snackBar.setAction("Dismiss", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                snackBar.dismiss();
            }
        });
        snackBar.show();