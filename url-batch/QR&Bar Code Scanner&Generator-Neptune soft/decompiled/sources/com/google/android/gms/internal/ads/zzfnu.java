package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzfnu extends zzgre implements zzgsp {
    private static final zzgrk zzb = new zzfnr();
    private static final zzfnu zze;
    private int zzf;
    private zzgrj zzg = zzaH();
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";

    static {
        zzfnu zzfnuVar = new zzfnu();
        zze = zzfnuVar;
        zzgre.zzaQ(zzfnu.class, zzfnuVar);
    }

    private zzfnu() {
    }

    public static zzfnt zza() {
        return (zzfnt) zze.zzaz();
    }

    static /* synthetic */ void zzd(zzfnu zzfnuVar, String str) {
        str.getClass();
        zzfnuVar.zzf |= 1;
        zzfnuVar.zzh = str;
    }

    static /* synthetic */ void zze(zzfnu zzfnuVar, int i) {
        zzgrj zzgrjVar = zzfnuVar.zzg;
        if (!zzgrjVar.zzc()) {
            zzfnuVar.zzg = zzgre.zzaI(zzgrjVar);
        }
        zzfnuVar.zzg.zzh(2);
    }

    @Override // com.google.android.gms.internal.ads.zzgre
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zze, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001e\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002", new Object[]{"zzf", "zzg", zzfns.zza, "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new zzfnu();
        }
        zzfnr zzfnrVar = null;
        if (i2 == 4) {
            return new zzfnt(zzfnrVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zze;
    }
}
