package o;

import android.content.ClipData;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.view.ContentInfo;
import android.view.MenuItem;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import com.google.firebase.messaging.Constants;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public class Y1 implements InterfaceC2075vC, InterfaceC0694aC, S5, InterfaceC1220iC, InterfaceC1312je, InterfaceC1444le, InterfaceC1380kg, InterfaceC2374zl, InterfaceC1412l8, IR, InterfaceC1113gb, InterfaceC0355Np {
    public static volatile Y1 l;
    public final /* synthetic */ int h;
    public final Object i;
    public static final Y1 j = new Y1(0, new float[]{0.8951f, -0.7502f, 0.0389f, 0.2664f, 1.7135f, -0.0685f, -0.1614f, 0.0367f, 1.0296f});
    public static final Object k = new Object();
    public static final C1588nq m = new C1588nq(1);

    public /* synthetic */ Y1(int i, Object obj) {
        this.h = i;
        this.i = obj;
    }

    public static Y1 Z() {
        if (l == null) {
            synchronized (k) {
                try {
                    if (l == null) {
                        l = new Y1(1);
                    }
                } finally {
                }
            }
        }
        Y1 y1 = l;
        AbstractC1473m3.n(y1);
        return y1;
    }

    public static boolean a0(int i) {
        return (48 <= i && i <= 57) || i == 35 || i == 42;
    }

    @Override // o.InterfaceC1444le
    public int B() {
        int flags;
        flags = ((ContentInfo) this.i).getFlags();
        return flags;
    }

    @Override // o.InterfaceC0694aC
    public boolean C(MenuC0825cC menuC0825cC, MenuItem menuItem) {
        boolean onMenuItemSelected;
        InterfaceC2326z1 interfaceC2326z1 = ((ActionMenuView) this.i).H;
        if (interfaceC2326z1 != null) {
            Toolbar toolbar = ((WV) interfaceC2326z1).h;
            if (toolbar.N.a()) {
                onMenuItemSelected = true;
            } else {
                InterfaceC0714aW interfaceC0714aW = toolbar.P;
                onMenuItemSelected = interfaceC0714aW != null ? ((C0845cW) interfaceC0714aW).h.b.onMenuItemSelected(0, menuItem) : false;
            }
            if (onMenuItemSelected) {
                return true;
            }
        }
        return false;
    }

    @Override // o.InterfaceC1444le
    public ContentInfo D() {
        return (ContentInfo) this.i;
    }

    @Override // o.InterfaceC0355Np
    public InterfaceC0355Np E(InterfaceC1118gg interfaceC1118gg) {
        AbstractC0048Bt.n(interfaceC1118gg, "owner");
        return this;
    }

    @Override // o.InterfaceC1380kg
    public Object F(C1316ji c1316ji, Object obj) {
        switch (this.h) {
            case 15:
                return null;
            default:
                StringBuilder sb = (StringBuilder) obj;
                C2304yh c2304yh = (C2304yh) this.i;
                c2304yh.getClass();
                c2304yh.y(sb, c1316ji, null);
                C0244Jh c0244Jh = c1316ji.l;
                AbstractC0048Bt.m(c0244Jh, "typeAlias.visibility");
                c2304yh.h0(c0244Jh, sb);
                c2304yh.K(c1316ji, sb);
                sb.append(c2304yh.I("typealias"));
                sb.append(" ");
                c2304yh.P(c1316ji, sb, true);
                c2304yh.d0(sb, c1316ji.p(), false);
                c2304yh.A(c1316ji, sb);
                sb.append(" = ");
                sb.append(c2304yh.Y(c1316ji.J0()));
                return C0782bY.a;
        }
    }

    @Override // o.InterfaceC1380kg
    public Object G(C1465lz c1465lz, Object obj) {
        switch (this.h) {
            case 15:
                return null;
            default:
                StringBuilder sb = (StringBuilder) obj;
                C2304yh c2304yh = (C2304yh) this.i;
                c2304yh.getClass();
                c2304yh.T(c1465lz.k, "package", sb);
                if (c2304yh.a.n()) {
                    sb.append(" in context of ");
                    c2304yh.P(c1465lz.j, sb, false);
                }
                return C0782bY.a;
        }
    }

    @Override // o.InterfaceC1312je
    public void I(Uri uri) {
        ((ContentInfo.Builder) this.i).setLinkUri(uri);
    }

    @Override // o.InterfaceC1380kg
    public Object J(AbstractC1027fH abstractC1027fH, Object obj) {
        switch (this.h) {
            case 15:
                return null;
            default:
                StringBuilder sb = (StringBuilder) obj;
                C2304yh c2304yh = (C2304yh) this.i;
                c2304yh.getClass();
                c2304yh.T(abstractC1027fH.l, "package-fragment", sb);
                if (c2304yh.a.n()) {
                    sb.append(" in ");
                    c2304yh.P(abstractC1027fH.n(), sb, false);
                }
                return C0782bY.a;
        }
    }

    @Override // o.InterfaceC0355Np
    public InterfaceC0355Np K(int i) {
        AbstractC1888sN.p(i, "modality");
        return this;
    }

    @Override // o.InterfaceC1380kg
    public Object L(RY ry, Object obj) {
        switch (this.h) {
            case 15:
                return null;
            default:
                ((C2304yh) this.i).f0(ry, true, (StringBuilder) obj, true);
                return C0782bY.a;
        }
    }

    @Override // o.InterfaceC0355Np
    public InterfaceC0355Np P(AbstractC1004ey abstractC1004ey) {
        AbstractC0048Bt.n(abstractC1004ey, "type");
        return this;
    }

    @Override // o.InterfaceC0694aC
    public void Q(MenuC0825cC menuC0825cC) {
        InterfaceC0694aC interfaceC0694aC = ((ActionMenuView) this.i).C;
        if (interfaceC0694aC != null) {
            interfaceC0694aC.Q(menuC0825cC);
        }
    }

    @Override // o.InterfaceC1412l8
    public void R(String str, InterfaceC1280j8 interfaceC1280j8) {
        ((C1577nf) this.i).b(str, interfaceC1280j8);
    }

    @Override // o.InterfaceC1380kg
    public Object S(InterfaceC0381Op interfaceC0381Op, Object obj) {
        switch (this.h) {
            case 15:
                return new C1528mw((AbstractC1330jw) this.i, interfaceC0381Op);
            default:
                f0(interfaceC0381Op, (StringBuilder) obj);
                return C0782bY.a;
        }
    }

    @Override // o.InterfaceC1312je
    public void U(int i) {
        ((ContentInfo.Builder) this.i).setFlags(i);
    }

    public Q0 W(int i) {
        return null;
    }

    public Q0 X() {
        return null;
    }

    public AT Y() {
        return (AT) ((ET) this.i).getValue();
    }

    @Override // o.InterfaceC1380kg
    public Object a(AbstractC1533n0 abstractC1533n0, Object obj) {
        switch (this.h) {
            case 15:
                return null;
            default:
                ((C2304yh) this.i).b0(abstractC1533n0, (StringBuilder) obj, true);
                return C0782bY.a;
        }
    }

    @Override // o.InterfaceC2075vC
    public void b(MenuC0825cC menuC0825cC, boolean z) {
        if (menuC0825cC instanceof SubMenuC0909dU) {
            ((SubMenuC0909dU) menuC0825cC).z.k().c(false);
        }
        InterfaceC2075vC interfaceC2075vC = ((C2128w1) this.i).l;
        if (interfaceC2075vC != null) {
            interfaceC2075vC.b(menuC0825cC, z);
        }
    }

    public void b0(Object obj, C2002u5 c2002u5) {
        HashMap hashMap;
        HashMap hashMap2;
        C0950e6 c0950e6 = (C0950e6) this.i;
        if (((io.flutter.view.a) c0950e6.k) == null) {
            c2002u5.u0(null);
            return;
        }
        hashMap = (HashMap) obj;
        String str = (String) hashMap.get("type");
        hashMap2 = (HashMap) hashMap.get(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        str.getClass();
        switch (str) {
            case "tooltip":
                String str2 = (String) hashMap2.get("message");
                if (str2 != null) {
                    io.flutter.view.b bVar = ((io.flutter.view.a) c0950e6.k).a;
                    if (Build.VERSION.SDK_INT < 28) {
                        AccessibilityEvent d = bVar.d(0, 32);
                        d.getText().add(str2);
                        bVar.h(d);
                        break;
                    }
                }
                break;
            case "announce":
                String str3 = (String) hashMap2.get("message");
                if (str3 != null) {
                    io.flutter.view.a aVar = (io.flutter.view.a) c0950e6.k;
                    if (Build.VERSION.SDK_INT >= 36) {
                        aVar.getClass();
                        Log.w("AccessibilityBridge", "Using AnnounceSemanticsEvent for accessibility is deprecated on Android. Migrate to using semantic properties for a more robust and accessible user experience.\nFlutter: If you are unsure why you are seeing this bug, it might be because you are using a widget that calls this method. See https://github.com/flutter/flutter/issues/165510 for more details.\nAndroid documentation: https://developer.android.com/reference/android/view/View#announceForAccessibility(java.lang.CharSequence)");
                    }
                    aVar.a.a.announceForAccessibility(str3);
                    break;
                }
                break;
            case "tap":
                Integer num = (Integer) hashMap.get("nodeId");
                if (num != null) {
                    io.flutter.view.a aVar2 = (io.flutter.view.a) c0950e6.k;
                    aVar2.a.g(num.intValue(), 1);
                    break;
                }
                break;
            case "focus":
                Integer num2 = (Integer) hashMap.get("nodeId");
                if (num2 != null) {
                    io.flutter.view.a aVar3 = (io.flutter.view.a) c0950e6.k;
                    aVar3.a.g(num2.intValue(), 8);
                    break;
                }
                break;
            case "longPress":
                Integer num3 = (Integer) hashMap.get("nodeId");
                if (num3 != null) {
                    io.flutter.view.a aVar4 = (io.flutter.view.a) c0950e6.k;
                    aVar4.a.g(num3.intValue(), 2);
                    break;
                }
                break;
        }
        c2002u5.u0(null);
    }

    @Override // o.InterfaceC0355Np
    public InterfaceC0381Op build() {
        return (C0065Ck) this.i;
    }

    @Override // o.InterfaceC1220iC
    public void c(MenuC0825cC menuC0825cC, MenuItem menuItem) {
        ((ViewOnKeyListenerC1901sa) this.i).m.removeCallbacksAndMessages(menuC0825cC);
    }

    public boolean c0(int i, int i2, Bundle bundle) {
        return false;
    }

    @Override // o.InterfaceC1444le
    public int d() {
        int source;
        source = ((ContentInfo) this.i).getSource();
        return source;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        if (r6.a > r2.a) goto L13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Type inference failed for: r3v4, types: [o.Rn] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void d0(AT at) {
        Object value;
        AT at2;
        AbstractC0048Bt.n(at, "newState");
        ET et = (ET) this.i;
        do {
            value = et.getValue();
            at2 = (AT) value;
            if (!(at2 instanceof C2348zL ? true : AbstractC0048Bt.h(at2, VX.b))) {
                if (!(at2 instanceof C1643of)) {
                    if (!(at2 instanceof C0796bm)) {
                        throw new C0057Cc();
                    }
                }
                ?? r3 = AbstractC1052fg.e;
                if (value == null) {
                    value = r3;
                }
                if (at2 == null) {
                    at2 = r3;
                }
            }
            at2 = at;
            ?? r32 = AbstractC1052fg.e;
            if (value == null) {
            }
            if (at2 == null) {
            }
        } while (!et.f(value, at2));
    }

    public void e0(Context context, ServiceConnection serviceConnection) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.i;
        if ((serviceConnection instanceof i30) || !concurrentHashMap.containsKey(serviceConnection)) {
            try {
                context.unbindService(serviceConnection);
            } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
            }
        } else {
            try {
                try {
                    context.unbindService((ServiceConnection) concurrentHashMap.get(serviceConnection));
                } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused2) {
                }
            } finally {
                concurrentHashMap.remove(serviceConnection);
            }
        }
    }

    @Override // o.InterfaceC1444le
    public ClipData f() {
        ClipData clip;
        clip = ((ContentInfo) this.i).getClip();
        return clip;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b1, code lost:
    
        if (((java.lang.Boolean) r2.N.a(r2, o.C0062Ch.W[38])).booleanValue() != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00f5, code lost:
    
        if (((java.lang.Boolean) r2.N.a(r2, o.C0062Ch.W[38])).booleanValue() != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01a7, code lost:
    
        if (o.AbstractC0545Ux.D(r2, o.AbstractC1433lT.d) == false) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void f0(InterfaceC0381Op interfaceC0381Op, StringBuilder sb) {
        boolean z;
        C2304yh c2304yh = (C2304yh) this.i;
        C0062Ch c0062Ch = c2304yh.a;
        C0062Ch c0062Ch2 = c2304yh.a;
        if (!c2304yh.r()) {
            C0036Bh c0036Bh = c0062Ch2.g;
            InterfaceC0937dx[] interfaceC0937dxArr = C0062Ch.W;
            if (!((Boolean) c0036Bh.a(c0062Ch2, interfaceC0937dxArr[5])).booleanValue()) {
                c2304yh.y(sb, interfaceC0381Op, null);
                List T = interfaceC0381Op.T();
                AbstractC0048Bt.m(T, "function.contextReceiverParameters");
                c2304yh.C(sb, T);
                C0244Jh visibility = interfaceC0381Op.getVisibility();
                AbstractC0048Bt.m(visibility, "function.visibility");
                c2304yh.h0(visibility, sb);
                c2304yh.M(sb, interfaceC0381Op);
                if (((Boolean) c0062Ch2.R.a(c0062Ch2, interfaceC0937dxArr[42])).booleanValue()) {
                    c2304yh.K(interfaceC0381Op, sb);
                }
                c2304yh.S(sb, interfaceC0381Op);
                if (((Boolean) c0062Ch2.R.a(c0062Ch2, interfaceC0937dxArr[42])).booleanValue()) {
                    boolean z2 = false;
                    if (interfaceC0381Op.f0()) {
                        Collection o2 = interfaceC0381Op.o();
                        AbstractC0048Bt.m(o2, "functionDescriptor.overriddenDescriptors");
                        Collection collection = o2;
                        if (!collection.isEmpty()) {
                            Iterator it = collection.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                } else if (((InterfaceC0381Op) it.next()).f0()) {
                                }
                            }
                        }
                        z = true;
                        if (interfaceC0381Op.u0()) {
                            Collection o3 = interfaceC0381Op.o();
                            AbstractC0048Bt.m(o3, "functionDescriptor.overriddenDescriptors");
                            Collection collection2 = o3;
                            if (!collection2.isEmpty()) {
                                Iterator it2 = collection2.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        break;
                                    } else if (((InterfaceC0381Op) it2.next()).u0()) {
                                    }
                                }
                            }
                            z2 = true;
                        }
                        c2304yh.N(sb, interfaceC0381Op.e0(), "tailrec");
                        c2304yh.N(sb, interfaceC0381Op.isSuspend(), "suspend");
                        c2304yh.N(sb, interfaceC0381Op.m(), "inline");
                        c2304yh.N(sb, z2, "infix");
                        c2304yh.N(sb, z, "operator");
                    }
                    z = false;
                    if (interfaceC0381Op.u0()) {
                    }
                    c2304yh.N(sb, interfaceC0381Op.e0(), "tailrec");
                    c2304yh.N(sb, interfaceC0381Op.isSuspend(), "suspend");
                    c2304yh.N(sb, interfaceC0381Op.m(), "inline");
                    c2304yh.N(sb, z2, "infix");
                    c2304yh.N(sb, z, "operator");
                } else {
                    c2304yh.N(sb, interfaceC0381Op.isSuspend(), "suspend");
                }
                c2304yh.J(sb, interfaceC0381Op);
                if (c2304yh.u()) {
                    if (interfaceC0381Op.b0()) {
                        sb.append("/*isHiddenToOvercomeSignatureClash*/ ");
                    }
                    if (interfaceC0381Op.l0()) {
                        sb.append("/*isHiddenForResolutionEverywhereBesideSupercalls*/ ");
                    }
                }
            }
            sb.append(c2304yh.I("fun"));
            sb.append(" ");
            List typeParameters = interfaceC0381Op.getTypeParameters();
            AbstractC0048Bt.m(typeParameters, "function.typeParameters");
            c2304yh.d0(sb, typeParameters, true);
            c2304yh.V(sb, interfaceC0381Op);
        }
        c2304yh.P(interfaceC0381Op, sb, true);
        List t0 = interfaceC0381Op.t0();
        AbstractC0048Bt.m(t0, "function.valueParameters");
        c2304yh.g0(sb, t0, interfaceC0381Op.Q());
        c2304yh.W(sb, interfaceC0381Op);
        AbstractC1004ey returnType = interfaceC0381Op.getReturnType();
        C0036Bh c0036Bh2 = c0062Ch.l;
        InterfaceC0937dx[] interfaceC0937dxArr2 = C0062Ch.W;
        if (!((Boolean) c0036Bh2.a(c0062Ch, interfaceC0937dxArr2[10])).booleanValue()) {
            if (!((Boolean) c0062Ch.k.a(c0062Ch, interfaceC0937dxArr2[9])).booleanValue() && returnType != null) {
                C0827cE c0827cE = AbstractC0545Ux.e;
            }
            sb.append(": ");
            sb.append(returnType == null ? "[NULL]" : c2304yh.Y(returnType));
        }
        List typeParameters2 = interfaceC0381Op.getTypeParameters();
        AbstractC0048Bt.m(typeParameters2, "function.typeParameters");
        c2304yh.i0(sb, typeParameters2);
    }

    @Override // o.InterfaceC1412l8
    public void g(String str, ByteBuffer byteBuffer, InterfaceC1346k8 interfaceC1346k8) {
        ((C1577nf) this.i).g(str, byteBuffer, interfaceC1346k8);
    }

    public void g0(NJ nj, StringBuilder sb, String str) {
        C2304yh c2304yh = (C2304yh) this.i;
        C0062Ch c0062Ch = c2304yh.a;
        int ordinal = ((OJ) c0062Ch.G.a(c0062Ch, C0062Ch.W[31])).ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                return;
            }
            f0(nj, sb);
        } else {
            c2304yh.K(nj, sb);
            sb.append(str.concat(" for "));
            PJ H0 = nj.H0();
            AbstractC0048Bt.m(H0, "descriptor.correspondingProperty");
            C2304yh.n(c2304yh, H0, sb);
        }
    }

    @Override // o.InterfaceC1557nL
    public Object get() {
        return new C0604Xe((Context) ((M1) this.i).h, new CU(), new GU(4));
    }

    @Override // o.InterfaceC1380kg
    public Object h(YC yc, Object obj) {
        C0981eb i0;
        String str;
        switch (this.h) {
            case 15:
                return null;
            default:
                StringBuilder sb = (StringBuilder) obj;
                C2304yh c2304yh = (C2304yh) this.i;
                C0062Ch c0062Ch = c2304yh.a;
                boolean z = yc.B() == 4;
                if (!c2304yh.r()) {
                    c2304yh.y(sb, yc, null);
                    List s0 = yc.s0();
                    AbstractC0048Bt.m(s0, "klass.contextReceivers");
                    c2304yh.C(sb, s0);
                    if (!z) {
                        C0244Jh visibility = yc.getVisibility();
                        AbstractC0048Bt.m(visibility, "klass.visibility");
                        c2304yh.h0(visibility, sb);
                    }
                    if ((yc.B() != 2 || yc.g() != 4) && (!AbstractC1888sN.a(yc.B()) || yc.g() != 1)) {
                        int g = yc.g();
                        AbstractC1888sN.t(g, "klass.modality");
                        c2304yh.L(g, sb, C2304yh.v(yc));
                    }
                    c2304yh.K(yc, sb);
                    c2304yh.N(sb, c2304yh.q().contains(EnumC2370zh.f255o) && yc.k(), "inner");
                    c2304yh.N(sb, c2304yh.q().contains(EnumC2370zh.q) && yc.y0(), Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                    c2304yh.N(sb, c2304yh.q().contains(EnumC2370zh.r) && yc.m(), "inline");
                    c2304yh.N(sb, c2304yh.q().contains(EnumC2370zh.x) && yc.j(), "value");
                    c2304yh.N(sb, c2304yh.q().contains(EnumC2370zh.w) && yc.K(), "fun");
                    if (yc.D()) {
                        str = "companion object";
                    } else {
                        int v = AbstractC1888sN.v(yc.B());
                        if (v == 0) {
                            str = "class";
                        } else if (v == 1) {
                            str = "interface";
                        } else if (v == 2) {
                            str = "enum class";
                        } else if (v == 3) {
                            str = "enum entry";
                        } else if (v == 4) {
                            str = "annotation class";
                        } else {
                            if (v != 5) {
                                throw new C0057Cc();
                            }
                            str = "object";
                        }
                    }
                    sb.append(c2304yh.I(str));
                }
                if (AbstractC0114Eh.l(yc)) {
                    if (((Boolean) c0062Ch.F.a(c0062Ch, C0062Ch.W[30])).booleanValue()) {
                        if (c2304yh.r()) {
                            sb.append("companion object");
                        }
                        C2304yh.X(sb);
                        InterfaceC1118gg n = yc.n();
                        if (n != null) {
                            sb.append("of ");
                            C0827cE name = n.getName();
                            AbstractC0048Bt.m(name, "containingDeclaration.name");
                            sb.append(c2304yh.O(name, false));
                        }
                    }
                    if (c2304yh.u() || !AbstractC0048Bt.h(yc.getName(), YS.b)) {
                        if (!c2304yh.r()) {
                            C2304yh.X(sb);
                        }
                        C0827cE name2 = yc.getName();
                        AbstractC0048Bt.m(name2, "descriptor.name");
                        sb.append(c2304yh.O(name2, true));
                    }
                } else {
                    if (!c2304yh.r()) {
                        C2304yh.X(sb);
                    }
                    c2304yh.P(yc, sb, true);
                }
                if (!z) {
                    List p = yc.p();
                    AbstractC0048Bt.m(p, "klass.declaredTypeParameters");
                    c2304yh.d0(sb, p, false);
                    c2304yh.A(yc, sb);
                    if (!AbstractC1888sN.a(yc.B()) && ((Boolean) c0062Ch.i.a(c0062Ch, C0062Ch.W[7])).booleanValue() && (i0 = yc.i0()) != null) {
                        sb.append(" ");
                        c2304yh.y(sb, i0, null);
                        C0981eb c0981eb = i0;
                        C0244Jh visibility2 = c0981eb.getVisibility();
                        AbstractC0048Bt.m(visibility2, "primaryConstructor.visibility");
                        c2304yh.h0(visibility2, sb);
                        sb.append(c2304yh.I("constructor"));
                        List t0 = c0981eb.t0();
                        AbstractC0048Bt.m(t0, "primaryConstructor.valueParameters");
                        c2304yh.g0(sb, t0, i0.Q());
                    }
                    if (!((Boolean) c0062Ch.w.a(c0062Ch, C0062Ch.W[21])).booleanValue() && !AbstractC0545Ux.E(yc.i())) {
                        Collection d = yc.z().d();
                        AbstractC0048Bt.m(d, "klass.typeConstructor.supertypes");
                        if (!d.isEmpty() && (d.size() != 1 || !AbstractC0545Ux.x((AbstractC1004ey) d.iterator().next()))) {
                            C2304yh.X(sb);
                            sb.append(": ");
                            AbstractC0720ac.s0(d, sb, ", ", null, null, new C2238xh(c2304yh, 2), 60);
                        }
                    }
                    c2304yh.i0(sb, p);
                }
                return C0782bY.a;
        }
    }

    public void h0(int i, C1151h9 c1151h9) {
        ((C0627Yb) this.i).h0(i, c1151h9);
    }

    @Override // o.InterfaceC1380kg
    public Object i(Object obj, C0826cD c0826cD) {
        switch (this.h) {
            case 15:
                return null;
            default:
                ((C2304yh) this.i).P(c0826cD, (StringBuilder) obj, true);
                return C0782bY.a;
        }
    }

    public void i0(int i, Object obj, InterfaceC0839cQ interfaceC0839cQ) {
        C0627Yb c0627Yb = (C0627Yb) this.i;
        c0627Yb.s0(i, 3);
        interfaceC0839cQ.c((F) obj, c0627Yb.r);
        c0627Yb.s0(i, 4);
    }

    @Override // o.InterfaceC1220iC
    public void j(MenuC0825cC menuC0825cC, C1284jC c1284jC) {
        ViewOnKeyListenerC1901sa viewOnKeyListenerC1901sa = (ViewOnKeyListenerC1901sa) this.i;
        Handler handler = viewOnKeyListenerC1901sa.m;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = viewOnKeyListenerC1901sa.f221o;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (menuC0825cC == ((C1835ra) arrayList.get(i)).b) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        int i2 = i + 1;
        handler.postAtTime(new RunnableC1770qa(this, i2 < arrayList.size() ? (C1835ra) arrayList.get(i2) : null, c1284jC, menuC0825cC), menuC0825cC, SystemClock.uptimeMillis() + 200);
    }

    public boolean j0(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i, Executor executor) {
        boolean bindService;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.i;
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((Z10.a(context).a.getPackageManager().getApplicationInfo(packageName, 0).flags & 2097152) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (serviceConnection instanceof i30) {
            if (executor == null) {
                executor = null;
            }
            if (Build.VERSION.SDK_INT < 29 || executor == null) {
                return context.bindService(intent, serviceConnection, i);
            }
            bindService = context.bindService(intent, i, executor, serviceConnection);
            return bindService;
        }
        ServiceConnection serviceConnection2 = (ServiceConnection) concurrentHashMap.putIfAbsent(serviceConnection, serviceConnection);
        if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
            Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction()));
        }
        if (executor == null) {
            executor = null;
        }
        try {
            boolean bindService2 = (Build.VERSION.SDK_INT < 29 || executor == null) ? context.bindService(intent, serviceConnection, i) : context.bindService(intent, i, executor, serviceConnection);
            if (bindService2) {
                return bindService2;
            }
            return false;
        } finally {
            concurrentHashMap.remove(serviceConnection, serviceConnection);
        }
    }

    @Override // o.InterfaceC1380kg
    public Object l(WJ wj, Object obj) {
        switch (this.h) {
            case 15:
                return S(wj, obj);
            default:
                g0(wj, (StringBuilder) obj, "setter");
                return C0782bY.a;
        }
    }

    @Override // o.IR
    public void lock() {
        ((ReentrantLock) this.i).lock();
    }

    @Override // o.InterfaceC1380kg
    public Object n(C0261Jy c0261Jy, Object obj) {
        switch (this.h) {
            case 15:
                return null;
            default:
                ((StringBuilder) obj).append(c0261Jy.getName());
                return C0782bY.a;
        }
    }

    @Override // o.InterfaceC0355Np
    public InterfaceC0355Np o(InterfaceC1738q4 interfaceC1738q4) {
        AbstractC0048Bt.n(interfaceC1738q4, "additionalAnnotations");
        return this;
    }

    @Override // o.InterfaceC0355Np
    public InterfaceC0355Np p(C0827cE c0827cE) {
        AbstractC0048Bt.n(c0827cE, "name");
        return this;
    }

    @Override // o.InterfaceC1113gb
    public C1047fb q(C1639ob c1639ob) {
        C1047fb q;
        AbstractC0048Bt.n(c1639ob, "classId");
        InterfaceC1159hH interfaceC1159hH = (InterfaceC1159hH) this.i;
        C2245xo g = c1639ob.g();
        AbstractC0048Bt.m(g, "classId.packageFqName");
        Iterator it = EB.J(interfaceC1159hH, g).iterator();
        while (it.hasNext()) {
            InterfaceC0961eH interfaceC0961eH = (InterfaceC0961eH) it.next();
            if ((interfaceC0961eH instanceof W8) && (q = ((W8) interfaceC0961eH).p.q(c1639ob)) != null) {
                return q;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0133  */
    @Override // o.InterfaceC1380kg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object r(C0981eb c0981eb, Object obj) {
        boolean z;
        boolean z2;
        C0981eb i0;
        ArrayList arrayList;
        switch (this.h) {
            case 15:
                return S(c0981eb, obj);
            default:
                boolean z3 = c0981eb.K;
                StringBuilder sb = (StringBuilder) obj;
                C2304yh c2304yh = (C2304yh) this.i;
                c2304yh.getClass();
                c2304yh.y(sb, c0981eb, null);
                C0062Ch c0062Ch = c2304yh.a;
                C0036Bh c0036Bh = c0062Ch.f23o;
                InterfaceC0937dx[] interfaceC0937dxArr = C0062Ch.W;
                if (((Boolean) c0036Bh.a(c0062Ch, interfaceC0937dxArr[13])).booleanValue() || c0981eb.I().g() != 2) {
                    C0244Jh visibility = c0981eb.getVisibility();
                    AbstractC0048Bt.m(visibility, "constructor.visibility");
                    if (c2304yh.h0(visibility, sb)) {
                        z = true;
                        c2304yh.J(sb, c0981eb);
                        z2 = (((Boolean) c0062Ch.O.a(c0062Ch, interfaceC0937dxArr[39])).booleanValue() && z3 && !z) ? false : true;
                        if (z2) {
                            sb.append(c2304yh.I("constructor"));
                        }
                        InterfaceC1245ib n = c0981eb.n();
                        AbstractC0048Bt.m(n, "constructor.containingDeclaration");
                        if (((Boolean) c0062Ch.z.a(c0062Ch, interfaceC0937dxArr[24])).booleanValue()) {
                            if (z2) {
                                sb.append(" ");
                            }
                            c2304yh.P(n, sb, true);
                            c2304yh.d0(sb, c0981eb.getTypeParameters(), false);
                        }
                        List t0 = c0981eb.t0();
                        AbstractC0048Bt.m(t0, "constructor.valueParameters");
                        c2304yh.g0(sb, t0, c0981eb.Q());
                        if (((Boolean) c0062Ch.q.a(c0062Ch, interfaceC0937dxArr[15])).booleanValue() && !z3 && (i0 = n.i0()) != null) {
                            List t02 = i0.t0();
                            AbstractC0048Bt.m(t02, "primaryConstructor.valueParameters");
                            arrayList = new ArrayList();
                            for (Object obj2 : t02) {
                                RY ry = (RY) obj2;
                                if (!ry.I0() && ry.q == null) {
                                    arrayList.add(obj2);
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                sb.append(" : ");
                                sb.append(c2304yh.I("this"));
                                sb.append(AbstractC0720ac.t0(arrayList, ", ", "(", ")", I2.y, 24));
                            }
                        }
                        if (((Boolean) c0062Ch.z.a(c0062Ch, C0062Ch.W[24])).booleanValue()) {
                            c2304yh.i0(sb, c0981eb.getTypeParameters());
                        }
                        return C0782bY.a;
                    }
                }
                z = false;
                c2304yh.J(sb, c0981eb);
                if (((Boolean) c0062Ch.O.a(c0062Ch, interfaceC0937dxArr[39])).booleanValue()) {
                }
                if (z2) {
                }
                InterfaceC1245ib n2 = c0981eb.n();
                AbstractC0048Bt.m(n2, "constructor.containingDeclaration");
                if (((Boolean) c0062Ch.z.a(c0062Ch, interfaceC0937dxArr[24])).booleanValue()) {
                }
                List t03 = c0981eb.t0();
                AbstractC0048Bt.m(t03, "constructor.valueParameters");
                c2304yh.g0(sb, t03, c0981eb.Q());
                if (((Boolean) c0062Ch.q.a(c0062Ch, interfaceC0937dxArr[15])).booleanValue()) {
                    List t022 = i0.t0();
                    AbstractC0048Bt.m(t022, "primaryConstructor.valueParameters");
                    arrayList = new ArrayList();
                    while (r2.hasNext()) {
                    }
                    if (!arrayList.isEmpty()) {
                    }
                }
                if (((Boolean) c0062Ch.z.a(c0062Ch, C0062Ch.W[24])).booleanValue()) {
                }
                return C0782bY.a;
        }
    }

    @Override // o.InterfaceC1312je
    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.i).setExtras(bundle);
    }

    public String toString() {
        switch (this.h) {
            case 0:
                return "Bradford";
            case 14:
                return "ContentInfoCompat{" + ((ContentInfo) this.i) + "}";
            default:
                return super.toString();
        }
    }

    @Override // o.InterfaceC1380kg
    public Object u(RJ rj, Object obj) {
        switch (this.h) {
            case 15:
                AbstractC1330jw abstractC1330jw = (AbstractC1330jw) this.i;
                AbstractC0048Bt.n(rj, "descriptor");
                int i = (rj.A != null ? 1 : 0) + (rj.B != null ? 1 : 0);
                if (rj.m) {
                    if (i == 0) {
                        return new C2121vw(abstractC1330jw, rj);
                    }
                    if (i == 1) {
                        return new C2385zw(abstractC1330jw, rj);
                    }
                    if (i == 2) {
                        return new C0051Bw(abstractC1330jw, rj);
                    }
                } else {
                    if (i == 0) {
                        return new C0544Uw(abstractC1330jw, rj);
                    }
                    if (i == 1) {
                        return new C0674Zw(abstractC1330jw, rj);
                    }
                    if (i == 2) {
                        return new C0872cx(abstractC1330jw, rj);
                    }
                }
                throw new C0526Ue("Unsupported property: " + rj);
            default:
                AbstractC0048Bt.n(rj, "descriptor");
                C2304yh.n((C2304yh) this.i, rj, (StringBuilder) obj);
                return C0782bY.a;
        }
    }

    @Override // o.IR
    public void unlock() {
        ((ReentrantLock) this.i).unlock();
    }

    @Override // o.InterfaceC0355Np
    public InterfaceC0355Np w(int i) {
        AbstractC1888sN.p(i, "kind");
        return this;
    }

    @Override // o.InterfaceC0355Np
    public InterfaceC0355Np x(C0244Jh c0244Jh) {
        AbstractC0048Bt.n(c0244Jh, "visibility");
        return this;
    }

    @Override // o.InterfaceC1380kg
    public Object y(SJ sj, Object obj) {
        switch (this.h) {
            case 15:
                return S(sj, obj);
            default:
                g0(sj, (StringBuilder) obj, "getter");
                return C0782bY.a;
        }
    }

    @Override // o.InterfaceC2075vC
    public boolean z(MenuC0825cC menuC0825cC) {
        C2128w1 c2128w1 = (C2128w1) this.i;
        if (menuC0825cC == c2128w1.j) {
            return false;
        }
        ((SubMenuC0909dU) menuC0825cC).A.getClass();
        c2128w1.getClass();
        InterfaceC2075vC interfaceC2075vC = c2128w1.l;
        if (interfaceC2075vC != null) {
            return interfaceC2075vC.z(menuC0825cC);
        }
        return false;
    }

    public Y1(int i) {
        DC dc;
        this.h = i;
        switch (i) {
            case 2:
                try {
                    dc = (DC) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
                } catch (Exception unused) {
                    dc = m;
                }
                DC[] dcArr = {C1588nq.b, dc};
                C1876sB c1876sB = new C1876sB();
                c1876sB.a = dcArr;
                Charset charset = AbstractC2052ut.a;
                this.i = c1876sB;
                break;
            case 4:
                if (Build.VERSION.SDK_INT < 26) {
                    this.i = new R0(this);
                    break;
                } else {
                    this.i = new S0(this);
                    break;
                }
            case 9:
                this.i = new AtomicInteger(0);
                break;
            case 12:
                AbstractC0048Bt.n(TimeUnit.MINUTES, "timeUnit");
                this.i = new QL(RU.i);
                break;
            case 17:
                this.i = new HashSet();
                break;
            case 19:
                this.i = AbstractC1305jX.d(VX.b);
                break;
            default:
                this.i = new ConcurrentHashMap();
                break;
        }
    }

    @Override // o.InterfaceC1312je
    /* renamed from: build, reason: collision with other method in class */
    public C1510me mo8build() {
        ContentInfo build;
        build = ((ContentInfo.Builder) this.i).build();
        return new C1510me(new Y1(build));
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002c, code lost:
    
        if (r7 == 1) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0041 A[LOOP:1: B:14:0x003f->B:15:0x0041, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Y1(int[] iArr, float[] fArr, float[][] fArr2) {
        int i;
        int length;
        int i2;
        this.h = 8;
        int length2 = fArr.length - 1;
        C2333z6[][] c2333z6Arr = new C2333z6[length2][];
        int i3 = 1;
        int i4 = 1;
        int i5 = 0;
        while (i5 < length2) {
            int i6 = iArr[i5];
            int i7 = 3;
            if (i6 != 0) {
                if (i6 != 1) {
                    if (i6 != 2) {
                        if (i6 != 3) {
                            i7 = 4;
                            if (i6 != 4) {
                                i7 = 5;
                                if (i6 != 5) {
                                    i = i4;
                                    float[] fArr3 = fArr2[i5];
                                    length = (fArr3.length % 2) + (fArr3.length / 2);
                                    C2333z6[] c2333z6Arr2 = new C2333z6[length];
                                    for (i2 = 0; i2 < length; i2++) {
                                        int i8 = i2 * 2;
                                        float f = fArr[i5];
                                        int i9 = i5 + 1;
                                        float f2 = fArr[i9];
                                        float[] fArr4 = fArr2[i5];
                                        float f3 = fArr4[i8];
                                        int i10 = i8 + 1;
                                        float f4 = fArr4[i10];
                                        float[] fArr5 = fArr2[i9];
                                        c2333z6Arr2[i2] = new C2333z6(i, f, f2, f3, f4, fArr5[i8], fArr5[i10]);
                                    }
                                    c2333z6Arr[i5] = c2333z6Arr2;
                                    i5++;
                                    i4 = i;
                                }
                            }
                        }
                    }
                    i3 = 2;
                    i = i3;
                    float[] fArr32 = fArr2[i5];
                    length = (fArr32.length % 2) + (fArr32.length / 2);
                    C2333z6[] c2333z6Arr22 = new C2333z6[length];
                    while (i2 < length) {
                    }
                    c2333z6Arr[i5] = c2333z6Arr22;
                    i5++;
                    i4 = i;
                }
                i3 = 1;
                i = i3;
                float[] fArr322 = fArr2[i5];
                length = (fArr322.length % 2) + (fArr322.length / 2);
                C2333z6[] c2333z6Arr222 = new C2333z6[length];
                while (i2 < length) {
                }
                c2333z6Arr[i5] = c2333z6Arr222;
                i5++;
                i4 = i;
            }
            i = i7;
            float[] fArr3222 = fArr2[i5];
            length = (fArr3222.length % 2) + (fArr3222.length / 2);
            C2333z6[] c2333z6Arr2222 = new C2333z6[length];
            while (i2 < length) {
            }
            c2333z6Arr[i5] = c2333z6Arr2222;
            i5++;
            i4 = i;
        }
        this.i = c2333z6Arr;
    }

    @Override // o.InterfaceC0355Np
    public InterfaceC0355Np A() {
        return this;
    }

    @Override // o.InterfaceC0355Np
    public InterfaceC0355Np M() {
        return this;
    }

    @Override // o.InterfaceC0355Np
    public InterfaceC0355Np N() {
        return this;
    }

    @Override // o.InterfaceC0355Np
    public InterfaceC0355Np T() {
        return this;
    }

    @Override // o.InterfaceC0355Np
    public InterfaceC0355Np e() {
        return this;
    }

    @Override // o.InterfaceC0355Np
    public InterfaceC0355Np s() {
        return this;
    }

    @Override // o.InterfaceC0355Np
    public InterfaceC0355Np v() {
        return this;
    }

    public Y1(C0627Yb c0627Yb) {
        this.h = 11;
        AbstractC2052ut.a(c0627Yb, "output");
        this.i = c0627Yb;
        c0627Yb.r = this;
    }

    public void H(int i) {
    }

    @Override // o.InterfaceC0355Np
    public InterfaceC0355Np k(List list) {
        return this;
    }

    public void m(int i) {
    }

    @Override // o.InterfaceC0355Np
    public InterfaceC0355Np t(C0261Jy c0261Jy) {
        return this;
    }

    public Y1(TextView textView) {
        this.h = 26;
        this.i = new C0609Xj(textView);
    }

    public Y1(EditText editText) {
        this.h = 25;
        this.i = new C2002u5(editText, 19);
    }

    public Y1(ContentInfo contentInfo) {
        this.h = 14;
        contentInfo.getClass();
        this.i = D2.g(contentInfo);
    }

    public Y1(ClipData clipData, int i) {
        this.h = 13;
        this.i = D2.e(clipData, i);
    }

    public void O(int i, float f) {
    }

    public void V(int i, Q0 q0, String str, Bundle bundle) {
    }
}
