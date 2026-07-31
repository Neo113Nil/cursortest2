package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes6.dex */
public final class zzhsu extends zzifm implements zzigx {
    private static final zzhsu zza;
    private static volatile zzihe zzb;

    static {
        zzhsu zzhsuVar = new zzhsu();
        zza = zzhsuVar;
        zzifm.zzbu(zzhsu.class, zzhsuVar);
    }

    private zzhsu() {
    }

    public static zzhsu zza(zziei zzieiVar, zziew zziewVar) throws zzige {
        return (zzhsu) zzifm.zzbT(zza, zzieiVar, zziewVar);
    }

    public static zzhsu zzb() {
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    protected final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        byte[] bArr = null;
        if (ordinal == 2) {
            return zzifm.zzbv(zza, "\u0000\u0000", null);
        }
        if (ordinal == 3) {
            return new zzhsu();
        }
        if (ordinal == 4) {
            return new zzhst(bArr);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar = zzb;
        if (zziheVar == null) {
            synchronized (zzhsu.class) {
                try {
                    zziheVar = zzb;
                    if (zziheVar == null) {
                        zziheVar = new zzifh(zza);
                        zzb = zziheVar;
                    }
                } finally {
                }
            }
        }
        return zziheVar;
    }
}
