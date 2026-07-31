package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzalf;

/* compiled from: com.google.firebase:firebase-auth@@24.0.1 */
/* loaded from: classes5.dex */
public final class zzve extends zzalf<zzve, zza> implements zzamo {
    private static final zzve zzc;
    private static volatile zzamv<zzve> zzd;
    private int zze;
    private zzxb zzf;

    public static zza zza() {
        return (zza) zzc.zzm();
    }

    public static zzve zzc() {
        return zzc;
    }

    /* compiled from: com.google.firebase:firebase-auth@@24.0.1 */
    public static final class zza extends zzalf.zzb<zzve, zza> implements zzamo {
        public final zza zza(zzxb zzxbVar) {
            zzg();
            zzve.zza((zzve) this.zza, zzxbVar);
            return this;
        }

        private zza() {
            super(zzve.zzc);
        }
    }

    public final zzxb zzd() {
        zzxb zzxbVar = this.zzf;
        return zzxbVar == null ? zzxb.zzc() : zzxbVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalf
    protected final Object zza(int i, Object obj, Object obj2) {
        zzamv zzamvVar;
        switch (zzvd.zza[i - 1]) {
            case 1:
                return new zzve();
            case 2:
                return new zza();
            case 3:
                return zza(zzc, "\u0000\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0000", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzamv<zzve> zzamvVar2 = zzd;
                if (zzamvVar2 != null) {
                    return zzamvVar2;
                }
                synchronized (zzve.class) {
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

    static /* synthetic */ void zza(zzve zzveVar, zzxb zzxbVar) {
        zzxbVar.getClass();
        zzveVar.zzf = zzxbVar;
        zzveVar.zze |= 1;
    }

    static {
        zzve zzveVar = new zzve();
        zzc = zzveVar;
        zzalf.zza((Class<zzve>) zzve.class, zzveVar);
    }

    private zzve() {
    }
}
