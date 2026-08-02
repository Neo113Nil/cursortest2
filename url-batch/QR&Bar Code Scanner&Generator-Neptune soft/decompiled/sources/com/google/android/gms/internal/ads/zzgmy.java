package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzgmy extends zzgre implements zzgsp {
    private static final zzgmy zzb;
    private int zze;
    private zzgnb zzf;

    static {
        zzgmy zzgmyVar = new zzgmy();
        zzb = zzgmyVar;
        zzgre.zzaQ(zzgmy.class, zzgmyVar);
    }

    private zzgmy() {
    }

    public static zzgmx zzc() {
        return (zzgmx) zzb.zzaz();
    }

    public static zzgmy zze(zzgpw zzgpwVar, zzgqq zzgqqVar) throws zzgrq {
        return (zzgmy) zzgre.zzaE(zzb, zzgpwVar, zzgqqVar);
    }

    static /* synthetic */ void zzh(zzgmy zzgmyVar, zzgnb zzgnbVar) {
        zzgnbVar.getClass();
        zzgmyVar.zzf = zzgnbVar;
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
            return new zzgmy();
        }
        zzgmw zzgmwVar = null;
        if (i2 == 4) {
            return new zzgmx(zzgmwVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzgnb zzf() {
        zzgnb zzgnbVar = this.zzf;
        return zzgnbVar == null ? zzgnb.zzd() : zzgnbVar;
    }
}
