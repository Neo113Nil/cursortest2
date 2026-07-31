package com.ogury.ad.internal;

import com.ogury.core.internal.LogTag;
import com.ogury.core.internal.Logger;
import com.ogury.core.internal.SourceTag;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
public final class t8 extends Lambda implements Function0 {
    public static final t8 a = new t8();

    public t8() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        Logger.INSTANCE.d(LogTag.INTERNAL, SourceTag.ADS, "callUrlUsingGet");
        return Unit.INSTANCE;
    }
}
