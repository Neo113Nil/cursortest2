package kotlin;

import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DeepRecursive.kt */
/* loaded from: classes5.dex */
public abstract class DeepRecursiveKt {
    private static final Object UNDEFINED_RESULT;

    public static final Object invoke(DeepRecursiveFunction deepRecursiveFunction, Object obj) {
        Intrinsics.checkNotNullParameter(deepRecursiveFunction, "<this>");
        return new DeepRecursiveScopeImpl(deepRecursiveFunction.getBlock$kotlin_stdlib(), obj).runCallLoop();
    }

    static {
        Result.Companion companion = Result.INSTANCE;
        UNDEFINED_RESULT = Result.m8023constructorimpl(IntrinsicsKt.getCOROUTINE_SUSPENDED());
    }
}
