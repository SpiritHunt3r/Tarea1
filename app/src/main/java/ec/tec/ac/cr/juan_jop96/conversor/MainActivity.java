package ec.tec.ac.cr.juan_jop96.conversor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button BTConvertir = findViewById(R.id.BTConvertir);
        final RadioButton DaC = findViewById(R.id.RDDaC);
        RadioButton CaD = findViewById(R.id.RDCaD);
        final EditText Monto = findViewById(R.id.ETMonto);
        CaD.setChecked(true);
        BTConvertir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String MtC = MtC = Monto.getText().toString();
                float Pre;
                if (MtC.isEmpty())
                    Pre = 0;
                else
                    Pre = Float.parseFloat(MtC);
                if (DaC.isChecked()) {
                    Pre *= 569.32;
                    MtC = String.valueOf(Pre);
                    Toast.makeText(MainActivity.this, "₡ "+MtC, Toast.LENGTH_LONG).show();
                }
                else {
                    Pre /= 569.32;
                    MtC = String.valueOf(Pre);
                    Toast.makeText(MainActivity.this, "$ "+MtC, Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
