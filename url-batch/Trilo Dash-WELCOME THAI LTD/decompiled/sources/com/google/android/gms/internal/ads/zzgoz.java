package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzgoz extends zzgko implements zzglz {
    private static final zzgoz zzb;
    private int zze;
    private String zzf = "";
    private long zzg;
    private boolean zzh;

    static {
        zzgoz zzgozVar = new zzgoz();
        zzb = zzgozVar;
        zzgko.zzaN(zzgoz.class, zzgozVar);
    }

    private zzgoz() {
    }

    public static zzgoy zza() {
        return (zzgoy) zzb.zzaw();
    }

    static /* synthetic */ void zzd(zzgoz zzgozVar, String str) {
        zzgozVar.zze |= 1;
        zzgozVar.zzf = str;
    }

    static /* synthetic */ void zze(zzgoz zzgozVar, long j) {
        zzgozVar.zze |= 2;
        zzgozVar.zzg = j;
    }

    static /* synthetic */ void zzf(zzgoz zzgozVar, boolean z) {
        zzgozVar.zze |= 4;
        zzgozVar.zzh = z;
    }

    @Override // com.google.android.gms.internal.ads.zzgko
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaM(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဇ\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzgoz();
        }
        zzgoa zzgoaVar = null;
        if (i2 == 4) {
            return new zzgoy(zzgoaVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
