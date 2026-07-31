package yads;

import android.os.Handler;
import android.os.Looper;
import com.monetization.ads.core.utils.CallbackStackTraceMarker;

/* loaded from: classes12.dex */
public final class vh3 implements gi3 {
    public final Handler a = new Handler(Looper.getMainLooper());
    public pu3 b;

    public static final void a(vh3 vh3Var) {
        pu3 pu3Var = vh3Var.b;
        if (pu3Var != null) {
            new CallbackStackTraceMarker(new ou3(pu3Var));
        }
    }

    @Override // yads.gi3
    public final void onVideoComplete() {
        this.a.post(new Runnable() { // from class: yads.vh3$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                vh3.a(vh3.this);
            }
        });
    }
}
