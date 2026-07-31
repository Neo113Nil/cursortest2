package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzfwc extends zzhih implements zzhjt {
    private static final zzfwc zzc;
    private static volatile zzhka zzd;
    private int zza;
    private zzara zzb;

    static {
        zzfwc zzfwcVar = new zzfwc();
        zzc = zzfwcVar;
        zzhih.zzbu(zzfwc.class, zzfwcVar);
    }

    private zzfwc() {
    }

    public static zzfwb zza() {
        return (zzfwb) zzc.zzbn();
    }

    final /* synthetic */ void zzb(zzara zzaraVar) {
        zzaraVar.getClass();
        this.zzb = zzaraVar;
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
            return zzbv(zzc, "\u0004\u0001\u0000\u0001\u0012\u0012\u0001\u0000\u0000\u0000\u0012ဉ\u0000", new Object[]{"zza", "zzb"});
        }
        if (ordinal == 3) {
            return new zzfwc();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzfwb(bArr);
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
        synchronized (zzfwc.class) {
            zzhkaVar = zzd;
            if (zzhkaVar == null) {
                zzhkaVar = new zzhic(zzc);
                zzd = zzhkaVar;
            }
        }
        return zzhkaVar;
    }
}
