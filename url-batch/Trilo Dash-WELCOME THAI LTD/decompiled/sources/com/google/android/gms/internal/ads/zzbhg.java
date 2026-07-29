package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzbhg extends zzgko implements zzglz {
    private static final zzbhg zzb;
    private int zze;
    private boolean zzf;
    private int zzg;

    static {
        zzbhg zzbhgVar = new zzbhg();
        zzb = zzbhgVar;
        zzgko.zzaN(zzbhg.class, zzbhgVar);
    }

    private zzbhg() {
    }

    public static zzbhf zza() {
        return (zzbhf) zzb.zzaw();
    }

    static /* synthetic */ void zzd(zzbhg zzbhgVar, boolean z) {
        zzbhgVar.zze |= 1;
        zzbhgVar.zzf = z;
    }

    static /* synthetic */ void zze(zzbhg zzbhgVar, int i) {
        zzbhgVar.zze |= 2;
        zzbhgVar.zzg = i;
    }

    @Override // com.google.android.gms.internal.ads.zzgko
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaM(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzbhg();
        }
        zzbds zzbdsVar = null;
        if (i2 == 4) {
            return new zzbhf(zzbdsVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final boolean zzf() {
        return this.zzf;
    }
}
