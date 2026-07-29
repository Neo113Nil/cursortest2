package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzber extends zzgko implements zzglz {
    private static final zzber zzb;
    private int zze;
    private int zzf;
    private zzbgj zzg;
    private zzbgj zzh;
    private zzbgj zzi;
    private zzgkx zzj = zzaH();
    private int zzk;

    static {
        zzber zzberVar = new zzber();
        zzb = zzberVar;
        zzgko.zzaN(zzber.class, zzberVar);
    }

    private zzber() {
    }

    @Override // com.google.android.gms.internal.ads.zzgko
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaM(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005\u001b\u0006င\u0004", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", zzbgj.class, "zzk"});
        }
        if (i2 == 3) {
            return new zzber();
        }
        zzbds zzbdsVar = null;
        if (i2 == 4) {
            return new zzbeq(zzbdsVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
