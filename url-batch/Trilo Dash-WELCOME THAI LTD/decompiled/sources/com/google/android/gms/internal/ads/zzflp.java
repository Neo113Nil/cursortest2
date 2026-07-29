package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzflp extends zzgko implements zzglz {
    private static final zzgku zzb = new zzflm();
    private static final zzflp zze;
    private int zzf;
    private zzgkt zzg = zzaE();
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";

    static {
        zzflp zzflpVar = new zzflp();
        zze = zzflpVar;
        zzgko.zzaN(zzflp.class, zzflpVar);
    }

    private zzflp() {
    }

    public static zzflo zza() {
        return (zzflo) zze.zzaw();
    }

    static /* synthetic */ void zzd(zzflp zzflpVar, String str) {
        str.getClass();
        zzflpVar.zzf |= 1;
        zzflpVar.zzh = str;
    }

    static /* synthetic */ void zze(zzflp zzflpVar, int i) {
        zzgkt zzgktVar = zzflpVar.zzg;
        if (!zzgktVar.zzc()) {
            zzflpVar.zzg = zzgko.zzaF(zzgktVar);
        }
        zzflpVar.zzg.zzh(2);
    }

    @Override // com.google.android.gms.internal.ads.zzgko
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaM(zze, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001e\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002", new Object[]{"zzf", "zzg", zzfln.zza, "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new zzflp();
        }
        zzflm zzflmVar = null;
        if (i2 == 4) {
            return new zzflo(zzflmVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zze;
    }
}
