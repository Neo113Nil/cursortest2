package androidx.room;

import j0.InterfaceC0182e;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class h extends y {
    public abstract void bind(InterfaceC0182e interfaceC0182e, Object obj);

    public final int handle(Object obj) {
        InterfaceC0182e acquire = acquire();
        try {
            bind(acquire, obj);
            return acquire.A();
        } finally {
            release(acquire);
        }
    }

    public final int handleMultiple(Iterable<Object> iterable) {
        i1.f.e(iterable, "entities");
        InterfaceC0182e acquire = acquire();
        try {
            Iterator<Object> it = iterable.iterator();
            int i = 0;
            while (it.hasNext()) {
                bind(acquire, it.next());
                i += acquire.A();
            }
            return i;
        } finally {
            release(acquire);
        }
    }

    public final int handleMultiple(Object[] objArr) {
        i1.f.e(objArr, "entities");
        InterfaceC0182e acquire = acquire();
        try {
            int i = 0;
            for (Object obj : objArr) {
                bind(acquire, obj);
                i += acquire.A();
            }
            return i;
        } finally {
            release(acquire);
        }
    }
}
