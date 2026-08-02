package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzglr extends zzgre implements zzgsp {
    private static final zzglr zzb;
    private int zze;
    private zzglu zzf;
    private zzgpw zzg = zzgpw.zzb;

    static {
        zzglr zzglrVar = new zzglr();
        zzb = zzglrVar;
        zzgre.zzaQ(zzglr.class, zzglrVar);
    }

    private zzglr() {
    }

    public static zzglq zzc() {
        return (zzglq) zzb.zzaz();
    }

    public static zzglr zze(zzgpw zzgpwVar, zzgqq zzgqqVar) throws zzgrq {
        return (zzglr) zzgre.zzaE(zzb, zzgpwVar, zzgqqVar);
    }

    static /* synthetic */ void zzi(zzglr zzglrVar, zzglu zzgluVar) {
        zzgluVar.getClass();
        zzglrVar.zzf = zzgluVar;
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
            return new zzglr();
        }
        zzglp zzglpVar = null;
        if (i2 == 4) {
            return new zzglq(zzglpVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzglu zzf() {
        zzglu zzgluVar = this.zzf;
        return zzgluVar == null ? zzglu.zzf() : zzgluVar;
    }

    public final zzgpw zzg() {
        return this.zzg;
    }

    public final boolean zzk() {
        return this.zzf != null;
    }
}
