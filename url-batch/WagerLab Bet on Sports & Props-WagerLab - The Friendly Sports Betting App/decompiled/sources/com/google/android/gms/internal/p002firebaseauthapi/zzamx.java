package com.google.android.gms.internal.p002firebaseauthapi;

import com.amazon.device.simplesignin.a.a.a;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: com.google.firebase:firebase-auth@@24.0.1 */
/* loaded from: classes5.dex */
final class zzamx {
    private static final zzamx zza = new zzamx();
    private final ConcurrentMap<Class<?>, zzanb<?>> zzc = new ConcurrentHashMap();
    private final zzane zzb = new zzama();

    public static zzamx zza() {
        return zza;
    }

    public final <T> zzanb<T> zza(Class<T> cls) {
        zzalh.zza(cls, "messageType");
        zzanb<T> zzanbVar = (zzanb) this.zzc.get(cls);
        if (zzanbVar == null) {
            zzanbVar = this.zzb.zza(cls);
            zzalh.zza(cls, "messageType");
            zzalh.zza(zzanbVar, a.E);
            zzanb<T> zzanbVar2 = (zzanb) this.zzc.putIfAbsent(cls, zzanbVar);
            if (zzanbVar2 != null) {
                return zzanbVar2;
            }
        }
        return zzanbVar;
    }

    public final <T> zzanb<T> zza(T t) {
        return zza((Class) t.getClass());
    }

    private zzamx() {
    }
}
