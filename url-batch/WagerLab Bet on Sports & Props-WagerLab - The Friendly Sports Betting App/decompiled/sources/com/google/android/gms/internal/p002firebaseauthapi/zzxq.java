package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzalf;

/* compiled from: com.google.firebase:firebase-auth@@24.0.1 */
/* loaded from: classes5.dex */
public final class zzxq extends zzalf<zzxq, zza> implements zzamo {
    private static final zzxq zzc;
    private static volatile zzamv<zzxq> zzd;
    private String zze = "";

    public static zza zza() {
        return (zza) zzc.zzm();
    }

    public static zzxq zzc() {
        return zzc;
    }

    /* compiled from: com.google.firebase:firebase-auth@@24.0.1 */
    public static final class zza extends zzalf.zzb<zzxq, zza> implements zzamo {
        public final zza zza(String str) {
            zzg();
            zzxq.zza((zzxq) this.zza, str);
            return this;
        }

        private zza() {
            super(zzxq.zzc);
        }
    }

    public static zzxq zza(zzajv zzajvVar, zzaku zzakuVar) throws zzall {
        return (zzxq) zzalf.zza(zzc, zzajvVar, zzakuVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalf
    protected final Object zza(int i, Object obj, Object obj2) {
        zzamv zzamvVar;
        switch (zzxs.zza[i - 1]) {
            case 1:
                return new zzxq();
            case 2:
                return new zza();
            case 3:
                return zza(zzc, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zze"});
            case 4:
                return zzc;
            case 5:
                zzamv<zzxq> zzamvVar2 = zzd;
                if (zzamvVar2 != null) {
                    return zzamvVar2;
                }
                synchronized (zzxq.class) {
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

    public final String zzd() {
        return this.zze;
    }

    static /* synthetic */ void zza(zzxq zzxqVar, String str) {
        str.getClass();
        zzxqVar.zze = str;
    }

    static {
        zzxq zzxqVar = new zzxq();
        zzc = zzxqVar;
        zzalf.zza((Class<zzxq>) zzxq.class, zzxqVar);
    }

    private zzxq() {
    }
}
