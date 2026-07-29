package o;

import android.content.Intent;
import com.devanos.nilufar.usmonova.MainActivity;
import com.devanos.nilufar.usmonova.p7.gate.GateActivity;
import com.devanos.nilufar.usmonova.p7.policy.Lc0Activity;
import com.devanos.nilufar.usmonova.p7.ui.S0FrameActivity;

/* renamed from: o.bq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0800bq extends AbstractC2225xU implements InterfaceC2312yp {
    public final /* synthetic */ GateActivity h;
    public final /* synthetic */ BT i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0800bq(GateActivity gateActivity, BT bt, InterfaceC2235xe interfaceC2235xe) {
        super(2, interfaceC2235xe);
        this.h = gateActivity;
        this.i = bt;
    }

    @Override // o.Y7
    public final InterfaceC2235xe create(Object obj, InterfaceC2235xe interfaceC2235xe) {
        return new C0800bq(this.h, this.i, interfaceC2235xe);
    }

    @Override // o.InterfaceC2312yp
    public final Object invoke(Object obj, Object obj2) {
        C0800bq c0800bq = (C0800bq) create((InterfaceC0422Qe) obj, (InterfaceC2235xe) obj2);
        C0782bY c0782bY = C0782bY.a;
        c0800bq.invokeSuspend(c0782bY);
        return c0782bY;
    }

    @Override // o.Y7
    public final Object invokeSuspend(Object obj) {
        AbstractC1259iq onCreate$lambda$0$0$0;
        AbstractC1494mO.l(obj);
        onCreate$lambda$0$0$0 = GateActivity.onCreate$lambda$0$0$0(this.i);
        boolean z = onCreate$lambda$0$0$0 instanceof C1128gq;
        GateActivity gateActivity = this.h;
        if (z) {
            AbstractC0896dH.d("GateActivity", "navigate S0");
            C1101gP c1101gP = S0FrameActivity.Companion;
            String str = ((C1128gq) onCreate$lambda$0$0$0).a;
            c1101gP.getClass();
            AbstractC0048Bt.n(str, "dest");
            Intent intent = new Intent(gateActivity, (Class<?>) S0FrameActivity.class);
            intent.putExtra("x0d", str);
            gateActivity.startActivity(intent);
            gateActivity.finish();
        } else if (AbstractC0048Bt.h(onCreate$lambda$0$0$0, C0930dq.a)) {
            AbstractC0896dH.d("GateActivity", "navigate L0");
            Lc0Activity.Companion.getClass();
            Intent intent2 = new Intent(gateActivity, (Class<?>) Lc0Activity.class);
            intent2.putExtra(Lc0Activity.EXTRA_READ_ONLY, false);
            gateActivity.startActivity(intent2);
            gateActivity.finish();
        } else if (AbstractC0048Bt.h(onCreate$lambda$0$0$0, C1062fq.a)) {
            AbstractC0896dH.d("GateActivity", "navigate M0");
            gateActivity.startActivity(new Intent(gateActivity, (Class<?>) MainActivity.class));
            gateActivity.finish();
        } else if (onCreate$lambda$0$0$0 instanceof C1194hq) {
            BU bu = AbstractC0896dH.a;
            AbstractC0896dH.f("GateActivity", "navigate fallback reason=".concat(((C1194hq) onCreate$lambda$0$0$0).a), null);
            gateActivity.startActivity(new Intent(gateActivity, (Class<?>) MainActivity.class));
            gateActivity.finish();
        } else if (!AbstractC0048Bt.h(onCreate$lambda$0$0$0, C0996eq.a)) {
            throw new C0057Cc();
        }
        return C0782bY.a;
    }
}
