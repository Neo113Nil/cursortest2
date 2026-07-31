package yads;

import android.os.Handler;
import android.os.Looper;
import kotlinx.coroutines.CoroutineDispatcher;

/* loaded from: classes5.dex */
public final class be {
    public final CoroutineDispatcher a;
    public final Handler b;

    public be(CoroutineDispatcher coroutineDispatcher) {
        Handler handler = new Handler(Looper.getMainLooper());
        this.a = coroutineDispatcher;
        this.b = handler;
    }
}
