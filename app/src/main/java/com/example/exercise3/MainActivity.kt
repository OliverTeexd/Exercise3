package com.example.exercise3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonCalculate.setOnClickListener { cal() }
        buttonReset.setOnClickListener{reset()}
    }

    private fun cal() {
        val age = spinnerAge.selectedItem.toString()
        val gender1 = radioGroupGender.checkedRadioButtonId
        val gender = resources.getResourceEntryName(gender1)

        if (age == "Less than 17") {
            textViewPremium.text = String.format("Insurance Premium:\nPrice: RM 60")
        } else if (age == "17 to 25") {
            if (gender == "radioButtonMale" && checkBoxSmoker.isChecked) {
                textViewPremium.text = String.format("Insurance Premium:\nPrice: RM 70 \nExtra payment for Male: RM 50 \nExtra payment for Smoker: RM 100 \nTotal : RM 220")
            } else if (gender == "radioButtonFemale" && checkBoxSmoker.isChecked) {
                textViewPremium.text = String.format("Insurance Premium:\nPrice: RM 70 \nExtra payment for Smoker: RM 100 \nTotal: RM 170")
            } else if (gender == "radioButtonMale") {
                textViewPremium.text = String.format("Insurance Premium:\nPrice: RM 70\nExtra payment for Male: RM 50 \nTotal : RM 120")
            } else
                textViewPremium.text = String.format("Insurance Premium:\nPrice: RM 70")
        }else if (age == "26 to 30") {
            if (gender == "radioButtonMale" && checkBoxSmoker.isChecked) {
                textViewPremium.text = String.format("Insurance Premium:\nPrice: RM 90 \nExtra payment for Male: RM 50 \nExtra payment for Smoker: RM 100 \nTotal : RM 340")
            } else if (gender == "radioButtonFemale" && checkBoxSmoker.isChecked) {
                textViewPremium.text = String.format("Insurance Premium:\nPrice: RM 90 \nExtra payment for Smoker: RM 100 \nTotal: RM 240")
            } else if (gender == "radioButtonMale") {
                textViewPremium.text = String.format("Insurance Premium:\nPrice: RM 90\nExtra payment for Male: RM 50 \nTotal : RM 140")
            } else
                textViewPremium.text = String.format("Insurance Premium:\nPrice: RM 90")
        }else if (age == "31 to 40") {
            if (gender == "radioButtonMale" && checkBoxSmoker.isChecked) {
                textViewPremium.text = String.format("Insurance Premium:\nPrice: RM 120 \nExtra payment for Male: RM 150 \nExtra payment for Smoker: RM 200 \nTotal : RM 470")
            } else if (gender == "radioButtonFemale" && checkBoxSmoker.isChecked) {
                textViewPremium.text = String.format("Insurance Premium:\nPrice: RM 120 \nExtra payment for Smoker: RM 200 \nTotal: RM 320")
            } else if (gender == "radioButtonMale") {
                textViewPremium.text = String.format("Insurance Premium:\nPrice: RM 120\nExtra payment for Male: RM 150 \nTotal : RM 270")
            } else
                textViewPremium.text = String.format("Insurance Premium:\nPrice: RM 120")
        }else if (age == "41 to 55") {
            if (gender == "radioButtonMale" && checkBoxSmoker.isChecked) {
                textViewPremium.text = String.format("Insurance Premium:\nPrice: RM 150 \nExtra payment for Male: RM 200 \nExtra payment for Smoker: RM 250 \nTotal : RM 600")
            } else if (gender == "radioButtonFemale" && checkBoxSmoker.isChecked) {
                textViewPremium.text = String.format("Insurance Premium:\nPrice: RM 150 \nExtra payment for Smoker: RM 250 \nTotal: RM 400")
            } else if (gender == "radioButtonMale") {
                textViewPremium.text = String.format("Insurance Premium:\nPrice: RM 150\nExtra payment for Male: RM 200 \nTotal : RM 350")
            } else
                textViewPremium.text = String.format("Insurance Premium:\nPrice: RM 150")
        }else if (age == "More than 55") {
            if (gender == "radioButtonMale" && checkBoxSmoker.isChecked) {
                textViewPremium.text = String.format("Insurance Premium:\nPrice: RM 150 \nExtra payment for Male: RM 200 \nExtra payment for Smoker: RM 300 \nTotal : RM 650")
            } else if (gender == "radioButtonFemale" && checkBoxSmoker.isChecked) {
                textViewPremium.text = String.format("Insurance Premium:\nPrice: RM 150 \nExtra payment for Smoker: RM 300 \nTotal: RM 450")
            } else if (gender == "radioButtonMale") {
                textViewPremium.text = String.format("Insurance Premium:\nPrice: RM 150\nExtra payment for Male: RM 200 \nTotal : RM 350")
            } else
                textViewPremium.text = String.format("Insurance Premium:\nPrice: RM 150")
        }
    }
    private fun reset(){
        textViewPremium.text = null
    }
}
