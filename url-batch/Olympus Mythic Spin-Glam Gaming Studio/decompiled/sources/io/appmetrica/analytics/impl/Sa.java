package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes9.dex */
public final class Sa extends P2 {
    public Sa(int i) {
        super(i);
    }

    @Override // io.appmetrica.analytics.impl.P2, io.appmetrica.analytics.impl.Ta
    @NonNull
    public final C5318eo a(@Nullable String str) {
        int i = 0;
        if (str != null) {
            int length = str.length();
            int i2 = this.a;
            if (length > i2) {
                String substring = str.substring(0, i2);
                i = str.getBytes().length - substring.getBytes().length;
                str = substring;
            }
        }
        return new C5318eo(str, new C5609q3(i));
    }
}
