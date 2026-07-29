package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzgor extends zzgko implements zzglz {
    private static final zzgor zzb;
    private int zze;
    private int zzf;
    private String zzg = "";
    private zzgjg zzh = zzgjg.zzb;

    static {
        zzgor zzgorVar = new zzgor();
        zzb = zzgorVar;
        zzgko.zzaN(zzgor.class, zzgorVar);
    }

    private zzgor() {
    }

    public static zzgop zza() {
        return (zzgop) zzb.zzaw();
    }

    static /* synthetic */ void zzd(zzgor zzgorVar, String str) {
        zzgorVar.zze |= 2;
        zzgorVar.zzg = "image/png";
    }

    static /* synthetic */ void zze(zzgor zzgorVar, zzgjg zzgjgVar) {
        zzgjgVar.getClass();
        zzgorVar.zze |= 4;
        zzgorVar.zzh = zzgjgVar;
    }

    static /* synthetic */ void zzf(zzgor zzgorVar, int i) {
        zzgorVar.zzf = 1;
        zzgorVar.zze = 1 | zzgorVar.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzgko
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaM(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ည\u0002", new Object[]{"zze", "zzf", zzgoq.zza, "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzgor();
        }
        zzgoa zzgoaVar = null;
        if (i2 == 4) {
            return new zzgop(zzgoaVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
