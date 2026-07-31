package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes11.dex */
public final class zzinb extends zzifm implements zzigx {
    private static final zzinb zzd;
    private static volatile zzihe zze;
    private int zza;
    private String zzb = "";
    private zzify zzc = zzifm.zzbM();

    static {
        zzinb zzinbVar = new zzinb();
        zzd = zzinbVar;
        zzifm.zzbu(zzinb.class, zzinbVar);
    }

    private zzinb() {
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    protected final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzifm.zzbv(zzd, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zza", "zzb", "zzc", zzimz.class});
        }
        if (ordinal == 3) {
            return new zzinb();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzina(bArr);
        }
        if (ordinal == 5) {
            return zzd;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar = zze;
        if (zziheVar == null) {
            synchronized (zzinb.class) {
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
