package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzgip extends zzgre implements zzgsp {
    private static final zzgip zzb;
    private zzgis zze;
    private int zzf;

    static {
        zzgip zzgipVar = new zzgip();
        zzb = zzgipVar;
        zzgre.zzaQ(zzgip.class, zzgipVar);
    }

    private zzgip() {
    }

    public static zzgio zzc() {
        return (zzgio) zzb.zzaz();
    }

    public static zzgip zze() {
        return zzb;
    }

    public static zzgip zzf(zzgpw zzgpwVar, zzgqq zzgqqVar) throws zzgrq {
        return (zzgip) zzgre.zzaE(zzb, zzgpwVar, zzgqqVar);
    }

    static /* synthetic */ void zzh(zzgip zzgipVar, zzgis zzgisVar) {
        zzgisVar.getClass();
        zzgipVar.zze = zzgisVar;
    }

    public final int zza() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzgre
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzgip();
        }
        zzgin zzginVar = null;
        if (i2 == 4) {
            return new zzgio(zzginVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzgis zzg() {
        zzgis zzgisVar = this.zze;
        return zzgisVar == null ? zzgis.zze() : zzgisVar;
    }
}
