package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.SparseArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.a;
import java.io.InterruptedIOException;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class oe implements z8 {
    public static oe j;
    public Object f;
    public Object g;
    public Object h;
    public Object i;

    public oe(Typeface typeface, ot otVar) {
        int i;
        int i2;
        int i3;
        int i4;
        this.i = typeface;
        this.f = otVar;
        this.h = new pt(1024);
        int a = otVar.a(6);
        if (a != 0) {
            int i5 = a + otVar.a;
            i = ((ByteBuffer) otVar.d).getInt(((ByteBuffer) otVar.d).getInt(i5) + i5);
        } else {
            i = 0;
        }
        this.g = new char[i * 2];
        int a2 = otVar.a(6);
        if (a2 != 0) {
            int i6 = a2 + otVar.a;
            i2 = ((ByteBuffer) otVar.d).getInt(((ByteBuffer) otVar.d).getInt(i6) + i6);
        } else {
            i2 = 0;
        }
        for (int i7 = 0; i7 < i2; i7++) {
            t60 t60Var = new t60(this, i7);
            nt b = t60Var.b();
            int a3 = b.a(4);
            Character.toChars(a3 != 0 ? ((ByteBuffer) b.d).getInt(a3 + b.a) : 0, (char[]) this.g, i7 * 2);
            nt b2 = t60Var.b();
            int a4 = b2.a(16);
            if (a4 != 0) {
                int i8 = a4 + b2.a;
                i3 = ((ByteBuffer) b2.d).getInt(((ByteBuffer) b2.d).getInt(i8) + i8);
            } else {
                i3 = 0;
            }
            g8.m("invalid metadata codepoint length", i3 > 0);
            pt ptVar = (pt) this.h;
            nt b3 = t60Var.b();
            int a5 = b3.a(16);
            if (a5 != 0) {
                int i9 = a5 + b3.a;
                i4 = ((ByteBuffer) b3.d).getInt(((ByteBuffer) b3.d).getInt(i9) + i9);
            } else {
                i4 = 0;
            }
            ptVar.a(t60Var, 0, i4 - 1);
        }
    }

    public static oe o() {
        if (j == null) {
            j = new oe(7);
        }
        return j;
    }

    public void A() {
        i20 i20Var = (i20) this.i;
        if (i20Var != null) {
            this.h = i20Var;
            this.i = null;
            k7 k7Var = (k7) i20Var.a.get();
            if (k7Var == null) {
                this.h = null;
            } else {
                Handler handler = n7.w;
                handler.sendMessage(handler.obtainMessage(0, k7Var.a));
            }
        }
    }

    public void a(dk dkVar) {
        if (((ArrayList) this.f).contains(dkVar)) {
            throw new IllegalStateException("Fragment already added: " + dkVar);
        }
        synchronized (((ArrayList) this.f)) {
            ((ArrayList) this.f).add(dkVar);
        }
        dkVar.p = true;
    }

    public void b(pu puVar) {
        if (((LinkedHashSet) this.i).add(puVar)) {
            ((qu) this.g).a(this, puVar, -1);
        }
    }

    public void c(iv ivVar, int i) {
        if (i != 1 && i != 0) {
            l8.e(n20.e("Unsupported priority value: ", i));
        } else if (((LinkedHashSet) this.i).add(ivVar)) {
            ((qu) this.g).a(this, ivVar, i);
        }
    }

    public po d() {
        Map unmodifiableMap;
        xn xnVar = (xn) this.f;
        if (xnVar == null) {
            l8.u("url == null");
            return null;
        }
        String str = (String) this.g;
        nm y = ((j0) this.h).y();
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.i;
        byte[] bArr = z60.a;
        linkedHashMap.getClass();
        if (linkedHashMap.isEmpty()) {
            unmodifiableMap = vh.f;
        } else {
            unmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(linkedHashMap));
            unmodifiableMap.getClass();
        }
        return new po(xnVar, str, y, (g8) null, unmodifiableMap);
    }

    public boolean e(i20 i20Var, int i) {
        k7 k7Var = (k7) i20Var.a.get();
        if (k7Var == null) {
            return false;
        }
        ((Handler) this.g).removeCallbacksAndMessages(i20Var);
        Handler handler = n7.w;
        handler.sendMessage(handler.obtainMessage(1, i, 0, k7Var.a));
        return true;
    }

    public void f(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((e20) this.g).get(obj);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                f(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    public void g(pu puVar, nu nuVar) {
        qu quVar = (qu) this.g;
        quVar.getClass();
        if (quVar.g != 0) {
            return;
        }
        kv c = quVar.c(-1);
        quVar.f = c;
        quVar.g = -1;
        quVar.h = puVar;
        if (nuVar != null) {
            if (c != null) {
                c.d.getClass();
            }
            quVar.a.b(new su(nuVar));
        }
    }

    public dk h(String str) {
        a aVar = (a) ((HashMap) this.g).get(str);
        if (aVar != null) {
            return aVar.c;
        }
        return null;
    }

    public dk i(String str) {
        for (a aVar : ((HashMap) this.g).values()) {
            if (aVar != null) {
                dk dkVar = aVar.c;
                if (!str.equals(dkVar.j)) {
                    dkVar = dkVar.y.c.i(str);
                }
                if (dkVar != null) {
                    return dkVar;
                }
            }
        }
        return null;
    }

    public void j(qx qxVar) {
        qxVar.g.decrementAndGet();
        ArrayDeque arrayDeque = (ArrayDeque) this.h;
        synchronized (this) {
            if (!arrayDeque.remove(qxVar)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        x();
    }

    public x30 k(o1 o1Var) {
        ArrayList arrayList = (ArrayList) this.h;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            x30 x30Var = (x30) arrayList.get(i);
            if (x30Var != null && x30Var.b == o1Var) {
                return x30Var;
            }
        }
        x30 x30Var2 = new x30((Context) this.g, o1Var);
        arrayList.add(x30Var2);
        return x30Var2;
    }

    public ArrayList l() {
        ArrayList arrayList = new ArrayList();
        for (a aVar : ((HashMap) this.g).values()) {
            if (aVar != null) {
                arrayList.add(aVar);
            }
        }
        return arrayList;
    }

    public ArrayList m() {
        ArrayList arrayList = new ArrayList();
        for (a aVar : ((HashMap) this.g).values()) {
            if (aVar != null) {
                arrayList.add(aVar.c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public List n() {
        ArrayList arrayList;
        if (((ArrayList) this.f).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (((ArrayList) this.f)) {
            arrayList = new ArrayList((ArrayList) this.f);
        }
        return arrayList;
    }

    @Override // defpackage.z8
    public void onCancel() {
        View view = (View) this.f;
        view.clearAnimation();
        ((ViewGroup) this.g).endViewTransition(view);
        ((pe) this.h).d();
        if (sk.G(2)) {
            Log.v("FragmentManager", "Animation from operation " + ((u20) this.i) + " has been cancelled.");
        }
    }

    public void p(String str, String str2) {
        str2.getClass();
        j0 j0Var = (j0) this.h;
        j0Var.getClass();
        vv.e(str);
        vv.h(str2, str);
        j0Var.G(str);
        str2.getClass();
        ArrayList arrayList = (ArrayList) j0Var.g;
        arrayList.add(str);
        arrayList.add(m30.x0(str2).toString());
    }

    public boolean q(k7 k7Var) {
        i20 i20Var = (i20) this.h;
        return (i20Var == null || k7Var == null || i20Var.a.get() != k7Var) ? false : true;
    }

    public void r(a aVar) {
        dk dkVar = aVar.c;
        String str = dkVar.j;
        HashMap hashMap = (HashMap) this.g;
        if (hashMap.get(str) != null) {
            return;
        }
        hashMap.put(dkVar.j, aVar);
        if (sk.G(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + dkVar);
        }
    }

    public void s(a aVar) {
        dk dkVar = aVar.c;
        if (dkVar.F) {
            ((uk) this.i).e(dkVar);
        }
        if (((a) ((HashMap) this.g).put(dkVar.j, null)) != null && sk.G(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + dkVar);
        }
    }

    public void t(String str, g8 g8Var) {
        str.getClass();
        if (str.length() <= 0) {
            l8.l("method.isEmpty() == true");
            return;
        }
        if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT")) {
            l8.v(str, " must have a request body.", "method ");
        } else {
            this.g = str;
        }
    }

    public boolean u(o1 o1Var, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f).onActionItemClicked(k(o1Var), new zs((Context) this.g, (b40) menuItem));
    }

    public boolean v(o1 o1Var, Menu menu) {
        ActionMode.Callback callback = (ActionMode.Callback) this.f;
        x30 k = k(o1Var);
        e20 e20Var = (e20) this.i;
        Menu menu2 = (Menu) e20Var.get(menu);
        if (menu2 == null) {
            menu2 = new mt((Context) this.g, (ss) menu);
            e20Var.put(menu, menu2);
        }
        return callback.onCreateActionMode(k, menu2);
    }

    public void w(k7 k7Var) {
        synchronized (this.f) {
            try {
                if (q(k7Var)) {
                    i20 i20Var = (i20) this.h;
                    if (!i20Var.c) {
                        i20Var.c = true;
                        ((Handler) this.g).removeCallbacksAndMessages(i20Var);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void x() {
        int size;
        int i;
        ThreadPoolExecutor threadPoolExecutor;
        byte[] bArr = z60.a;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator it = ((ArrayDeque) this.g).iterator();
                it.getClass();
                while (it.hasNext()) {
                    qx qxVar = (qx) it.next();
                    if (((ArrayDeque) this.h).size() >= 64) {
                        break;
                    }
                    if (qxVar.g.get() < 5) {
                        it.remove();
                        qxVar.g.incrementAndGet();
                        arrayList.add(qxVar);
                        ((ArrayDeque) this.h).add(qxVar);
                    }
                }
                synchronized (this) {
                    ((ArrayDeque) this.h).size();
                    ((ArrayDeque) this.i).size();
                }
                size = arrayList.size();
                for (i = 0; i < size; i++) {
                    qx qxVar2 = (qx) arrayList.get(i);
                    synchronized (this) {
                        try {
                            if (((ThreadPoolExecutor) this.f) == null) {
                                this.f = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new y60(z60.g + " Dispatcher", false));
                            }
                            threadPoolExecutor = (ThreadPoolExecutor) this.f;
                            threadPoolExecutor.getClass();
                        } finally {
                        }
                    }
                    qxVar2.getClass();
                    tx txVar = qxVar2.h;
                    byte[] bArr2 = z60.a;
                    try {
                        try {
                            threadPoolExecutor.execute(qxVar2);
                        } catch (Throwable th) {
                            txVar.f.f.j(qxVar2);
                            throw th;
                        }
                    } catch (RejectedExecutionException e) {
                        InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                        interruptedIOException.initCause(e);
                        txVar.h(interruptedIOException);
                        qxVar2.f.E(txVar, interruptedIOException);
                        txVar.f.f.j(qxVar2);
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

    public void y(k7 k7Var) {
        synchronized (this.f) {
            try {
                if (q(k7Var)) {
                    i20 i20Var = (i20) this.h;
                    if (i20Var.c) {
                        i20Var.c = false;
                        z(i20Var);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void z(i20 i20Var) {
        Handler handler = (Handler) this.g;
        int i = i20Var.b;
        if (i == -2) {
            return;
        }
        if (i <= 0) {
            i = i == -1 ? 1500 : 2750;
        }
        handler.removeCallbacksAndMessages(i20Var);
        handler.sendMessageDelayed(Message.obtain(handler, 0, i20Var), i);
    }

    public oe(int i) {
        switch (i) {
            case 2:
                this.g = new ArrayDeque();
                this.h = new ArrayDeque();
                this.i = new ArrayDeque();
                break;
            case 3:
                this.f = new ArrayList();
                this.g = new HashMap();
                this.h = new HashMap();
                break;
            case 4:
            case 5:
            case 8:
            default:
                this.f = new nw(10);
                this.g = new e20(0);
                this.h = new ArrayList();
                this.i = new HashSet();
                break;
            case 6:
                this.i = new LinkedHashMap();
                this.g = "GET";
                this.h = new j0(21);
                break;
            case 7:
                this.f = new Object();
                this.g = new Handler(Looper.getMainLooper(), new h20(this));
                break;
            case 9:
                this.f = new l6(0);
                this.g = new SparseArray();
                this.h = new rq();
                this.i = new l6(0);
                break;
        }
    }
}
