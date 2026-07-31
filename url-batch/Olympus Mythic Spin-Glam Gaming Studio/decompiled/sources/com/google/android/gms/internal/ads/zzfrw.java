package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes3.dex */
public final class zzfrw extends zzifm implements zzigx {
    private static final zzfrw zzc;
    private static volatile zzihe zzd;
    private String zza = "";
    private int zzb;

    static {
        zzfrw zzfrwVar = new zzfrw();
        zzc = zzfrwVar;
        zzifm.zzbu(zzfrw.class, zzfrwVar);
    }

    private zzfrw() {
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    protected final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzifm.zzbv(zzc, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0004", new Object[]{"zza", "zzb"});
        }
        if (ordinal == 3) {
            return new zzfrw();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzfrv(bArr);
        }
        if (ordinal == 5) {
            return zzc;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar = zzd;
        if (zziheVar == null) {
            synchronized (zzfrw.class) {
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
