package o;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Insets;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.LocaleList;
import android.os.Looper;
import android.provider.Settings;
import android.text.Selection;
import android.text.format.DateFormat;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.SparseArray;
import android.view.DisplayCutout;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewStructure;
import android.view.Window;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textservice.SpellCheckerInfo;
import android.view.textservice.SpellCheckerSession;
import android.view.textservice.TextServicesManager;
import android.widget.FrameLayout;
import com.google.firebase.messaging.Constants;
import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: o.Cn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0068Cn extends FrameLayout implements InterfaceC1417lD, InterfaceC0337Mx {
    public C1818rJ A;
    public final C1914sn B;
    public final Y1 C;
    public final C2060v0 D;
    public final C0016An E;
    public final C0586Wm F;
    public C2376zn G;
    public int H;
    public int I;
    public C0120En J;
    public final AtomicBoolean h;
    public boolean i;
    public final C2046un j;
    public final C2178wn k;
    public C1256in l;
    public View m;
    public View n;

    /* renamed from: o, reason: collision with root package name */
    public final HashSet f24o;
    public boolean p;
    public C0862cn q;
    public final HashSet r;
    public C0208Hx s;
    public io.flutter.plugin.editing.b t;
    public ZS u;
    public LA v;
    public C0950e6 w;
    public J3 x;
    public io.flutter.view.b y;
    public TextServicesManager z;

    public C0068Cn(AbstractActivityC0560Vm abstractActivityC0560Vm, C2046un c2046un) {
        super(abstractActivityC0560Vm, null);
        this.h = new AtomicBoolean(true);
        this.i = false;
        this.f24o = new HashSet();
        this.r = new HashSet();
        this.B = new C1914sn();
        this.C = new Y1(29, this);
        this.D = new C2060v0(this, new Handler(Looper.getMainLooper()), 1);
        this.E = new C0016An(this);
        this.F = new C0586Wm(2, this);
        this.J = new C0120En();
        this.j = c2046un;
        this.m = c2046un;
        b();
    }

    /* JADX WARN: Type inference failed for: r0v38, types: [android.view.View, o.oN] */
    public final void a() {
        Objects.toString(this.q);
        if (c()) {
            Iterator it = this.r.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
            getContext().getContentResolver().unregisterContentObserver(this.D);
            DI di = this.q.s;
            SparseArray sparseArray = di.r;
            SparseArray sparseArray2 = di.s;
            SparseArray sparseArray3 = di.u;
            for (int i = 0; i < sparseArray3.size(); i++) {
                di.j.removeView((AbstractC2213xI) sparseArray3.valueAt(i));
            }
            for (int i2 = 0; i2 < sparseArray2.size(); i2++) {
                if (sparseArray2.valueAt(i2) != null) {
                    throw new ClassCastException();
                }
                di.j.removeView(null);
            }
            di.b();
            SparseArray sparseArray4 = di.t;
            if (di.j == null) {
                Log.e("PlatformViewsController", "removeOverlaySurfaces called while flutter view is null");
            } else {
                for (int i3 = 0; i3 < sparseArray4.size(); i3++) {
                    di.j.removeView((View) sparseArray4.valueAt(i3));
                }
                sparseArray4.clear();
            }
            di.j = null;
            di.w = false;
            if (sparseArray.size() > 0) {
                sparseArray.valueAt(0).getClass();
                throw new ClassCastException();
            }
            CI ci = this.q.t;
            SparseArray sparseArray5 = ci.n;
            SparseArray sparseArray6 = ci.f20o;
            for (int i4 = 0; i4 < sparseArray6.size(); i4++) {
                if (sparseArray6.valueAt(i4) != null) {
                    throw new ClassCastException();
                }
                ci.j.removeView(null);
            }
            Surface surface = ci.r;
            if (surface != null) {
                surface.release();
                ci.r = null;
                ci.s = null;
            }
            ci.j = null;
            if (sparseArray5.size() > 0) {
                sparseArray5.valueAt(0).getClass();
                throw new ClassCastException();
            }
            this.q.s.d0();
            this.q.t.d0();
            io.flutter.view.b bVar = this.y;
            bVar.t = true;
            bVar.e.d0();
            bVar.r = null;
            AccessibilityManager accessibilityManager = bVar.c;
            accessibilityManager.removeAccessibilityStateChangeListener(bVar.u);
            accessibilityManager.removeTouchExplorationStateChangeListener(bVar.v);
            bVar.f.unregisterContentObserver(bVar.w);
            C0950e6 c0950e6 = bVar.b;
            c0950e6.k = null;
            ((FlutterJNI) c0950e6.j).setAccessibilityDelegate(null);
            this.y = null;
            this.t.b.restartInput(this);
            this.t.b();
            int size = ((HashSet) this.w.j).size();
            if (size > 0) {
                Log.w("KeyboardManager", "A KeyboardManager was destroyed with " + size + " unhandled redispatch event(s).");
            }
            ZS zs = this.u;
            if (zs != null) {
                zs.a.i = null;
                SpellCheckerSession spellCheckerSession = zs.c;
                if (spellCheckerSession != null) {
                    spellCheckerSession.close();
                }
            }
            C0208Hx c0208Hx = this.s;
            if (c0208Hx != null) {
                ((C1590ns) c0208Hx.j).i = null;
            }
            io.flutter.embedding.engine.renderer.e eVar = this.q.b;
            this.p = false;
            eVar.c(this.F);
            FlutterJNI flutterJNI = eVar.a;
            if (this.i) {
                flutterJNI.removeResizingFlutterUiListener(this.E);
            }
            eVar.e();
            flutterJNI.setSemanticsEnabled(false);
            View view = this.n;
            if (view != null && this.m == this.l) {
                this.m = view;
            }
            this.m.a();
            C1256in c1256in = this.l;
            if (c1256in != null) {
                c1256in.h.close();
                removeView(this.l);
                this.l = null;
            }
            this.n = null;
            this.q = null;
        }
    }

    @Override // android.view.View
    public final void autofill(SparseArray sparseArray) {
        C1334k c1334k;
        C1334k c1334k2;
        CharSequence textValue;
        io.flutter.plugin.editing.b bVar = this.t;
        if (Build.VERSION.SDK_INT < 26) {
            bVar.getClass();
            return;
        }
        C1041fV c1041fV = bVar.f;
        if (c1041fV == null || bVar.g == null || (c1334k = c1041fV.j) == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        for (int i = 0; i < sparseArray.size(); i++) {
            C1041fV c1041fV2 = (C1041fV) bVar.g.get(sparseArray.keyAt(i));
            if (c1041fV2 != null && (c1334k2 = c1041fV2.j) != null) {
                String str = (String) c1334k2.i;
                textValue = AbstractC1665p0.g(sparseArray.valueAt(i)).getTextValue();
                String charSequence = textValue.toString();
                C1173hV c1173hV = new C1173hV(charSequence, charSequence.length(), charSequence.length(), -1, -1);
                if (str.equals((String) c1334k.i)) {
                    bVar.h.f(c1173hV);
                } else {
                    hashMap.put(str, c1173hV);
                }
            }
        }
        C0208Hx c0208Hx = bVar.d;
        int i2 = bVar.e.b;
        c0208Hx.getClass();
        hashMap.size();
        HashMap hashMap2 = new HashMap();
        for (Map.Entry entry : hashMap.entrySet()) {
            C1173hV c1173hV2 = (C1173hV) entry.getValue();
            hashMap2.put((String) entry.getKey(), C0208Hx.J0(c1173hV2.a, c1173hV2.b, c1173hV2.c, -1, -1));
        }
        ((C0950e6) c0208Hx.i).E("TextInputClient.updateEditingStateWithTag", Arrays.asList(Integer.valueOf(i2), hashMap2), null);
    }

    public final void b() {
        C2046un c2046un = this.j;
        if (c2046un != null) {
            addView(c2046un);
        } else {
            C2178wn c2178wn = this.k;
            if (c2178wn != null) {
                addView(c2178wn);
            } else {
                addView(this.l);
            }
        }
        this.i = AbstractC0022At.y(getContext());
        setFocusable(true);
        setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT >= 26) {
            setImportantForAutofill(1);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View, o.oN] */
    public final boolean c() {
        C0862cn c0862cn = this.q;
        return c0862cn != null && c0862cn.b == this.m.getAttachedRenderer();
    }

    @Override // android.view.View
    public final boolean checkInputConnectionProxy(View view) {
        C0862cn c0862cn = this.q;
        if (c0862cn == null) {
            return super.checkInputConnectionProxy(view);
        }
        HashMap hashMap = c0862cn.s.q;
        if (view == null || !hashMap.containsKey(view.getContext())) {
            return false;
        }
        View view2 = (View) hashMap.get(view.getContext());
        if (view2 == view) {
            return true;
        }
        return view2.checkInputConnectionProxy(view);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
    
        if (r1 != false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d() {
        boolean z;
        C0950e6 c0950e6;
        HashMap hashMap;
        String str;
        List enabledSpellCheckerInfos;
        boolean z2;
        boolean isSpellCheckerEnabled;
        char c = (getResources().getConfiguration().uiMode & 48) == 32 ? (char) 2 : (char) 1;
        TextServicesManager textServicesManager = this.z;
        if (textServicesManager != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                enabledSpellCheckerInfos = textServicesManager.getEnabledSpellCheckerInfos();
                Iterator it = enabledSpellCheckerInfos.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z2 = false;
                        break;
                    } else if (((SpellCheckerInfo) it.next()).getPackageName().equals("com.google.android.inputmethod.latin")) {
                        z2 = true;
                        break;
                    }
                }
                isSpellCheckerEnabled = this.z.isSpellCheckerEnabled();
                if (isSpellCheckerEnabled) {
                }
            }
            z = true;
            ZQ zq = this.q.f153o;
            zq.getClass();
            c0950e6 = zq.b;
            hashMap = new HashMap();
            hashMap.put("textScaleFactor", Float.valueOf(getResources().getConfiguration().fontScale));
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            hashMap.put("nativeSpellCheckServiceDefined", Boolean.valueOf(z));
            hashMap.put("brieflyShowPassword", Boolean.valueOf(Settings.System.getInt(getContext().getContentResolver(), "show_password", 1) == 1));
            hashMap.put("alwaysUse24HourFormat", Boolean.valueOf(DateFormat.is24HourFormat(getContext())));
            if (c != 1) {
                str = "light";
            } else {
                if (c != 2) {
                    throw null;
                }
                str = "dark";
            }
            hashMap.put("platformBrightness", str);
            Objects.toString(hashMap.get("textScaleFactor"));
            Objects.toString(hashMap.get("alwaysUse24HourFormat"));
            Objects.toString(hashMap.get("platformBrightness"));
            if (Build.VERSION.SDK_INT >= 34 || displayMetrics == null) {
                c0950e6.M(hashMap, null);
            }
            YQ yq = new YQ(displayMetrics);
            C0950e6 c0950e62 = zq.a;
            ((ConcurrentLinkedQueue) c0950e62.i).add(yq);
            YQ yq2 = (YQ) c0950e62.k;
            c0950e62.k = yq;
            C0208Hx c0208Hx = yq2 != null ? new C0208Hx(22, c0950e62, yq2, false) : null;
            hashMap.put("configurationId", Integer.valueOf(yq.a));
            c0950e6.M(hashMap, c0208Hx);
            return;
        }
        z = false;
        ZQ zq2 = this.q.f153o;
        zq2.getClass();
        c0950e6 = zq2.b;
        hashMap = new HashMap();
        hashMap.put("textScaleFactor", Float.valueOf(getResources().getConfiguration().fontScale));
        DisplayMetrics displayMetrics2 = getResources().getDisplayMetrics();
        hashMap.put("nativeSpellCheckServiceDefined", Boolean.valueOf(z));
        hashMap.put("brieflyShowPassword", Boolean.valueOf(Settings.System.getInt(getContext().getContentResolver(), "show_password", 1) == 1));
        hashMap.put("alwaysUse24HourFormat", Boolean.valueOf(DateFormat.is24HourFormat(getContext())));
        if (c != 1) {
        }
        hashMap.put("platformBrightness", str);
        Objects.toString(hashMap.get("textScaleFactor"));
        Objects.toString(hashMap.get("alwaysUse24HourFormat"));
        Objects.toString(hashMap.get("platformBrightness"));
        if (Build.VERSION.SDK_INT >= 34) {
        }
        c0950e6.M(hashMap, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
            getKeyDispatcherState().startTracking(keyEvent, this);
        } else if (keyEvent.getAction() == 1) {
            getKeyDispatcherState().handleUpEvent(keyEvent);
        }
        return (c() && this.w.B(keyEvent)) || super.dispatchKeyEvent(keyEvent);
    }

    public final void e() {
        if (!c()) {
            Log.w("FlutterView", "Tried to send viewport metrics from Android to Flutter but this FlutterView was not attached to a FlutterEngine.");
            return;
        }
        float f = getResources().getDisplayMetrics().density;
        C1914sn c1914sn = this.B;
        c1914sn.a = f;
        c1914sn.t = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        io.flutter.embedding.engine.renderer.e eVar = this.q.b;
        eVar.getClass();
        int i = c1914sn.b;
        ArrayList arrayList = c1914sn.v;
        ArrayList arrayList2 = c1914sn.u;
        if (i == 0) {
            int i2 = c1914sn.d;
            int i3 = c1914sn.e;
            if (i2 <= 0 && i3 <= 0) {
                return;
            }
        } else {
            int i4 = c1914sn.c;
            if (i4 == 0) {
                int i5 = c1914sn.f;
                int i6 = c1914sn.g;
                if (i5 <= 0 && i6 <= 0) {
                    return;
                }
            } else if (i <= 0 || i4 <= 0 || c1914sn.a <= 0.0f) {
                return;
            }
        }
        arrayList2.size();
        arrayList.size();
        int size = arrayList.size() + arrayList2.size();
        int[] iArr = new int[size * 4];
        int[] iArr2 = new int[size];
        int[] iArr3 = new int[size];
        for (int i7 = 0; i7 < arrayList2.size(); i7++) {
            C1783qn c1783qn = (C1783qn) arrayList2.get(i7);
            int i8 = i7 * 4;
            Rect rect = c1783qn.a;
            iArr[i8] = rect.left;
            iArr[i8 + 1] = rect.top;
            iArr[i8 + 2] = rect.right;
            iArr[i8 + 3] = rect.bottom;
            iArr2[i7] = AbstractC1888sN.v(c1783qn.b);
            iArr3[i7] = AbstractC1888sN.v(c1783qn.c);
        }
        int size2 = arrayList2.size() * 4;
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            C1783qn c1783qn2 = (C1783qn) arrayList.get(i9);
            int i10 = (i9 * 4) + size2;
            Rect rect2 = c1783qn2.a;
            iArr[i10] = rect2.left;
            iArr[i10 + 1] = rect2.top;
            iArr[i10 + 2] = rect2.right;
            iArr[i10 + 3] = rect2.bottom;
            iArr2[arrayList2.size() + i9] = AbstractC1888sN.v(c1783qn2.b);
            iArr3[arrayList2.size() + i9] = AbstractC1888sN.v(c1783qn2.c);
        }
        eVar.a.setViewportMetrics(c1914sn.a, c1914sn.b, c1914sn.c, c1914sn.h, c1914sn.i, c1914sn.j, c1914sn.k, c1914sn.l, c1914sn.m, c1914sn.n, c1914sn.f222o, c1914sn.p, c1914sn.q, c1914sn.r, c1914sn.s, c1914sn.t, iArr, iArr2, iArr3, c1914sn.d, c1914sn.e, c1914sn.f, c1914sn.g);
    }

    @Override // android.view.View
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        io.flutter.view.b bVar = this.y;
        if (bVar == null || !bVar.c.isEnabled()) {
            return null;
        }
        return this.y;
    }

    public C0862cn getAttachedFlutterEngine() {
        return this.q;
    }

    public InterfaceC1412l8 getBinaryMessenger() {
        return this.q.c;
    }

    public C1256in getCurrentImageSurface() {
        return this.l;
    }

    public C1914sn getViewportMetrics() {
        return this.B;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x01b5, code lost:
    
        r1 = r18.getDisplayCutout();
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x017e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x013d  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        char c;
        double d;
        int i;
        int captionBar;
        List boundingRects;
        Window window;
        DisplayCutout displayCutout;
        List<Rect> boundingRects2;
        int systemBars;
        Insets insets;
        int i2;
        int i3;
        int i4;
        int i5;
        int ime;
        Insets insets2;
        int i6;
        int i7;
        int i8;
        int i9;
        int systemGestures;
        Insets insets3;
        int i10;
        int i11;
        int i12;
        int i13;
        DisplayCutout displayCutout2;
        Insets waterfallInsets;
        int i14;
        int safeInsetTop;
        int i15;
        int safeInsetRight;
        int i16;
        int safeInsetBottom;
        int i17;
        int safeInsetLeft;
        Insets systemGestureInsets;
        int i18;
        int i19;
        int i20;
        int i21;
        WindowInsets onApplyWindowInsets = super.onApplyWindowInsets(windowInsets);
        int i22 = Build.VERSION.SDK_INT;
        C1914sn c1914sn = this.B;
        if (i22 == 29) {
            systemGestureInsets = windowInsets.getSystemGestureInsets();
            i18 = systemGestureInsets.top;
            c1914sn.p = i18;
            i19 = systemGestureInsets.right;
            c1914sn.q = i19;
            i20 = systemGestureInsets.bottom;
            c1914sn.r = i20;
            i21 = systemGestureInsets.left;
            c1914sn.s = i21;
        }
        boolean z = (getWindowSystemUiVisibility() & 4) == 0;
        boolean z2 = (getWindowSystemUiVisibility() & 2) == 0;
        if (i22 >= 30) {
            systemBars = WindowInsets.Type.systemBars();
            insets = windowInsets.getInsets(systemBars);
            i2 = insets.top;
            c1914sn.h = i2;
            i3 = insets.right;
            c1914sn.i = i3;
            i4 = insets.bottom;
            c1914sn.j = i4;
            i5 = insets.left;
            c1914sn.k = i5;
            ime = WindowInsets.Type.ime();
            insets2 = windowInsets.getInsets(ime);
            i6 = insets2.top;
            c1914sn.l = i6;
            i7 = insets2.right;
            c1914sn.m = i7;
            i8 = insets2.bottom;
            c1914sn.n = i8;
            i9 = insets2.left;
            c1914sn.f222o = i9;
            systemGestures = WindowInsets.Type.systemGestures();
            insets3 = windowInsets.getInsets(systemGestures);
            i10 = insets3.top;
            c1914sn.p = i10;
            i11 = insets3.right;
            c1914sn.q = i11;
            i12 = insets3.bottom;
            c1914sn.r = i12;
            i13 = insets3.left;
            c1914sn.s = i13;
            displayCutout2 = windowInsets.getDisplayCutout();
            if (displayCutout2 != null) {
                waterfallInsets = displayCutout2.getWaterfallInsets();
                int i23 = c1914sn.h;
                i14 = waterfallInsets.top;
                int max = Math.max(i23, i14);
                safeInsetTop = displayCutout2.getSafeInsetTop();
                c1914sn.h = Math.max(max, safeInsetTop);
                int i24 = c1914sn.i;
                i15 = waterfallInsets.right;
                int max2 = Math.max(i24, i15);
                safeInsetRight = displayCutout2.getSafeInsetRight();
                c1914sn.i = Math.max(max2, safeInsetRight);
                int i25 = c1914sn.j;
                i16 = waterfallInsets.bottom;
                int max3 = Math.max(i25, i16);
                safeInsetBottom = displayCutout2.getSafeInsetBottom();
                c1914sn.j = Math.max(max3, safeInsetBottom);
                int i26 = c1914sn.k;
                i17 = waterfallInsets.left;
                int max4 = Math.max(i26, i17);
                safeInsetLeft = displayCutout2.getSafeInsetLeft();
                c1914sn.k = Math.max(max4, safeInsetLeft);
            }
        } else {
            if (!z2) {
                Context context = getContext();
                if (context.getResources().getConfiguration().orientation == 2) {
                    int rotation = ((DisplayManager) context.getSystemService(Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION)).getDisplay(0).getRotation();
                    if (rotation == 1) {
                        c = 3;
                    } else if (rotation == 3) {
                        c = 2;
                    } else if (rotation == 0 || rotation == 2) {
                        c = 4;
                    }
                    c1914sn.h = !z ? windowInsets.getSystemWindowInsetTop() : 0;
                    c1914sn.i = (c != 3 || c == 4) ? 0 : windowInsets.getSystemWindowInsetRight();
                    if (z2) {
                        d = 0.18d;
                    } else {
                        d = 0.18d;
                        if ((((double) windowInsets.getSystemWindowInsetBottom()) < ((double) getRootView().getHeight()) * 0.18d ? 0 : windowInsets.getSystemWindowInsetBottom()) == 0) {
                            i = windowInsets.getSystemWindowInsetBottom();
                            c1914sn.j = i;
                            c1914sn.k = (c != 2 || c == 4) ? 0 : windowInsets.getSystemWindowInsetLeft();
                            c1914sn.l = 0;
                            c1914sn.m = 0;
                            c1914sn.n = ((double) windowInsets.getSystemWindowInsetBottom()) < ((double) getRootView().getHeight()) * d ? 0 : windowInsets.getSystemWindowInsetBottom();
                            c1914sn.f222o = 0;
                        }
                    }
                    i = 0;
                    c1914sn.j = i;
                    c1914sn.k = (c != 2 || c == 4) ? 0 : windowInsets.getSystemWindowInsetLeft();
                    c1914sn.l = 0;
                    c1914sn.m = 0;
                    c1914sn.n = ((double) windowInsets.getSystemWindowInsetBottom()) < ((double) getRootView().getHeight()) * d ? 0 : windowInsets.getSystemWindowInsetBottom();
                    c1914sn.f222o = 0;
                }
            }
            c = 1;
            c1914sn.h = !z ? windowInsets.getSystemWindowInsetTop() : 0;
            c1914sn.i = (c != 3 || c == 4) ? 0 : windowInsets.getSystemWindowInsetRight();
            if (z2) {
            }
            i = 0;
            c1914sn.j = i;
            c1914sn.k = (c != 2 || c == 4) ? 0 : windowInsets.getSystemWindowInsetLeft();
            c1914sn.l = 0;
            c1914sn.m = 0;
            c1914sn.n = ((double) windowInsets.getSystemWindowInsetBottom()) < ((double) getRootView().getHeight()) * d ? 0 : windowInsets.getSystemWindowInsetBottom();
            c1914sn.f222o = 0;
        }
        ArrayList arrayList = new ArrayList();
        if (i22 >= 28 && displayCutout != null) {
            boundingRects2 = displayCutout.getBoundingRects();
            for (Rect rect : boundingRects2) {
                rect.toString();
                arrayList.add(new C1783qn(rect, 4, 1));
            }
        }
        ArrayList arrayList2 = c1914sn.v;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        if (Build.VERSION.SDK_INT >= 35) {
            C0120En c0120En = this.J;
            Context context2 = getContext();
            c0120En.getClass();
            Activity m = AbstractC2219xO.m(context2);
            WindowInsets windowInsets2 = null;
            if (m != null && (window = m.getWindow()) != null) {
                windowInsets2 = window.getDecorView().getRootWindowInsets();
            }
            if (windowInsets2 == null) {
                boundingRects = Collections.EMPTY_LIST;
            } else {
                captionBar = WindowInsets.Type.captionBar();
                boundingRects = windowInsets2.getBoundingRects(captionBar);
            }
            int i27 = c1914sn.h;
            Iterator it = boundingRects.iterator();
            while (it.hasNext()) {
                i27 = Math.max(i27, ((Rect) it.next()).bottom);
            }
            c1914sn.h = i27;
        }
        e();
        return onApplyWindowInsets;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v9, types: [o.xm] */
    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        C1818rJ c1818rJ;
        super.onAttachedToWindow();
        try {
            S00 s00 = T00.g;
            Context context = getContext();
            s00.getClass();
            c1818rJ = new C1818rJ(26, new KX(S00.a(context)));
        } catch (NoClassDefFoundError unused) {
            c1818rJ = null;
        }
        this.A = c1818rJ;
        Activity m = AbstractC2219xO.m(getContext());
        C1818rJ c1818rJ2 = this.A;
        if (c1818rJ2 == null || m == null) {
            return;
        }
        this.G = new C2376zn(0, this);
        Context context2 = getContext();
        Executor a = Build.VERSION.SDK_INT >= 28 ? AbstractC1971te.a(context2) : new ExecutorC0729al(0, new Handler(context2.getMainLooper()));
        C2376zn c2376zn = this.G;
        KX kx = (KX) c1818rJ2.i;
        AbstractC0048Bt.n(a, "executor");
        AbstractC0048Bt.n(c2376zn, "consumer");
        C2002u5 c2002u5 = (C2002u5) kx.i;
        C1818rJ c1818rJ3 = (C1818rJ) kx.h;
        c1818rJ3.getClass();
        C9 j = AbstractC0022At.j(new U00(c1818rJ3, m, null));
        C0191Hg c0191Hg = AbstractC0115Ei.a;
        C1325jr c1325jr = AbstractC1810rB.a;
        if (c1325jr.k(C0460Rq.K) != null) {
            throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + c1325jr).toString());
        }
        C9 c9 = j;
        if (!c1325jr.equals(C1188hk.h)) {
            c9 = AbstractC1473m3.y(j, c1325jr, 0, null, 6);
        }
        LinkedHashMap linkedHashMap = (LinkedHashMap) c2002u5.j;
        AbstractC0048Bt.n(c9, "flow");
        ReentrantLock reentrantLock = (ReentrantLock) c2002u5.i;
        reentrantLock.lock();
        try {
            if (linkedHashMap.get(c2376zn) == null) {
                linkedHashMap.put(c2376zn, AbstractC0868ct.H(AbstractC1052fg.c(new C0860cl(a)), null, null, new E9(c9, c2376zn, null), 3));
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.q != null) {
            this.v.b(configuration);
            d();
            AbstractC2219xO.e(getContext(), this.q);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0057, code lost:
    
        if (r2.c != false) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b3  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        int i;
        if (!c()) {
            return super.onCreateInputConnection(editorInfo);
        }
        io.flutter.plugin.editing.b bVar = this.t;
        C0950e6 c0950e6 = this.w;
        C1682pE c1682pE = bVar.e;
        int i2 = c1682pE.a;
        if (i2 == 1) {
            bVar.j = null;
            return null;
        }
        int i3 = 4;
        if (i2 == 4) {
            return null;
        }
        if (i2 == 3) {
            if (bVar.p) {
                return bVar.j;
            }
            bVar.k.L(c1682pE.b);
            throw null;
        }
        C1041fV c1041fV = bVar.f;
        C1107gV c1107gV = c1041fV.g;
        boolean z = c1041fV.a;
        boolean z2 = c1041fV.b;
        boolean z3 = c1041fV.c;
        boolean z4 = c1041fV.d;
        int i4 = c1041fV.f;
        int i5 = c1107gV.a;
        if (i5 != 2) {
            if (i5 == 5) {
                i3 = c1107gV.b ? 4098 : 2;
            } else if (i5 == 6) {
                i3 = 3;
            } else if (i5 == 11) {
                i3 = 0;
            } else {
                int i6 = i5 == 7 ? 131073 : (i5 == 8 || i5 == 13) ? 33 : (i5 == 9 || i5 == 12) ? 17 : i5 == 10 ? 145 : i5 == 3 ? 97 : i5 == 4 ? 113 : 1;
                if (!z) {
                    if (z2) {
                        i6 |= 32768;
                    }
                    i = z3 ? 524416 : 524432;
                    i3 = i6;
                    if (i4 != 1) {
                        i3 |= 4096;
                    } else {
                        if (i4 != 2) {
                            if (i4 == 3) {
                                i3 |= 16384;
                            }
                        }
                        i3 |= 8192;
                    }
                }
                i6 |= i;
                i3 = i6;
                if (i4 != 1) {
                }
            }
        }
        editorInfo.inputType = i3;
        editorInfo.imeOptions = 33554432;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 26 && !z4) {
            editorInfo.imeOptions = 50331648;
        }
        int intValue = c1041fV.h.intValue();
        C1041fV c1041fV2 = bVar.f;
        String str = c1041fV2.i;
        if (str != null) {
            editorInfo.actionLabel = str;
            editorInfo.actionId = intValue;
        }
        editorInfo.imeOptions = intValue | editorInfo.imeOptions;
        if (c1041fV2.m != null) {
            editorInfo.hintLocales = new LocaleList(bVar.f.m);
        }
        String[] strArr = bVar.f.k;
        if (strArr != null) {
            AbstractC1305jX.F(editorInfo, strArr);
        }
        if (i7 >= 34) {
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            editorInfo.extras.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", true);
        }
        C0410Ps c0410Ps = new C0410Ps(this, bVar.e.b, bVar.d, c0950e6, bVar.h, editorInfo);
        C2073vA c2073vA = bVar.h;
        c2073vA.getClass();
        editorInfo.initialSelStart = Selection.getSelectionStart(c2073vA);
        C2073vA c2073vA2 = bVar.h;
        c2073vA2.getClass();
        editorInfo.initialSelEnd = Selection.getSelectionEnd(c2073vA2);
        bVar.j = c0410Ps;
        return c0410Ps;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C2376zn c2376zn;
        C1818rJ c1818rJ = this.A;
        if (c1818rJ != null && (c2376zn = this.G) != null) {
            C2002u5 c2002u5 = (C2002u5) ((KX) c1818rJ.i).i;
            LinkedHashMap linkedHashMap = (LinkedHashMap) c2002u5.j;
            ReentrantLock reentrantLock = (ReentrantLock) c2002u5.i;
            reentrantLock.lock();
            try {
                InterfaceC0075Cu interfaceC0075Cu = (InterfaceC0075Cu) linkedHashMap.get(c2376zn);
                if (interfaceC0075Cu != null) {
                    interfaceC0075Cu.c(null);
                }
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        this.G = null;
        this.A = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (c()) {
            J3 j3 = this.x;
            Context context = getContext();
            j3.getClass();
            boolean isFromSource = motionEvent.isFromSource(2);
            boolean z = motionEvent.getActionMasked() == 7 || motionEvent.getActionMasked() == 8;
            if (isFromSource && z) {
                int b = J3.b(motionEvent.getActionMasked());
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(motionEvent.getPointerCount() * 288);
                allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
                j3.a(motionEvent, motionEvent.getActionIndex(), b, 0, J3.f, allocateDirect, context);
                if (allocateDirect.position() % 288 != 0) {
                    throw new AssertionError("Packet position is not on field boundary.");
                }
                j3.a.a.dispatchPointerDataPacket(allocateDirect, allocateDirect.position());
                return true;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        return !c() ? super.onHoverEvent(motionEvent) : this.y.e(motionEvent, false);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        this.H = View.MeasureSpec.getMode(i);
        this.I = View.MeasureSpec.getMode(i2);
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i) {
        Rect rect;
        super.onProvideAutofillVirtualStructure(viewStructure, i);
        io.flutter.plugin.editing.b bVar = this.t;
        if (Build.VERSION.SDK_INT < 26) {
            bVar.getClass();
            return;
        }
        if (bVar.g != null) {
            String str = (String) bVar.f.j.i;
            AutofillId autofillId = viewStructure.getAutofillId();
            for (int i2 = 0; i2 < bVar.g.size(); i2++) {
                int keyAt = bVar.g.keyAt(i2);
                C1334k c1334k = ((C1041fV) bVar.g.valueAt(i2)).j;
                if (c1334k != null) {
                    viewStructure.addChildCount(1);
                    ViewStructure newChild = viewStructure.newChild(i2);
                    newChild.setAutofillId(autofillId, keyAt);
                    String[] strArr = (String[]) c1334k.j;
                    if (strArr.length > 0) {
                        newChild.setAutofillHints(strArr);
                    }
                    newChild.setAutofillType(1);
                    newChild.setVisibility(0);
                    String str2 = (String) c1334k.l;
                    if (str2 != null) {
                        newChild.setHint(str2);
                    }
                    if (str.hashCode() != keyAt || (rect = bVar.m) == null) {
                        newChild.setDimens(0, 0, 0, 0, 1, 1);
                        newChild.setAutofillValue(AutofillValue.forText(((C1173hV) c1334k.k).a));
                    } else {
                        newChild.setDimens(rect.left, rect.top, 0, 0, rect.width(), bVar.m.height());
                        newChild.setAutofillValue(AutofillValue.forText(bVar.h));
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        C1914sn c1914sn = this.B;
        c1914sn.b = i;
        c1914sn.c = i2;
        boolean z = this.i;
        if (z && this.I == 0) {
            c1914sn.f = 0;
            c1914sn.g = 8192;
        } else {
            c1914sn.f = i2;
            c1914sn.g = i2;
        }
        if (z && this.H == 0) {
            c1914sn.d = 0;
            c1914sn.e = 8192;
        } else {
            c1914sn.d = i;
            c1914sn.e = i;
        }
        if (this.h.compareAndSet(false, true)) {
            return;
        }
        e();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ByteBuffer byteBuffer;
        if (!c()) {
            return super.onTouchEvent(motionEvent);
        }
        requestUnbufferedDispatch(motionEvent);
        J3 j3 = this.x;
        Matrix matrix = J3.f;
        j3.getClass();
        int actionMasked = motionEvent.getActionMasked();
        int b = J3.b(motionEvent.getActionMasked());
        char c = 5;
        boolean z = actionMasked == 0 || actionMasked == 5;
        boolean z2 = !z && (actionMasked == 1 || actionMasked == 6);
        int toolType = motionEvent.getToolType(motionEvent.getActionIndex());
        if (toolType == 1) {
            c = 0;
        } else if (toolType == 2) {
            c = 2;
        } else if (toolType == 3) {
            c = 1;
        } else if (toolType == 4) {
            c = 3;
        }
        int i = (z2 && c == 0) ? 1 : 0;
        int pointerCount = motionEvent.getPointerCount();
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect((pointerCount + i) * 288);
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        if (z) {
            byteBuffer = allocateDirect;
            j3.a(motionEvent, motionEvent.getActionIndex(), b, 0, matrix, byteBuffer, null);
        } else {
            byteBuffer = allocateDirect;
            if (z2) {
                for (int i2 = 0; i2 < pointerCount; i2++) {
                    if (i2 != motionEvent.getActionIndex() && motionEvent.getToolType(i2) == 1) {
                        j3.a(motionEvent, i2, 5, 1, matrix, byteBuffer, null);
                    }
                }
                j3.a(motionEvent, motionEvent.getActionIndex(), b, 0, matrix, byteBuffer, null);
                if (i != 0) {
                    j3.a(motionEvent, motionEvent.getActionIndex(), 2, 0, matrix, byteBuffer, null);
                }
            } else {
                for (int i3 = 0; i3 < pointerCount; i3++) {
                    j3.a(motionEvent, i3, b, (pointerCount << 8) | 2, matrix, byteBuffer, null);
                }
            }
        }
        if (byteBuffer.position() % 288 != 0) {
            throw new AssertionError("Packet position is not on field boundary");
        }
        j3.a.a.dispatchPointerDataPacket(byteBuffer, byteBuffer.position());
        return true;
    }

    public void setDelegate(C0120En c0120En) {
        this.J = c0120En;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        View view = this.m;
        if (view instanceof C2046un) {
            ((C2046un) view).setVisibility(i);
        }
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, java.util.List] */
    public void setWindowInfoListenerDisplayFeatures(C1470m10 c1470m10) {
        C0457Rn c0457Rn = C0457Rn.k;
        ?? r9 = c1470m10.a;
        ArrayList arrayList = new ArrayList();
        for (C1589nr c1589nr : r9) {
            c1589nr.a.a().toString();
            C2137w8 c2137w8 = c1589nr.a;
            int i = 2;
            int i2 = ((c2137w8.c - c2137w8.a == 0 || c2137w8.d - c2137w8.b == 0) ? C0457Rn.j : c0457Rn) == c0457Rn ? 3 : 2;
            C0457Rn c0457Rn2 = c1589nr.c;
            if (c0457Rn2 != C0457Rn.l) {
                i = c0457Rn2 == C0457Rn.m ? 3 : 1;
            }
            arrayList.add(new C1783qn(c2137w8.a(), i2, i));
        }
        ArrayList arrayList2 = this.B.u;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        e();
    }

    public C0068Cn(AbstractActivityC0560Vm abstractActivityC0560Vm, C2178wn c2178wn) {
        super(abstractActivityC0560Vm, null);
        this.h = new AtomicBoolean(true);
        this.i = false;
        this.f24o = new HashSet();
        this.r = new HashSet();
        this.B = new C1914sn();
        this.C = new Y1(29, this);
        this.D = new C2060v0(this, new Handler(Looper.getMainLooper()), 1);
        this.E = new C0016An(this);
        this.F = new C0586Wm(2, this);
        this.J = new C0120En();
        this.k = c2178wn;
        this.m = c2178wn;
        b();
    }
}
