package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.Key;
import java.util.Objects;
import javax.crypto.Mac;

/* compiled from: com.google.firebase:firebase-auth@@24.0.1 */
/* loaded from: classes5.dex */
final class zzaad extends ThreadLocal<Mac> {
    private final /* synthetic */ zzaae zza;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.ThreadLocal
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final Mac initialValue() {
        String str;
        Key key;
        try {
            zzzj<zzzw, Mac> zzzjVar = zzzj.zzb;
            str = this.zza.zzc;
            Mac zza = zzzjVar.zza(str);
            key = this.zza.zzd;
            zza.init(key);
            return zza;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }

    zzaad(zzaae zzaaeVar) {
        Objects.requireNonNull(zzaaeVar);
        this.zza = zzaaeVar;
    }
}
