package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzama extends zzgre implements zzgsp {
    private static final zzama zzb;
    private int zze;
    private long zzg;
    private long zzk;
    private long zzl;
    private long zzn;
    private int zzr;
    private String zzf = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private String zzm = "";
    private String zzo = "";
    private String zzp = "";
    private zzgrn zzq = zzaK();

    static {
        zzama zzamaVar = new zzama();
        zzb = zzamaVar;
        zzgre.zzaQ(zzama.class, zzamaVar);
    }

    private zzama() {
    }

    public static zzalw zza() {
        return (zzalw) zzb.zzaz();
    }

    static /* synthetic */ void zzd(zzama zzamaVar, long j) {
        zzamaVar.zze |= 2;
        zzamaVar.zzg = j;
    }

    static /* synthetic */ void zze(zzama zzamaVar, String str) {
        str.getClass();
        zzamaVar.zze |= 4;
        zzamaVar.zzh = str;
    }

    static /* synthetic */ void zzf(zzama zzamaVar, String str) {
        str.getClass();
        zzamaVar.zze |= 8;
        zzamaVar.zzi = str;
    }

    static /* synthetic */ void zzg(zzama zzamaVar, String str) {
        zzamaVar.zze |= 16;
        zzamaVar.zzj = str;
    }

    static /* synthetic */ void zzh(zzama zzamaVar, String str) {
        zzamaVar.zze |= 1024;
        zzamaVar.zzp = str;
    }

    static /* synthetic */ void zzi(zzama zzamaVar, String str) {
        str.getClass();
        zzamaVar.zze |= 1;
        zzamaVar.zzf = str;
    }

    static /* synthetic */ void zzj(zzama zzamaVar, int i) {
        zzamaVar.zzr = i - 1;
        zzamaVar.zze |= 2048;
    }

    @Override // com.google.android.gms.internal.ads.zzgre
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဈ\u0007\tဂ\b\nဈ\t\u000bဈ\n\f\u001b\rဌ\u000b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", zzaly.class, "zzr", zzalz.zza});
        }
        if (i2 == 3) {
            return new zzama();
        }
        zzalv zzalvVar = null;
        if (i2 == 4) {
            return new zzalw(zzalvVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
