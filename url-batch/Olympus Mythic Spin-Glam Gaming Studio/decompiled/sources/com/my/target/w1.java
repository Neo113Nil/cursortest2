package com.my.target;

import android.view.View;
import com.my.target.j7;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public class w1 {
    private boolean a = false;
    private final HashMap b = new HashMap();
    private final ArrayList c = new ArrayList();

    private w1() {
    }

    public static w1 b() {
        return new w1();
    }

    public void a(View view, j7.a aVar) {
        if (!this.b.containsKey(aVar)) {
            this.b.put(aVar, new WeakReference(view));
        }
        if (this.a) {
            b(aVar);
        }
    }

    public void c() {
        this.b.clear();
    }

    private void b(j7.a aVar) {
        WeakReference weakReference = (WeakReference) this.b.get(aVar);
        if (weakReference == null || ((View) weakReference.get()) == null || this.c.contains(aVar)) {
            return;
        }
        this.c.add(aVar);
        wh.b(aVar.H(), "show", 1);
    }

    public void a(j7.a aVar) {
        this.b.remove(aVar);
    }

    public void a() {
        if (this.a) {
            return;
        }
        this.a = true;
        Iterator it = this.b.keySet().iterator();
        while (it.hasNext()) {
            b((j7.a) it.next());
        }
    }
}
