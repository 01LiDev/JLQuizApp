package com.example.jlquizapp

import android.app.AlertDialog
import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat.startActivity


var counter = 0
var currentQuestion = 0
var correct = false
var inputAnswer = false

class Quiz : AppCompatActivity() {
    private lateinit var choice1: RadioButton
    private lateinit var choice2: RadioButton
    private lateinit var choice3: RadioButton
    private lateinit var choice4: RadioButton
    private lateinit var question: TextView
    private lateinit var editAnswer: EditText
    private lateinit var confirm: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.quiz)
        if (supportActionBar != null) {
            supportActionBar!!.hide()
        }
        choice1 = findViewById(R.id.choice1)
        choice2 = findViewById(R.id.choice2)
        choice3 = findViewById(R.id.choice3)
        choice4 = findViewById(R.id.choice4)
        editAnswer = findViewById(R.id.editAnswer)
        question = findViewById(R.id.question)
        confirm = findViewById(R.id.confirm_button)

        viewGone()
        choice1.visibility = View.VISIBLE
        choice2.visibility = View.VISIBLE
        choice3.visibility = View.VISIBLE
        choice4.visibility = View.VISIBLE
        confirm.setOnClickListener {
            confirmation(currentQuestion)
        }


    }

    private fun question1() {
        currentQuestion++
        question.text = getString(R.string.question1)
        viewGone()
        choice1.visibility = View.VISIBLE
        choice2.visibility = View.VISIBLE
        choice3.visibility = View.VISIBLE
        choice4.visibility = View.VISIBLE

        choice1.text = "Dark Chocolate"
        choice2.text = "Peanut Butter"
        choice3.text = "Canned Tuna"
        choice4.text = "Honey"

        confirm.setOnClickListener {
            confirmation(currentQuestion)
        }
    }

    private fun question2() {
        currentQuestion++
        question.text = "Australia is a country as well as a continent"
        viewGone()
        choice1.visibility = View.VISIBLE
        choice2.visibility = View.VISIBLE
        choice1.text = "True"
        choice2.text = "False"
        confirm.setOnClickListener {
            confirmation(currentQuestion)
        }
    }

    private fun question3() {
        currentQuestion++
        question.text = "The human body consists of 150 bones"
        viewGone()
        choice1.visibility = View.VISIBLE
        choice2.visibility = View.VISIBLE
        choice1.text = "True"
        choice2.text = "False"
        confirm.setOnClickListener {
            confirmation(currentQuestion)
        }
    }

    private fun question4() {
        currentQuestion++
        question.text = "What is the most visited tourist attraction in the world?"
        viewGone()
        choice1.visibility = View.VISIBLE
        choice2.visibility = View.VISIBLE
        choice3.visibility = View.VISIBLE
        choice4.visibility = View.VISIBLE
        choice1.text = "Great Wall of China"
        choice2.text = "Statue of Liberty"
        choice3.text = "Eiffel Tower"
        choice4.text = "Colosseum"
        confirm.setOnClickListener {
            confirmation(currentQuestion)

        }
    }

    private fun question5() {
        currentQuestion++
        question.text = "What word is spelled incorrectly in every single dictionary?"
        viewGone()
        editAnswer.visibility = View.VISIBLE
        confirm.setOnClickListener {
            confirmation(currentQuestion)
        }
    }

    private fun question6() {
        currentQuestion++
        question.text = "The Mississippi and the Nile are the two longest rivers in the world"
        viewGone()
        choice1.visibility = View.VISIBLE
        choice2.visibility = View.VISIBLE
        choice1.text = "True"
        choice2.text = "False"
        confirm.setOnClickListener {
            confirmation(currentQuestion)
        }
    }

    private fun question7() {
        currentQuestion++
        question.text =
            "What type of food holds the world record for being the most stolen around the globe?"
        viewGone()
        choice1.visibility = View.VISIBLE
        choice2.visibility = View.VISIBLE
        choice3.visibility = View.VISIBLE
        choice4.visibility = View.VISIBLE
        choice1.text = "Wagyu Beef"
        choice2.text = "Cheese"
        choice3.text = "Coffee"
        choice4.text = "Rice"
        confirm.setOnClickListener {

            confirmation(currentQuestion)
        }
    }

    private fun question8() {
        editAnswer.text.clear()
        currentQuestion++
        question.text = "If there are eight oranges in a bag and you take away two, how many do you have?"
        viewGone()
        editAnswer.visibility = View.VISIBLE
        confirm.setOnClickListener {
            confirmation(currentQuestion)
        }
    }

    private fun viewGone() {
        choice1.visibility = View.GONE
        choice2.visibility = View.GONE
        choice3.visibility = View.GONE
        choice4.visibility = View.GONE
        editAnswer.visibility = View.GONE
    }

    private fun confirmation(currentQuestion: Int) {
        val dialogBuilder = AlertDialog.Builder(this)
        // set message of alert dialog
        when (currentQuestion) {
            0 -> {
                dialogBuilder.setMessage("Are you sure with your choice?")
                    .setCancelable(false)
                    // positive button text and action
                    .setPositiveButton("Yes", DialogInterface.OnClickListener { dialog, id ->
                        if(choice1.isChecked){
                            counter++
                            Log.d("Main", "answer is correct question 0")
                        }
                        question1()
                    })
                    // negative button text and action
                    .setNegativeButton("No", DialogInterface.OnClickListener { dialog, id ->
                        dialog.cancel()
                    })
            }
            1 -> {
                dialogBuilder.setMessage("Are you sure with your choice?")
                    .setCancelable(false)
                    // positive button text and action
                    .setPositiveButton("Yes", DialogInterface.OnClickListener { dialog, id ->
                        if(choice4.isChecked){
                            counter++
                            Log.d("Main", "answer is correct question 1")
                        }
                        question2()
                    })
                    // negative button text and action
                    .setNegativeButton("No", DialogInterface.OnClickListener { dialog, id ->
                        dialog.cancel()
                    })
            }
            2 -> {
                dialogBuilder.setMessage("Are you sure with your choice?")
                    .setCancelable(false)
                    // positive button text and action
                    .setPositiveButton("Yes", DialogInterface.OnClickListener { dialog, id ->
                        if (choice1.isChecked){
                            counter++
                            Log.d("Main", "answer is correct question 2")
                        }
                        question3()
                    })
                    // negative button text and action
                    .setNegativeButton("No", DialogInterface.OnClickListener { dialog, id ->
                        dialog.cancel()
                    })
            }
            3 -> {
                dialogBuilder.setMessage("Are you sure with your choice?")
                    .setCancelable(false)
                    // positive button text and action
                    .setPositiveButton("Yes", DialogInterface.OnClickListener { dialog, id ->
                        if(choice2.isChecked){
                            counter++
                            Log.d("Main", "answer is correct question 3")
                        }
                        question4()
                    })
                    // negative button text and action
                    .setNegativeButton("No", DialogInterface.OnClickListener { dialog, id ->
                        dialog.cancel()
                    })
            }
            4 -> {
                dialogBuilder.setMessage("Are you sure with your choice?")
                    .setCancelable(false)
                    // positive button text and action
                    .setPositiveButton("Yes", DialogInterface.OnClickListener { dialog, id ->
                        if(choice3.isChecked){
                            counter++
                            Log.d("Main", "answer is correct question 4")
                        }
                        question5()
                    })
                    // negative button text and action
                    .setNegativeButton("No", DialogInterface.OnClickListener { dialog, id ->
                        dialog.cancel()
                    })
            }
            5 -> {
                dialogBuilder.setMessage("Are you sure with your answer?")
                    .setCancelable(false)
                    // positive button text and action
                    .setPositiveButton("Yes", DialogInterface.OnClickListener { dialog, id ->
                        if(editAnswer.text.toString().lowercase() == "incorrectly"){
                            counter++
                            Log.d("Main", "answer is correct question 5")
                        }
                        question6()
                    })
                    // negative button text and action
                    .setNegativeButton("No", DialogInterface.OnClickListener { dialog, id ->
                        dialog.cancel()
                    })
            }
            6 -> {
                dialogBuilder.setMessage("Are you sure with your choice?")
                    .setCancelable(false)
                    // positive button text and action
                    .setPositiveButton("Yes", DialogInterface.OnClickListener { dialog, id ->
                        if (choice2.isChecked) {
                            counter++
                            Log.d("Main", "answer is correct question 6")
                        }
                        question7()
                    })
                    // negative button text and action
                    .setNegativeButton("No", DialogInterface.OnClickListener { dialog, id ->
                        dialog.cancel()
                    })
            }
            7 -> {
                dialogBuilder.setMessage("Are you sure with your choice?")
                    .setCancelable(false)
                    // positive button text and action
                    .setPositiveButton("Yes", DialogInterface.OnClickListener { dialog, id ->
                        if (choice2.isChecked) {
                            counter++
                            Log.d("Main", "answer is correct question 7")
                        }
                        question8()
                    })
                    // negative button text and action
                    .setNegativeButton("No", DialogInterface.OnClickListener { dialog, id ->
                        dialog.cancel()
                    })
            }
            8 -> {
                val intent = Intent(this, Stats::class.java)
                dialogBuilder.setMessage("Are you sure with your answer?")
                    .setCancelable(false)
                    // positive button text and action
                    .setPositiveButton("Yes", DialogInterface.OnClickListener { dialog, id ->
                        if(editAnswer.text.toString().lowercase() == "2" || editAnswer.text.toString().lowercase() == "two"){
                            counter++
                            Log.d("Main", "answer is correct question 8")
                        }
                        startActivity(intent)
                    })
                    // negative button text and action
                    .setNegativeButton("No", DialogInterface.OnClickListener { dialog, id ->
                        dialog.cancel()
                    })
            }
        }
            // create dialog box
            val alert = dialogBuilder.create()
            // set title for alert dialog box
            alert.setTitle("Confirmation")
            // show alert dialog
            alert.show()
    }
}
