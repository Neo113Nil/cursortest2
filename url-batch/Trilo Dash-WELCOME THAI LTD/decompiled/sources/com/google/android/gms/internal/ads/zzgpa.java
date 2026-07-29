package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzgpa extends zzgko implements zzglz {
    private static final zzgpa zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private zzgoe zzk;
    private zzgor zzn;
    private boolean zzo;
    private boolean zzr;
    private boolean zzs;
    private zzgoz zzu;
    private byte zzx = 2;
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private zzgkx zzl = zzaH();
    private String zzm = "";
    private zzgkx zzp = zzgko.zzaH();
    private String zzq = "";
    private zzgjg zzt = zzgjg.zzb;
    private zzgkx zzv = zzgko.zzaH();
    private zzgkx zzw = zzgko.zzaH();

    static {
        zzgpa zzgpaVar = new zzgpa();
        zzb = zzgpaVar;
        zzgko.zzaN(zzgpa.class, zzgpaVar);
    }

    private zzgpa() {
    }

    public static zzgoc zza() {
        return (zzgoc) zzb.zzaw();
    }

    static /* synthetic */ void zzg(zzgpa zzgpaVar, String str) {
        str.getClass();
        zzgpaVar.zze |= 4;
        zzgpaVar.zzh = str;
    }

    static /* synthetic */ void zzh(zzgpa zzgpaVar, String str) {
        str.getClass();
        zzgpaVar.zze |= 8;
        zzgpaVar.zzi = str;
    }

    static /* synthetic */ void zzi(zzgpa zzgpaVar, zzgoe zzgoeVar) {
        zzgoeVar.getClass();
        zzgpaVar.zzk = zzgoeVar;
        zzgpaVar.zze |= 32;
    }

    static /* synthetic */ void zzj(zzgpa zzgpaVar, zzgox zzgoxVar) {
        zzgoxVar.getClass();
        zzgkx zzgkxVar = zzgpaVar.zzl;
        if (!zzgkxVar.zzc()) {
            zzgpaVar.zzl = zzgko.zzaI(zzgkxVar);
        }
        zzgpaVar.zzl.add(zzgoxVar);
    }

    static /* synthetic */ void zzk(zzgpa zzgpaVar, String str) {
        zzgpaVar.zze |= 64;
        zzgpaVar.zzm = str;
    }

    static /* synthetic */ void zzl(zzgpa zzgpaVar) {
        zzgpaVar.zze &= -65;
        zzgpaVar.zzm = zzb.zzm;
    }

    static /* synthetic */ void zzm(zzgpa zzgpaVar, zzgor zzgorVar) {
        zzgorVar.getClass();
        zzgpaVar.zzn = zzgorVar;
        zzgpaVar.zze |= 128;
    }

    static /* synthetic */ void zzn(zzgpa zzgpaVar, zzgoz zzgozVar) {
        zzgozVar.getClass();
        zzgpaVar.zzu = zzgozVar;
        zzgpaVar.zze |= 8192;
    }

    static /* synthetic */ void zzo(zzgpa zzgpaVar, Iterable iterable) {
        zzgkx zzgkxVar = zzgpaVar.zzv;
        if (!zzgkxVar.zzc()) {
            zzgpaVar.zzv = zzgko.zzaI(zzgkxVar);
        }
        zzgip.zzar(iterable, zzgpaVar.zzv);
    }

    static /* synthetic */ void zzp(zzgpa zzgpaVar, Iterable iterable) {
        zzgkx zzgkxVar = zzgpaVar.zzw;
        if (!zzgkxVar.zzc()) {
            zzgpaVar.zzw = zzgko.zzaI(zzgkxVar);
        }
        zzgip.zzar(iterable, zzgpaVar.zzw);
    }

    static /* synthetic */ void zzq(zzgpa zzgpaVar, int i) {
        zzgpaVar.zzf = i - 1;
        zzgpaVar.zze |= 1;
    }

    public final String zzd() {
        return this.zzm;
    }

    public final String zze() {
        return this.zzh;
    }

    public final List zzf() {
        return this.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzgko
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzx);
        }
        if (i2 == 2) {
            return zzaM(zzb, "\u0001\u0012\u0000\u0001\u0001\u0015\u0012\u0000\u0004\u0001\u0001ဈ\u0002\u0002ဈ\u0003\u0003ဈ\u0004\u0004Л\u0005ဇ\b\u0006\u001a\u0007ဈ\t\bဇ\n\tဇ\u000b\nဌ\u0000\u000bဌ\u0001\fဉ\u0005\rဈ\u0006\u000eဉ\u0007\u000fည\f\u0011ဉ\r\u0014\u001a\u0015\u001a", new Object[]{"zze", "zzh", "zzi", "zzj", "zzl", zzgox.class, "zzo", "zzp", "zzq", "zzr", "zzs", "zzf", zzgos.zza, "zzg", zzgob.zza, "zzk", "zzm", "zzn", "zzt", "zzu", "zzv", "zzw"});
        }
        if (i2 == 3) {
            return new zzgpa();
        }
        zzgoa zzgoaVar = null;
        if (i2 == 4) {
            return new zzgoc(zzgoaVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        this.zzx = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
