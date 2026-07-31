package com.inmobi.media;

import android.graphics.Rect;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.ko, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4139ko implements InterfaceC4219no {
    public final C4113jo a;
    public final C4529zj b;

    public C4139ko(C4113jo visibilityConfig, C4529zj simpleViewHolder) {
        Intrinsics.checkNotNullParameter(visibilityConfig, "visibilityConfig");
        Intrinsics.checkNotNullParameter(simpleViewHolder, "simpleViewHolder");
        this.a = visibilityConfig;
        this.b = simpleViewHolder;
    }

    @Override // com.inmobi.media.InterfaceC4219no
    public final EnumC4192mo a() {
        C4252p5 c4252p5 = this.b.a;
        Rect rect = new Rect();
        if (!c4252p5.getGlobalVisibleRect(rect)) {
            return EnumC4192mo.a;
        }
        C4113jo c4113jo = this.a;
        return (AbstractC4403uo.a(c4252p5, rect, c4113jo.a, c4113jo.b) && AbstractC4403uo.a(c4252p5, rect, this.a.a, this.b.b)) ? EnumC4192mo.b : EnumC4192mo.a;
    }
}
