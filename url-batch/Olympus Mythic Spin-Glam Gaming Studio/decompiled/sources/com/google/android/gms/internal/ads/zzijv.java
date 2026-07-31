package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes6.dex */
public final class zzijv extends zzifm implements zzigx {
    private static final zzijv zzc;
    private static volatile zzihe zzd;
    private int zza;
    private zziei zzb = zziei.zza;

    static {
        zzijv zzijvVar = new zzijv();
        zzc = zzijvVar;
        zzifm.zzbu(zzijv.class, zzijvVar);
    }

    private zzijv() {
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    protected final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzifm.zzbv(zzc, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"zza", "zzb"});
        }
        if (ordinal == 3) {
            return new zzijv();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zziju(bArr);
        }
        if (ordinal == 5) {
            return zzc;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar = zzd;
        if (zziheVar == null) {
            synchronized (zzijv.class) {
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
