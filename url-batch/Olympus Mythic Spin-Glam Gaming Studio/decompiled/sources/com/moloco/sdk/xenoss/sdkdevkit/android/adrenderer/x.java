package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer;

import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.internal.ortb.model.C5019a;
import com.moloco.sdk.internal.ortb.model.C5020b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.Q;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes4.dex */
public final class x implements c {
    public static final int k = 0;
    public final boolean a;

    @Nullable
    public final Boolean b;
    public final int c;
    public final int d;
    public final int e;
    public final boolean f;
    public final boolean g;

    @NotNull
    public final Function2 h;

    @Nullable
    public final C5019a i;

    @Nullable
    public final C5020b j;

    public x() {
        this(false, null, 0, 0, 0, false, false, null, null, null, 1023, null);
    }

    @Nullable
    public final C5019a a() {
        return this.i;
    }

    @Nullable
    public final C5020b b() {
        return this.j;
    }

    public final boolean c() {
        return this.g;
    }

    public final boolean d() {
        return this.f;
    }

    public final int e() {
        return this.d;
    }

    public final int f() {
        return this.e;
    }

    @Nullable
    public final Boolean g() {
        return this.b;
    }

    public final int h() {
        return this.c;
    }

    public final boolean i() {
        return this.a;
    }

    @NotNull
    public final Function2 j() {
        return this.h;
    }

    public x(boolean z, @Nullable Boolean bool, int i, int i2, int i3, boolean z2, boolean z3, @NotNull Function2 VastRenderer, @Nullable C5019a c5019a, @Nullable C5020b c5020b) {
        Intrinsics.checkNotNullParameter(VastRenderer, "VastRenderer");
        this.a = z;
        this.b = bool;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = z2;
        this.g = z3;
        this.h = VastRenderer;
        this.i = c5019a;
        this.j = c5020b;
    }

    public /* synthetic */ x(boolean z, Boolean bool, int i, int i2, int i3, boolean z2, boolean z3, Function2 function2, C5019a c5019a, C5020b c5020b, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? true : z, (i4 & 2) != 0 ? null : bool, (i4 & 4) != 0 ? 5 : i, (i4 & 8) != 0 ? 5 : i2, (i4 & 16) == 0 ? i3 : 5, (i4 & 32) != 0 ? false : z2, (i4 & 64) == 0 ? z3 : false, (i4 & 128) != 0 ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.x.a(0L, (Function2) null, (Function2) null, (Function2) null, (Function2) null, (Function2) null, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.o) null, (Function2) null, (Function2) null, (Function2) null, (Q) null, false, 4095, (Object) null) : function2, (i4 & 256) != 0 ? null : c5019a, (i4 & 512) == 0 ? c5020b : null);
    }
}
