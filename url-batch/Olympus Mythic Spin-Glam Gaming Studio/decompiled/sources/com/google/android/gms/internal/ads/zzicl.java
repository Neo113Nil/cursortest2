package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes5.dex */
public final class zzicl extends zzifm implements zzigx {
    private static final zzicl zzf;
    private static volatile zzihe zzg;
    private int zza;
    private zziei zzb = zziei.zza;
    private String zzc = "";
    private zzify zzd = zzifm.zzbM();
    private boolean zze;

    static {
        zzicl zziclVar = new zzicl();
        zzf = zziclVar;
        zzifm.zzbu(zzicl.class, zziclVar);
    }

    private zzicl() {
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    protected final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzifm.zzbv(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ည\u0000\u0002\u001c\u0003ဇ\u0002\u0004ဈ\u0001", new Object[]{"zza", "zzb", "zzd", "zze", "zzc"});
        }
        if (ordinal == 3) {
            return new zzicl();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzick(bArr);
        }
        if (ordinal == 5) {
            return zzf;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar = zzg;
        if (zziheVar == null) {
            synchronized (zzicl.class) {
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
