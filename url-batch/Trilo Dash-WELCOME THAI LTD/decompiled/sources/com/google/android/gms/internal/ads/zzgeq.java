package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzgeq extends zzgko implements zzglz {
    private static final zzgeq zzb;
    private int zze;
    private int zzf;

    static {
        zzgeq zzgeqVar = new zzgeq();
        zzb = zzgeqVar;
        zzgko.zzaN(zzgeq.class, zzgeqVar);
    }

    private zzgeq() {
    }

    public static zzgep zzc() {
        return (zzgep) zzb.zzaw();
    }

    public static zzgeq zze() {
        return zzb;
    }

    public final int zza() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzgko
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaM(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzgeq();
        }
        zzgeo zzgeoVar = null;
        if (i2 == 4) {
            return new zzgep(zzgeoVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final int zzg() {
        int zzb2 = zzgeh.zzb(this.zze);
        if (zzb2 == 0) {
            return 1;
        }
        return zzb2;
    }
}
