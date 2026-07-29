package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzamj extends zzgko implements zzglz {
    private static final zzamj zzb;
    private int zze;
    private String zzf = "";

    static {
        zzamj zzamjVar = new zzamj();
        zzb = zzamjVar;
        zzgko.zzaN(zzamj.class, zzamjVar);
    }

    private zzamj() {
    }

    @Override // com.google.android.gms.internal.ads.zzgko
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaM(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzamj();
        }
        zzalh zzalhVar = null;
        if (i2 == 4) {
            return new zzami(zzalhVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
