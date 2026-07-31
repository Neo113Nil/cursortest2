package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes5.dex */
public final class zzija extends zzifm implements zzigx {
    private static final zzija zzc;
    private static volatile zzihe zzd;
    private zzifu zza = zzifm.zzbC();
    private zzifu zzb = zzifm.zzbC();

    static {
        zzija zzijaVar = new zzija();
        zzc = zzijaVar;
        zzifm.zzbu(zzija.class, zzijaVar);
    }

    private zzija() {
    }

    public static zzija zzc(byte[] bArr, zziew zziewVar) throws zzige {
        return (zzija) zzifm.zzbV(zzc, bArr, zziewVar);
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    protected final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzifm.zzbv(zzc, "\u0004\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0002\u0000\u0001\u0016\u0003\u0016", new Object[]{"zza", "zzb"});
        }
        if (ordinal == 3) {
            return new zzija();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zziiz(bArr);
        }
        if (ordinal == 5) {
            return zzc;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar = zzd;
        if (zziheVar == null) {
            synchronized (zzija.class) {
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
}
