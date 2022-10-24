package mx.tec.testsipc

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SingIn : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sing_in)

        val register = findViewById<Button>(R.id.registerbtn)

        register.setOnClickListener() {
            val intent = Intent(this@SingIn, MainPage::class.java)
            startActivity(intent)
        }
    }
}