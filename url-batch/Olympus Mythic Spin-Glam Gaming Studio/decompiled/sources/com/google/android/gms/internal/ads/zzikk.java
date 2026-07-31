package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes6.dex */
public final class zzikk extends zzifm implements zzigx {
    private static final zzikk zzi;
    private static volatile zzihe zzj;
    private int zza;
    private zzikj zzb;
    private zziei zzd;
    private zziei zze;
    private int zzf;
    private zziei zzg;
    private byte zzh = 2;
    private zzify zzc = zzifm.zzbM();

    static {
        zzikk zzikkVar = new zzikk();
        zzi = zzikkVar;
        zzifm.zzbu(zzikk.class, zzikkVar);
    }

    private zzikk() {
        zziei zzieiVar = zziei.zza;
        this.zzd = zzieiVar;
        this.zze = zzieiVar;
        this.zzg = zzieiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    protected final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        byte[] bArr = null;
        switch (zziflVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.zzh);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.zzh = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return zzifm.zzbv(zzi, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003\u0006ည\u0004", new Object[]{"zza", "zzb", "zzc", zzikc.class, "zzd", "zze", "zzf", "zzg"});
            case NEW_MUTABLE_INSTANCE:
                return new zzikk();
            case NEW_BUILDER:
                return new zzikh(bArr);
            case GET_DEFAULT_INSTANCE:
                return zzi;
            case GET_PARSER:
                zzihe zziheVar = zzj;
                if (zziheVar == null) {
                    synchronized (zzikk.class) {
                        try {
                            zziheVar = zzj;
                            if (zziheVar == null) {
                                zziheVar = new zzifh(zzi);
                                zzj = zziheVar;
                            }
                        } finally {
                        }
                    }
                }
                return zziheVar;
            default:
                throw null;
        }
    }
}
