package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzgfh extends zzgko implements zzglz {
    private static final zzgfh zzb;
    private String zze = "";
    private zzgjg zzf = zzgjg.zzb;
    private int zzg;

    static {
        zzgfh zzgfhVar = new zzgfh();
        zzb = zzgfhVar;
        zzgko.zzaN(zzgfh.class, zzgfhVar);
    }

    private zzgfh() {
    }

    public static zzgfg zza() {
        return (zzgfg) zzb.zzaw();
    }

    public static zzgfh zzd() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgko
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaM(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzgfh();
        }
        zzgff zzgffVar = null;
        if (i2 == 4) {
            return new zzgfg(zzgffVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzgjg zze() {
        return this.zzf;
    }

    public final String zzf() {
        return this.zze;
    }

    public final int zzi() {
        int i = this.zzg;
        int i2 = 4;
        if (i == 0) {
            i2 = 2;
        } else if (i == 1) {
            i2 = 3;
        } else if (i != 2) {
            i2 = i != 3 ? i != 4 ? 0 : 6 : 5;
        }
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }
}
