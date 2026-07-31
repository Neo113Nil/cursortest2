package com.my.target;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import com.my.target.pj;
import com.my.target.wh;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public class wj implements t5 {
    private final ArrayList b;
    private float d;
    private final zf e;
    private final boolean g;
    private final wh.c h;
    private final ArrayList a = new ArrayList();
    private di c = null;
    private final Runnable f = new Runnable() { // from class: com.my.target.wj$$ExternalSyntheticLambda0
        @Override // java.lang.Runnable
        public final void run() {
            wj.this.d();
        }
    };
    private boolean i = false;
    private boolean j = false;
    private pj.a k = null;
    private j7 l = null;
    private float m = 0.0f;

    private wj(lj ljVar, th thVar, boolean z, wh.c cVar, rj rjVar) {
        this.d = 50.0f;
        this.h = cVar;
        float b = ljVar.b();
        if (b == 1.0f) {
            this.e = zf.e;
        } else {
            this.e = zf.a((int) (b * 1000.0f));
        }
        this.b = new ArrayList();
        a(ljVar, thVar, rjVar);
        this.d = ljVar.c() * 100.0f;
        this.g = z;
    }

    public static float a(int i, float f) {
        if (f == 0.0f) {
            return 0.0f;
        }
        return i / (f / 100.0f);
    }

    public static wj a(lj ljVar, th thVar, boolean z, wh.c cVar, rj rjVar) {
        return new wj(ljVar, thVar, z, cVar, rjVar);
    }

    public static boolean b(View view) {
        return view.getParent() == null || view.getWindowVisibility() != 0 || view.getVisibility() != 0 || view.getAlpha() < 0.5f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        if (!this.i) {
            this.e.b(this.f);
            return;
        }
        if (this.l != null) {
            mi.b("ViewsViewabilityTracker", "tick for " + this.l.x());
        }
        b();
    }

    public void c() {
        if (this.i) {
            this.i = false;
            this.j = false;
            this.a.clear();
            this.e.b(this.f);
            mi.b("ViewsViewabilityTracker", "Stop tracking");
        }
    }

    public static float a(ArrayList arrayList, float f) {
        mi.b("ViewsViewabilityTracker", "Views count " + arrayList.size());
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            View view = (View) obj;
            if (view != null && !b(view)) {
                Rect rect = new Rect();
                if (view.getGlobalVisibleRect(rect)) {
                    i2 += rect.width() * rect.height();
                }
            }
        }
        return a(i2, f);
    }

    private void b() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.a;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            View view = (View) ((WeakReference) obj).get();
            if (view != null) {
                arrayList.add(view);
            }
        }
        if (arrayList.isEmpty()) {
            mi.b("ViewsViewabilityTracker", "Tracking view disappeared");
            c();
            return;
        }
        float a = a(arrayList, this.m);
        boolean z = v4.a(a, this.d) != -1;
        mi.b("ViewsViewabilityTracker", "View visibility " + a + "% (isVisible = " + z + "). Id: " + this.l.x());
        a(z, a, ((View) arrayList.get(0)).getContext());
    }

    public void c(View view) {
        WeakReference weakReference;
        boolean z;
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                weakReference = null;
                break;
            }
            Object obj = arrayList.get(i);
            i++;
            weakReference = (WeakReference) obj;
            if (weakReference.get() == view) {
                break;
            }
        }
        if (weakReference != null) {
            this.a.remove(weakReference);
        }
        ArrayList arrayList2 = this.a;
        int size2 = arrayList2.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size2) {
                z = false;
                break;
            }
            Object obj2 = arrayList2.get(i2);
            i2++;
            if (((WeakReference) obj2).get() != null) {
                z = true;
                break;
            }
        }
        if (!this.j || z) {
            return;
        }
        this.j = false;
        pj.a aVar = this.k;
        if (aVar != null) {
            aVar.a(false);
        }
    }

    @Override // com.my.target.t5
    public pj.a a() {
        return this.k;
    }

    @Override // com.my.target.t5
    public void a(di diVar) {
        int size = this.b.size() - 1;
        while (true) {
            if (size < 0) {
                break;
            }
            if (this.b.get(size) == diVar) {
                this.b.remove(size);
                break;
            }
            size--;
        }
        if (this.b.isEmpty() && this.g) {
            mi.b("ViewsViewabilityTracker", "statTrackers are empty and shouldStopOnShow = true, stop tracking");
            c();
        }
    }

    public void a(pj.a aVar) {
        this.k = aVar;
    }

    public void a(ArrayList arrayList, HashMap hashMap, j7 j7Var) {
        if (this.i) {
            return;
        }
        if (this.b.isEmpty() && this.g) {
            return;
        }
        this.l = j7Var;
        mi.b("ViewsViewabilityTracker", "Started tracking");
        boolean z = true;
        this.i = true;
        this.m = 0.0f;
        this.a.clear();
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            this.a.add(new WeakReference((View) obj));
            this.m += r8.getWidth() * r8.getHeight();
        }
        Context context = arrayList.isEmpty() ? null : ((View) arrayList.get(0)).getContext();
        if (context != null) {
            long j = 0;
            for (Integer num : hashMap.keySet()) {
                float a = a(num.intValue(), this.m);
                boolean z2 = v4.a(a, this.d) != -1 ? z : false;
                if (z2) {
                    if (j == 0) {
                        Long l = (Long) hashMap.get(num);
                        if (l != null) {
                            j = l.longValue();
                        }
                    } else {
                        mi.b("ViewsViewabilityTracker", "History View visibility " + a + "% (isVisible = " + z2 + "). Id: " + j7Var.x());
                        a(z2, a, context);
                        z = true;
                    }
                }
                j = 0;
                z = true;
            }
            View view = (View) arrayList.get(0);
            if (view != null) {
                di diVar = this.c;
                if (diVar != null) {
                    diVar.a(view);
                }
                ArrayList arrayList2 = this.b;
                int size2 = arrayList2.size();
                while (i < size2) {
                    Object obj2 = arrayList2.get(i);
                    i++;
                    ((di) obj2).a(view);
                }
            }
        }
        b();
        this.e.a(this.f);
    }

    public void a(View view) {
        this.a.add(new WeakReference(view));
    }

    private void a(boolean z, float f, Context context) {
        boolean z2 = this.j;
        for (int size = this.b.size() - 1; size >= 0; size--) {
            ((di) this.b.get(size)).a(z, f, context);
        }
        if (z2 == z) {
            return;
        }
        this.j = this.i && z;
        pj.a aVar = this.k;
        if (aVar != null) {
            aVar.a(z);
        }
    }

    private void a(lj ljVar, th thVar, rj rjVar) {
        uh a;
        long a2 = (long) (ljVar.a() * 1000.0f);
        uh b = thVar.b("viewabilityDuration");
        mi.b("ViewsViewabilityTracker", "ViewabilityDuration stats count = " + b.c.size());
        if (!b.c.isEmpty()) {
            this.b.add(nj.a(this, b, a2, this.h));
        }
        uh b2 = thVar.b("show");
        mi.b("ViewsViewabilityTracker", "Show stats count = " + b2.c.size());
        this.b.add(wg.a(this, b2, a2, thVar, this.h));
        uh b3 = thVar.b("viewin");
        mi.b("ViewsViewabilityTracker", "View In stats count = " + b3.c.size());
        this.b.add(kj.a(this, b3));
        uh b4 = thVar.b("render");
        mi.b("ViewsViewabilityTracker", "Render stats count = " + b4.c.size());
        uh b5 = thVar.b("viewabilityMeasurable");
        mi.b("ViewsViewabilityTracker", "ViewabilityMeasurable stats count = " + b5.c.size());
        this.c = yf.a(this, b4, b5, this.h);
        uh b6 = thVar.b(1);
        mi.b("ViewsViewabilityTracker", "OvvStats stats count = " + b6.c.size());
        if (rjVar == null) {
            a = thVar.a(1);
            mi.b("ViewsViewabilityTracker", "MrcStats stats count = " + a.c.size());
        } else {
            a = uh.a(thVar);
            mi.b("ViewsViewabilityTracker", "MrcStats stats ignored (viewabilityTrackerV2FeatureFlag)");
        }
        this.b.add(me.a(this, b6, a, this.h));
    }
}
