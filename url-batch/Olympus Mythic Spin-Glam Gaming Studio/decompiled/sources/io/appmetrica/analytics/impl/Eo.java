package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.internal.IdentifiersResult;

/* loaded from: classes10.dex */
public final class Eo implements InterfaceC5434jb {
    @Override // io.appmetrica.analytics.impl.InterfaceC5434jb
    @Nullable
    public final String a(@NonNull Context context) {
        IdentifiersResult q = C5661s4.l().b(context).q();
        if (StringUtils.isNullOrEmpty(q.id)) {
            return null;
        }
        return q.id;
    }
}
