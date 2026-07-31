package yads;

import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.CompletableDeferred;

/* loaded from: classes4.dex */
public final class v0 {
    public static final Object c = new Object();
    public static volatile v0 d;
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public final vx0 b = new vx0();

    public final void a(d8 d8Var, Object obj) {
        CompletableDeferred completableDeferred = (CompletableDeferred) this.a.remove(this.b.a(d8Var));
        if (completableDeferred != null) {
            completableDeferred.complete(obj);
        }
    }
}
