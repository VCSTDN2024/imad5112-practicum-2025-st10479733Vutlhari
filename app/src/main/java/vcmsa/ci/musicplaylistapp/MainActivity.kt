package vcmsa.ci.musicplaylistapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var songTxt: EditText // user will enter input on the songs they are looking for
    private lateinit var artistTxt: EditText
    private lateinit var rateTxt: EditText
    private lateinit var commentTxt: EditText
    private lateinit var playlistButton: Button
    private lateinit var nextButton: Button
    private lateinit var exitButton: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        songTxt = findViewById(R.id.songTxt)
        artistTxt = findViewById(R.id.artistTxt)
        rateTxt = findViewById(R.id.rateTxt)
        commentTxt = findViewById(R.id.commentTxt)
        playlistButton = findViewById(R.id.playlistButton)
        nextButton = findViewById(R.id.nextButton)
        exitButton = findViewById(R.id.exitButton)

// user will click on the button and information will be displayed
        playlistButton.setOnClickListener {
        songTxt.visibility = View.VISIBLE
        artistTxt.visibility = View.VISIBLE
        rateTxt.visibility = View.VISIBLE
        commentTxt.visibility = View.VISIBLE

        }
//
        nextButton.setOnClickListener {
            startActivity(Intent(this,DetailedScreen::class.java))
        }
        exitButton.setOnClickListener {
            finishAffinity()
            Toast.makeText(this,"Exiting",Toast.LENGTH_SHORT).show()
        }
        }
        }

