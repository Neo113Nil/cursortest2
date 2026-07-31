package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzhmf extends zzhih implements zzhjt {
    private static final zzhmf zzb;
    private static volatile zzhka zzc;
    private zzhit zza = zzbM();

    static {
        zzhmf zzhmfVar = new zzhmf();
        zzb = zzhmfVar;
        zzhih.zzbu(zzhmf.class, zzhmfVar);
    }

    private zzhmf() {
    }

    public static zzhme zzc() {
        return (zzhme) zzb.zzbn();
    }

    final /* synthetic */ void zzd(zzhmd zzhmdVar) {
        zzhmdVar.getClass();
        zzhit zzhitVar = this.zza;
        if (!zzhitVar.zza()) {
            this.zza = zzhih.zzbN(zzhitVar);
        }
        this.zza.add(zzhmdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhih
    protected final Object zzdh(zzhig zzhigVar, Object obj, Object obj2) {
        zzhka zzhkaVar;
        int ordinal = zzhigVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zza", zzhmd.class});
        }
        if (ordinal == 3) {
            return new zzhmf();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhme(bArr);
        }
        if (ordinal == 5) {
            return zzb;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzhka zzhkaVar2 = zzc;
        if (zzhkaVar2 != null) {
            return zzhkaVar2;
        }
        synchronized (zzhmf.class) {
            zzhkaVar = zzc;
            if (zzhkaVar == null) {
                zzhkaVar = new zzhic(zzb);
                zzc = zzhkaVar;
            }
        }
        return zzhkaVar;
    }
}
