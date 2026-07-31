package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.backport.Function;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.File;

/* loaded from: classes11.dex */
public final class Jb implements Function, Consumer {
    @Override // io.appmetrica.analytics.coreapi.internal.backport.Function
    @Nullable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Fb apply(@NonNull File file) {
        String a = AbstractC5409ib.a(file);
        long lastModified = file.lastModified();
        if (!StringUtils.isNullOrEmpty(a)) {
            try {
                return new Fb(a, lastModified);
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void consume(@NonNull File file) {
        try {
            file.delete();
        } catch (Throwable unused) {
        }
    }
}
