package io.appmetrica.analytics.screenshot.impl;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: io.appmetrica.analytics.screenshot.impl.s, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5881s extends Lambda implements Function0 {
    public final /* synthetic */ C5884v a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5881s(C5884v c5884v) {
        super(0);
        this.a = c5884v;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        ((C5886x) this.a.b).a("ContentObserverScreenshotCaptor");
        return Unit.INSTANCE;
    }
}
