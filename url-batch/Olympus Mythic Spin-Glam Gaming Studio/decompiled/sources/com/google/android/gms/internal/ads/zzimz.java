package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes11.dex */
public final class zzimz extends zzifm implements zzigx {
    private static final zzimz zze;
    private static volatile zzihe zzf;
    private int zza;
    private String zzb = "";
    private int zzc;
    private int zzd;

    static {
        zzimz zzimzVar = new zzimz();
        zze = zzimzVar;
        zzifm.zzbu(zzimz.class, zzimzVar);
    }

    private zzimz() {
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    protected final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzifm.zzbv(zze, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003င\u0002", new Object[]{"zza", "zzb", "zzc", zzinc.zza, "zzd"});
        }
        if (ordinal == 3) {
            return new zzimz();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzimy(bArr);
        }
        if (ordinal == 5) {
            return zze;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar = zzf;
        if (zziheVar == null) {
            synchronized (zzimz.class) {
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
