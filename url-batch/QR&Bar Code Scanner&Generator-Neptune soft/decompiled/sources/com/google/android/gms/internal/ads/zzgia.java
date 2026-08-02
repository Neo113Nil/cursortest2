package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzgia extends zzgre implements zzgsp {
    private static final zzgia zzb;
    private int zze;
    private zzgid zzf;

    static {
        zzgia zzgiaVar = new zzgia();
        zzb = zzgiaVar;
        zzgre.zzaQ(zzgia.class, zzgiaVar);
    }

    private zzgia() {
    }

    public static zzghz zzc() {
        return (zzghz) zzb.zzaz();
    }

    public static zzgia zze(zzgpw zzgpwVar, zzgqq zzgqqVar) throws zzgrq {
        return (zzgia) zzgre.zzaE(zzb, zzgpwVar, zzgqqVar);
    }

    static /* synthetic */ void zzh(zzgia zzgiaVar, zzgid zzgidVar) {
        zzgidVar.getClass();
        zzgiaVar.zzf = zzgidVar;
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
            return new zzgia();
        }
        zzghy zzghyVar = null;
        if (i2 == 4) {
            return new zzghz(zzghyVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzgid zzf() {
        zzgid zzgidVar = this.zzf;
        return zzgidVar == null ? zzgid.zze() : zzgidVar;
    }
}
