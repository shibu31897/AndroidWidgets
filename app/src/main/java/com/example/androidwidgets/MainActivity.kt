package com.example.androidwidgets

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import androidx.core.view.get
const val KEY_1 = "Name"
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var checkbox : CheckBox = findViewById(R.id.checkBox)
        var radioGroup : RadioGroup = findViewById(R.id.radiogroup)
        var toggleButton : ToggleButton = findViewById(R.id.toggleButton2)
        var switch : Switch = findViewById(R.id.switch1)
        var button : Button = findViewById(R.id.button)
        checkbox.setOnCheckedChangeListener { buttonView, isChecked ->
            Toast.makeText(this, "Checkbox is $isChecked", Toast.LENGTH_SHORT).show()
        }
        radioGroup.setOnCheckedChangeListener { group, checkedId ->
            when(checkedId){
                R.id.radioButton1 -> {
                    Toast.makeText(this, "radiobutton 1 is checked", Toast.LENGTH_SHORT).show()
                }
            }
        }
        toggleButton.setOnCheckedChangeListener { buttonView, isChecked ->
            Toast.makeText(this, "btton is checked to $isChecked", Toast.LENGTH_SHORT).show()
        }
        switch.setOnCheckedChangeListener { buttonView, isChecked ->
            Toast.makeText(this, "Is $isChecked", Toast.LENGTH_SHORT).show()
        }
        button.setOnClickListener {
            val i = Intent(applicationContext,MainActivity2::class.java)
            i.putExtra(KEY_1,"Harshit")
            startActivity(i)
        }

    }
}