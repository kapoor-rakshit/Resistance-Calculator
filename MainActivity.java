package rkapoors.resistancecalc;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.TextView;


public class MainActivity extends Activity {
    Button button;
    TextView t1;
private String val[]={"0","1","2","3","4","5","6","7","8","9"};
    private String tol[]={"5","10","20"};
   private String resl="";
    private String a="";
    private String b="";
    private String c="";
    private String d="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      final  Spinner staticSpinner1 = (Spinner) findViewById(R.id.firstmenu);
      final  Spinner staticSpinner2 = (Spinner) findViewById(R.id.secondmenu);
       final Spinner staticSpinner3 = (Spinner) findViewById(R.id.thirdmenu);
       final Spinner staticSpinner4 = (Spinner) findViewById(R.id.fourthmenu);
        // Create an ArrayAdapter using the string array and a default spinner
        ArrayAdapter<CharSequence> staticAdapter = ArrayAdapter
                .createFromResource(this, R.array.color,
                        android.R.layout.simple_spinner_item);

        ArrayAdapter<CharSequence> sa = ArrayAdapter
                .createFromResource(this, R.array.tolerance,
                        android.R.layout.simple_spinner_item);

        // Specify the layout to use when the list of choices appears
        staticAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        sa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Apply the adapter to the spinner
        staticSpinner1.setAdapter(staticAdapter);
        staticSpinner2.setAdapter(staticAdapter);
        staticSpinner3.setAdapter(staticAdapter);
        staticSpinner4.setAdapter(sa);

                staticSpinner1.setOnItemSelectedListener(new OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                a=val[position];
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {
                        // TODO Auto-generated method stub
                                                                     }
                                                                 });

        staticSpinner2.setOnItemSelectedListener(new OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                b=val[position];
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // TODO Auto-generated method stub
            }
        });
        staticSpinner3.setOnItemSelectedListener(new OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                c=val[position];
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // TODO Auto-generated method stub
            }
        });
        staticSpinner4.setOnItemSelectedListener(new OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                d=tol[position];
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // TODO Auto-generated method stub
            }
        });

        button = (Button) findViewById(R.id.b1);
        t1= (TextView) findViewById(R.id.result);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                resl="";
                resl=a+b+"  X 10^"+c+" +- "+d+"%";
                t1.setText(resl);
            }
        });

    }
}

