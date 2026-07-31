package com.inmobi.media;

import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public abstract class B9 {
    public static final CopyOnWriteArrayList a = new CopyOnWriteArrayList();
    public static final AtomicBoolean b = new AtomicBoolean(false);
    public static final C4519z9 c = new C4519z9();

    public static void a(Wb finishListener) {
        Intrinsics.checkNotNullParameter(finishListener, "finishListener");
        if (!b.getAndSet(true)) {
            Hl.a(new A9(null));
        }
        CopyOnWriteArrayList copyOnWriteArrayList = a;
        copyOnWriteArrayList.add(new WeakReference(finishListener));
        try {
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                if (weakReference.get() == null) {
                    a.remove(weakReference);
                }
            }
        } catch (Exception e) {
            Lazy lazy = AbstractC3861aa.a;
            AbstractC4361t9.a(e);
        }
    }
}
