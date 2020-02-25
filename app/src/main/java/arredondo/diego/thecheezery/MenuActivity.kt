package arredondo.diego.thecheezery

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_menu.*

class MenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        btncold.setOnClickListener {startActivity(Intent(this, ColdDrinksActivity::class.java)) }
        btnhot.setOnClickListener {startActivity(Intent(this, HotDrinks::class.java)) }
        btnsweets.setOnClickListener {startActivity(Intent(this, SweetsActivity::class.java)) }
        btnsalties.setOnClickListener {startActivity(Intent(this, SaltiesActivity::class.java)) }
        btncombos.setOnClickListener {startActivity(Intent(this, CombosActivity::class.java)) }
        btnpersonalized.setOnClickListener {startActivity(Intent(this, PersonalizedActivity::class.java)) }
    }
}
