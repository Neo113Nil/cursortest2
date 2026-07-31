package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.regex.Pattern;

/* compiled from: com.google.firebase:firebase-auth@@24.0.1 */
/* loaded from: classes5.dex */
final class zzs implements zzq {
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzq
    public final zzl zza(String str) {
        return new zzo(Pattern.compile(str));
    }

    private zzs() {
    }
}
