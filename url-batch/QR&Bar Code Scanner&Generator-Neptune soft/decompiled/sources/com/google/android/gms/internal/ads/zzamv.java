package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzamv extends zzgre implements zzgsp {
    private static final zzamv zzb;
    private int zze;
    private long zzf = -1;
    private int zzg = 1000;

    static {
        zzamv zzamvVar = new zzamv();
        zzb = zzamvVar;
        zzgre.zzaQ(zzamv.class, zzamvVar);
    }

    private zzamv() {
    }

    @Override // com.google.android.gms.internal.ads.zzgre
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဌ\u0001", new Object[]{"zze", "zzf", "zzg", zzang.zza});
        }
        if (i2 == 3) {
            return new zzamv();
        }
        zzamj zzamjVar = null;
        if (i2 == 4) {
            return new zzamu(zzamjVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
