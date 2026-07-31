package yads;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes4.dex */
public final class tp {
    public final ExecutorService a;
    public final aq b;
    public final Handler c;

    public tp() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        aq aqVar = new aq();
        Handler handler = new Handler(Looper.getMainLooper());
        this.a = newSingleThreadExecutor;
        this.b = aqVar;
        this.c = handler;
    }
}
