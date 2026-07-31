package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes6.dex */
public final class zzhuv extends zzifm implements zzigx {
    private static final zzhuv zzb;
    private static volatile zzihe zzc;
    private int zza;

    static {
        zzhuv zzhuvVar = new zzhuv();
        zzb = zzhuvVar;
        zzifm.zzbu(zzhuv.class, zzhuvVar);
    }

    private zzhuv() {
    }

    public static zzhuu zzb() {
        return (zzhuu) zzb.zzbn();
    }

    public static zzhuv zzc() {
        return zzb;
    }

    public final zzhtl zza() {
        zzhtl zzb2 = zzhtl.zzb(this.zza);
        return zzb2 == null ? zzhtl.UNRECOGNIZED : zzb2;
    }

    final /* synthetic */ void zzd(zzhtl zzhtlVar) {
        this.zza = zzhtlVar.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    protected final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzifm.zzbv(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"zza"});
        }
        if (ordinal == 3) {
            return new zzhuv();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhuu(bArr);
        }
        if (ordinal == 5) {
            return zzb;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar = zzc;
        if (zziheVar == null) {
            synchronized (zzhuv.class) {
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
