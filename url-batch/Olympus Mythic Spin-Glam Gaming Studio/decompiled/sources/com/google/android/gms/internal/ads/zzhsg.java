package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes6.dex */
public final class zzhsg extends zzifm implements zzigx {
    private static final zzhsg zzd;
    private static volatile zzihe zze;
    private int zza;
    private zzhsi zzb;
    private int zzc;

    static {
        zzhsg zzhsgVar = new zzhsg();
        zzd = zzhsgVar;
        zzifm.zzbu(zzhsg.class, zzhsgVar);
    }

    private zzhsg() {
    }

    public static zzhsg zzc(zziei zzieiVar, zziew zziewVar) throws zzige {
        return (zzhsg) zzifm.zzbT(zzd, zzieiVar, zziewVar);
    }

    public static zzhsf zzd() {
        return (zzhsf) zzd.zzbn();
    }

    public final zzhsi zza() {
        zzhsi zzhsiVar = this.zzb;
        return zzhsiVar == null ? zzhsi.zzc() : zzhsiVar;
    }

    public final int zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    protected final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzifm.zzbv(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zza", "zzb", "zzc"});
        }
        if (ordinal == 3) {
            return new zzhsg();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhsf(bArr);
        }
        if (ordinal == 5) {
            return zzd;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar = zze;
        if (zziheVar == null) {
            synchronized (zzhsg.class) {
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

    final /* synthetic */ void zze(zzhsi zzhsiVar) {
        zzhsiVar.getClass();
        this.zzb = zzhsiVar;
        this.zza |= 1;
    }

    final /* synthetic */ void zzg(int i) {
        this.zzc = i;
    }
}
