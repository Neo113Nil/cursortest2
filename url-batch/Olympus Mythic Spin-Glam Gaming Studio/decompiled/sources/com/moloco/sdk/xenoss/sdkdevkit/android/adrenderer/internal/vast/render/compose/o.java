package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes4.dex */
public final class o {
    public static final int d = 0;

    @Nullable
    public final Function0 a;

    @Nullable
    public final Function0 b;

    @Nullable
    public final Function0 c;

    public o() {
        this(null, null, null, 7, null);
    }

    @Nullable
    public final Function0 a() {
        return this.b;
    }

    @Nullable
    public final Function0 b() {
        return this.c;
    }

    @Nullable
    public final Function0 c() {
        return this.a;
    }

    public o(@Nullable Function0 function0, @Nullable Function0 function02, @Nullable Function0 function03) {
        this.a = function0;
        this.b = function02;
        this.c = function03;
    }

    public /* synthetic */ o(Function0 function0, Function0 function02, Function0 function03, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function0, (i & 2) != 0 ? null : function02, (i & 4) != 0 ? null : function03);
    }
}
