package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import android.content.Context;
import android.graphics.Rect;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
/* loaded from: classes12.dex */
public final class s {
    public static final int j = 8;

    @NotNull
    public final Context a;

    @NotNull
    public final Rect b;

    @NotNull
    public final Rect c;

    @NotNull
    public final Rect d;

    @NotNull
    public final Rect e;

    @NotNull
    public final Rect f;

    @NotNull
    public final Rect g;

    @NotNull
    public final Rect h;

    @NotNull
    public final Rect i;

    public s(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.a = applicationContext;
        this.b = new Rect();
        this.c = new Rect();
        this.d = new Rect();
        this.e = new Rect();
        this.f = new Rect();
        this.g = new Rect();
        this.h = new Rect();
        this.i = new Rect();
    }

    public final void a(Rect rect, Rect rect2) {
        a aVar = a.a;
        rect2.set(aVar.f(rect.left, this.a), aVar.f(rect.top, this.a), aVar.f(rect.right, this.a), aVar.f(rect.bottom, this.a));
    }

    public final void b(int i, int i2, int i3, int i4) {
        this.h.set(i, i2, i3 + i, i4 + i2);
        a(this.h, this.i);
    }

    public final void c(int i, int i2, int i3, int i4) {
        this.d.set(i, i2, i3 + i, i4 + i2);
        a(this.d, this.e);
    }

    @NotNull
    public final Rect d() {
        return this.i;
    }

    @NotNull
    public final Rect e() {
        return this.d;
    }

    @NotNull
    public final Rect f() {
        return this.e;
    }

    @NotNull
    public final Rect g() {
        return this.c;
    }

    @NotNull
    public final Rect b() {
        return this.g;
    }

    @NotNull
    public final Rect c() {
        return this.h;
    }

    public final void a(int i, int i2) {
        this.b.set(0, 0, i, i2);
        a(this.b, this.c);
    }

    public final void a(int i, int i2, int i3, int i4) {
        this.f.set(i, i2, i3 + i, i4 + i2);
        a(this.f, this.g);
    }

    @NotNull
    public final Rect a() {
        return this.f;
    }
}
