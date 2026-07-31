package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzalf;

/* compiled from: com.google.firebase:firebase-auth@@24.0.1 */
/* loaded from: classes5.dex */
public final class zzvh extends zzalf<zzvh, zza> implements zzamo {
    private static final zzvh zzc;
    private static volatile zzamv<zzvh> zzd;
    private int zze;
    private zzvk zzf;

    public static zza zza() {
        return (zza) zzc.zzm();
    }

    public static zzvh zza(zzajv zzajvVar, zzaku zzakuVar) throws zzall {
        return (zzvh) zzalf.zza(zzc, zzajvVar, zzakuVar);
    }

    /* compiled from: com.google.firebase:firebase-auth@@24.0.1 */
    public static final class zza extends zzalf.zzb<zzvh, zza> implements zzamo {
        public final zza zza(zzvk zzvkVar) {
            zzg();
            zzvh.zza((zzvh) this.zza, zzvkVar);
            return this;
        }

        private zza() {
            super(zzvh.zzc);
        }
    }

    public final zzvk zzc() {
        zzvk zzvkVar = this.zzf;
        return zzvkVar == null ? zzvk.zze() : zzvkVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalf
    protected final Object zza(int i, Object obj, Object obj2) {
        zzamv zzamvVar;
        switch (zzvg.zza[i - 1]) {
            case 1:
                return new zzvh();
            case 2:
                return new zza();
            case 3:
                return zza(zzc, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzamv<zzvh> zzamvVar2 = zzd;
                if (zzamvVar2 != null) {
                    return zzamvVar2;
                }
                synchronized (zzvh.class) {
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

    static /* synthetic */ void zza(zzvh zzvhVar, zzvk zzvkVar) {
        zzvkVar.getClass();
        zzvhVar.zzf = zzvkVar;
        zzvhVar.zze |= 1;
    }

    static {
        zzvh zzvhVar = new zzvh();
        zzc = zzvhVar;
        zzalf.zza((Class<zzvh>) zzvh.class, zzvhVar);
    }

    private zzvh() {
    }
}
