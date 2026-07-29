package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzgey extends zzgko implements zzglz {
    private static final zzgey zzb;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        zzgey zzgeyVar = new zzgey();
        zzb = zzgeyVar;
        zzgko.zzaN(zzgey.class, zzgeyVar);
    }

    private zzgey() {
    }

    public static zzgex zza() {
        return (zzgex) zzb.zzaw();
    }

    public static zzgey zzd() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgko
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaM(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzgey();
        }
        zzgew zzgewVar = null;
        if (i2 == 4) {
            return new zzgex(zzgewVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final int zze() {
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

    public final int zzf() {
        int i = this.zzf;
        int i2 = i != 0 ? i != 1 ? 0 : 3 : 2;
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }

    public final int zzg() {
        int i = this.zze;
        int i2 = i != 0 ? i != 1 ? 0 : 3 : 2;
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }
}
