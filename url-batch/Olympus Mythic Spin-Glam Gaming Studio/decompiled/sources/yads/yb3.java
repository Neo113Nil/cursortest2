package yads;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;

/* loaded from: classes4.dex */
public final class yb3 {
    public static final String c = "The Yandex Mobile Ads SDK needs to be updated to the latest version. Details in the logs";
    public final Handler a = new Handler(Looper.getMainLooper());
    public final Context b;

    public yb3(Context context) {
        this.b = context.getApplicationContext();
    }

    public final void a() {
        this.a.post(new Runnable() { // from class: yads.yb3$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                yb3.a(yb3.this);
            }
        });
    }

    public static final void a(yb3 yb3Var) {
        Toast.makeText(yb3Var.b, c, 1).show();
    }
}
