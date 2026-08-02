package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzamx extends zzgre implements zzgsp {
    private static final zzamx zzb;
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
        zzamx zzamxVar = new zzamx();
        zzb = zzamxVar;
        zzgre.zzaQ(zzamx.class, zzamxVar);
    }

    private zzamx() {
    }

    public static zzamw zza() {
        return (zzamw) zzb.zzaz();
    }

    static /* synthetic */ void zzd(zzamx zzamxVar, long j) {
        zzamxVar.zze |= 1;
        zzamxVar.zzf = j;
    }

    static /* synthetic */ void zze(zzamx zzamxVar, long j) {
        zzamxVar.zze |= 2;
        zzamxVar.zzg = j;
    }

    static /* synthetic */ void zzf(zzamx zzamxVar, long j) {
        zzamxVar.zze |= 4;
        zzamxVar.zzh = j;
    }

    static /* synthetic */ void zzg(zzamx zzamxVar, long j) {
        zzamxVar.zze |= 8;
        zzamxVar.zzi = j;
    }

    static /* synthetic */ void zzh(zzamx zzamxVar) {
        zzamxVar.zze &= -9;
        zzamxVar.zzi = -1L;
    }

    static /* synthetic */ void zzi(zzamx zzamxVar, long j) {
        zzamxVar.zze |= 16;
        zzamxVar.zzj = j;
    }

    static /* synthetic */ void zzj(zzamx zzamxVar, long j) {
        zzamxVar.zze |= 32;
        zzamxVar.zzk = j;
    }

    static /* synthetic */ void zzk(zzamx zzamxVar, long j) {
        zzamxVar.zze |= 128;
        zzamxVar.zzm = j;
    }

    static /* synthetic */ void zzl(zzamx zzamxVar, long j) {
        zzamxVar.zze |= 256;
        zzamxVar.zzn = j;
    }

    static /* synthetic */ void zzm(zzamx zzamxVar, long j) {
        zzamxVar.zze |= 512;
        zzamxVar.zzo = j;
    }

    static /* synthetic */ void zzn(zzamx zzamxVar, long j) {
        zzamxVar.zze |= 2048;
        zzamxVar.zzq = j;
    }

    static /* synthetic */ void zzo(zzamx zzamxVar, long j) {
        zzamxVar.zze |= 4096;
        zzamxVar.zzr = j;
    }

    static /* synthetic */ void zzp(zzamx zzamxVar, long j) {
        zzamxVar.zze |= 8192;
        zzamxVar.zzs = j;
    }

    static /* synthetic */ void zzq(zzamx zzamxVar, long j) {
        zzamxVar.zze |= 16384;
        zzamxVar.zzt = j;
    }

    static /* synthetic */ void zzr(zzamx zzamxVar, long j) {
        zzamxVar.zze |= 32768;
        zzamxVar.zzu = j;
    }

    static /* synthetic */ void zzs(zzamx zzamxVar, long j) {
        zzamxVar.zze |= 65536;
        zzamxVar.zzv = j;
    }

    static /* synthetic */ void zzt(zzamx zzamxVar, long j) {
        zzamxVar.zze |= 131072;
        zzamxVar.zzw = j;
    }

    static /* synthetic */ void zzu(zzamx zzamxVar, long j) {
        zzamxVar.zze |= 262144;
        zzamxVar.zzx = j;
    }

    static /* synthetic */ void zzv(zzamx zzamxVar, int i) {
        zzamxVar.zzl = i - 1;
        zzamxVar.zze |= 64;
    }

    static /* synthetic */ void zzw(zzamx zzamxVar, int i) {
        zzamxVar.zzp = i - 1;
        zzamxVar.zze |= 1024;
    }

    @Override // com.google.android.gms.internal.ads.zzgre
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            zzgri zzgriVar = zzang.zza;
            return zzaP(zzb, "\u0001\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဌ\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000bဌ\n\fဂ\u000b\rဂ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂ\u0014", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", zzgriVar, "zzm", "zzn", "zzo", "zzp", zzgriVar, "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz"});
        }
        if (i2 == 3) {
            return new zzamx();
        }
        zzamj zzamjVar = null;
        if (i2 == 4) {
            return new zzamw(zzamjVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
