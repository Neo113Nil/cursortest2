package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzalb extends zzgko implements zzglz {
    private static final zzalb zzb;
    private int zze;
    private zzald zzf;
    private zzalg zzg;

    static {
        zzalb zzalbVar = new zzalb();
        zzb = zzalbVar;
        zzgko.zzaN(zzalb.class, zzalbVar);
    }

    private zzalb() {
    }

    @Override // com.google.android.gms.internal.ads.zzgko
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaM(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzalb();
        }
        zzakz zzakzVar = null;
        if (i2 == 4) {
            return new zzala(zzakzVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
