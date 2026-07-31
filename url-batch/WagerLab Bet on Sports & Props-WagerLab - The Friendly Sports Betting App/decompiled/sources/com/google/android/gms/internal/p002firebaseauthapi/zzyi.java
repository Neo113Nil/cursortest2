package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzalf;

/* compiled from: com.google.firebase:firebase-auth@@24.0.1 */
/* loaded from: classes5.dex */
public final class zzyi extends zzalf<zzyi, zza> implements zzamo {
    private static final zzyi zzc;
    private static volatile zzamv<zzyi> zzd;
    private int zze;
    private int zzf;
    private zzyl zzg;

    public final int zza() {
        return this.zzf;
    }

    public static zza zzb() {
        return (zza) zzc.zzm();
    }

    /* compiled from: com.google.firebase:firebase-auth@@24.0.1 */
    public static final class zza extends zzalf.zzb<zzyi, zza> implements zzamo {
        public final zza zza(zzyl zzylVar) {
            zzg();
            zzyi.zza((zzyi) this.zza, zzylVar);
            return this;
        }

        private zza() {
            super(zzyi.zzc);
        }
    }

    public static zzyi zza(zzajv zzajvVar, zzaku zzakuVar) throws zzall {
        return (zzyi) zzalf.zza(zzc, zzajvVar, zzakuVar);
    }

    public final zzyl zzd() {
        zzyl zzylVar = this.zzg;
        return zzylVar == null ? zzyl.zzd() : zzylVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalf
    protected final Object zza(int i, Object obj, Object obj2) {
        zzamv zzamvVar;
        switch (zzyh.zza[i - 1]) {
            case 1:
                return new zzyi();
            case 2:
                return new zza();
            case 3:
                return zza(zzc, "\u0000\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003ဉ\u0000", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzamv<zzyi> zzamvVar2 = zzd;
                if (zzamvVar2 != null) {
                    return zzamvVar2;
                }
                synchronized (zzyi.class) {
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

    static /* synthetic */ void zza(zzyi zzyiVar, zzyl zzylVar) {
        zzylVar.getClass();
        zzyiVar.zzg = zzylVar;
        zzyiVar.zze |= 1;
    }

    static {
        zzyi zzyiVar = new zzyi();
        zzc = zzyiVar;
        zzalf.zza((Class<zzyi>) zzyi.class, zzyiVar);
    }

    private zzyi() {
    }
}
