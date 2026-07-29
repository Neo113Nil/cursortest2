package o;

import android.util.Log;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: o.Oo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0380Oo {
    public boolean a = false;
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();
    public AbstractC0511Tp c;
    public final /* synthetic */ AbstractC0588Wo d;

    public C0380Oo(AbstractC0588Wo abstractC0588Wo) {
        this.d = abstractC0588Wo;
    }

    public final void a() {
        boolean J = AbstractC0588Wo.J(3);
        AbstractC0588Wo abstractC0588Wo = this.d;
        if (J) {
            Log.d("FragmentManager", "handleOnBackCancelled. PREDICTIVE_BACK = true fragment manager " + abstractC0588Wo);
        }
        Q7 q7 = abstractC0588Wo.h;
        if (q7 != null) {
            q7.q = false;
            q7.d(false);
            abstractC0588Wo.A(true);
            abstractC0588Wo.D();
            Iterator it = abstractC0588Wo.m.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
        }
        abstractC0588Wo.h = null;
    }
}
