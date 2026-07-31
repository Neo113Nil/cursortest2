package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes15.dex */
public final class zzaxc extends zzifm implements zzigx {
    private static final zzaxc zzj;
    private static volatile zzihe zzk;
    private int zza;
    private int zzb;
    private boolean zze;
    private zzaxt zzg;
    private zzaxz zzh;
    private boolean zzi;
    private boolean zzc = true;
    private String zzd = "unknown_host";
    private boolean zzf = true;

    static {
        zzaxc zzaxcVar = new zzaxc();
        zzj = zzaxcVar;
        zzifm.zzbu(zzaxc.class, zzaxcVar);
    }

    private zzaxc() {
    }

    public static zzaxb zze() {
        return (zzaxb) zzj.zzbn();
    }

    public final String zza() {
        return this.zzd;
    }

    @Deprecated
    public final boolean zzb() {
        return this.zze;
    }

    public final zzaxt zzc() {
        zzaxt zzaxtVar = this.zzg;
        return zzaxtVar == null ? zzaxt.zzd() : zzaxtVar;
    }

    public final zzaxz zzd() {
        zzaxz zzaxzVar = this.zzh;
        return zzaxzVar == null ? zzaxz.zza() : zzaxzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    protected final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzifm.zzbv(zzj, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဇ\u0007", new Object[]{"zza", "zzb", zzaxf.zza, "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (ordinal == 3) {
            return new zzaxc();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzaxb(bArr);
        }
        if (ordinal == 5) {
            return zzj;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar = zzk;
        if (zziheVar == null) {
            synchronized (zzaxc.class) {
                try {
                    zziheVar = zzk;
                    if (zziheVar == null) {
                        zziheVar = new zzifh(zzj);
                        zzk = zziheVar;
                    }
                } finally {
                }
            }
        }
        return zziheVar;
    }

    final /* synthetic */ void zzg(String str) {
        str.getClass();
        this.zza |= 4;
        this.zzd = str;
    }

    final /* synthetic */ void zzh(boolean z) {
        this.zza |= 8;
        this.zze = z;
    }
}
