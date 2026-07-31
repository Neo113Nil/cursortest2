package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.UUID;

/* renamed from: io.appmetrica.analytics.impl.j0, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C5423j0 implements Ko {
    @Override // io.appmetrica.analytics.impl.Ko
    public final Io a(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return new Io(this, false, "ApiKey is empty. Please, read official documentation how to obtain one: https://appmetrica.io/docs/mobile-sdk-dg/android/about/android-initialize.html");
        }
        try {
            UUID.fromString(str);
            return new Io(this, true, "");
        } catch (Throwable unused) {
            return new Io(this, false, "Invalid ApiKey=" + str + ". Please, read official documentation how to obtain one: https://appmetrica.io/docs/mobile-sdk-dg/android/about/android-initialize.html");
        }
    }
}
