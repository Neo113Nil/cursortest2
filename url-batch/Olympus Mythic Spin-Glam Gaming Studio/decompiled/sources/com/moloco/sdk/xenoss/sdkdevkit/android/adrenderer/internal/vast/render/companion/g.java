package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion;

import androidx.compose.runtime.internal.StabilityInferred;
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
/* loaded from: classes8.dex */
public final class g {
    public static final int f = 8;

    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a a;

    @Nullable
    public List<String> b;

    @Nullable
    public List<String> c;

    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.h d;

    @NotNull
    public final l e;

    public g(@NotNull com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a customUserEventBuilderService, @Nullable List<String> list, @Nullable List<String> list2, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.h buttonTracker, @NotNull l vastTracker) {
        Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        Intrinsics.checkNotNullParameter(buttonTracker, "buttonTracker");
        Intrinsics.checkNotNullParameter(vastTracker, "vastTracker");
        this.a = customUserEventBuilderService;
        this.b = list;
        this.c = list2;
        this.d = buttonTracker;
        this.e = vastTracker;
    }

    public final void a(@NotNull a.AbstractC1677a.c button) {
        Intrinsics.checkNotNullParameter(button, "button");
        this.d.a(button);
    }

    public final void a(@NotNull a.AbstractC1677a.c.EnumC1679a buttonType) {
        Intrinsics.checkNotNullParameter(buttonType, "buttonType");
        this.d.a(buttonType);
    }

    public final void a(@NotNull a.AbstractC1677a.f lastClickPosition) {
        Intrinsics.checkNotNullParameter(lastClickPosition, "lastClickPosition");
        List<String> list = this.b;
        if (list != null) {
            l.a.a(this.e, list, null, null, null, this.d.p(), this.a, lastClickPosition, 14, null);
            this.b = null;
        }
    }

    public /* synthetic */ g(com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar, List list, List list2, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.h hVar, l lVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, list, list2, (i & 8) != 0 ? j.a() : hVar, (i & 16) != 0 ? n.b() : lVar);
    }

    public final void a() {
        List<String> list = this.c;
        if (list != null) {
            l.a.a(this.e, list, null, null, null, 14, null);
            this.c = null;
        }
    }
}
