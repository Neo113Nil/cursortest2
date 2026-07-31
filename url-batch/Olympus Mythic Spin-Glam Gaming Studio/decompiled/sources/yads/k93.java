package yads;

import android.util.Log;
import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class k93 implements Runnable {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        View rootView;
        m93 m93Var = m93.g;
        m93Var.getClass();
        m93Var.b.clear();
        Iterator it = Collections.unmodifiableCollection(qv3.c.b).iterator();
        while (it.hasNext()) {
            ((av3) it.next()).getClass();
        }
        m93Var.f = System.nanoTime();
        m93Var.d.a();
        long nanoTime = System.nanoTime();
        nv3 nv3Var = m93Var.c.b;
        if (m93Var.d.f.size() > 0) {
            Iterator it2 = m93Var.d.f.iterator();
            while (it2.hasNext()) {
                String str = (String) it2.next();
                JSONObject a = nv3Var.a(null);
                View view = (View) m93Var.d.c.get(str);
                vv3 vv3Var = m93Var.c.a;
                String str2 = (String) m93Var.d.g.get(str);
                if (str2 != null) {
                    JSONObject a2 = vv3Var.a(view);
                    try {
                        a2.put("adSessionId", str);
                    } catch (JSONException e) {
                        Log.e("OMIDLIB", "Error with setting ad session id", e);
                    }
                    try {
                        a2.put("notVisibleReason", str2);
                    } catch (JSONException e2) {
                        Log.e("OMIDLIB", "Error with setting not visible reason", e2);
                    }
                    ov3.a(a, a2);
                }
                ov3.a(a);
                HashSet hashSet = new HashSet();
                hashSet.add(str);
                iv3 iv3Var = m93Var.e;
                iv3Var.b.a(new bw3(iv3Var, hashSet, a, nanoTime));
            }
        }
        if (m93Var.d.e.size() > 0) {
            JSONObject a3 = nv3Var.a(null);
            ArrayList arrayList = new ArrayList();
            qv3 qv3Var = qv3.c;
            if (qv3Var != null) {
                Collection unmodifiableCollection = Collections.unmodifiableCollection(qv3Var.b);
                IdentityHashMap identityHashMap = new IdentityHashMap((unmodifiableCollection.size() * 2) + 3);
                Iterator it3 = unmodifiableCollection.iterator();
                while (it3.hasNext()) {
                    View view2 = (View) ((av3) it3.next()).d.get();
                    if (view2 != null && jw3.d(view2) && (rootView = view2.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                        identityHashMap.put(rootView, rootView);
                        float b = jw3.b(rootView);
                        int size = arrayList.size();
                        while (size > 0 && jw3.b((View) arrayList.get(size - 1)) > b) {
                            size--;
                        }
                        arrayList.add(size, rootView);
                    }
                }
            }
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                m93Var.a((View) it4.next(), nv3Var.a, a3, false);
            }
            ov3.a(a3);
            iv3 iv3Var2 = m93Var.e;
            iv3Var2.b.a(new ew3(iv3Var2, m93Var.d.e, a3, nanoTime));
        } else {
            iv3 iv3Var3 = m93Var.e;
            iv3Var3.b.a(new wv3(iv3Var3));
        }
        xu3 xu3Var = m93Var.d;
        xu3Var.a.clear();
        xu3Var.b.clear();
        xu3Var.c.clear();
        xu3Var.d.clear();
        xu3Var.e.clear();
        xu3Var.f.clear();
        xu3Var.g.clear();
        xu3Var.j = false;
        xu3Var.h.clear();
        long nanoTime2 = System.nanoTime() - m93Var.f;
        if (m93Var.a.size() > 0) {
            Iterator it5 = m93Var.a.iterator();
            if (it5.hasNext()) {
                if (it5.next() != null) {
                    throw new ClassCastException();
                }
                TimeUnit.NANOSECONDS.toMillis(nanoTime2);
                throw null;
            }
        }
        nw3.d.a();
    }
}
