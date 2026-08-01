package B;

import a.x;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.profileinstaller.ProfileInstallerInitializer;
import d0.AbstractC0090j;
import d0.RunnableC0087g;
import g.AbstractActivityC0138i;
import java.util.Random;

/* loaded from: classes.dex */
public final /* synthetic */ class o implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f36b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f37c;

    public /* synthetic */ o(Object obj, int i, Object obj2) {
        this.f35a = i;
        this.f36b = obj;
        this.f37c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.f36b;
        Object obj2 = this.f37c;
        switch (this.f35a) {
            case 0:
                ((b) obj).h((Typeface) obj2);
                return;
            case 1:
                AbstractActivityC0138i abstractActivityC0138i = (AbstractActivityC0138i) obj;
                int i = a.l.f1058r;
                abstractActivityC0138i.f1059a.a(new a.f((x) obj2, abstractActivityC0138i));
                return;
            case 2:
                ((ProfileInstallerInitializer) obj).getClass();
                (Build.VERSION.SDK_INT >= 28 ? AbstractC0090j.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new RunnableC0087g((Context) obj2, 0), new Random().nextInt(Math.max(1000, 1)) + 5000);
                return;
            default:
                Runnable runnable = (Runnable) obj2;
                g.m mVar = (g.m) obj;
                mVar.getClass();
                try {
                    runnable.run();
                    return;
                } finally {
                    mVar.a();
                }
        }
    }
}
