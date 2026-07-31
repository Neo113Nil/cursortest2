package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes3.dex */
public final class zzbdy extends zzifm implements zzigx {
    private static final zzbdy zze;
    private static volatile zzihe zzf;
    private int zza;
    private int zzb;
    private String zzc = "";
    private zzifu zzd = zzifm.zzbC();

    static {
        zzbdy zzbdyVar = new zzbdy();
        zze = zzbdyVar;
        zzifm.zzbu(zzbdy.class, zzbdyVar);
    }

    private zzbdy() {
    }

    public static zzbdx zza() {
        return (zzbdx) zze.zzbn();
    }

    final /* synthetic */ void zzc(int i) {
        this.zzb = 15;
        this.zza |= 1;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    protected final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzifm.zzbv(zze, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဌ\u0000\u0002ለ\u0001\u0003'", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (ordinal == 3) {
            return new zzbdy();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzbdx(bArr);
        }
        if (ordinal == 5) {
            return zze;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar = zzf;
        if (zziheVar == null) {
            synchronized (zzbdy.class) {
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
