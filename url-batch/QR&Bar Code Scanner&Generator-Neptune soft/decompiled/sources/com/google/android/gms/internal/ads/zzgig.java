package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzgig extends zzgre implements zzgsp {
    private static final zzgig zzb;
    private int zze;
    private zzgim zzf;
    private zzgla zzg;

    static {
        zzgig zzgigVar = new zzgig();
        zzb = zzgigVar;
        zzgre.zzaQ(zzgig.class, zzgigVar);
    }

    private zzgig() {
    }

    public static zzgif zzc() {
        return (zzgif) zzb.zzaz();
    }

    public static zzgig zze(zzgpw zzgpwVar, zzgqq zzgqqVar) throws zzgrq {
        return (zzgig) zzgre.zzaE(zzb, zzgpwVar, zzgqqVar);
    }

    static /* synthetic */ void zzi(zzgig zzgigVar, zzgim zzgimVar) {
        zzgimVar.getClass();
        zzgigVar.zzf = zzgimVar;
    }

    static /* synthetic */ void zzj(zzgig zzgigVar, zzgla zzglaVar) {
        zzglaVar.getClass();
        zzgigVar.zzg = zzglaVar;
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
            return zzaP(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzgig();
        }
        zzgie zzgieVar = null;
        if (i2 == 4) {
            return new zzgif(zzgieVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzgim zzf() {
        zzgim zzgimVar = this.zzf;
        return zzgimVar == null ? zzgim.zze() : zzgimVar;
    }

    public final zzgla zzg() {
        zzgla zzglaVar = this.zzg;
        return zzglaVar == null ? zzgla.zze() : zzglaVar;
    }
}
