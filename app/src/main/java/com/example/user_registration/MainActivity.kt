package com.example.user_registration

import android.app.DatePickerDialog
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.util.Calendar

class MainActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener {
    private val languages= arrayOf("Nepali","Nepal","Hindi","Maithali","English")
    var data= arrayOf("Nepal","china","Bhutan","India","Pakistan")
    lateinit var date:TextView
    lateinit var Name:EditText
    lateinit var email:EditText
    lateinit var password:EditText
    lateinit var imgbutton:ImageButton
    lateinit var spinner: Spinner
    lateinit var autoCompleteTextView: AutoCompleteTextView
    lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        date=findViewById(R.id.textView3)
        Name=findViewById(R.id.editTextText)
        email=findViewById(R.id.editTextTextEmailAddress)
        password=findViewById(R.id.editTextTextPassword)
        spinner=findViewById(R.id.spinner)
        autoCompleteTextView=findViewById(R.id.autoCompleteTextView)
        button=findViewById(R.id.button)

        val autocompleteAdapter= ArrayAdapter(
            this,
            android.R.layout.simple_dropdown_item_1line,
            languages
        )
        autoCompleteTextView.setAdapter(autocompleteAdapter)
        autoCompleteTextView.threshold=1

        button.setOnClickListener{
            Toast.makeText(applicationContext, "you are registring", Toast.LENGTH_SHORT)
                .show()

        }
        date.setOnClickListener{
            loadCalander()
        }

        var adapter=ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,data)
        adapter.setDropDownViewResource(
            android.R.layout.simple_spinner_dropdown_item
        )

        spinner.adapter=adapter
        spinner.onItemSelectedListener=this

    }
    private fun loadCalander(){
        val c= Calendar.getInstance()
        val year=c.get(Calendar.YEAR)
        val month=c.get(Calendar.MONTH)
        val day=c.get(Calendar.DAY_OF_MONTH)

        val datePickerDialog= DatePickerDialog(this,
            {view,year,monthOfYear,dayofMonth->date.text="Selected Date:{$dayofMonth/${monthOfYear + 1}/$year"},year,month,day)

        datePickerDialog.show()
    }

    override fun onItemSelected(parent: AdapterView<*>?, p1: View?, index: Int, p3: Long) {


    }

    override fun onNothingSelected(p0: AdapterView<*>?) {
    }


}