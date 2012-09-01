package br.com.android.somaNumeros;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Soma extends Activity {

	EditText edTextn1,edTextn2;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soma);
        edTextn1 = (EditText)findViewById(R.id.numero1);
        edTextn2 = (EditText)findViewById(R.id.numero2);
        Button btnSoma = (Button)findViewById(R.id.btnSoma);
        
        btnSoma.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
					Double num1 = Double.parseDouble(edTextn1.getText().toString());
					Double num2 = Double.parseDouble(edTextn2.getText().toString());
					Double res = num1 + num2;
					
					AlertDialog.Builder dialogo = new AlertDialog.Builder(Soma.this);
					dialogo.setTitle("Aviso");
					dialogo.setMessage("Soma: " + res);
					dialogo.setNeutralButton("OK",null);
					dialogo.show();
			}
		});
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_soma, menu);
        return true;
    }
}
