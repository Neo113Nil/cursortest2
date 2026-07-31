package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes6.dex */
public final class zzhvd extends zzifm implements zzigx {
    private static final zzhvd zzd;
    private static volatile zzihe zze;
    private int zza;
    private int zzb;
    private int zzc;

    static {
        zzhvd zzhvdVar = new zzhvd();
        zzd = zzhvdVar;
        zzifm.zzbu(zzhvd.class, zzhvdVar);
    }

    private zzhvd() {
    }

    public static zzhvc zzd() {
        return (zzhvc) zzd.zzbn();
    }

    public static zzhvd zze() {
        return zzd;
    }

    public final zzhtl zza() {
        zzhtl zzb = zzhtl.zzb(this.zza);
        return zzb == null ? zzhtl.UNRECOGNIZED : zzb;
    }

    public final zzhtl zzb() {
        zzhtl zzb = zzhtl.zzb(this.zzb);
        return zzb == null ? zzhtl.UNRECOGNIZED : zzb;
    }

    public final int zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    protected final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzifm.zzbv(zzd, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\u0004", new Object[]{"zza", "zzb", "zzc"});
        }
        if (ordinal == 3) {
            return new zzhvd();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhvc(bArr);
        }
        if (ordinal == 5) {
            return zzd;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar = zze;
        if (zziheVar == null) {
            synchronized (zzhvd.class) {
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

    final /* synthetic */ void zzg(zzhtl zzhtlVar) {
        this.zza = zzhtlVar.zza();
    }

    final /* synthetic */ void zzh(zzhtl zzhtlVar) {
        this.zzb = zzhtlVar.zza();
    }

    final /* synthetic */ void zzi(int i) {
        this.zzc = i;
    }
}
