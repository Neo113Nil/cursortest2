package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.firebase.analytics.FirebaseAnalytics;

/* compiled from: com.google.firebase:firebase-auth@@24.0.1 */
/* loaded from: classes5.dex */
public final class zzu {
    public static int zza(int i, int i2) {
        String zza;
        if (i >= 0 && i < i2) {
            return i;
        }
        if (i < 0) {
            zza = zzac.zza("%s (%s) must not be negative", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i));
        } else if (i2 >= 0) {
            zza = zzac.zza("%s (%s) must be less than size (%s)", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            throw new IllegalArgumentException("negative size: " + i2);
        }
        throw new IndexOutOfBoundsException(zza);
    }

    public static int zzb(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(zzb(i, i2, FirebaseAnalytics.Param.INDEX));
        }
        return i;
    }

    public static int zza(int i, int i2, String str) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(zzb(i, i2, str));
        }
        return i;
    }

    public static <T> T zza(T t) {
        t.getClass();
        return t;
    }

    private static String zzb(int i, int i2, String str) {
        if (i < 0) {
            return zzac.zza("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("negative size: " + i2);
        }
        return zzac.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
    }

    public static void zza(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(zzp.zza(obj));
        }
    }

    public static void zza(int i, int i2, int i3) {
        String zzb;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                zzb = zzb(i, i3, "start index");
            } else if (i2 < 0 || i2 > i3) {
                zzb = zzb(i2, i3, "end index");
            } else {
                zzb = zzac.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(zzb);
        }
    }
}
