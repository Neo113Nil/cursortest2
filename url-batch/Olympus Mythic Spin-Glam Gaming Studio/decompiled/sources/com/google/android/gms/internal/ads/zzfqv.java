package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes3.dex */
public final class zzfqv extends zzifm implements zzigx {
    private static final zzfqv zzi;
    private static volatile zzihe zzj;
    private int zza;
    private int zzb;
    private int zzc;
    private int zzd;
    private String zze = "";
    private int zzf;
    private int zzg;
    private boolean zzh;

    static {
        zzfqv zzfqvVar = new zzfqv();
        zzi = zzfqvVar;
        zzifm.zzbu(zzfqv.class, zzfqvVar);
    }

    private zzfqv() {
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    protected final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzifm.zzbv(zzi, "\u0004\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\f\u0005Ȉ\u0006\u0004\u0007\u0004\b\u0007", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (ordinal == 3) {
            return new zzfqv();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzfqu(bArr);
        }
        if (ordinal == 5) {
            return zzi;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar = zzj;
        if (zziheVar == null) {
            synchronized (zzfqv.class) {
                try {
                    zziheVar = zzj;
                    if (zziheVar == null) {
                        zziheVar = new zzifh(zzi);
                        zzj = zziheVar;
                    }
                } finally {
                }
            }
        }
        return zziheVar;
    }
}
