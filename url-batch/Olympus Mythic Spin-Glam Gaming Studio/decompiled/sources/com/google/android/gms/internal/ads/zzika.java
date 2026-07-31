package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes5.dex */
public final class zzika extends zzifm implements zzigx {
    private static final zzika zzf;
    private static volatile zzihe zzg;
    private int zza;
    private int zzb;
    private int zzc;
    private boolean zzd;
    private long zze;

    static {
        zzika zzikaVar = new zzika();
        zzf = zzikaVar;
        zzifm.zzbu(zzika.class, zzikaVar);
    }

    private zzika() {
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    protected final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzifm.zzbv(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဇ\u0002\u0004ဂ\u0003", new Object[]{"zza", "zzb", zzijz.zza, "zzc", zzijx.zza, "zzd", "zze"});
        }
        if (ordinal == 3) {
            return new zzika();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzijy(bArr);
        }
        if (ordinal == 5) {
            return zzf;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar = zzg;
        if (zziheVar == null) {
            synchronized (zzika.class) {
                try {
                    zziheVar = zzg;
                    if (zziheVar == null) {
                        zziheVar = new zzifh(zzf);
                        zzg = zziheVar;
                    }
                } finally {
                }
            }
        }
        return zziheVar;
    }
}
