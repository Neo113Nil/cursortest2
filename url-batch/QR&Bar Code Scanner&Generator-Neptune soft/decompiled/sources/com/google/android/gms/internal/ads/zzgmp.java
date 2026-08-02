package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzgmp extends zzgre implements zzgsp {
    private static final zzgmp zzb;
    private int zze;
    private zzgrn zzf = zzaK();

    static {
        zzgmp zzgmpVar = new zzgmp();
        zzb = zzgmpVar;
        zzgre.zzaQ(zzgmp.class, zzgmpVar);
    }

    private zzgmp() {
    }

    public static zzgmm zza() {
        return (zzgmm) zzb.zzaz();
    }

    static /* synthetic */ void zze(zzgmp zzgmpVar, zzgmo zzgmoVar) {
        zzgmoVar.getClass();
        zzgrn zzgrnVar = zzgmpVar.zzf;
        if (!zzgrnVar.zzc()) {
            zzgmpVar.zzf = zzgre.zzaL(zzgrnVar);
        }
        zzgmpVar.zzf.add(zzgmoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgre
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zze", "zzf", zzgmo.class});
        }
        if (i2 == 3) {
            return new zzgmp();
        }
        zzgml zzgmlVar = null;
        if (i2 == 4) {
            return new zzgmm(zzgmlVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
