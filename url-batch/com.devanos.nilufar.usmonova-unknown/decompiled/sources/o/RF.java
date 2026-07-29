package o;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class RF extends AbstractC1596ny implements InterfaceC2114vp {
    public final /* synthetic */ int h;
    public final /* synthetic */ YF i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RF(YF yf, int i) {
        super(1);
        this.h = i;
        this.i = yf;
    }

    @Override // o.InterfaceC2114vp
    public final Object invoke(Object obj) {
        Object obj2;
        Object obj3;
        switch (this.h) {
            case 0:
                AbstractC0048Bt.n((N7) obj, "backEvent");
                YF yf = this.i;
                D6 d6 = yf.b;
                ListIterator listIterator = d6.listIterator(d6.j());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        obj2 = listIterator.previous();
                        if (((C0380Oo) obj2).a) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                C0380Oo c0380Oo = (C0380Oo) obj2;
                if (yf.c != null) {
                    yf.a();
                }
                yf.c = c0380Oo;
                if (c0380Oo != null) {
                    AbstractC0588Wo abstractC0588Wo = c0380Oo.d;
                    if (AbstractC0588Wo.J(3)) {
                        Log.d("FragmentManager", "handleOnBackStarted. PREDICTIVE_BACK = true fragment manager " + abstractC0588Wo);
                    }
                    abstractC0588Wo.x();
                    abstractC0588Wo.y(new C0562Vo(abstractC0588Wo), false);
                }
                return C0782bY.a;
            default:
                N7 n7 = (N7) obj;
                AbstractC0048Bt.n(n7, "backEvent");
                YF yf2 = this.i;
                C0380Oo c0380Oo2 = yf2.c;
                if (c0380Oo2 == null) {
                    D6 d62 = yf2.b;
                    ListIterator listIterator2 = d62.listIterator(d62.j());
                    while (true) {
                        if (listIterator2.hasPrevious()) {
                            obj3 = listIterator2.previous();
                            if (((C0380Oo) obj3).a) {
                            }
                        } else {
                            obj3 = null;
                        }
                    }
                    c0380Oo2 = (C0380Oo) obj3;
                }
                if (c0380Oo2 != null) {
                    AbstractC0588Wo abstractC0588Wo2 = c0380Oo2.d;
                    if (AbstractC0588Wo.J(2)) {
                        Log.v("FragmentManager", "handleOnBackProgressed. PREDICTIVE_BACK = true fragment manager " + abstractC0588Wo2);
                    }
                    if (abstractC0588Wo2.h != null) {
                        Iterator it = abstractC0588Wo2.f(new ArrayList(Collections.singletonList(abstractC0588Wo2.h)), 0, 1).iterator();
                        while (it.hasNext()) {
                            C0450Rg c0450Rg = (C0450Rg) it.next();
                            c0450Rg.getClass();
                            if (AbstractC0588Wo.J(2)) {
                                Log.v("FragmentManager", "SpecialEffectsController: Processing Progress " + n7.c);
                            }
                            ArrayList arrayList = c0450Rg.c;
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                ((RS) it2.next()).getClass();
                                AbstractC1048fc.f0(arrayList2, null);
                            }
                            List J0 = AbstractC0720ac.J0(AbstractC0720ac.M0(arrayList2));
                            int size = J0.size();
                            for (int i = 0; i < size; i++) {
                                ((QS) J0.get(i)).b(n7, c0450Rg.a);
                            }
                        }
                        Iterator it3 = abstractC0588Wo2.m.iterator();
                        if (it3.hasNext()) {
                            it3.next().getClass();
                            throw new ClassCastException();
                        }
                    }
                }
                return C0782bY.a;
        }
    }
}
