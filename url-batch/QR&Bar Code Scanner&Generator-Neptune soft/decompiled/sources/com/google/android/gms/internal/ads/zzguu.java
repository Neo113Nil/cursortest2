package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzguu extends zzgre implements zzgsp {
    private static final zzguu zzb;
    private int zze;
    private int zzf;
    private long zzg;
    private zzgpw zzh = zzgpw.zzb;

    static {
        zzguu zzguuVar = new zzguu();
        zzb = zzguuVar;
        zzgre.zzaQ(zzguu.class, zzguuVar);
    }

    private zzguu() {
    }

    @Override // com.google.android.gms.internal.ads.zzgre
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003ည\u0002", new Object[]{"zze", "zzf", zzgut.zza, "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzguu();
        }
        zzguq zzguqVar = null;
        if (i2 == 4) {
            return new zzgus(zzguqVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
