package com.ironsource;

import com.ironsource.C4849r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes.dex */
public final class J {

    @NotNull
    private C4849r0.a a;

    public J(@NotNull C4849r0.a performance) {
        Intrinsics.checkNotNullParameter(performance, "performance");
        this.a = performance;
    }

    @NotNull
    public final C4849r0.a a() {
        return this.a;
    }

    @NotNull
    public final C4849r0.a b() {
        return this.a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof J) && this.a == ((J) obj).a;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    @NotNull
    public String toString() {
        return "AdInstancePerformance(performance=" + this.a + ")";
    }

    @NotNull
    public final J a(@NotNull C4849r0.a performance) {
        Intrinsics.checkNotNullParameter(performance, "performance");
        return new J(performance);
    }

    public final void b(@NotNull C4849r0.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.a = aVar;
    }

    public static /* synthetic */ J a(J j, C4849r0.a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            aVar = j.a;
        }
        return j.a(aVar);
    }
}
