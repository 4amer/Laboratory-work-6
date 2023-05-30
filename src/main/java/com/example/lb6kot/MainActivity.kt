package com.example.lb6kot

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    //Просто замените url где вы брали картинку, и поменяйте картинку на лэйауте

    var url: String = "https://i.pinimg.com/564x/e2/b8/99/e2b8999fade31e3b218df7a411ebcb34.jpg";
    lateinit var txt: TextView;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);
        txt = findViewById(R.id.textView);
        txt.setText(url);
    }

    fun browser(view: View){
        var browserIntent: Intent = Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(browserIntent);
    }
}