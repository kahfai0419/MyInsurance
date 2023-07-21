package my.edu.tarc.myinsurance

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import my.edu.tarc.myinsurance.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    //lateinit= late initialize
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //inflate = load UI to memory first
        binding = ActivityMainBinding.inflate(layoutInflater)
        //Show the UI
        setContentView(binding.root)
        binding.buttonCalculate.setOnClickListener{
            val age = binding.spinnerAge.selectedItemPosition
            val gender = binding.radioGroupGender.checkedRadioButtonId
            val smoker= binding.checkBoxSmoker.isChecked
            var premium = 0
            if (age == 0 ){//Less than 17
            premium += 60
            }else if (age == 1 ){//From 17 to 25
                premium += 70
                if(gender ==  binding.radioButtonMale.id){
                    premium += 50
                }
                if(smoker){
                    premium += 100
                }
            }else if (age == 2 ){//From 26 to 30
                premium += 90
                if(gender ==  binding.radioButtonMale.id){
                    premium += 100
                }
                if(smoker){
                    premium += 150
                }
            }else if (age == 3 ){//From 31 to 40
                premium += 120
                if(gender ==  binding.radioButtonMale.id){
                    premium += 150
                }
                if(smoker){
                    premium += 200
                }
            }else if (age == 4 ){//From 41 to 55
                premium += 150
                if(gender ==  binding.radioButtonMale.id){
                    premium += 200
                }
                if(smoker){
                    premium += 250
                }
            }else if (age == 5 ){//From 55 to above
                premium += 150
                if(gender ==  binding.radioButtonMale.id){
                    premium += 200
                }
                if(smoker){
                    premium += 300
                }
            }
            //Display output
            binding.textViewPremium.text = premium.toString()
        }
        binding.buttonReset.setOnClickListener{
            binding.spinnerAge.selectedItemPosition.equals(0)
            binding.radioButtonMale.id
            binding.checkBoxSmoker
            binding.textViewPremium.text = String.format("%s","")






        }


    }





}