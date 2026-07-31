package com.google.android.gms.internal.p002firebaseauthapi;

import com.amazon.a.a.o.b.f;

/* compiled from: com.google.firebase:firebase-auth@@24.0.1 */
/* loaded from: classes5.dex */
final class zzan {
    private final Object zza;
    private final Object zzb;
    private final Object zzc;

    final IllegalArgumentException zza() {
        return new IllegalArgumentException("Multiple entries with same key: " + String.valueOf(this.zza) + f.b + String.valueOf(this.zzb) + " and " + String.valueOf(this.zza) + f.b + String.valueOf(this.zzc));
    }

    zzan(Object obj, Object obj2, Object obj3) {
        this.zza = obj;
        this.zzb = obj2;
        this.zzc = obj3;
    }
}
