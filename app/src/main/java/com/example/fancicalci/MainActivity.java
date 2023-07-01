package com.example.fancicalci;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import com.example.fancicalci.databinding.ActivityMainBinding;

import org.mariuszgromada.math.mxparser.Expression;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.one.setOnClickListener(
                v ->{
                    binding.one.setBackground(getDrawable(R.drawable.after_pressed));
                    binding.inputtext.append("1"
                    );

                    binding.one.postDelayed(
                            new Runnable() {
                                @Override
                                public void run() {
                                         binding.one.setBackground(getDrawable(R.drawable.buttonstyle));
                                }
                            } , 300
                    );
                }
        );

        binding.two.setOnClickListener(
                v ->{
                   binding.inputtext.append("2");
                }
        );

        binding.three.setOnClickListener(

                v ->{
                    binding.inputtext.append("3");
                }
        );

        binding.four.setOnClickListener(
                v ->{
                    binding.inputtext.append("4");
                }
        );

        binding.five.setOnClickListener(
                v ->{
                    binding.inputtext.append("5");

                }
        );

        binding.six.setOnClickListener(
                v ->{
                    binding.inputtext.append("6");

                }
        );

        binding.seven.setOnClickListener(

                v ->{
                    binding.inputtext.append("7");
                }
        );

        binding.eight.setOnClickListener(
                v->{
                    binding.inputtext.append("8");

                }
        );

        binding.nine.setOnClickListener(
                v->{
                    binding.inputtext.append("9");
                }
        );

        binding.zero.setOnClickListener(
                v -> {
                      binding.inputtext.append("0");

                }
        );

        binding.additions.setOnClickListener(
                v ->{
                    binding.inputtext.append("+");
                }
        );

        binding.substraction.setOnClickListener(
                v ->{
                    binding.inputtext.append("-");
                }
        );

        binding.multiplication.setOnClickListener(
                v ->{
                    binding.inputtext.append("*");
                }
        );

        binding.division.setOnClickListener(
                v ->{
                    binding.inputtext.append("/");
                }
        );

        binding.allclear.setOnClickListener(
                v->{
                    binding.inputtext.setText("");
                    binding.outputtext.setText("");
                }
        );

        binding.equals.setOnClickListener(
                v ->{
                    Expression obj = new Expression(binding.inputtext.getText().toString());
                    String result = String.valueOf(obj.calculate());
                    binding.outputtext.setText(result);
                }
        );










    }
}