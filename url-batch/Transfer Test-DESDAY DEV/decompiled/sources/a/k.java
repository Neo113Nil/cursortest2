package a;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.activity.ComponentActivity;

/* loaded from: classes.dex */
public final class k extends g1.g implements f1.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1201b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ComponentActivity f1202c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(ComponentActivity componentActivity, int i) {
        super(0);
        this.f1201b = i;
        this.f1202c = componentActivity;
    }

    @Override // f1.a
    public final Object c() {
        ComponentActivity componentActivity = this.f1202c;
        switch (this.f1201b) {
            case 0:
                componentActivity.reportFullyDrawn();
                return U0.i.f870a;
            case 1:
                return new m(componentActivity.f1241f, new k(componentActivity, 0));
            default:
                w wVar = new w(new d(componentActivity, 1));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (g1.f.a(Looper.myLooper(), Looper.getMainLooper())) {
                        int i = ComponentActivity.f1237r;
                        componentActivity.getClass();
                        componentActivity.f1436a.a(new f(wVar, componentActivity));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new B.o(componentActivity, 1, wVar));
                    }
                }
                return wVar;
        }
    }
}
