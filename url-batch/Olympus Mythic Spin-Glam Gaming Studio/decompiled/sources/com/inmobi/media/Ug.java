package com.inmobi.media;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* loaded from: classes12.dex */
public abstract class Ug {
    public static final void a(Rg priority, Function1 block) {
        Intrinsics.checkNotNullParameter(priority, "priority");
        Intrinsics.checkNotNullParameter(block, "block");
        int ordinal = priority.ordinal();
        if (ordinal == 0) {
            BuildersKt__Builders_commonKt.launch$default(L9.d, null, null, new Sg(block, null), 3, null);
        } else {
            if (ordinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            BuildersKt__Builders_commonKt.launch$default(L9.c, null, null, new Tg(block, null), 3, null);
        }
    }
}
