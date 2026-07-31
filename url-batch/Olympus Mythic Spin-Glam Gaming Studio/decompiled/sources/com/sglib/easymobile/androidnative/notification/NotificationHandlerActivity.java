package com.sglib.easymobile.androidnative.notification;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.safedk.android.utils.Logger;
import com.sglib.easymobile.androidnative.Helper;

/* loaded from: classes5.dex */
public class NotificationHandlerActivity extends Activity {
    private static String sLaunchNotificationResponseJson;

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        p0.startActivity(p1);
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("NOTIF_DATA");
        NotificationResponse FromJson = NotificationResponse.FromJson(stringExtra);
        if (FromJson != null) {
            ((android.app.NotificationManager) getSystemService("notification")).cancel(FromJson.request.requestCode);
        } else {
            Helper.LogError("Could form notification response from JSON. Please check.");
        }
        if (isTaskRoot()) {
            sLaunchNotificationResponseJson = stringExtra;
            Context applicationContext = getApplicationContext();
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(this, applicationContext.getPackageManager().getLaunchIntentForPackage(applicationContext.getPackageName()));
        } else {
            NotificationUnityInterface.UnityOnLocalNotificationFromBackground(stringExtra);
        }
        finish();
    }

    static String DispatchLaunchNotificationData() {
        String str = sLaunchNotificationResponseJson;
        sLaunchNotificationResponseJson = null;
        return str;
    }
}
