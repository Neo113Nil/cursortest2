package a;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import g.AbstractActivityC0138i;

/* loaded from: classes.dex */
public final class k extends X0.e implements W0.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1056b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0138i f1057c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(AbstractActivityC0138i abstractActivityC0138i, int i) {
        super(0);
        this.f1056b = i;
        this.f1057c = abstractActivityC0138i;
    }

    @Override // W0.a
    public final Object a() {
        switch (this.f1056b) {
            case 0:
                this.f1057c.reportFullyDrawn();
                return P0.d.f624c;
            case 1:
                AbstractActivityC0138i abstractActivityC0138i = this.f1057c;
                return new n(abstractActivityC0138i.f1063f, new k(abstractActivityC0138i, 0));
            default:
                AbstractActivityC0138i abstractActivityC0138i2 = this.f1057c;
                x xVar = new x(new d(abstractActivityC0138i2, 1));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (X0.d.a(Looper.myLooper(), Looper.getMainLooper())) {
                        abstractActivityC0138i2.f1059a.a(new f(xVar, abstractActivityC0138i2));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new B.o(abstractActivityC0138i2, 1, xVar));
                    }
                }
                return xVar;
        }
    }
}
