package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzgnb extends zzgre implements zzgsp {
    private static final zzgnb zzb;
    private String zze = "";
    private zzgmc zzf;

    static {
        zzgnb zzgnbVar = new zzgnb();
        zzb = zzgnbVar;
        zzgre.zzaQ(zzgnb.class, zzgnbVar);
    }

    private zzgnb() {
    }

    public static zzgnb zzd() {
        return zzb;
    }

    public static zzgnb zze(zzgpw zzgpwVar, zzgqq zzgqqVar) throws zzgrq {
        return (zzgnb) zzgre.zzaE(zzb, zzgpwVar, zzgqqVar);
    }

    public final zzgmc zza() {
        zzgmc zzgmcVar = this.zzf;
        return zzgmcVar == null ? zzgmc.zzd() : zzgmcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgre
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzgnb();
        }
        zzgmz zzgmzVar = null;
        if (i2 == 4) {
            return new zzgna(zzgmzVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final String zzf() {
        return this.zze;
    }

    public final boolean zzg() {
        return this.zzf != null;
    }
}
