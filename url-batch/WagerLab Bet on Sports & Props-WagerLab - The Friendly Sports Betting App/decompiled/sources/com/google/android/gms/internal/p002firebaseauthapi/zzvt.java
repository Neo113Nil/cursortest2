package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzalf;

/* compiled from: com.google.firebase:firebase-auth@@24.0.1 */
/* loaded from: classes5.dex */
public final class zzvt extends zzalf<zzvt, zza> implements zzamo {
    private static final zzvt zzc;
    private static volatile zzamv<zzvt> zzd;
    private int zze;
    private int zzf;
    private zzajv zzg = zzajv.zza;

    public static zza zza() {
        return (zza) zzc.zzm();
    }

    public static zzvt zzc() {
        return zzc;
    }

    /* compiled from: com.google.firebase:firebase-auth@@24.0.1 */
    public static final class zza extends zzalf.zzb<zzvt, zza> implements zzamo {
        public final zza zza(zzvw zzvwVar) {
            zzg();
            zzvt.zza((zzvt) this.zza, zzvwVar);
            return this;
        }

        public final zza zza(zzvy zzvyVar) {
            zzg();
            zzvt.zza((zzvt) this.zza, zzvyVar);
            return this;
        }

        public final zza zza(zzajv zzajvVar) {
            zzg();
            zzvt.zza((zzvt) this.zza, zzajvVar);
            return this;
        }

        private zza() {
            super(zzvt.zzc);
        }
    }

    public final zzvw zzd() {
        zzvw zza2 = zzvw.zza(this.zze);
        return zza2 == null ? zzvw.UNRECOGNIZED : zza2;
    }

    public final zzvy zze() {
        zzvy zza2 = zzvy.zza(this.zzf);
        return zza2 == null ? zzvy.UNRECOGNIZED : zza2;
    }

    public final zzajv zzf() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalf
    protected final Object zza(int i, Object obj, Object obj2) {
        zzamv zzamvVar;
        switch (zzvs.zza[i - 1]) {
            case 1:
                return new zzvt();
            case 2:
                return new zza();
            case 3:
                return zza(zzc, "\u0000\u0003\u0000\u0000\u0001\u000b\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u000b\n", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzamv<zzvt> zzamvVar2 = zzd;
                if (zzamvVar2 != null) {
                    return zzamvVar2;
                }
                synchronized (zzvt.class) {
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

    static /* synthetic */ void zza(zzvt zzvtVar, zzvw zzvwVar) {
        zzvtVar.zze = zzvwVar.zza();
    }

    static /* synthetic */ void zza(zzvt zzvtVar, zzvy zzvyVar) {
        zzvtVar.zzf = zzvyVar.zza();
    }

    static /* synthetic */ void zza(zzvt zzvtVar, zzajv zzajvVar) {
        zzajvVar.getClass();
        zzvtVar.zzg = zzajvVar;
    }

    static {
        zzvt zzvtVar = new zzvt();
        zzc = zzvtVar;
        zzalf.zza((Class<zzvt>) zzvt.class, zzvtVar);
    }

    private zzvt() {
    }
}
