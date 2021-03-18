package dz.algerietelecom.mycalculature

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class Pizza_Shop : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Toast.makeText(
            this,
            "onCreate",
            Toast.LENGTH_LONG
        ).show()
        setContentView(R.layout.activity_pizza__shop)
        var sizes = findViewById<RadioButton>(R.id.size_s)
        var sizem = findViewById<RadioButton>(R.id.size_m)
        var sizel = findViewById<RadioButton>(R.id.size_l)
        var opt1 = findViewById<CheckBox>(R.id.may)
        var opt2 = findViewById<CheckBox>(R.id.hrs)
        var opt3 = findViewById<CheckBox>(R.id.tom)
        var radio = findViewById<RadioGroup>(R.id.radiogroup)
        var btn = findViewById<Button>(R.id.order)
        var image = findViewById<ImageView>(R.id.image)
        var sum: Int = 0
        var type = ""

        radio.setOnCheckedChangeListener(
            RadioGroup.OnCheckedChangeListener { group, checkedId ->
                if (sizes.isChecked) {
                    image.setImageResource(R.drawable.small)
                } else if (sizem.isChecked) {
                    image.setImageResource(R.drawable.medium)
                } else if (sizel.isChecked) {
                    image.setImageResource(R.drawable.mega)
                }

            }


        )

        btn.setOnClickListener(View.OnClickListener {
            //Toast.makeText(this, "message2", Toast.LENGTH_LONG).show()
            if (sizes.isChecked) {
                sum = 5
                type = "Small"
                //image.setImageResource(R.drawable.small)


            } else if (sizem.isChecked) {
                sum = 7
                type = "Medium"
                //image.setImageResource(R.drawable.medium)

            } else if (sizel.isChecked) {
                sum = 10
                type = "Large"
                //image.setImageResource(R.drawable.mega)
            }

            if (opt1.isChecked) {
                sum = sum + 1
                type = "$type + Mayounaise"

            }
            if (opt2.isChecked) {
                sum = sum + 0
                type = "$type + Hrissa"

            }
            if (opt3.isChecked) {
                sum = sum + 2
                type = "$type + Tomate"
            }

            Toast.makeText(
                this,
                "Your Order is: $type ;Total Price is: $sum",
                Toast.LENGTH_LONG
            ).show()


        })


    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(
            this,
            "onStart",
            Toast.LENGTH_LONG
        ).show()
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(
            this,
            "onResume",
            Toast.LENGTH_LONG
        ).show()
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(
            this,
            "onPause",
            Toast.LENGTH_LONG
        ).show()
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(
            this,
            "onStop",
            Toast.LENGTH_LONG
        ).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(
            this,
            "onDestroy",
            Toast.LENGTH_LONG
        ).show()
    }


}
