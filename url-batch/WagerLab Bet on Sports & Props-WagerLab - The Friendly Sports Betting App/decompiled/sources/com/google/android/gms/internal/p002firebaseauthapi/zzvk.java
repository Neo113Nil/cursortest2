package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzalf;

/* compiled from: com.google.firebase:firebase-auth@@24.0.1 */
/* loaded from: classes5.dex */
public final class zzvk extends zzalf<zzvk, zza> implements zzamo {
    private static final zzvk zzc;
    private static volatile zzamv<zzvk> zzd;
    private int zze;
    private zzvt zzf;
    private zzve zzg;
    private int zzh;

    public final zzvb zza() {
        zzvb zza2 = zzvb.zza(this.zzh);
        return zza2 == null ? zzvb.UNRECOGNIZED : zza2;
    }

    /* compiled from: com.google.firebase:firebase-auth@@24.0.1 */
    public static final class zza extends zzalf.zzb<zzvk, zza> implements zzamo {
        public final zza zza(zzve zzveVar) {
            zzg();
            zzvk.zza((zzvk) this.zza, zzveVar);
            return this;
        }

        public final zza zza(zzvb zzvbVar) {
            zzg();
            zzvk.zza((zzvk) this.zza, zzvbVar);
            return this;
        }

        public final zza zza(zzvt zzvtVar) {
            zzg();
            zzvk.zza((zzvk) this.zza, zzvtVar);
            return this;
        }

        private zza() {
            super(zzvk.zzc);
        }
    }

    public final zzve zzb() {
        zzve zzveVar = this.zzg;
        return zzveVar == null ? zzve.zzc() : zzveVar;
    }

    public static zza zzc() {
        return (zza) zzc.zzm();
    }

    public static zzvk zze() {
        return zzc;
    }

    public final zzvt zzf() {
        zzvt zzvtVar = this.zzf;
        return zzvtVar == null ? zzvt.zzc() : zzvtVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalf
    protected final Object zza(int i, Object obj, Object obj2) {
        zzamv zzamvVar;
        switch (zzvj.zza[i - 1]) {
            case 1:
                return new zzvk();
            case 2:
                return new zza();
            case 3:
                return zza(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\f", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzamv<zzvk> zzamvVar2 = zzd;
                if (zzamvVar2 != null) {
                    return zzamvVar2;
                }
                synchronized (zzvk.class) {
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

    static /* synthetic */ void zza(zzvk zzvkVar, zzve zzveVar) {
        zzveVar.getClass();
        zzvkVar.zzg = zzveVar;
        zzvkVar.zze |= 2;
    }

    static /* synthetic */ void zza(zzvk zzvkVar, zzvb zzvbVar) {
        zzvkVar.zzh = zzvbVar.zza();
    }

    static /* synthetic */ void zza(zzvk zzvkVar, zzvt zzvtVar) {
        zzvtVar.getClass();
        zzvkVar.zzf = zzvtVar;
        zzvkVar.zze |= 1;
    }

    static {
        zzvk zzvkVar = new zzvk();
        zzc = zzvkVar;
        zzalf.zza((Class<zzvk>) zzvk.class, zzvkVar);
    }

    private zzvk() {
    }
}
