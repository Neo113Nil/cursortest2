package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzglu extends zzgre implements zzgsp {
    private static final zzglu zzb;
    private int zze;
    private zzglo zzf;
    private zzgpw zzg = zzgpw.zzb;

    static {
        zzglu zzgluVar = new zzglu();
        zzb = zzgluVar;
        zzgre.zzaQ(zzglu.class, zzgluVar);
    }

    private zzglu() {
    }

    public static zzglt zzd() {
        return (zzglt) zzb.zzaz();
    }

    public static zzglu zzf() {
        return zzb;
    }

    public static zzglu zzg(zzgpw zzgpwVar, zzgqq zzgqqVar) throws zzgrq {
        return (zzglu) zzgre.zzaE(zzb, zzgpwVar, zzgqqVar);
    }

    static /* synthetic */ void zzj(zzglu zzgluVar, zzglo zzgloVar) {
        zzgloVar.getClass();
        zzgluVar.zzf = zzgloVar;
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
            return new zzglu();
        }
        zzgls zzglsVar = null;
        if (i2 == 4) {
            return new zzglt(zzglsVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzglo zzc() {
        zzglo zzgloVar = this.zzf;
        return zzgloVar == null ? zzglo.zzd() : zzgloVar;
    }

    public final zzgpw zzh() {
        return this.zzg;
    }

    public final boolean zzl() {
        return this.zzf != null;
    }
}
