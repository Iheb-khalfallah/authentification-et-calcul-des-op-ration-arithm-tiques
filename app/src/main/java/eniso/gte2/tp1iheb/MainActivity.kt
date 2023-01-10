package eniso.gte2.tp1iheb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener {
            val i = Intent(this,AuthentificationActivity::class.java)
            startActivity(i)
        }
        Toast.makeText(this,"This App is developed by Iheb_Khalfallah",Toast.LENGTH_LONG).show()
    }
}