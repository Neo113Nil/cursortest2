package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzhdm extends zzhih implements zzhjt {
    private static final zzhdm zze;
    private static volatile zzhka zzf;
    private int zza;
    private int zzb;
    private zzhdq zzc;
    private zzhhb zzd = zzhhb.zzb;

    static {
        zzhdm zzhdmVar = new zzhdm();
        zze = zzhdmVar;
        zzhih.zzbu(zzhdm.class, zzhdmVar);
    }

    private zzhdm() {
    }

    public static zzhdm zzd(zzhhb zzhhbVar, zzhhr zzhhrVar) throws zzhiw {
        return (zzhdm) zzhih.zzbT(zze, zzhhbVar, zzhhrVar);
    }

    public static zzhdl zze() {
        return (zzhdl) zze.zzbn();
    }

    public static zzhdm zzg() {
        return zze;
    }

    public static zzhka zzh() {
        return zze.zzbd();
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzhdq zzb() {
        zzhdq zzhdqVar = this.zzc;
        return zzhdqVar == null ? zzhdq.zzd() : zzhdqVar;
    }

    public final zzhhb zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzhih
    protected final Object zzdh(zzhig zzhigVar, Object obj, Object obj2) {
        zzhka zzhkaVar;
        int ordinal = zzhigVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (ordinal == 3) {
            return new zzhdm();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhdl(bArr);
        }
        if (ordinal == 5) {
            return zze;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzhka zzhkaVar2 = zzf;
        if (zzhkaVar2 != null) {
            return zzhkaVar2;
        }
        synchronized (zzhdm.class) {
            zzhkaVar = zzf;
            if (zzhkaVar == null) {
                zzhkaVar = new zzhic(zze);
                zzf = zzhkaVar;
            }
        }
        return zzhkaVar;
    }

    final /* synthetic */ void zzi(zzhdq zzhdqVar) {
        zzhdqVar.getClass();
        this.zzc = zzhdqVar;
        this.zza |= 1;
    }

    final /* synthetic */ void zzj(zzhhb zzhhbVar) {
        this.zzd = zzhhbVar;
    }
}
