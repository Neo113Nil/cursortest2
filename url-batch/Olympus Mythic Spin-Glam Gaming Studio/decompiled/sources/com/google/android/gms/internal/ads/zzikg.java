package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes6.dex */
public final class zzikg extends zzifm implements zzigx {
    private static final zzikg zzh;
    private static volatile zzihe zzi;
    private int zza;
    private zzikf zzb;
    private zziei zzd;
    private zziei zze;
    private int zzf;
    private byte zzg = 2;
    private zzify zzc = zzifm.zzbM();

    static {
        zzikg zzikgVar = new zzikg();
        zzh = zzikgVar;
        zzifm.zzbu(zzikg.class, zzikgVar);
    }

    private zzikg() {
        zziei zzieiVar = zziei.zza;
        this.zzd = zzieiVar;
        this.zze = zzieiVar;
    }

    public static zzikd zzc() {
        return (zzikd) zzh.zzbn();
    }

    final /* synthetic */ void zzd(zzikc zzikcVar) {
        zzikcVar.getClass();
        zzify zzifyVar = this.zzc;
        if (!zzifyVar.zza()) {
            this.zzc = zzifm.zzbN(zzifyVar);
        }
        this.zzc.add(zzikcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    protected final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        byte[] bArr = null;
        switch (zziflVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.zzg);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.zzg = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return zzifm.zzbv(zzh, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003", new Object[]{"zza", "zzb", "zzc", zzikc.class, "zzd", "zze", "zzf"});
            case NEW_MUTABLE_INSTANCE:
                return new zzikg();
            case NEW_BUILDER:
                return new zzikd(bArr);
            case GET_DEFAULT_INSTANCE:
                return zzh;
            case GET_PARSER:
                zzihe zziheVar = zzi;
                if (zziheVar == null) {
                    synchronized (zzikg.class) {
                        try {
                            zziheVar = zzi;
                            if (zziheVar == null) {
                                zziheVar = new zzifh(zzh);
                                zzi = zziheVar;
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
