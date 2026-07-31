package io.appmetrica.analytics.impl;

import android.util.Base64;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* renamed from: io.appmetrica.analytics.impl.gg, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C5362gg implements Lo, R8 {
    @Override // io.appmetrica.analytics.impl.R8
    public final int a(@NonNull EnumC5252c9 enumC5252c9) {
        return 2;
    }

    @Override // io.appmetrica.analytics.impl.Lo
    @NonNull
    public final byte[] a(@NonNull C5381h9 c5381h9, @NonNull C5804xh c5804xh) {
        return StringUtils.isNullOrEmpty(c5381h9.b) ? new byte[0] : Base64.decode(c5381h9.b, 0);
    }
}
