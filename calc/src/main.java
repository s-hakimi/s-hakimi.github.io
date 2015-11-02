/**
 * Created by saeed on 01/11/2015.
 */
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.calc.R;

import java.util.ArrayList;

public class main extends Activity{

    private String s="";
    private float number1;
    private float number2;
    private ArrayList<Integer> Array;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        ImageView btn0 = (ImageView) findViewById(R.id.btn0);
        ImageView btn1 = (ImageView) findViewById(R.id.btn1);
        ImageView btn2 = (ImageView) findViewById(R.id.btn2);
        ImageView btn3 = (ImageView) findViewById(R.id.btn3);
        ImageView btn4 = (ImageView) findViewById(R.id.btn4);
        ImageView btn5 = (ImageView) findViewById(R.id.btn5);
        ImageView btn6 = (ImageView) findViewById(R.id.btn6);
        ImageView btn7 = (ImageView) findViewById(R.id.btn7);
        ImageView btn8 = (ImageView) findViewById(R.id.btn8);
        ImageView btn9 = (ImageView) findViewById(R.id.btn9);

        ImageView btnAdd = (ImageView) findViewById(R.id.btnAdd);
        ImageView btnTafrigh = (ImageView) findViewById(R.id.btnTafrigh);
        ImageView btnMul = (ImageView) findViewById(R.id.btnMul);
        ImageView btnMosavi = (ImageView) findViewById(R.id.btnMosavi);


        final TextView textView = (TextView) findViewById(R.id.view1);

        final EditText text = (EditText) findViewById(R.id.text);

        btnMul.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                float number3;
                if(number1 == null){
                    number1 = Float.parseFloat(text.getText().toString());
                    number1 = number1 * number3;
                    String s;
                    s = textView.getText().toString();
                    textView.setText(s + number3 + "*");
                    text.setText();
                }
                else{
                    float number3;
                    number3 = Float.parseFloat(text.getText().toString());
                    number1 = number1 * number3;
                    String s;
                    s = textView.getText().toString();
                    textView.setText(s + number3 + "*");
                    text.setText("");
                }
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                if(number1 == null) {
                    number1 = Float.parseFloat(text.getText().toString());
                    s = "+";
                    textView.setText(number1.toString + "+");
                    text.setText("");
                }
                else{
                    float num3;
                    num3 = Float.parseFloat(text.getText().toString());
                    number1 = number1 + number3;
                    String s;
                    s = textView.getText().toString();
                    TextView.setText(s + number3 + "+");
                    text.setText("");
                }
            }

        });

        btnTafrigh.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                if (number1 == null) {
                    number1 = Float.parseFloat(text.getText().toString());
                    s = "-";
                    textView.setText(number1.toString() + "-");
                    text.setText("");
                } else {
                    float num3;
                    num3 = Float.parseFloat(text.getText().toString());
                    number1 = number1 - number3;
                    String s;
                    s = textView.getText().toString();
                    textView.setText(s + num3 + "-");
                    text.setText("");
                }
            }
        });

        btnMosavi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number2 = Float.parseFloat(text.getText().toString());
                Float result;

                switch (s)
                {
                    case "*":
                        if(number2 == null){
                            result = number1;
                        }
                        else {
                            result = number1 * number2;
                        }
                        String s4,t4;
                        s4 = textView.getText().toString();
                        t4 = text.getText().toString();
                        if(t4 == "")
                        {
                            text.setText(s4 + "=" + result.toString());

                        }else {
                            text.setText(s4 + number2 + "=" + result.toString());
                        }
                        textView.setText("");
                        s = "0";
                        number1 = null;
                        number2 = null;
                        break;


                    case "-":
                        if(number2 == null){
                            result = number1;
                        }
                        else {
                            result = number1 - number2;
                        }
                        String s2,t2;
                        s2 = textView.getText().toString();
                        t2 = text.getText().toString();
                        if(t2 == "")
                        {
                            text.setText(s2 + "=" + result.toString());

                        }else {
                            text.setText(s2 + number2 + "=" + result.toString());
                        }
                        textView.setText("");
                        s = "0";
                        number1 = null;
                        number2 = null;
                        break;

                    case "0":
                        Toast.makeText(getApplication(),"error",Toast.LENGTH_LONG).show();
                        text.setText("");
                        break;


                    case "+":
                        if(number2 == null){
                            result = number1;
                        }
                        else {
                            result = number1 + number2;
                        }
                        String s,t;
                        s = textView.getText().toString();
                        t = text.getText().toString();
                        if(t == "")
                        {
                            text.setText(s + "=" + result.toString());

                        }else {
                            text.setText(s + number2 + "=" + result.toString());
                        }
                        textView.setText("");
                        s = "0";
                        number1 = null;
                        number2 = null;
                        break;


                    default:
                        break;
                }
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = text.getText().toString();
                text.setText(s + "0");

            }
        });


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = text.getText().toString();
                text.setText(s + "1");
            }
        });


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = text.getText().toString();
                text.setText(s + "2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = text.getText().toString();
                text.setText(s + "3");
            }
        });


        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = text.getText().toString();
                text.setText(s + "4");
            }
        });


        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = text.getText().toString();
                text.setText(s + "5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = text.getText().toString();
                text.setText(s + "6");
            }
        });


        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = text.getText().toString();
                text.setText(s + "7");
            }
        });


        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = text.getText().toString();
                text.setText(s + "8");
            }
        });


        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = text.getText().toString();
                text.setText(s + "9");
            }
        });
}
