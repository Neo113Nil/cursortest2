package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzgkk extends zzgre implements zzgsp {
    private static final zzgkk zzb;
    private zzgkt zze;
    private zzgke zzf;
    private int zzg;

    static {
        zzgkk zzgkkVar = new zzgkk();
        zzb = zzgkkVar;
        zzgre.zzaQ(zzgkk.class, zzgkkVar);
    }

    private zzgkk() {
    }

    public static zzgkj zzc() {
        return (zzgkj) zzb.zzaz();
    }

    public static zzgkk zze() {
        return zzb;
    }

    static /* synthetic */ void zzg(zzgkk zzgkkVar, zzgkt zzgktVar) {
        zzgktVar.getClass();
        zzgkkVar.zze = zzgktVar;
    }

    static /* synthetic */ void zzh(zzgkk zzgkkVar, zzgke zzgkeVar) {
        zzgkeVar.getClass();
        zzgkkVar.zzf = zzgkeVar;
    }

    public final zzgke zza() {
        zzgke zzgkeVar = this.zzf;
        return zzgkeVar == null ? zzgke.zzd() : zzgkeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgre
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\f", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzgkk();
        }
        zzgki zzgkiVar = null;
        if (i2 == 4) {
            return new zzgkj(zzgkiVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzgkt zzf() {
        zzgkt zzgktVar = this.zze;
        return zzgktVar == null ? zzgkt.zzd() : zzgktVar;
    }

    public final int zzi() {
        int i = this.zzg;
        int i2 = 3;
        if (i == 0) {
            i2 = 2;
        } else if (i != 1) {
            i2 = i != 2 ? i != 3 ? 0 : 5 : 4;
        }
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }
}
