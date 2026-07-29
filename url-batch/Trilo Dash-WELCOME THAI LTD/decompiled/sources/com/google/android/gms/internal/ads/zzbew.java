package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzbew extends zzgko implements zzglz {
    private static final zzbew zzb;
    private int zze;
    private int zzf;
    private zzbgl zzg;
    private String zzh = "";
    private String zzi = "";

    static {
        zzbew zzbewVar = new zzbew();
        zzb = zzbewVar;
        zzgko.zzaN(zzbew.class, zzbewVar);
    }

    private zzbew() {
    }

    @Override // com.google.android.gms.internal.ads.zzgko
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaM(zzb, "\u0001\u0004\u0000\u0001\u0005\b\u0004\u0000\u0000\u0000\u0005ဌ\u0000\u0006ဉ\u0001\u0007ဈ\u0002\bဈ\u0003", new Object[]{"zze", "zzf", zzbev.zza, "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new zzbew();
        }
        zzbds zzbdsVar = null;
        if (i2 == 4) {
            return new zzbeu(zzbdsVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
