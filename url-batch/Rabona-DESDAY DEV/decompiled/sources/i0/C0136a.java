package i0;

import P0.e;
import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import com.linetic.luckycross.R;
import i1.s;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: i0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0136a {
    public static volatile C0136a d;

    /* renamed from: e, reason: collision with root package name */
    public static final Object f2381e = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Context f2384c;

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f2383b = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f2382a = new HashMap();

    public C0136a(Context context) {
        this.f2384c = context.getApplicationContext();
    }

    public static C0136a c(Context context) {
        if (d == null) {
            synchronized (f2381e) {
                try {
                    if (d == null) {
                        d = new C0136a(context);
                    }
                } finally {
                }
            }
        }
        return d;
    }

    public final void a(Bundle bundle) {
        HashSet hashSet;
        String string = this.f2384c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    hashSet = this.f2383b;
                    if (!hasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (InterfaceC0137b.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    b((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e2) {
                throw new e(e2);
            }
        }
    }

    public final Object b(Class cls, HashSet hashSet) {
        Object obj;
        if (s.m()) {
            try {
                Trace.beginSection(cls.getSimpleName());
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        HashMap hashMap = this.f2382a;
        if (hashMap.containsKey(cls)) {
            obj = hashMap.get(cls);
        } else {
            hashSet.add(cls);
            try {
                InterfaceC0137b interfaceC0137b = (InterfaceC0137b) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> a2 = interfaceC0137b.a();
                if (!a2.isEmpty()) {
                    for (Class cls2 : a2) {
                        if (!hashMap.containsKey(cls2)) {
                            b(cls2, hashSet);
                        }
                    }
                }
                obj = interfaceC0137b.b(this.f2384c);
                hashSet.remove(cls);
                hashMap.put(cls, obj);
            } catch (Throwable th2) {
                throw new e(th2);
            }
        }
        Trace.endSection();
        return obj;
    }
}
