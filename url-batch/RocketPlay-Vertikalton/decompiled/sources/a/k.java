package a;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import g.AbstractActivityC0129i;
import h1.InterfaceC0173a;

/* loaded from: classes.dex */
public final class k extends i1.g implements InterfaceC0173a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1580b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0129i f1581c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(AbstractActivityC0129i abstractActivityC0129i, int i) {
        super(0);
        this.f1580b = i;
        this.f1581c = abstractActivityC0129i;
    }

    @Override // h1.InterfaceC0173a
    public final Object c() {
        switch (this.f1580b) {
            case 0:
                this.f1581c.reportFullyDrawn();
                return V0.i.f1250a;
            case 1:
                AbstractActivityC0129i abstractActivityC0129i = this.f1581c;
                return new n(abstractActivityC0129i.f1587f, new k(abstractActivityC0129i, 0));
            default:
                AbstractActivityC0129i abstractActivityC0129i2 = this.f1581c;
                x xVar = new x(new d(abstractActivityC0129i2, 1));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (i1.f.a(Looper.myLooper(), Looper.getMainLooper())) {
                        abstractActivityC0129i2.f1583a.a(new f(xVar, abstractActivityC0129i2));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new B.o(abstractActivityC0129i2, 1, xVar));
                    }
                }
                return xVar;
        }
    }
}
