package com.google.android.gms.internal.ads;

import android.os.Build;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes4.dex */
final class zztz {
    public static boolean zza(int i) {
        if (i == 8 || i == 7) {
            return true;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 31 || !(i == 26 || i == 27)) {
            return i2 >= 33 && i == 30;
        }
        return true;
    }
}
