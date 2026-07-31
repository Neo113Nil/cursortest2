package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes6.dex */
public final class zzhrw extends zzifm implements zzigx {
    private static final zzhrw zzd;
    private static volatile zzihe zze;
    private int zza;
    private zzhsa zzb;
    private zzhtp zzc;

    static {
        zzhrw zzhrwVar = new zzhrw();
        zzd = zzhrwVar;
        zzifm.zzbu(zzhrw.class, zzhrwVar);
    }

    private zzhrw() {
    }

    public static zzhrw zzc(zziei zzieiVar, zziew zziewVar) throws zzige {
        return (zzhrw) zzifm.zzbT(zzd, zzieiVar, zziewVar);
    }

    public static zzhrv zzd() {
        return (zzhrv) zzd.zzbn();
    }

    public final zzhsa zza() {
        zzhsa zzhsaVar = this.zzb;
        return zzhsaVar == null ? zzhsa.zzd() : zzhsaVar;
    }

    public final zzhtp zzb() {
        zzhtp zzhtpVar = this.zzc;
        return zzhtpVar == null ? zzhtp.zzg() : zzhtpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    protected final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzifm.zzbv(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zza", "zzb", "zzc"});
        }
        if (ordinal == 3) {
            return new zzhrw();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhrv(bArr);
        }
        if (ordinal == 5) {
            return zzd;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar = zze;
        if (zziheVar == null) {
            synchronized (zzhrw.class) {
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

    final /* synthetic */ void zze(zzhsa zzhsaVar) {
        zzhsaVar.getClass();
        this.zzb = zzhsaVar;
        this.zza |= 1;
    }

    final /* synthetic */ void zzg(zzhtp zzhtpVar) {
        zzhtpVar.getClass();
        this.zzc = zzhtpVar;
        this.zza |= 2;
    }
}
