package com.ironsource;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.ironsource.ue, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public interface InterfaceC4921ue {
    static /* synthetic */ void a(InterfaceC4921ue interfaceC4921ue, C4846qe c4846qe, C4608d9 c4608d9, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onInitFailed");
        }
        if ((i & 2) != 0) {
            c4608d9 = null;
        }
        interfaceC4921ue.a(c4846qe, c4608d9);
    }

    void a(@NotNull C4810oe c4810oe);

    void a(@NotNull C4846qe c4846qe, @Nullable C4608d9 c4608d9);
}
