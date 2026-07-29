package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzalt extends zzgko implements zzglz {
    private static final zzalt zzb;
    private int zze;
    private long zzf = -1;
    private int zzg = 1000;

    static {
        zzalt zzaltVar = new zzalt();
        zzb = zzaltVar;
        zzgko.zzaN(zzalt.class, zzaltVar);
    }

    private zzalt() {
    }

    @Override // com.google.android.gms.internal.ads.zzgko
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaM(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဌ\u0001", new Object[]{"zze", "zzf", "zzg", zzame.zza});
        }
        if (i2 == 3) {
            return new zzalt();
        }
        zzalh zzalhVar = null;
        if (i2 == 4) {
            return new zzals(zzalhVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
