package o;

import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: o.ap, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0733ap extends UZ {
    public static final C0666Zo h = new C0666Zo(0);
    public final boolean e;
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();
    public boolean f = false;
    public boolean g = false;

    public C0733ap(boolean z) {
        this.e = z;
    }

    @Override // o.UZ
    public final void d() {
        if (AbstractC0588Wo.J(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f = true;
    }

    public final void e(String str, boolean z) {
        if (AbstractC0588Wo.J(3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
        }
        g(str, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0733ap.class == obj.getClass()) {
            C0733ap c0733ap = (C0733ap) obj;
            if (this.b.equals(c0733ap.b) && this.c.equals(c0733ap.c) && this.d.equals(c0733ap.d)) {
                return true;
            }
        }
        return false;
    }

    public final void f(AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co, boolean z) {
        if (AbstractC0588Wo.J(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + abstractComponentCallbacksC0069Co);
        }
        g(abstractComponentCallbacksC0069Co.l, z);
    }

    public final void g(String str, boolean z) {
        HashMap hashMap = this.c;
        C0733ap c0733ap = (C0733ap) hashMap.get(str);
        if (c0733ap != null) {
            if (z) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(c0733ap.c.keySet());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    c0733ap.e((String) it.next(), true);
                }
            }
            c0733ap.d();
            hashMap.remove(str);
        }
        HashMap hashMap2 = this.d;
        C0680a00 c0680a00 = (C0680a00) hashMap2.get(str);
        if (c0680a00 != null) {
            c0680a00.a();
            hashMap2.remove(str);
        }
    }

    public final void h(AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co) {
        if (this.g) {
            if (AbstractC0588Wo.J(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.b.remove(abstractComponentCallbacksC0069Co.l) == null || !AbstractC0588Wo.J(2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + abstractComponentCallbacksC0069Co);
        }
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.b.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.c.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.d.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
