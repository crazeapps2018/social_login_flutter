package com.techd.sociallogin

import io.flutter.embedding.android.FlutterActivity
import com.otpless.otplessflutter.OtplessFlutterPlugin;
import android.content.Intent;

class MainActivity: FlutterActivity() {

    override fun onNewIntent(intent: Intent) {
        super.onNewIntent(intent)
        val plugin = flutterEngine?.plugins?.get(OtplessFlutterPlugin::class.java)
        if (plugin is OtplessFlutterPlugin) {
            plugin.onNewIntent(intent)
        }
    }
    override fun onNewIntent(intent: Intent) {
        super.onNewIntent(intent)
        val plugin = flutterEngine?.plugins?.get(OtplessFlutterPlugin::class.java)
        if (plugin is OtplessFlutterPlugin) {
            plugin.onNewIntent(intent)
        }
    }
}


