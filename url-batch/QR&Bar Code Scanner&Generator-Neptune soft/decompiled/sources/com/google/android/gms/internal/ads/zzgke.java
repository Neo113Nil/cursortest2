package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzgke extends zzgre implements zzgsp {
    private static final zzgke zzb;
    private zzgmc zze;

    static {
        zzgke zzgkeVar = new zzgke();
        zzb = zzgkeVar;
        zzgre.zzaQ(zzgke.class, zzgkeVar);
    }

    private zzgke() {
    }

    public static zzgkd zza() {
        return (zzgkd) zzb.zzaz();
    }

    public static zzgke zzd() {
        return zzb;
    }

    static /* synthetic */ void zzf(zzgke zzgkeVar, zzgmc zzgmcVar) {
        zzgmcVar.getClass();
        zzgkeVar.zze = zzgmcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgre
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\t", new Object[]{"zze"});
        }
        if (i2 == 3) {
            return new zzgke();
        }
        zzgkc zzgkcVar = null;
        if (i2 == 4) {
            return new zzgkd(zzgkcVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzgmc zze() {
        zzgmc zzgmcVar = this.zze;
        return zzgmcVar == null ? zzgmc.zzd() : zzgmcVar;
    }
}
