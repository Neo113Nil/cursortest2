package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzgvs extends zzgre implements zzgsp {
    private static final zzgvs zzb;
    private int zze;
    private int zzf;
    private String zzg = "";
    private zzgpw zzh = zzgpw.zzb;
    private zzgpw zzi = zzgpw.zzb;

    static {
        zzgvs zzgvsVar = new zzgvs();
        zzb = zzgvsVar;
        zzgre.zzaQ(zzgvs.class, zzgvsVar);
    }

    private zzgvs() {
    }

    public static zzgvq zza() {
        return (zzgvq) zzb.zzaz();
    }

    static /* synthetic */ void zzd(zzgvs zzgvsVar, String str) {
        zzgvsVar.zze |= 2;
        zzgvsVar.zzg = "image/png";
    }

    static /* synthetic */ void zze(zzgvs zzgvsVar, zzgpw zzgpwVar) {
        zzgpwVar.getClass();
        zzgvsVar.zze |= 4;
        zzgvsVar.zzh = zzgpwVar;
    }

    static /* synthetic */ void zzf(zzgvs zzgvsVar, int i) {
        zzgvsVar.zzf = 1;
        zzgvsVar.zze = 1 | zzgvsVar.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzgre
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zze", "zzf", zzgvr.zza, "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new zzgvs();
        }
        zzguq zzguqVar = null;
        if (i2 == 4) {
            return new zzgvq(zzguqVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
