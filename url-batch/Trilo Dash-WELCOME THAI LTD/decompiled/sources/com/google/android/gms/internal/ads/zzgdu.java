package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzgdu extends zzgko implements zzglz {
    private static final zzgdu zzb;
    private zzged zze;
    private zzgdo zzf;
    private int zzg;

    static {
        zzgdu zzgduVar = new zzgdu();
        zzb = zzgduVar;
        zzgko.zzaN(zzgdu.class, zzgduVar);
    }

    private zzgdu() {
    }

    public static zzgdt zzc() {
        return (zzgdt) zzb.zzaw();
    }

    public static zzgdu zze() {
        return zzb;
    }

    static /* synthetic */ void zzg(zzgdu zzgduVar, zzged zzgedVar) {
        zzgedVar.getClass();
        zzgduVar.zze = zzgedVar;
    }

    static /* synthetic */ void zzh(zzgdu zzgduVar, zzgdo zzgdoVar) {
        zzgdoVar.getClass();
        zzgduVar.zzf = zzgdoVar;
    }

    public final zzgdo zza() {
        zzgdo zzgdoVar = this.zzf;
        return zzgdoVar == null ? zzgdo.zzd() : zzgdoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgko
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaM(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\f", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzgdu();
        }
        zzgds zzgdsVar = null;
        if (i2 == 4) {
            return new zzgdt(zzgdsVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzged zzf() {
        zzged zzgedVar = this.zze;
        return zzgedVar == null ? zzged.zzd() : zzgedVar;
    }

    public final int zzi() {
        int i = this.zzg;
        int i2 = 3;
        if (i == 0) {
            i2 = 2;
        } else if (i != 1) {
            i2 = i != 2 ? i != 3 ? 0 : 5 : 4;
        }
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }
}
