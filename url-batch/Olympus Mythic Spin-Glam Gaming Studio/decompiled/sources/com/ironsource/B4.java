package com.ironsource;

import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes13.dex */
public interface B4 {
    static /* synthetic */ String a(B4 b4, String str, String str2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getString");
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        return b4.a(str, str2);
    }

    @Nullable
    String a(@NotNull String str, @Nullable String str2);

    void a(@NotNull String str);

    @NotNull
    Map<String, ?> allData();

    void b(@NotNull String str, @NotNull String str2);
}
