package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzgiy extends zzgre implements zzgsp {
    private static final zzgiy zzb;
    private zzgjb zze;
    private int zzf;

    static {
        zzgiy zzgiyVar = new zzgiy();
        zzb = zzgiyVar;
        zzgre.zzaQ(zzgiy.class, zzgiyVar);
    }

    private zzgiy() {
    }

    public static zzgix zzc() {
        return (zzgix) zzb.zzaz();
    }

    public static zzgiy zze(zzgpw zzgpwVar, zzgqq zzgqqVar) throws zzgrq {
        return (zzgiy) zzgre.zzaE(zzb, zzgpwVar, zzgqqVar);
    }

    static /* synthetic */ void zzg(zzgiy zzgiyVar, zzgjb zzgjbVar) {
        zzgjbVar.getClass();
        zzgiyVar.zze = zzgjbVar;
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
            return new zzgiy();
        }
        zzgiw zzgiwVar = null;
        if (i2 == 4) {
            return new zzgix(zzgiwVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzgjb zzf() {
        zzgjb zzgjbVar = this.zze;
        return zzgjbVar == null ? zzgjb.zze() : zzgjbVar;
    }
}
