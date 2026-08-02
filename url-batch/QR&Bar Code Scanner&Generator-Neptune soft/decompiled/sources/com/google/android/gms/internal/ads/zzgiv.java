package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzgiv extends zzgre implements zzgsp {
    private static final zzgiv zzb;
    private int zze;
    private zzgjb zzf;
    private zzgpw zzg = zzgpw.zzb;

    static {
        zzgiv zzgivVar = new zzgiv();
        zzb = zzgivVar;
        zzgre.zzaQ(zzgiv.class, zzgivVar);
    }

    private zzgiv() {
    }

    public static zzgiu zzc() {
        return (zzgiu) zzb.zzaz();
    }

    public static zzgiv zze(zzgpw zzgpwVar, zzgqq zzgqqVar) throws zzgrq {
        return (zzgiv) zzgre.zzaE(zzb, zzgpwVar, zzgqqVar);
    }

    static /* synthetic */ void zzi(zzgiv zzgivVar, zzgjb zzgjbVar) {
        zzgjbVar.getClass();
        zzgivVar.zzf = zzgjbVar;
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
            return new zzgiv();
        }
        zzgit zzgitVar = null;
        if (i2 == 4) {
            return new zzgiu(zzgitVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzgjb zzf() {
        zzgjb zzgjbVar = this.zzf;
        return zzgjbVar == null ? zzgjb.zze() : zzgjbVar;
    }

    public final zzgpw zzg() {
        return this.zzg;
    }
}
