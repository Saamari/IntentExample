package fi.jamk.intentexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void login(View view)
    {
        EditText firstnameEdittext = (EditText)findViewById(R.id.firstnameEditText);
        EditText lastnameEdittext = (EditText)findViewById(R.id.lastnameEditText);

        String firstname = firstnameEdittext.getText().toString();
        String lastname = lastnameEdittext.getText().toString();

        //Start another activity...
        Intent intent=new Intent(this,SecondActivity.class);
        intent.putExtra("firstname",firstname);
        intent.putExtra("lastname",lastname);
        startActivity(intent);
    }

}
