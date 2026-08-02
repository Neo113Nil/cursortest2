package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzgmc extends zzgre implements zzgsp {
    private static final zzgmc zzb;
    private String zze = "";
    private zzgpw zzf = zzgpw.zzb;
    private int zzg;

    static {
        zzgmc zzgmcVar = new zzgmc();
        zzb = zzgmcVar;
        zzgre.zzaQ(zzgmc.class, zzgmcVar);
    }

    private zzgmc() {
    }

    public static zzgmb zza() {
        return (zzgmb) zzb.zzaz();
    }

    public static zzgmc zzd() {
        return zzb;
    }

    static /* synthetic */ void zzg(zzgmc zzgmcVar, String str) {
        str.getClass();
        zzgmcVar.zze = str;
    }

    @Override // com.google.android.gms.internal.ads.zzgre
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzgmc();
        }
        zzgma zzgmaVar = null;
        if (i2 == 4) {
            return new zzgmb(zzgmaVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzgpw zze() {
        return this.zzf;
    }

    public final String zzf() {
        return this.zze;
    }

    public final int zzi() {
        int zzb2 = zzgnd.zzb(this.zzg);
        if (zzb2 == 0) {
            return 1;
        }
        return zzb2;
    }
}
