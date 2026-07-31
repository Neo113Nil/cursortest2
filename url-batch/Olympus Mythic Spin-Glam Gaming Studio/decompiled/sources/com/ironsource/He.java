package com.ironsource;

import android.content.Context;
import com.ironsource.We;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes12.dex */
public interface He {
    static /* synthetic */ void a(He he, Runnable runnable, long j, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postOnUIThread");
        }
        if ((i & 2) != 0) {
            j = 0;
        }
        he.a(runnable, j);
    }

    @Nullable
    We a(@NotNull Context context, @NotNull String str);

    @NotNull
    InterfaceC4986y7 a();

    @NotNull
    String a(@NotNull Context context);

    void a(long j, @NotNull We.a aVar);

    void a(@NotNull Ee ee);

    void a(@NotNull F1 f1);

    void a(@NotNull Runnable runnable);

    void a(@NotNull Runnable runnable, long j);

    void a(@NotNull String str, @NotNull String str2);

    void b();

    void b(@NotNull Runnable runnable);

    boolean b(@NotNull Context context);

    @Nullable
    C4573ba c();

    @NotNull
    String c(@NotNull Context context);

    void c(@NotNull Runnable runnable);

    void d(@NotNull Runnable runnable);

    boolean d();

    void e();

    void f();

    @NotNull
    U9 g();
}
