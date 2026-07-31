package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.ironsource.va, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public abstract class AbstractC4935va {

    @NotNull
    private final C4814p0 a;

    @NotNull
    private String b;
    private boolean c;

    public AbstractC4935va(@NotNull C4814p0 adTools) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        this.a = adTools;
        this.b = "";
    }

    @NotNull
    public final C4814p0 a() {
        return this.a;
    }

    @NotNull
    public final String b() {
        return this.b;
    }

    protected final boolean c() {
        return this.c;
    }

    public abstract boolean d();

    public final void a(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.b = str;
    }

    public final void b(@NotNull Runnable callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.a.d(callback);
    }

    protected final void a(boolean z) {
        this.c = z;
    }

    public final void a(@NotNull Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        this.a.c(runnable);
    }

    public final void a(@NotNull C4671h0 adProperties) {
        Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        this.a.f().a(new D0(this.a, adProperties, null, 4, null));
    }
}
