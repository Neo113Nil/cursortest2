package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzfwe extends zzhih implements zzhjt {
    private static final zzfwe zzd;
    private static volatile zzhka zze;
    private int zza;
    private zzhit zzb = zzbM();
    private zzhlt zzc;

    static {
        zzfwe zzfweVar = new zzfwe();
        zzd = zzfweVar;
        zzhih.zzbu(zzfwe.class, zzfweVar);
    }

    private zzfwe() {
    }

    public static zzfwd zza() {
        return (zzfwd) zzd.zzbn();
    }

    final /* synthetic */ void zzb(zzfwc zzfwcVar) {
        zzfwcVar.getClass();
        zzhit zzhitVar = this.zzb;
        if (!zzhitVar.zza()) {
            this.zzb = zzhih.zzbN(zzhitVar);
        }
        this.zzb.add(zzfwcVar);
    }

    final /* synthetic */ void zzc(zzhlt zzhltVar) {
        zzhltVar.getClass();
        this.zzc = zzhltVar;
        this.zza |= 1;
    }

    @Override // com.google.android.gms.internal.ads.zzhih
    protected final Object zzdh(zzhig zzhigVar, Object obj, Object obj2) {
        zzhka zzhkaVar;
        int ordinal = zzhigVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzd, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zza", "zzb", zzfwc.class, "zzc"});
        }
        if (ordinal == 3) {
            return new zzfwe();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzfwd(bArr);
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
        synchronized (zzfwe.class) {
            zzhkaVar = zze;
            if (zzhkaVar == null) {
                zzhkaVar = new zzhic(zzd);
                zze = zzhkaVar;
            }
        }
        return zzhkaVar;
    }
}
