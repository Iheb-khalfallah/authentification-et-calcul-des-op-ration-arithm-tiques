package eniso.gte2.tp1iheb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_compute.*

class ComputeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_compute)

        radioGroup.setOnCheckedChangeListener{group , checkedId->
            when(checkedId){
                R.id.radioButton1->{
                    t1.visibility = View.VISIBLE
                    t2.visibility = View.VISIBLE
                    e1.visibility = View.VISIBLE
                    e2.visibility = View.VISIBLE
                    t1.hint="value1"
                    e1.hint="value1"
                }
                radioButton2.id->{
                    t1.visibility = View.VISIBLE
                    e1.visibility = View.VISIBLE
                    t1.hint="value"
                    e1.hint="value"
                    t2.visibility = View.INVISIBLE
                    e2.visibility = View.INVISIBLE
                }
            }
        }
        button.setOnClickListener {
            if (radioButton1.isChecked){
                val a = e1.text.toString().toInt()
                val b = e2.text.toString().toInt()
                val s = a+b
                res.text = "$s"
            }
            else if (radioButton2.isChecked){
                val a = e1.text.toString().toInt()
                val s = a*a
                res.text = "$s"
            }
        }
    }
}