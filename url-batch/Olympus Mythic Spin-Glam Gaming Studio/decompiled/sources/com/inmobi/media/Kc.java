package com.inmobi.media;

import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Lazy;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class Kc {
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public final ExecutorService b;

    public Kc() {
        Intrinsics.checkNotNullParameter("MultiEventBus", "name");
        this.b = Executors.newSingleThreadExecutor(new M9("MultiEventBus", false));
    }

    public static final void a(N2 n2, Kc kc) {
        int i = n2.a;
        kc.a(n2);
    }

    public final void b(final N2 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        try {
            this.b.execute(new Runnable() { // from class: com.inmobi.media.Kc$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    Kc.a(N2.this, this);
                }
            });
        } catch (InternalError unused) {
            int i = event.a;
            a(event);
        }
    }

    public static final boolean a(int[] iArr, N2 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return ArraysKt.contains(iArr, event.a);
    }

    public final void a(final int[] eventIds, Function1 subscriber) {
        Intrinsics.checkNotNullParameter(eventIds, "eventIds");
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        this.a.put(new Function1() { // from class: com.inmobi.media.Kc$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(Kc.a(eventIds, (N2) obj));
            }
        }, new WeakReference(subscriber));
    }

    public final void a(Function1 subscriber) {
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        Iterator it = this.a.entrySet().iterator();
        while (it.hasNext()) {
            if (Intrinsics.areEqual(((WeakReference) ((Map.Entry) it.next()).getValue()).get(), subscriber)) {
                it.remove();
            }
        }
    }

    public final void a(N2 n2) {
        Function1 function1;
        Set<Map.Entry> entrySet = this.a.entrySet();
        Intrinsics.checkNotNullExpressionValue(entrySet, "<get-entries>(...)");
        for (Map.Entry entry : entrySet) {
            if (((WeakReference) entry.getValue()).get() == null) {
                this.a.remove(entry.getKey());
            }
        }
        Set<Map.Entry> entrySet2 = this.a.entrySet();
        Intrinsics.checkNotNullExpressionValue(entrySet2, "<get-entries>(...)");
        for (Map.Entry entry2 : entrySet2) {
            Intrinsics.checkNotNull(entry2);
            Object key = entry2.getKey();
            Intrinsics.checkNotNullExpressionValue(key, "component1(...)");
            Function1 function12 = (Function1) key;
            Object value = entry2.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "component2(...)");
            WeakReference weakReference = (WeakReference) value;
            try {
                if (((Boolean) function12.invoke(n2)).booleanValue() && (function1 = (Function1) weakReference.get()) != null) {
                    function1.invoke(n2);
                }
            } catch (Exception e) {
                Lazy lazy = AbstractC3861aa.a;
                AbstractC4361t9.a(e);
            }
        }
    }
}
