package com.five_corp.ad.internal.util;

import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes12.dex */
public final class d {
    public ArrayList a = new ArrayList();

    public final void a(AbstractCollection abstractCollection) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            Object obj = weakReference.get();
            if (obj != null) {
                arrayList.add(weakReference);
                abstractCollection.add(obj);
            }
        }
        this.a = arrayList;
    }
}
