package hernandez.angel.thecheezery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val button: Button = findViewById(R.id.btn_get_started)

        button.setOnClickListener{
            var intent: Intent = Intent(this,RegisterActivity::class.java)
            startActivity(intent)
        }
    }
}