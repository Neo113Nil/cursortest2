package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzbfb extends zzgko implements zzglz {
    private static final zzbfb zzb;
    private int zze;
    private int zzf;
    private int zzh;
    private zzbgl zzj;
    private zzbet zzl;
    private zzbew zzm;
    private zzbfp zzn;
    private zzbdx zzo;
    private zzbfz zzp;
    private zzbhg zzq;
    private zzbeg zzr;
    private String zzg = "";
    private int zzi = 1000;
    private zzgkw zzk = zzaG();

    static {
        zzbfb zzbfbVar = new zzbfb();
        zzb = zzbfbVar;
        zzgko.zzaN(zzbfb.class, zzbfbVar);
    }

    private zzbfb() {
    }

    public static zzbfa zzd() {
        return (zzbfa) zzb.zzaw();
    }

    static /* synthetic */ void zzg(zzbfb zzbfbVar, String str) {
        str.getClass();
        zzbfbVar.zze |= 2;
        zzbfbVar.zzg = str;
    }

    static /* synthetic */ void zzh(zzbfb zzbfbVar, Iterable iterable) {
        zzgkw zzgkwVar = zzbfbVar.zzk;
        if (!zzgkwVar.zzc()) {
            int size = zzgkwVar.size();
            zzbfbVar.zzk = zzgkwVar.zzd(size == 0 ? 10 : size + size);
        }
        zzgip.zzar(iterable, zzbfbVar.zzk);
    }

    static /* synthetic */ void zzj(zzbfb zzbfbVar, zzbet zzbetVar) {
        zzbetVar.getClass();
        zzbfbVar.zzl = zzbetVar;
        zzbfbVar.zze |= 32;
    }

    static /* synthetic */ void zzk(zzbfb zzbfbVar, zzbdx zzbdxVar) {
        zzbdxVar.getClass();
        zzbfbVar.zzo = zzbdxVar;
        zzbfbVar.zze |= 256;
    }

    static /* synthetic */ void zzl(zzbfb zzbfbVar, zzbfz zzbfzVar) {
        zzbfzVar.getClass();
        zzbfbVar.zzp = zzbfzVar;
        zzbfbVar.zze |= 512;
    }

    static /* synthetic */ void zzm(zzbfb zzbfbVar, zzbhg zzbhgVar) {
        zzbhgVar.getClass();
        zzbfbVar.zzq = zzbhgVar;
        zzbfbVar.zze |= 1024;
    }

    static /* synthetic */ void zzn(zzbfb zzbfbVar, zzbeg zzbegVar) {
        zzbegVar.getClass();
        zzbfbVar.zzr = zzbegVar;
        zzbfbVar.zze |= 2048;
    }

    public final zzbdx zza() {
        zzbdx zzbdxVar = this.zzo;
        return zzbdxVar == null ? zzbdx.zzc() : zzbdxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgko
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaM(zzb, "\u0001\r\u0000\u0001\t\u0015\r\u0000\u0001\u0000\tင\u0000\nဈ\u0001\u000bဋ\u0002\fဌ\u0003\rဉ\u0004\u000e\u0015\u000fဉ\u0005\u0010ဉ\u0006\u0011ဉ\u0007\u0012ဉ\b\u0013ဉ\t\u0014ဉ\n\u0015ဉ\u000b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", zzbey.zza, "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr"});
        }
        if (i2 == 3) {
            return new zzbfb();
        }
        zzbds zzbdsVar = null;
        if (i2 == 4) {
            return new zzbfa(zzbdsVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzbet zzc() {
        zzbet zzbetVar = this.zzl;
        return zzbetVar == null ? zzbet.zzc() : zzbetVar;
    }

    public final String zzf() {
        return this.zzg;
    }
}
