package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzalf;

/* compiled from: com.google.firebase:firebase-auth@@24.0.1 */
/* loaded from: classes5.dex */
public final class zztx extends zzalf<zztx, zza> implements zzamo {
    private static final zztx zzc;
    private static volatile zzamv<zztx> zzd;
    private int zze;
    private zzua zzf;
    private int zzg;

    public final int zza() {
        return this.zzg;
    }

    public static zza zzb() {
        return (zza) zzc.zzm();
    }

    /* compiled from: com.google.firebase:firebase-auth@@24.0.1 */
    public static final class zza extends zzalf.zzb<zztx, zza> implements zzamo {
        public final zza zza(int i) {
            zzg();
            ((zztx) this.zza).zzg = i;
            return this;
        }

        public final zza zza(zzua zzuaVar) {
            zzg();
            zztx.zza((zztx) this.zza, zzuaVar);
            return this;
        }

        private zza() {
            super(zztx.zzc);
        }
    }

    public static zztx zza(zzajv zzajvVar, zzaku zzakuVar) throws zzall {
        return (zztx) zzalf.zza(zzc, zzajvVar, zzakuVar);
    }

    public final zzua zzd() {
        zzua zzuaVar = this.zzf;
        return zzuaVar == null ? zzua.zzd() : zzuaVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalf
    protected final Object zza(int i, Object obj, Object obj2) {
        zzamv zzamvVar;
        switch (zztz.zza[i - 1]) {
            case 1:
                return new zztx();
            case 2:
                return new zza();
            case 3:
                return zza(zzc, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzamv<zztx> zzamvVar2 = zzd;
                if (zzamvVar2 != null) {
                    return zzamvVar2;
                }
                synchronized (zztx.class) {
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

    static /* synthetic */ void zza(zztx zztxVar, zzua zzuaVar) {
        zzuaVar.getClass();
        zztxVar.zzf = zzuaVar;
        zztxVar.zze |= 1;
    }

    static {
        zztx zztxVar = new zztx();
        zzc = zztxVar;
        zzalf.zza((Class<zztx>) zztx.class, zztxVar);
    }

    private zztx() {
    }
}
