package yads;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes14.dex */
public abstract class jv3 extends AsyncTask {
    public pv3 a;
    public final iv3 b;

    public jv3(iv3 iv3Var) {
        this.b = iv3Var;
    }

    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        pv3 pv3Var = this.a;
        if (pv3Var != null) {
            pv3Var.c = null;
            pv3Var.a();
        }
    }

    public final void a(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}
