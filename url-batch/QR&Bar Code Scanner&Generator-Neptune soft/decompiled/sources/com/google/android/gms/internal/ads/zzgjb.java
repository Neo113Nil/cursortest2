package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzgjb extends zzgre implements zzgsp {
    private static final zzgjb zzb;
    private int zze;

    static {
        zzgjb zzgjbVar = new zzgjb();
        zzb = zzgjbVar;
        zzgre.zzaQ(zzgjb.class, zzgjbVar);
    }

    private zzgjb() {
    }

    public static zzgja zzc() {
        return (zzgja) zzb.zzaz();
    }

    public static zzgjb zze() {
        return zzb;
    }

    public final int zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzgre
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zze"});
        }
        if (i2 == 3) {
            return new zzgjb();
        }
        zzgiz zzgizVar = null;
        if (i2 == 4) {
            return new zzgja(zzgizVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
