package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzasx extends zzhih implements zzhjt {
    private static final zzasx zzf;
    private static volatile zzhka zzg;
    private int zza;
    private zzhhb zzb;
    private zzhhb zzc;
    private zzhhb zzd;
    private zzhhb zze;

    static {
        zzasx zzasxVar = new zzasx();
        zzf = zzasxVar;
        zzhih.zzbu(zzasx.class, zzasxVar);
    }

    private zzasx() {
        zzhhb zzhhbVar = zzhhb.zzb;
        this.zzb = zzhhbVar;
        this.zzc = zzhhbVar;
        this.zzd = zzhhbVar;
        this.zze = zzhhbVar;
    }

    public static zzasx zze(byte[] bArr, zzhhr zzhhrVar) throws zzhiw {
        return (zzasx) zzhih.zzbV(zzf, bArr, zzhhrVar);
    }

    public static zzasw zzg() {
        return (zzasw) zzf.zzbn();
    }

    public final zzhhb zza() {
        return this.zzb;
    }

    public final zzhhb zzb() {
        return this.zzc;
    }

    public final zzhhb zzc() {
        return this.zzd;
    }

    public final zzhhb zzd() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzhih
    protected final Object zzdh(zzhig zzhigVar, Object obj, Object obj2) {
        zzhka zzhkaVar;
        int ordinal = zzhigVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (ordinal == 3) {
            return new zzasx();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzasw(bArr);
        }
        if (ordinal == 5) {
            return zzf;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzhka zzhkaVar2 = zzg;
        if (zzhkaVar2 != null) {
            return zzhkaVar2;
        }
        synchronized (zzasx.class) {
            zzhkaVar = zzg;
            if (zzhkaVar == null) {
                zzhkaVar = new zzhic(zzf);
                zzg = zzhkaVar;
            }
        }
        return zzhkaVar;
    }

    final /* synthetic */ void zzh(zzhhb zzhhbVar) {
        this.zza |= 1;
        this.zzb = zzhhbVar;
    }

    final /* synthetic */ void zzi(zzhhb zzhhbVar) {
        this.zza |= 2;
        this.zzc = zzhhbVar;
    }

    final /* synthetic */ void zzj(zzhhb zzhhbVar) {
        this.zza |= 4;
        this.zzd = zzhhbVar;
    }

    final /* synthetic */ void zzk(zzhhb zzhhbVar) {
        this.zza |= 8;
        this.zze = zzhhbVar;
    }
}
