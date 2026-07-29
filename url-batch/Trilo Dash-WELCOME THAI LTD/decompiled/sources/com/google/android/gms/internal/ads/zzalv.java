package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzalv extends zzgko implements zzglz {
    private static final zzalv zzb;
    private int zze;
    private long zzu;
    private long zzv;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;
    private long zzj = -1;
    private long zzk = -1;
    private int zzl = 1000;
    private long zzm = -1;
    private long zzn = -1;
    private long zzo = -1;
    private int zzp = 1000;
    private long zzq = -1;
    private long zzr = -1;
    private long zzs = -1;
    private long zzt = -1;
    private long zzw = -1;
    private long zzx = -1;
    private long zzy = -1;
    private long zzz = -1;

    static {
        zzalv zzalvVar = new zzalv();
        zzb = zzalvVar;
        zzgko.zzaN(zzalv.class, zzalvVar);
    }

    private zzalv() {
    }

    public static zzalu zza() {
        return (zzalu) zzb.zzaw();
    }

    static /* synthetic */ void zzd(zzalv zzalvVar, long j) {
        zzalvVar.zze |= 1;
        zzalvVar.zzf = j;
    }

    static /* synthetic */ void zze(zzalv zzalvVar, long j) {
        zzalvVar.zze |= 2;
        zzalvVar.zzg = j;
    }

    static /* synthetic */ void zzf(zzalv zzalvVar, long j) {
        zzalvVar.zze |= 4;
        zzalvVar.zzh = j;
    }

    static /* synthetic */ void zzg(zzalv zzalvVar, long j) {
        zzalvVar.zze |= 8;
        zzalvVar.zzi = j;
    }

    static /* synthetic */ void zzh(zzalv zzalvVar) {
        zzalvVar.zze &= -9;
        zzalvVar.zzi = -1L;
    }

    static /* synthetic */ void zzi(zzalv zzalvVar, long j) {
        zzalvVar.zze |= 16;
        zzalvVar.zzj = j;
    }

    static /* synthetic */ void zzj(zzalv zzalvVar, long j) {
        zzalvVar.zze |= 32;
        zzalvVar.zzk = j;
    }

    static /* synthetic */ void zzk(zzalv zzalvVar, long j) {
        zzalvVar.zze |= 128;
        zzalvVar.zzm = j;
    }

    static /* synthetic */ void zzl(zzalv zzalvVar, long j) {
        zzalvVar.zze |= 256;
        zzalvVar.zzn = j;
    }

    static /* synthetic */ void zzm(zzalv zzalvVar, long j) {
        zzalvVar.zze |= 512;
        zzalvVar.zzo = j;
    }

    static /* synthetic */ void zzn(zzalv zzalvVar, long j) {
        zzalvVar.zze |= 2048;
        zzalvVar.zzq = j;
    }

    static /* synthetic */ void zzo(zzalv zzalvVar, long j) {
        zzalvVar.zze |= 4096;
        zzalvVar.zzr = j;
    }

    static /* synthetic */ void zzp(zzalv zzalvVar, long j) {
        zzalvVar.zze |= 8192;
        zzalvVar.zzs = j;
    }

    static /* synthetic */ void zzq(zzalv zzalvVar, long j) {
        zzalvVar.zze |= 16384;
        zzalvVar.zzt = j;
    }

    static /* synthetic */ void zzr(zzalv zzalvVar, long j) {
        zzalvVar.zze |= 32768;
        zzalvVar.zzu = j;
    }

    static /* synthetic */ void zzs(zzalv zzalvVar, long j) {
        zzalvVar.zze |= 65536;
        zzalvVar.zzv = j;
    }

    static /* synthetic */ void zzt(zzalv zzalvVar, long j) {
        zzalvVar.zze |= 131072;
        zzalvVar.zzw = j;
    }

    static /* synthetic */ void zzu(zzalv zzalvVar, long j) {
        zzalvVar.zze |= 262144;
        zzalvVar.zzx = j;
    }

    static /* synthetic */ void zzv(zzalv zzalvVar, int i) {
        zzalvVar.zzl = i - 1;
        zzalvVar.zze |= 64;
    }

    static /* synthetic */ void zzw(zzalv zzalvVar, int i) {
        zzalvVar.zzp = i - 1;
        zzalvVar.zze |= 1024;
    }

    @Override // com.google.android.gms.internal.ads.zzgko
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            zzgks zzgksVar = zzame.zza;
            return zzaM(zzb, "\u0001\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဌ\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000bဌ\n\fဂ\u000b\rဂ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂ\u0014", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", zzgksVar, "zzm", "zzn", "zzo", "zzp", zzgksVar, "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz"});
        }
        if (i2 == 3) {
            return new zzalv();
        }
        zzalh zzalhVar = null;
        if (i2 == 4) {
            return new zzalu(zzalhVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
