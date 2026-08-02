package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzbga extends zzgre implements zzgsp {
    private static final zzbga zzb;
    private int zze;
    private int zzf;
    private zzbhp zzg;
    private String zzh = "";
    private String zzi = "";

    static {
        zzbga zzbgaVar = new zzbga();
        zzb = zzbgaVar;
        zzgre.zzaQ(zzbga.class, zzbgaVar);
    }

    private zzbga() {
    }

    @Override // com.google.android.gms.internal.ads.zzgre
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0001\u0004\u0000\u0001\u0005\b\u0004\u0000\u0000\u0000\u0005ဌ\u0000\u0006ဉ\u0001\u0007ဈ\u0002\bဈ\u0003", new Object[]{"zze", "zzf", zzbfz.zza, "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new zzbga();
        }
        zzbew zzbewVar = null;
        if (i2 == 4) {
            return new zzbfy(zzbewVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
