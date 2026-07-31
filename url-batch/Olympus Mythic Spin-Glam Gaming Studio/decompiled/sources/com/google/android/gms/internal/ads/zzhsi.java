package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes6.dex */
public final class zzhsi extends zzifm implements zzigx {
    private static final zzhsi zzb;
    private static volatile zzihe zzc;
    private int zza;

    static {
        zzhsi zzhsiVar = new zzhsi();
        zzb = zzhsiVar;
        zzifm.zzbu(zzhsi.class, zzhsiVar);
    }

    private zzhsi() {
    }

    public static zzhsh zzb() {
        return (zzhsh) zzb.zzbn();
    }

    public static zzhsi zzc() {
        return zzb;
    }

    public final int zza() {
        return this.zza;
    }

    final /* synthetic */ void zzd(int i) {
        this.zza = i;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    protected final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzifm.zzbv(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zza"});
        }
        if (ordinal == 3) {
            return new zzhsi();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhsh(bArr);
        }
        if (ordinal == 5) {
            return zzb;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar = zzc;
        if (zziheVar == null) {
            synchronized (zzhsi.class) {
                try {
                    zziheVar = zzc;
                    if (zziheVar == null) {
                        zziheVar = new zzifh(zzb);
                        zzc = zziheVar;
                    }
                } finally {
                }
            }
        }
        return zziheVar;
    }
}
