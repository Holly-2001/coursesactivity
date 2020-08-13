package com.example.hello_h

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_registration_activityh.*


class Registration : AppCompatActivity() {
            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                val value: Any =
                    setContentView(R.layout.activity_registration_activityh)
                btnlogin.setOnClickListener {
                    var firstname = edtfirstname.text.toString()
                    var lastname = edtlastname.text.toString()
                    var email = edtemail.text.toString()
                    var phoneNumber = edtphonenumber.text.toString()
                    var password = edtphonenumber.text.toString()
                    var confirm = edtconfirmpassword.text.toString()
                    Toast.makeText(baseContext, password, Toast.LENGTH_LONG).show()
                    Toast.makeText(baseContext, confirm, Toast.LENGTH_LONG).show()
                    Toast.makeText(baseContext, email, Toast.LENGTH_LONG).show()
                }

            }
}