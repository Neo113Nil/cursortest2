package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes11.dex */
public final class zzili extends zzifm implements zzigx {
    private static final zzili zzd;
    private static volatile zzihe zze;
    private int zza;
    private int zzb;
    private int zzc;

    static {
        zzili zziliVar = new zzili();
        zzd = zziliVar;
        zzifm.zzbu(zzili.class, zziliVar);
    }

    private zzili() {
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    protected final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            zzifs zzifsVar = zzilh.zza;
            return zzifm.zzbv(zzd, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zza", "zzb", zzifsVar, "zzc", zzifsVar});
        }
        if (ordinal == 3) {
            return new zzili();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzilg(bArr);
        }
        if (ordinal == 5) {
            return zzd;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar = zze;
        if (zziheVar == null) {
            synchronized (zzili.class) {
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
