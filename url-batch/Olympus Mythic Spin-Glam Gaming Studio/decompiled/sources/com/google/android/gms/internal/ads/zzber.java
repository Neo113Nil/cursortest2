package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes3.dex */
public final class zzber extends zzifm implements zzigx {
    private static final zzber zzg;
    private static volatile zzihe zzh;
    private int zza;
    private String zzb = "";
    private String zzc = "";
    private long zzd;
    private long zze;
    private long zzf;

    static {
        zzber zzberVar = new zzber();
        zzg = zzberVar;
        zzifm.zzbu(zzber.class, zzberVar);
    }

    private zzber() {
    }

    public static zzber zzg(zziei zzieiVar) throws zzige {
        return (zzber) zzifm.zzbS(zzg, zzieiVar);
    }

    public static zzber zzh(zziei zzieiVar, zziew zziewVar) throws zzige {
        return (zzber) zzifm.zzbT(zzg, zzieiVar, zziewVar);
    }

    public static zzbeq zzi() {
        return (zzbeq) zzg.zzbn();
    }

    public static zzber zzj() {
        return zzg;
    }

    public final String zza() {
        return this.zzb;
    }

    public final String zzb() {
        return this.zzc;
    }

    public final long zzc() {
        return this.zzd;
    }

    public final long zzd() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    protected final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzifm.zzbv(zzg, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004ဃ\u0003\u0005ဃ\u0004", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf"});
        }
        if (ordinal == 3) {
            return new zzber();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzbeq(bArr);
        }
        if (ordinal == 5) {
            return zzg;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar = zzh;
        if (zziheVar == null) {
            synchronized (zzber.class) {
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

    public final long zze() {
        return this.zzf;
    }

    final /* synthetic */ void zzk(String str) {
        str.getClass();
        this.zza |= 1;
        this.zzb = str;
    }

    final /* synthetic */ void zzl(String str) {
        str.getClass();
        this.zza |= 2;
        this.zzc = str;
    }

    final /* synthetic */ void zzm(long j) {
        this.zza |= 4;
        this.zzd = j;
    }

    final /* synthetic */ void zzn(long j) {
        this.zza |= 8;
        this.zze = j;
    }

    final /* synthetic */ void zzo(long j) {
        this.zza |= 16;
        this.zzf = j;
    }
}
