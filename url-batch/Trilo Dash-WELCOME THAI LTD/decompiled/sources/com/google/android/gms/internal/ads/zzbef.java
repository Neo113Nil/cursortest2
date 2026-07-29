package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzbef extends zzgko implements zzglz {
    private static final zzbef zzb;
    private int zze;
    private boolean zzf;
    private boolean zzg;
    private int zzh;

    static {
        zzbef zzbefVar = new zzbef();
        zzb = zzbefVar;
        zzgko.zzaN(zzbef.class, zzbefVar);
    }

    private zzbef() {
    }

    public static zzbee zza() {
        return (zzbee) zzb.zzaw();
    }

    static /* synthetic */ void zzd(zzbef zzbefVar, boolean z) {
        zzbefVar.zze |= 1;
        zzbefVar.zzf = z;
    }

    static /* synthetic */ void zze(zzbef zzbefVar, boolean z) {
        zzbefVar.zze |= 2;
        zzbefVar.zzg = z;
    }

    static /* synthetic */ void zzf(zzbef zzbefVar, int i) {
        zzbefVar.zze |= 4;
        zzbefVar.zzh = i;
    }

    @Override // com.google.android.gms.internal.ads.zzgko
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaM(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဋ\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzbef();
        }
        zzbds zzbdsVar = null;
        if (i2 == 4) {
            return new zzbee(zzbdsVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
