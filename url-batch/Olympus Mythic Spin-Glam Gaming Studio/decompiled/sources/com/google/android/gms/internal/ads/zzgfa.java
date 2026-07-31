package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes4.dex */
public final class zzgfa extends zzifm implements zzigx {
    private static final zzgfa zzf;
    private static volatile zzihe zzg;
    private int zza;
    private float zzc;
    private String zzb = "https://pagead2.googlesyndication.com/pagead/ping?e=2&f=1";
    private long zzd = 1000;
    private long zze = 60000;

    static {
        zzgfa zzgfaVar = new zzgfa();
        zzf = zzgfaVar;
        zzifm.zzbu(zzgfa.class, zzgfaVar);
    }

    private zzgfa() {
    }

    public static zzgez zze() {
        return (zzgez) zzf.zzbn();
    }

    public static zzgfa zzg() {
        return zzf;
    }

    public final String zza() {
        return this.zzb;
    }

    public final float zzb() {
        return this.zzc;
    }

    public final long zzc() {
        return this.zzd;
    }

    public final long zzd() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    protected final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzifm.zzbv(zzf, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ခ\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (ordinal == 3) {
            return new zzgfa();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzgez(bArr);
        }
        if (ordinal == 5) {
            return zzf;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar = zzg;
        if (zziheVar == null) {
            synchronized (zzgfa.class) {
                try {
                    zziheVar = zzg;
                    if (zziheVar == null) {
                        zziheVar = new zzifh(zzf);
                        zzg = zziheVar;
                    }
                } finally {
                }
            }
        }
        return zziheVar;
    }

    final /* synthetic */ void zzh(float f) {
        this.zza |= 2;
        this.zzc = f;
    }
}
