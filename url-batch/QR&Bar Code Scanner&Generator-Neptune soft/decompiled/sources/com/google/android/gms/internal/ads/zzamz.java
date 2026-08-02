package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzamz extends zzgre implements zzgsp {
    private static final zzamz zzb;
    private int zze;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;
    private long zzj = -1;
    private long zzk = -1;
    private long zzl = -1;
    private long zzm = -1;

    static {
        zzamz zzamzVar = new zzamz();
        zzb = zzamzVar;
        zzgre.zzaQ(zzamz.class, zzamzVar);
    }

    private zzamz() {
    }

    public static zzamy zza() {
        return (zzamy) zzb.zzaz();
    }

    static /* synthetic */ void zzd(zzamz zzamzVar, long j) {
        zzamzVar.zze |= 1;
        zzamzVar.zzf = j;
    }

    static /* synthetic */ void zze(zzamz zzamzVar, long j) {
        zzamzVar.zze |= 4;
        zzamzVar.zzh = j;
    }

    static /* synthetic */ void zzf(zzamz zzamzVar, long j) {
        zzamzVar.zze |= 8;
        zzamzVar.zzi = j;
    }

    static /* synthetic */ void zzg(zzamz zzamzVar, long j) {
        zzamzVar.zze |= 16;
        zzamzVar.zzj = j;
    }

    static /* synthetic */ void zzh(zzamz zzamzVar, long j) {
        zzamzVar.zze |= 32;
        zzamzVar.zzk = j;
    }

    @Override // com.google.android.gms.internal.ads.zzgre
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        if (i2 == 3) {
            return new zzamz();
        }
        zzamj zzamjVar = null;
        if (i2 == 4) {
            return new zzamy(zzamjVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
