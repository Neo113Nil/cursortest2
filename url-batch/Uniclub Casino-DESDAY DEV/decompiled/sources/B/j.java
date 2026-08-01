package B;

import K.C0016q;
import K.E;
import K.S;
import K.Z;
import K.u0;
import K.w0;
import T.A;
import T.u;
import T.x;
import T.y;
import X.AbstractComponentCallbacksC0048q;
import X.I;
import X.U;
import X0.d;
import android.animation.Animator;
import android.content.Context;
import android.content.SharedPreferences;
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
import com.fortuneodd.shadegrid.MainActivity;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import f0.G;
import f0.X;
import f0.d0;
import f0.g0;
import f0.h0;
import g.AbstractActivityC0138i;
import g.LayoutInflaterFactory2C0122A;
import j.AbstractC0148a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import k.MenuC0152B;
import k.MenuC0168m;
import org.xmlpull.v1.XmlPullParserException;
import q.C0285d;
import q.C0287f;
import v.C0318b;
import v.C0325i;

/* loaded from: classes.dex */
public final class j implements K.r, T.p, G.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27a;

    /* renamed from: b, reason: collision with root package name */
    public Object f28b;

    /* renamed from: c, reason: collision with root package name */
    public Object f29c;

    public /* synthetic */ j(int i, boolean z2) {
        this.f27a = i;
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

    public void A(AbstractC0148a abstractC0148a) {
        u uVar = (u) this.f28b;
        ((ActionMode.Callback) uVar.f750a).onDestroyActionMode(uVar.g(abstractC0148a));
        LayoutInflaterFactory2C0122A layoutInflaterFactory2C0122A = (LayoutInflaterFactory2C0122A) this.f29c;
        if (layoutInflaterFactory2C0122A.f2242w != null) {
            layoutInflaterFactory2C0122A.f2231l.getDecorView().removeCallbacks(layoutInflaterFactory2C0122A.f2243x);
        }
        if (layoutInflaterFactory2C0122A.f2241v != null) {
            Z z2 = layoutInflaterFactory2C0122A.f2244y;
            if (z2 != null) {
                z2.b();
            }
            Z a2 = S.a(layoutInflaterFactory2C0122A.f2241v);
            a2.a(0.0f);
            layoutInflaterFactory2C0122A.f2244y = a2;
            a2.d(new g.r(2, this));
        }
        layoutInflaterFactory2C0122A.f2240u = null;
        ViewGroup viewGroup = layoutInflaterFactory2C0122A.f2197B;
        WeakHashMap weakHashMap = S.f360a;
        E.c(viewGroup);
        layoutInflaterFactory2C0122A.H();
    }

    public void B(m1.j jVar, IOException iOException) {
        MainActivity mainActivity = (MainActivity) this.f29c;
        mainActivity.runOnUiThread(new D0.p(10, mainActivity));
    }

    public boolean C(AbstractC0148a abstractC0148a, MenuC0168m menuC0168m) {
        ViewGroup viewGroup = ((LayoutInflaterFactory2C0122A) this.f29c).f2197B;
        WeakHashMap weakHashMap = S.f360a;
        E.c(viewGroup);
        u uVar = (u) this.f28b;
        j.e g2 = uVar.g(abstractC0148a);
        o.k kVar = (o.k) uVar.d;
        Menu menu = (Menu) kVar.getOrDefault(menuC0168m, null);
        if (menu == null) {
            menu = new MenuC0152B((Context) uVar.f751b, menuC0168m);
            kVar.put(menuC0168m, menu);
        }
        return ((ActionMode.Callback) uVar.f750a).onPrepareActionMode(g2, menu);
    }

    public void D(m1.j jVar, i1.u uVar) {
        final String str = ((i1.n) jVar.f3235b.f206c).h;
        final String str2 = ((i1.n) uVar.f2528a.f206c).h;
        final MainActivity mainActivity = (MainActivity) this.f29c;
        mainActivity.runOnUiThread(new Runnable() { // from class: n0.c
            @Override // java.lang.Runnable
            public final void run() {
                String str3 = str;
                String str4 = str2;
                boolean a2 = d.a(str3, str4);
                MainActivity mainActivity2 = mainActivity;
                if (a2) {
                    int i = MainActivity.f1519E;
                    mainActivity2.v();
                    return;
                }
                SharedPreferences sharedPreferences = mainActivity2.f1521B;
                if (sharedPreferences == null) {
                    d.h("prefs");
                    throw null;
                }
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putString((String) this.f28b, str4);
                edit.apply();
                mainActivity2.f1522C = str4;
                mainActivity2.w(str4);
            }
        });
    }

    public void E(H.h hVar) {
        int i = hVar.f216b;
        Handler handler = (Handler) this.f29c;
        C.g gVar = (C.g) this.f28b;
        if (i == 0) {
            handler.post(new H.a(gVar, 0, hVar.f215a));
        } else {
            handler.post(new H.b(gVar, i, 0));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:99:0x022b, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void F(Context context, XmlResourceParser xmlResourceParser) {
        int eventType;
        C0325i c0325i;
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
                    c0325i = null;
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
                                    c0325i = v.n.d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    break;
                                case 1:
                                    c0325i = v.n.d(context, Xml.asAttributeSet(xmlResourceParser), true);
                                    break;
                                case 2:
                                    c0325i = v.n.d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    c0325i.d.f3944a = true;
                                    break;
                                case 3:
                                    c0325i = v.n.d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    c0325i.d.f3957h0 = 1;
                                    break;
                                case 4:
                                    if (c0325i == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    c0325i.f3914b.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                case 5:
                                    if (c0325i == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    c0325i.f3916e.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                case 6:
                                    if (c0325i == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    c0325i.d.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                case 7:
                                    if (c0325i == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    c0325i.f3915c.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                case '\b':
                                case '\t':
                                    if (c0325i == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    C0318b.a(context, xmlResourceParser, c0325i.f3917f);
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
                                ((SparseArray) this.f29c).put(identifier, nVar);
                                return;
                            } else if (c2 == 1 || c2 == 2 || c2 == 3) {
                                nVar.f4006c.put(Integer.valueOf(c0325i.f3913a), c0325i);
                                c0325i = null;
                            }
                        }
                    } else {
                        xmlResourceParser.getName();
                    }
                    eventType = xmlResourceParser.next();
                }
                ((SparseArray) this.f29c).put(identifier, nVar);
                return;
            }
        }
    }

    public C0016q G(X x2, int i) {
        h0 h0Var;
        C0016q c0016q;
        o.k kVar = (o.k) this.f28b;
        int e2 = kVar.e(x2);
        if (e2 >= 0 && (h0Var = (h0) kVar.j(e2)) != null) {
            int i2 = h0Var.f2090a;
            if ((i2 & i) != 0) {
                int i3 = i2 & (~i);
                h0Var.f2090a = i3;
                if (i == 4) {
                    c0016q = h0Var.f2091b;
                } else {
                    if (i != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    c0016q = h0Var.f2092c;
                }
                if ((i3 & 12) == 0) {
                    kVar.i(e2);
                    h0Var.f2090a = 0;
                    h0Var.f2091b = null;
                    h0Var.f2092c = null;
                    h0.d.c(h0Var);
                }
                return c0016q;
            }
        }
        return null;
    }

    public void H(X x2) {
        h0 h0Var = (h0) ((o.k) this.f28b).getOrDefault(x2, null);
        if (h0Var == null) {
            return;
        }
        h0Var.f2090a &= -2;
    }

    public void I(X x2) {
        o.e eVar = (o.e) this.f29c;
        int e2 = eVar.e() - 1;
        while (true) {
            if (e2 < 0) {
                break;
            }
            if (x2 == eVar.f(e2)) {
                Object[] objArr = eVar.f3315c;
                Object obj = objArr[e2];
                Object obj2 = o.e.f3312e;
                if (obj != obj2) {
                    objArr[e2] = obj2;
                    eVar.f3313a = true;
                }
            } else {
                e2--;
            }
        }
        h0 h0Var = (h0) ((o.k) this.f28b).remove(x2);
        if (h0Var != null) {
            h0Var.f2090a = 0;
            h0Var.f2091b = null;
            h0Var.f2092c = null;
            h0.d.c(h0Var);
        }
    }

    public void J() {
        Object parcelable;
        Integer num;
        a.j jVar = (a.j) this.f28b;
        jVar.getClass();
        String str = (String) this.f29c;
        X0.d.e(str, "key");
        if (!jVar.d.contains(str) && (num = (Integer) jVar.f1051b.remove(str)) != null) {
            jVar.f1050a.remove(num);
        }
        jVar.f1053e.remove(str);
        LinkedHashMap linkedHashMap = jVar.f1054f;
        if (linkedHashMap.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + linkedHashMap.get(str));
            linkedHashMap.remove(str);
        }
        Bundle bundle = jVar.f1055g;
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
        if (jVar.f1052c.get(str) != null) {
            throw new ClassCastException();
        }
    }

    public void a(X x2, C0016q c0016q) {
        o.k kVar = (o.k) this.f28b;
        h0 h0Var = (h0) kVar.getOrDefault(x2, null);
        if (h0Var == null) {
            h0Var = h0.a();
            kVar.put(x2, h0Var);
        }
        h0Var.f2092c = c0016q;
        h0Var.f2090a |= 8;
    }

    public void b(boolean z2) {
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = ((I) this.f29c).f830v;
        if (abstractComponentCallbacksC0048q != null) {
            abstractComponentCallbacksC0048q.j().f820l.b(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f28b).iterator();
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
    public w0 c(View view, w0 w0Var) {
        boolean z2;
        boolean z3;
        D0.r rVar = (D0.r) this.f29c;
        int i = rVar.f166a;
        I.g gVar = (I.g) this.f28b;
        u0 u0Var = w0Var.f447a;
        C.c f2 = u0Var.f(7);
        C.c f3 = u0Var.f(32);
        int i2 = f2.f55b;
        BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) gVar.f245b;
        bottomSheetBehavior.f1597w = i2;
        boolean e2 = D0.n.e(view);
        int paddingBottom = view.getPaddingBottom();
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        boolean z4 = bottomSheetBehavior.f1589o;
        if (z4) {
            int a2 = w0Var.a();
            bottomSheetBehavior.f1596v = a2;
            paddingBottom = a2 + rVar.f168c;
        }
        int i3 = rVar.f167b;
        boolean z5 = bottomSheetBehavior.f1590p;
        int i4 = f2.f54a;
        if (z5) {
            paddingLeft = (e2 ? i3 : i) + i4;
        }
        boolean z6 = bottomSheetBehavior.f1591q;
        int i5 = f2.f56c;
        if (z6) {
            if (!e2) {
                i = i3;
            }
            paddingRight = i + i5;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        boolean z7 = true;
        if (!bottomSheetBehavior.f1593s || marginLayoutParams.leftMargin == i4) {
            z2 = false;
        } else {
            marginLayoutParams.leftMargin = i4;
            z2 = true;
        }
        if (bottomSheetBehavior.f1594t && marginLayoutParams.rightMargin != i5) {
            marginLayoutParams.rightMargin = i5;
            z2 = true;
        }
        if (bottomSheetBehavior.f1595u) {
            int i6 = marginLayoutParams.topMargin;
            int i7 = f2.f55b;
            if (i6 != i7) {
                marginLayoutParams.topMargin = i7;
                if (z7) {
                    view.setLayoutParams(marginLayoutParams);
                }
                view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
                z3 = gVar.f244a;
                if (z3) {
                    bottomSheetBehavior.f1587m = f3.d;
                }
                if (!z4 || z3) {
                    bottomSheetBehavior.I();
                }
                return w0Var;
            }
        }
        z7 = z2;
        if (z7) {
        }
        view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
        z3 = gVar.f244a;
        if (z3) {
        }
        if (!z4) {
        }
        bottomSheetBehavior.I();
        return w0Var;
    }

    public void d(boolean z2) {
        I i = (I) this.f29c;
        AbstractActivityC0138i abstractActivityC0138i = i.f828t.f999b;
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = i.f830v;
        if (abstractComponentCallbacksC0048q != null) {
            abstractComponentCallbacksC0048q.j().f820l.d(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f28b).iterator();
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

    public void e(boolean z2) {
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = ((I) this.f29c).f830v;
        if (abstractComponentCallbacksC0048q != null) {
            abstractComponentCallbacksC0048q.j().f820l.e(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f28b).iterator();
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

    public void f(boolean z2) {
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = ((I) this.f29c).f830v;
        if (abstractComponentCallbacksC0048q != null) {
            abstractComponentCallbacksC0048q.j().f820l.f(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f28b).iterator();
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

    @Override // T.p
    public Object g() {
        return (A) this.f28b;
    }

    public void h(boolean z2) {
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = ((I) this.f29c).f830v;
        if (abstractComponentCallbacksC0048q != null) {
            abstractComponentCallbacksC0048q.j().f820l.h(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f28b).iterator();
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

    public void i(boolean z2) {
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = ((I) this.f29c).f830v;
        if (abstractComponentCallbacksC0048q != null) {
            abstractComponentCallbacksC0048q.j().f820l.i(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f28b).iterator();
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

    public void j(boolean z2) {
        I i = (I) this.f29c;
        AbstractActivityC0138i abstractActivityC0138i = i.f828t.f999b;
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = i.f830v;
        if (abstractComponentCallbacksC0048q != null) {
            abstractComponentCallbacksC0048q.j().f820l.j(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f28b).iterator();
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
    public void k() {
        ((Animator) this.f28b).end();
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animator from operation " + ((U) this.f29c) + " has been canceled.");
        }
    }

    public void l(boolean z2) {
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = ((I) this.f29c).f830v;
        if (abstractComponentCallbacksC0048q != null) {
            abstractComponentCallbacksC0048q.j().f820l.l(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f28b).iterator();
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

    public void m(boolean z2) {
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = ((I) this.f29c).f830v;
        if (abstractComponentCallbacksC0048q != null) {
            abstractComponentCallbacksC0048q.j().f820l.m(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f28b).iterator();
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

    @Override // T.p
    public boolean n(CharSequence charSequence, int i, int i2, x xVar) {
        if ((xVar.f759c & 4) > 0) {
            return true;
        }
        if (((A) this.f28b) == null) {
            this.f28b = new A(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((J0.e) this.f29c).getClass();
        ((A) this.f28b).setSpan(new y(xVar), i, i2, 33);
        return true;
    }

    public void o(boolean z2) {
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = ((I) this.f29c).f830v;
        if (abstractComponentCallbacksC0048q != null) {
            abstractComponentCallbacksC0048q.j().f820l.o(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f28b).iterator();
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
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = ((I) this.f29c).f830v;
        if (abstractComponentCallbacksC0048q != null) {
            abstractComponentCallbacksC0048q.j().f820l.p(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f28b).iterator();
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
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = ((I) this.f29c).f830v;
        if (abstractComponentCallbacksC0048q != null) {
            abstractComponentCallbacksC0048q.j().f820l.q(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f28b).iterator();
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
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = ((I) this.f29c).f830v;
        if (abstractComponentCallbacksC0048q != null) {
            abstractComponentCallbacksC0048q.j().f820l.r(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f28b).iterator();
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
        AbstractComponentCallbacksC0048q abstractComponentCallbacksC0048q = ((I) this.f29c).f830v;
        if (abstractComponentCallbacksC0048q != null) {
            abstractComponentCallbacksC0048q.j().f820l.s(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f28b).iterator();
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
        int[] iArr = (int[]) this.f28b;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i, 10) + 1];
            this.f28b = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i >= iArr.length) {
            int length = iArr.length;
            while (length <= i) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.f28b = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = (int[]) this.f28b;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    public String toString() {
        switch (this.f27a) {
            case 3:
                return "Bounds{lower=" + ((C.c) this.f28b) + " upper=" + ((C.c) this.f29c) + "}";
            case 17:
                String str = "[ ";
                if (((C0287f) this.f28b) != null) {
                    for (int i = 0; i < 9; i++) {
                        str = str + ((C0287f) this.f28b).h[i] + " ";
                    }
                }
                return str + "] " + ((C0287f) this.f28b);
            default:
                return super.toString();
        }
    }

    public View u(int i, int i2, int i3, int i4) {
        View u2;
        G g2 = (G) this.f28b;
        int d = g2.d();
        int c2 = g2.c();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            switch (g2.f1958a) {
                case 0:
                    u2 = g2.f1959b.u(i);
                    break;
                default:
                    u2 = g2.f1959b.u(i);
                    break;
            }
            int b2 = g2.b(u2);
            int a2 = g2.a(u2);
            g0 g0Var = (g0) this.f29c;
            g0Var.f2083b = d;
            g0Var.f2084c = c2;
            g0Var.d = b2;
            g0Var.f2085e = a2;
            if (i3 != 0) {
                g0Var.f2082a = i3;
                if (g0Var.a()) {
                    return u2;
                }
            }
            if (i4 != 0) {
                g0Var.f2082a = i4;
                if (g0Var.a()) {
                    view = u2;
                }
            }
            i += i5;
        }
        return view;
    }

    public void w() {
        ((SparseIntArray) this.f28b).clear();
    }

    public boolean x(View view) {
        G g2 = (G) this.f28b;
        int d = g2.d();
        int c2 = g2.c();
        int b2 = g2.b(view);
        int a2 = g2.a(view);
        g0 g0Var = (g0) this.f29c;
        g0Var.f2083b = d;
        g0Var.f2084c = c2;
        g0Var.d = b2;
        g0Var.f2085e = a2;
        g0Var.f2082a = 24579;
        return g0Var.a();
    }

    public void y(int i, int i2) {
        int[] iArr = (int[]) this.f28b;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        t(i3);
        int[] iArr2 = (int[]) this.f28b;
        System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
        Arrays.fill((int[]) this.f28b, i, i3, -1);
        ArrayList arrayList = (ArrayList) this.f29c;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            d0 d0Var = (d0) ((ArrayList) this.f29c).get(size);
            int i4 = d0Var.f2053a;
            if (i4 >= i) {
                d0Var.f2053a = i4 + i2;
            }
        }
    }

    public void z(int i, int i2) {
        int[] iArr = (int[]) this.f28b;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        t(i3);
        int[] iArr2 = (int[]) this.f28b;
        System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
        int[] iArr3 = (int[]) this.f28b;
        Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
        ArrayList arrayList = (ArrayList) this.f29c;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            d0 d0Var = (d0) ((ArrayList) this.f29c).get(size);
            int i4 = d0Var.f2053a;
            if (i4 >= i) {
                if (i4 < i3) {
                    ((ArrayList) this.f29c).remove(size);
                } else {
                    d0Var.f2053a = i4 - i2;
                }
            }
        }
    }

    public /* synthetic */ j(Object obj, int i, Object obj2) {
        this.f27a = i;
        this.f28b = obj;
        this.f29c = obj2;
    }

    public j(C0285d c0285d) {
        this.f27a = 17;
        this.f29c = c0285d;
    }

    public j(I i) {
        this.f27a = 8;
        this.f28b = new CopyOnWriteArrayList();
        this.f29c = i;
    }

    public j(MainActivity mainActivity, String str) {
        this.f27a = 16;
        X0.d.e(str, "prefsKey");
        this.f29c = mainActivity;
        this.f28b = str;
    }

    public j(G g2) {
        this.f27a = 12;
        this.f28b = g2;
        g0 g0Var = new g0();
        g0Var.f2082a = 0;
        this.f29c = g0Var;
    }

    public j(Animation animation) {
        this.f27a = 7;
        this.f28b = animation;
        this.f29c = null;
    }

    public j(Animator animator) {
        this.f27a = 7;
        this.f28b = null;
        this.f29c = animator;
    }

    public j(ArrayList arrayList, ArrayList arrayList2) {
        this.f27a = 0;
        int size = arrayList.size();
        this.f28b = new int[size];
        this.f29c = new float[size];
        for (int i = 0; i < size; i++) {
            ((int[]) this.f28b)[i] = ((Integer) arrayList.get(i)).intValue();
            ((float[]) this.f29c)[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }

    public j(int i, int i2) {
        this.f27a = 0;
        this.f28b = new int[]{i, i2};
        this.f29c = new float[]{0.0f, 1.0f};
    }

    public j(int i, int i2, int i3) {
        this.f27a = 0;
        this.f28b = new int[]{i, i2, i3};
        this.f29c = new float[]{0.0f, 0.5f, 1.0f};
    }

    public j(EditText editText) {
        this.f27a = 5;
        this.f28b = editText;
        V.i iVar = new V.i(editText);
        this.f29c = iVar;
        editText.addTextChangedListener(iVar);
        if (V.a.f767b == null) {
            synchronized (V.a.f766a) {
                try {
                    if (V.a.f767b == null) {
                        V.a aVar = new V.a();
                        try {
                            V.a.f768c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, V.a.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        V.a.f767b = aVar;
                    }
                } finally {
                }
            }
        }
        editText.setEditableFactory(V.a.f767b);
    }

    public j(int i) {
        this.f27a = i;
        switch (i) {
            case 13:
                this.f28b = new o.k();
                this.f29c = new o.e();
                break;
            default:
                this.f28b = new SparseIntArray();
                this.f29c = new SparseIntArray();
                break;
        }
    }

    public j(LayoutInflaterFactory2C0122A layoutInflaterFactory2C0122A, u uVar) {
        this.f27a = 14;
        this.f29c = layoutInflaterFactory2C0122A;
        this.f28b = uVar;
    }
}
