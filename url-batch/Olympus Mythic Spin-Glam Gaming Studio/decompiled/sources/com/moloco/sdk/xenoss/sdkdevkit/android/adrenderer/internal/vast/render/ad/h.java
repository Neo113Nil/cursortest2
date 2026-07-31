package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad;

import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.l;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.n;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes4.dex */
public final class h {
    public static final int e = 8;

    @Nullable
    public List<String> a;

    @Nullable
    public List<String> b;

    @Nullable
    public final List<String> c;

    @NotNull
    public final l d;

    public h(@Nullable List<String> list, @Nullable List<String> list2, @Nullable List<String> list3, @NotNull l vastTracker) {
        Intrinsics.checkNotNullParameter(vastTracker, "vastTracker");
        this.a = list;
        this.b = list2;
        this.c = list3;
        this.d = vastTracker;
    }

    public final void a() {
        List<String> list = this.b;
        if (list != null) {
            l.a.a(this.d, list, null, null, null, 14, null);
            this.b = null;
        }
    }

    public final boolean b() {
        List<String> list = this.a;
        if (list == null) {
            return false;
        }
        l.a.a(this.d, list, null, null, null, 14, null);
        this.a = null;
        return true;
    }

    public static /* synthetic */ void a(h hVar, x xVar, int i, Object obj) {
        if ((i & 1) != 0) {
            xVar = null;
        }
        hVar.a(xVar);
    }

    public final void a(@Nullable x xVar) {
        List<String> list = this.c;
        if (list != null) {
            l.a.a(this.d, list, xVar, null, null, 12, null);
        }
    }

    public /* synthetic */ h(List list, List list2, List list3, l lVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, list3, (i & 8) != 0 ? n.b() : lVar);
    }
}
