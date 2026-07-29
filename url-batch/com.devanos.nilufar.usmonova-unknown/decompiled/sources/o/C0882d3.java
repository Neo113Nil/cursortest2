package o;

import android.view.accessibility.AccessibilityEvent;

/* renamed from: o.d3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0882d3 extends AbstractC1596ny implements InterfaceC2114vp {
    public final /* synthetic */ int h;
    public final /* synthetic */ C1013f3 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0882d3(C1013f3 c1013f3, int i) {
        super(1);
        this.h = i;
        this.i = c1013f3;
    }

    @Override // o.InterfaceC2114vp
    public final Object invoke(Object obj) {
        switch (this.h) {
            case 0:
                C1013f3 c1013f3 = this.i;
                return Boolean.valueOf(c1013f3.d.getParent().requestSendAccessibilityEvent(c1013f3.d, (AccessibilityEvent) obj));
            default:
                C1364kQ c1364kQ = (C1364kQ) obj;
                if (c1364kQ.c.contains(c1364kQ)) {
                    C1013f3 c1013f32 = this.i;
                    c1013f32.d.getSnapshotObserver().a(c1364kQ, c1013f32.K, new C1139h0(c1364kQ, c1013f32));
                }
                return C0782bY.a;
        }
    }
}
