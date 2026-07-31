package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.r4, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C5635r4 {
    public final Object a;
    public final C5688t5 b;
    public final HashMap c;
    public final Pa d;
    public final Context e;
    public final C5843z4 f;

    public C5635r4(Context context, C5688t5 c5688t5) {
        this(context, c5688t5, new C5843z4());
    }

    public final InterfaceC5765w4 a(C5350g4 c5350g4, G4 g4) {
        InterfaceC5765w4 interfaceC5765w4;
        synchronized (this.a) {
            try {
                interfaceC5765w4 = (InterfaceC5765w4) this.c.get(c5350g4);
                if (interfaceC5765w4 == null) {
                    this.f.getClass();
                    interfaceC5765w4 = C5843z4.a(c5350g4).a(this.e, this.b, c5350g4, g4);
                    this.c.put(c5350g4, interfaceC5765w4);
                    this.d.a(new C5610q4(c5350g4.b, c5350g4.c, c5350g4.d), c5350g4);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC5765w4;
    }

    public C5635r4(Context context, C5688t5 c5688t5, C5843z4 c5843z4) {
        this.a = new Object();
        this.c = new HashMap();
        this.d = new Pa();
        this.e = context.getApplicationContext();
        this.b = c5688t5;
        this.f = c5843z4;
    }

    public final void a(String str, Integer num, String str2) {
        synchronized (this.a) {
            try {
                Pa pa = this.d;
                Collection collection = (Collection) pa.a.remove(new C5610q4(str, num, str2));
                if (!Do.a(collection)) {
                    collection.size();
                    ArrayList arrayList = new ArrayList(collection.size());
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        arrayList.add((InterfaceC5765w4) this.c.remove((C5350g4) it.next()));
                    }
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        ((InterfaceC5765w4) it2.next()).a();
                    }
                }
            } finally {
            }
        }
    }
}
