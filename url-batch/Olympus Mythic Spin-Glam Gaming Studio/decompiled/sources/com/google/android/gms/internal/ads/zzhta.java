package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes6.dex */
public final class zzhta extends zzifm implements zzigx {
    private static final zzhta zze;
    private static volatile zzihe zzf;
    private int zza;
    private int zzb;
    private zzhtc zzc;
    private zziei zzd = zziei.zza;

    static {
        zzhta zzhtaVar = new zzhta();
        zze = zzhtaVar;
        zzifm.zzbu(zzhta.class, zzhtaVar);
    }

    private zzhta() {
    }

    public static zzhta zzd(zziei zzieiVar, zziew zziewVar) throws zzige {
        return (zzhta) zzifm.zzbT(zze, zzieiVar, zziewVar);
    }

    public static zzhsz zze() {
        return (zzhsz) zze.zzbn();
    }

    public static zzihe zzg() {
        return zze.zzbd();
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzhtc zzb() {
        zzhtc zzhtcVar = this.zzc;
        return zzhtcVar == null ? zzhtc.zzh() : zzhtcVar;
    }

    public final zziei zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    protected final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzifm.zzbv(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (ordinal == 3) {
            return new zzhta();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhsz(bArr);
        }
        if (ordinal == 5) {
            return zze;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar = zzf;
        if (zziheVar == null) {
            synchronized (zzhta.class) {
                try {
                    zziheVar = zzf;
                    if (zziheVar == null) {
                        zziheVar = new zzifh(zze);
                        zzf = zziheVar;
                    }
                } finally {
                }
            }
        }
        return zziheVar;
    }

    final /* synthetic */ void zzh(zzhtc zzhtcVar) {
        zzhtcVar.getClass();
        this.zzc = zzhtcVar;
        this.zza |= 1;
    }

    final /* synthetic */ void zzi(zziei zzieiVar) {
        zzieiVar.getClass();
        this.zzd = zzieiVar;
    }
}
