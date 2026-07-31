package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes15.dex */
public final class zzayr extends zzifm implements zzigx {
    private static final zzayr zzd;
    private static volatile zzihe zze;
    private int zza;
    private int zzb;
    private long zzc = -1;

    static {
        zzayr zzayrVar = new zzayr();
        zzd = zzayrVar;
        zzifm.zzbu(zzayr.class, zzayrVar);
    }

    private zzayr() {
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    protected final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzifm.zzbv(zzd, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001", new Object[]{"zza", "zzb", zzaye.zza, "zzc"});
        }
        if (ordinal == 3) {
            return new zzayr();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzayq(bArr);
        }
        if (ordinal == 5) {
            return zzd;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar = zze;
        if (zziheVar == null) {
            synchronized (zzayr.class) {
                try {
                    zziheVar = zze;
                    if (zziheVar == null) {
                        zziheVar = new zzifh(zzd);
                        zze = zziheVar;
                    }
                } finally {
                }
            }
        }
        return zziheVar;
    }
}
