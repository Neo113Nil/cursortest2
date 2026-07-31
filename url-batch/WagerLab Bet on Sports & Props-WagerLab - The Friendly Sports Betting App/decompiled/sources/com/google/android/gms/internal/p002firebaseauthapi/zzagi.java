package com.google.android.gms.internal.p002firebaseauthapi;

import com.amazon.a.a.o.b;

/* compiled from: com.google.firebase:firebase-auth@@24.0.1 */
/* loaded from: classes5.dex */
public final class zzagi {
    public static String zza(String str) {
        try {
            Object invoke = Class.forName(b.at).getDeclaredMethod(b.au, String.class).invoke(null, str);
            if (invoke instanceof String) {
                return (String) invoke;
            }
        } catch (Exception unused) {
        }
        return null;
    }
}
