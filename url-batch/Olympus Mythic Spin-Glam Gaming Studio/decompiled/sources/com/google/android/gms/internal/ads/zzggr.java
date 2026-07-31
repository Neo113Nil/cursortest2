package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes4.dex */
public final class zzggr extends zzifm implements zzigx {
    private static final zzggr zzf;
    private static volatile zzihe zzg;
    private int zza;
    private zzggt zzb;
    private zziei zzc;
    private zziei zzd;
    private int zze;

    static {
        zzggr zzggrVar = new zzggr();
        zzf = zzggrVar;
        zzifm.zzbu(zzggr.class, zzggrVar);
    }

    private zzggr() {
        zziei zzieiVar = zziei.zza;
        this.zzc = zzieiVar;
        this.zzd = zzieiVar;
    }

    public static zzggq zzd() {
        return (zzggq) zzf.zzbn();
    }

    public final zzggt zza() {
        zzggt zzggtVar = this.zzb;
        return zzggtVar == null ? zzggt.zzh() : zzggtVar;
    }

    public final zziei zzb() {
        return this.zzc;
    }

    public final zziei zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    protected final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzifm.zzbv(zzf, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002\u0004᠌\u0003", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", zzghh.zza});
        }
        if (ordinal == 3) {
            return new zzggr();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzggq(bArr);
        }
        if (ordinal == 5) {
            return zzf;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar = zzg;
        if (zziheVar == null) {
            synchronized (zzggr.class) {
                try {
                    zziheVar = zzg;
                    if (zziheVar == null) {
                        zziheVar = new zzifh(zzf);
                        zzg = zziheVar;
                    }
                } finally {
                }
            }
        }
        return zziheVar;
    }

    final /* synthetic */ void zze(zzggt zzggtVar) {
        zzggtVar.getClass();
        this.zzb = zzggtVar;
        this.zza |= 1;
    }

    final /* synthetic */ void zzg(zziei zzieiVar) {
        zzieiVar.getClass();
        this.zza |= 2;
        this.zzc = zzieiVar;
    }

    final /* synthetic */ void zzh(zziei zzieiVar) {
        zzieiVar.getClass();
        this.zza |= 4;
        this.zzd = zzieiVar;
    }

    public final int zzj() {
        int zza = zzghi.zza(this.zze);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }

    final /* synthetic */ void zzk(int i) {
        this.zze = i - 1;
        this.zza |= 8;
    }
}
