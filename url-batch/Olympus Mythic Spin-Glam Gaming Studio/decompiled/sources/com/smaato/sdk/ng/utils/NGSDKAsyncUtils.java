package com.smaato.sdk.ng.utils;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* loaded from: classes10.dex */
public class NGSDKAsyncUtils {
    private static final String a = "NGSDKAsyncUtils";
    private static final Executor b = AsyncTask.THREAD_POOL_EXECUTOR;
    private static final Handler c = new Handler(Looper.getMainLooper());

    class a implements Runnable {
        final /* synthetic */ AsyncTask a;
        final /* synthetic */ Object[] b;

        a(AsyncTask asyncTask, Object[] objArr) {
            this.a = asyncTask;
            this.b = objArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.executeOnExecutor(NGSDKAsyncUtils.b, this.b);
        }
    }

    @SafeVarargs
    public static <P> void safeExecuteOnExecutor(AsyncTask<P, ?, ?> asyncTask, P... pArr) {
        if (asyncTask == null) {
            Logger.e(a, "Error executing an AsyncTask that is null.");
        } else if (Looper.getMainLooper() == Looper.myLooper()) {
            asyncTask.executeOnExecutor(b, pArr);
        } else {
            Logger.d(a, "Posting task for execution on main thread.");
            c.post(new a(asyncTask, pArr));
        }
    }
}
