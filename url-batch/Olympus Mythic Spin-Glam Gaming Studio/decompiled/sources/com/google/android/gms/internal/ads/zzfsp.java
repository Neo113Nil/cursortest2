package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes13.dex */
public final class zzfsp extends zzifm implements zzigx {
    private static final zzfsp zze;
    private static volatile zzihe zzf;
    private int zza;
    private int zzb;
    private int zzc;
    private boolean zzd;

    static {
        zzfsp zzfspVar = new zzfsp();
        zze = zzfspVar;
        zzifm.zzbu(zzfsp.class, zzfspVar);
    }

    private zzfsp() {
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    protected final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzifm.zzbv(zze, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\f\u0004\u0007", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (ordinal == 3) {
            return new zzfsp();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzfso(bArr);
        }
        if (ordinal == 5) {
            return zze;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar = zzf;
        if (zziheVar == null) {
            synchronized (zzfsp.class) {
                try {
                    zziheVar = zzf;
                    if (zziheVar == null) {
                        zziheVar = new zzifh(zze);
                        zzf = zziheVar;
                    }
                } finally {
                }
            }
        }
        return zziheVar;
    }
}
