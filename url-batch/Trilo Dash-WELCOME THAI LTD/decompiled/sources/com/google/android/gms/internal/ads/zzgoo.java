package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzgoo extends zzgko implements zzglz {
    private static final zzgoo zzb;
    private int zze;
    private zzgon zzf;
    private zzgjg zzi;
    private int zzj;
    private zzgjg zzk;
    private byte zzl = 2;
    private zzgkx zzg = zzaH();
    private zzgjg zzh = zzgjg.zzb;

    static {
        zzgoo zzgooVar = new zzgoo();
        zzb = zzgooVar;
        zzgko.zzaN(zzgoo.class, zzgooVar);
    }

    private zzgoo() {
        zzgjg zzgjgVar = zzgjg.zzb;
        this.zzi = zzgjgVar;
        this.zzk = zzgjgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgko
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzl);
        }
        if (i2 == 2) {
            return zzaM(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003\u0006ည\u0004", new Object[]{"zze", "zzf", "zzg", zzgog.class, "zzh", "zzi", "zzj", "zzk"});
        }
        if (i2 == 3) {
            return new zzgoo();
        }
        zzgoa zzgoaVar = null;
        if (i2 == 4) {
            return new zzgol(zzgoaVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        this.zzl = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
