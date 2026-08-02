package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzgvl extends zzgre implements zzgsp {
    private static final zzgvl zzb;
    private int zze;
    private zzgvk zzf;
    private int zzj;
    private byte zzk = 2;
    private zzgrn zzg = zzaK();
    private zzgpw zzh = zzgpw.zzb;
    private zzgpw zzi = zzgpw.zzb;

    static {
        zzgvl zzgvlVar = new zzgvl();
        zzb = zzgvlVar;
        zzgre.zzaQ(zzgvl.class, zzgvlVar);
    }

    private zzgvl() {
    }

    public static zzgvi zza() {
        return (zzgvi) zzb.zzaz();
    }

    static /* synthetic */ void zzd(zzgvl zzgvlVar, zzgvh zzgvhVar) {
        zzgvhVar.getClass();
        zzgrn zzgrnVar = zzgvlVar.zzg;
        if (!zzgrnVar.zzc()) {
            zzgvlVar.zzg = zzgre.zzaL(zzgrnVar);
        }
        zzgvlVar.zzg.add(zzgvhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgre
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzk);
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003", new Object[]{"zze", "zzf", "zzg", zzgvh.class, "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new zzgvl();
        }
        zzguq zzguqVar = null;
        if (i2 == 4) {
            return new zzgvi(zzguqVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        this.zzk = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
