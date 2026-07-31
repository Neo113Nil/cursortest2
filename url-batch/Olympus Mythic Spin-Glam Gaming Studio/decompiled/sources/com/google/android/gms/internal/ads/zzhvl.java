package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes6.dex */
public final class zzhvl extends zzifm implements zzigx {
    private static final zzhvl zzd;
    private static volatile zzihe zze;
    private int zza;
    private int zzb;
    private zzhvn zzc;

    static {
        zzhvl zzhvlVar = new zzhvl();
        zzd = zzhvlVar;
        zzifm.zzbu(zzhvl.class, zzhvlVar);
    }

    private zzhvl() {
    }

    public static zzhvl zzc(zziei zzieiVar, zziew zziewVar) throws zzige {
        return (zzhvl) zzifm.zzbT(zzd, zzieiVar, zziewVar);
    }

    public static zzhvk zzd() {
        return (zzhvk) zzd.zzbn();
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzhvn zzb() {
        zzhvn zzhvnVar = this.zzc;
        return zzhvnVar == null ? zzhvn.zzc() : zzhvnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    protected final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzifm.zzbv(zzd, "\u0000\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003ဉ\u0000", new Object[]{"zza", "zzb", "zzc"});
        }
        if (ordinal == 3) {
            return new zzhvl();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhvk(bArr);
        }
        if (ordinal == 5) {
            return zzd;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar = zze;
        if (zziheVar == null) {
            synchronized (zzhvl.class) {
                try {
                    zziheVar = zze;
                    if (zziheVar == null) {
                        zziheVar = new zzifh(zzd);
                        zze = zziheVar;
                    }
                } finally {
                }
            }
        }
        return zziheVar;
    }

    final /* synthetic */ void zze(zzhvn zzhvnVar) {
        zzhvnVar.getClass();
        this.zzc = zzhvnVar;
        this.zza |= 1;
    }
}
