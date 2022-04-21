package id.ac.polbeng.amandaagungpermata.p6pro6

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menu?.add("Web")
        menu?.add("Map")
        menu?.add("Phone")
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        var mUri: Uri
        var mIntent: Intent = Intent()
        when (item.toString()) {
            "Web" -> {
                mUri = Uri.parse("https://www.youtube.com")
                mIntent = Intent(Intent.ACTION_VIEW, mUri)
            }
            "Map" -> {
                mUri = Uri.parse("geo:40.7113399,-74.0263469")
                mIntent = Intent(Intent.ACTION_VIEW, mUri)
            }
            "Phone" -> {
                mUri = Uri.parse("tel:082261976193")
                mIntent = Intent(Intent.ACTION_VIEW, mUri)
            }
        }
        startActivity(mIntent)
        return true
    }
}