package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzalf;

/* compiled from: com.google.firebase:firebase-auth@@24.0.1 */
/* loaded from: classes5.dex */
public final class zzuv extends zzalf<zzuv, zza> implements zzamo {
    private static final zzuv zzc;
    private static volatile zzamv<zzuv> zzd;
    private int zze;
    private zzajv zzf = zzajv.zza;

    public final int zza() {
        return this.zze;
    }

    public static zza zzb() {
        return (zza) zzc.zzm();
    }

    /* compiled from: com.google.firebase:firebase-auth@@24.0.1 */
    public static final class zza extends zzalf.zzb<zzuv, zza> implements zzamo {
        public final zza zza(zzajv zzajvVar) {
            zzg();
            zzuv.zza((zzuv) this.zza, zzajvVar);
            return this;
        }

        private zza() {
            super(zzuv.zzc);
        }
    }

    public static zzuv zza(zzajv zzajvVar, zzaku zzakuVar) throws zzall {
        return (zzuv) zzalf.zza(zzc, zzajvVar, zzakuVar);
    }

    public final zzajv zzd() {
        return this.zzf;
    }

    public static zzamv<zzuv> zze() {
        return (zzamv) zzc.zza(zzalf.zze.zzg, (Object) null, (Object) null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalf
    protected final Object zza(int i, Object obj, Object obj2) {
        zzamv zzamvVar;
        switch (zzux.zza[i - 1]) {
            case 1:
                return new zzuv();
            case 2:
                return new zza();
            case 3:
                return zza(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzamv<zzuv> zzamvVar2 = zzd;
                if (zzamvVar2 != null) {
                    return zzamvVar2;
                }
                synchronized (zzuv.class) {
                    zzamvVar = zzd;
                    if (zzamvVar == null) {
                        zzamvVar = new zzalf.zza(zzc);
                        zzd = zzamvVar;
                    }
                }
                return zzamvVar;
            case 6:
                return (byte) 1;
            default:
                throw null;
        }
    }

    static /* synthetic */ void zza(zzuv zzuvVar, zzajv zzajvVar) {
        zzajvVar.getClass();
        zzuvVar.zzf = zzajvVar;
    }

    static {
        zzuv zzuvVar = new zzuv();
        zzc = zzuvVar;
        zzalf.zza((Class<zzuv>) zzuv.class, zzuvVar);
    }

    private zzuv() {
    }
}
