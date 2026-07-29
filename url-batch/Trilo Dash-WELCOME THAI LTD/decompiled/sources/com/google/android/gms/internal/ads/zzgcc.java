package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzgcc extends zzgko implements zzglz {
    private static final zzgcc zzb;
    private int zze;

    static {
        zzgcc zzgccVar = new zzgcc();
        zzb = zzgccVar;
        zzgko.zzaN(zzgcc.class, zzgccVar);
    }

    private zzgcc() {
    }

    public static zzgcb zzc() {
        return (zzgcb) zzb.zzaw();
    }

    public static zzgcc zze() {
        return zzb;
    }

    public final int zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzgko
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaM(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zze"});
        }
        if (i2 == 3) {
            return new zzgcc();
        }
        zzgca zzgcaVar = null;
        if (i2 == 4) {
            return new zzgcb(zzgcaVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
