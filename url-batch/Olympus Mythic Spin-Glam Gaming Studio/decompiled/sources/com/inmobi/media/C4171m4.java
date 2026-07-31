package com.inmobi.media;

import com.inmobi.media.core.config.models.Config;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* renamed from: com.inmobi.media.m4, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4171m4 implements FlowCollector {
    public final /* synthetic */ C4277q4 a;

    public C4171m4(C4277q4 c4277q4) {
        this.a = c4277q4;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        Config config = (Config) obj;
        this.a.a.b.put(config.getType(), config);
        C4277q4 c4277q4 = this.a;
        ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) c4277q4.a.c.get(config.getType());
        if (concurrentLinkedQueue != null) {
            Iterator it = concurrentLinkedQueue.iterator();
            while (it.hasNext()) {
                A4 a4 = (A4) ((WeakReference) it.next()).get();
                if (a4 != null) {
                    a4.a(config);
                }
            }
        }
        c4277q4.a.c.remove(config.getType());
        return Unit.INSTANCE;
    }
}
