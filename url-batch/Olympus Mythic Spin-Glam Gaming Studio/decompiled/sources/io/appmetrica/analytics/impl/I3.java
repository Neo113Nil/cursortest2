package io.appmetrica.analytics.impl;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes10.dex */
public final class I3 implements InterfaceC5509m8 {
    public final Map a;
    public final EnumC5483l8 b;

    public I3(@Nullable Map<String, String> map, @NotNull EnumC5483l8 enumC5483l8) {
        this.a = map;
        this.b = enumC5483l8;
    }

    @NotNull
    public final I3 a(@Nullable Map<String, String> map, @NotNull EnumC5483l8 enumC5483l8) {
        return new I3(map, enumC5483l8);
    }

    @Nullable
    public final Map<String, String> b() {
        return this.a;
    }

    @NotNull
    public final EnumC5483l8 c() {
        return this.b;
    }

    @Nullable
    public final Map<String, String> d() {
        return this.a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I3)) {
            return false;
        }
        I3 i3 = (I3) obj;
        return Intrinsics.areEqual(this.a, i3.a) && this.b == i3.b;
    }

    public final int hashCode() {
        Map map = this.a;
        return this.b.hashCode() + ((map == null ? 0 : map.hashCode()) * 31);
    }

    @NotNull
    public final String toString() {
        return "Candidate(clids=" + this.a + ", source=" + this.b + ')';
    }

    public static I3 a(I3 i3, Map map, EnumC5483l8 enumC5483l8, int i, Object obj) {
        if ((i & 1) != 0) {
            map = i3.a;
        }
        if ((i & 2) != 0) {
            enumC5483l8 = i3.b;
        }
        i3.getClass();
        return new I3(map, enumC5483l8);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5509m8
    @NotNull
    public final EnumC5483l8 a() {
        return this.b;
    }
}
