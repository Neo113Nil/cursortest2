package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzhcj extends zzhih implements zzhjt {
    private static final zzhcj zze;
    private static volatile zzhka zzf;
    private int zza;
    private int zzb;
    private zzhcn zzc;
    private zzhdm zzd;

    static {
        zzhcj zzhcjVar = new zzhcj();
        zze = zzhcjVar;
        zzhih.zzbu(zzhcj.class, zzhcjVar);
    }

    private zzhcj() {
    }

    public static zzhcj zzd(zzhhb zzhhbVar, zzhhr zzhhrVar) throws zzhiw {
        return (zzhcj) zzhih.zzbT(zze, zzhhbVar, zzhhrVar);
    }

    public static zzhci zze() {
        return (zzhci) zze.zzbn();
    }

    public static zzhka zzg() {
        return zze.zzbd();
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzhcn zzb() {
        zzhcn zzhcnVar = this.zzc;
        return zzhcnVar == null ? zzhcn.zze() : zzhcnVar;
    }

    public final zzhdm zzc() {
        zzhdm zzhdmVar = this.zzd;
        return zzhdmVar == null ? zzhdm.zzg() : zzhdmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhih
    protected final Object zzdh(zzhig zzhigVar, Object obj, Object obj2) {
        zzhka zzhkaVar;
        int ordinal = zzhigVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (ordinal == 3) {
            return new zzhcj();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhci(bArr);
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
        synchronized (zzhcj.class) {
            zzhkaVar = zzf;
            if (zzhkaVar == null) {
                zzhkaVar = new zzhic(zze);
                zzf = zzhkaVar;
            }
        }
        return zzhkaVar;
    }

    final /* synthetic */ void zzh(zzhcn zzhcnVar) {
        zzhcnVar.getClass();
        this.zzc = zzhcnVar;
        this.zza |= 1;
    }

    final /* synthetic */ void zzi(zzhdm zzhdmVar) {
        zzhdmVar.getClass();
        this.zzd = zzhdmVar;
        this.zza |= 2;
    }
}
