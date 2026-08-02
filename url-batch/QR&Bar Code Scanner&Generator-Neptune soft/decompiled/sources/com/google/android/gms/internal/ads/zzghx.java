package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzghx extends zzgre implements zzgsp {
    private static final zzghx zzb;
    private int zze;
    private zzgpw zzf = zzgpw.zzb;
    private zzgid zzg;

    static {
        zzghx zzghxVar = new zzghx();
        zzb = zzghxVar;
        zzgre.zzaQ(zzghx.class, zzghxVar);
    }

    private zzghx() {
    }

    public static zzghw zzc() {
        return (zzghw) zzb.zzaz();
    }

    public static zzghx zze(zzgpw zzgpwVar, zzgqq zzgqqVar) throws zzgrq {
        return (zzghx) zzgre.zzaE(zzb, zzgpwVar, zzgqqVar);
    }

    static /* synthetic */ void zzj(zzghx zzghxVar, zzgid zzgidVar) {
        zzgidVar.getClass();
        zzghxVar.zzg = zzgidVar;
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
            return zzaP(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzghx();
        }
        zzghv zzghvVar = null;
        if (i2 == 4) {
            return new zzghw(zzghvVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzgid zzf() {
        zzgid zzgidVar = this.zzg;
        return zzgidVar == null ? zzgid.zze() : zzgidVar;
    }

    public final zzgpw zzg() {
        return this.zzf;
    }
}
