package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.UserManager;
import android.util.Log;
import androidx.annotation.GuardedBy;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.4 */
/* loaded from: classes4.dex */
public final class zzcc {

    @GuardedBy
    private static UserManager zza;
    private static volatile boolean zzb = !zzb();

    private zzcc() {
    }

    public static boolean zzb() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x003f, code lost:
    
        if (r4.isUserRunning(android.os.Process.myUserHandle()) == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0041, code lost:
    
        r8 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean zza(Context context) {
        int i;
        boolean z;
        if (zzb() && !zzb) {
            synchronized (zzcc.class) {
                try {
                    if (!zzb) {
                        i = 1;
                        while (true) {
                            if (i <= 2) {
                                if (zza == null) {
                                    zza = (UserManager) context.getSystemService(UserManager.class);
                                }
                                UserManager userManager = zza;
                                if (userManager != null) {
                                    if (userManager.isUserUnlocked()) {
                                        break;
                                    }
                                } else {
                                    z = true;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        z = false;
                        if (z) {
                            zza = null;
                        }
                        if (z) {
                            zzb = true;
                        }
                        if (!z) {
                            return true;
                        }
                    }
                } catch (NullPointerException e) {
                    Log.w("DirectBootUtils", "Failed to check if user is unlocked.", e);
                    zza = null;
                    i++;
                } finally {
                }
            }
        }
        return false;
    }
}
