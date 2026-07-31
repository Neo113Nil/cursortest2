package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzalf;

/* compiled from: com.google.firebase:firebase-auth@@24.0.1 */
/* loaded from: classes5.dex */
public final class zzuy extends zzalf<zzuy, zza> implements zzamo {
    private static final zzuy zzc;
    private static volatile zzamv<zzuy> zzd;

    /* compiled from: com.google.firebase:firebase-auth@@24.0.1 */
    public static final class zza extends zzalf.zzb<zzuy, zza> implements zzamo {
        private zza() {
            super(zzuy.zzc);
        }
    }

    public static zzuy zzb() {
        return zzc;
    }

    public static zzuy zza(zzajv zzajvVar, zzaku zzakuVar) throws zzall {
        return (zzuy) zzalf.zza(zzc, zzajvVar, zzakuVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalf
    protected final Object zza(int i, Object obj, Object obj2) {
        zzamv zzamvVar;
        switch (zzva.zza[i - 1]) {
            case 1:
                return new zzuy();
            case 2:
                return new zza();
            case 3:
                return zza(zzc, "\u0000\u0000", (Object[]) null);
            case 4:
                return zzc;
            case 5:
                zzamv<zzuy> zzamvVar2 = zzd;
                if (zzamvVar2 != null) {
                    return zzamvVar2;
                }
                synchronized (zzuy.class) {
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
        zzuy zzuyVar = new zzuy();
        zzc = zzuyVar;
        zzalf.zza((Class<zzuy>) zzuy.class, zzuyVar);
    }

    private zzuy() {
    }
}
