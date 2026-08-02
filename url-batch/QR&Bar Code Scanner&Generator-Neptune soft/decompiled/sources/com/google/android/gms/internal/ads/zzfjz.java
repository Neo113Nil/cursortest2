package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzfjz extends zzgre implements zzgsp {
    private static final zzfjz zzb;
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
        zzfjz zzfjzVar = new zzfjz();
        zzb = zzfjzVar;
        zzgre.zzaQ(zzfjz.class, zzfjzVar);
    }

    private zzfjz() {
    }

    public static zzfjy zza() {
        return (zzfjy) zzb.zzaz();
    }

    static /* synthetic */ void zzd(zzfjz zzfjzVar, String str) {
        str.getClass();
        zzfjzVar.zzi = str;
    }

    static /* synthetic */ void zze(zzfjz zzfjzVar, String str) {
        str.getClass();
        zzfjzVar.zzj = str;
    }

    static /* synthetic */ void zzf(zzfjz zzfjzVar, String str) {
        str.getClass();
        zzfjzVar.zzk = str;
    }

    static /* synthetic */ void zzj(zzfjz zzfjzVar, String str) {
        str.getClass();
        zzfjzVar.zzq = str;
    }

    static /* synthetic */ void zzk(zzfjz zzfjzVar, String str) {
        str.getClass();
        zzfjzVar.zzr = str;
    }

    static /* synthetic */ void zzl(zzfjz zzfjzVar, String str) {
        str.getClass();
        zzfjzVar.zzs = str;
    }

    static /* synthetic */ void zzo(zzfjz zzfjzVar, String str) {
        str.getClass();
        zzfjzVar.zzu = str;
    }

    static /* synthetic */ void zzr(zzfjz zzfjzVar, int i) {
        if (i == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        zzfjzVar.zzm = i - 2;
    }

    static /* synthetic */ void zzs(zzfjz zzfjzVar, int i) {
        if (i == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        zzfjzVar.zzp = i - 2;
    }

    @Override // com.google.android.gms.internal.ads.zzgre
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0000\u0011\u0000\u0000\u0001\u0011\u0011\u0000\u0000\u0000\u0001\f\u0002\u0007\u0003\u0002\u0004\f\u0005Ȉ\u0006Ȉ\u0007Ȉ\b\u0004\t\f\n\u0004\u000b\u0002\f\f\rȈ\u000eȈ\u000fȈ\u0010Ȉ\u0011Ȉ", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu"});
        }
        if (i2 == 3) {
            return new zzfjz();
        }
        zzfjx zzfjxVar = null;
        if (i2 == 4) {
            return new zzfjy(zzfjxVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
