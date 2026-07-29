package com.onevcat.uniwebview.internal.obfuscated;

import com.onevcat.uniwebview.UniWebViewInterface;
import com.onevcat.uniwebview.UniWebViewNativeChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.onevcat.uniwebview.internal.obfuscated.f1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0024f1 extends Lambda implements Function0 {
    public final /* synthetic */ UniWebViewNativeChannel a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0024f1(y2 y2Var, UniWebViewNativeChannel uniWebViewNativeChannel) {
        super(0);
        this.a = uniWebViewNativeChannel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        UniWebViewInterface.channel = this.a;
        return Unit.INSTANCE;
    }
}
