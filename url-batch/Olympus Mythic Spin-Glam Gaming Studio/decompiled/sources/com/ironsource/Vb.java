package com.ironsource;

import android.app.Activity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public interface Vb {

    public interface a {
        void a();

        void a(@NotNull D8 d8);

        void a(@NotNull String str);

        void e();
    }

    void a();

    void a(@NotNull Activity activity, @NotNull JSONObject jSONObject);

    void a(@NotNull G8 g8);

    void a(@NotNull Hg hg);

    void a(@Nullable a aVar);

    void a(@NotNull JSONObject jSONObject);

    @Nullable
    a b();

    void c();
}
