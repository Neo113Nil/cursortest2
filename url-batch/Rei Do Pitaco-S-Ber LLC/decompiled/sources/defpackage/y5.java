package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Trace;
import android.text.Editable;
import android.text.Selection;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ionia.reidopitaco.libya.R;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class y5 {
    public static volatile y5 d;
    public static final Object e = new Object();
    public static y5 f;
    public Object a;
    public Object b;
    public Object c;

    public y5(Context context, int i) {
        switch (i) {
            case 4:
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(m60.V(context, R.attr.materialCalendarStyle, as.class.getCanonicalName()).data, jx.r);
                this.a = j0.z(context, obtainStyledAttributes.getResourceId(4, 0));
                j0.z(context, obtainStyledAttributes.getResourceId(2, 0));
                j0.z(context, obtainStyledAttributes.getResourceId(3, 0));
                j0.z(context, obtainStyledAttributes.getResourceId(5, 0));
                ColorStateList o = oo.o(context, obtainStyledAttributes, 7);
                this.b = j0.z(context, obtainStyledAttributes.getResourceId(9, 0));
                j0.z(context, obtainStyledAttributes.getResourceId(8, 0));
                this.c = j0.z(context, obtainStyledAttributes.getResourceId(10, 0));
                new Paint().setColor(o.getDefaultColor());
                obtainStyledAttributes.recycle();
                break;
            default:
                this.c = context.getApplicationContext();
                this.b = new HashSet();
                this.a = new HashMap();
                break;
        }
    }

    public static boolean a(Editable editable, KeyEvent keyEvent, boolean z) {
        u60[] u60VarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (u60VarArr = (u60[]) editable.getSpans(selectionStart, selectionEnd, u60.class)) != null && u60VarArr.length > 0) {
                for (u60 u60Var : u60VarArr) {
                    int spanStart = editable.getSpanStart(u60Var);
                    int spanEnd = editable.getSpanEnd(u60Var);
                    if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static y5 i(Context context) {
        if (d == null) {
            synchronized (e) {
                try {
                    if (d == null) {
                        d = new y5(context, 0);
                    }
                } finally {
                }
            }
        }
        return d;
    }

    public static y5 l(int i, int i2, Context context, AttributeSet attributeSet, int[] iArr) {
        return new y5(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    public void b(Bundle bundle) {
        HashSet hashSet = (HashSet) this.b;
        String string = ((Context) this.c).getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (fo.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    c((Class) it.next(), hashSet2);
                }
            } catch (ClassNotFoundException e2) {
                throw new ck(e2);
            }
        }
    }

    public Object c(Class cls, HashSet hashSet) {
        Object obj;
        HashMap hashMap = (HashMap) this.a;
        if (g8.R()) {
            try {
                g8.f(cls.getSimpleName());
            } finally {
                Trace.endSection();
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        if (hashMap.containsKey(cls)) {
            obj = hashMap.get(cls);
        } else {
            hashSet.add(cls);
            try {
                fo foVar = (fo) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> a = foVar.a();
                if (!a.isEmpty()) {
                    for (Class cls2 : a) {
                        if (!hashMap.containsKey(cls2)) {
                            c(cls2, hashSet);
                        }
                    }
                }
                obj = foVar.b((Context) this.c);
                hashSet.remove(cls);
                hashMap.put(cls, obj);
            } catch (Throwable th) {
                throw new ck(th);
            }
        }
        return obj;
    }

    public p80 d(String str, Class cls) {
        p80 c;
        r80 r80Var = (r80) this.b;
        s80 s80Var = (s80) this.a;
        s80Var.getClass();
        LinkedHashMap linkedHashMap = s80Var.a;
        p80 p80Var = (p80) linkedHashMap.get(str);
        if (cls.isInstance(p80Var)) {
            p80Var.getClass();
            return p80Var;
        }
        wt wtVar = new wt((qd) this.c);
        ((LinkedHashMap) wtVar.a).put(tg.o, str);
        try {
            c = r80Var.h(cls, wtVar);
        } catch (AbstractMethodError unused) {
            c = r80Var.c(cls);
        }
        c.getClass();
        p80 p80Var2 = (p80) linkedHashMap.put(str, c);
        if (p80Var2 != null) {
            p80Var2.b();
        }
        return c;
    }

    public ColorStateList e(int i) {
        int resourceId;
        ColorStateList r;
        TypedArray typedArray = (TypedArray) this.a;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (r = vv.r((Context) this.c, resourceId)) == null) ? typedArray.getColorStateList(i) : r;
    }

    public Drawable f(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.a;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : vv.t((Context) this.c, resourceId);
    }

    public Drawable g(int i) {
        int resourceId;
        Drawable d2;
        if (!((TypedArray) this.a).hasValue(i) || (resourceId = ((TypedArray) this.a).getResourceId(i, 0)) == 0) {
            return null;
        }
        f4 a = f4.a();
        Context context = (Context) this.c;
        synchronized (a) {
            d2 = a.a.d(context, resourceId, true);
        }
        return d2;
    }

    public Typeface h(int i, int i2, g5 g5Var) {
        int resourceId = ((TypedArray) this.a).getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.b) == null) {
            this.b = new TypedValue();
        }
        Context context = (Context) this.c;
        TypedValue typedValue = (TypedValue) this.b;
        ThreadLocal threadLocal = wz.a;
        if (context.isRestricted()) {
            return null;
        }
        return wz.a(context, resourceId, typedValue, i2, g5Var, true, false);
    }

    public boolean j(CharSequence charSequence, int i, int i2, t60 t60Var) {
        if ((t60Var.c & 3) == 0) {
            ce ceVar = (ce) this.c;
            nt b = t60Var.b();
            int a = b.a(8);
            if (a != 0) {
                ((ByteBuffer) b.d).getShort(a + b.a);
            }
            ceVar.getClass();
            ThreadLocal threadLocal = ce.b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            boolean hasGlyph = ceVar.a.hasGlyph(sb.toString());
            int i3 = t60Var.c & 4;
            t60Var.c = hasGlyph ? i3 | 2 : i3 | 1;
        }
        return (t60Var.c & 3) == 2;
    }

    public boolean k(int i, jc jcVar, tc tcVar) {
        q7 q7Var = (q7) this.b;
        int[] iArr = tcVar.p0;
        int[] iArr2 = tcVar.t;
        q7Var.a = iArr[0];
        q7Var.b = iArr[1];
        q7Var.c = tcVar.q();
        q7Var.d = tcVar.k();
        q7Var.i = false;
        q7Var.j = i;
        boolean z = q7Var.a == 3;
        boolean z2 = q7Var.b == 3;
        boolean z3 = z && tcVar.W > 0.0f;
        boolean z4 = z2 && tcVar.W > 0.0f;
        if (z3 && iArr2[0] == 4) {
            q7Var.a = 1;
        }
        if (z4 && iArr2[1] == 4) {
            q7Var.b = 1;
        }
        jcVar.b(tcVar, q7Var);
        tcVar.O(q7Var.e);
        tcVar.L(q7Var.f);
        tcVar.E = q7Var.h;
        tcVar.I(q7Var.g);
        q7Var.j = 0;
        return q7Var.i;
    }

    public Object m(CharSequence charSequence, int i, int i2, int i3, boolean z, kh khVar) {
        int i4;
        char c;
        lh lhVar = new lh((pt) ((oe) this.b).h);
        int codePointAt = Character.codePointAt(charSequence, i);
        int i5 = 0;
        boolean z2 = true;
        int i6 = i;
        loop0: while (true) {
            i4 = i6;
            while (i6 < i2 && i5 < i3 && z2) {
                SparseArray sparseArray = lhVar.c.a;
                pt ptVar = sparseArray == null ? null : (pt) sparseArray.get(codePointAt);
                if (lhVar.a == 2) {
                    if (ptVar != null) {
                        lhVar.c = ptVar;
                        lhVar.f++;
                    } else {
                        if (codePointAt == 65038) {
                            lhVar.a();
                        } else if (codePointAt != 65039) {
                            pt ptVar2 = lhVar.c;
                            if (ptVar2.b != null) {
                                if (lhVar.f != 1) {
                                    lhVar.d = ptVar2;
                                    lhVar.a();
                                } else if (lhVar.b()) {
                                    lhVar.d = lhVar.c;
                                    lhVar.a();
                                } else {
                                    lhVar.a();
                                }
                                c = 3;
                            } else {
                                lhVar.a();
                            }
                        }
                        c = 1;
                    }
                    c = 2;
                } else if (ptVar == null) {
                    lhVar.a();
                    c = 1;
                } else {
                    lhVar.a = 2;
                    lhVar.c = ptVar;
                    lhVar.f = 1;
                    c = 2;
                }
                lhVar.e = codePointAt;
                if (c == 1) {
                    i6 = Character.charCount(Character.codePointAt(charSequence, i4)) + i4;
                    if (i6 < i2) {
                        codePointAt = Character.codePointAt(charSequence, i6);
                    }
                } else if (c == 2) {
                    int charCount = Character.charCount(codePointAt) + i6;
                    if (charCount < i2) {
                        codePointAt = Character.codePointAt(charSequence, charCount);
                    }
                    i6 = charCount;
                } else if (c == 3) {
                    if (z || !j(charSequence, i4, i6, lhVar.d.b)) {
                        z2 = khVar.o(charSequence, i4, i6, lhVar.d.b);
                        i5++;
                    }
                }
            }
        }
        if (lhVar.a == 2 && lhVar.c.b != null && ((lhVar.f > 1 || lhVar.b()) && i5 < i3 && z2 && (z || !j(charSequence, i4, i6, lhVar.c.b)))) {
            khVar.o(charSequence, i4, i6, lhVar.c.b);
        }
        return khVar.b();
    }

    public void n() {
        ((TypedArray) this.a).recycle();
    }

    public void o(uc ucVar, int i, int i2, int i3) {
        ucVar.getClass();
        int i4 = ucVar.b0;
        int i5 = ucVar.c0;
        ucVar.b0 = 0;
        ucVar.c0 = 0;
        ucVar.O(i2);
        ucVar.L(i3);
        if (i4 < 0) {
            ucVar.b0 = 0;
        } else {
            ucVar.b0 = i4;
        }
        if (i5 < 0) {
            ucVar.c0 = 0;
        } else {
            ucVar.c0 = i5;
        }
        uc ucVar2 = (uc) this.c;
        ucVar2.t0 = i;
        ucVar2.U();
    }

    public void p(uc ucVar) {
        ArrayList arrayList = (ArrayList) this.a;
        arrayList.clear();
        int size = ucVar.q0.size();
        for (int i = 0; i < size; i++) {
            tc tcVar = (tc) ucVar.q0.get(i);
            int[] iArr = tcVar.p0;
            if (iArr[0] == 3 || iArr[1] == 3) {
                arrayList.add(tcVar);
            }
        }
        ucVar.s0.b = true;
    }

    public y5(s80 s80Var, r80 r80Var, qd qdVar) {
        s80Var.getClass();
        qdVar.getClass();
        this.a = s80Var;
        this.b = r80Var;
        this.c = qdVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public y5(s80 s80Var, r80 r80Var) {
        this(s80Var, r80Var, pd.b);
        s80Var.getClass();
    }

    public y5(Context context, TypedArray typedArray) {
        this.c = context;
        this.a = typedArray;
    }

    public y5(Runnable runnable) {
        this.c = new CopyOnWriteArrayList();
        this.a = new HashMap();
        this.b = runnable;
    }

    public /* synthetic */ y5(ConstraintLayout constraintLayout, ViewGroup viewGroup, View view) {
        this.a = constraintLayout;
        this.b = viewGroup;
        this.c = view;
    }
}
