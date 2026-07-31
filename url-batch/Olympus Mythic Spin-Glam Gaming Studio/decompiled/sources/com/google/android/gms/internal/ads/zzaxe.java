package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes15.dex */
public final class zzaxe extends zzifm implements zzigx {
    private static final zzaxe zzu;
    private static volatile zzihe zzv;
    private int zza;
    private long zzc;
    private int zzg;
    private long zzi;
    private long zzl;
    private long zzm;
    private int zzo;
    private int zzp;
    private zzify zzb = zzifm.zzbM();
    private String zzd = "";
    private String zze = "";
    private String zzf = "";
    private String zzh = "";
    private String zzj = "";
    private String zzk = "";
    private zzifu zzn = zzifm.zzbC();

    static {
        zzaxe zzaxeVar = new zzaxe();
        zzu = zzaxeVar;
        zzifm.zzbu(zzaxe.class, zzaxeVar);
    }

    private zzaxe() {
    }

    public static zzaxd zza() {
        return (zzaxd) zzu.zzbn();
    }

    final /* synthetic */ void zzb(zzaxw zzaxwVar) {
        zzaxwVar.getClass();
        zzify zzifyVar = this.zzb;
        if (!zzifyVar.zza()) {
            this.zzb = zzifm.zzbN(zzifyVar);
        }
        this.zzb.add(zzaxwVar);
    }

    final /* synthetic */ void zzc() {
        this.zzb = zzifm.zzbM();
    }

    final /* synthetic */ void zzd(long j) {
        this.zza |= 1;
        this.zzc = j;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    protected final Object zzdd(zzifl zziflVar, Object obj, Object obj2) {
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzifm.zzbv(zzu, "\u0004\u000f\u0000\u0001\bB\u000f\u0000\u0002\u0000\b\u001b\u0015ဂ\u0000\u0016ဈ\u0001\u0017ဈ\u0002\u0018ဈ\u0003\u0019᠌\u0004(ဈ\u0005)ဂ\u0006<ဈ\u0007=ဈ\b>ဂ\t?ဂ\n@'Aဌ\u000bBဌ\f", new Object[]{"zza", "zzb", zzaxw.class, "zzc", "zzd", "zze", "zzf", "zzg", zzaxu.zza, "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp"});
        }
        if (ordinal == 3) {
            return new zzaxe();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzaxd(bArr);
        }
        if (ordinal == 5) {
            return zzu;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar = zzv;
        if (zziheVar == null) {
            synchronized (zzaxe.class) {
                try {
                    zziheVar = zzv;
                    if (zziheVar == null) {
                        zziheVar = new zzifh(zzu);
                        zzv = zziheVar;
                    }
                } finally {
                }
            }
        }
        return zziheVar;
    }

    final /* synthetic */ void zze(String str) {
        str.getClass();
        this.zza |= 2;
        this.zzd = str;
    }

    final /* synthetic */ void zzg(String str) {
        str.getClass();
        this.zza |= 4;
        this.zze = str;
    }

    final /* synthetic */ void zzh(String str) {
        str.getClass();
        this.zza |= 8;
        this.zzf = str;
    }

    final /* synthetic */ void zzi(String str) {
        str.getClass();
        this.zza |= 32;
        this.zzh = str;
    }

    final /* synthetic */ void zzj(long j) {
        this.zza |= 64;
        this.zzi = j;
    }

    final /* synthetic */ void zzk(String str) {
        str.getClass();
        this.zza |= 128;
        this.zzj = str;
    }

    final /* synthetic */ void zzl(String str) {
        str.getClass();
        this.zza |= 256;
        this.zzk = str;
    }

    final /* synthetic */ void zzm(long j) {
        this.zza |= 512;
        this.zzl = j;
    }

    final /* synthetic */ void zzn(long j) {
        this.zza |= 1024;
        this.zzm = j;
    }

    final /* synthetic */ void zzo(Iterable iterable) {
        zzifu zzifuVar = this.zzn;
        if (!zzifuVar.zza()) {
            this.zzn = zzifm.zzbD(zzifuVar);
        }
        zzidr.zzaW(iterable, this.zzn);
    }

    final /* synthetic */ void zzq(int i) {
        this.zzg = i - 1;
        this.zza |= 16;
    }

    final /* synthetic */ void zzr(int i) {
        this.zzo = zzbel.zza(i);
        this.zza |= 2048;
    }

    final /* synthetic */ void zzs(int i) {
        this.zzp = 1;
        this.zza |= 4096;
    }
}
