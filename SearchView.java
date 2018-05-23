import android.widget.SearchView;
// ΟΧΙ import android.support.v7.widget.SearchView;


        final SearchView searchView = (SearchView)findViewById(R.id.mySearch);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
			
			    // HIDE KEYBOARD AFTER SEARCH
                searchView.clearFocus();
				
                //CLEAR searchView AFTER SEARCH
                searchView.setQuery("" ,true);
  
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
			
                return false;
            }
        });