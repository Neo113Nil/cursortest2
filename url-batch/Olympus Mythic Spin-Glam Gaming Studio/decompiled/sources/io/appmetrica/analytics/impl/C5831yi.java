package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.yi, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5831yi implements Ko {
    public final Map a;

    public C5831yi(@NonNull Map<String, ?> map) {
        this.a = map;
    }

    @Override // io.appmetrica.analytics.impl.Ko
    public final Io a(@Nullable String str) {
        return this.a.containsKey(str) ? new Io(this, false, String.format("Failed to activate AppMetrica with provided apiKey ApiKey %s has already been used by another reporter.", str)) : new Io(this, true, "");
    }
}
