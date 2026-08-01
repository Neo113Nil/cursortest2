package U;

import Y.AbstractComponentCallbacksC0049q;
import Y.C0038f;
import Y.L;
import Y.O;
import Y.U;
import android.content.Context;
import android.graphics.Typeface;
import android.util.Log;
import android.util.SparseArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import j.AbstractC0144a;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import k.MenuC0148B;
import k.MenuC0164m;
import k.MenuItemC0171t;

/* loaded from: classes.dex */
public final class v implements G.b {

    /* renamed from: a, reason: collision with root package name */
    public final Object f849a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f850b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f851c;
    public Object d;

    public v(int i) {
        switch (i) {
            case 4:
                this.f849a = new o.b();
                this.f850b = new SparseArray();
                this.f851c = new o.e();
                this.d = new o.b();
                break;
            case 5:
                this.f849a = new J.b(10);
                this.f850b = new o.k();
                this.f851c = new ArrayList();
                this.d = new HashSet();
                break;
            default:
                this.f849a = new ArrayList();
                this.f850b = new HashMap();
                this.f851c = new HashMap();
                break;
        }
    }

    public void a(AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q) {
        if (((ArrayList) this.f849a).contains(abstractComponentCallbacksC0049q)) {
            throw new IllegalStateException("Fragment already added: " + abstractComponentCallbacksC0049q);
        }
        synchronized (((ArrayList) this.f849a)) {
            ((ArrayList) this.f849a).add(abstractComponentCallbacksC0049q);
        }
        abstractComponentCallbacksC0049q.f1125k = true;
    }

    public void b(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((o.k) this.f850b).getOrDefault(obj, null);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                b(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    public AbstractComponentCallbacksC0049q c(String str) {
        O o2 = (O) ((HashMap) this.f850b).get(str);
        if (o2 != null) {
            return o2.f1008c;
        }
        return null;
    }

    public AbstractComponentCallbacksC0049q d(String str) {
        for (O o2 : ((HashMap) this.f850b).values()) {
            if (o2 != null) {
                AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q = o2.f1008c;
                if (!str.equals(abstractComponentCallbacksC0049q.f1121e)) {
                    abstractComponentCallbacksC0049q = abstractComponentCallbacksC0049q.f1134t.f963c.d(str);
                }
                if (abstractComponentCallbacksC0049q != null) {
                    return abstractComponentCallbacksC0049q;
                }
            }
        }
        return null;
    }

    public j.e e(AbstractC0144a abstractC0144a) {
        ArrayList arrayList = (ArrayList) this.f851c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            j.e eVar = (j.e) arrayList.get(i);
            if (eVar != null && eVar.f2634b == abstractC0144a) {
                return eVar;
            }
        }
        j.e eVar2 = new j.e((Context) this.f850b, abstractC0144a);
        arrayList.add(eVar2);
        return eVar2;
    }

    public ArrayList f() {
        ArrayList arrayList = new ArrayList();
        for (O o2 : ((HashMap) this.f850b).values()) {
            if (o2 != null) {
                arrayList.add(o2);
            }
        }
        return arrayList;
    }

    public ArrayList g() {
        ArrayList arrayList = new ArrayList();
        for (O o2 : ((HashMap) this.f850b).values()) {
            if (o2 != null) {
                arrayList.add(o2.f1008c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public List h() {
        ArrayList arrayList;
        if (((ArrayList) this.f849a).isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (((ArrayList) this.f849a)) {
            arrayList = new ArrayList((ArrayList) this.f849a);
        }
        return arrayList;
    }

    public void i(O o2) {
        AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q = o2.f1008c;
        String str = abstractComponentCallbacksC0049q.f1121e;
        HashMap hashMap = (HashMap) this.f850b;
        if (hashMap.get(str) != null) {
            return;
        }
        hashMap.put(abstractComponentCallbacksC0049q.f1121e, o2);
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Added fragment to active set " + abstractComponentCallbacksC0049q);
        }
    }

    public void j(O o2) {
        AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q = o2.f1008c;
        if (abstractComponentCallbacksC0049q.f1101A) {
            ((L) this.d).e(abstractComponentCallbacksC0049q);
        }
        if (((O) ((HashMap) this.f850b).put(abstractComponentCallbacksC0049q.f1121e, null)) != null && Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + abstractComponentCallbacksC0049q);
        }
    }

    public boolean k(AbstractC0144a abstractC0144a, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f849a).onActionItemClicked(e(abstractC0144a), new MenuItemC0171t((Context) this.f850b, (E.a) menuItem));
    }

    @Override // G.b
    public void l() {
        View view = (View) this.f849a;
        view.clearAnimation();
        ((ViewGroup) this.f850b).endViewTransition(view);
        ((C0038f) this.f851c).d();
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animation from operation " + ((U) this.d) + " has been cancelled.");
        }
    }

    public boolean m(AbstractC0144a abstractC0144a, MenuC0164m menuC0164m) {
        j.e e2 = e(abstractC0144a);
        o.k kVar = (o.k) this.d;
        Menu menu = (Menu) kVar.getOrDefault(menuC0164m, null);
        if (menu == null) {
            menu = new MenuC0148B((Context) this.f850b, menuC0164m);
            kVar.put(menuC0164m, menu);
        }
        return ((ActionMode.Callback) this.f849a).onCreateActionMode(e2, menu);
    }

    public v(Typeface typeface, V.b bVar) {
        int i;
        int i2;
        this.d = typeface;
        this.f849a = bVar;
        this.f851c = new u(1024);
        int a2 = bVar.a(6);
        if (a2 != 0) {
            int i3 = a2 + bVar.f362a;
            i = ((ByteBuffer) bVar.d).getInt(((ByteBuffer) bVar.d).getInt(i3) + i3);
        } else {
            i = 0;
        }
        this.f850b = new char[i * 2];
        int a3 = bVar.a(6);
        if (a3 != 0) {
            int i4 = a3 + bVar.f362a;
            i2 = ((ByteBuffer) bVar.d).getInt(((ByteBuffer) bVar.d).getInt(i4) + i4);
        } else {
            i2 = 0;
        }
        for (int i5 = 0; i5 < i2; i5++) {
            y yVar = new y(this, i5);
            V.a c2 = yVar.c();
            int a4 = c2.a(4);
            Character.toChars(a4 != 0 ? ((ByteBuffer) c2.d).getInt(a4 + c2.f362a) : 0, (char[]) this.f850b, i5 * 2);
            A.c.j(yVar.b() > 0, "invalid metadata codepoint length");
            ((u) this.f851c).a(yVar, 0, yVar.b() - 1);
        }
    }

    public v(Context context, ActionMode.Callback callback) {
        this.f850b = context;
        this.f849a = callback;
        this.f851c = new ArrayList();
        this.d = new o.k();
    }

    public v(C0038f c0038f, U u2, View view, ViewGroup viewGroup) {
        this.f849a = view;
        this.f850b = viewGroup;
        this.f851c = c0038f;
        this.d = u2;
    }
}
