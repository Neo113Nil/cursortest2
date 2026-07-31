package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzars extends zzhih implements zzhjt {
    private static final zzars zzi;
    private static volatile zzhka zzj;
    private int zza;
    private long zzb;
    private long zzc;
    private int zzd;
    private long zzg;
    private String zze = "";
    private String zzf = "";
    private String zzh = "";

    static {
        zzars zzarsVar = new zzars();
        zzi = zzarsVar;
        zzhih.zzbu(zzars.class, zzarsVar);
    }

    private zzars() {
    }

    public static zzarr zza() {
        return (zzarr) zzi.zzbn();
    }

    final /* synthetic */ void zzb(long j) {
        this.zza |= 1;
        this.zzb = j;
    }

    final /* synthetic */ void zzc(long j) {
        this.zza |= 2;
        this.zzc = j;
    }

    final /* synthetic */ void zzd(String str) {
        str.getClass();
        this.zza |= 8;
        this.zze = str;
    }

    @Override // com.google.android.gms.internal.ads.zzhih
    protected final Object zzdh(zzhig zzhigVar, Object obj, Object obj2) {
        zzhka zzhkaVar;
        int ordinal = zzhigVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzi, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003᠌\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဈ\u0006", new Object[]{"zza", "zzb", "zzc", "zzd", zzart.zza, "zze", "zzf", "zzg", "zzh"});
        }
        if (ordinal == 3) {
            return new zzars();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzarr(bArr);
        }
        if (ordinal == 5) {
            return zzi;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzhka zzhkaVar2 = zzj;
        if (zzhkaVar2 != null) {
            return zzhkaVar2;
        }
        synchronized (zzars.class) {
            zzhkaVar = zzj;
            if (zzhkaVar == null) {
                zzhkaVar = new zzhic(zzi);
                zzj = zzhkaVar;
            }
        }
        return zzhkaVar;
    }

    final /* synthetic */ void zze(String str) {
        str.getClass();
        this.zza |= 16;
        this.zzf = str;
    }

    final /* synthetic */ void zzg(long j) {
        this.zza |= 32;
        this.zzg = j;
    }

    final /* synthetic */ void zzh(String str) {
        this.zza |= 64;
        this.zzh = str;
    }

    final /* synthetic */ void zzj(int i) {
        this.zzd = i - 1;
        this.zza |= 4;
    }
}
