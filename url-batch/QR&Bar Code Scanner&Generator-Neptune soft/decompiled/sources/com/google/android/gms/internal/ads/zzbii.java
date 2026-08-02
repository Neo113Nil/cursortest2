package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzbii extends zzgre implements zzgsp {
    private static final zzbii zzb;
    private int zze;
    private int zzf = 1000;
    private zzbhw zzg;

    static {
        zzbii zzbiiVar = new zzbii();
        zzb = zzbiiVar;
        zzgre.zzaQ(zzbii.class, zzbiiVar);
    }

    private zzbii() {
    }

    @Override // com.google.android.gms.internal.ads.zzgre
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"zze", "zzf", zzbgc.zza, "zzg"});
        }
        if (i2 == 3) {
            return new zzbii();
        }
        zzbew zzbewVar = null;
        if (i2 == 4) {
            return new zzbih(zzbewVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
