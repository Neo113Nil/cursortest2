package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzhom extends zzhih implements zzhjt {
    private static final zzhom zzd;
    private static volatile zzhka zze;
    private int zza;
    private int zzb;
    private int zzc;

    static {
        zzhom zzhomVar = new zzhom();
        zzd = zzhomVar;
        zzhih.zzbu(zzhom.class, zzhomVar);
    }

    private zzhom() {
    }

    @Override // com.google.android.gms.internal.ads.zzhih
    protected final Object zzdh(zzhig zzhigVar, Object obj, Object obj2) {
        zzhka zzhkaVar;
        int ordinal = zzhigVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            zzhin zzhinVar = zzhol.zza;
            return zzbv(zzd, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zza", "zzb", zzhinVar, "zzc", zzhinVar});
        }
        if (ordinal == 3) {
            return new zzhom();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhok(bArr);
        }
        if (ordinal == 5) {
            return zzd;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzhka zzhkaVar2 = zze;
        if (zzhkaVar2 != null) {
            return zzhkaVar2;
        }
        synchronized (zzhom.class) {
            zzhkaVar = zze;
            if (zzhkaVar == null) {
                zzhkaVar = new zzhic(zzd);
                zze = zzhkaVar;
            }
        }
        return zzhkaVar;
    }
}
