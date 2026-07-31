package com.inmobi.media;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes14.dex */
public abstract class Yb {
    public static ArrayList a() {
        CopyOnWriteArrayList copyOnWriteArrayList = Zb.a;
        ArrayList arrayList = new ArrayList();
        try {
            Iterator it = Zb.a.iterator();
            while (it.hasNext()) {
                Xh xh = (Xh) ((WeakReference) it.next()).get();
                if (xh != null) {
                    arrayList.add(xh);
                }
            }
        } catch (Exception e) {
            Lazy lazy = AbstractC3861aa.a;
            AbstractC4361t9.a(e);
        }
        CopyOnWriteArrayList copyOnWriteArrayList2 = Zb.a;
        arrayList.toString();
        return arrayList;
    }

    public static void b(Xh logger) {
        Intrinsics.checkNotNullParameter(logger, "logger");
        CopyOnWriteArrayList copyOnWriteArrayList = Zb.a;
        Objects.toString(logger);
        Zb.a.add(new WeakReference(logger));
    }

    public static boolean a(String fileName) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        CopyOnWriteArrayList copyOnWriteArrayList = Zb.a;
        try {
            Iterator it = Zb.a.iterator();
            while (it.hasNext()) {
                Xh xh = (Xh) ((WeakReference) it.next()).get();
                if (Intrinsics.areEqual(xh != null ? xh.j : null, fileName)) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            Lazy lazy = AbstractC3861aa.a;
            AbstractC4361t9.a(e);
            return false;
        }
    }

    public static void a(Xh xh) {
        CopyOnWriteArrayList copyOnWriteArrayList = Zb.a;
        Objects.toString(xh);
        if (xh == null) {
            return;
        }
        try {
            Iterator it = Zb.a.iterator();
            Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                if (weakReference.get() != null && !Intrinsics.areEqual(weakReference.get(), xh)) {
                }
                Zb.a.remove(weakReference);
            }
        } catch (Exception e) {
            Lazy lazy = AbstractC3861aa.a;
            AbstractC4361t9.a(e);
        }
    }
}
