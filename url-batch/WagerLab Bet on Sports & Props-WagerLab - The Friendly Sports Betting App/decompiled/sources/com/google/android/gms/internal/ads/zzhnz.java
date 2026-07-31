package com.google.android.gms.internal.ads;

import androidx.media3.common.MimeTypes;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzhnz extends zzhih implements zzhjt {
    private static final zzhnz zzf;
    private static volatile zzhka zzg;
    private int zza;
    private int zzb;
    private String zzc = "";
    private zzhhb zzd;
    private zzhhb zze;

    static {
        zzhnz zzhnzVar = new zzhnz();
        zzf = zzhnzVar;
        zzhih.zzbu(zzhnz.class, zzhnzVar);
    }

    private zzhnz() {
        zzhhb zzhhbVar = zzhhb.zzb;
        this.zzd = zzhhbVar;
        this.zze = zzhhbVar;
    }

    public static zzhnx zzc() {
        return (zzhnx) zzf.zzbn();
    }

    final /* synthetic */ void zzd(String str) {
        this.zza |= 2;
        this.zzc = MimeTypes.IMAGE_PNG;
    }

    @Override // com.google.android.gms.internal.ads.zzhih
    protected final Object zzdh(zzhig zzhigVar, Object obj, Object obj2) {
        zzhka zzhkaVar;
        int ordinal = zzhigVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zza", "zzb", zzhny.zza, "zzc", "zzd", "zze"});
        }
        if (ordinal == 3) {
            return new zzhnz();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhnx(bArr);
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
        synchronized (zzhnz.class) {
            zzhkaVar = zzg;
            if (zzhkaVar == null) {
                zzhkaVar = new zzhic(zzf);
                zzg = zzhkaVar;
            }
        }
        return zzhkaVar;
    }

    final /* synthetic */ void zze(zzhhb zzhhbVar) {
        zzhhbVar.getClass();
        this.zza |= 4;
        this.zzd = zzhhbVar;
    }

    final /* synthetic */ void zzh(int i) {
        this.zzb = 1;
        this.zza = 1 | this.zza;
    }
}
