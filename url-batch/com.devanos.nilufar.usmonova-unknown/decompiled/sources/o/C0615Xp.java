package o;

import com.devanos.nilufar.usmonova.p7.gate.GateActivity;

/* renamed from: o.Xp, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0615Xp implements InterfaceC2312yp {
    public final /* synthetic */ int h;
    public final /* synthetic */ GateActivity i;

    public /* synthetic */ C0615Xp(GateActivity gateActivity, int i) {
        this.h = i;
        this.i = gateActivity;
    }

    @Override // o.InterfaceC2312yp
    public final Object invoke(Object obj, Object obj2) {
        C0782bY onCreate$lambda$0$0;
        C0782bY onCreate$lambda$0;
        int i = this.h;
        InterfaceC1377kd interfaceC1377kd = (InterfaceC1377kd) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                onCreate$lambda$0$0 = GateActivity.onCreate$lambda$0$0(this.i, interfaceC1377kd, intValue);
                return onCreate$lambda$0$0;
            default:
                onCreate$lambda$0 = GateActivity.onCreate$lambda$0(this.i, interfaceC1377kd, intValue);
                return onCreate$lambda$0;
        }
    }
}
