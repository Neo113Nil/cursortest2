package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes3.dex */
public final class zzfru extends zzifm implements zzigx {
    private static final zzfru zzi;
    private static volatile zzihe zzj;
    private long zzb;
    private long zzc;
    private boolean zzd;
    private long zze;
    private long zzf;
    private int zzh;
    private String zza = "";
    private String zzg = "";

    static {
        zzfru zzfruVar = new zzfru();
        zzi = zzfruVar;
        zzifm.zzbu(zzfru.class, zzfruVar);
    }

    private zzfru() {
    }

    public static zzfrt zza() {
        return (zzfrt) zzi.zzbn();
    }

    final /* synthetic */ void zzb(String str) {
        str.getClass();
        this.zza = str;
    }

    final /* synthetic */ void zzc(long j) {
        this.zzb = j;
    }

    final /* synthetic */ void zzd(long j) {
        this.zzc = j;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    protected final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzifm.zzbv(zzi, "\u0004\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003\u0002\u0004\u0007\u0005\u0002\u0006\u0002\u0007Ȉ\b\f", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (ordinal == 3) {
            return new zzfru();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzfrt(bArr);
        }
        if (ordinal == 5) {
            return zzi;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar = zzj;
        if (zziheVar == null) {
            synchronized (zzfru.class) {
                try {
                    zziheVar = zzj;
                    if (zziheVar == null) {
                        zziheVar = new zzifh(zzi);
                        zzj = zziheVar;
                    }
                } finally {
                }
            }
        }
        return zziheVar;
    }

    final /* synthetic */ void zze(boolean z) {
        this.zzd = z;
    }

    final /* synthetic */ void zzg(long j) {
        this.zze = j;
    }

    final /* synthetic */ void zzh(long j) {
        this.zzf = j;
    }

    final /* synthetic */ void zzi(String str) {
        str.getClass();
        this.zzg = str;
    }

    final /* synthetic */ void zzk(int i) {
        this.zzh = i - 2;
    }
}
