package project1.project1;

import android.content.Context;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView1;
    TextView textView2;
    String result1="";
    String result2="";
    double total1= 0;
    double total2= 0;
    Character sign;
    Vibrator vibrator;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView1 = (TextView) findViewById(R.id.textview1);
        textView2 = (TextView) findViewById(R.id.textview2);
    vibrator=(Vibrator)getSystemService(Context.VIBRATOR_SERVICE);
    }
    public void zero(View view) {
    vibrator.vibrate(100);
        push(0);}
    public void one(View view) {
        vibrator.vibrate(100);
        push(1);}
    public void two(View view) {
        vibrator.vibrate(100);
        push(2);}
    public void three(View view) {
        vibrator.vibrate(100);
        push(3);}
    public void four(View view) {
        vibrator.vibrate(100);
        push(4);}
    public void five(View view) {
        vibrator.vibrate(100);
        push(5);}
    public void six(View view) {
        vibrator.vibrate(100);
        push(6);}
    public void seven(View view) {
        vibrator.vibrate(100);
        push(7);}
    public void eight(View view) {
        vibrator.vibrate(100);
        push(8);}
    public void nine(View view) {
        vibrator.vibrate(100);
        push(9);}
    public void push(int add)
    {
        vibrator.vibrate(100);
        try{
            if(total2!=0){
                result2="";
                total2=0;
            }
            result2=result2+add;
            textView2.setText(result2);
        }catch(RuntimeException e){e.printStackTrace();}
    }
    public void divide(View view) {
        vibrator.vibrate(100);
        sign='/';
        clear2(" /");}
    public void Multiply(View view) {
        vibrator.vibrate(100);
        sign='*';
        clear2(" *");}
    public void minus(View view) {
        vibrator.vibrate(100);
        sign='-';
        clear2(" -");}
    public void plus(View view) {
        vibrator.vibrate(100);
        sign='+';
        clear2(" +");}
    public void Mode(View view) {
        vibrator.vibrate(100);
        sign='%';
        clear2(" %");}
    private void  clear2(String sign) {
        vibrator.vibrate(100);
        try {
            total1 = new Double(total1 + Double.parseDouble(result2));
            result1 = result2 + sign;
            textView1.setText(result1);
            result2 = "";
            textView2.setText(result2);
        }catch(RuntimeException e){e.printStackTrace();}
    }
    public void dot(View view) {
        vibrator.vibrate(100);
        try {
            int x=result2.indexOf('.');
            if(x==-1){
            result2 = result2 + ".";
            textView2.setText(result2);}
        }catch(RuntimeException e){e.printStackTrace();}
    }
    //textView1.setText(String.format("%d",total));}
    public void plus_minus(View view) {
        vibrator.vibrate(100);
        try {
            if (result2 == "") {
                result2 = "-";
                textView2.setText(result2);
            }
        }catch (RuntimeException e){e.printStackTrace();}
    }
    public void clear(View view) {
        vibrator.vibrate(100);
        try {
            total1 = 0;
            total2 = 0;
            result1 = "";
            result2 = "";
            textView1.setText(result1);
            textView2.setText(result2);
        }catch(RuntimeException e){e.printStackTrace();}
    }
    public void equal(View view) {
        vibrator.vibrate(100);
        try {
            if(result2!=""){
                textView1.setText(result2);
            }
            switch (sign) {
                case '+': total1=new Double(total1+Double.parseDouble(result2)); sign=null;Display(total1);break;
                case '-': total1=new Double(total1-Double.parseDouble(result2)); sign=null;Display(total1);break;
                case '*': total1=new Double(total1*Double.parseDouble(result2)); sign=null;Display(total1);break;
                case '/': total1=new Double(total1/Double.parseDouble(result2)); sign=null;Display(total1);break;
                case '%': total1=new Double(total1%Double.parseDouble(result2)); sign=null;Display(total1);break;
                default: break;
            }
        }catch(RuntimeException e){
            e.printStackTrace();
        }
    }
    public void Back(View view) {
        vibrator.vibrate(100);
        try {
            result2 = result2.substring(0, (result2.length() - 1));
        }catch(IndexOutOfBoundsException e){e.printStackTrace();}
        textView2.setText(result2);
    }
    public void Display(double total){
        vibrator.vibrate(100);
        try {
            result2 = "";
            result1 = String.valueOf(total);
            textView1.setText(result1);
            textView2.setText(result2);
            total1 = 0;
            total2=total;
            result1="";
            result2=String.valueOf(total);
        }catch(RuntimeException e){e.printStackTrace();}
    }
}
