package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzbgh extends zzgre implements zzgsp {
    private static final zzbgh zzb;
    private int zze;
    private int zzg;
    private zzbhn zzi;
    private String zzf = "";
    private zzgrj zzh = zzaH();

    static {
        zzbgh zzbghVar = new zzbgh();
        zzb = zzbghVar;
        zzgre.zzaQ(zzbgh.class, zzbghVar);
    }

    private zzbgh() {
    }

    @Override // com.google.android.gms.internal.ads.zzgre
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003\u0016\u0004ဉ\u0002", new Object[]{"zze", "zzf", "zzg", zzbgc.zza, "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new zzbgh();
        }
        zzbew zzbewVar = null;
        if (i2 == 4) {
            return new zzbgg(zzbewVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
