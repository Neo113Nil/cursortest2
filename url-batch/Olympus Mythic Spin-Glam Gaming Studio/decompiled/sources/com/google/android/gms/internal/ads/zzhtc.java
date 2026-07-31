package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes6.dex */
public final class zzhtc extends zzifm implements zzigx {
    private static final zzhtc zzf;
    private static volatile zzihe zzg;
    private int zza;
    private int zzb;
    private zzhsy zzc;
    private zziei zzd;
    private zziei zze;

    static {
        zzhtc zzhtcVar = new zzhtc();
        zzf = zzhtcVar;
        zzifm.zzbu(zzhtc.class, zzhtcVar);
    }

    private zzhtc() {
        zziei zzieiVar = zziei.zza;
        this.zzd = zzieiVar;
        this.zze = zzieiVar;
    }

    public static zzhtc zze(zziei zzieiVar, zziew zziewVar) throws zzige {
        return (zzhtc) zzifm.zzbT(zzf, zzieiVar, zziewVar);
    }

    public static zzhtb zzg() {
        return (zzhtb) zzf.zzbn();
    }

    public static zzhtc zzh() {
        return zzf;
    }

    public static zzihe zzi() {
        return zzf.zzbd();
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzhsy zzb() {
        zzhsy zzhsyVar = this.zzc;
        return zzhsyVar == null ? zzhsy.zzc() : zzhsyVar;
    }

    public final zziei zzc() {
        return this.zzd;
    }

    public final zziei zzd() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    protected final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzifm.zzbv(zzf, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n\u0004\n", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (ordinal == 3) {
            return new zzhtc();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhtb(bArr);
        }
        if (ordinal == 5) {
            return zzf;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar = zzg;
        if (zziheVar == null) {
            synchronized (zzhtc.class) {
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

    final /* synthetic */ void zzj(zzhsy zzhsyVar) {
        zzhsyVar.getClass();
        this.zzc = zzhsyVar;
        this.zza |= 1;
    }

    final /* synthetic */ void zzk(zziei zzieiVar) {
        zzieiVar.getClass();
        this.zzd = zzieiVar;
    }

    final /* synthetic */ void zzl(zziei zzieiVar) {
        zzieiVar.getClass();
        this.zze = zzieiVar;
    }
}
