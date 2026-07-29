package com.onevcat.uniwebview.internal.obfuscated;

import java.util.concurrent.CountDownLatch;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* renamed from: com.onevcat.uniwebview.internal.obfuscated.l1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0048l1 extends Lambda implements Function0 {
    public final /* synthetic */ Ref.ObjectRef a;
    public final /* synthetic */ Lambda b;
    public final /* synthetic */ CountDownLatch c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0048l1(Ref.ObjectRef objectRef, Function0 function0, CountDownLatch countDownLatch) {
        super(0);
        this.a = objectRef;
        this.b = (Lambda) function0;
        this.c = countDownLatch;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.Lambda] */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.a.element = this.b.invoke();
        this.c.countDown();
        return Unit.INSTANCE;
    }
}
