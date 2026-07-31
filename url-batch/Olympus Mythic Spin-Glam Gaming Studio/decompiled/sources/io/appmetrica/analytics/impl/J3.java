package io.appmetrica.analytics.impl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes9.dex */
public final class J3 implements InterfaceC5406i8 {
    public final I3 a;
    public final List b;

    public J3(@NotNull I3 i3, @NotNull List<I3> list) {
        this.a = i3;
        this.b = list;
    }

    @NotNull
    public final J3 a(@NotNull I3 i3, @NotNull List<I3> list) {
        return new J3(i3, list);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5406i8
    public final Object b() {
        return this.a;
    }

    @NotNull
    public final I3 c() {
        return this.a;
    }

    @NotNull
    public final List<I3> d() {
        return this.b;
    }

    @NotNull
    public final I3 e() {
        return this.a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof J3)) {
            return false;
        }
        J3 j3 = (J3) obj;
        return Intrinsics.areEqual(this.a, j3.a) && Intrinsics.areEqual(this.b, j3.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "ClidsInfo(chosen=" + this.a + ", candidates=" + this.b + ')';
    }

    public static J3 a(J3 j3, I3 i3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            i3 = j3.a;
        }
        if ((i & 2) != 0) {
            list = j3.b;
        }
        j3.getClass();
        return new J3(i3, list);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5406i8
    @NotNull
    public final List<I3> a() {
        return this.b;
    }
}
