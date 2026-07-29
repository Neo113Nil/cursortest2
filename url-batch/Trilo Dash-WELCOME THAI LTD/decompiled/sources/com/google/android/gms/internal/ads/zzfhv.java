package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzfhv extends zzgko implements zzglz {
    private static final zzfhv zzb;
    private int zze;
    private boolean zzf;
    private long zzg;
    private int zzh;
    private int zzl;
    private int zzm;
    private int zzn;
    private long zzo;
    private int zzp;
    private String zzi = "";
    private String zzj = "";
    private String zzk = "";
    private String zzq = "";
    private String zzr = "";
    private String zzs = "";
    private String zzt = "";
    private String zzu = "";

    static {
        zzfhv zzfhvVar = new zzfhv();
        zzb = zzfhvVar;
        zzgko.zzaN(zzfhv.class, zzfhvVar);
    }

    private zzfhv() {
    }

    public static zzfhu zza() {
        return (zzfhu) zzb.zzaw();
    }

    static /* synthetic */ void zzd(zzfhv zzfhvVar, String str) {
        str.getClass();
        zzfhvVar.zzi = str;
    }

    static /* synthetic */ void zze(zzfhv zzfhvVar, String str) {
        str.getClass();
        zzfhvVar.zzj = str;
    }

    static /* synthetic */ void zzf(zzfhv zzfhvVar, String str) {
        str.getClass();
        zzfhvVar.zzk = str;
    }

    static /* synthetic */ void zzj(zzfhv zzfhvVar, String str) {
        str.getClass();
        zzfhvVar.zzq = str;
    }

    static /* synthetic */ void zzk(zzfhv zzfhvVar, String str) {
        str.getClass();
        zzfhvVar.zzr = str;
    }

    static /* synthetic */ void zzl(zzfhv zzfhvVar, String str) {
        str.getClass();
        zzfhvVar.zzs = str;
    }

    static /* synthetic */ void zzo(zzfhv zzfhvVar, String str) {
        str.getClass();
        zzfhvVar.zzu = str;
    }

    static /* synthetic */ void zzr(zzfhv zzfhvVar, int i) {
        if (i == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        zzfhvVar.zzm = i - 2;
    }

    static /* synthetic */ void zzs(zzfhv zzfhvVar, int i) {
        if (i == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        zzfhvVar.zzp = i - 2;
    }

    @Override // com.google.android.gms.internal.ads.zzgko
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaM(zzb, "\u0000\u0011\u0000\u0000\u0001\u0011\u0011\u0000\u0000\u0000\u0001\f\u0002\u0007\u0003\u0002\u0004\f\u0005Ȉ\u0006Ȉ\u0007Ȉ\b\u0004\t\f\n\u0004\u000b\u0002\f\f\rȈ\u000eȈ\u000fȈ\u0010Ȉ\u0011Ȉ", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu"});
        }
        if (i2 == 3) {
            return new zzfhv();
        }
        zzfht zzfhtVar = null;
        if (i2 == 4) {
            return new zzfhu(zzfhtVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
