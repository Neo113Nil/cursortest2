package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzald extends zzgko implements zzglz {
    private static final zzald zzb;
    private int zze;
    private int zzf = 2;

    static {
        zzald zzaldVar = new zzald();
        zzb = zzaldVar;
        zzgko.zzaN(zzald.class, zzaldVar);
    }

    private zzald() {
    }

    @Override // com.google.android.gms.internal.ads.zzgko
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaM(zzb, "\u0001\u0001\u0000\u0001\u001b\u001b\u0001\u0000\u0000\u0000\u001bဌ\u0000", new Object[]{"zze", "zzf", zzale.zza});
        }
        if (i2 == 3) {
            return new zzald();
        }
        zzakz zzakzVar = null;
        if (i2 == 4) {
            return new zzalc(zzakzVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
