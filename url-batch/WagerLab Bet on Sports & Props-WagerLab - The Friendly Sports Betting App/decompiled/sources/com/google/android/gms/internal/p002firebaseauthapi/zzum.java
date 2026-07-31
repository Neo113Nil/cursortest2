package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzalf;

/* compiled from: com.google.firebase:firebase-auth@@24.0.1 */
/* loaded from: classes5.dex */
public final class zzum extends zzalf<zzum, zza> implements zzamo {
    private static final zzum zzc;
    private static volatile zzamv<zzum> zzd;
    private int zze;
    private int zzf;

    public final int zza() {
        return this.zze;
    }

    public final int zzb() {
        return this.zzf;
    }

    /* compiled from: com.google.firebase:firebase-auth@@24.0.1 */
    public static final class zza extends zzalf.zzb<zzum, zza> implements zzamo {
        public final zza zza(int i) {
            zzg();
            ((zzum) this.zza).zze = i;
            return this;
        }

        private zza() {
            super(zzum.zzc);
        }
    }

    public static zza zzc() {
        return (zza) zzc.zzm();
    }

    public static zzum zza(zzajv zzajvVar, zzaku zzakuVar) throws zzall {
        return (zzum) zzalf.zza(zzc, zzajvVar, zzakuVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalf
    protected final Object zza(int i, Object obj, Object obj2) {
        zzamv zzamvVar;
        switch (zzuo.zza[i - 1]) {
            case 1:
                return new zzum();
            case 2:
                return new zza();
            case 3:
                return zza(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zzf", "zze"});
            case 4:
                return zzc;
            case 5:
                zzamv<zzum> zzamvVar2 = zzd;
                if (zzamvVar2 != null) {
                    return zzamvVar2;
                }
                synchronized (zzum.class) {
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

    static {
        zzum zzumVar = new zzum();
        zzc = zzumVar;
        zzalf.zza((Class<zzum>) zzum.class, zzumVar);
    }

    private zzum() {
    }
}
