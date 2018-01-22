/**
Bundles are generally used for passing data between various Android activities. 
It depends on you what type of values you want to pass,
but bundles can hold all types of values and pass them to the new activity.
**/

// You can use it like this:

Intent intent = new...
Intent(getApplicationContext(), SecondActivity.class);
intent.putExtra("myKey", AnyValue);  
startActivity(intent);

// You can get the passed values by doing:

Bundle extras = intent.getExtras(); 
String tmp = extras.getString("myKey");




// One more example

// Your first create a Bundle object

Bundle b = new Bundle();

// Then, associate the string data stored in anystring with bundle key "myname"

b.putString("myname", anystring);

//Now, create an Intent object

Intent in = new Intent(getApplicationContext(), secondActivity.class);
// Pass bundle object b to the intent

in.putExtras(b);
// and start second activity

startActivity(in);
// In the second activity, we have to access the data passed from the first activity

Intent in = getIntent();
// Now, you need to get the data from the bundle

Bundle b = in.getExtras();
// Finally, get the value of the string data associated with key named "myname"

String s = b.getString("myname");
