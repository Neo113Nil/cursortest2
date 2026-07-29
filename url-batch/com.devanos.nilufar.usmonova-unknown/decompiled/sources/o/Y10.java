package o;

import android.view.View;
import android.view.ViewGroup;
import com.devanos.nilufar.usmonova.R;

/* loaded from: classes.dex */
public abstract class Y10 {
    public static final ViewGroup.LayoutParams a = new ViewGroup.LayoutParams(-2, -2);

    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ae  */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.util.Collection] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final S10 a(AbstractC1927t abstractC1927t, AbstractC1838rd abstractC1838rd, C0721ad c0721ad) {
        S2 s2;
        S10 s10;
        InterfaceC0189He coroutineContext;
        InterfaceC0189He interfaceC0189He;
        if (AbstractC0253Jq.a.compareAndSet(false, true)) {
            J8 b = AbstractC1807r8.b(1, 6, null);
            AbstractC0868ct.H(AbstractC1052fg.c((InterfaceC0189He) N3.t.getValue()), null, null, new C0227Iq(b, null), 3);
            C1400l c1400l = new C1400l(18, b);
            synchronized (AbstractC2025uS.b) {
                AbstractC2025uS.h = AbstractC0720ac.B0(AbstractC2025uS.h, c1400l);
            }
            AbstractC2025uS.a();
        }
        if (abstractC1927t.getChildCount() > 0) {
            View childAt = abstractC1927t.getChildAt(0);
            if (childAt instanceof S2) {
                s2 = (S2) childAt;
                if (s2 == null) {
                    s2 = new S2(abstractC1927t.getContext(), ((C0901dM) abstractC1838rd).t);
                    abstractC1927t.addView(s2.getView(), a);
                }
                C2036ud c2036ud = new C2036ud(abstractC1838rd, new C0950e6(s2.getRoot()));
                Object tag = s2.getView().getTag(R.id.wrapped_composition_tag);
                s10 = tag instanceof S10 ? (S10) tag : null;
                if (s10 == null) {
                    s10 = new S10(s2, c2036ud);
                    s2.getView().setTag(R.id.wrapped_composition_tag, s10);
                }
                s10.d(c0721ad);
                coroutineContext = s2.getCoroutineContext();
                interfaceC0189He = ((C0901dM) abstractC1838rd).t;
                if (!AbstractC0048Bt.h(coroutineContext, interfaceC0189He)) {
                    s2.setCoroutineContext(interfaceC0189He);
                }
                return s10;
            }
        } else {
            abstractC1927t.removeAllViews();
        }
        s2 = null;
        if (s2 == null) {
        }
        C2036ud c2036ud2 = new C2036ud(abstractC1838rd, new C0950e6(s2.getRoot()));
        Object tag2 = s2.getView().getTag(R.id.wrapped_composition_tag);
        if (tag2 instanceof S10) {
        }
        if (s10 == null) {
        }
        s10.d(c0721ad);
        coroutineContext = s2.getCoroutineContext();
        interfaceC0189He = ((C0901dM) abstractC1838rd).t;
        if (!AbstractC0048Bt.h(coroutineContext, interfaceC0189He)) {
        }
        return s10;
    }
}
