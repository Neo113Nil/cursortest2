package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes3.dex */
public final class zzbeg extends zzifm implements zzigx {
    private static final zzbeg zzd;
    private static volatile zzihe zze;
    private int zza;
    private zzify zzb = zzifm.zzbM();
    private zzbdy zzc;

    static {
        zzbeg zzbegVar = new zzbeg();
        zzd = zzbegVar;
        zzifm.zzbu(zzbeg.class, zzbegVar);
    }

    private zzbeg() {
    }

    public static zzbef zza() {
        return (zzbef) zzd.zzbn();
    }

    final /* synthetic */ void zzb(zzbee zzbeeVar) {
        zzbeeVar.getClass();
        zzify zzifyVar = this.zzb;
        if (!zzifyVar.zza()) {
            this.zzb = zzifm.zzbN(zzifyVar);
        }
        this.zzb.add(zzbeeVar);
    }

    final /* synthetic */ void zzc(zzbdy zzbdyVar) {
        zzbdyVar.getClass();
        this.zzc = zzbdyVar;
        this.zza |= 1;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    protected final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzifm.zzbv(zzd, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zza", "zzb", zzbee.class, "zzc"});
        }
        if (ordinal == 3) {
            return new zzbeg();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzbef(bArr);
        }
        if (ordinal == 5) {
            return zzd;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar = zze;
        if (zziheVar == null) {
            synchronized (zzbeg.class) {
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
