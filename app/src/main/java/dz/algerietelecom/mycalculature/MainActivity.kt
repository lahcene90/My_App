package dz.algerietelecom.mycalculature

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.lang.Error

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var x_value = findViewById<EditText>(R.id.x_value)
        var y_value = findViewById<EditText>(R.id.y_value)
        var z_value  = findViewById<TextView>(R.id.z_value)
        var plus = findViewById<Button>(R.id.plus_button)
        var moin = findViewById<Button>(R.id.moin_button)
        var mul = findViewById<Button>(R.id.mul_button)
        var dev = findViewById<Button>(R.id.dev_button)
        var R:String=("error")



        plus.setOnClickListener(View.OnClickListener {

            z_value.text = sum_a(x_value.text.toString().toFloat() ,y_value.text.toString().toFloat())
        })
        moin.setOnClickListener(View.OnClickListener {

            z_value.text = moin(x_value.text.toString().toFloat() ,y_value.text.toString().toFloat())
        })

    }
    fun sum_a (x_value: Float, y_value: Float): String {
        var z=x_value+y_value
        return z.toString()
    }
    fun moin(x_value: Float, y_value: Float): String {
        var z=x_value - y_value
        return z.toString()

    }
}