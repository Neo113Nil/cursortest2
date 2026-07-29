package o;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Bundle;
import android.os.Handler;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AbsSeekBar;
import android.widget.EditText;
import com.google.firebase.messaging.Constants;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: o.u5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2002u5 implements InterfaceC0686a4, A1, InterfaceC0821c8, InterfaceC1280j8, InterfaceC1808r9, InterfaceC0531Uj, InterfaceC2243xm, InterfaceC1113gb, InterfaceC0311Lx {
    public static final int[] k = {R.attr.indeterminateDrawable, R.attr.progressDrawable};
    public final /* synthetic */ int h;
    public Object i;
    public Object j;

    public /* synthetic */ C2002u5(int i, Object obj, Object obj2, boolean z) {
        this.h = i;
        this.i = obj;
        this.j = obj2;
    }

    public void A(C0027Ay c0027Ay, boolean z) {
        C2002u5 c2002u5 = (C2002u5) this.j;
        C2002u5 c2002u52 = (C2002u5) this.i;
        if (z) {
            c2002u52.z(c0027Ay);
            c2002u5.z(c0027Ay);
        } else {
            if (((AW) c2002u52.j).contains(c0027Ay)) {
                return;
            }
            c2002u5.z(c0027Ay);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [o.oH] */
    public C1014f4 B(C0833cK c0833cK, InterfaceC0893dE interfaceC0893dE) {
        Map map;
        AbstractC0048Bt.n(c0833cK, "proto");
        AbstractC0048Bt.n(interfaceC0893dE, "nameResolver");
        InterfaceC1245ib q = AbstractC1052fg.q((InterfaceC0761bD) this.i, AbstractC1052fg.x(interfaceC0893dE, c0833cK.j), (C1334k) this.j);
        if (c0833cK.k.size() != 0 && !C0273Kk.f(q) && AbstractC0114Eh.n(q, 5)) {
            Collection E = q.E();
            AbstractC0048Bt.m(E, "annotationClass.constructors");
            C0981eb c0981eb = (C0981eb) AbstractC0720ac.E0(E);
            if (c0981eb != null) {
                List t0 = c0981eb.t0();
                AbstractC0048Bt.m(t0, "constructor.valueParameters");
                int E2 = EB.E(AbstractC0786bc.d0(t0));
                if (E2 < 16) {
                    E2 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(E2);
                for (Object obj : t0) {
                    linkedHashMap.put(((RY) obj).getName(), obj);
                }
                List<C0702aK> list = c0833cK.k;
                AbstractC0048Bt.m(list, "proto.argumentList");
                ArrayList arrayList = new ArrayList();
                for (C0702aK c0702aK : list) {
                    AbstractC0048Bt.m(c0702aK, "it");
                    RY ry = (RY) linkedHashMap.get(AbstractC1052fg.C(interfaceC0893dE, c0702aK.j));
                    if (ry != null) {
                        C0827cE C = AbstractC1052fg.C(interfaceC0893dE, c0702aK.j);
                        AbstractC1004ey c = ry.c();
                        AbstractC0048Bt.m(c, "parameter.type");
                        ZJ zj = c0702aK.k;
                        AbstractC0048Bt.m(zj, "proto.value");
                        AbstractC0551Vd X = X(c, zj, interfaceC0893dE);
                        r5 = P(X, c, zj) ? X : null;
                        if (r5 == null) {
                            String str = "Unexpected argument value: actual type " + zj.j + " != expected type " + c;
                            AbstractC0048Bt.n(str, "message");
                            r5 = new C0299Lk(str);
                        }
                        r5 = new C1619oH(C, r5);
                    }
                    if (r5 != null) {
                        arrayList.add(r5);
                    }
                }
                map = EB.V(arrayList);
                return new C1014f4(q.i(), map, IS.e);
            }
        }
        map = C1384kk.h;
        return new C1014f4(q.i(), map, IS.e);
    }

    public void C(AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co, boolean z) {
        AbstractC0048Bt.n(abstractComponentCallbacksC0069Co, "f");
        AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co2 = ((AbstractC0588Wo) this.i).x;
        if (abstractComponentCallbacksC0069Co2 != null) {
            abstractComponentCallbacksC0069Co2.e().n.C(abstractComponentCallbacksC0069Co, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.j).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public void D(AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co, boolean z) {
        AbstractC0048Bt.n(abstractComponentCallbacksC0069Co, "f");
        AbstractC0588Wo abstractC0588Wo = (AbstractC0588Wo) this.i;
        J4 j4 = abstractC0588Wo.v.s;
        AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co2 = abstractC0588Wo.x;
        if (abstractComponentCallbacksC0069Co2 != null) {
            abstractComponentCallbacksC0069Co2.e().n.D(abstractComponentCallbacksC0069Co, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.j).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public void E(AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co, boolean z) {
        AbstractC0048Bt.n(abstractComponentCallbacksC0069Co, "f");
        AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co2 = ((AbstractC0588Wo) this.i).x;
        if (abstractComponentCallbacksC0069Co2 != null) {
            abstractComponentCallbacksC0069Co2.e().n.E(abstractComponentCallbacksC0069Co, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.j).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public void F(AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co, boolean z) {
        AbstractC0048Bt.n(abstractComponentCallbacksC0069Co, "f");
        AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co2 = ((AbstractC0588Wo) this.i).x;
        if (abstractComponentCallbacksC0069Co2 != null) {
            abstractComponentCallbacksC0069Co2.e().n.F(abstractComponentCallbacksC0069Co, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.j).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public void G(AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co, boolean z) {
        AbstractC0048Bt.n(abstractComponentCallbacksC0069Co, "f");
        AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co2 = ((AbstractC0588Wo) this.i).x;
        if (abstractComponentCallbacksC0069Co2 != null) {
            abstractComponentCallbacksC0069Co2.e().n.G(abstractComponentCallbacksC0069Co, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.j).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public void H(AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co, boolean z) {
        AbstractC0048Bt.n(abstractComponentCallbacksC0069Co, "f");
        AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co2 = ((AbstractC0588Wo) this.i).x;
        if (abstractComponentCallbacksC0069Co2 != null) {
            abstractComponentCallbacksC0069Co2.e().n.H(abstractComponentCallbacksC0069Co, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.j).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public void I(AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co, boolean z) {
        AbstractC0048Bt.n(abstractComponentCallbacksC0069Co, "f");
        AbstractC0588Wo abstractC0588Wo = (AbstractC0588Wo) this.i;
        J4 j4 = abstractC0588Wo.v.s;
        AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co2 = abstractC0588Wo.x;
        if (abstractComponentCallbacksC0069Co2 != null) {
            abstractComponentCallbacksC0069Co2.e().n.I(abstractComponentCallbacksC0069Co, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.j).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public void J(AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co, boolean z) {
        AbstractC0048Bt.n(abstractComponentCallbacksC0069Co, "f");
        AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co2 = ((AbstractC0588Wo) this.i).x;
        if (abstractComponentCallbacksC0069Co2 != null) {
            abstractComponentCallbacksC0069Co2.e().n.J(abstractComponentCallbacksC0069Co, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.j).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public void K(AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co, boolean z) {
        AbstractC0048Bt.n(abstractComponentCallbacksC0069Co, "f");
        AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co2 = ((AbstractC0588Wo) this.i).x;
        if (abstractComponentCallbacksC0069Co2 != null) {
            abstractComponentCallbacksC0069Co2.e().n.K(abstractComponentCallbacksC0069Co, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.j).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public void L(AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co, Bundle bundle, boolean z) {
        AbstractC0048Bt.n(abstractComponentCallbacksC0069Co, "f");
        AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co2 = ((AbstractC0588Wo) this.i).x;
        if (abstractComponentCallbacksC0069Co2 != null) {
            abstractComponentCallbacksC0069Co2.e().n.L(abstractComponentCallbacksC0069Co, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.j).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public void M(AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co, boolean z) {
        AbstractC0048Bt.n(abstractComponentCallbacksC0069Co, "f");
        AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co2 = ((AbstractC0588Wo) this.i).x;
        if (abstractComponentCallbacksC0069Co2 != null) {
            abstractComponentCallbacksC0069Co2.e().n.M(abstractComponentCallbacksC0069Co, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.j).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public void N(AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co, boolean z) {
        AbstractC0048Bt.n(abstractComponentCallbacksC0069Co, "f");
        AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co2 = ((AbstractC0588Wo) this.i).x;
        if (abstractComponentCallbacksC0069Co2 != null) {
            abstractComponentCallbacksC0069Co2.e().n.N(abstractComponentCallbacksC0069Co, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.j).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public void O(AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co, boolean z) {
        AbstractC0048Bt.n(abstractComponentCallbacksC0069Co, "f");
        AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co2 = ((AbstractC0588Wo) this.i).x;
        if (abstractComponentCallbacksC0069Co2 != null) {
            abstractComponentCallbacksC0069Co2.e().n.O(abstractComponentCallbacksC0069Co, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.j).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public boolean P(AbstractC0551Vd abstractC0551Vd, AbstractC1004ey abstractC1004ey, ZJ zj) {
        InterfaceC0761bD interfaceC0761bD = (InterfaceC0761bD) this.i;
        YJ yj = zj.j;
        int i = yj == null ? -1 : AbstractC1080g4.a[yj.ordinal()];
        if (i == 10) {
            InterfaceC2364zb c = abstractC1004ey.B0().c();
            InterfaceC1245ib interfaceC1245ib = c instanceof InterfaceC1245ib ? (InterfaceC1245ib) c : null;
            if (interfaceC1245ib != null) {
                C0827cE c0827cE = AbstractC0545Ux.e;
                if (!AbstractC0545Ux.b(interfaceC1245ib, AbstractC1433lT.P)) {
                    return false;
                }
            }
            return true;
        }
        if (i != 13) {
            return AbstractC0048Bt.h(abstractC0551Vd.a(interfaceC0761bD), abstractC1004ey);
        }
        if (abstractC0551Vd instanceof O6) {
            O6 o6 = (O6) abstractC0551Vd;
            if (((List) o6.a).size() == zj.r.size()) {
                AbstractC1004ey f = interfaceC0761bD.l().f(abstractC1004ey);
                Collection collection = (Collection) o6.a;
                AbstractC0048Bt.n(collection, "<this>");
                Iterable c1197ht = new C1197ht(0, collection.size() - 1, 1);
                if (!(c1197ht instanceof Collection) || !((Collection) c1197ht).isEmpty()) {
                    Iterator it = c1197ht.iterator();
                    while (((C1131gt) it).j) {
                        int nextInt = ((C1131gt) it).nextInt();
                        AbstractC0551Vd abstractC0551Vd2 = (AbstractC0551Vd) ((List) o6.a).get(nextInt);
                        ZJ zj2 = (ZJ) zj.r.get(nextInt);
                        AbstractC0048Bt.m(zj2, "value.getArrayElement(i)");
                        if (!P(abstractC0551Vd2, f, zj2)) {
                            return false;
                        }
                    }
                }
                return true;
            }
        }
        throw new IllegalStateException(("Deserialized ArrayValue should have the same number of elements as the original array value: " + abstractC0551Vd).toString());
    }

    public InterfaceC0980ea Q() {
        return ((C1112ga) this.j).b.c;
    }

    public KeyListener R(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        ((C2002u5) ((Y1) this.j).i).getClass();
        if (keyListener instanceof C0505Tj) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new C0505Tj(keyListener);
    }

    public boolean S() {
        return !(((AW) ((C2002u5) this.j).j).isEmpty() && ((AW) ((C2002u5) this.i).j).isEmpty());
    }

    public void T(AttributeSet attributeSet, int i) {
        switch (this.h) {
            case 0:
                AbsSeekBar absSeekBar = (AbsSeekBar) this.i;
                C0950e6 F = C0950e6.F(absSeekBar.getContext(), attributeSet, k, i);
                Drawable y = F.y(0);
                if (y != null) {
                    if (y instanceof AnimationDrawable) {
                        AnimationDrawable animationDrawable = (AnimationDrawable) y;
                        int numberOfFrames = animationDrawable.getNumberOfFrames();
                        AnimationDrawable animationDrawable2 = new AnimationDrawable();
                        animationDrawable2.setOneShot(animationDrawable.isOneShot());
                        for (int i2 = 0; i2 < numberOfFrames; i2++) {
                            Drawable d0 = d0(animationDrawable.getFrame(i2), true);
                            d0.setLevel(10000);
                            animationDrawable2.addFrame(d0, animationDrawable.getDuration(i2));
                        }
                        animationDrawable2.setLevel(10000);
                        y = animationDrawable2;
                    }
                    absSeekBar.setIndeterminateDrawable(y);
                }
                Drawable y2 = F.y(1);
                if (y2 != null) {
                    absSeekBar.setProgressDrawable(d0(y2, false));
                }
                F.L();
                return;
            default:
                TypedArray obtainStyledAttributes = ((EditText) this.i).getContext().obtainStyledAttributes(attributeSet, AbstractC1886sL.i, i, 0);
                try {
                    boolean z = obtainStyledAttributes.hasValue(14) ? obtainStyledAttributes.getBoolean(14, true) : true;
                    obtainStyledAttributes.recycle();
                    a0(z);
                    return;
                } catch (Throwable th) {
                    obtainStyledAttributes.recycle();
                    throw th;
                }
        }
    }

    public C0427Qj U(InputConnection inputConnection, EditorInfo editorInfo) {
        Y1 y1 = (Y1) this.j;
        if (inputConnection == null) {
            y1.getClass();
            inputConnection = null;
        } else {
            C2002u5 c2002u5 = (C2002u5) y1.i;
            c2002u5.getClass();
            if (!(inputConnection instanceof C0427Qj)) {
                inputConnection = new C0427Qj((EditText) c2002u5.i, inputConnection, editorInfo);
            }
        }
        return (C0427Qj) inputConnection;
    }

    public void V(C0863co c0863co) {
        Handler handler = (Handler) this.j;
        C1818rJ c1818rJ = (C1818rJ) this.i;
        int i = c0863co.b;
        if (i != 0) {
            handler.post(new F9(i, 0, c1818rJ));
        } else {
            handler.post(new RunnableC1996u1(4, c1818rJ, c0863co.a, false));
        }
    }

    public boolean W(C0027Ay c0027Ay) {
        if (c0027Ay.v()) {
            return ((AW) this.j).remove(c0027Ay);
        }
        AbstractC0868ct.W("DepthSortedSet.remove called on an unattached node");
        throw null;
    }

    public AbstractC0551Vd X(AbstractC1004ey abstractC1004ey, ZJ zj, InterfaceC0893dE interfaceC0893dE) {
        AbstractC0048Bt.n(zj, "value");
        AbstractC0048Bt.n(interfaceC0893dE, "nameResolver");
        boolean booleanValue = AbstractC1650om.M.c(zj.t).booleanValue();
        YJ yj = zj.j;
        switch (yj == null ? -1 : AbstractC1080g4.a[yj.ordinal()]) {
            case 1:
                byte b = (byte) zj.k;
                return booleanValue ? new UX(b) : new C1413l9(b);
            case 2:
                return new C0444Ra(Character.valueOf((char) zj.k));
            case 3:
                short s = (short) zj.k;
                return booleanValue ? new UX(s) : new C1563nR(s);
            case 4:
                int i = (int) zj.k;
                return booleanValue ? new UX(i) : new C1525mt(i);
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                long j = zj.k;
                return booleanValue ? new UX(j) : new C1283jB(j);
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                return new C1742q8(zj.l);
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
                return new C1742q8(zj.m);
            case 8:
                return new C1742q8(Boolean.valueOf(zj.k != 0));
            case 9:
                return new ST(interfaceC0893dE.getString(zj.n));
            case 10:
                return new C1002ew(AbstractC1052fg.x(interfaceC0893dE, zj.f135o), zj.s);
            case 11:
                return new C2175wk(AbstractC1052fg.x(interfaceC0893dE, zj.f135o), AbstractC1052fg.C(interfaceC0893dE, zj.p));
            case 12:
                C0833cK c0833cK = zj.q;
                AbstractC0048Bt.m(c0833cK, "value.annotation");
                return new C1606o4((Object) B(c0833cK, interfaceC0893dE));
            case 13:
                List<ZJ> list = zj.r;
                AbstractC0048Bt.m(list, "value.arrayElementList");
                ArrayList arrayList = new ArrayList(AbstractC0786bc.d0(list));
                for (ZJ zj2 : list) {
                    JR e = ((InterfaceC0761bD) this.i).l().e();
                    AbstractC0048Bt.m(zj2, "it");
                    arrayList.add(X(e, zj2, interfaceC0893dE));
                }
                return new AX(arrayList, abstractC1004ey);
            default:
                throw new IllegalStateException(("Unsupported annotation argument type: " + zj.j + " (expected " + abstractC1004ey + ')').toString());
        }
    }

    public void Y(InterfaceC0980ea interfaceC0980ea) {
        ((C1112ga) this.j).b.c = interfaceC0980ea;
    }

    public void Z(InterfaceC1119gh interfaceC1119gh) {
        ((C1112ga) this.j).b.a = interfaceC1119gh;
    }

    @Override // o.A1
    public boolean a(B1 b1, Menu menu) {
        return ((A1) this.i).a(b1, menu);
    }

    public void a0(boolean z) {
        C0661Zj c0661Zj = (C0661Zj) ((C2002u5) ((Y1) this.j).i).j;
        if (c0661Zj.j != z) {
            if (c0661Zj.i != null) {
                C0272Kj a = C0272Kj.a();
                C0635Yj c0635Yj = c0661Zj.i;
                a.getClass();
                AbstractC1807r8.m(c0635Yj, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = a.a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    a.b.remove(c0635Yj);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            c0661Zj.j = z;
            if (z) {
                C0661Zj.a(c0661Zj.h, C0272Kj.a().b());
            }
        }
    }

    @Override // o.InterfaceC0531Uj
    public Object b() {
        return (C1372kY) this.i;
    }

    public void b0(EnumC2057uy enumC2057uy) {
        ((C1112ga) this.j).b.b = enumC2057uy;
    }

    @Override // o.InterfaceC1146h4
    public ArrayList c(C0769bL c0769bL) {
        AbstractC0048Bt.n(c0769bL, "container");
        Iterable iterable = (List) c0769bL.d.k(((TQ) this.i).c);
        if (iterable == null) {
            iterable = C1318jk.h;
        }
        ArrayList arrayList = new ArrayList(AbstractC0786bc.d0(iterable));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(((C2002u5) this.j).B((C0833cK) it.next(), c0769bL.a));
        }
        return arrayList;
    }

    public void c0(long j) {
        ((C1112ga) this.j).b.d = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00bb  */
    @Override // o.InterfaceC2243xm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object collect(InterfaceC2309ym interfaceC2309ym, InterfaceC2235xe interfaceC2235xe) {
        C0197Hm c0197Hm;
        int i;
        EnumC0448Re enumC0448Re;
        Throwable th;
        C1561nP c1561nP;
        C2002u5 c2002u5;
        InterfaceC2309ym interfaceC2309ym2;
        InterfaceC2243xm interfaceC2243xm;
        C0275Km c0275Km;
        int i2;
        C0426Qi c0426Qi;
        switch (this.h) {
            case 21:
                if (interfaceC2235xe instanceof C0197Hm) {
                    c0197Hm = (C0197Hm) interfaceC2235xe;
                    int i3 = c0197Hm.i;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        c0197Hm.i = i3 - Integer.MIN_VALUE;
                        Object obj = c0197Hm.h;
                        i = c0197Hm.i;
                        C0782bY c0782bY = C0782bY.a;
                        enumC0448Re = EnumC0448Re.h;
                        if (i != 0) {
                            AbstractC1494mO.l(obj);
                            C1561nP c1561nP2 = new C1561nP(interfaceC2309ym, c0197Hm.getContext());
                            try {
                                C2368zf c2368zf = (C2368zf) this.i;
                                c0197Hm.k = this;
                                c0197Hm.l = interfaceC2309ym;
                                c0197Hm.m = c1561nP2;
                                c0197Hm.i = 1;
                                c2368zf.invoke(c1561nP2, c0197Hm);
                                if (c0782bY != enumC0448Re) {
                                    c2002u5 = this;
                                    interfaceC2309ym2 = interfaceC2309ym;
                                    c1561nP = c1561nP2;
                                }
                                return enumC0448Re;
                            } catch (Throwable th2) {
                                th = th2;
                                c1561nP = c1561nP2;
                                c1561nP.releaseIntercepted();
                                throw th;
                            }
                        }
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            AbstractC1494mO.l(obj);
                            return c0782bY;
                        }
                        c1561nP = c0197Hm.m;
                        interfaceC2309ym2 = c0197Hm.l;
                        c2002u5 = c0197Hm.k;
                        try {
                            AbstractC1494mO.l(obj);
                        } catch (Throwable th3) {
                            th = th3;
                            c1561nP.releaseIntercepted();
                            throw th;
                        }
                        c1561nP.releaseIntercepted();
                        interfaceC2243xm = (InterfaceC2243xm) c2002u5.j;
                        c0197Hm.k = null;
                        c0197Hm.l = null;
                        c0197Hm.m = null;
                        c0197Hm.i = 2;
                        if (interfaceC2243xm.collect(interfaceC2309ym2, c0197Hm) != enumC0448Re) {
                            return c0782bY;
                        }
                        return enumC0448Re;
                    }
                }
                c0197Hm = new C0197Hm(this, interfaceC2235xe);
                Object obj2 = c0197Hm.h;
                i = c0197Hm.i;
                C0782bY c0782bY2 = C0782bY.a;
                enumC0448Re = EnumC0448Re.h;
                if (i != 0) {
                }
                c1561nP.releaseIntercepted();
                interfaceC2243xm = (InterfaceC2243xm) c2002u5.j;
                c0197Hm.k = null;
                c0197Hm.l = null;
                c0197Hm.m = null;
                c0197Hm.i = 2;
                if (interfaceC2243xm.collect(interfaceC2309ym2, c0197Hm) != enumC0448Re) {
                }
                return enumC0448Re;
            case 22:
                Object collect = ((C0289La) this.i).collect(new C0249Jm(new C1098gM(), interfaceC2309ym, (C1828rT) this.j), interfaceC2235xe);
                return collect == EnumC0448Re.h ? collect : C0782bY.a;
            default:
                if (interfaceC2235xe instanceof C0275Km) {
                    c0275Km = (C0275Km) interfaceC2235xe;
                    int i4 = c0275Km.i;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        c0275Km.i = i4 - Integer.MIN_VALUE;
                        Object obj3 = c0275Km.h;
                        i2 = c0275Km.i;
                        if (i2 != 0) {
                            AbstractC1494mO.l(obj3);
                            InterfaceC2243xm interfaceC2243xm2 = (InterfaceC2243xm) this.i;
                            C0426Qi c0426Qi2 = new C0426Qi((C0164Gf) this.j, interfaceC2309ym);
                            try {
                                c0275Km.k = c0426Qi2;
                                c0275Km.i = 1;
                                Object collect2 = interfaceC2243xm2.collect(c0426Qi2, c0275Km);
                                EnumC0448Re enumC0448Re2 = EnumC0448Re.h;
                                if (collect2 == enumC0448Re2) {
                                    return enumC0448Re2;
                                }
                            } catch (C0940e e) {
                                e = e;
                                c0426Qi = c0426Qi2;
                                if (e.h != c0426Qi) {
                                }
                                return C0782bY.a;
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            c0426Qi = c0275Km.k;
                            try {
                                AbstractC1494mO.l(obj3);
                            } catch (C0940e e2) {
                                e = e2;
                                if (e.h != c0426Qi) {
                                    throw e;
                                }
                                return C0782bY.a;
                            }
                        }
                        return C0782bY.a;
                    }
                }
                c0275Km = new C0275Km(this, interfaceC2235xe);
                Object obj32 = c0275Km.h;
                i2 = c0275Km.i;
                if (i2 != 0) {
                }
                return C0782bY.a;
        }
    }

    @Override // o.InterfaceC1146h4
    public ArrayList d(MK mk, InterfaceC0893dE interfaceC0893dE) {
        AbstractC0048Bt.n(mk, "proto");
        AbstractC0048Bt.n(interfaceC0893dE, "nameResolver");
        Iterable iterable = (List) mk.k(((TQ) this.i).k);
        if (iterable == null) {
            iterable = C1318jk.h;
        }
        ArrayList arrayList = new ArrayList(AbstractC0786bc.d0(iterable));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(((C2002u5) this.j).B((C0833cK) it.next(), interfaceC0893dE));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable d0(Drawable drawable, boolean z) {
        if (drawable instanceof T10) {
            ((U10) ((T10) drawable)).getClass();
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i = 0; i < numberOfLayers; i++) {
                    int id = layerDrawable.getId(i);
                    drawableArr[i] = d0(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int i2 = 0; i2 < numberOfLayers; i2++) {
                    layerDrawable2.setId(i2, layerDrawable.getId(i2));
                    layerDrawable2.setLayerGravity(i2, layerDrawable.getLayerGravity(i2));
                    layerDrawable2.setLayerWidth(i2, layerDrawable.getLayerWidth(i2));
                    layerDrawable2.setLayerHeight(i2, layerDrawable.getLayerHeight(i2));
                    layerDrawable2.setLayerInsetLeft(i2, layerDrawable.getLayerInsetLeft(i2));
                    layerDrawable2.setLayerInsetRight(i2, layerDrawable.getLayerInsetRight(i2));
                    layerDrawable2.setLayerInsetTop(i2, layerDrawable.getLayerInsetTop(i2));
                    layerDrawable2.setLayerInsetBottom(i2, layerDrawable.getLayerInsetBottom(i2));
                    layerDrawable2.setLayerInsetStart(i2, layerDrawable.getLayerInsetStart(i2));
                    layerDrawable2.setLayerInsetEnd(i2, layerDrawable.getLayerInsetEnd(i2));
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (((Bitmap) this.j) == null) {
                    this.j = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, o.N4] */
    @Override // o.A1
    public void e(B1 b1) {
        ((A1) this.i).e(b1);
        LayoutInflaterFactory2C1213i5 layoutInflaterFactory2C1213i5 = (LayoutInflaterFactory2C1213i5) this.j;
        if (layoutInflaterFactory2C1213i5.D != null) {
            layoutInflaterFactory2C1213i5.s.getDecorView().removeCallbacks(layoutInflaterFactory2C1213i5.E);
        }
        if (layoutInflaterFactory2C1213i5.C != null) {
            C0942e00 c0942e00 = layoutInflaterFactory2C1213i5.F;
            if (c0942e00 != null) {
                c0942e00.b();
            }
            C0942e00 a = AZ.a(layoutInflaterFactory2C1213i5.C);
            a.a(0.0f);
            layoutInflaterFactory2C1213i5.F = a;
            a.d(new Y4(2, this));
        }
        layoutInflaterFactory2C1213i5.u.onSupportActionModeFinished(layoutInflaterFactory2C1213i5.B);
        layoutInflaterFactory2C1213i5.B = null;
        ViewGroup viewGroup = layoutInflaterFactory2C1213i5.H;
        WeakHashMap weakHashMap = AZ.a;
        AbstractC1637oZ.c(viewGroup);
        layoutInflaterFactory2C1213i5.I();
    }

    public void e0(View view, float[] fArr) {
        float[] fArr2 = (float[]) this.i;
        Object parent = view.getParent();
        if (parent instanceof View) {
            e0((View) parent, fArr);
            AbstractC1473m3.X(fArr2);
            AbstractC1473m3.c0(fArr2, -view.getScrollX(), -view.getScrollY());
            AbstractC1473m3.V(fArr, fArr2);
            float left = view.getLeft();
            float top = view.getTop();
            AbstractC1473m3.X(fArr2);
            AbstractC1473m3.c0(fArr2, left, top);
            AbstractC1473m3.V(fArr, fArr2);
        } else {
            int[] iArr = (int[]) this.j;
            view.getLocationInWindow(iArr);
            AbstractC1473m3.X(fArr2);
            AbstractC1473m3.c0(fArr2, -view.getScrollX(), -view.getScrollY());
            AbstractC1473m3.V(fArr, fArr2);
            float f = iArr[0];
            float f2 = iArr[1];
            AbstractC1473m3.X(fArr2);
            AbstractC1473m3.c0(fArr2, f, f2);
            AbstractC1473m3.V(fArr, fArr2);
        }
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            return;
        }
        PX.L0(fArr2, matrix);
        AbstractC1473m3.V(fArr, fArr2);
    }

    @Override // o.InterfaceC1146h4
    public List f(AbstractC0900dL abstractC0900dL, E e, int i) {
        List list;
        TQ tq = (TQ) this.i;
        AbstractC0048Bt.n(e, "proto");
        AbstractC1888sN.p(i, "kind");
        if (e instanceof C1162hK) {
            list = (List) ((C1162hK) e).k(tq.b);
        } else if (e instanceof C2017uK) {
            list = (List) ((C2017uK) e).k(tq.d);
        } else {
            if (!(e instanceof CK)) {
                throw new IllegalStateException(("Unknown message: " + e).toString());
            }
            int v = AbstractC1888sN.v(i);
            if (v == 1) {
                list = (List) ((CK) e).k(tq.e);
            } else if (v == 2) {
                list = (List) ((CK) e).k(tq.f);
            } else {
                if (v != 3) {
                    throw new IllegalStateException("Unsupported callable kind with property proto");
                }
                list = (List) ((CK) e).k(tq.g);
            }
        }
        if (list == null) {
            list = C1318jk.h;
        }
        ArrayList arrayList = new ArrayList(AbstractC0786bc.d0(list));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((C2002u5) this.j).B((C0833cK) it.next(), abstractC0900dL.a));
        }
        return arrayList;
    }

    public C1334k f0(C0827cE c0827cE, String str) {
        AbstractC0048Bt.n(c0827cE, "name");
        String b = c0827cE.b();
        AbstractC0048Bt.m(b, "name.asString()");
        return new C1334k(this, new YB(b.concat(str)));
    }

    @Override // o.InterfaceC1146h4
    public List g(AbstractC0900dL abstractC0900dL, C1688pK c1688pK) {
        AbstractC0048Bt.n(abstractC0900dL, "container");
        Iterable iterable = (List) c1688pK.k(((TQ) this.i).h);
        if (iterable == null) {
            iterable = C1318jk.h;
        }
        ArrayList arrayList = new ArrayList(AbstractC0786bc.d0(iterable));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(((C2002u5) this.j).B((C0833cK) it.next(), abstractC0900dL.a));
        }
        return arrayList;
    }

    public void g0(int i, M5 m5) {
        Iterator it = (Iterator) this.i;
        while (true) {
            Map.Entry entry = (Map.Entry) this.j;
            if (entry == null || ((C1983tq) entry.getKey()).h >= i) {
                return;
            }
            C1983tq c1983tq = (C1983tq) ((Map.Entry) this.j).getKey();
            Object value = ((Map.Entry) this.j).getValue();
            C0377Ol c0377Ol = C0377Ol.c;
            I10 i10 = c1983tq.i;
            int i2 = c1983tq.h;
            if (c1983tq.j) {
                for (Object obj : (List) value) {
                    if (i10 == I10.l) {
                        m5.F(i2, 3);
                        ((E) obj).f(m5);
                        m5.F(i2, 4);
                    } else {
                        m5.F(i2, i10.i);
                        C0377Ol.k(m5, i10, obj);
                    }
                }
            } else if (i10 == I10.l) {
                m5.F(i2, 3);
                ((E) value).f(m5);
                m5.F(i2, 4);
            } else {
                m5.F(i2, i10.i);
                C0377Ol.k(m5, i10, value);
            }
            if (it.hasNext()) {
                this.j = (Map.Entry) it.next();
            } else {
                this.j = null;
            }
        }
    }

    @Override // o.InterfaceC1808r9
    public void h(View view, float[] fArr) {
        AbstractC1473m3.X(fArr);
        e0(view, fArr);
    }

    @Override // o.A1
    public boolean i(B1 b1, MenuItem menuItem) {
        return ((A1) this.i).i(b1, menuItem);
    }

    @Override // o.InterfaceC0686a4
    public Object j(AbstractC0900dL abstractC0900dL, CK ck, AbstractC1004ey abstractC1004ey) {
        AbstractC0048Bt.n(ck, "proto");
        ZJ zj = (ZJ) AbstractC1305jX.s(ck, ((TQ) this.i).i);
        if (zj == null) {
            return null;
        }
        return ((C2002u5) this.j).X(abstractC1004ey, zj, abstractC0900dL.a);
    }

    @Override // o.InterfaceC1146h4
    public List k(AbstractC0900dL abstractC0900dL, CK ck) {
        AbstractC0048Bt.n(ck, "proto");
        ((TQ) this.i).getClass();
        C1318jk c1318jk = C1318jk.h;
        ArrayList arrayList = new ArrayList(AbstractC0786bc.d0(c1318jk));
        Iterator<E> it = c1318jk.iterator();
        while (it.hasNext()) {
            arrayList.add(((C2002u5) this.j).B((C0833cK) it.next(), abstractC0900dL.a));
        }
        return arrayList;
    }

    @Override // o.InterfaceC1146h4
    public List l(AbstractC0900dL abstractC0900dL, E e, int i, int i2, UK uk) {
        AbstractC0048Bt.n(e, "callableProto");
        AbstractC1888sN.p(i, "kind");
        Iterable iterable = (List) uk.k(((TQ) this.i).j);
        if (iterable == null) {
            iterable = C1318jk.h;
        }
        ArrayList arrayList = new ArrayList(AbstractC0786bc.d0(iterable));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(((C2002u5) this.j).B((C0833cK) it.next(), abstractC0900dL.a));
        }
        return arrayList;
    }

    @Override // o.InterfaceC1146h4
    public List o(AbstractC0900dL abstractC0900dL, E e, int i) {
        TQ tq = (TQ) this.i;
        AbstractC0048Bt.n(e, "proto");
        AbstractC1888sN.p(i, "kind");
        if (e instanceof C2017uK) {
            tq.getClass();
        } else {
            if (!(e instanceof CK)) {
                throw new IllegalStateException(("Unknown message: " + e).toString());
            }
            int v = AbstractC1888sN.v(i);
            if (v != 1 && v != 2 && v != 3) {
                throw new IllegalStateException("Unsupported callable kind with property proto for receiver annotations: ".concat(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "PROPERTY_SETTER" : "PROPERTY_GETTER" : "PROPERTY" : "FUNCTION").toString());
            }
            tq.getClass();
        }
        C1318jk c1318jk = C1318jk.h;
        ArrayList arrayList = new ArrayList(AbstractC0786bc.d0(c1318jk));
        Iterator<E> it = c1318jk.iterator();
        while (it.hasNext()) {
            arrayList.add(((C2002u5) this.j).B((C0833cK) it.next(), abstractC0900dL.a));
        }
        return arrayList;
    }

    @Override // o.InterfaceC1113gb
    public C1047fb q(C1639ob c1639ob) {
        AbstractC0048Bt.n(c1639ob, "classId");
        C0853ce c0853ce = (C0853ce) this.i;
        C0659Zh c0659Zh = (C0659Zh) this.j;
        AbstractC0048Bt.n(c0659Zh.c().c, "<this>");
        OM s = AbstractC0946e20.s(c0853ce, c1639ob, C1527mv.g);
        if (s == null) {
            return null;
        }
        AbstractC1492mM.a(s.a).equals(c1639ob);
        return c0659Zh.f(s);
    }

    @Override // o.InterfaceC0686a4
    public Object r(AbstractC0900dL abstractC0900dL, CK ck, AbstractC1004ey abstractC1004ey) {
        AbstractC0048Bt.n(ck, "proto");
        return null;
    }

    @Override // o.InterfaceC1280j8
    public void s(ByteBuffer byteBuffer, C1511mf c1511mf) {
        C0950e6 c0950e6 = (C0950e6) this.j;
        try {
            ((Y1) this.i).b0(((CC) c0950e6.k).h(byteBuffer), new C2002u5(this, 9, c1511mf));
        } catch (RuntimeException e) {
            Log.e("BasicMessageChannel#".concat((String) c0950e6.j), "Failed to handle message", e);
            c1511mf.a(null);
        }
    }

    @Override // o.InterfaceC0311Lx
    public void t(KeyEvent keyEvent, C0260Jx c0260Jx) {
        int action = keyEvent.getAction();
        if (action != 0 && action != 1) {
            c0260Jx.a(false);
            return;
        }
        Character a = ((C0234Ix) this.j).a(keyEvent.getUnicodeChar());
        boolean z = action != 0;
        C0104Dx c0104Dx = (C0104Dx) this.i;
        C1932t2 c1932t2 = new C1932t2(4, c0260Jx);
        C0950e6 c0950e6 = c0104Dx.a;
        HashMap hashMap = new HashMap();
        hashMap.put("type", z ? "keyup" : "keydown");
        hashMap.put("keymap", "android");
        hashMap.put("flags", Integer.valueOf(keyEvent.getFlags()));
        hashMap.put("plainCodePoint", Integer.valueOf(keyEvent.getUnicodeChar(0)));
        hashMap.put("codePoint", Integer.valueOf(keyEvent.getUnicodeChar()));
        hashMap.put("keyCode", Integer.valueOf(keyEvent.getKeyCode()));
        hashMap.put("scanCode", Integer.valueOf(keyEvent.getScanCode()));
        hashMap.put("metaState", Integer.valueOf(keyEvent.getMetaState()));
        hashMap.put("character", a.toString());
        hashMap.put(Constants.ScionAnalytics.PARAM_SOURCE, Integer.valueOf(keyEvent.getSource()));
        hashMap.put("deviceId", Integer.valueOf(keyEvent.getDeviceId()));
        hashMap.put("repeatCount", Integer.valueOf(keyEvent.getRepeatCount()));
        c0950e6.M(hashMap, new C1932t2(5, c1932t2));
    }

    public String toString() {
        switch (this.h) {
            case 17:
                return ((AW) this.j).toString();
            default:
                return super.toString();
        }
    }

    @Override // o.InterfaceC0531Uj
    public boolean u(CharSequence charSequence, int i, int i2, HX hx) {
        if ((hx.c & 4) > 0) {
            return true;
        }
        if (((C1372kY) this.i) == null) {
            this.i = new C1372kY(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((C0218Ih) this.j).getClass();
        ((C1372kY) this.i).setSpan(new IX(hx), i, i2, 33);
        return true;
    }

    @Override // o.InterfaceC0821c8
    public void u0(Object obj) {
        ((C1511mf) this.i).a(((CC) ((C0950e6) ((C2002u5) this.j).j).k).d(obj));
    }

    @Override // o.A1
    public boolean v(B1 b1, Menu menu) {
        ViewGroup viewGroup = ((LayoutInflaterFactory2C1213i5) this.j).H;
        WeakHashMap weakHashMap = AZ.a;
        AbstractC1637oZ.c(viewGroup);
        return ((A1) this.i).v(b1, menu);
    }

    @Override // o.InterfaceC1146h4
    public ArrayList w(RK rk, InterfaceC0893dE interfaceC0893dE) {
        AbstractC0048Bt.n(rk, "proto");
        AbstractC0048Bt.n(interfaceC0893dE, "nameResolver");
        Iterable iterable = (List) rk.k(((TQ) this.i).l);
        if (iterable == null) {
            iterable = C1318jk.h;
        }
        ArrayList arrayList = new ArrayList(AbstractC0786bc.d0(iterable));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(((C2002u5) this.j).B((C0833cK) it.next(), interfaceC0893dE));
        }
        return arrayList;
    }

    @Override // o.InterfaceC1146h4
    public List x(AbstractC0900dL abstractC0900dL, CK ck) {
        AbstractC0048Bt.n(ck, "proto");
        ((TQ) this.i).getClass();
        C1318jk c1318jk = C1318jk.h;
        ArrayList arrayList = new ArrayList(AbstractC0786bc.d0(c1318jk));
        Iterator<E> it = c1318jk.iterator();
        while (it.hasNext()) {
            arrayList.add(((C2002u5) this.j).B((C0833cK) it.next(), abstractC0900dL.a));
        }
        return arrayList;
    }

    public boolean y(long j) {
        Object obj;
        List list = (List) ((C0208Hx) this.j).i;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = list.get(i);
            if (((JI) obj).a == j) {
                break;
            }
            i++;
        }
        JI ji = (JI) obj;
        if (ji != null) {
            return ji.h;
        }
        return false;
    }

    public void z(C0027Ay c0027Ay) {
        if (c0027Ay.v()) {
            ((AW) this.j).add(c0027Ay);
        } else {
            AbstractC0868ct.W("DepthSortedSet.add called on an unattached node");
            throw null;
        }
    }

    public /* synthetic */ C2002u5(int i, boolean z) {
        this.h = i;
    }

    public /* synthetic */ C2002u5(Object obj, int i, Object obj2) {
        this.h = i;
        this.j = obj;
        this.i = obj2;
    }

    public C2002u5(A20 a20, C1623oL c1623oL) {
        this.h = 4;
        this.j = "ClientTelemetry.API";
        this.i = a20;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2002u5(InterfaceC2114vp interfaceC2114vp) {
        this.h = 16;
        this.i = (AbstractC1596ny) interfaceC2114vp;
        this.j = new ConcurrentHashMap();
    }

    public C2002u5(AbstractC0588Wo abstractC0588Wo) {
        this.h = 25;
        this.i = abstractC0588Wo;
        this.j = new CopyOnWriteArrayList();
    }

    public C2002u5(C0104Dx c0104Dx) {
        this.h = 29;
        this.j = new C0234Ix();
        this.i = c0104Dx;
    }

    public C2002u5(InterfaceC0761bD interfaceC0761bD, C1334k c1334k, TQ tq) {
        this.h = 2;
        AbstractC0048Bt.n(interfaceC0761bD, "module");
        AbstractC0048Bt.n(tq, "protocol");
        this.i = tq;
        this.j = new C2002u5(interfaceC0761bD, c1334k);
    }

    public C2002u5(int i) {
        this.h = i;
        switch (i) {
            case 17:
                this.i = EB.C(EnumC1992tz.i, C2234xd.k);
                this.j = new AW(new C0685a3(9));
                break;
            case 18:
                this.i = new C2002u5(17);
                this.j = new C2002u5(17);
                break;
            default:
                this.i = new ReentrantLock();
                this.j = new LinkedHashMap();
                break;
        }
    }

    public C2002u5(InterfaceC0761bD interfaceC0761bD, C1334k c1334k) {
        this.h = 3;
        AbstractC0048Bt.n(interfaceC0761bD, "module");
        AbstractC0048Bt.n(c1334k, "notFoundClasses");
        this.i = interfaceC0761bD;
        this.j = c1334k;
    }

    public C2002u5(AbsSeekBar absSeekBar) {
        this.h = 0;
        this.i = absSeekBar;
    }

    public C2002u5(EditText editText, int i) {
        this.h = i;
        switch (i) {
            case 19:
                this.i = editText;
                C0661Zj c0661Zj = new C0661Zj(editText);
                this.j = c0661Zj;
                editText.addTextChangedListener(c0661Zj);
                if (C0375Oj.b == null) {
                    synchronized (C0375Oj.a) {
                        try {
                            if (C0375Oj.b == null) {
                                C0375Oj c0375Oj = new C0375Oj();
                                try {
                                    C0375Oj.c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, C0375Oj.class.getClassLoader());
                                } catch (Throwable unused) {
                                }
                                C0375Oj.b = c0375Oj;
                            }
                        } finally {
                        }
                    }
                }
                editText.setEditableFactory(C0375Oj.b);
                return;
            default:
                this.i = editText;
                this.j = new Y1(editText);
                return;
        }
    }

    public C2002u5(C1112ga c1112ga) {
        this.h = 15;
        this.j = c1112ga;
        new C1623oL(22, this);
    }

    public C2002u5(C1343k5 c1343k5, HashMap hashMap, HashMap hashMap2) {
        this.h = 1;
        this.i = c1343k5;
        this.j = hashMap;
    }

    public C2002u5(Animation animation) {
        this.h = 24;
        this.i = animation;
        this.j = null;
    }

    public C2002u5(Animator animator) {
        this.h = 24;
        this.i = null;
        AnimatorSet animatorSet = new AnimatorSet();
        this.j = animatorSet;
        animatorSet.play(animator);
    }

    public C2002u5(AbstractC1917sq abstractC1917sq) {
        this.h = 26;
        Iterator it = ((E6) abstractC1917sq.h.a.entrySet()).iterator();
        this.i = it;
        if (it.hasNext()) {
            this.j = (Map.Entry) it.next();
        }
    }

    public C2002u5(float[] fArr) {
        this.h = 12;
        this.i = fArr;
        this.j = new int[2];
    }
}
