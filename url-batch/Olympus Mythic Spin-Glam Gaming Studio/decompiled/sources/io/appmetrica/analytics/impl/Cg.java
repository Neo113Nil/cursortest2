package io.appmetrica.analytics.impl;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes6.dex */
public final class Cg implements Eg {
    public final String a;
    public final Throwable b;

    public Cg(@NotNull String str, @Nullable Throwable th) {
        this.a = str;
        this.b = th;
    }

    @Override // io.appmetrica.analytics.impl.Eg
    @Nullable
    public final C5751vg a() {
        return null;
    }

    @NotNull
    public final String b() {
        return this.a;
    }

    @Nullable
    public final Throwable c() {
        return this.b;
    }

    @NotNull
    public final String toString() {
        return "Failure(message='" + this.a + "', throwable=" + this.b + ')';
    }

    public /* synthetic */ Cg(String str, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : th);
    }
}
