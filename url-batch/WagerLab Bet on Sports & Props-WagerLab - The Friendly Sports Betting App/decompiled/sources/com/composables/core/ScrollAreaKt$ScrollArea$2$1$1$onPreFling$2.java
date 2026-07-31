package com.composables.core;

import androidx.compose.ui.unit.Velocity;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ScrollArea.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
/* synthetic */ class ScrollAreaKt$ScrollArea$2$1$1$onPreFling$2 extends FunctionReferenceImpl implements Function2<Velocity, Continuation<? super Velocity>, Object>, SuspendFunction {
    ScrollAreaKt$ScrollArea$2$1$1$onPreFling$2(Object obj) {
        super(2, obj, Intrinsics.Kotlin.class, "suspendConversion0", "onPreFling_QWom1Mo$suspendConversion0(Lkotlin/jvm/functions/Function1;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Velocity velocity, Continuation<? super Velocity> continuation) {
        return m9406invokeQWom1Mo(velocity.getPackedValue(), continuation);
    }

    /* renamed from: invoke-QWom1Mo, reason: not valid java name */
    public final Object m9406invokeQWom1Mo(long j, Continuation<? super Velocity> continuation) {
        Object onPreFling_QWom1Mo$suspendConversion0;
        onPreFling_QWom1Mo$suspendConversion0 = ScrollAreaKt$ScrollArea$2$1$1.onPreFling_QWom1Mo$suspendConversion0((Function1) this.receiver, j, continuation);
        return onPreFling_QWom1Mo$suspendConversion0;
    }
}
