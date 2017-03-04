package css.cis3334.assignment7_flooring;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etWidth, etLength;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etWidth = (EditText) findViewById(R.id.editTextWidth);
        etLength = (EditText) findViewById(R.id.editTextLength);

    }

    public void onClickSubmit (View View){

        String width = etWidth.getText().toString();
        String length = etLength.getText().toString();
        Intent flooringIntent = new Intent(MainActivity.this, Main2Activity.class);
        flooringIntent.putExtra("Width", width);
        flooringIntent.putExtra("Length", length);
        startActivity(flooringIntent);
    }
}
