package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzgka {
    static final zzgka zza = new zzgka(true);
    private static volatile boolean zzb = false;
    private static volatile zzgka zzc;
    private static volatile zzgka zzd;
    private final Map zze;

    zzgka() {
        this.zze = new HashMap();
    }

    public static zzgka zza() {
        zzgka zzgkaVar = zzc;
        if (zzgkaVar == null) {
            synchronized (zzgka.class) {
                zzgkaVar = zzc;
                if (zzgkaVar == null) {
                    zzgkaVar = zza;
                    zzc = zzgkaVar;
                }
            }
        }
        return zzgkaVar;
    }

    public final zzgkm zzc(zzgly zzglyVar, int i) {
        return (zzgkm) this.zze.get(new zzgjz(zzglyVar, i));
    }

    zzgka(boolean z) {
        this.zze = Collections.emptyMap();
    }

    public static zzgka zzb() {
        zzgka zzgkaVar = zzd;
        if (zzgkaVar != null) {
            return zzgkaVar;
        }
        synchronized (zzgka.class) {
            zzgka zzgkaVar2 = zzd;
            if (zzgkaVar2 != null) {
                return zzgkaVar2;
            }
            zzgka zzb2 = zzgki.zzb(zzgka.class);
            zzd = zzb2;
            return zzb2;
        }
    }
}
