package com.example.loan

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.loan.databinding.ActivityMainBinding
import java.security.KeyStore

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_main)
        //setContentView(R.layout.activity_main)


        binding.buttonCalculate.setOnClickListener{
            val sellingPrice=binding.editTextSellingPrice.text.toString().toInt()
            val downPayment=binding.editTextDownPayment.text.toString().toInt()
            val firstTimeBuyer=binding.checkBoxFirstTime.isChecked

            var legalFee:Float=0.0f
            var stampDuty:Float=0.0f
            var loanAmount=sellingPrice-downPayment
            if(firstTimeBuyer==true){

                if(downPayment>= sellingPrice*0.1){

                    //This is ok
                }else{


                }
            }else{



            }

            val myLoan=Loan(legalFee.toString(),stampDuty.toString())
            binding.myLoan=myLoan


        }
        binding.buttonReset.setOnClickListener{
            val myLoan=Loan("","")
            //binding.myLoan is defined in the data binding - layout file
            //myLoan is a local variable
            binding.myLoan=myLoan


        }
        binding.imageButtonPhone.setOnClickListener{
            val intent=Intent(Intent.ACTION_DIAL)
            intent.data=Uri.parse("tel:0172781741")
            startActivity(intent)

        }
    }
}