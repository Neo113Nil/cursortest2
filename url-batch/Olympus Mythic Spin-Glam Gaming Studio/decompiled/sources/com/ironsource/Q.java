package com.ironsource;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* loaded from: classes.dex */
public interface Q {

    public interface a {
        void a(@NotNull P p);

        void a(@NotNull EnumC4796o0 enumC4796o0, @NotNull String str);

        void a(@NotNull JSONObject jSONObject, @NotNull EnumC4796o0 enumC4796o0, @NotNull String str);
    }

    @Nullable
    P a(@NotNull String str);

    @NotNull
    List<P> a();
}
