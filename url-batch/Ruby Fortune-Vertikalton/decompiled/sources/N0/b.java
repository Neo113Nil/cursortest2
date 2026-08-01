package N0;

import B0.d;
import T.i;
import T.q;
import T.r;
import X0.e;
import android.content.Context;
import android.content.SharedPreferences;
import com.punchtowin.balls.MainActivity;
import java.util.concurrent.ThreadPoolExecutor;
import q1.l;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f614a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f615b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f616c;
    public final /* synthetic */ Object d;

    public /* synthetic */ b(Object obj, Object obj2, Object obj3, int i) {
        this.f614a = i;
        this.f615b = obj;
        this.f616c = obj2;
        this.d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f614a) {
            case 0:
                String str = (String) this.f615b;
                String str2 = (String) this.f616c;
                boolean a2 = e.a(str, str2);
                MainActivity mainActivity = (MainActivity) this.d;
                if (a2) {
                    int i = MainActivity.f1861D;
                    mainActivity.w();
                    return;
                }
                SharedPreferences sharedPreferences = mainActivity.f1863B;
                if (sharedPreferences == null) {
                    e.h("prefs");
                    throw null;
                }
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putString(mainActivity.f1862A, str2);
                edit.apply();
                mainActivity.f1864C = str2;
                mainActivity.x(str2);
                return;
            default:
                d dVar = (d) this.f615b;
                q1.d dVar2 = (q1.d) this.f616c;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.d;
                dVar.getClass();
                try {
                    r o2 = l.o((Context) dVar.f59b);
                    if (o2 == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    q qVar = (q) ((i) o2.f714b);
                    synchronized (qVar.d) {
                        qVar.f737f = threadPoolExecutor;
                    }
                    ((i) o2.f714b).l(new T.l(dVar2, threadPoolExecutor));
                    return;
                } catch (Throwable th) {
                    dVar2.b0(th);
                    threadPoolExecutor.shutdown();
                    return;
                }
        }
    }
}
