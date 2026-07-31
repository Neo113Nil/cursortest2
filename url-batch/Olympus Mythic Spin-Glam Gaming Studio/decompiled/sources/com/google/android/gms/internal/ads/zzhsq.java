package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes6.dex */
public final class zzhsq extends zzifm implements zzigx {
    private static final zzhsq zzc;
    private static volatile zzihe zzd;
    private int zza;
    private int zzb;

    static {
        zzhsq zzhsqVar = new zzhsq();
        zzc = zzhsqVar;
        zzifm.zzbu(zzhsq.class, zzhsqVar);
    }

    private zzhsq() {
    }

    public static zzhsq zzc(zziei zzieiVar, zziew zziewVar) throws zzige {
        return (zzhsq) zzifm.zzbT(zzc, zzieiVar, zziewVar);
    }

    public static zzhsp zzd() {
        return (zzhsp) zzc.zzbn();
    }

    public final int zza() {
        return this.zza;
    }

    public final int zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    protected final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzifm.zzbv(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zzb", "zza"});
        }
        if (ordinal == 3) {
            return new zzhsq();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhsp(bArr);
        }
        if (ordinal == 5) {
            return zzc;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar = zzd;
        if (zziheVar == null) {
            synchronized (zzhsq.class) {
                try {
                    zziheVar = zzd;
                    if (zziheVar == null) {
                        zziheVar = new zzifh(zzc);
                        zzd = zziheVar;
                    }
                } finally {
                }
            }
        }
        return zziheVar;
    }

    final /* synthetic */ void zze(int i) {
        this.zza = i;
    }
}
