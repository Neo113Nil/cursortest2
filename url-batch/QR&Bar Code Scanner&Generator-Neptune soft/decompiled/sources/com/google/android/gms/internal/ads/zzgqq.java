package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzgqq {
    static final zzgqq zza = new zzgqq(true);
    private static volatile boolean zzb = false;
    private static volatile zzgqq zzc;
    private static volatile zzgqq zzd;
    private final Map zze;

    zzgqq() {
        this.zze = new HashMap();
    }

    public static zzgqq zza() {
        zzgqq zzgqqVar = zzc;
        if (zzgqqVar == null) {
            synchronized (zzgqq.class) {
                zzgqqVar = zzc;
                if (zzgqqVar == null) {
                    zzgqqVar = zza;
                    zzc = zzgqqVar;
                }
            }
        }
        return zzgqqVar;
    }

    public final zzgrc zzc(zzgso zzgsoVar, int i) {
        return (zzgrc) this.zze.get(new zzgqp(zzgsoVar, i));
    }

    zzgqq(boolean z) {
        this.zze = Collections.emptyMap();
    }

    public static zzgqq zzb() {
        zzgqq zzgqqVar = zzd;
        if (zzgqqVar != null) {
            return zzgqqVar;
        }
        synchronized (zzgqq.class) {
            zzgqq zzgqqVar2 = zzd;
            if (zzgqqVar2 != null) {
                return zzgqqVar2;
            }
            zzgqq zzb2 = zzgqy.zzb(zzgqq.class);
            zzd = zzb2;
            return zzb2;
        }
    }
}
