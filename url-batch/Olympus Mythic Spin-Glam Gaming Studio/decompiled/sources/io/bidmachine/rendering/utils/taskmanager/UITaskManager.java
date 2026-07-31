package io.bidmachine.rendering.utils.taskmanager;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes5.dex */
public class UITaskManager extends SingleThreadTaskManager {
    private static final Handler a = new Handler(Looper.getMainLooper());

    @Override // io.bidmachine.rendering.utils.taskmanager.SingleThreadTaskManager
    protected Handler a() {
        return a;
    }
}
