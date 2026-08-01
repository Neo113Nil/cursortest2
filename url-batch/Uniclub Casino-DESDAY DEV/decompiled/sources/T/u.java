package T;

import X.AbstractComponentCallbacksC0048q;
import X.C0037f;
import X.L;
import X.O;
import X.U;
import android.content.Context;
import android.graphics.Typeface;
import android.util.Log;
import android.util.SparseArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import j.AbstractC0148a;
import java.io.InterruptedIOException;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import k.MenuC0152B;
import k.MenuC0168m;
import k.MenuItemC0175t;

/* loaded from: classes.dex */
public final class u implements G.b {

    /* renamed from: a, reason: collision with root package name */
    public Object f750a;

    /* renamed from: b, reason: collision with root package name */
    public Object f751b;

    /* renamed from: c, reason: collision with root package name */
    public Object f752c;
    public Object d;

    public u(int i) {
        switch (i) {
            case 3:
                this.f751b = new ArrayDeque();
                this.f752c = new ArrayDeque();
                this.d = new ArrayDeque();
                break;
            case 4:
                this.d = new LinkedHashMap();
                this.f751b = "GET";
                this.f752c = new C.g(26);
                break;
            case 5:
            default:
                this.f750a = new ArrayList();
                this.f751b = new HashMap();
                this.f752c = new HashMap();
                break;
            case 6:
                this.f750a = new o.b();
                this.f751b = new SparseArray();
                this.f752c = new o.e();
                this.d = new o.b();
                break;
            case 7:
                this.f750a = new J.b(10);
                this.f751b = new o.k();
                this.f752c = new ArrayList();
                this.d = new HashSet();
                break;
        }
    }

    public void a(AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q) {
        if (((ArrayList) this.f750a).contains(abstractComponentCallbacksC0048q)) {
            throw new IllegalStateException("Fragment already added: " + abstractComponentCallbacksC0048q);
        }
        synchronized (((ArrayList) this.f750a)) {
            ((ArrayList) this.f750a).add(abstractComponentCallbacksC0048q);
        }
        abstractComponentCallbacksC0048q.f976k = true;
    }

    public H.e b() {
        Map unmodifiableMap;
        i1.n nVar = (i1.n) this.f750a;
        if (nVar == null) {
            throw new IllegalStateException("url == null");
        }
        String str = (String) this.f751b;
        i1.l t2 = ((C.g) this.f752c).t();
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.d;
        byte[] bArr = j1.b.f2609a;
        X0.d.e(linkedHashMap, "<this>");
        if (linkedHashMap.isEmpty()) {
            unmodifiableMap = Q0.r.f669a;
        } else {
            unmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(linkedHashMap));
            X0.d.d(unmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
        }
        return new H.e(nVar, str, t2, null, unmodifiableMap);
    }

    public void c(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((o.k) this.f751b).getOrDefault(obj, null);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                c(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    public AbstractComponentCallbacksC0048q d(String str) {
        O o2 = (O) ((HashMap) this.f751b).get(str);
        if (o2 != null) {
            return o2.f859c;
        }
        return null;
    }

    public AbstractComponentCallbacksC0048q e(String str) {
        for (O o2 : ((HashMap) this.f751b).values()) {
            if (o2 != null) {
                AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = o2.f859c;
                if (!str.equals(abstractComponentCallbacksC0048q.f972e)) {
                    abstractComponentCallbacksC0048q = abstractComponentCallbacksC0048q.f985t.f814c.e(str);
                }
                if (abstractComponentCallbacksC0048q != null) {
                    return abstractComponentCallbacksC0048q;
                }
            }
        }
        return null;
    }

    public void f(m1.g gVar) {
        X0.d.e(gVar, "call");
        gVar.f3230b.decrementAndGet();
        ArrayDeque arrayDeque = (ArrayDeque) this.f752c;
        synchronized (this) {
            if (!arrayDeque.remove(gVar)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        r();
    }

    public j.e g(AbstractC0148a abstractC0148a) {
        ArrayList arrayList = (ArrayList) this.f752c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            j.e eVar = (j.e) arrayList.get(i);
            if (eVar != null && eVar.f2562b == abstractC0148a) {
                return eVar;
            }
        }
        j.e eVar2 = new j.e((Context) this.f751b, abstractC0148a);
        arrayList.add(eVar2);
        return eVar2;
    }

    public ArrayList h() {
        ArrayList arrayList = new ArrayList();
        for (O o2 : ((HashMap) this.f751b).values()) {
            if (o2 != null) {
                arrayList.add(o2);
            }
        }
        return arrayList;
    }

    public ArrayList i() {
        ArrayList arrayList = new ArrayList();
        for (O o2 : ((HashMap) this.f751b).values()) {
            if (o2 != null) {
                arrayList.add(o2.f859c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public List j() {
        ArrayList arrayList;
        if (((ArrayList) this.f750a).isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (((ArrayList) this.f750a)) {
            arrayList = new ArrayList((ArrayList) this.f750a);
        }
        return arrayList;
    }

    @Override // G.b
    public void k() {
        View view = (View) this.f750a;
        view.clearAnimation();
        ((ViewGroup) this.f751b).endViewTransition(view);
        ((C0037f) this.f752c).d();
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animation from operation " + ((U) this.d) + " has been cancelled.");
        }
    }

    public void l(String str, String str2) {
        X0.d.e(str2, "value");
        C.g gVar = (C.g) this.f752c;
        gVar.getClass();
        i1.k.f(str);
        i1.k.h(str2, str);
        gVar.A(str);
        gVar.s(str, str2);
    }

    public void m(O o2) {
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = o2.f859c;
        String str = abstractComponentCallbacksC0048q.f972e;
        HashMap hashMap = (HashMap) this.f751b;
        if (hashMap.get(str) != null) {
            return;
        }
        hashMap.put(abstractComponentCallbacksC0048q.f972e, o2);
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Added fragment to active set " + abstractComponentCallbacksC0048q);
        }
    }

    public void n(O o2) {
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = o2.f859c;
        if (abstractComponentCallbacksC0048q.f952A) {
            ((L) this.d).e(abstractComponentCallbacksC0048q);
        }
        if (((O) ((HashMap) this.f751b).put(abstractComponentCallbacksC0048q.f972e, null)) != null && Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + abstractComponentCallbacksC0048q);
        }
    }

    public void o(String str, i1.k kVar) {
        X0.d.e(str, "method");
        if (str.length() <= 0) {
            throw new IllegalArgumentException("method.isEmpty() == true");
        }
        if (kVar == null) {
            if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT")) {
                throw new IllegalArgumentException(("method " + str + " must have a request body.").toString());
            }
        } else if (!i1.k.r(str)) {
            throw new IllegalArgumentException(("method " + str + " must not have a request body.").toString());
        }
        this.f751b = str;
    }

    public boolean p(AbstractC0148a abstractC0148a, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f750a).onActionItemClicked(g(abstractC0148a), new MenuItemC0175t((Context) this.f751b, (E.a) menuItem));
    }

    public boolean q(AbstractC0148a abstractC0148a, MenuC0168m menuC0168m) {
        j.e g2 = g(abstractC0148a);
        o.k kVar = (o.k) this.d;
        Menu menu = (Menu) kVar.getOrDefault(menuC0168m, null);
        if (menu == null) {
            menu = new MenuC0152B((Context) this.f751b, menuC0168m);
            kVar.put(menuC0168m, menu);
        }
        return ((ActionMode.Callback) this.f750a).onCreateActionMode(g2, menu);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void r() {
        int size;
        int i;
        ThreadPoolExecutor threadPoolExecutor;
        byte[] bArr = j1.b.f2609a;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator it = ((ArrayDeque) this.f751b).iterator();
                X0.d.d(it, "readyAsyncCalls.iterator()");
                while (it.hasNext()) {
                    m1.g gVar = (m1.g) it.next();
                    if (((ArrayDeque) this.f752c).size() >= 64) {
                        break;
                    }
                    if (gVar.f3230b.get() < 5) {
                        it.remove();
                        gVar.f3230b.incrementAndGet();
                        arrayList.add(gVar);
                        ((ArrayDeque) this.f752c).add(gVar);
                    }
                }
                synchronized (this) {
                    ((ArrayDeque) this.f752c).size();
                    ((ArrayDeque) this.d).size();
                }
                size = arrayList.size();
                for (i = 0; i < size; i++) {
                    m1.g gVar2 = (m1.g) arrayList.get(i);
                    synchronized (this) {
                        try {
                            if (((ThreadPoolExecutor) this.f750a) == null) {
                                TimeUnit timeUnit = TimeUnit.SECONDS;
                                SynchronousQueue synchronousQueue = new SynchronousQueue();
                                String str = j1.b.f2613f + " Dispatcher";
                                X0.d.e(str, "name");
                                this.f750a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, new j1.a(str, false));
                            }
                            threadPoolExecutor = (ThreadPoolExecutor) this.f750a;
                            X0.d.b(threadPoolExecutor);
                        } finally {
                        }
                    }
                    gVar2.getClass();
                    m1.j jVar = gVar2.f3231c;
                    byte[] bArr2 = j1.b.f2609a;
                    try {
                        try {
                            threadPoolExecutor.execute(gVar2);
                        } catch (RejectedExecutionException e2) {
                            InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                            interruptedIOException.initCause(e2);
                            jVar.h(interruptedIOException);
                            gVar2.f3229a.B(jVar, interruptedIOException);
                            jVar.f3234a.f2488a.f(gVar2);
                        }
                    } catch (Throwable th) {
                        jVar.f3234a.f2488a.f(gVar2);
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        size = arrayList.size();
        while (i < size) {
        }
    }

    public u(Typeface typeface, U.b bVar) {
        int i;
        int i2;
        this.d = typeface;
        this.f750a = bVar;
        this.f752c = new t(1024);
        int a2 = bVar.a(6);
        if (a2 != 0) {
            int i3 = a2 + bVar.f350a;
            i = ((ByteBuffer) bVar.d).getInt(((ByteBuffer) bVar.d).getInt(i3) + i3);
        } else {
            i = 0;
        }
        this.f751b = new char[i * 2];
        int a3 = bVar.a(6);
        if (a3 != 0) {
            int i4 = a3 + bVar.f350a;
            i2 = ((ByteBuffer) bVar.d).getInt(((ByteBuffer) bVar.d).getInt(i4) + i4);
        } else {
            i2 = 0;
        }
        for (int i5 = 0; i5 < i2; i5++) {
            x xVar = new x(this, i5);
            U.a c2 = xVar.c();
            int a4 = c2.a(4);
            Character.toChars(a4 != 0 ? ((ByteBuffer) c2.d).getInt(a4 + c2.f350a) : 0, (char[]) this.f751b, i5 * 2);
            q1.l.l("invalid metadata codepoint length", xVar.b() > 0);
            ((t) this.f752c).a(xVar, 0, xVar.b() - 1);
        }
    }
}
