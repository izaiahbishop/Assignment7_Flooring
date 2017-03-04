package css.cis3334.assignment7_flooring;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView tvFlooring, tvCalculation;
    String width, length;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tvFlooring = (TextView) findViewById(R.id.textViewFlooringNeeded);
        tvCalculation = (TextView) findViewById(R.id.textViewDisplayCalculation);

        Bundle extras = getIntent().getExtras();
        width = extras.getString("Width");
        length = extras.getString("Length");
        Double numWidth = Double.parseDouble(width);
        Double numLength = Double.parseDouble(length);
        Double area = numLength * numWidth;

        tvFlooring.setText("Width is " + width + " and Length is " + length + " and flooring needed is " + area + ".");

    }
}

