package mx.tec.testsipc

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class UserSettings : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.user_settings)

        val LogOut = findViewById<Button>(R.id.logOut)

        LogOut.setOnClickListener() {
            val intent = Intent(this@UserSettings, MainActivity::class.java)
            startActivity(intent)
        }
    }
}