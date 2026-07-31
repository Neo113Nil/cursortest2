package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes15.dex */
public final class zzaxt extends zzifm implements zzigx {
    private static final zzaxt zzg;
    private static volatile zzihe zzh;
    private int zza;
    private boolean zzb;
    private int zzc = 5000;
    private boolean zzd;
    private boolean zze;
    private boolean zzf;

    static {
        zzaxt zzaxtVar = new zzaxt();
        zzg = zzaxtVar;
        zzifm.zzbu(zzaxt.class, zzaxtVar);
    }

    private zzaxt() {
    }

    public static zzaxt zzd() {
        return zzg;
    }

    public final boolean zza() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zzc;
    }

    public final boolean zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    protected final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzifm.zzbv(zzg, "\u0004\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0003င\u0001\u0004ဇ\u0002\u0005ဇ\u0003\u0006ဇ\u0004", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf"});
        }
        if (ordinal == 3) {
            return new zzaxt();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzaxs(bArr);
        }
        if (ordinal == 5) {
            return zzg;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar = zzh;
        if (zziheVar == null) {
            synchronized (zzaxt.class) {
                try {
                    zziheVar = zzh;
                    if (zziheVar == null) {
                        zziheVar = new zzifh(zzg);
                        zzh = zziheVar;
                    }
                } finally {
                }
            }
        }
        return zziheVar;
    }
}
