package yads;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import kotlin.jvm.functions.Function1;

/* loaded from: classes15.dex */
public abstract class sg1 {
    public static final ConcurrentHashMap a = new ConcurrentHashMap();

    public static final og1 a(Context context, String str) {
        ConcurrentHashMap concurrentHashMap = a;
        final rg1 rg1Var = new rg1(context, str);
        return (og1) concurrentHashMap.computeIfAbsent(str, new Function() { // from class: yads.sg1$$ExternalSyntheticLambda0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return sg1.a(Function1.this, obj);
            }
        });
    }

    public static final og1 a(Function1 function1, Object obj) {
        return (og1) function1.invoke(obj);
    }
}
