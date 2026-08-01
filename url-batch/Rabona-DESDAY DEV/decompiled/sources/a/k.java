package a;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import g.AbstractActivityC0126i;

/* loaded from: classes.dex */
public final class k extends X0.e implements W0.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1057b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0126i f1058c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(AbstractActivityC0126i abstractActivityC0126i, int i) {
        super(0);
        this.f1057b = i;
        this.f1058c = abstractActivityC0126i;
    }

    @Override // W0.a
    public final Object a() {
        switch (this.f1057b) {
            case 0:
                this.f1058c.reportFullyDrawn();
                return P0.d.f626c;
            case 1:
                AbstractActivityC0126i abstractActivityC0126i = this.f1058c;
                return new n(abstractActivityC0126i.f1064f, new k(abstractActivityC0126i, 0));
            default:
                AbstractActivityC0126i abstractActivityC0126i2 = this.f1058c;
                x xVar = new x(new d(abstractActivityC0126i2, 1));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (X0.d.a(Looper.myLooper(), Looper.getMainLooper())) {
                        abstractActivityC0126i2.f1060a.a(new f(xVar, abstractActivityC0126i2));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new B.o(abstractActivityC0126i2, 1, xVar));
                    }
                }
                return xVar;
        }
    }
}
