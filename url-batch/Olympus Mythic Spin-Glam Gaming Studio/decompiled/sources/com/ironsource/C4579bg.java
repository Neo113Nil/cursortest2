package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.ironsource.bg, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4579bg {

    @Nullable
    private String a;

    /* JADX WARN: Multi-variable type inference failed */
    public C4579bg() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Nullable
    public final String a() {
        return this.a;
    }

    @Nullable
    public final String b() {
        return this.a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4579bg) && Intrinsics.areEqual(this.a, ((C4579bg) obj).a);
    }

    public int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @NotNull
    public String toString() {
        return "TestSuiteSettings(controllerUrl=" + this.a + ")";
    }

    public C4579bg(@Nullable String str) {
        this.a = str;
    }

    @NotNull
    public final C4579bg a(@Nullable String str) {
        return new C4579bg(str);
    }

    public final void b(@Nullable String str) {
        this.a = str;
    }

    public /* synthetic */ C4579bg(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }

    public static /* synthetic */ C4579bg a(C4579bg c4579bg, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c4579bg.a;
        }
        return c4579bg.a(str);
    }
}
