package com.google.android.gms.internal.measurement;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.UserManager;
import android.util.Log;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes14.dex */
public final class zzji {

    @Nullable
    @GuardedBy
    private static UserManager zza;
    private static volatile boolean zzb = !zzc();

    private zzji() {
    }

    public static boolean zza(Context context) {
        return zzc() && !zzd(context);
    }

    public static boolean zzb(Context context) {
        return !zzc() || zzd(context);
    }

    @ChecksSdkIntAtLeast
    public static boolean zzc() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0039, code lost:
    
        if (r3.isUserRunning(android.os.Process.myUserHandle()) == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003b, code lost:
    
        r5 = true;
     */
    @RequiresApi
    @TargetApi(24)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean zzd(Context context) {
        boolean z;
        if (zzb) {
            return true;
        }
        synchronized (zzji.class) {
            try {
                if (zzb) {
                    return true;
                }
                int i = 1;
                while (true) {
                    z = false;
                    if (i > 2) {
                        break;
                    }
                    if (zza == null) {
                        zza = (UserManager) context.getSystemService(UserManager.class);
                    }
                    UserManager userManager = zza;
                    if (userManager == null) {
                        z = true;
                        break;
                    }
                    try {
                        if (userManager.isUserUnlocked()) {
                            break;
                        }
                    } catch (NullPointerException e) {
                        Log.w("DirectBootUtils", "Failed to check if user is unlocked.", e);
                        zza = null;
                        i++;
                    }
                }
                if (z) {
                    zza = null;
                }
                if (z) {
                    zzb = true;
                }
                return z;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
