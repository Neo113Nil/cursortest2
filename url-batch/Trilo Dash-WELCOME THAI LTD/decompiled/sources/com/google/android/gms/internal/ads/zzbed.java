package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzbed extends zzgko implements zzglz {
    private static final zzbed zzb;
    private int zze;
    private boolean zzf;
    private int zzg;

    static {
        zzbed zzbedVar = new zzbed();
        zzb = zzbedVar;
        zzgko.zzaN(zzbed.class, zzbedVar);
    }

    private zzbed() {
    }

    public static zzbec zza() {
        return (zzbec) zzb.zzaw();
    }

    public static zzbed zzd() {
        return zzb;
    }

    static /* synthetic */ void zze(zzbed zzbedVar, boolean z) {
        zzbedVar.zze |= 1;
        zzbedVar.zzf = z;
    }

    static /* synthetic */ void zzf(zzbed zzbedVar, int i) {
        zzbedVar.zze |= 2;
        zzbedVar.zzg = i;
    }

    @Override // com.google.android.gms.internal.ads.zzgko
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaM(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဋ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzbed();
        }
        zzbds zzbdsVar = null;
        if (i2 == 4) {
            return new zzbec(zzbdsVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
