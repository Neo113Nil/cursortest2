package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzglg extends zzgre implements zzgsp {
    private static final zzglg zzb;
    private int zze;
    private int zzf;

    static {
        zzglg zzglgVar = new zzglg();
        zzb = zzglgVar;
        zzgre.zzaQ(zzglg.class, zzglgVar);
    }

    private zzglg() {
    }

    public static zzglf zzc() {
        return (zzglf) zzb.zzaz();
    }

    public static zzglg zze() {
        return zzb;
    }

    public final int zza() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzgre
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzglg();
        }
        zzgle zzgleVar = null;
        if (i2 == 4) {
            return new zzglf(zzgleVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final int zzg() {
        int zzb2 = zzgkx.zzb(this.zze);
        if (zzb2 == 0) {
            return 1;
        }
        return zzb2;
    }
}
