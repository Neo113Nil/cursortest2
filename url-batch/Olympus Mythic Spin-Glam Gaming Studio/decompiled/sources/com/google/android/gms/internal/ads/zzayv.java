package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes15.dex */
public final class zzayv extends zzifm implements zzigx {
    private static final zzayv zzd;
    private static volatile zzihe zze;
    private int zza;
    private long zzb = -1;
    private int zzc = 1000;

    static {
        zzayv zzayvVar = new zzayv();
        zzd = zzayvVar;
        zzifm.zzbu(zzayv.class, zzayvVar);
    }

    private zzayv() {
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    protected final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzifm.zzbv(zzd, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002᠌\u0001", new Object[]{"zza", "zzb", "zzc", zzazk.zza});
        }
        if (ordinal == 3) {
            return new zzayv();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzayu(bArr);
        }
        if (ordinal == 5) {
            return zzd;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar = zze;
        if (zziheVar == null) {
            synchronized (zzayv.class) {
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
}
