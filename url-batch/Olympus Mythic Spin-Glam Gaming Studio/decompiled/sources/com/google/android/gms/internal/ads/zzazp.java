package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes15.dex */
public final class zzazp extends zzifm implements zzigx {
    private static final zzazp zze;
    private static volatile zzihe zzf;
    private int zza;
    private long zzb;
    private String zzc = "";
    private zziei zzd = zziei.zza;

    static {
        zzazp zzazpVar = new zzazp();
        zze = zzazpVar;
        zzifm.zzbu(zzazp.class, zzazpVar);
    }

    private zzazp() {
    }

    public static zzazp zze() {
        return zze;
    }

    public final boolean zza() {
        return (this.zza & 1) != 0;
    }

    public final long zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zzc;
    }

    public final zziei zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    protected final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzifm.zzbv(zze, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0003ဈ\u0001\u0004ည\u0002", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (ordinal == 3) {
            return new zzazp();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzazo(bArr);
        }
        if (ordinal == 5) {
            return zze;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar = zzf;
        if (zziheVar == null) {
            synchronized (zzazp.class) {
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
