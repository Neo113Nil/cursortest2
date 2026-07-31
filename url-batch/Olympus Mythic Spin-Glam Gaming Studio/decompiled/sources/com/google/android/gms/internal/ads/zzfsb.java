package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes3.dex */
public final class zzfsb extends zzifm implements zzigx {
    private static final zzfsb zzb;
    private static volatile zzihe zzc;
    private boolean zza;

    static {
        zzfsb zzfsbVar = new zzfsb();
        zzb = zzfsbVar;
        zzifm.zzbu(zzfsb.class, zzfsbVar);
    }

    private zzfsb() {
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    protected final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzifm.zzbv(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"zza"});
        }
        if (ordinal == 3) {
            return new zzfsb();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzfsa(bArr);
        }
        if (ordinal == 5) {
            return zzb;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar = zzc;
        if (zziheVar == null) {
            synchronized (zzfsb.class) {
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
