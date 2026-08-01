package B;

import a.x;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.profileinstaller.ProfileInstallerInitializer;
import androidx.room.A;
import g.AbstractActivityC0129i;
import java.util.Random;

/* loaded from: classes.dex */
public final /* synthetic */ class o implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f79a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f80b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f81c;

    public /* synthetic */ o(Object obj, int i, Object obj2) {
        this.f79a = i;
        this.f80b = obj;
        this.f81c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.f80b;
        Object obj2 = this.f81c;
        switch (this.f79a) {
            case 0:
                ((b) obj).h((Typeface) obj2);
                return;
            case 1:
                AbstractActivityC0129i abstractActivityC0129i = (AbstractActivityC0129i) obj;
                int i = a.l.f1582r;
                abstractActivityC0129i.f1583a.a(new a.f((x) obj2, abstractActivityC0129i));
                return;
            case 2:
                Runnable runnable = (Runnable) obj;
                i1.f.e(runnable, "$command");
                i1.f.e((A) obj2, "this$0");
                try {
                    runnable.run();
                    return;
                } finally {
                }
            case 3:
                ((ProfileInstallerInitializer) obj).getClass();
                (Build.VERSION.SDK_INT >= 28 ? e0.j.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new e0.g((Context) obj2, 0), new Random().nextInt(Math.max(1000, 1)) + 5000);
                return;
            default:
                Runnable runnable2 = (Runnable) obj2;
                ((A) obj).getClass();
                try {
                    runnable2.run();
                    return;
                } finally {
                }
        }
    }
}
