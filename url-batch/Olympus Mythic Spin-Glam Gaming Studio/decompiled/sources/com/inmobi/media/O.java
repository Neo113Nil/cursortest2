package com.inmobi.media;

import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes13.dex */
public final class O implements Runnable {
    public final /* synthetic */ U a;

    public O(U u) {
        this.a = u;
    }

    @Override // java.lang.Runnable
    public final void run() {
        float f;
        M6 m6;
        M a = U.a(this.a);
        U u = this.a;
        u.getClass();
        ArrayList arrayList = null;
        if (a == null) {
            m6 = new M6(0.0f, null, null);
        } else {
            RectF rectF = a.a;
            if (rectF.isEmpty()) {
                m6 = new M6(0.0f, null, null);
            } else {
                float measuredHeight = u.a.getMeasuredHeight() * u.a.getMeasuredWidth();
                if (measuredHeight <= 0.0f) {
                    m6 = new M6(0.0f, null, null);
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    u.a.getLocationInWindow(new int[2]);
                    Pair pair = new Pair(Float.valueOf(r7[0]), Float.valueOf(r7[1]));
                    float floatValue = ((Number) pair.component1()).floatValue();
                    float floatValue2 = ((Number) pair.component2()).floatValue();
                    Iterator it = a.b.iterator();
                    while (it.hasNext()) {
                        RectF rectF2 = (RectF) it.next();
                        arrayList2.add(new RectF(rectF2.left - floatValue, rectF2.top - floatValue2, rectF2.right - floatValue, rectF2.bottom - floatValue2));
                    }
                    ArrayList arrayList3 = a.b;
                    if (arrayList3.isEmpty()) {
                        f = 0.0f;
                    } else {
                        Iterator it2 = arrayList3.iterator();
                        f = 0.0f;
                        while (it2.hasNext()) {
                            RectF rectF3 = (RectF) it2.next();
                            f += rectF3.height() * rectF3.width();
                        }
                    }
                    float min = Math.min(f, measuredHeight);
                    RectF rectF4 = new RectF(rectF);
                    float width = rectF4.width();
                    float height = rectF4.height();
                    float a2 = N3.a(Math.min((Math.max(0.0f, ((width <= 0.0f || height <= 0.0f) ? 0.0f : Math.max(0.0f, width * height)) - min) / measuredHeight) * 100.0f, 100.0f));
                    N6 n6 = new N6(Math.max(0.0f, N3.a(rectF.left / R5.b())), Math.max(0.0f, N3.a(rectF.top / R5.b())), Math.max(0, N3.b(rectF.width() / R5.b())), Math.max(0, N3.b(rectF.height() / R5.b())));
                    if (!arrayList2.isEmpty()) {
                        ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
                        Iterator it3 = arrayList2.iterator();
                        while (it3.hasNext()) {
                            RectF rectF5 = (RectF) it3.next();
                            arrayList4.add(new N6(Math.max(0.0f, N3.a(rectF5.left / R5.b())), Math.max(0.0f, N3.a(rectF5.top / R5.b())), Math.max(0, N3.b(rectF5.width() / R5.b())), Math.max(0, N3.b(N3.b(rectF5.height()) / R5.b()))));
                        }
                        arrayList = new ArrayList(CollectionsKt.sortedWith(arrayList4, new P()));
                    }
                    m6 = new M6(a2, n6, arrayList);
                }
            }
        }
        U u2 = this.a;
        if (Intrinsics.areEqual(m6, u2.h)) {
            return;
        }
        ((C4133ki) u2.d).a(m6);
        u2.h = m6;
    }
}
