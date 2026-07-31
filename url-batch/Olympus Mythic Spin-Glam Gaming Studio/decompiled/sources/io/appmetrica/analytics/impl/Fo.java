package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes10.dex */
public final class Fo implements InterfaceC5434jb {
    @Override // io.appmetrica.analytics.impl.InterfaceC5434jb
    @Nullable
    public final String a(@NotNull Context context) {
        Am am;
        try {
            InterfaceC5395hn a = C5369gn.a(Am.class);
            if (a != null) {
                AbstractC5420in abstractC5420in = (AbstractC5420in) a;
                ProtobufStateStorage<Object> a2 = abstractC5420in.a(context, abstractC5420in.a(context));
                if (a2 != null && (am = (Am) a2.read()) != null) {
                    return am.a;
                }
            }
        } catch (Throwable unused) {
        }
        return null;
    }
}
