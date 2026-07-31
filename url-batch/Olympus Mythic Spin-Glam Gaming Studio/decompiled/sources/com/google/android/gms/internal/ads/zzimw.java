package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes11.dex */
public final class zzimw extends zzifm implements zzigx {
    private static final zzimw zzf;
    private static volatile zzihe zzg;
    private int zza;
    private int zzb;
    private int zzc;
    private int zzd;
    private zzify zze = zzifm.zzbM();

    static {
        zzimw zzimwVar = new zzimw();
        zzf = zzimwVar;
        zzifm.zzbu(zzimw.class, zzimwVar);
    }

    private zzimw() {
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    protected final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzifm.zzbv(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004\u001a", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (ordinal == 3) {
            return new zzimw();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzimv(bArr);
        }
        if (ordinal == 5) {
            return zzf;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar = zzg;
        if (zziheVar == null) {
            synchronized (zzimw.class) {
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
