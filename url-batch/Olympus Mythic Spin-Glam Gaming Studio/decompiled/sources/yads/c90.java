package yads;

import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* loaded from: classes15.dex */
public final class c90 {
    public final ng1 a;
    public final en2 b;
    public final a60 c;
    public final CoroutineDispatcher d;
    public s80 e;
    public final Mutex f = MutexKt.Mutex$default(false, 1, null);

    public c90(ng1 ng1Var, en2 en2Var, a60 a60Var, CoroutineDispatcher coroutineDispatcher) {
        this.a = ng1Var;
        this.b = en2Var;
        this.c = a60Var;
        this.d = coroutineDispatcher;
    }
}
