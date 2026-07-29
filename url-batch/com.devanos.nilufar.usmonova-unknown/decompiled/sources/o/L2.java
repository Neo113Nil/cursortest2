package o;

import android.content.res.Resources;

/* loaded from: classes.dex */
public final /* synthetic */ class L2 extends AbstractC0511Tp implements InterfaceC2378zp {
    @Override // o.InterfaceC2378zp
    public final Object e(Object obj, Object obj2, Object obj3) {
        if (obj != null) {
            throw new ClassCastException();
        }
        ((ZR) obj2).getClass();
        S2 s2 = (S2) this.receiver;
        Resources resources = s2.getContext().getResources();
        return Boolean.valueOf(C1211i3.a.a(s2, null, new C0983ed(new C1185hh(resources.getDisplayMetrics().density, resources.getConfiguration().fontScale), 0L, (InterfaceC2114vp) obj3)));
    }
}
