package com.google.android.gms.internal.measurement;

import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes14.dex */
public final class zzje {

    @Nullable
    @GuardedBy
    private static zzjd zza;

    public static synchronized zzjd zza() {
        zzjd zzjdVar;
        synchronized (zzje.class) {
            try {
                if (zza == null) {
                    zzb(new zzjh());
                }
                zzjdVar = zza;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzjdVar;
    }

    public static synchronized void zzb(zzjd zzjdVar) {
        synchronized (zzje.class) {
            if (zza != null) {
                throw new IllegalStateException("init() already called");
            }
            zza = zzjdVar;
        }
    }
}
