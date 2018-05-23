 SharedPreferences sharedPreferences;
 
    sharedPreferences = getSharedPreferences("com.bluecrown.weather.ui",MODE_PRIVATE);
        isCelsius = sharedPreferences.getBoolean("celsius",true);
		
		
		 SharedPreferences.Editor editor = sharedPreferences.edit();
                    editor.putBoolean("celsius",true);
                    editor.apply();