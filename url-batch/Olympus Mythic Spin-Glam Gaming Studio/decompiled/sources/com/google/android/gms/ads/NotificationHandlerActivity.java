package com.google.android.gms.ads;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.ads.zzbvq;
import com.google.android.gms.internal.ads.zzbzm;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
@KeepForSdk
/* loaded from: classes6.dex */
public final class NotificationHandlerActivity extends Activity {

    @NonNull
    @KeepForSdk
    public static final String CLASS_NAME = "com.google.android.gms.ads.NotificationHandlerActivity";

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(this, h.h, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.app.Activity
    protected final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        try {
            zzbzm zzj = zzay.zzb().zzj(this, new zzbvq());
            if (zzj == null) {
                zzo.zzf("OfflineUtils is null");
            } else {
                zzj.zze(getIntent());
            }
        } catch (RemoteException e) {
            zzo.zzf("RemoteException calling handleNotificationIntent: ".concat(e.toString()));
        }
    }

    @Override // android.app.Activity
    protected final void onResume() {
        super.onResume();
        finish();
    }
}
