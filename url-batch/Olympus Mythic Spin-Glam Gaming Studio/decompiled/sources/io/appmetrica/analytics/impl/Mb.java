package io.appmetrica.analytics.impl;

import androidx.annotation.Nullable;

/* loaded from: classes10.dex */
public final class Mb implements Ko {
    @Override // io.appmetrica.analytics.impl.Ko
    public final Io a(@Nullable String str) {
        if (str == null) {
            return new Io(this, false, "key is null");
        }
        if (str.startsWith(Y7.b)) {
            return new Io(this, false, "key starts with appmetrica");
        }
        if (str.length() > 200) {
            return new Io(this, false, "key length more then 200 characters");
        }
        return new Io(this, true, "");
    }
}
