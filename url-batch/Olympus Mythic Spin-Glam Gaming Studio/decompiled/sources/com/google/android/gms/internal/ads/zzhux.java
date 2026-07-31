package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes6.dex */
public final class zzhux extends zzifm implements zzigx {
    private static final zzhux zzj;
    private static volatile zzihe zzk;
    private int zza;
    private int zzb;
    private zzhuz zzc;
    private zziei zzd;
    private zziei zze;
    private zziei zzf;
    private zziei zzg;
    private zziei zzh;
    private zziei zzi;

    static {
        zzhux zzhuxVar = new zzhux();
        zzj = zzhuxVar;
        zzifm.zzbu(zzhux.class, zzhuxVar);
    }

    private zzhux() {
        zziei zzieiVar = zziei.zza;
        this.zzd = zzieiVar;
        this.zze = zzieiVar;
        this.zzf = zzieiVar;
        this.zzg = zzieiVar;
        this.zzh = zzieiVar;
        this.zzi = zzieiVar;
    }

    public static zzhux zzj(zziei zzieiVar, zziew zziewVar) throws zzige {
        return (zzhux) zzifm.zzbT(zzj, zzieiVar, zziewVar);
    }

    public static zzhuw zzk() {
        return (zzhuw) zzj.zzbn();
    }

    public static zzihe zzl() {
        return zzj.zzbd();
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzhuz zzb() {
        zzhuz zzhuzVar = this.zzc;
        return zzhuzVar == null ? zzhuz.zzh() : zzhuzVar;
    }

    public final zziei zzc() {
        return this.zzd;
    }

    public final zziei zzd() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    protected final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzifm.zzbv(zzj, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n\u0004\n\u0005\n\u0006\n\u0007\n\b\n", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (ordinal == 3) {
            return new zzhux();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhuw(bArr);
        }
        if (ordinal == 5) {
            return zzj;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar = zzk;
        if (zziheVar == null) {
            synchronized (zzhux.class) {
                try {
                    zziheVar = zzk;
                    if (zziheVar == null) {
                        zziheVar = new zzifh(zzj);
                        zzk = zziheVar;
                    }
                } finally {
                }
            }
        }
        return zziheVar;
    }

    public final zziei zze() {
        return this.zzf;
    }

    public final zziei zzg() {
        return this.zzg;
    }

    public final zziei zzh() {
        return this.zzh;
    }

    public final zziei zzi() {
        return this.zzi;
    }

    final /* synthetic */ void zzm(int i) {
        this.zzb = 0;
    }

    final /* synthetic */ void zzn(zzhuz zzhuzVar) {
        zzhuzVar.getClass();
        this.zzc = zzhuzVar;
        this.zza |= 1;
    }

    final /* synthetic */ void zzo(zziei zzieiVar) {
        zzieiVar.getClass();
        this.zzd = zzieiVar;
    }

    final /* synthetic */ void zzp(zziei zzieiVar) {
        zzieiVar.getClass();
        this.zze = zzieiVar;
    }

    final /* synthetic */ void zzq(zziei zzieiVar) {
        zzieiVar.getClass();
        this.zzf = zzieiVar;
    }

    final /* synthetic */ void zzr(zziei zzieiVar) {
        zzieiVar.getClass();
        this.zzg = zzieiVar;
    }

    final /* synthetic */ void zzs(zziei zzieiVar) {
        zzieiVar.getClass();
        this.zzh = zzieiVar;
    }

    final /* synthetic */ void zzt(zziei zzieiVar) {
        zzieiVar.getClass();
        this.zzi = zzieiVar;
    }
}
