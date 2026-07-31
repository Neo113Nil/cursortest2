package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* renamed from: io.appmetrica.analytics.impl.qn, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C5629qn implements Lo {
    @Override // io.appmetrica.analytics.impl.Lo
    @NonNull
    public final byte[] a(@NonNull C5381h9 c5381h9, @NonNull C5804xh c5804xh) {
        return !TextUtils.isEmpty(c5381h9.b) ? StringUtils.getUTF8Bytes(c5381h9.b) : new byte[0];
    }
}
