package yads;

import android.content.Context;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* loaded from: classes3.dex */
public final class mf {
    public static final /* synthetic */ int $r8$clinit = 0;
    public static final long f = TimeUnit.SECONDS.toMillis(30);
    public final pf a;
    public final bg b;
    public final CoroutineScope c;
    public volatile jf d;
    public final Mutex e;

    public mf(Context context) {
        pf pfVar = new pf();
        bg a = gf.a(context);
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default(null, 1, null).plus(Dispatchers.getIO()).plus(new a20()));
        this.a = pfVar;
        this.b = a;
        this.c = CoroutineScope;
        this.e = MutexKt.Mutex(false);
    }
}
