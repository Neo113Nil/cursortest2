package com.google.firebase.analytics;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import com.google.android.gms.internal.measurement.zzff;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* compiled from: com.google.android.gms:play-services-measurement-api@@22.4.0 */
/* loaded from: classes4.dex */
public class GoogleAnalyticsServerPreviewActivity extends Activity {
    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(this, "com.google.firebase.analytics", me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        zzff.zzg(this, null, null, null, null).zzN(getIntent());
        finish();
    }
}
