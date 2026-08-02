package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzbhp extends zzgre implements zzgsp {
    private static final zzbhp zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;

    static {
        zzbhp zzbhpVar = new zzbhp();
        zzb = zzbhpVar;
        zzgre.zzaQ(zzbhp.class, zzbhpVar);
    }

    private zzbhp() {
    }

    public static zzbho zza() {
        return (zzbho) zzb.zzaz();
    }

    static /* synthetic */ void zzd(zzbhp zzbhpVar, int i) {
        zzbhpVar.zze |= 1;
        zzbhpVar.zzf = i;
    }

    static /* synthetic */ void zze(zzbhp zzbhpVar, int i) {
        zzbhpVar.zze |= 2;
        zzbhpVar.zzg = i;
    }

    static /* synthetic */ void zzf(zzbhp zzbhpVar, int i) {
        zzbhpVar.zze |= 4;
        zzbhpVar.zzh = i;
    }

    @Override // com.google.android.gms.internal.ads.zzgre
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzbhp();
        }
        zzbew zzbewVar = null;
        if (i2 == 4) {
            return new zzbho(zzbewVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
