package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzgwo extends zzgre implements zzgsp {
    private static final zzgwo zzb;
    private int zze;
    private boolean zzl;
    private double zzm;
    private int zzo;
    private boolean zzp;
    private boolean zzq;
    private boolean zzr;
    private boolean zzs;
    private String zzf = "";
    private String zzg = "";
    private int zzh = 4;
    private zzgrn zzi = zzgre.zzaK();
    private String zzj = "";
    private String zzk = "";
    private zzgrn zzn = zzaK();

    static {
        zzgwo zzgwoVar = new zzgwo();
        zzb = zzgwoVar;
        zzgre.zzaQ(zzgwo.class, zzgwoVar);
    }

    private zzgwo() {
    }

    @Override // com.google.android.gms.internal.ads.zzgre
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaP(zzb, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0002\u0000\u0001ဈ\u0000\u0002ဌ\u0002\u0003\u001a\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဇ\u0005\u0007က\u0006\b\u001b\tဈ\u0001\nဌ\u0007\u000bဇ\b\fဇ\t\rဇ\n\u000eဇ\u000b", new Object[]{"zze", "zzf", "zzh", zzgwn.zza, "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", zzgwm.class, "zzg", "zzo", zzgwk.zza, "zzp", "zzq", "zzr", "zzs"});
        }
        if (i2 == 3) {
            return new zzgwo();
        }
        zzguq zzguqVar = null;
        if (i2 == 4) {
            return new zzgwj(zzguqVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
