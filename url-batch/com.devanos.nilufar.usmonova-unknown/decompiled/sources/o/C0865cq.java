package o;

import com.devanos.nilufar.usmonova.p7.gate.GateActivity;

/* renamed from: o.cq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0865cq extends AbstractC1596ny implements InterfaceC1455lp {
    public final /* synthetic */ int h;
    public final /* synthetic */ GateActivity i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0865cq(GateActivity gateActivity, int i) {
        super(0);
        this.h = i;
        this.i = gateActivity;
    }

    @Override // o.InterfaceC1455lp
    public final Object invoke() {
        switch (this.h) {
            case 0:
                return this.i.getViewModelStore();
            default:
                return this.i.getDefaultViewModelCreationExtras();
        }
    }
}
