package B;

import K.C0001a0;
import K.C0017q;
import K.F;
import K.T;
import K.v0;
import K.x0;
import T.t;
import T.w;
import T.x;
import T.z;
import X.AbstractComponentCallbacksC0048q;
import X.I;
import X.U;
import android.animation.Animator;
import android.content.Context;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.Spannable;
import android.text.SpannableString;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.EditText;
import c.C0077a;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import f0.G;
import f0.X;
import f0.d0;
import f0.g0;
import f0.h0;
import g.AbstractActivityC0125i;
import g.LayoutInflaterFactory2C0109A;
import j.AbstractC0137a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import k.MenuC0141B;
import k.MenuC0157m;
import org.xmlpull.v1.XmlPullParserException;
import q.C0289d;
import q.C0291f;
import v.C0320b;
import v.C0327i;

/* loaded from: classes.dex */
public final class j implements K.r, T.o, G.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29a;

    /* renamed from: b, reason: collision with root package name */
    public Object f30b;

    /* renamed from: c, reason: collision with root package name */
    public Object f31c;

    public /* synthetic */ j(int i, boolean z2) {
        this.f29a = i;
    }

    public static int v(int i, int i2) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            i3++;
            if (i3 == i2) {
                i4++;
                i3 = 0;
            } else if (i3 > i2) {
                i4++;
                i3 = 1;
            }
        }
        return i3 + 1 > i2 ? i4 + 1 : i4;
    }

    public void A(AbstractC0137a abstractC0137a) {
        t tVar = (t) this.f30b;
        ((ActionMode.Callback) tVar.f741a).onDestroyActionMode(tVar.g(abstractC0137a));
        LayoutInflaterFactory2C0109A layoutInflaterFactory2C0109A = (LayoutInflaterFactory2C0109A) this.f31c;
        if (layoutInflaterFactory2C0109A.f2234w != null) {
            layoutInflaterFactory2C0109A.f2223l.getDecorView().removeCallbacks(layoutInflaterFactory2C0109A.f2235x);
        }
        if (layoutInflaterFactory2C0109A.f2233v != null) {
            C0001a0 c0001a0 = layoutInflaterFactory2C0109A.f2236y;
            if (c0001a0 != null) {
                c0001a0.b();
            }
            C0001a0 a2 = T.a(layoutInflaterFactory2C0109A.f2233v);
            a2.a(0.0f);
            layoutInflaterFactory2C0109A.f2236y = a2;
            a2.d(new g.r(2, this));
        }
        layoutInflaterFactory2C0109A.f2232u = null;
        ViewGroup viewGroup = layoutInflaterFactory2C0109A.f2189B;
        WeakHashMap weakHashMap = T.f381a;
        F.c(viewGroup);
        layoutInflaterFactory2C0109A.H();
    }

    public boolean B(AbstractC0137a abstractC0137a, MenuC0157m menuC0157m) {
        ViewGroup viewGroup = ((LayoutInflaterFactory2C0109A) this.f31c).f2189B;
        WeakHashMap weakHashMap = T.f381a;
        F.c(viewGroup);
        t tVar = (t) this.f30b;
        j.e g2 = tVar.g(abstractC0137a);
        o.k kVar = (o.k) tVar.d;
        Menu menu = (Menu) kVar.getOrDefault(menuC0157m, null);
        if (menu == null) {
            menu = new MenuC0141B((Context) tVar.f742b, menuC0157m);
            kVar.put(menuC0157m, menu);
        }
        return ((ActionMode.Callback) tVar.f741a).onPrepareActionMode(g2, menu);
    }

    public void C(H.h hVar) {
        int i = hVar.f223b;
        Handler handler = (Handler) this.f31c;
        B0.d dVar = (B0.d) this.f30b;
        if (i == 0) {
            handler.post(new H.a(dVar, 0, hVar.f222a));
        } else {
            handler.post(new H.b(dVar, i, 0));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:99:0x022b, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void D(Context context, XmlResourceParser xmlResourceParser) {
        int eventType;
        C0327i c0327i;
        char c2;
        v.n nVar = new v.n();
        int attributeCount = xmlResourceParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = xmlResourceParser.getAttributeName(i);
            String attributeValue = xmlResourceParser.getAttributeValue(i);
            if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                try {
                    eventType = xmlResourceParser.getEventType();
                    c0327i = null;
                } catch (IOException e2) {
                    e2.printStackTrace();
                } catch (XmlPullParserException e3) {
                    e3.printStackTrace();
                }
                while (eventType != 1) {
                    if (eventType != 0) {
                        char c3 = 3;
                        if (eventType == 2) {
                            String name = xmlResourceParser.getName();
                            switch (name.hashCode()) {
                                case -2025855158:
                                    if (name.equals("Layout")) {
                                        c3 = 6;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case -1984451626:
                                    if (name.equals("Motion")) {
                                        c3 = 7;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case -1962203927:
                                    if (name.equals("ConstraintOverride")) {
                                        c3 = 1;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case -1269513683:
                                    if (name.equals("PropertySet")) {
                                        c3 = 4;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case -1238332596:
                                    if (name.equals("Transform")) {
                                        c3 = 5;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case -71750448:
                                    if (name.equals("Guideline")) {
                                        c3 = 2;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 366511058:
                                    if (name.equals("CustomMethod")) {
                                        c3 = '\t';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 1331510167:
                                    if (name.equals("Barrier")) {
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 1791837707:
                                    if (name.equals("CustomAttribute")) {
                                        c3 = '\b';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 1803088381:
                                    if (name.equals("Constraint")) {
                                        c3 = 0;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                default:
                                    c3 = 65535;
                                    break;
                            }
                            switch (c3) {
                                case 0:
                                    c0327i = v.n.d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    break;
                                case 1:
                                    c0327i = v.n.d(context, Xml.asAttributeSet(xmlResourceParser), true);
                                    break;
                                case 2:
                                    c0327i = v.n.d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    c0327i.d.f3960a = true;
                                    break;
                                case 3:
                                    c0327i = v.n.d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    c0327i.d.f3973h0 = 1;
                                    break;
                                case 4:
                                    if (c0327i == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    c0327i.f3930b.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                case 5:
                                    if (c0327i == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    c0327i.f3932e.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                case 6:
                                    if (c0327i == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    c0327i.d.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                case 7:
                                    if (c0327i == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    c0327i.f3931c.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                case '\b':
                                case '\t':
                                    if (c0327i == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    C0320b.a(context, xmlResourceParser, c0327i.f3933f);
                                    break;
                            }
                        } else if (eventType == 3) {
                            String lowerCase = xmlResourceParser.getName().toLowerCase(Locale.ROOT);
                            switch (lowerCase.hashCode()) {
                                case -2075718416:
                                    if (lowerCase.equals("guideline")) {
                                        c2 = 3;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case -190376483:
                                    if (lowerCase.equals("constraint")) {
                                        c2 = 1;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 426575017:
                                    if (lowerCase.equals("constraintoverride")) {
                                        c2 = 2;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 2146106725:
                                    if (lowerCase.equals("constraintset")) {
                                        c2 = 0;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                default:
                                    c2 = 65535;
                                    break;
                            }
                            if (c2 == 0) {
                                ((SparseArray) this.f31c).put(identifier, nVar);
                                return;
                            } else if (c2 == 1 || c2 == 2 || c2 == 3) {
                                nVar.f4022c.put(Integer.valueOf(c0327i.f3929a), c0327i);
                                c0327i = null;
                            }
                        }
                    } else {
                        xmlResourceParser.getName();
                    }
                    eventType = xmlResourceParser.next();
                }
                ((SparseArray) this.f31c).put(identifier, nVar);
                return;
            }
        }
    }

    public C0017q E(X x2, int i) {
        h0 h0Var;
        C0017q c0017q;
        o.k kVar = (o.k) this.f30b;
        int e2 = kVar.e(x2);
        if (e2 >= 0 && (h0Var = (h0) kVar.j(e2)) != null) {
            int i2 = h0Var.f2082a;
            if ((i2 & i) != 0) {
                int i3 = i2 & (~i);
                h0Var.f2082a = i3;
                if (i == 4) {
                    c0017q = h0Var.f2083b;
                } else {
                    if (i != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    c0017q = h0Var.f2084c;
                }
                if ((i3 & 12) == 0) {
                    kVar.i(e2);
                    h0Var.f2082a = 0;
                    h0Var.f2083b = null;
                    h0Var.f2084c = null;
                    h0.d.c(h0Var);
                }
                return c0017q;
            }
        }
        return null;
    }

    public void F(X x2) {
        h0 h0Var = (h0) ((o.k) this.f30b).getOrDefault(x2, null);
        if (h0Var == null) {
            return;
        }
        h0Var.f2082a &= -2;
    }

    public void G(X x2) {
        o.e eVar = (o.e) this.f31c;
        int e2 = eVar.e() - 1;
        while (true) {
            if (e2 < 0) {
                break;
            }
            if (x2 == eVar.f(e2)) {
                Object[] objArr = eVar.f3327c;
                Object obj = objArr[e2];
                Object obj2 = o.e.f3324e;
                if (obj != obj2) {
                    objArr[e2] = obj2;
                    eVar.f3325a = true;
                }
            } else {
                e2--;
            }
        }
        h0 h0Var = (h0) ((o.k) this.f30b).remove(x2);
        if (h0Var != null) {
            h0Var.f2082a = 0;
            h0Var.f2083b = null;
            h0Var.f2084c = null;
            h0.d.c(h0Var);
        }
    }

    public void H() {
        Object parcelable;
        Integer num;
        a.j jVar = (a.j) this.f30b;
        jVar.getClass();
        String str = (String) this.f31c;
        X0.e.e(str, "key");
        if (!jVar.d.contains(str) && (num = (Integer) jVar.f1046b.remove(str)) != null) {
            jVar.f1045a.remove(num);
        }
        jVar.f1048e.remove(str);
        LinkedHashMap linkedHashMap = jVar.f1049f;
        if (linkedHashMap.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + linkedHashMap.get(str));
            linkedHashMap.remove(str);
        }
        Bundle bundle = jVar.f1050g;
        if (bundle.containsKey(str)) {
            if (Build.VERSION.SDK_INT >= 34) {
                parcelable = G.a.a(bundle, str, C0077a.class);
            } else {
                parcelable = bundle.getParcelable(str);
                if (!C0077a.class.isInstance(parcelable)) {
                    parcelable = null;
                }
            }
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + ((C0077a) parcelable));
            bundle.remove(str);
        }
        if (jVar.f1047c.get(str) != null) {
            throw new ClassCastException();
        }
    }

    public void a(X x2, C0017q c0017q) {
        o.k kVar = (o.k) this.f30b;
        h0 h0Var = (h0) kVar.getOrDefault(x2, null);
        if (h0Var == null) {
            h0Var = h0.a();
            kVar.put(x2, h0Var);
        }
        h0Var.f2084c = c0017q;
        h0Var.f2082a |= 8;
    }

    public void b(boolean z2) {
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = ((I) this.f31c).f823v;
        if (abstractComponentCallbacksC0048q != null) {
            abstractComponentCallbacksC0048q.j().f813l.b(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f30b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public void c(boolean z2) {
        I i = (I) this.f31c;
        AbstractActivityC0125i abstractActivityC0125i = i.f821t.f992f;
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = i.f823v;
        if (abstractComponentCallbacksC0048q != null) {
            abstractComponentCallbacksC0048q.j().f813l.c(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f30b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0099  */
    @Override // K.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public x0 d(View view, x0 x0Var) {
        boolean z2;
        boolean z3;
        B0.s sVar = (B0.s) this.f31c;
        int i = sVar.f143a;
        I.g gVar = (I.g) this.f30b;
        v0 v0Var = x0Var.f468a;
        C.d f2 = v0Var.f(7);
        C.d f3 = v0Var.f(32);
        int i2 = f2.f149b;
        BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) gVar.f337b;
        bottomSheetBehavior.f1585w = i2;
        boolean e2 = B0.o.e(view);
        int paddingBottom = view.getPaddingBottom();
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        boolean z4 = bottomSheetBehavior.f1577o;
        if (z4) {
            int a2 = x0Var.a();
            bottomSheetBehavior.f1584v = a2;
            paddingBottom = a2 + sVar.f145c;
        }
        int i3 = sVar.f144b;
        boolean z5 = bottomSheetBehavior.f1578p;
        int i4 = f2.f148a;
        if (z5) {
            paddingLeft = (e2 ? i3 : i) + i4;
        }
        boolean z6 = bottomSheetBehavior.f1579q;
        int i5 = f2.f150c;
        if (z6) {
            if (!e2) {
                i = i3;
            }
            paddingRight = i + i5;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        boolean z7 = true;
        if (!bottomSheetBehavior.f1581s || marginLayoutParams.leftMargin == i4) {
            z2 = false;
        } else {
            marginLayoutParams.leftMargin = i4;
            z2 = true;
        }
        if (bottomSheetBehavior.f1582t && marginLayoutParams.rightMargin != i5) {
            marginLayoutParams.rightMargin = i5;
            z2 = true;
        }
        if (bottomSheetBehavior.f1583u) {
            int i6 = marginLayoutParams.topMargin;
            int i7 = f2.f149b;
            if (i6 != i7) {
                marginLayoutParams.topMargin = i7;
                if (z7) {
                    view.setLayoutParams(marginLayoutParams);
                }
                view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
                z3 = gVar.f336a;
                if (z3) {
                    bottomSheetBehavior.f1575m = f3.d;
                }
                if (!z4 || z3) {
                    bottomSheetBehavior.I();
                }
                return x0Var;
            }
        }
        z7 = z2;
        if (z7) {
        }
        view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
        z3 = gVar.f336a;
        if (z3) {
        }
        if (!z4) {
        }
        bottomSheetBehavior.I();
        return x0Var;
    }

    @Override // T.o
    public Object e() {
        return (z) this.f30b;
    }

    public void f(boolean z2) {
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = ((I) this.f31c).f823v;
        if (abstractComponentCallbacksC0048q != null) {
            abstractComponentCallbacksC0048q.j().f813l.f(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f30b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public void g(boolean z2) {
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = ((I) this.f31c).f823v;
        if (abstractComponentCallbacksC0048q != null) {
            abstractComponentCallbacksC0048q.j().f813l.g(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f30b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public void h(boolean z2) {
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = ((I) this.f31c).f823v;
        if (abstractComponentCallbacksC0048q != null) {
            abstractComponentCallbacksC0048q.j().f813l.h(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f30b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    @Override // G.b
    public void i() {
        ((Animator) this.f30b).end();
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animator from operation " + ((U) this.f31c) + " has been canceled.");
        }
    }

    public void j(boolean z2) {
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = ((I) this.f31c).f823v;
        if (abstractComponentCallbacksC0048q != null) {
            abstractComponentCallbacksC0048q.j().f813l.j(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f30b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public void k(boolean z2) {
        I i = (I) this.f31c;
        AbstractActivityC0125i abstractActivityC0125i = i.f821t.f992f;
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = i.f823v;
        if (abstractComponentCallbacksC0048q != null) {
            abstractComponentCallbacksC0048q.j().f813l.k(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f30b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public void l(boolean z2) {
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = ((I) this.f31c).f823v;
        if (abstractComponentCallbacksC0048q != null) {
            abstractComponentCallbacksC0048q.j().f813l.l(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f30b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    @Override // T.o
    public boolean m(CharSequence charSequence, int i, int i2, w wVar) {
        if ((wVar.f750c & 4) > 0) {
            return true;
        }
        if (((z) this.f30b) == null) {
            this.f30b = new z(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((H0.e) this.f31c).getClass();
        ((z) this.f30b).setSpan(new x(wVar), i, i2, 33);
        return true;
    }

    public void n(boolean z2) {
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = ((I) this.f31c).f823v;
        if (abstractComponentCallbacksC0048q != null) {
            abstractComponentCallbacksC0048q.j().f813l.n(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f30b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public void o(boolean z2) {
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = ((I) this.f31c).f823v;
        if (abstractComponentCallbacksC0048q != null) {
            abstractComponentCallbacksC0048q.j().f813l.o(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f30b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public void p(boolean z2) {
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = ((I) this.f31c).f823v;
        if (abstractComponentCallbacksC0048q != null) {
            abstractComponentCallbacksC0048q.j().f813l.p(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f30b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public void q(boolean z2) {
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = ((I) this.f31c).f823v;
        if (abstractComponentCallbacksC0048q != null) {
            abstractComponentCallbacksC0048q.j().f813l.q(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f30b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public void r(boolean z2) {
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = ((I) this.f31c).f823v;
        if (abstractComponentCallbacksC0048q != null) {
            abstractComponentCallbacksC0048q.j().f813l.r(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f30b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public void s(boolean z2) {
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = ((I) this.f31c).f823v;
        if (abstractComponentCallbacksC0048q != null) {
            abstractComponentCallbacksC0048q.j().f813l.s(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f30b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public void t(int i) {
        int[] iArr = (int[]) this.f30b;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i, 10) + 1];
            this.f30b = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i >= iArr.length) {
            int length = iArr.length;
            while (length <= i) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.f30b = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = (int[]) this.f30b;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    public String toString() {
        switch (this.f29a) {
            case 3:
                return "Bounds{lower=" + ((C.d) this.f30b) + " upper=" + ((C.d) this.f31c) + "}";
            case 16:
                String str = "[ ";
                if (((C0291f) this.f30b) != null) {
                    for (int i = 0; i < 9; i++) {
                        str = str + ((C0291f) this.f30b).h[i] + " ";
                    }
                }
                return str + "] " + ((C0291f) this.f30b);
            default:
                return super.toString();
        }
    }

    public View u(int i, int i2, int i3, int i4) {
        View u2;
        G g2 = (G) this.f30b;
        int d = g2.d();
        int c2 = g2.c();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            switch (g2.f1950a) {
                case 0:
                    u2 = g2.f1951b.u(i);
                    break;
                default:
                    u2 = g2.f1951b.u(i);
                    break;
            }
            int b2 = g2.b(u2);
            int a2 = g2.a(u2);
            g0 g0Var = (g0) this.f31c;
            g0Var.f2075b = d;
            g0Var.f2076c = c2;
            g0Var.d = b2;
            g0Var.f2077e = a2;
            if (i3 != 0) {
                g0Var.f2074a = i3;
                if (g0Var.a()) {
                    return u2;
                }
            }
            if (i4 != 0) {
                g0Var.f2074a = i4;
                if (g0Var.a()) {
                    view = u2;
                }
            }
            i += i5;
        }
        return view;
    }

    public void w() {
        ((SparseIntArray) this.f30b).clear();
    }

    public boolean x(View view) {
        G g2 = (G) this.f30b;
        int d = g2.d();
        int c2 = g2.c();
        int b2 = g2.b(view);
        int a2 = g2.a(view);
        g0 g0Var = (g0) this.f31c;
        g0Var.f2075b = d;
        g0Var.f2076c = c2;
        g0Var.d = b2;
        g0Var.f2077e = a2;
        g0Var.f2074a = 24579;
        return g0Var.a();
    }

    public void y(int i, int i2) {
        int[] iArr = (int[]) this.f30b;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        t(i3);
        int[] iArr2 = (int[]) this.f30b;
        System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
        Arrays.fill((int[]) this.f30b, i, i3, -1);
        ArrayList arrayList = (ArrayList) this.f31c;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            d0 d0Var = (d0) ((ArrayList) this.f31c).get(size);
            int i4 = d0Var.f2045a;
            if (i4 >= i) {
                d0Var.f2045a = i4 + i2;
            }
        }
    }

    public void z(int i, int i2) {
        int[] iArr = (int[]) this.f30b;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        t(i3);
        int[] iArr2 = (int[]) this.f30b;
        System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
        int[] iArr3 = (int[]) this.f30b;
        Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
        ArrayList arrayList = (ArrayList) this.f31c;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            d0 d0Var = (d0) ((ArrayList) this.f31c).get(size);
            int i4 = d0Var.f2045a;
            if (i4 >= i) {
                if (i4 < i3) {
                    ((ArrayList) this.f31c).remove(size);
                } else {
                    d0Var.f2045a = i4 - i2;
                }
            }
        }
    }

    public /* synthetic */ j(Object obj, int i, Object obj2) {
        this.f29a = i;
        this.f30b = obj;
        this.f31c = obj2;
    }

    public j(C0289d c0289d) {
        this.f29a = 16;
        this.f31c = c0289d;
    }

    public j(I i) {
        this.f29a = 8;
        this.f30b = new CopyOnWriteArrayList();
        this.f31c = i;
    }

    public j(G g2) {
        this.f29a = 12;
        this.f30b = g2;
        g0 g0Var = new g0();
        g0Var.f2074a = 0;
        this.f31c = g0Var;
    }

    public j(Animation animation) {
        this.f29a = 7;
        this.f30b = animation;
        this.f31c = null;
    }

    public j(Animator animator) {
        this.f29a = 7;
        this.f30b = null;
        this.f31c = animator;
    }

    public j(ArrayList arrayList, ArrayList arrayList2) {
        this.f29a = 0;
        int size = arrayList.size();
        this.f30b = new int[size];
        this.f31c = new float[size];
        for (int i = 0; i < size; i++) {
            ((int[]) this.f30b)[i] = ((Integer) arrayList.get(i)).intValue();
            ((float[]) this.f31c)[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }

    public j(int i, int i2) {
        this.f29a = 0;
        this.f30b = new int[]{i, i2};
        this.f31c = new float[]{0.0f, 1.0f};
    }

    public j(int i, int i2, int i3) {
        this.f29a = 0;
        this.f30b = new int[]{i, i2, i3};
        this.f31c = new float[]{0.0f, 0.5f, 1.0f};
    }

    public j(EditText editText) {
        this.f29a = 5;
        this.f30b = editText;
        V.i iVar = new V.i(editText);
        this.f31c = iVar;
        editText.addTextChangedListener(iVar);
        if (V.a.f760b == null) {
            synchronized (V.a.f759a) {
                try {
                    if (V.a.f760b == null) {
                        V.a aVar = new V.a();
                        try {
                            V.a.f761c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, V.a.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        V.a.f760b = aVar;
                    }
                } finally {
                }
            }
        }
        editText.setEditableFactory(V.a.f760b);
    }

    public j(int i) {
        this.f29a = i;
        switch (i) {
            case 13:
                this.f30b = new o.k();
                this.f31c = new o.e();
                break;
            default:
                this.f30b = new SparseIntArray();
                this.f31c = new SparseIntArray();
                break;
        }
    }

    public j(LayoutInflaterFactory2C0109A layoutInflaterFactory2C0109A, t tVar) {
        this.f29a = 14;
        this.f31c = layoutInflaterFactory2C0109A;
        this.f30b = tVar;
    }
}
