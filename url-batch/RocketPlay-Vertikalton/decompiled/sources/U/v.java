package U;

import Y.AbstractComponentCallbacksC0055q;
import Y.C0044f;
import Y.L;
import Y.O;
import Y.U;
import a1.AbstractC0067d;
import android.content.Context;
import android.graphics.Typeface;
import android.util.Log;
import android.util.SparseArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import c1.AbstractC0104b;
import j.AbstractC0175a;
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
import k.MenuC0186B;
import k.MenuC0202m;
import k.MenuItemC0209t;
import l.C0265n;

/* loaded from: classes.dex */
public final class v implements G.b {

    /* renamed from: a, reason: collision with root package name */
    public Object f1207a;

    /* renamed from: b, reason: collision with root package name */
    public Object f1208b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1209c;
    public Object d;

    public v(int i) {
        switch (i) {
            case 4:
                this.f1207a = new o.b();
                this.f1208b = new SparseArray();
                this.f1209c = new o.e();
                this.d = new o.b();
                break;
            case 5:
                this.f1207a = new J.b(10);
                this.f1208b = new o.k();
                this.f1209c = new ArrayList();
                this.d = new HashSet();
                break;
            case 6:
                this.f1208b = new ArrayDeque();
                this.f1209c = new ArrayDeque();
                this.d = new ArrayDeque();
                break;
            case 7:
                this.d = new LinkedHashMap();
                this.f1208b = "GET";
                this.f1209c = new C0265n(5);
                break;
            default:
                this.f1207a = new ArrayList();
                this.f1208b = new HashMap();
                this.f1209c = new HashMap();
                break;
        }
    }

    public void a(AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q) {
        if (((ArrayList) this.f1207a).contains(abstractComponentCallbacksC0055q)) {
            throw new IllegalStateException("Fragment already added: " + abstractComponentCallbacksC0055q);
        }
        synchronized (((ArrayList) this.f1207a)) {
            ((ArrayList) this.f1207a).add(abstractComponentCallbacksC0055q);
        }
        abstractComponentCallbacksC0055q.f1506k = true;
    }

    public H.e b() {
        Map unmodifiableMap;
        x1.l lVar = (x1.l) this.f1207a;
        if (lVar == null) {
            throw new IllegalStateException("url == null");
        }
        String str = (String) this.f1208b;
        x1.j i = ((C0265n) this.f1209c).i();
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.d;
        byte[] bArr = y1.b.f4648a;
        i1.f.e(linkedHashMap, "<this>");
        if (linkedHashMap.isEmpty()) {
            unmodifiableMap = W0.t.f1285a;
        } else {
            unmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(linkedHashMap));
            i1.f.d(unmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
        }
        return new H.e(lVar, str, i, null, unmodifiableMap);
    }

    public void c(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((o.k) this.f1208b).getOrDefault(obj, null);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                c(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    public AbstractComponentCallbacksC0055q d(String str) {
        O o2 = (O) ((HashMap) this.f1208b).get(str);
        if (o2 != null) {
            return o2.f1389c;
        }
        return null;
    }

    public AbstractComponentCallbacksC0055q e(String str) {
        for (O o2 : ((HashMap) this.f1208b).values()) {
            if (o2 != null) {
                AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q = o2.f1389c;
                if (!str.equals(abstractComponentCallbacksC0055q.f1502e)) {
                    abstractComponentCallbacksC0055q = abstractComponentCallbacksC0055q.f1515t.f1344c.e(str);
                }
                if (abstractComponentCallbacksC0055q != null) {
                    return abstractComponentCallbacksC0055q;
                }
            }
        }
        return null;
    }

    public void f(B1.g gVar) {
        i1.f.e(gVar, "call");
        gVar.f185b.decrementAndGet();
        ArrayDeque arrayDeque = (ArrayDeque) this.f1209c;
        synchronized (this) {
            if (!arrayDeque.remove(gVar)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        r();
    }

    public j.e g(AbstractC0175a abstractC0175a) {
        ArrayList arrayList = (ArrayList) this.f1209c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            j.e eVar = (j.e) arrayList.get(i);
            if (eVar != null && eVar.f3065b == abstractC0175a) {
                return eVar;
            }
        }
        j.e eVar2 = new j.e((Context) this.f1208b, abstractC0175a);
        arrayList.add(eVar2);
        return eVar2;
    }

    public ArrayList h() {
        ArrayList arrayList = new ArrayList();
        for (O o2 : ((HashMap) this.f1208b).values()) {
            if (o2 != null) {
                arrayList.add(o2);
            }
        }
        return arrayList;
    }

    public ArrayList i() {
        ArrayList arrayList = new ArrayList();
        for (O o2 : ((HashMap) this.f1208b).values()) {
            if (o2 != null) {
                arrayList.add(o2.f1389c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public List j() {
        ArrayList arrayList;
        if (((ArrayList) this.f1207a).isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (((ArrayList) this.f1207a)) {
            arrayList = new ArrayList((ArrayList) this.f1207a);
        }
        return arrayList;
    }

    @Override // G.b
    public void k() {
        View view = (View) this.f1207a;
        view.clearAnimation();
        ((ViewGroup) this.f1208b).endViewTransition(view);
        ((C0044f) this.f1209c).d();
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animation from operation " + ((U) this.d) + " has been cancelled.");
        }
    }

    public void l(String str, String str2) {
        i1.f.e(str2, "value");
        C0265n c0265n = (C0265n) this.f1209c;
        c0265n.getClass();
        AbstractC0104b.e(str);
        AbstractC0104b.f(str2, str);
        c0265n.j(str);
        c0265n.h(str, str2);
    }

    public void m(O o2) {
        AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q = o2.f1389c;
        String str = abstractComponentCallbacksC0055q.f1502e;
        HashMap hashMap = (HashMap) this.f1208b;
        if (hashMap.get(str) != null) {
            return;
        }
        hashMap.put(abstractComponentCallbacksC0055q.f1502e, o2);
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Added fragment to active set " + abstractComponentCallbacksC0055q);
        }
    }

    public void n(O o2) {
        AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q = o2.f1389c;
        if (abstractComponentCallbacksC0055q.f1482A) {
            ((L) this.d).e(abstractComponentCallbacksC0055q);
        }
        if (((O) ((HashMap) this.f1208b).put(abstractComponentCallbacksC0055q.f1502e, null)) != null && Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + abstractComponentCallbacksC0055q);
        }
    }

    public void o(String str, AbstractC0067d abstractC0067d) {
        i1.f.e(str, "method");
        if (str.length() <= 0) {
            throw new IllegalArgumentException("method.isEmpty() == true");
        }
        if (abstractC0067d == null) {
            if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT")) {
                throw new IllegalArgumentException(("method " + str + " must have a request body.").toString());
            }
        } else if (!F1.l.d0(str)) {
            throw new IllegalArgumentException(("method " + str + " must not have a request body.").toString());
        }
        this.f1208b = str;
    }

    public boolean p(AbstractC0175a abstractC0175a, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f1207a).onActionItemClicked(g(abstractC0175a), new MenuItemC0209t((Context) this.f1208b, (E.a) menuItem));
    }

    public boolean q(AbstractC0175a abstractC0175a, MenuC0202m menuC0202m) {
        j.e g2 = g(abstractC0175a);
        o.k kVar = (o.k) this.d;
        Menu menu = (Menu) kVar.getOrDefault(menuC0202m, null);
        if (menu == null) {
            menu = new MenuC0186B((Context) this.f1208b, menuC0202m);
            kVar.put(menuC0202m, menu);
        }
        return ((ActionMode.Callback) this.f1207a).onCreateActionMode(g2, menu);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void r() {
        int size;
        int i;
        ThreadPoolExecutor threadPoolExecutor;
        byte[] bArr = y1.b.f4648a;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator it = ((ArrayDeque) this.f1208b).iterator();
                i1.f.d(it, "readyAsyncCalls.iterator()");
                while (it.hasNext()) {
                    B1.g gVar = (B1.g) it.next();
                    if (((ArrayDeque) this.f1209c).size() >= 64) {
                        break;
                    }
                    if (gVar.f185b.get() < 5) {
                        it.remove();
                        gVar.f185b.incrementAndGet();
                        arrayList.add(gVar);
                        ((ArrayDeque) this.f1209c).add(gVar);
                    }
                }
                synchronized (this) {
                    ((ArrayDeque) this.f1209c).size();
                    ((ArrayDeque) this.d).size();
                }
                size = arrayList.size();
                for (i = 0; i < size; i++) {
                    B1.g gVar2 = (B1.g) arrayList.get(i);
                    synchronized (this) {
                        try {
                            if (((ThreadPoolExecutor) this.f1207a) == null) {
                                TimeUnit timeUnit = TimeUnit.SECONDS;
                                SynchronousQueue synchronousQueue = new SynchronousQueue();
                                String str = y1.b.f4653g + " Dispatcher";
                                i1.f.e(str, "name");
                                this.f1207a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, new y1.a(str, false));
                            }
                            threadPoolExecutor = (ThreadPoolExecutor) this.f1207a;
                            i1.f.b(threadPoolExecutor);
                        } finally {
                        }
                    }
                    gVar2.getClass();
                    B1.j jVar = gVar2.f186c;
                    byte[] bArr2 = y1.b.f4648a;
                    try {
                        try {
                            threadPoolExecutor.execute(gVar2);
                        } catch (RejectedExecutionException e2) {
                            InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                            interruptedIOException.initCause(e2);
                            jVar.h(interruptedIOException);
                            gVar2.f184a.E(jVar, interruptedIOException);
                            jVar.f189a.f4562a.f(gVar2);
                        }
                    } catch (Throwable th) {
                        jVar.f189a.f4562a.f(gVar2);
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

    public v(Typeface typeface, V.b bVar) {
        int i;
        int i2;
        this.d = typeface;
        this.f1207a = bVar;
        this.f1209c = new u(1024);
        int a2 = bVar.a(6);
        if (a2 != 0) {
            int i3 = a2 + bVar.f623a;
            i = ((ByteBuffer) bVar.d).getInt(((ByteBuffer) bVar.d).getInt(i3) + i3);
        } else {
            i = 0;
        }
        this.f1208b = new char[i * 2];
        int a3 = bVar.a(6);
        if (a3 != 0) {
            int i4 = a3 + bVar.f623a;
            i2 = ((ByteBuffer) bVar.d).getInt(((ByteBuffer) bVar.d).getInt(i4) + i4);
        } else {
            i2 = 0;
        }
        for (int i5 = 0; i5 < i2; i5++) {
            y yVar = new y(this, i5);
            V.a c2 = yVar.c();
            int a4 = c2.a(4);
            Character.toChars(a4 != 0 ? ((ByteBuffer) c2.d).getInt(a4 + c2.f623a) : 0, (char[]) this.f1208b, i5 * 2);
            F1.l.h("invalid metadata codepoint length", yVar.b() > 0);
            ((u) this.f1209c).a(yVar, 0, yVar.b() - 1);
        }
    }
}
