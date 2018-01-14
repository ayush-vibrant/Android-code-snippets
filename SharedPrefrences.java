public class MainActivity extends AppCompatActivity {
    EditText userName;
    EditText password;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userName = (EditText) findViewById(R.id.userNameInput);
        password = (EditText) findViewById(R.id.passwordInput);
        dataView = (TextView) findViewById(R.id.dataTextView);

    }

    public void saveData(View view){
        SharedPreferences loginData = getSharedPreferences("userInfo", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = loginData.edit();
        editor.putString("userName", userName.getText().toString());
        editor.putString("Password", password.getText().toString());
        editor.apply();

        Toast.makeText(this,"Saved your credentials !!",Toast.LENGTH_SHORT).show();
    }

    public void getData(View view){
        SharedPreferences loginData = getSharedPreferences("userInfo", Context.MODE_PRIVATE);
        String name = loginData.getString("userName", "");
        String pw = loginData.getString("Password","");
        String msg = "Saved User Name: " + name + "\nSaved Password: " + pw;
        textView.setText(msg);
    }
}

