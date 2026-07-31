package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzhne extends zzhih implements zzhjt {
    private static final zzhne zze;
    private static volatile zzhka zzf;
    private int zza;
    private zzhhb zzb;
    private zzhhb zzc;
    private zzhhb zzd;

    static {
        zzhne zzhneVar = new zzhne();
        zze = zzhneVar;
        zzhih.zzbu(zzhne.class, zzhneVar);
    }

    private zzhne() {
        zzhhb zzhhbVar = zzhhb.zzb;
        this.zzb = zzhhbVar;
        this.zzc = zzhhbVar;
        this.zzd = zzhhbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhih
    protected final Object zzdh(zzhig zzhigVar, Object obj, Object obj2) {
        zzhka zzhkaVar;
        int ordinal = zzhigVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zze, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (ordinal == 3) {
            return new zzhne();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhnd(bArr);
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
        synchronized (zzhne.class) {
            zzhkaVar = zzf;
            if (zzhkaVar == null) {
                zzhkaVar = new zzhic(zze);
                zzf = zzhkaVar;
            }
        }
        return zzhkaVar;
    }
}
