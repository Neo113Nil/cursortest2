package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzbfx extends zzgre implements zzgsp {
    private static final zzbfx zzb;
    private int zze;
    private zzbhn zzg;
    private int zzh;
    private zzbhp zzi;
    private int zzj;
    private String zzf = "";
    private int zzk = 1000;
    private int zzl = 1000;
    private int zzm = 1000;

    static {
        zzbfx zzbfxVar = new zzbfx();
        zzb = zzbfxVar;
        zzgre.zzaQ(zzbfx.class, zzbfxVar);
    }

    private zzbfx() {
    }

    public static zzbfx zzc() {
        return zzb;
    }

    static /* synthetic */ void zzd(zzbfx zzbfxVar, String str) {
        zzbfxVar.zze |= 1;
        zzbfxVar.zzf = str;
    }

    static /* synthetic */ void zze(zzbfx zzbfxVar, zzbhp zzbhpVar) {
        zzbhpVar.getClass();
        zzbfxVar.zzi = zzbhpVar;
        zzbfxVar.zze |= 8;
    }

    @Override // com.google.android.gms.internal.ads.zzgre
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            zzgri zzgriVar = zzbgc.zza;
            return zzaP(zzb, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004ဉ\u0003\u0005င\u0004\u0006ဌ\u0005\u0007ဌ\u0006\bဌ\u0007", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", zzgriVar, "zzl", zzgriVar, "zzm", zzgriVar});
        }
        if (i2 == 3) {
            return new zzbfx();
        }
        zzbew zzbewVar = null;
        if (i2 == 4) {
            return new zzbfw(zzbewVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
