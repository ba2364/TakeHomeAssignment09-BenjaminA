package com.ba2364.takehomeassignment09_benjamina;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity2 extends AppCompatActivity {

    private FirebaseDatabase database = FirebaseDatabase.getInstance();
    private DatabaseReference cheeseRef = database.getReference("cheese");

    private EditText cheeseName;
    private EditText cheesePlace;
    private EditText amount;
    private CheckBox smell;
    private Button firebaseButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        cheeseName = (EditText) findViewById(R.id.cheeseNameBox);
        cheesePlace = (EditText) findViewById(R.id.cheesePlaceBox);
        amount = (EditText) findViewById(R.id.amountBox);
        smell = (CheckBox) findViewById(R.id.smellBox);
        firebaseButton = (Button) findViewById(R.id.firebaseButton);
    }

    public void addToFirebase(View view) {
        String nm = cheeseName.getText().toString();
        String pl = cheesePlace.getText().toString();
        int amt = Integer.parseInt(amount.getText().toString());
        boolean smll = ((CheckBox) findViewById(R.id.smellBox)).isChecked();
        cheeseRef.push().setValue(new Cheese(nm, pl, amt, smll));
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}