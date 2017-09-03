package in.mngo.mngocalc;

import android.support.v4.app.NotificationCompatSideChannelService;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

import static android.R.attr.onClick;

public class MainActivity extends AppCompatActivity {

    //defining all the object in java
    TextView display;
    Button one;
    Button two;
    Button three;
    Button four;
    Button five;
    Button six;
    Button seven;
    Button eight;
    Button nine;
    Button zero;
    Button dot;
    Button add;
    Button subtract;
    Button multiply;
    Button divide;
    Button answer;
    Button C;
    Button DEL;
    Button info;

    //defining array list
    ArrayList<String> disp_array;

    //defining calcultion variables
    float ans;
    String disp = "";
    String disp_old = "";
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = (TextView) findViewById(R.id.display);
        one = (Button) findViewById(R.id.one);
        two = (Button) findViewById(R.id.two);
        three = (Button) findViewById(R.id.three);
        four = (Button) findViewById(R.id.four);
        five = (Button) findViewById(R.id.five);
        six = (Button) findViewById(R.id.six);
        seven = (Button) findViewById(R.id.seven);
        eight = (Button) findViewById(R.id.eight);
        nine = (Button) findViewById(R.id.nine);
        zero = (Button) findViewById(R.id.zero);
        dot = (Button) findViewById(R.id.dot);
        add = (Button) findViewById(R.id.add);
        subtract = (Button) findViewById(R.id.subtract);
        multiply = (Button) findViewById(R.id.multiply);
        divide = (Button) findViewById(R.id.divide);
        answer = (Button) findViewById(R.id.answer);
        C = (Button) findViewById(R.id.C);
        DEL = (Button) findViewById(R.id.DEL);
        info = (Button) findViewById(R.id.info);

        //arraylist for storing inputs
        disp_array = new ArrayList<String>();

        //on click of info button
        info.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                show("Supportable upto Android 8.0 (API 25).\n" +
                        "DISCLAIMER: \n"+
                        "1. It will not result in Infinity or NaN. \n" +
                        "2. BEDMAS rule will not be applicable here."
                );
            }
        });

        //on click of 1
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disp_array.add("1");

                disp = disp + disp_array.get(count);
                count++;
                show(disp);
            }
        });

        //on click of 2
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disp_array.add("2");

                disp = disp + disp_array.get(count);
                count++;
                show(disp);
            }
        });

        //on click of 3
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disp_array.add("3");

                disp = disp + disp_array.get(count);
                count++;
                show(disp);
            }
        });

        //on click of 4
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disp_array.add("4");

                disp = disp + disp_array.get(count);
                count++;
                show(disp);
            }
        });

        //on click of 5
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disp_array.add("5");

                disp = disp + disp_array.get(count);
                count++;
                show(disp);
            }
        });

        //on click of 6
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disp_array.add("6");

                disp = disp + disp_array.get(count);
                count++;
                show(disp);
            }
        });

        //on click of 7
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disp_array.add("7");

                disp = disp + disp_array.get(count);
                count++;
                show(disp);
            }
        });

        //on click of 8
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disp_array.add("8");

                disp = disp + disp_array.get(count);
                count++;
                show(disp);
            }
        });

        //on click of 9
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disp_array.add("9");

                disp = disp + disp_array.get(count);
                count++;
                show(disp);
            }
        });

        //on click of 0
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disp_array.add("0");

                disp = disp + disp_array.get(count);
                count++;
                show(disp);
            }
        });

        //on click of dot

        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int disp_len = disp.length();
                int op_no = 0;
                int dot_no = 0;

                //calculating no of operators in disp string
                for(int a=0; a<disp_len; ++a)
                {
                    if(disp.charAt(a)==43 || disp.charAt(a)==45 || disp.charAt(a)==47 || disp.charAt(a)==42)
                    {
                        op_no++;
                    }
                }

                //calculating no of dots in disp string
                for(int a=0; a<disp_len; ++a)
                {
                    if(disp.charAt(a)==46)
                    {
                        dot_no++;
                    }
                }

                if(dot_no <= op_no) {
                    disp_array.add(".");

                    disp = disp + disp_array.get(count);
                    count++;
                    show(disp);
                }
                else
                {

                }

            }
        });

        //on click of add
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (disp == "" || disp_array.get(count - 1) == "*" || disp_array.get(count - 1) == "/" || disp_array.get(count - 1) == "+" || disp_array.get(count - 1) == "-") {

                } else {
                    disp_array.add("+");

                    disp = disp + disp_array.get(count);
                    count++;
                    show(disp);
                }
            }
        });

        //on click of subtract
        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (disp == "" || disp_array.get(count - 1) == "*" || disp_array.get(count - 1) == "/" || disp_array.get(count - 1) == "+" || disp_array.get(count - 1) == "-") {

                } else {
                    disp_array.add("-");

                    disp = disp + disp_array.get(count);
                    count++;
                    show(disp);
                }
            }
        });

        //on click of multiply
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (disp == "" || disp_array.get(count - 1) == "*" || disp_array.get(count - 1) == "/" || disp_array.get(count - 1) == "+" || disp_array.get(count - 1) == "-") {

                } else {
                    disp_array.add("*");

                    disp = disp + disp_array.get(count);
                    count++;
                    show(disp);
                }
            }
        });

        //on click of divide
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (disp == "" || disp_array.get(count - 1) == "*" || disp_array.get(count - 1) == "/" || disp_array.get(count - 1) == "+" || disp_array.get(count - 1) == "-") {

                } else {
                    disp_array.add("/");

                    disp = disp + disp_array.get(count);
                    count++;
                    show(disp);
                }

            }
        });

        //on click of DEL button
        DEL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count == 0) {

                } else if (disp == " Infinity" || disp == " NaN") {
                    disp_array.clear();
                    count = 0;
                    disp = "";
                    show(disp);
                } else {
                    disp_array.remove(count - 1);
                    count--;
                    disp = "";
                    for (int i = 0; i < count; ++i) {
                        disp = disp + disp_array.get(i);
                    }
                    show(disp);

                }
            }
        });

        //on click of C Button
        C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count == 0) {
                    disp = "";
                    show(disp);
                } else {
                    disp_array.clear();
                    count = 0;
                    disp = "";
                    show(disp);
                }

            }
        });

        //on click of = button
        answer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //defining variables for storing numbers
                String number_string[] = new String[9999999];
                for (int k = 0; k < 9999999; ++k) {
                    number_string[k] = "0";
                }

                float number[] = new float[9999999];

                //defining variables for storing operator
                char op[] = new char[9999999];

                int j = 0;

                if (count == 0) {

                } else {
                    for (int i = 0; i < count; ++i) {
                        if (disp.charAt(i) <= 57 && disp.charAt(i) >= 48 || disp.charAt(i) == 46) {

                            number_string[j] = number_string[j] + disp.charAt(i);
                            number[j] = Float.parseFloat(number_string[j]);
                        } else {
                            op[j] = disp.charAt(i);
                            j++;
                        }

                    }

                    //doing calculation
                    ans = number[0];
                    for (int l = 1; l <= j; ++l) {
                        if (op[l - 1] == 43)//addition
                        {
                            ans = add_fun(ans, number[l]);
                        } else if (op[l - 1] == 45) {
                            ans = sub_fun(ans, number[l]);
                        } else if (op[l - 1] == 42) {
                            if(number[1]==0)
                            {

                            }
                            else {
                                ans = mult_fun(ans, number[l]);
                            }
                        } else if (op[l - 1] == 47) {
                            if(number[1]==0)
                            {

                            }
                            else {
                                ans = divi_fun(ans, number[l]);
                            }
                        }
                    }

//                    //checking dot
//                    int no_of_dot=0;
//
//                    for(int b=0; b<j; ++b)
//                    {
//                        int len = number_string[b].length();
//                        for(int c=0; c<len; ++c)
//                        {
//                            if(number_string[b].charAt(c)==46)
//                            {
//                                no_of_dot++;
//                            }
//                        }
//
//                    }
//
//                    if(no_of_dot >1)
//                    {
//                        show("Input error!!");
//                    }
//                    else
//                    {
//
//
//                    }

                    //displaying answer on the display
                    disp = String.valueOf(ans);
                    show(disp);
                    //updating things according to the new answer
                    disp_array.clear();
                    count = 0;

                    int length = disp.length();
                    for (int m = 0; m < length; ++m) {
                        char new_char = disp.charAt(m);

                        disp_array.add(String.valueOf(new_char));
                        count++;
                    }

                }
            }

        });
    }

    //the function to show on the display
    public void show(String show_string) {
        display.setText(show_string);
    }

    //function for addition
    public float add_fun(float x, float y) {
        return x + y;
    }

    //function for addition
    public float sub_fun(float x, float y) {
        return x - y;
    }

    //function for addition
    public float mult_fun(float x, float y) {
        return x * y;
    }

    //function for addition
    public float divi_fun(float x, float y) {
        return x / y;
    }
}
