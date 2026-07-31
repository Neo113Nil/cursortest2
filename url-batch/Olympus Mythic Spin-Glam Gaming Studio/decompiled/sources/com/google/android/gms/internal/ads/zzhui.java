package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes6.dex */
public final class zzhui extends zzifm implements zzigx {
    private static final zzhui zzd;
    private static volatile zzihe zze;
    private int zza;
    private int zzb;
    private zzhuk zzc;

    static {
        zzhui zzhuiVar = new zzhui();
        zzd = zzhuiVar;
        zzifm.zzbu(zzhui.class, zzhuiVar);
    }

    private zzhui() {
    }

    public static zzhui zzc(zziei zzieiVar, zziew zziewVar) throws zzige {
        return (zzhui) zzifm.zzbT(zzd, zzieiVar, zziewVar);
    }

    public static zzhuh zzd() {
        return (zzhuh) zzd.zzbn();
    }

    public static zzihe zze() {
        return zzd.zzbd();
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzhuk zzb() {
        zzhuk zzhukVar = this.zzc;
        return zzhukVar == null ? zzhuk.zzd() : zzhukVar;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    protected final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzifm.zzbv(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zza", "zzb", "zzc"});
        }
        if (ordinal == 3) {
            return new zzhui();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhuh(bArr);
        }
        if (ordinal == 5) {
            return zzd;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar = zze;
        if (zziheVar == null) {
            synchronized (zzhui.class) {
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

    final /* synthetic */ void zzg(zzhuk zzhukVar) {
        zzhukVar.getClass();
        this.zzc = zzhukVar;
        this.zza |= 1;
    }
}
