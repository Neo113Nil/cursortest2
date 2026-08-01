package m0;

import V0.c;
import a1.AbstractC0067d;
import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import com.luckycounter.drinkwater.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: m0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0294a {
    public static volatile C0294a d;

    /* renamed from: e, reason: collision with root package name */
    public static final Object f3553e = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Context f3556c;

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f3555b = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f3554a = new HashMap();

    public C0294a(Context context) {
        this.f3556c = context.getApplicationContext();
    }

    public static C0294a c(Context context) {
        if (d == null) {
            synchronized (f3553e) {
                try {
                    if (d == null) {
                        d = new C0294a(context);
                    }
                } finally {
                }
            }
        }
        return d;
    }

    public final void a(Bundle bundle) {
        HashSet hashSet;
        String string = this.f3556c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    hashSet = this.f3555b;
                    if (!hasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (InterfaceC0295b.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    b((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e2) {
                throw new c(e2);
            }
        }
    }

    public final Object b(Class cls, HashSet hashSet) {
        Object obj;
        if (AbstractC0067d.n()) {
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
        HashMap hashMap = this.f3554a;
        if (hashMap.containsKey(cls)) {
            obj = hashMap.get(cls);
        } else {
            hashSet.add(cls);
            try {
                InterfaceC0295b interfaceC0295b = (InterfaceC0295b) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> a2 = interfaceC0295b.a();
                if (!a2.isEmpty()) {
                    for (Class cls2 : a2) {
                        if (!hashMap.containsKey(cls2)) {
                            b(cls2, hashSet);
                        }
                    }
                }
                obj = interfaceC0295b.b(this.f3556c);
                hashSet.remove(cls);
                hashMap.put(cls, obj);
            } catch (Throwable th2) {
                throw new c(th2);
            }
        }
        Trace.endSection();
        return obj;
    }
}
