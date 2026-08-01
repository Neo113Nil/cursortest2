package defpackage;

import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class uk extends p80 {
    public static final tg i = new tg(24);
    public final boolean f;
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();
    public final HashMap e = new HashMap();
    public boolean g = false;
    public boolean h = false;

    public uk(boolean z) {
        this.f = z;
    }

    @Override // defpackage.p80
    public final void b() {
        if (sk.G(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.g = true;
    }

    public final void c(dk dkVar) {
        if (sk.G(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + dkVar);
        }
        d(dkVar.j);
    }

    public final void d(String str) {
        HashMap hashMap = this.d;
        uk ukVar = (uk) hashMap.get(str);
        if (ukVar != null) {
            ukVar.b();
            hashMap.remove(str);
        }
        HashMap hashMap2 = this.e;
        s80 s80Var = (s80) hashMap2.get(str);
        if (s80Var != null) {
            s80Var.a();
            hashMap2.remove(str);
        }
    }

    public final void e(dk dkVar) {
        if (this.h) {
            if (sk.G(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.c.remove(dkVar.j) == null || !sk.G(2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + dkVar);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && uk.class == obj.getClass()) {
            uk ukVar = (uk) obj;
            if (this.c.equals(ukVar.c) && this.d.equals(ukVar.d) && this.e.equals(ukVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + (this.c.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.c.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.d.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.e.keySet().iterator();
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
