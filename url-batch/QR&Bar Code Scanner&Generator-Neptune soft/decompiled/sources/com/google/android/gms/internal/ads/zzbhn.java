package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzbhn extends zzgre implements zzgsp {
    private static final zzbhn zzb;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        zzbhn zzbhnVar = new zzbhn();
        zzb = zzbhnVar;
        zzgre.zzaQ(zzbhn.class, zzbhnVar);
    }

    private zzbhn() {
    }

    @Override // com.google.android.gms.internal.ads.zzgre
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzbhn();
        }
        zzbew zzbewVar = null;
        if (i2 == 4) {
            return new zzbhm(zzbewVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
