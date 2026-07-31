package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzfhq extends zzhih implements zzhjt {
    private static final zzfhq zzc;
    private static volatile zzhka zzd;
    private int zza;
    private long zzb;

    static {
        zzfhq zzfhqVar = new zzfhq();
        zzc = zzfhqVar;
        zzhih.zzbu(zzfhq.class, zzfhqVar);
    }

    private zzfhq() {
    }

    public static zzfhp zza() {
        return (zzfhp) zzc.zzbn();
    }

    final /* synthetic */ void zzb(long j) {
        this.zzb = j;
    }

    final /* synthetic */ void zzd(int i) {
        this.zza = i - 2;
    }

    @Override // com.google.android.gms.internal.ads.zzhih
    protected final Object zzdh(zzhig zzhigVar, Object obj, Object obj2) {
        zzhka zzhkaVar;
        int ordinal = zzhigVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzc, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u0002", new Object[]{"zza", "zzb"});
        }
        if (ordinal == 3) {
            return new zzfhq();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzfhp(bArr);
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
        synchronized (zzfhq.class) {
            zzhkaVar = zzd;
            if (zzhkaVar == null) {
                zzhkaVar = new zzhic(zzc);
                zzd = zzhkaVar;
            }
        }
        return zzhkaVar;
    }
}
