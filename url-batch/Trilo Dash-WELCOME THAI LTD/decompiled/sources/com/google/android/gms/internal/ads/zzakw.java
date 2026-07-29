package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzakw extends zzgko implements zzglz {
    private static final zzakw zzb;
    private int zze;
    private String zzf = "";
    private String zzg = "";

    static {
        zzakw zzakwVar = new zzakw();
        zzb = zzakwVar;
        zzgko.zzaN(zzakw.class, zzakwVar);
    }

    private zzakw() {
    }

    @Override // com.google.android.gms.internal.ads.zzgko
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaM(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzakw();
        }
        zzakt zzaktVar = null;
        if (i2 == 4) {
            return new zzakv(zzaktVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
