package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.ironsource.n3, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC4781n3 {
    private final int a;

    @NotNull
    private final String b;
    private final boolean c;

    @Nullable
    private final C4702id d;

    public AbstractC4781n3(int i, @NotNull String placementName, boolean z, @Nullable C4702id c4702id) {
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        this.a = i;
        this.b = placementName;
        this.c = z;
        this.d = c4702id;
    }

    @Nullable
    public final C4702id a() {
        return this.d;
    }

    public final int b() {
        return this.a;
    }

    @NotNull
    public final String c() {
        return this.b;
    }

    public final boolean d() {
        return this.c;
    }

    @NotNull
    public String toString() {
        return "placement name: " + this.b;
    }

    public final boolean a(int i) {
        return this.a == i;
    }

    public /* synthetic */ AbstractC4781n3(int i, String str, boolean z, C4702id c4702id, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, str, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? null : c4702id);
    }
}
