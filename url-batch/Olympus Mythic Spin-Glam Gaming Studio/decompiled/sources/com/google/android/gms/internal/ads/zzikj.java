package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes6.dex */
public final class zzikj extends zzifm implements zzigx {
    private static final zzikj zze;
    private static volatile zzihe zzf;
    private int zza;
    private int zzb;
    private zziei zzc;
    private zziei zzd;

    static {
        zzikj zzikjVar = new zzikj();
        zze = zzikjVar;
        zzifm.zzbu(zzikj.class, zzikjVar);
    }

    private zzikj() {
        zziei zzieiVar = zziei.zza;
        this.zzc = zzieiVar;
        this.zzd = zzieiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    protected final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzifm.zzbv(zze, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (ordinal == 3) {
            return new zzikj();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zziki(bArr);
        }
        if (ordinal == 5) {
            return zze;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar = zzf;
        if (zziheVar == null) {
            synchronized (zzikj.class) {
                try {
                    zziheVar = zzf;
                    if (zziheVar == null) {
                        zziheVar = new zzifh(zze);
                        zzf = zziheVar;
                    }
                } finally {
                }
            }
        }
        return zziheVar;
    }
}
