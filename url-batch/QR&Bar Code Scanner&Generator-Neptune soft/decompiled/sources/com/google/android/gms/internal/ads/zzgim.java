package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzgim extends zzgre implements zzgsp {
    private static final zzgim zzb;
    private int zze;
    private zzgis zzf;
    private zzgpw zzg = zzgpw.zzb;

    static {
        zzgim zzgimVar = new zzgim();
        zzb = zzgimVar;
        zzgre.zzaQ(zzgim.class, zzgimVar);
    }

    private zzgim() {
    }

    public static zzgil zzc() {
        return (zzgil) zzb.zzaz();
    }

    public static zzgim zze() {
        return zzb;
    }

    public static zzgim zzf(zzgpw zzgpwVar, zzgqq zzgqqVar) throws zzgrq {
        return (zzgim) zzgre.zzaE(zzb, zzgpwVar, zzgqqVar);
    }

    static /* synthetic */ void zzj(zzgim zzgimVar, zzgis zzgisVar) {
        zzgisVar.getClass();
        zzgimVar.zzf = zzgisVar;
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
            return zzaP(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzgim();
        }
        zzgik zzgikVar = null;
        if (i2 == 4) {
            return new zzgil(zzgikVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzgis zzg() {
        zzgis zzgisVar = this.zzf;
        return zzgisVar == null ? zzgis.zze() : zzgisVar;
    }

    public final zzgpw zzh() {
        return this.zzg;
    }
}
