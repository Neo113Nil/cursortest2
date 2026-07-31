package com.ironsource;

import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes12.dex */
public final class L1 {

    @NotNull
    private final Map<String, String> a;

    /* JADX WARN: Multi-variable type inference failed */
    public L1() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @NotNull
    public final Map<String, String> a() {
        return this.a;
    }

    @NotNull
    public final Map<String, String> b() {
        return this.a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof L1) && Intrinsics.areEqual(this.a, ((L1) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    @NotNull
    public String toString() {
        return "ApplicationExternalSettings(mediationTypes=" + this.a + ")";
    }

    public L1(@NotNull Map<String, String> mediationTypes) {
        Intrinsics.checkNotNullParameter(mediationTypes, "mediationTypes");
        this.a = mediationTypes;
    }

    @NotNull
    public final L1 a(@NotNull Map<String, String> mediationTypes) {
        Intrinsics.checkNotNullParameter(mediationTypes, "mediationTypes");
        return new L1(mediationTypes);
    }

    public /* synthetic */ L1(Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? MapsKt.emptyMap() : map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ L1 a(L1 l1, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = l1.a;
        }
        return l1.a(map);
    }
}
