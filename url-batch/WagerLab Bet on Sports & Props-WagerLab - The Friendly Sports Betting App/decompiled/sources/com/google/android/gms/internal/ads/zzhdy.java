package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
@Deprecated
/* loaded from: classes5.dex */
public final class zzhdy extends zzhih implements zzhjt {
    private static final zzhdy zzf;
    private static volatile zzhka zzg;
    private int zzc;
    private boolean zzd;
    private String zza = "";
    private String zzb = "";
    private String zze = "";

    static {
        zzhdy zzhdyVar = new zzhdy();
        zzf = zzhdyVar;
        zzhih.zzbu(zzhdy.class, zzhdyVar);
    }

    private zzhdy() {
    }

    @Override // com.google.android.gms.internal.ads.zzhih
    protected final Object zzdh(zzhig zzhigVar, Object obj, Object obj2) {
        zzhka zzhkaVar;
        int ordinal = zzhigVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzf, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u0007\u0005Ȉ", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (ordinal == 3) {
            return new zzhdy();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhdx(bArr);
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
        synchronized (zzhdy.class) {
            zzhkaVar = zzg;
            if (zzhkaVar == null) {
                zzhkaVar = new zzhic(zzf);
                zzg = zzhkaVar;
            }
        }
        return zzhkaVar;
    }
}
