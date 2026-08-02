package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzbgf extends zzgre implements zzgsp {
    private static final zzbgf zzb;
    private int zze;
    private int zzf;
    private int zzh;
    private zzbhp zzj;
    private zzbfx zzl;
    private zzbga zzm;
    private zzbgt zzn;
    private zzbfb zzo;
    private zzbhd zzp;
    private zzbik zzq;
    private zzbfk zzr;
    private String zzg = "";
    private int zzi = 1000;
    private zzgrm zzk = zzaJ();

    static {
        zzbgf zzbgfVar = new zzbgf();
        zzb = zzbgfVar;
        zzgre.zzaQ(zzbgf.class, zzbgfVar);
    }

    private zzbgf() {
    }

    public static zzbge zzd() {
        return (zzbge) zzb.zzaz();
    }

    static /* synthetic */ void zzg(zzbgf zzbgfVar, String str) {
        str.getClass();
        zzbgfVar.zze |= 2;
        zzbgfVar.zzg = str;
    }

    static /* synthetic */ void zzh(zzbgf zzbgfVar, Iterable iterable) {
        zzgrm zzgrmVar = zzbgfVar.zzk;
        if (!zzgrmVar.zzc()) {
            int size = zzgrmVar.size();
            zzbgfVar.zzk = zzgrmVar.zzd(size == 0 ? 10 : size + size);
        }
        zzgpf.zzau(iterable, zzbgfVar.zzk);
    }

    static /* synthetic */ void zzj(zzbgf zzbgfVar, zzbfx zzbfxVar) {
        zzbfxVar.getClass();
        zzbgfVar.zzl = zzbfxVar;
        zzbgfVar.zze |= 32;
    }

    static /* synthetic */ void zzk(zzbgf zzbgfVar, zzbfb zzbfbVar) {
        zzbfbVar.getClass();
        zzbgfVar.zzo = zzbfbVar;
        zzbgfVar.zze |= 256;
    }

    static /* synthetic */ void zzl(zzbgf zzbgfVar, zzbhd zzbhdVar) {
        zzbhdVar.getClass();
        zzbgfVar.zzp = zzbhdVar;
        zzbgfVar.zze |= 512;
    }

    static /* synthetic */ void zzm(zzbgf zzbgfVar, zzbik zzbikVar) {
        zzbikVar.getClass();
        zzbgfVar.zzq = zzbikVar;
        zzbgfVar.zze |= 1024;
    }

    static /* synthetic */ void zzn(zzbgf zzbgfVar, zzbfk zzbfkVar) {
        zzbfkVar.getClass();
        zzbgfVar.zzr = zzbfkVar;
        zzbgfVar.zze |= 2048;
    }

    public final zzbfb zza() {
        zzbfb zzbfbVar = this.zzo;
        return zzbfbVar == null ? zzbfb.zzc() : zzbfbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgre
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0001\r\u0000\u0001\t\u0015\r\u0000\u0001\u0000\tင\u0000\nဈ\u0001\u000bဋ\u0002\fဌ\u0003\rဉ\u0004\u000e\u0015\u000fဉ\u0005\u0010ဉ\u0006\u0011ဉ\u0007\u0012ဉ\b\u0013ဉ\t\u0014ဉ\n\u0015ဉ\u000b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", zzbgc.zza, "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr"});
        }
        if (i2 == 3) {
            return new zzbgf();
        }
        zzbew zzbewVar = null;
        if (i2 == 4) {
            return new zzbge(zzbewVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzbfx zzc() {
        zzbfx zzbfxVar = this.zzl;
        return zzbfxVar == null ? zzbfx.zzc() : zzbfxVar;
    }

    public final String zzf() {
        return this.zzg;
    }
}
