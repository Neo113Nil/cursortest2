package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzhdb extends zzhih implements zzhjt {
    private static final zzhdb zzc;
    private static volatile zzhka zzd;
    private int zza;
    private int zzb;

    static {
        zzhdb zzhdbVar = new zzhdb();
        zzc = zzhdbVar;
        zzhih.zzbu(zzhdb.class, zzhdbVar);
    }

    private zzhdb() {
    }

    public static zzhdb zzc(zzhhb zzhhbVar, zzhhr zzhhrVar) throws zzhiw {
        return (zzhdb) zzhih.zzbT(zzc, zzhhbVar, zzhhrVar);
    }

    public static zzhda zzd() {
        return (zzhda) zzc.zzbn();
    }

    public final int zza() {
        return this.zza;
    }

    public final int zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhih
    protected final Object zzdh(zzhig zzhigVar, Object obj, Object obj2) {
        zzhka zzhkaVar;
        int ordinal = zzhigVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzc, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"zza", "zzb"});
        }
        if (ordinal == 3) {
            return new zzhdb();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhda(bArr);
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
        synchronized (zzhdb.class) {
            zzhkaVar = zzd;
            if (zzhkaVar == null) {
                zzhkaVar = new zzhic(zzc);
                zzd = zzhkaVar;
            }
        }
        return zzhkaVar;
    }

    final /* synthetic */ void zze(int i) {
        this.zza = i;
    }
}
