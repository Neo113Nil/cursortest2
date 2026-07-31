package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzhnb extends zzhih implements zzhjt {
    private static final zzhnb zze;
    private static volatile zzhka zzf;
    private int zza;
    private zzhhb zzb;
    private zzhhb zzc;
    private byte zzd = 2;

    static {
        zzhnb zzhnbVar = new zzhnb();
        zze = zzhnbVar;
        zzhih.zzbu(zzhnb.class, zzhnbVar);
    }

    private zzhnb() {
        zzhhb zzhhbVar = zzhhb.zzb;
        this.zzb = zzhhbVar;
        this.zzc = zzhhbVar;
    }

    public static zzhna zzc() {
        return (zzhna) zze.zzbn();
    }

    final /* synthetic */ void zzd(zzhhb zzhhbVar) {
        this.zza |= 1;
        this.zzb = zzhhbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhih
    protected final Object zzdh(zzhig zzhigVar, Object obj, Object obj2) {
        zzhka zzhkaVar;
        byte[] bArr = null;
        switch (zzhigVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.zzd);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.zzd = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return zzbv(zze, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔊ\u0000\u0002ည\u0001", new Object[]{"zza", "zzb", "zzc"});
            case NEW_MUTABLE_INSTANCE:
                return new zzhnb();
            case NEW_BUILDER:
                return new zzhna(bArr);
            case GET_DEFAULT_INSTANCE:
                return zze;
            case GET_PARSER:
                zzhka zzhkaVar2 = zzf;
                if (zzhkaVar2 != null) {
                    return zzhkaVar2;
                }
                synchronized (zzhnb.class) {
                    zzhkaVar = zzf;
                    if (zzhkaVar == null) {
                        zzhkaVar = new zzhic(zze);
                        zzf = zzhkaVar;
                    }
                }
                return zzhkaVar;
            default:
                throw null;
        }
    }

    final /* synthetic */ void zze(zzhhb zzhhbVar) {
        this.zza |= 2;
        this.zzc = zzhhbVar;
    }
}
