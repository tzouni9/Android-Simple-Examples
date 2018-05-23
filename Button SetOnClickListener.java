Button button = (Button)
                findViewById(R.id.myButton);
        button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(getApplicationContext(),
                        com.example.tzouni.appName.className.class);
                startActivity(intent);

            }
        });