package yads;

import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes5.dex */
public abstract class z10 {
    public static void a(CoroutineScope coroutineScope, Function1 function1, Function2 function2) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, EmptyCoroutineContext.INSTANCE, null, new y10(function2, function1, null), 2, null);
    }
}
