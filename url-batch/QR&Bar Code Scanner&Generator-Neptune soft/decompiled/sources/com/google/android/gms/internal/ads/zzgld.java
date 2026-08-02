package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzgld extends zzgre implements zzgsp {
    private static final zzgld zzb;
    private zzglg zze;
    private int zzf;
    private int zzg;

    static {
        zzgld zzgldVar = new zzgld();
        zzb = zzgldVar;
        zzgre.zzaQ(zzgld.class, zzgldVar);
    }

    private zzgld() {
    }

    public static zzglc zzc() {
        return (zzglc) zzb.zzaz();
    }

    public static zzgld zze() {
        return zzb;
    }

    public static zzgld zzf(zzgpw zzgpwVar, zzgqq zzgqqVar) throws zzgrq {
        return (zzgld) zzgre.zzaE(zzb, zzgpwVar, zzgqqVar);
    }

    static /* synthetic */ void zzh(zzgld zzgldVar, zzglg zzglgVar) {
        zzglgVar.getClass();
        zzgldVar.zze = zzglgVar;
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
            return zzaP(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b\u0003\u000b", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzgld();
        }
        zzglb zzglbVar = null;
        if (i2 == 4) {
            return new zzglc(zzglbVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzglg zzg() {
        zzglg zzglgVar = this.zze;
        return zzglgVar == null ? zzglg.zze() : zzglgVar;
    }
}
