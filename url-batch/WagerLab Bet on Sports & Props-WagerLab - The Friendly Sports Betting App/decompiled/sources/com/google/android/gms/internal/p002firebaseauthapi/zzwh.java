package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzalf;

/* compiled from: com.google.firebase:firebase-auth@@24.0.1 */
/* loaded from: classes5.dex */
public final class zzwh extends zzalf<zzwh, zza> implements zzamo {
    private static final zzwh zzc;
    private static volatile zzamv<zzwh> zzd;
    private int zze;
    private int zzf;

    public final int zza() {
        return this.zzf;
    }

    public final zzvy zzb() {
        zzvy zza2 = zzvy.zza(this.zze);
        return zza2 == null ? zzvy.UNRECOGNIZED : zza2;
    }

    /* compiled from: com.google.firebase:firebase-auth@@24.0.1 */
    public static final class zza extends zzalf.zzb<zzwh, zza> implements zzamo {
        public final zza zza(zzvy zzvyVar) {
            zzg();
            zzwh.zza((zzwh) this.zza, zzvyVar);
            return this;
        }

        public final zza zza(int i) {
            zzg();
            ((zzwh) this.zza).zzf = i;
            return this;
        }

        private zza() {
            super(zzwh.zzc);
        }
    }

    public static zza zzc() {
        return (zza) zzc.zzm();
    }

    public static zzwh zze() {
        return zzc;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalf
    protected final Object zza(int i, Object obj, Object obj2) {
        zzamv zzamvVar;
        switch (zzwg.zza[i - 1]) {
            case 1:
                return new zzwh();
            case 2:
                return new zza();
            case 3:
                return zza(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzamv<zzwh> zzamvVar2 = zzd;
                if (zzamvVar2 != null) {
                    return zzamvVar2;
                }
                synchronized (zzwh.class) {
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

    static /* synthetic */ void zza(zzwh zzwhVar, zzvy zzvyVar) {
        zzwhVar.zze = zzvyVar.zza();
    }

    static {
        zzwh zzwhVar = new zzwh();
        zzc = zzwhVar;
        zzalf.zza((Class<zzwh>) zzwh.class, zzwhVar);
    }

    private zzwh() {
    }
}
