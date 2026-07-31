package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes3.dex */
public final class zzbet extends zzifm implements zzigx {
    private static final zzbet zzd;
    private static volatile zzihe zze;
    private int zza;
    private int zzb;
    private int zzc;

    static {
        zzbet zzbetVar = new zzbet();
        zzd = zzbetVar;
        zzifm.zzbu(zzbet.class, zzbetVar);
    }

    private zzbet() {
    }

    public static zzbet zzc() {
        return zzd;
    }

    public final int zza() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    protected final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzifm.zzbv(zzd, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zza", "zzb", "zzc"});
        }
        if (ordinal == 3) {
            return new zzbet();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzbes(bArr);
        }
        if (ordinal == 5) {
            return zzd;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar = zze;
        if (zziheVar == null) {
            synchronized (zzbet.class) {
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
