package com.facebook.unity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.Logger;

/* loaded from: classes3.dex */
public abstract class FBUnityAppLinkBaseActivity extends Activity {
    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, "com.facebook");
        p0.startActivity(p1);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(this, "com.facebook", me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        String str = FB.TAG;
        Log.v(str, "Saving deep link from deep linking activity");
        FB.SetIntent(getIntent());
        Log.v(str, "Returning to main activity");
        startActivity(new Intent(this, getMainActivityClass()));
        finish();
    }

    private Class<?> getMainActivityClass() {
        try {
            return Class.forName(getPackageManager().getLaunchIntentForPackage(getPackageName()).getComponent().getClassName());
        } catch (Exception unused) {
            Log.e(FB.TAG, "Unable to find Main Activity Class");
            return null;
        }
    }
}
