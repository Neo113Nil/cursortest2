package com.ironsource;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.ironsource.y4, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C4983y4 implements B4 {
    private final SharedPreferences a;
    private final SharedPreferences.Editor b;

    public C4983y4(@NotNull Context context, @NotNull String fileName) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        SharedPreferences sharedPreferences = context.getSharedPreferences(fileName, 0);
        this.a = sharedPreferences;
        this.b = sharedPreferences.edit();
    }

    @Override // com.ironsource.B4
    @Nullable
    public String a(@NotNull String key, @Nullable String str) {
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            return this.a.getString(key, str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.ironsource.B4
    @NotNull
    public Map<String, ?> allData() {
        Map<String, ?> all = this.a.getAll();
        Intrinsics.checkNotNullExpressionValue(all, "sharedPreferences.all");
        return all;
    }

    @Override // com.ironsource.B4
    public void b(@NotNull String key, @NotNull String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.b.putString(key, value).apply();
    }

    @Override // com.ironsource.B4
    public void a(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.b.remove(key).apply();
    }
}
