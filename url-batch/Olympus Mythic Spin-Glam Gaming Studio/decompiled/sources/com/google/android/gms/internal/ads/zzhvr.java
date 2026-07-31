package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes6.dex */
public final class zzhvr extends zzifm implements zzigx {
    private static final zzhvr zzb;
    private static volatile zzihe zzc;
    private int zza;

    static {
        zzhvr zzhvrVar = new zzhvr();
        zzb = zzhvrVar;
        zzifm.zzbu(zzhvr.class, zzhvrVar);
    }

    private zzhvr() {
    }

    public static zzhvr zzb(zziei zzieiVar, zziew zziewVar) throws zzige {
        return (zzhvr) zzifm.zzbT(zzb, zzieiVar, zziewVar);
    }

    public static zzhvr zzc() {
        return zzb;
    }

    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    protected final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzifm.zzbv(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zza"});
        }
        if (ordinal == 3) {
            return new zzhvr();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhvq(bArr);
        }
        if (ordinal == 5) {
            return zzb;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar = zzc;
        if (zziheVar == null) {
            synchronized (zzhvr.class) {
                try {
                    zziheVar = zzc;
                    if (zziheVar == null) {
                        zziheVar = new zzifh(zzb);
                        zzc = zziheVar;
                    }
                } finally {
                }
            }
        }
        return zziheVar;
    }
}
