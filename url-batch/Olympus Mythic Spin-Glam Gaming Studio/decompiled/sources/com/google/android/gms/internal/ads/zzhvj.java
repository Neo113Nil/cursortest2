package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes6.dex */
public final class zzhvj extends zzifm implements zzigx {
    private static final zzhvj zze;
    private static volatile zzihe zzf;
    private int zza;
    private int zzb;
    private zzhvn zzc;
    private zziei zzd = zziei.zza;

    static {
        zzhvj zzhvjVar = new zzhvj();
        zze = zzhvjVar;
        zzifm.zzbu(zzhvj.class, zzhvjVar);
    }

    private zzhvj() {
    }

    public static zzhvj zzd(zziei zzieiVar, zziew zziewVar) throws zzige {
        return (zzhvj) zzifm.zzbT(zze, zzieiVar, zziewVar);
    }

    public static zzhvi zze() {
        return (zzhvi) zze.zzbn();
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzhvn zzb() {
        zzhvn zzhvnVar = this.zzc;
        return zzhvnVar == null ? zzhvn.zzc() : zzhvnVar;
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
            return zzifm.zzbv(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (ordinal == 3) {
            return new zzhvj();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhvi(bArr);
        }
        if (ordinal == 5) {
            return zze;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar = zzf;
        if (zziheVar == null) {
            synchronized (zzhvj.class) {
                try {
                    zziheVar = zzf;
                    if (zziheVar == null) {
                        zziheVar = new zzifh(zze);
                        zzf = zziheVar;
                    }
                } finally {
                }
            }
        }
        return zziheVar;
    }

    final /* synthetic */ void zzg(zzhvn zzhvnVar) {
        zzhvnVar.getClass();
        this.zzc = zzhvnVar;
        this.zza |= 1;
    }

    final /* synthetic */ void zzh(zziei zzieiVar) {
        zzieiVar.getClass();
        this.zzd = zzieiVar;
    }
}
