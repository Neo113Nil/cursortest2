package com.inmobi.media;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__BuildersKt;

/* loaded from: classes11.dex */
public final class B3 implements InterfaceC4355t3 {
    @Override // com.inmobi.media.InterfaceC4355t3
    public final void a(Z2 click) {
        Intrinsics.checkNotNullParameter(click, "click");
        E3 e3 = E3.a;
        Intrinsics.checkNotNullExpressionValue("E3", "access$getTAG$p(...)");
        String str = click.b;
        LinkedHashMap linkedHashMap = E3.j;
        C3851a0 c3851a0 = (C3851a0) linkedHashMap.get(Integer.valueOf(click.a));
        if (c3851a0 != null) {
            Intrinsics.checkNotNullParameter(click, "click");
            c3851a0.a.a(c3851a0.b);
        }
        linkedHashMap.remove(Integer.valueOf(click.a));
        BuildersKt__BuildersKt.runBlocking$default(null, new A3(click, null), 1, null);
    }

    @Override // com.inmobi.media.InterfaceC4355t3
    public final void a(Z2 click, EnumC4069i6 errorCode) {
        Intrinsics.checkNotNullParameter(click, "click");
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        E3 e3 = E3.a;
        Intrinsics.checkNotNullExpressionValue("E3", "access$getTAG$p(...)");
        String str = click.b;
        if (click.f == 0) {
            E3.a(click, errorCode.name());
        }
        E3.b(click);
        E3.f();
    }
}
