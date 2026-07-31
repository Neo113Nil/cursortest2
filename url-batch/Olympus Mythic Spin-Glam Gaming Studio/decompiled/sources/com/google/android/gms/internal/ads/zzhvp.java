package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes6.dex */
public final class zzhvp extends zzifm implements zzigx {
    private static final zzhvp zzc;
    private static volatile zzihe zzd;
    private int zza;
    private zziei zzb = zziei.zza;

    static {
        zzhvp zzhvpVar = new zzhvp();
        zzc = zzhvpVar;
        zzifm.zzbu(zzhvp.class, zzhvpVar);
    }

    private zzhvp() {
    }

    public static zzhvp zzc(zziei zzieiVar, zziew zziewVar) throws zzige {
        return (zzhvp) zzifm.zzbT(zzc, zzieiVar, zziewVar);
    }

    public static zzhvo zzd() {
        return (zzhvo) zzc.zzbn();
    }

    public static zzihe zze() {
        return zzc.zzbd();
    }

    public final int zza() {
        return this.zza;
    }

    public final zziei zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    protected final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzifm.zzbv(zzc, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zza", "zzb"});
        }
        if (ordinal == 3) {
            return new zzhvp();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhvo(bArr);
        }
        if (ordinal == 5) {
            return zzc;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar = zzd;
        if (zziheVar == null) {
            synchronized (zzhvp.class) {
                try {
                    zziheVar = zzd;
                    if (zziheVar == null) {
                        zziheVar = new zzifh(zzc);
                        zzd = zziheVar;
                    }
                } finally {
                }
            }
        }
        return zziheVar;
    }

    final /* synthetic */ void zzg(zziei zzieiVar) {
        zzieiVar.getClass();
        this.zzb = zzieiVar;
    }
}
