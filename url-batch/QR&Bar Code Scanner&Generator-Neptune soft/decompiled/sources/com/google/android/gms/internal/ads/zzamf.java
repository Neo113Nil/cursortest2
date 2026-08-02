package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzamf extends zzgre implements zzgsp {
    private static final zzamf zzb;
    private int zze;
    private int zzf = 2;

    static {
        zzamf zzamfVar = new zzamf();
        zzb = zzamfVar;
        zzgre.zzaQ(zzamf.class, zzamfVar);
    }

    private zzamf() {
    }

    @Override // com.google.android.gms.internal.ads.zzgre
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0001\u0001\u0000\u0001\u001b\u001b\u0001\u0000\u0000\u0000\u001bဌ\u0000", new Object[]{"zze", "zzf", zzamg.zza});
        }
        if (i2 == 3) {
            return new zzamf();
        }
        zzamb zzambVar = null;
        if (i2 == 4) {
            return new zzame(zzambVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
