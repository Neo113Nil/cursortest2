package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzgms extends zzgre implements zzgsp {
    private static final zzgms zzb;
    private int zze;
    private zzgmv zzf;

    static {
        zzgms zzgmsVar = new zzgms();
        zzb = zzgmsVar;
        zzgre.zzaQ(zzgms.class, zzgmsVar);
    }

    private zzgms() {
    }

    public static zzgmr zzc() {
        return (zzgmr) zzb.zzaz();
    }

    public static zzgms zze(zzgpw zzgpwVar, zzgqq zzgqqVar) throws zzgrq {
        return (zzgms) zzgre.zzaE(zzb, zzgpwVar, zzgqqVar);
    }

    static /* synthetic */ void zzh(zzgms zzgmsVar, zzgmv zzgmvVar) {
        zzgmvVar.getClass();
        zzgmsVar.zzf = zzgmvVar;
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
            return zzaP(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzgms();
        }
        zzgmq zzgmqVar = null;
        if (i2 == 4) {
            return new zzgmr(zzgmqVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzgmv zzf() {
        zzgmv zzgmvVar = this.zzf;
        return zzgmvVar == null ? zzgmv.zzc() : zzgmvVar;
    }
}
