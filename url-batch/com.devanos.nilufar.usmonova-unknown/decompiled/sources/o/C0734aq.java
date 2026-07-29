package o;

import com.devanos.nilufar.usmonova.p7.gate.GateActivity;

/* renamed from: o.aq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0734aq extends AbstractC2225xU implements InterfaceC2312yp {
    public final /* synthetic */ GateActivity h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0734aq(GateActivity gateActivity, InterfaceC2235xe interfaceC2235xe) {
        super(2, interfaceC2235xe);
        this.h = gateActivity;
    }

    @Override // o.Y7
    public final InterfaceC2235xe create(Object obj, InterfaceC2235xe interfaceC2235xe) {
        return new C0734aq(this.h, interfaceC2235xe);
    }

    @Override // o.InterfaceC2312yp
    public final Object invoke(Object obj, Object obj2) {
        C0734aq c0734aq = (C0734aq) create((InterfaceC0422Qe) obj, (InterfaceC2235xe) obj2);
        C0782bY c0782bY = C0782bY.a;
        c0734aq.invokeSuspend(c0782bY);
        return c0782bY;
    }

    @Override // o.Y7
    public final Object invokeSuspend(Object obj) {
        C1456lq viewModel;
        C0315Mb c0315Mb;
        AbstractC1494mO.l(obj);
        viewModel = this.h.getViewModel();
        if (viewModel.e.getValue() instanceof C0996eq) {
            synchronized (AbstractC1807r8.h) {
                c0315Mb = (C0315Mb) viewModel.c("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
                if (c0315Mb == null) {
                    InterfaceC0189He interfaceC0189He = C1188hk.h;
                    try {
                        C0191Hg c0191Hg = AbstractC0115Ei.a;
                        interfaceC0189He = AbstractC1810rB.a.m;
                    } catch (IllegalStateException | WE unused) {
                    }
                    C0315Mb c0315Mb2 = new C0315Mb(interfaceC0189He.D(PO.a()));
                    viewModel.a("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", c0315Mb2);
                    c0315Mb = c0315Mb2;
                }
            }
            AbstractC0868ct.H(c0315Mb, null, null, new C1390kq(viewModel, null), 3);
        }
        return C0782bY.a;
    }
}
