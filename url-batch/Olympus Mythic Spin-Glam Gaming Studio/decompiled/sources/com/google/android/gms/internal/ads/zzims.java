package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes12.dex */
public final class zzims extends zzifm implements zzigx {
    private static final zzims zzl;
    private static volatile zzihe zzm;
    private int zza;
    private long zzd;
    private zzimu zzi;
    private zzimw zzj;
    private zzicl zzk;
    private zziei zzb = zziei.zza;
    private zzifu zzc = zzifm.zzbC();
    private zzifu zze = zzifm.zzbC();
    private zzify zzf = zzifm.zzbM();
    private String zzg = "";
    private zzify zzh = zzifm.zzbM();

    static {
        zzims zzimsVar = new zzims();
        zzl = zzimsVar;
        zzifm.zzbu(zzims.class, zzimsVar);
    }

    private zzims() {
    }

    public static zzims zzc(byte[] bArr, zziew zziewVar) throws zzige {
        return (zzims) zzifm.zzbV(zzl, bArr, zziewVar);
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    protected final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzifm.zzbv(zzl, "\u0001\n\u0000\u0001\u0001\u000f\n\u0000\u0004\u0000\u0001'\u0002ဂ\u0001\u0003'\u0004\u001b\u0005ဉ\u0003\u0007ဈ\u0002\tဉ\u0004\n\u001a\rည\u0000\u000fဉ\u0005", new Object[]{"zza", "zzc", "zzd", "zze", "zzh", zzimh.class, "zzi", "zzg", "zzj", "zzf", "zzb", "zzk"});
        }
        if (ordinal == 3) {
            return new zzims();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzimr(bArr);
        }
        if (ordinal == 5) {
            return zzl;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar = zzm;
        if (zziheVar == null) {
            synchronized (zzims.class) {
                try {
                    zziheVar = zzm;
                    if (zziheVar == null) {
                        zziheVar = new zzifh(zzl);
                        zzm = zziheVar;
                    }
                } finally {
                }
            }
        }
        return zziheVar;
    }
}
