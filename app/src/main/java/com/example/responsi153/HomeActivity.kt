package com.example.responsi153

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.responsi153.Adapter.AdapterList
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {
    val namasoft = arrayOf<String>(
        "McAfee Anti-Virus",
        "Sophos Anti-Virus",
        "ESET Anti-Virus",
        "WebrootAnti-Virus",
        "F-Secure Anti-Virus",
        "Cyclance Anti-Virus",
        "Bitdefender Anti-Virus",
        "Emsisoft Anti-Virus",
        "Norton Anti-Virus",
        "Kaspersky Anti-Virus"
    )
    val deskripsisoft = arrayOf<String>(
        "Gratis dan memiliki perlindungan efektif",
        "Sudah teruji oleh berbagai operating sistem",
        "Gratis dan memiliki perlindungan efektif",
        "Sudah teruji oleh berbagai operating sistem",
        "Gratis dan memiliki perlindungan efektif",
        "Sudah teruji oleh berbagai operating sistem",
        "Gratis dan memiliki perlindungan efektif",
        "Sudah teruji oleh berbagai operating sistem",
        "Gratis dan memiliki perlindungan efektif",
        "Sudah teruji oleh berbagai operating sistem")

    val iconsoft = arrayOf<Int>(
        R.drawable.img1,
        R.drawable.img2,
        R.drawable.img3,
        R.drawable.img4,
        R.drawable.img5,
        R.drawable.img6,
        R.drawable.img7,
        R.drawable.img8,
        R.drawable.img9,
        R.drawable.img10
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val ap = AdapterList(this, namasoft, deskripsisoft, iconsoft)
        listsoft.adapter = ap

        listsoft.setOnItemClickListener() { adapterView, view, position, id ->
            val itemAtPos = adapterView.getItemAtPosition(position)
            val itemIdAtPos = adapterView.getItemIdAtPosition(position)
            Toast.makeText(this, "${namasoft[position]} Anti Virus ini  ${deskripsisoft[position]}",
                Toast.LENGTH_LONG
            ).show()
        }
    }
}
