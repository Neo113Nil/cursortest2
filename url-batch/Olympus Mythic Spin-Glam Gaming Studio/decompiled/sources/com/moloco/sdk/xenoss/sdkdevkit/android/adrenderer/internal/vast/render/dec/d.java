package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec;

import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.h;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.j;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.n;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes3.dex */
public final class d {
    public static final int g = 8;

    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a a;

    @Nullable
    public List<String> b;

    @Nullable
    public List<String> c;

    @Nullable
    public List<String> d;

    @NotNull
    public final h e;

    @NotNull
    public final l f;

    public d(@NotNull com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a customUserEventBuilderService, @Nullable List<String> list, @Nullable List<String> list2, @Nullable List<String> list3, @NotNull h buttonTracker, @NotNull l vastTracker) {
        Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        Intrinsics.checkNotNullParameter(buttonTracker, "buttonTracker");
        Intrinsics.checkNotNullParameter(vastTracker, "vastTracker");
        this.a = customUserEventBuilderService;
        this.b = list;
        this.c = list2;
        this.d = list3;
        this.e = buttonTracker;
        this.f = vastTracker;
    }

    public final void a(@NotNull a.AbstractC1677a.c button) {
        Intrinsics.checkNotNullParameter(button, "button");
        this.e.a(button);
    }

    public final void b() {
        List<String> list = this.d;
        if (list != null) {
            l.a.a(this.f, list, null, null, null, 14, null);
            this.d = null;
        }
    }

    public final void a(@NotNull a.AbstractC1677a.c.EnumC1679a buttonType) {
        Intrinsics.checkNotNullParameter(buttonType, "buttonType");
        this.e.a(buttonType);
    }

    public final void a(@NotNull a.AbstractC1677a.f position) {
        Intrinsics.checkNotNullParameter(position, "position");
        List<String> list = this.b;
        if (list != null) {
            l.a.a(this.f, list, null, null, null, this.e.p(), this.a, position, 14, null);
            this.b = null;
        }
    }

    public /* synthetic */ d(com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar, List list, List list2, List list3, h hVar, l lVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, list, list2, list3, (i & 16) != 0 ? j.a() : hVar, (i & 32) != 0 ? n.b() : lVar);
    }

    public final void a() {
        List<String> list = this.c;
        if (list != null) {
            l.a.a(this.f, list, null, null, null, 14, null);
            this.c = null;
        }
    }
}
