package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzgis extends zzgre implements zzgsp {
    private static final zzgis zzb;
    private int zze;

    static {
        zzgis zzgisVar = new zzgis();
        zzb = zzgisVar;
        zzgre.zzaQ(zzgis.class, zzgisVar);
    }

    private zzgis() {
    }

    public static zzgir zzc() {
        return (zzgir) zzb.zzaz();
    }

    public static zzgis zze() {
        return zzb;
    }

    public final int zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzgre
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zze"});
        }
        if (i2 == 3) {
            return new zzgis();
        }
        zzgiq zzgiqVar = null;
        if (i2 == 4) {
            return new zzgir(zzgiqVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
