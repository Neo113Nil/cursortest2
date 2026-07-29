package o;

import android.content.Context;
import com.devanos.nilufar.usmonova.p7.gate.GateActivity;
import com.squareup.moshi.Moshi;
import java.util.Comparator;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

/* renamed from: o.Yp, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0641Yp implements InterfaceC1455lp {
    public final /* synthetic */ int h;

    public /* synthetic */ C0641Yp(int i) {
        this.h = i;
    }

    @Override // o.InterfaceC1455lp
    public final Object invoke() {
        Context context;
        XZ viewModel_delegate$lambda$0;
        Context context2;
        boolean z = true;
        boolean z2 = false;
        switch (this.h) {
            case 0:
                viewModel_delegate$lambda$0 = GateActivity.viewModel_delegate$lambda$0();
                return viewModel_delegate$lambda$0;
            case 1:
                try {
                    context = UQ.a;
                } catch (Exception unused) {
                }
                if (context == null) {
                    AbstractC0048Bt.i0("appContext");
                    throw null;
                }
                if ((context.getApplicationInfo().flags & 2) != 0) {
                    return Boolean.valueOf(z);
                }
                z = false;
                return Boolean.valueOf(z);
            case 2:
                Context context3 = UQ.a;
                if (context3 != null) {
                    return new C2069v6(context3);
                }
                AbstractC0048Bt.i0("appContext");
                throw null;
            case 3:
                return new C0803bt((C2069v6) UQ.b.getValue());
            case 4:
                return new C1514mi((C2069v6) UQ.b.getValue());
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                Context context4 = UQ.a;
                if (context4 != null) {
                    return new C1580ni(context4);
                }
                AbstractC0048Bt.i0("appContext");
                throw null;
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                Moshi moshi = AbstractC1945tE.a;
                DF df = new DF();
                AbstractC0048Bt.n(TimeUnit.SECONDS, "unit");
                df.r = HY.b();
                df.s = HY.b();
                df.t = HY.b();
                df.c.add(new C1677p9(3));
                try {
                    context2 = UQ.a;
                } catch (Exception unused2) {
                }
                if (context2 == null) {
                    AbstractC0048Bt.i0("appContext");
                    throw null;
                }
                if ((context2.getApplicationInfo().flags & 2) != 0) {
                    z2 = true;
                }
                C0802bs c0802bs = new C0802bs();
                c0802bs.c = z2 ? 4 : 1;
                Comparator comparator = String.CASE_INSENSITIVE_ORDER;
                AbstractC0048Bt.m(comparator, "CASE_INSENSITIVE_ORDER");
                TreeSet treeSet = new TreeSet(comparator);
                AbstractC1048fc.f0(treeSet, (Iterable) c0802bs.b);
                treeSet.add("Authorization");
                c0802bs.b = treeSet;
                df.c.add(c0802bs);
                return new EF(df);
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
                return new C4((C2069v6) UQ.b.getValue(), (C0803bt) UQ.c.getValue(), (C1514mi) UQ.d.getValue(), (C1580ni) UQ.e.getValue(), (EF) UQ.f.getValue());
            case 8:
                return new WO();
            case 9:
                return new C2356zT((WO) UQ.h.getValue(), (C4) UQ.g.getValue());
            default:
                return new C0274Kl((C2069v6) UQ.b.getValue(), (C4) UQ.g.getValue());
        }
    }
}
