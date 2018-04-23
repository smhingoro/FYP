package com.example.shakeel.finalyearproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterForm extends AppCompatActivity {
    private EditText et_name, et_email, et_password, et_cpassword, et_phone;
    protected String name, email, password, cpassword, phone;
    Button regbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resgister_form);

        et_name = (EditText)findViewById(R.id.name);
        et_email = (EditText)findViewById(R.id.email);
        et_password = (EditText)findViewById(R.id.password);
        et_cpassword = (EditText)findViewById(R.id.conformPassword);
        et_phone = (EditText)findViewById(R.id.phone);
        regbtn = (Button)findViewById(R.id.regbtn);

        regbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                register();
                /*Intent clickme = new Intent(RegisterForm.this, AddBudget.class);
                startActivity(clickme);
                RegisterForm.this.finish();*/
            }
        });
    }
    public void register(){
        intialize();
        if(!validate()){
            Toast.makeText(this,"Signup has failed",Toast.LENGTH_SHORT).show();
        }else{
            onSignupSuccess();
        }
    }
    public void onSignupSuccess(){

    }
    public boolean validate(){
        boolean valid = true;
        if (name.isEmpty() || name.length()>32){
            et_name.setError("Please Enter a valid name");
            valid = false;
        }
        else if (email.isEmpty()){
            et_email.setError("Please Enter a valid email");
            valid = false;
        }
        else if (password.isEmpty()){
            et_email.setError("Please Enter a valid password");
            valid = false;
        }
        else if (cpassword.isEmpty() && cpassword != password){
            et_email.setError("Password does not match");
            valid = false;
        }
        else if (phone.isEmpty()){
            et_email.setError("Please Enter a valid phone number");
            valid = false;
        }else {
            Intent clickme = new Intent(RegisterForm.this, AddBudget.class);
            startActivity(clickme);
            RegisterForm.this.finish();
        }

        return valid;
    }

    public void intialize(){
        name = et_name.getText().toString().trim();
        email = et_email.getText().toString().trim();
        password = et_password.getText().toString().trim();
        cpassword = et_cpassword.getText().toString().trim();
        phone = et_phone.getText().toString().trim();

    }
}
