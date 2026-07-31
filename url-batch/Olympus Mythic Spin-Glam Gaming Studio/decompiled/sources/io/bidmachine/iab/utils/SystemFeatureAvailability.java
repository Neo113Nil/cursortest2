package io.bidmachine.iab.utils;

import android.content.Context;
import androidx.annotation.NonNull;

/* loaded from: classes10.dex */
public class SystemFeatureAvailability {
    private final Context a;

    public SystemFeatureAvailability(@NonNull Context context) {
        this.a = context.getApplicationContext();
    }

    public boolean hasTelephony() {
        return this.a.getPackageManager().hasSystemFeature("android.hardware.telephony");
    }
}
