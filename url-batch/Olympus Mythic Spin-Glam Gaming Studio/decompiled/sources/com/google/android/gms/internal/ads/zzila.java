package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes11.dex */
public final class zzila extends zzifm implements zzigx {
    private static final zzila zzl;
    private static volatile zzihe zzm;
    private int zza;
    private int zzb;
    private zzikg zzd;
    private zzikk zze;
    private int zzf;
    private int zzi;
    private byte zzk = 2;
    private String zzc = "";
    private zzifu zzg = zzifm.zzbC();
    private String zzh = "";
    private zzify zzj = zzifm.zzbM();

    static {
        zzila zzilaVar = new zzila();
        zzl = zzilaVar;
        zzifm.zzbu(zzila.class, zzilaVar);
    }

    private zzila() {
    }

    public static zzikz zze() {
        return (zzikz) zzl.zzbn();
    }

    public final String zzc() {
        return this.zzc;
    }

    public final int zzd() {
        return this.zzj.size();
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    protected final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        byte[] bArr = null;
        switch (zziflVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.zzk);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.zzk = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return zzifm.zzbv(zzl, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0003\u0001ᔄ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005င\u0004\u0006\u0016\u0007ဈ\u0005\b᠌\u0006\t\u001a", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", zzikx.zza, "zzj"});
            case NEW_MUTABLE_INSTANCE:
                return new zzila();
            case NEW_BUILDER:
                return new zzikz(bArr);
            case GET_DEFAULT_INSTANCE:
                return zzl;
            case GET_PARSER:
                zzihe zziheVar = zzm;
                if (zziheVar == null) {
                    synchronized (zzila.class) {
                        try {
                            zziheVar = zzm;
                            if (zziheVar == null) {
                                zziheVar = new zzifh(zzl);
                                zzm = zziheVar;
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

    final /* synthetic */ void zzg(int i) {
        this.zza |= 1;
        this.zzb = i;
    }

    final /* synthetic */ void zzh(String str) {
        str.getClass();
        this.zza |= 2;
        this.zzc = str;
    }

    final /* synthetic */ void zzi(zzikg zzikgVar) {
        zzikgVar.getClass();
        this.zzd = zzikgVar;
        this.zza |= 4;
    }

    final /* synthetic */ void zzj(String str) {
        str.getClass();
        zzify zzifyVar = this.zzj;
        if (!zzifyVar.zza()) {
            this.zzj = zzifm.zzbN(zzifyVar);
        }
        this.zzj.add(str);
    }

    final /* synthetic */ void zzl(int i) {
        this.zzi = i - 1;
        this.zza |= 64;
    }
}
