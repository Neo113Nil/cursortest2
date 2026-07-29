package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzflt extends zzgko implements zzglz {
    private static final zzflt zzb;
    private int zze;
    private int zzf;
    private String zzg = "";
    private String zzh = "";
    private zzflp zzi;

    static {
        zzflt zzfltVar = new zzflt();
        zzb = zzfltVar;
        zzgko.zzaN(zzflt.class, zzfltVar);
    }

    private zzflt() {
    }

    public static zzflr zza() {
        return (zzflr) zzb.zzaw();
    }

    static /* synthetic */ void zzd(zzflt zzfltVar, String str) {
        str.getClass();
        zzfltVar.zze |= 2;
        zzfltVar.zzg = str;
    }

    static /* synthetic */ void zze(zzflt zzfltVar, zzflp zzflpVar) {
        zzflpVar.getClass();
        zzfltVar.zzi = zzflpVar;
        zzfltVar.zze |= 8;
    }

    static /* synthetic */ void zzf(zzflt zzfltVar, int i) {
        zzfltVar.zzf = 1;
        zzfltVar.zze = 1 | zzfltVar.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzgko
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaM(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003", new Object[]{"zze", "zzf", zzfls.zza, "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new zzflt();
        }
        zzflq zzflqVar = null;
        if (i2 == 4) {
            return new zzflr(zzflqVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
