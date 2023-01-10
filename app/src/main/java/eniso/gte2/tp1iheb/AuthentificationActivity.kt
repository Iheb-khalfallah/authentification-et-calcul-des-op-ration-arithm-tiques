package eniso.gte2.tp1iheb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import java.text.DateFormat
import java.util.Date
/// hedhi t3ayat lel plugin
import kotlinx.android.synthetic.main.activity_authentification.*

class AuthentificationActivity : AppCompatActivity() {
    fun afficherDate(){
        val d = Date()
        val df = DateFormat.getDateInstance(DateFormat.LONG)
        val tf = DateFormat.getTimeInstance(DateFormat.LONG)
        val fd = df.format(d)
        val ft = tf.format(d)
        textView3.text= fd + "\n" + ft ;
        // ou bien textView3.text ="$fd \n $ft"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_authentification)
        // 1 lors du chargement de l'activité
        afficherDate();
        // 2 lors de clic sur le botton update
        button2.setOnClickListener {
            afficherDate();
        }

        button.setOnClickListener {
            val login = editTextTextPersonName.text.toString()
            val pass = editTextTextPassword.text.toString()
            if (pass == "pw$login"){
                Toast.makeText(this,"Données Correct",Toast.LENGTH_LONG).show()
                val i =Intent(this,ComputeActivity::class.java)
                startActivity(i)
            }
            else {
                Toast.makeText(this,"Données erronées",Toast.LENGTH_LONG).show()
            }

        }


    }
}