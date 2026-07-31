package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* renamed from: com.inmobi.media.rl, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4320rl {
    public static void a(boolean z) {
        AbstractC4002fj.d.set(z);
        if (z) {
            ((Kc) AbstractC4002fj.e.getValue()).b(new N2(101, 6, (String) null));
        } else {
            ((Kc) AbstractC4002fj.e.getValue()).b(new N2(102, 6, (String) null));
        }
        C4294ql runnable = new C4294ql(z, null);
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        BuildersKt__Builders_commonKt.launch$default(AbstractC4002fj.h, null, null, new C3976ej(runnable, null), 3, null);
    }
}
