package T;

import X.AbstractComponentCallbacksC0049q;
import X.C0038f;
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
import j.AbstractC0138a;
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
import k.MenuC0142B;
import k.MenuC0158m;
import k.MenuItemC0165t;

/* loaded from: classes.dex */
public final class u implements G.b {

    /* renamed from: a, reason: collision with root package name */
    public Object f746a;

    /* renamed from: b, reason: collision with root package name */
    public Object f747b;

    /* renamed from: c, reason: collision with root package name */
    public Object f748c;
    public Object d;

    public u(int i) {
        switch (i) {
            case 3:
                this.f747b = new ArrayDeque();
                this.f748c = new ArrayDeque();
                this.d = new ArrayDeque();
                break;
            case 4:
                this.d = new LinkedHashMap();
                this.f747b = "GET";
                this.f748c = new B0.d(26);
                break;
            case 5:
            default:
                this.f746a = new ArrayList();
                this.f747b = new HashMap();
                this.f748c = new HashMap();
                break;
            case 6:
                this.f746a = new o.b();
                this.f747b = new SparseArray();
                this.f748c = new o.e();
                this.d = new o.b();
                break;
            case 7:
                this.f746a = new J.b(10);
                this.f747b = new o.k();
                this.f748c = new ArrayList();
                this.d = new HashSet();
                break;
        }
    }

    public void a(AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q) {
        if (((ArrayList) this.f746a).contains(abstractComponentCallbacksC0049q)) {
            throw new IllegalStateException("Fragment already added: " + abstractComponentCallbacksC0049q);
        }
        synchronized (((ArrayList) this.f746a)) {
            ((ArrayList) this.f746a).add(abstractComponentCallbacksC0049q);
        }
        abstractComponentCallbacksC0049q.f972k = true;
    }

    public H.e b() {
        Map unmodifiableMap;
        i1.m mVar = (i1.m) this.f746a;
        if (mVar == null) {
            throw new IllegalStateException("url == null");
        }
        String str = (String) this.f747b;
        i1.k t2 = ((B0.d) this.f748c).t();
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.d;
        byte[] bArr = j1.b.f2584a;
        X0.e.e(linkedHashMap, "<this>");
        if (linkedHashMap.isEmpty()) {
            unmodifiableMap = Q0.n.f665a;
        } else {
            unmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(linkedHashMap));
            X0.e.d(unmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
        }
        return new H.e(mVar, str, t2, null, unmodifiableMap);
    }

    public void c(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((o.k) this.f747b).getOrDefault(obj, null);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                c(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    public AbstractComponentCallbacksC0049q d(String str) {
        O o2 = (O) ((HashMap) this.f747b).get(str);
        if (o2 != null) {
            return o2.f855c;
        }
        return null;
    }

    public AbstractComponentCallbacksC0049q e(String str) {
        for (O o2 : ((HashMap) this.f747b).values()) {
            if (o2 != null) {
                AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q = o2.f855c;
                if (!str.equals(abstractComponentCallbacksC0049q.f968e)) {
                    abstractComponentCallbacksC0049q = abstractComponentCallbacksC0049q.f981t.f810c.e(str);
                }
                if (abstractComponentCallbacksC0049q != null) {
                    return abstractComponentCallbacksC0049q;
                }
            }
        }
        return null;
    }

    public void f(m1.g gVar) {
        X0.e.e(gVar, "call");
        gVar.f3205b.decrementAndGet();
        ArrayDeque arrayDeque = (ArrayDeque) this.f748c;
        synchronized (this) {
            if (!arrayDeque.remove(gVar)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        r();
    }

    public j.e g(AbstractC0138a abstractC0138a) {
        ArrayList arrayList = (ArrayList) this.f748c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            j.e eVar = (j.e) arrayList.get(i);
            if (eVar != null && eVar.f2537b == abstractC0138a) {
                return eVar;
            }
        }
        j.e eVar2 = new j.e((Context) this.f747b, abstractC0138a);
        arrayList.add(eVar2);
        return eVar2;
    }

    public ArrayList h() {
        ArrayList arrayList = new ArrayList();
        for (O o2 : ((HashMap) this.f747b).values()) {
            if (o2 != null) {
                arrayList.add(o2);
            }
        }
        return arrayList;
    }

    public ArrayList i() {
        ArrayList arrayList = new ArrayList();
        for (O o2 : ((HashMap) this.f747b).values()) {
            if (o2 != null) {
                arrayList.add(o2.f855c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public List j() {
        ArrayList arrayList;
        if (((ArrayList) this.f746a).isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (((ArrayList) this.f746a)) {
            arrayList = new ArrayList((ArrayList) this.f746a);
        }
        return arrayList;
    }

    @Override // G.b
    public void k() {
        View view = (View) this.f746a;
        view.clearAnimation();
        ((ViewGroup) this.f747b).endViewTransition(view);
        ((C0038f) this.f748c).d();
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animation from operation " + ((U) this.d) + " has been cancelled.");
        }
    }

    public void l(String str, String str2) {
        X0.e.e(str2, "value");
        B0.d dVar = (B0.d) this.f748c;
        dVar.getClass();
        q1.l.h(str);
        q1.l.k(str2, str);
        dVar.A(str);
        dVar.s(str, str2);
    }

    public void m(O o2) {
        AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q = o2.f855c;
        String str = abstractComponentCallbacksC0049q.f968e;
        HashMap hashMap = (HashMap) this.f747b;
        if (hashMap.get(str) != null) {
            return;
        }
        hashMap.put(abstractComponentCallbacksC0049q.f968e, o2);
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Added fragment to active set " + abstractComponentCallbacksC0049q);
        }
    }

    public void n(O o2) {
        AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q = o2.f855c;
        if (abstractComponentCallbacksC0049q.f948A) {
            ((L) this.d).e(abstractComponentCallbacksC0049q);
        }
        if (((O) ((HashMap) this.f747b).put(abstractComponentCallbacksC0049q.f968e, null)) != null && Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + abstractComponentCallbacksC0049q);
        }
    }

    public void o(String str, i1.r rVar) {
        X0.e.e(str, "method");
        if (str.length() <= 0) {
            throw new IllegalArgumentException("method.isEmpty() == true");
        }
        if (rVar == null) {
            if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT")) {
                throw new IllegalArgumentException(("method " + str + " must have a request body.").toString());
            }
        } else if (!i1.r.o(str)) {
            throw new IllegalArgumentException(("method " + str + " must not have a request body.").toString());
        }
        this.f747b = str;
    }

    public boolean p(AbstractC0138a abstractC0138a, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f746a).onActionItemClicked(g(abstractC0138a), new MenuItemC0165t((Context) this.f747b, (E.a) menuItem));
    }

    public boolean q(AbstractC0138a abstractC0138a, MenuC0158m menuC0158m) {
        j.e g2 = g(abstractC0138a);
        o.k kVar = (o.k) this.d;
        Menu menu = (Menu) kVar.getOrDefault(menuC0158m, null);
        if (menu == null) {
            menu = new MenuC0142B((Context) this.f747b, menuC0158m);
            kVar.put(menuC0158m, menu);
        }
        return ((ActionMode.Callback) this.f746a).onCreateActionMode(g2, menu);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void r() {
        int size;
        int i;
        ThreadPoolExecutor threadPoolExecutor;
        byte[] bArr = j1.b.f2584a;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator it = ((ArrayDeque) this.f747b).iterator();
                X0.e.d(it, "readyAsyncCalls.iterator()");
                while (it.hasNext()) {
                    m1.g gVar = (m1.g) it.next();
                    if (((ArrayDeque) this.f748c).size() >= 64) {
                        break;
                    }
                    if (gVar.f3205b.get() < 5) {
                        it.remove();
                        gVar.f3205b.incrementAndGet();
                        arrayList.add(gVar);
                        ((ArrayDeque) this.f748c).add(gVar);
                    }
                }
                synchronized (this) {
                    ((ArrayDeque) this.f748c).size();
                    ((ArrayDeque) this.d).size();
                }
                size = arrayList.size();
                for (i = 0; i < size; i++) {
                    m1.g gVar2 = (m1.g) arrayList.get(i);
                    synchronized (this) {
                        try {
                            if (((ThreadPoolExecutor) this.f746a) == null) {
                                TimeUnit timeUnit = TimeUnit.SECONDS;
                                SynchronousQueue synchronousQueue = new SynchronousQueue();
                                String str = j1.b.f2588f + " Dispatcher";
                                X0.e.e(str, "name");
                                this.f746a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, new j1.a(str, false));
                            }
                            threadPoolExecutor = (ThreadPoolExecutor) this.f746a;
                            X0.e.b(threadPoolExecutor);
                        } finally {
                        }
                    }
                    gVar2.getClass();
                    m1.j jVar = gVar2.f3206c;
                    byte[] bArr2 = j1.b.f2584a;
                    try {
                        try {
                            threadPoolExecutor.execute(gVar2);
                        } catch (RejectedExecutionException e2) {
                            InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                            interruptedIOException.initCause(e2);
                            jVar.h(interruptedIOException);
                            gVar2.f3204a.B(jVar, interruptedIOException);
                            jVar.f3209a.f2460a.f(gVar2);
                        }
                    } catch (Throwable th) {
                        jVar.f3209a.f2460a.f(gVar2);
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
        this.f746a = bVar;
        this.f748c = new t(1024);
        int a2 = bVar.a(6);
        if (a2 != 0) {
            int i3 = a2 + bVar.f371a;
            i = ((ByteBuffer) bVar.d).getInt(((ByteBuffer) bVar.d).getInt(i3) + i3);
        } else {
            i = 0;
        }
        this.f747b = new char[i * 2];
        int a3 = bVar.a(6);
        if (a3 != 0) {
            int i4 = a3 + bVar.f371a;
            i2 = ((ByteBuffer) bVar.d).getInt(((ByteBuffer) bVar.d).getInt(i4) + i4);
        } else {
            i2 = 0;
        }
        for (int i5 = 0; i5 < i2; i5++) {
            x xVar = new x(this, i5);
            U.a c2 = xVar.c();
            int a4 = c2.a(4);
            Character.toChars(a4 != 0 ? ((ByteBuffer) c2.d).getInt(a4 + c2.f371a) : 0, (char[]) this.f747b, i5 * 2);
            q1.l.f("invalid metadata codepoint length", xVar.b() > 0);
            ((t) this.f748c).a(xVar, 0, xVar.b() - 1);
        }
    }
}
