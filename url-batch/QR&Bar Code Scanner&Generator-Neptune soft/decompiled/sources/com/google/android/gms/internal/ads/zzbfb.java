package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzbfb extends zzgre implements zzgsp {
    private static final zzbfb zzb;
    private int zze;
    private int zzf;
    private zzbfr zzh;
    private zzbft zzi;
    private zzbfv zzk;
    private zzbhf zzl;
    private zzbgv zzm;
    private zzbgj zzn;
    private zzbgl zzo;
    private int zzg = 1000;
    private zzgrn zzj = zzaK();
    private zzgrn zzp = zzaK();

    static {
        zzbfb zzbfbVar = new zzbfb();
        zzb = zzbfbVar;
        zzgre.zzaQ(zzbfb.class, zzbfbVar);
    }

    private zzbfb() {
    }

    public static zzbfb zzc() {
        return zzb;
    }

    static /* synthetic */ void zze(zzbfb zzbfbVar, zzbez zzbezVar) {
        zzbfbVar.zzf = zzbezVar.zza();
        zzbfbVar.zze |= 1;
    }

    static /* synthetic */ void zzf(zzbfb zzbfbVar, zzbft zzbftVar) {
        zzbftVar.getClass();
        zzbfbVar.zzi = zzbftVar;
        zzbfbVar.zze |= 8;
    }

    @Override // com.google.android.gms.internal.ads.zzgre
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0001\u000b\u0000\u0001\u0007\u0011\u000b\u0000\u0002\u0000\u0007ဌ\u0000\bဌ\u0001\tဉ\u0002\nဉ\u0003\u000b\u001b\fဉ\u0004\rဉ\u0005\u000eဉ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011\u001b", new Object[]{"zze", "zzf", zzbez.zzc(), "zzg", zzbgc.zza, "zzh", "zzi", "zzj", zzbfp.class, "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", zzbhr.class});
        }
        if (i2 == 3) {
            return new zzbfb();
        }
        zzbew zzbewVar = null;
        if (i2 == 4) {
            return new zzbfa(zzbewVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzbft zzd() {
        zzbft zzbftVar = this.zzi;
        return zzbftVar == null ? zzbft.zzc() : zzbftVar;
    }
}
