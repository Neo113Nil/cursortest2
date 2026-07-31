package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes6.dex */
public final class zzhro extends zzifm implements zzigx {
    private static final zzhro zze;
    private static volatile zzihe zzf;
    private int zza;
    private int zzb;
    private zziei zzc = zziei.zza;
    private zzhrs zzd;

    static {
        zzhro zzhroVar = new zzhro();
        zze = zzhroVar;
        zzifm.zzbu(zzhro.class, zzhroVar);
    }

    private zzhro() {
    }

    public static zzhro zzd(zziei zzieiVar, zziew zziewVar) throws zzige {
        return (zzhro) zzifm.zzbT(zze, zzieiVar, zziewVar);
    }

    public static zzhrn zze() {
        return (zzhrn) zze.zzbn();
    }

    public static zzihe zzg() {
        return zze.zzbd();
    }

    public final int zza() {
        return this.zzb;
    }

    public final zziei zzb() {
        return this.zzc;
    }

    public final zzhrs zzc() {
        zzhrs zzhrsVar = this.zzd;
        return zzhrsVar == null ? zzhrs.zzc() : zzhrsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    protected final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzifm.zzbv(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003ဉ\u0000", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (ordinal == 3) {
            return new zzhro();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhrn(bArr);
        }
        if (ordinal == 5) {
            return zze;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar = zzf;
        if (zziheVar == null) {
            synchronized (zzhro.class) {
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

    final /* synthetic */ void zzh(zziei zzieiVar) {
        zzieiVar.getClass();
        this.zzc = zzieiVar;
    }

    final /* synthetic */ void zzi(zzhrs zzhrsVar) {
        zzhrsVar.getClass();
        this.zzd = zzhrsVar;
        this.zza |= 1;
    }
}
