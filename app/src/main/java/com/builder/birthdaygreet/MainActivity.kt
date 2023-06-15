package com.builder.birthdaygreet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.reflect.Method

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        method 1:
//        createBirthdayCard.setOnClickListener{
//
//        }
    }


//        Method 2: Android:onClock="method_name"
    fun createBirthdayCard(view: View)
    {
//        Toast message is displayed on app
//        example 1
//        Toast.makeText(this,"Button was Clicked",Toast.LENGTH_LONG).show()

//        example 2
        val name = nameInput.editableText.toString()
//        Toast.makeText(this,"Greeting for $name is being generated. ",Toast.LENGTH_LONG).show()

        val intent = Intent(this,BirthdayGreetingActivity::class.java)
        intent.putExtra(BirthdayGreetingActivity.Name_extra,name)
        startActivity(intent)
    }
}