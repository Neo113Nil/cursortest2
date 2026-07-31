package com.google.android.gms.internal.consent_sdk;

import android.os.Build;

/* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* loaded from: classes15.dex */
public final class zzdb {
    public static boolean zza(boolean z) {
        if (Build.VERSION.SDK_INT < 31) {
            return Build.DEVICE.startsWith("generic");
        }
        String str = Build.FINGERPRINT;
        return str.contains("generic") || str.contains("emulator") || Build.HARDWARE.contains("ranchu");
    }
}
