package h0;

import U0.i;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import com.football.transfertrivia.R;
import f1.p;
import g1.l;
import i0.InterfaceC0143f;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.TreeMap;
import o0.AbstractC0283v;
import o0.x;
import o1.AbstractC0284a;
import o1.AbstractC0302t;
import o1.C0294k;
import o1.L;
import o1.M;
import p.C0311c;
import p.g;
import s1.q;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static long f2604a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static Method f2605b = null;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f2606c = true;
    public static boolean d = true;

    /* renamed from: e, reason: collision with root package name */
    public static Field f2607e;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f2608f;

    public static View d(View view, int i) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View findViewById = viewGroup.getChildAt(i2).findViewById(i);
            if (findViewById != null) {
                return findViewById;
            }
        }
        return null;
    }

    public static k0.c f(k0.d dVar, SQLiteDatabase sQLiteDatabase) {
        g1.f.e(dVar, "refHolder");
        g1.f.e(sQLiteDatabase, "sqLiteDatabase");
        k0.c cVar = dVar.f2830a;
        if (cVar != null && g1.f.a(cVar.f2829a, sQLiteDatabase)) {
            return cVar;
        }
        k0.c cVar2 = new k0.c(sQLiteDatabase);
        dVar.f2830a = cVar2;
        return cVar2;
    }

    public static boolean g() {
        boolean isEnabled;
        try {
            if (f2605b == null) {
                isEnabled = Trace.isEnabled();
                return isEnabled;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        try {
            if (f2605b == null) {
                f2604a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f2605b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f2605b.invoke(null, Long.valueOf(f2604a))).booleanValue();
        } catch (Exception e2) {
            if (!(e2 instanceof InvocationTargetException)) {
                Log.v("Trace", "Unable to call isTagEnabled via reflection", e2);
                return false;
            }
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    public static void h(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    public static final List k(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        W0.c cVar = new W0.c(10);
        while (cursor.moveToNext()) {
            int i = cursor.getInt(columnIndex);
            int i2 = cursor.getInt(columnIndex2);
            String string = cursor.getString(columnIndex3);
            g1.f.d(string, "cursor.getString(fromColumnIndex)");
            String string2 = cursor.getString(columnIndex4);
            g1.f.d(string2, "cursor.getString(toColumnIndex)");
            cVar.add(new c(i, i2, string, string2));
        }
        W0.c h = T.e.h(cVar);
        g1.f.e(h, "<this>");
        if (h.a() <= 1) {
            return V0.e.d0(h);
        }
        Object[] array = h.toArray(new Comparable[0]);
        Comparable[] comparableArr = (Comparable[]) array;
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        List asList = Arrays.asList(array);
        g1.f.d(asList, "asList(...)");
        return asList;
    }

    public static final d l(j0.a aVar, String str, boolean z2) {
        Cursor q2 = aVar.q("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = q2.getColumnIndex("seqno");
            int columnIndex2 = q2.getColumnIndex("cid");
            int columnIndex3 = q2.getColumnIndex("name");
            int columnIndex4 = q2.getColumnIndex("desc");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex4 != -1) {
                TreeMap treeMap = new TreeMap();
                TreeMap treeMap2 = new TreeMap();
                while (q2.moveToNext()) {
                    if (q2.getInt(columnIndex2) >= 0) {
                        int i = q2.getInt(columnIndex);
                        String string = q2.getString(columnIndex3);
                        String str2 = q2.getInt(columnIndex4) > 0 ? "DESC" : "ASC";
                        Integer valueOf = Integer.valueOf(i);
                        g1.f.d(string, "columnName");
                        treeMap.put(valueOf, string);
                        treeMap2.put(Integer.valueOf(i), str2);
                    }
                }
                Collection values = treeMap.values();
                g1.f.d(values, "columnsMap.values");
                List d02 = V0.e.d0(values);
                Collection values2 = treeMap2.values();
                g1.f.d(values2, "ordersMap.values");
                d dVar = new d(str, z2, d02, V0.e.d0(values2));
                T.e.m(q2, null);
                return dVar;
            }
            T.e.m(q2, null);
            return null;
        } finally {
        }
    }

    public static final void m(View view, InterfaceC0143f interfaceC0143f) {
        g1.f.e(view, "<this>");
        view.setTag(R.id.view_tree_saved_state_registry_owner, interfaceC0143f);
    }

    public static void p(p pVar, AbstractC0284a abstractC0284a, AbstractC0284a abstractC0284a2) {
        try {
            s1.a.c(T.e.D(T.e.r(abstractC0284a, abstractC0284a2, pVar)), i.f870a, null);
        } catch (Throwable th) {
            abstractC0284a2.b(T.e.s(th));
            throw th;
        }
    }

    public static final Object q(q qVar, q qVar2, p pVar) {
        Object c0294k;
        Object B2;
        L l2;
        try {
            l.a(pVar);
            c0294k = pVar.d(qVar2, qVar);
        } catch (Throwable th) {
            c0294k = new C0294k(th, false);
        }
        Y0.a aVar = Y0.a.f1162a;
        if (c0294k == aVar || (B2 = qVar.B(c0294k)) == AbstractC0302t.d) {
            return aVar;
        }
        if (B2 instanceof C0294k) {
            throw ((C0294k) B2).f3324a;
        }
        M m2 = B2 instanceof M ? (M) B2 : null;
        return (m2 == null || (l2 = m2.f3288a) == null) ? B2 : l2;
    }

    public static void r(ViewGroup viewGroup, boolean z2) {
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC0283v.b(viewGroup, z2);
        } else if (f2606c) {
            try {
                AbstractC0283v.b(viewGroup, z2);
            } catch (NoSuchMethodError unused) {
                f2606c = false;
            }
        }
    }

    public abstract boolean a(g gVar, C0311c c0311c);

    public abstract boolean b(g gVar, Object obj, Object obj2);

    public abstract boolean c(g gVar, p.f fVar, p.f fVar2);

    public float e(View view) {
        if (d) {
            try {
                return x.a(view);
            } catch (NoSuchMethodError unused) {
                d = false;
            }
        }
        return view.getAlpha();
    }

    public abstract void i(p.f fVar, p.f fVar2);

    public abstract void j(p.f fVar, Thread thread);

    public void n(View view, float f2) {
        if (d) {
            try {
                x.b(view, f2);
                return;
            } catch (NoSuchMethodError unused) {
                d = false;
            }
        }
        view.setAlpha(f2);
    }

    public void o(View view, int i) {
        if (!f2608f) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f2607e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsApi19", "fetchViewFlagsField: ");
            }
            f2608f = true;
        }
        Field field = f2607e;
        if (field != null) {
            try {
                f2607e.setInt(view, i | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }
}
