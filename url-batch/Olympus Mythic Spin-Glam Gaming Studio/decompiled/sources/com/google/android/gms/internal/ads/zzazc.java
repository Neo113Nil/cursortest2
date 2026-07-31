package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes15.dex */
public final class zzazc extends zzifm implements zzigx {
    private static final zzazc zzn;
    private static volatile zzihe zzo;
    private int zza;
    private long zzb;
    private int zzc;
    private boolean zzd;
    private long zzf;
    private boolean zzg;
    private long zzi;
    private long zzj;
    private long zzk;
    private zzaze zzl;
    private zzifu zze = zzifm.zzbC();
    private zzify zzh = zzifm.zzbM();
    private zzifx zzm = zzifm.zzbE();

    static {
        zzazc zzazcVar = new zzazc();
        zzn = zzazcVar;
        zzifm.zzbu(zzazc.class, zzazcVar);
    }

    private zzazc() {
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    protected final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzifm.zzbv(zzn, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0003\u0000\u0001ဂ\u0000\u0002င\u0001\u0003ဇ\u0002\u0004\u0016\u0005ဃ\u0003\u0006ဇ\u0004\u0007\u001b\bဂ\u0005\tဂ\u0006\nဂ\u0007\u000bဉ\b\f\u0014", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", zzazi.class, "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        if (ordinal == 3) {
            return new zzazc();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzazb(bArr);
        }
        if (ordinal == 5) {
            return zzn;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar = zzo;
        if (zziheVar == null) {
            synchronized (zzazc.class) {
                try {
                    zziheVar = zzo;
                    if (zziheVar == null) {
                        zziheVar = new zzifh(zzn);
                        zzo = zziheVar;
                    }
                } finally {
                }
            }
        }
        return zziheVar;
    }
}
