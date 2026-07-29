package com.onevcat.uniwebview.internal.obfuscated;

import java.util.concurrent.CountDownLatch;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* renamed from: com.onevcat.uniwebview.internal.obfuscated.m1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0052m1 extends Lambda implements Function1 {
    public final /* synthetic */ Ref.ObjectRef a;
    public final /* synthetic */ Lambda b;
    public final /* synthetic */ CountDownLatch c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0052m1(Ref.ObjectRef objectRef, Function1 function1, CountDownLatch countDownLatch) {
        super(1);
        this.a = objectRef;
        this.b = (Lambda) function1;
        this.c = countDownLatch;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    /* JADX WARN: Type inference failed for: r3v2, types: [T, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C0031h0 it = (C0031h0) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        this.a.element = this.b.invoke(it);
        this.c.countDown();
        return Unit.INSTANCE;
    }
}
