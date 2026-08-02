package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzgvp extends zzgre implements zzgsp {
    private static final zzgvp zzb;
    private int zze;
    private zzgvo zzf;
    private zzgpw zzi;
    private int zzj;
    private zzgpw zzk;
    private byte zzl = 2;
    private zzgrn zzg = zzaK();
    private zzgpw zzh = zzgpw.zzb;

    static {
        zzgvp zzgvpVar = new zzgvp();
        zzb = zzgvpVar;
        zzgre.zzaQ(zzgvp.class, zzgvpVar);
    }

    private zzgvp() {
        zzgpw zzgpwVar = zzgpw.zzb;
        this.zzi = zzgpwVar;
        this.zzk = zzgpwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgre
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzl);
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003\u0006ည\u0004", new Object[]{"zze", "zzf", "zzg", zzgvh.class, "zzh", "zzi", "zzj", "zzk"});
        }
        if (i2 == 3) {
            return new zzgvp();
        }
        zzguq zzguqVar = null;
        if (i2 == 4) {
            return new zzgvm(zzguqVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        this.zzl = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
