package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.Size;
import java.net.UnknownHostException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes14.dex */
public final class zzeh {
    private static final Object zza = new Object();

    public static void zza(@Size String str, String str2) {
        synchronized (zza) {
            Log.d(str, zzg(str2, null));
        }
    }

    public static void zzb(@Size String str, String str2) {
        synchronized (zza) {
            Log.i(str, zzg(str2, null));
        }
    }

    public static void zzc(@Size String str, String str2) {
        synchronized (zza) {
            Log.w(str, zzg(str2, null));
        }
    }

    public static void zzd(@Size String str, String str2, @Nullable Throwable th) {
        synchronized (zza) {
            Log.w(str, zzg(str2, th));
        }
    }

    public static void zze(@Size String str, String str2) {
        synchronized (zza) {
            Log.e(str, zzg(str2, null));
        }
    }

    public static void zzf(@Size String str, String str2, @Nullable Throwable th) {
        synchronized (zza) {
            Log.e(str, zzg(str2, th));
        }
    }

    public static String zzg(String str, @Nullable Throwable th) {
        String replace;
        if (th != null) {
            synchronized (zza) {
                Throwable th2 = th;
                while (true) {
                    if (th2 == null) {
                        replace = Log.getStackTraceString(th).trim().replace("\t", "    ");
                        break;
                    }
                    try {
                        if (th2 instanceof UnknownHostException) {
                            replace = "UnknownHostException (no network)";
                        } else {
                            th2 = th2.getCause();
                        }
                    } finally {
                    }
                }
            }
        } else {
            replace = null;
        }
        if (TextUtils.isEmpty(replace)) {
            return str;
        }
        String replace2 = replace.replace("\n", "\n  ");
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(replace2).length() + 1);
        sb.append(str);
        sb.append("\n  ");
        sb.append(replace2);
        sb.append("\n");
        return sb.toString();
    }
}
