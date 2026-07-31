package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzhdh extends zzhih implements zzhjt {
    private static final zzhdh zzc;
    private static volatile zzhka zzd;
    private int zza;
    private zzhhb zzb = zzhhb.zzb;

    static {
        zzhdh zzhdhVar = new zzhdh();
        zzc = zzhdhVar;
        zzhih.zzbu(zzhdh.class, zzhdhVar);
    }

    private zzhdh() {
    }

    public static zzhdh zzc(zzhhb zzhhbVar, zzhhr zzhhrVar) throws zzhiw {
        return (zzhdh) zzhih.zzbT(zzc, zzhhbVar, zzhhrVar);
    }

    public static zzhdg zzd() {
        return (zzhdg) zzc.zzbn();
    }

    public static zzhka zze() {
        return zzc.zzbd();
    }

    public final int zza() {
        return this.zza;
    }

    public final zzhhb zzb() {
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
            return zzbv(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zza", "zzb"});
        }
        if (ordinal == 3) {
            return new zzhdh();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhdg(bArr);
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
        synchronized (zzhdh.class) {
            zzhkaVar = zzd;
            if (zzhkaVar == null) {
                zzhkaVar = new zzhic(zzc);
                zzd = zzhkaVar;
            }
        }
        return zzhkaVar;
    }

    final /* synthetic */ void zzg(zzhhb zzhhbVar) {
        this.zzb = zzhhbVar;
    }
}
