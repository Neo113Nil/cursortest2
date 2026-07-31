package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzheg extends zzhih implements zzhjt {
    private static final zzheg zzc;
    private static volatile zzhka zzd;
    private int zza;
    private zzhit zzb = zzbM();

    static {
        zzheg zzhegVar = new zzheg();
        zzc = zzhegVar;
        zzhih.zzbu(zzheg.class, zzhegVar);
    }

    private zzheg() {
    }

    public static zzhed zza() {
        return (zzhed) zzc.zzbn();
    }

    final /* synthetic */ void zzb(int i) {
        this.zza = i;
    }

    final /* synthetic */ void zzc(zzhef zzhefVar) {
        zzhefVar.getClass();
        zzhit zzhitVar = this.zzb;
        if (!zzhitVar.zza()) {
            this.zzb = zzhih.zzbN(zzhitVar);
        }
        this.zzb.add(zzhefVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhih
    protected final Object zzdh(zzhig zzhigVar, Object obj, Object obj2) {
        zzhka zzhkaVar;
        int ordinal = zzhigVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zza", "zzb", zzhef.class});
        }
        if (ordinal == 3) {
            return new zzheg();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhed(bArr);
        }
        if (ordinal == 5) {
            return zzc;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzhka zzhkaVar2 = zzd;
        if (zzhkaVar2 != null) {
            return zzhkaVar2;
        }
        synchronized (zzheg.class) {
            zzhkaVar = zzd;
            if (zzhkaVar == null) {
                zzhkaVar = new zzhic(zzc);
                zzd = zzhkaVar;
            }
        }
        return zzhkaVar;
    }
}
