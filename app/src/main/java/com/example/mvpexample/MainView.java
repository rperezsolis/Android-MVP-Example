package com.example.mvpexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainView extends AppCompatActivity implements InterfaceSquared.View {
    EditText edt_number_input;
    Button btn_squared;
    TextView txt_squared_output;
    InterfaceSquared.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt_number_input = findViewById(R.id.edt_number_input);
        btn_squared = findViewById(R.id.btn_squared);
        txt_squared_output = findViewById(R.id.txt_squared_output);

        btn_squared.setOnClickListener(v -> calculate());

        presenter = new MainPresenter(this);
    }

    private void calculate() {
        presenter.squared(edt_number_input.getText().toString());
    }

    @Override
    public void showResult(String result) {
        txt_squared_output.setText(result);
    }

    @Override
    public void showError(String error) {
        txt_squared_output.setText(error);
    }
}
