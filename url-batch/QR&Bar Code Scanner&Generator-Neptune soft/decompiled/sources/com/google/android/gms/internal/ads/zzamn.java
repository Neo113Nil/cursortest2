package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzamn extends zzgre implements zzgsp {
    private static final zzamn zzb;
    private int zze;
    private int zzf;

    static {
        zzamn zzamnVar = new zzamn();
        zzb = zzamnVar;
        zzgre.zzaQ(zzamn.class, zzamnVar);
    }

    private zzamn() {
    }

    @Override // com.google.android.gms.internal.ads.zzgre
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"zze", "zzf", zzamr.zza});
        }
        if (i2 == 3) {
            return new zzamn();
        }
        zzamj zzamjVar = null;
        if (i2 == 4) {
            return new zzamm(zzamjVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
