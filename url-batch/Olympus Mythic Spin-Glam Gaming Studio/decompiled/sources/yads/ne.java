package yads;

import android.os.Looper;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes3.dex */
public final class ne {
    public static final Object i = new Object();
    public static volatile ne j;
    public final long a;
    public final long b;
    public final Set c;
    public final CoroutineScope d;
    public final be e;
    public final he f;
    public final a20 g = new a20();
    public final AtomicBoolean h = new AtomicBoolean(false);

    public ne(long j2, long j3, Set set, CoroutineScope coroutineScope, be beVar, he heVar, q63 q63Var) {
        this.a = j2;
        this.b = j3;
        this.c = set;
        this.d = coroutineScope;
        this.e = beVar;
        this.f = heVar;
    }

    public static final void a(ne neVar) {
        Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
        StackTraceElement[] stackTraceElementArr = allStackTraces.get(Looper.getMainLooper().getThread());
        if (stackTraceElementArr != null) {
            Set set = s33.a;
            if (s33.a(stackTraceElementArr, neVar.c)) {
                neVar.f.a.b(allStackTraces);
            }
        }
    }
}
