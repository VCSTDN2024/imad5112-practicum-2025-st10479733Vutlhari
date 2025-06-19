package vcmsa.ci.musicplaylistapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DetailedScreen : AppCompatActivity() {
    private lateinit var listTxt: TextView
    private lateinit var avgTxt: TextView
    private lateinit var listButton: Button
    private lateinit var avgButton: Button
    private lateinit var backButton: Button

    private val songs = arrayOf(
        "Popstar",
        "Banana Clip",
        "Static",
        "Cruel Summer",
        "BeckHam",

    )

    private val artists = arrayOf(
        "Coco and Clair Clair",
        "Miguel",
        "Steve Lacy",
        "Kevin Gates",

    )

    private val ratings = arrayOf(
        3,
        4,
        2,
        1,

        )

    private val comments = arrayOf(
        "Dance song",
        "Love song",
        "Memories",
        "rap",

    )



    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detailed_screen)

        listTxt = findViewById(R.id.listTxt)
        avgTxt = findViewById(R.id.avgTxt)
        listButton = findViewById(R.id.listButton)
        avgButton = findViewById(R.id.avgButton)
        backButton = findViewById(R.id.backButton)

       listButton.setOnClickListener {
           val builder = StringBuilder()
           for (i in songs.indices) {
               builder.append("${songs[i]}:/n")
               builder.append("Artists: ${artists[i]}/n")
               builder.append("Ratings: ${ratings[i]}/n")
               builder.append("Comments: ${comments[i]}/n") // change 1
           }
           listTxt.visibility = View.VISIBLE
           listTxt.text = builder.toString() //Review text


       }



            backButton.setOnClickListener {
                startActivity(Intent(this, MainActivity::class.java))
            }
        avgButton.setOnClickListener {
            var sum= 0
            for (num in ratings)
                sum += num

            val average =  sum/ratings.size

            avgTxt.text="The average is: $average"
            avgTxt.visibility = View.VISIBLE
        }

    }
    }






