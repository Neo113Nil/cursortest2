package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzbet extends zzgko implements zzglz {
    private static final zzbet zzb;
    private int zze;
    private zzbgj zzg;
    private int zzh;
    private zzbgl zzi;
    private int zzj;
    private String zzf = "";
    private int zzk = 1000;
    private int zzl = 1000;
    private int zzm = 1000;

    static {
        zzbet zzbetVar = new zzbet();
        zzb = zzbetVar;
        zzgko.zzaN(zzbet.class, zzbetVar);
    }

    private zzbet() {
    }

    public static zzbet zzc() {
        return zzb;
    }

    static /* synthetic */ void zzd(zzbet zzbetVar, String str) {
        zzbetVar.zze |= 1;
        zzbetVar.zzf = str;
    }

    static /* synthetic */ void zze(zzbet zzbetVar, zzbgl zzbglVar) {
        zzbglVar.getClass();
        zzbetVar.zzi = zzbglVar;
        zzbetVar.zze |= 8;
    }

    @Override // com.google.android.gms.internal.ads.zzgko
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            zzgks zzgksVar = zzbey.zza;
            return zzaM(zzb, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004ဉ\u0003\u0005င\u0004\u0006ဌ\u0005\u0007ဌ\u0006\bဌ\u0007", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", zzgksVar, "zzl", zzgksVar, "zzm", zzgksVar});
        }
        if (i2 == 3) {
            return new zzbet();
        }
        zzbds zzbdsVar = null;
        if (i2 == 4) {
            return new zzbes(zzbdsVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
