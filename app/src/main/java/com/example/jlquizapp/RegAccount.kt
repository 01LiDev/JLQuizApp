package com.example.jlquizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class RegAccount : AppCompatActivity() {
    private lateinit var vFName: EditText
    private lateinit var vLName: EditText
    private lateinit var vDOB: EditText
    private lateinit var vEmail: EditText
    private lateinit var vAPSW: EditText
    private lateinit var cAccount : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.reg_account)
        if (supportActionBar != null) {
            supportActionBar!!.hide()
        }

        cAccount = findViewById(R.id.button)

        vFName = findViewById(R.id.fName)
        vLName = findViewById(R.id.lName)
        vDOB = findViewById(R.id.cDOB)
        vEmail = findViewById(R.id.cEmail)
        vAPSW = findViewById(R.id.cPassword)


        cAccount.setOnClickListener{
            val firstName = vFName.text.toString().trim()
            val lastName = vLName.text.toString().trim()
            val password = vAPSW.text.toString().trim()
            val email = vEmail.text.toString().trim()
            val DOB = vDOB.text.toString().trim()
            if (firstName.isEmpty()){
                vFName.error = "First Name is Missing"
                return@setOnClickListener
            }else if (firstName.length > 30 ){
                vFName.error = "Max is 30 characters"
                return@setOnClickListener
            }else if ( firstName.length < 3){
                vFName.error = "Enter more than 3 characters"
                return@setOnClickListener
            }else if ( lastName.isEmpty()){
                vLName.error = "Missing Last Name"
                return@setOnClickListener
            }else if ( password.isEmpty()){
                vAPSW.error = "Missing Password"
                return@setOnClickListener
            }else if ( email.isEmpty()){
                vEmail.error = "Missing email"
                return@setOnClickListener
            }else if ( DOB.isEmpty()){
                vDOB.error = "Missing Date of Birth"
                return@setOnClickListener
            }else if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
                vEmail.error = "Invalid Email"
                return@setOnClickListener
            }else{
                val text = "Account has been created!"
                val duration = Toast.LENGTH_SHORT
                val toast = Toast.makeText(applicationContext, text, duration)
                toast.show()
                val intent = Intent(this, Login::class.java)
                startActivity(intent)
            }

        }
    }
}