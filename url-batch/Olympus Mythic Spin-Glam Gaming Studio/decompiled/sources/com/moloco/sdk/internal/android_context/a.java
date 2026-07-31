package com.moloco.sdk.internal.android_context;

import android.annotation.SuppressLint;
import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@SuppressLint({"StaticFieldLeak"})
/* loaded from: classes6.dex */
public final class a {

    @NotNull
    public static final a a = new a();
    public static volatile Context b;

    @NotNull
    public final Context a() {
        Context context = b;
        if (context != null) {
            return context;
        }
        Intrinsics.throwUninitializedPropertyAccessException("value");
        return null;
    }

    public final void a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        b = context.getApplicationContext();
    }
}
