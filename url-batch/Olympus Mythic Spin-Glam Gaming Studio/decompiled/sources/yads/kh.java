package yads;

import android.content.Context;
import android.os.Build;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.SupervisorKt;

/* loaded from: classes4.dex */
public abstract class kh {
    public static final AtomicBoolean a = new AtomicBoolean(false);
    public static volatile ih b;

    public static void a(Context context, mt1 mt1Var) {
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default(null, 1, null).plus(Dispatchers.getIO()).plus(new b20(mt1Var)));
        if (Build.VERSION.SDK_INT >= 30 && !a.getAndSet(true)) {
            BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new jh(context, mt1Var, CoroutineScope, null), 3, null);
        }
    }
}
