package com.vit.demonative

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.androidyuan.aesjni.AESEncrypt
import com.androidyuan.aesjni.SignatureTool

class MainActivity : AppCompatActivity() {

    private val str = "https://api.splayer.dev/settings/"
    private val ecode = "cwx1lCk7VmLapybncRknq8U9o2Qoe2V/P7BaZl+zyFjQItVMulZVfzfnWp4uuDfz"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //String code = AESEncrypt.encode(this, str);

        //下面的密文对应的原文：123abcABC&*(@#@#@)+_/中文测试
//        val code = AESEncrypt.encode(this, str);
//        val code = AESEncrypt.decode(this, ecode)

        Log.e("code",   "${AESEncrypt.adMobId()}")
        Log.e("code", "${SignatureTool.getSignature(applicationContext)}")

//        AESEncrypt.checkSignature(applicationContext)

        findViewById<TextView>(R.id.sample_text).setOnClickListener {
            startActivity(Intent(this, MainActivity2::class.java))
        }

    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */

}