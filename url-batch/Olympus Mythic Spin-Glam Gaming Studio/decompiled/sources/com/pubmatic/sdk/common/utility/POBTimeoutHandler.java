package com.pubmatic.sdk.common.utility;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import com.pubmatic.sdk.common.log.POBLog;
import java.util.ArrayList;

@MainThread
/* loaded from: classes10.dex */
public class POBTimeoutHandler {
    private final POBTimeoutHandlerListener a;
    private final Handler b = new Handler(Looper.getMainLooper());
    private final ArrayList c = new ArrayList(1);
    private Runnable d;

    public interface POBTimeoutHandlerListener {
        @MainThread
        void onTimeout();
    }

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            POBTimeoutHandler.this.a.onTimeout();
        }
    }

    class b implements Runnable {
        final /* synthetic */ long a;

        b(long j) {
            this.a = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            POBTimeoutHandler.this.a.onTimeout();
            if (POBTimeoutHandler.this.c.contains(this)) {
                POBTimeoutHandler.this.a(this.a, this);
            }
        }
    }

    @MainThread
    public POBTimeoutHandler(@NonNull POBTimeoutHandlerListener pOBTimeoutHandlerListener) {
        a();
        this.a = pOBTimeoutHandlerListener;
    }

    @MainThread
    public void cancel() {
        a();
        Runnable runnable = this.d;
        if (runnable != null) {
            this.c.remove(runnable);
            this.b.removeCallbacks(this.d);
        }
        this.d = null;
    }

    @MainThread
    public boolean start(long j) {
        a();
        cancel();
        a aVar = new a();
        this.d = aVar;
        return a(j, aVar);
    }

    @MainThread
    public boolean startAtFixedRate(long j, long j2) {
        a();
        cancel();
        b bVar = new b(j2);
        this.d = bVar;
        return a(j, bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(long j, Runnable runnable) {
        if (j < 0) {
            POBLog.error("POBTimeoutHandler", "Can not start timeout task as provided delay is invalid.", new Object[0]);
            return false;
        }
        this.c.add(runnable);
        return this.b.postDelayed(runnable, j);
    }

    private void a() {
        if (POBUtils.isMainThread()) {
            return;
        }
        POBLog.warn("POBTimeoutHandler", "The API should be called on main thread.", new Object[0]);
    }
}
