package o;

import B.c;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import com.cosmiclabyrinth.stellarpath.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: o.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0089a {

    /* renamed from: d, reason: collision with root package name */
    public static volatile C0089a f1108d;

    /* renamed from: e, reason: collision with root package name */
    public static final Object f1109e = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Context f1112c;

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f1111b = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f1110a = new HashMap();

    public C0089a(Context context) {
        this.f1112c = context.getApplicationContext();
    }

    public static C0089a c(Context context) {
        if (f1108d == null) {
            synchronized (f1109e) {
                try {
                    if (f1108d == null) {
                        f1108d = new C0089a(context);
                    }
                } finally {
                }
            }
        }
        return f1108d;
    }

    public final void a(Bundle bundle) {
        HashSet hashSet;
        String string = this.f1112c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    hashSet = this.f1111b;
                    if (!hasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (b.class.isAssignableFrom(cls)) {
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

    public final void b(Class cls, HashSet hashSet) {
        boolean z2;
        if (Build.VERSION.SDK_INT >= 29) {
            z2 = p.a.c();
        } else {
            try {
                if (a.a.f406b == null) {
                    a.a.f405a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                    a.a.f406b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
                }
                z2 = ((Boolean) a.a.f406b.invoke(null, Long.valueOf(a.a.f405a))).booleanValue();
            } catch (Exception e2) {
                a.a.n("isTagEnabled", e2);
                z2 = false;
            }
        }
        if (z2) {
            try {
                Trace.beginSection(a.a.C(cls.getSimpleName()));
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        HashMap hashMap = this.f1110a;
        if (hashMap.containsKey(cls)) {
            hashMap.get(cls);
        } else {
            hashSet.add(cls);
            try {
                b bVar = (b) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> a2 = bVar.a();
                if (!a2.isEmpty()) {
                    for (Class cls2 : a2) {
                        if (!hashMap.containsKey(cls2)) {
                            b(cls2, hashSet);
                        }
                    }
                }
                Object b2 = bVar.b(this.f1112c);
                hashSet.remove(cls);
                hashMap.put(cls, b2);
            } catch (Throwable th2) {
                throw new c(th2);
            }
        }
        Trace.endSection();
    }
}
