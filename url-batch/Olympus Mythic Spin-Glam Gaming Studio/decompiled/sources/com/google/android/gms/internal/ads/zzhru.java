package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes6.dex */
public final class zzhru extends zzifm implements zzigx {
    private static final zzhru zze;
    private static volatile zzihe zzf;
    private int zza;
    private int zzb;
    private zzhry zzc;
    private zzhtn zzd;

    static {
        zzhru zzhruVar = new zzhru();
        zze = zzhruVar;
        zzifm.zzbu(zzhru.class, zzhruVar);
    }

    private zzhru() {
    }

    public static zzhru zzd(zziei zzieiVar, zziew zziewVar) throws zzige {
        return (zzhru) zzifm.zzbT(zze, zzieiVar, zziewVar);
    }

    public static zzhrt zze() {
        return (zzhrt) zze.zzbn();
    }

    public static zzihe zzg() {
        return zze.zzbd();
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzhry zzb() {
        zzhry zzhryVar = this.zzc;
        return zzhryVar == null ? zzhry.zze() : zzhryVar;
    }

    public final zzhtn zzc() {
        zzhtn zzhtnVar = this.zzd;
        return zzhtnVar == null ? zzhtn.zzg() : zzhtnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    protected final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzifm.zzbv(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (ordinal == 3) {
            return new zzhru();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhrt(bArr);
        }
        if (ordinal == 5) {
            return zze;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar = zzf;
        if (zziheVar == null) {
            synchronized (zzhru.class) {
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

    final /* synthetic */ void zzh(zzhry zzhryVar) {
        zzhryVar.getClass();
        this.zzc = zzhryVar;
        this.zza |= 1;
    }

    final /* synthetic */ void zzi(zzhtn zzhtnVar) {
        zzhtnVar.getClass();
        this.zzd = zzhtnVar;
        this.zza |= 2;
    }
}
