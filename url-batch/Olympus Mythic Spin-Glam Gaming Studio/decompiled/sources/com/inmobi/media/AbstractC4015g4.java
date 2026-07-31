package com.inmobi.media;

import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.g4, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public abstract class AbstractC4015g4 {
    public static final C4277q4 a = new C4277q4(new C4329s4(), new C4302r4(L9.c));

    public static void a(String type, A4 listener) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(listener, "listener");
        C4277q4 c4277q4 = a;
        c4277q4.getClass();
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(listener, "listener");
        LinkedHashMap linkedHashMap = c4277q4.a.c;
        Object obj = linkedHashMap.get(type);
        if (obj == null) {
            obj = new ConcurrentLinkedQueue();
            linkedHashMap.put(type, obj);
        }
        ((ConcurrentLinkedQueue) obj).add(new WeakReference(listener));
    }
}
