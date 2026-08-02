package D;

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
import g.AbstractC0038a;
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
import k0.AbstractC0042a;
import k0.AbstractC0060t;
import k0.AbstractC0065y;
import k0.C0058q;
import k0.Y;
import n.AbstractC0077d;
import s.C0094b;
import t.C0097a;
import v.C0099b;
import v.C0100c;
import v.C0104g;
import v.C0107j;
import v.C0108k;
import v.InterfaceC0105h;

/* loaded from: classes.dex */
public final class y extends FrameLayout {
    public int A;

    /* renamed from: B, reason: collision with root package name */
    public int f118B;

    /* renamed from: C, reason: collision with root package name */
    public A f119C;

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f120a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f121b;

    /* renamed from: c, reason: collision with root package name */
    public final C0014o f122c;

    /* renamed from: d, reason: collision with root package name */
    public final C0016q f123d;

    /* renamed from: e, reason: collision with root package name */
    public C0012m f124e;

    /* renamed from: f, reason: collision with root package name */
    public View f125f;

    /* renamed from: g, reason: collision with root package name */
    public View f126g;

    /* renamed from: h, reason: collision with root package name */
    public final HashSet f127h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f128i;

    /* renamed from: j, reason: collision with root package name */
    public E.c f129j;

    /* renamed from: k, reason: collision with root package name */
    public final HashSet f130k;

    /* renamed from: l, reason: collision with root package name */
    public B.a f131l;

    /* renamed from: m, reason: collision with root package name */
    public io.flutter.plugin.editing.l f132m;

    /* renamed from: n, reason: collision with root package name */
    public io.flutter.plugin.editing.g f133n;

    /* renamed from: o, reason: collision with root package name */
    public O.a f134o;

    /* renamed from: p, reason: collision with root package name */
    public C.b f135p;

    /* renamed from: q, reason: collision with root package name */
    public C0001b f136q;

    /* renamed from: r, reason: collision with root package name */
    public io.flutter.view.h f137r;

    /* renamed from: s, reason: collision with root package name */
    public TextServicesManager f138s;

    /* renamed from: t, reason: collision with root package name */
    public u f139t;
    public final io.flutter.embedding.engine.renderer.g u;

    /* renamed from: v, reason: collision with root package name */
    public final u f140v;

    /* renamed from: w, reason: collision with root package name */
    public final v f141w;

    /* renamed from: x, reason: collision with root package name */
    public final w f142x;

    /* renamed from: y, reason: collision with root package name */
    public final C0006g f143y;

    /* renamed from: z, reason: collision with root package name */
    public C0018t f144z;

    public y(AbstractActivityC0005f abstractActivityC0005f, C0014o c0014o) {
        super(abstractActivityC0005f, null);
        this.f120a = new AtomicBoolean(true);
        this.f121b = false;
        this.f127h = new HashSet();
        this.f130k = new HashSet();
        this.u = new io.flutter.embedding.engine.renderer.g();
        this.f140v = new u(0, this);
        this.f141w = new v(this, new Handler(Looper.getMainLooper()), 0);
        this.f142x = new w(this);
        this.f143y = new C0006g(1, this);
        this.f119C = new A();
        this.f122c = c0014o;
        this.f125f = c0014o;
        b();
    }

    /* JADX WARN: Type inference failed for: r0v38, types: [android.view.View, io.flutter.embedding.engine.renderer.k] */
    public final void a() {
        SparseArray sparseArray;
        Objects.toString(this.f129j);
        if (!c()) {
            return;
        }
        Iterator it = this.f130k.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        getContext().getContentResolver().unregisterContentObserver(this.f141w);
        io.flutter.plugin.platform.k kVar = this.f129j.f166s;
        int i2 = 0;
        while (true) {
            SparseArray sparseArray2 = kVar.f678o;
            if (i2 >= sparseArray2.size()) {
                break;
            }
            kVar.f667d.removeView((io.flutter.plugin.platform.h) sparseArray2.valueAt(i2));
            i2++;
        }
        int i3 = 0;
        while (true) {
            SparseArray sparseArray3 = kVar.f676m;
            if (i3 >= sparseArray3.size()) {
                kVar.c();
                if (kVar.f667d == null) {
                    Log.e("PlatformViewsController", "removeOverlaySurfaces called while flutter view is null");
                } else {
                    int i4 = 0;
                    while (true) {
                        sparseArray = kVar.f677n;
                        if (i4 >= sparseArray.size()) {
                            break;
                        }
                        kVar.f667d.removeView((View) sparseArray.valueAt(i4));
                        i4++;
                    }
                    sparseArray.clear();
                }
                kVar.f667d = null;
                kVar.f680q = false;
                SparseArray sparseArray4 = kVar.f675l;
                if (sparseArray4.size() > 0) {
                    sparseArray4.valueAt(0).getClass();
                    throw new ClassCastException();
                }
                io.flutter.plugin.platform.j jVar = this.f129j.f167t;
                int i5 = 0;
                while (true) {
                    SparseArray sparseArray5 = jVar.f659i;
                    if (i5 >= sparseArray5.size()) {
                        Surface surface = jVar.f662l;
                        if (surface != null) {
                            surface.release();
                            jVar.f662l = null;
                            jVar.f663m = null;
                        }
                        jVar.f654d = null;
                        SparseArray sparseArray6 = jVar.f658h;
                        if (sparseArray6.size() > 0) {
                            sparseArray6.valueAt(0).getClass();
                            throw new ClassCastException();
                        }
                        this.f129j.f166s.b();
                        this.f129j.f167t.b();
                        io.flutter.view.h hVar = this.f137r;
                        hVar.f797t = true;
                        hVar.f782e.b();
                        hVar.f795r = null;
                        AccessibilityManager accessibilityManager = hVar.f780c;
                        accessibilityManager.removeAccessibilityStateChangeListener(hVar.u);
                        accessibilityManager.removeTouchExplorationStateChangeListener(hVar.f798v);
                        hVar.f783f.unregisterContentObserver(hVar.f799w);
                        C.b bVar = hVar.f779b;
                        bVar.f15c = null;
                        ((FlutterJNI) bVar.f14b).setAccessibilityDelegate(null);
                        this.f137r = null;
                        this.f132m.f624b.restartInput(this);
                        this.f132m.b();
                        int size = ((HashSet) this.f135p.f14b).size();
                        if (size > 0) {
                            Log.w("KeyboardManager", "A KeyboardManager was destroyed with " + size + " unhandled redispatch event(s).");
                        }
                        io.flutter.plugin.editing.g gVar = this.f133n;
                        if (gVar != null) {
                            gVar.f605a.f111c = null;
                            SpellCheckerSession spellCheckerSession = gVar.f607c;
                            if (spellCheckerSession != null) {
                                spellCheckerSession.close();
                            }
                        }
                        B.a aVar = this.f131l;
                        if (aVar != null) {
                            ((u) aVar.f4d).f111c = null;
                        }
                        io.flutter.embedding.engine.renderer.h hVar2 = this.f129j.f149b;
                        this.f128i = false;
                        hVar2.c(this.f143y);
                        boolean z2 = this.f121b;
                        FlutterJNI flutterJNI = hVar2.f570a;
                        if (z2) {
                            flutterJNI.removeResizingFlutterUiListener(this.f142x);
                        }
                        hVar2.e();
                        flutterJNI.setSemanticsEnabled(false);
                        View view = this.f126g;
                        if (view != null && this.f125f == this.f124e) {
                            this.f125f = view;
                        }
                        this.f125f.d();
                        C0012m c0012m = this.f124e;
                        if (c0012m != null) {
                            c0012m.f89a.close();
                            removeView(this.f124e);
                            this.f124e = null;
                        }
                        this.f126g = null;
                        this.f129j = null;
                        return;
                    }
                    if (sparseArray5.valueAt(i5) != null) {
                        throw new ClassCastException();
                    }
                    jVar.f654d.removeView(null);
                    i5++;
                }
            } else {
                if (sparseArray3.valueAt(i3) != null) {
                    throw new ClassCastException();
                }
                kVar.f667d.removeView(null);
                i3++;
            }
        }
    }

    @Override // android.view.View
    public final void autofill(SparseArray sparseArray) {
        B.e eVar;
        B.e eVar2;
        CharSequence textValue;
        io.flutter.plugin.editing.l lVar = this.f132m;
        if (Build.VERSION.SDK_INT < 26) {
            lVar.getClass();
            return;
        }
        M.o oVar = lVar.f628f;
        if (oVar == null || lVar.f629g == null || (eVar = oVar.f331j) == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            M.o oVar2 = (M.o) lVar.f629g.get(sparseArray.keyAt(i2));
            if (oVar2 != null && (eVar2 = oVar2.f331j) != null) {
                textValue = AbstractC0000a.e(sparseArray.valueAt(i2)).getTextValue();
                String charSequence = textValue.toString();
                M.q qVar = new M.q(charSequence, charSequence.length(), charSequence.length(), -1, -1);
                String str = (String) eVar2.f7a;
                if (str.equals((String) eVar.f7a)) {
                    lVar.f630h.f(qVar);
                } else {
                    hashMap.put(str, qVar);
                }
            }
        }
        int i3 = lVar.f627e.f622b;
        B.a aVar = lVar.f626d;
        aVar.getClass();
        hashMap.size();
        HashMap hashMap2 = new HashMap();
        for (Map.Entry entry : hashMap.entrySet()) {
            M.q qVar2 = (M.q) entry.getValue();
            hashMap2.put((String) entry.getKey(), B.a.m(qVar2.f338a, qVar2.f339b, qVar2.f340c, -1, -1));
        }
        ((C.b) aVar.f3c).f("TextInputClient.updateEditingStateWithTag", Arrays.asList(Integer.valueOf(i3), hashMap2), null);
    }

    public final void b() {
        C0014o c0014o = this.f122c;
        if (c0014o != null) {
            addView(c0014o);
        } else {
            C0016q c0016q = this.f123d;
            if (c0016q != null) {
                addView(c0016q);
            } else {
                addView(this.f124e);
            }
        }
        this.f121b = a.a.p(getContext());
        setFocusable(true);
        setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT >= 26) {
            setImportantForAutofill(1);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View, io.flutter.embedding.engine.renderer.k] */
    public final boolean c() {
        E.c cVar = this.f129j;
        if (cVar != null) {
            if (cVar.f149b == this.f125f.getAttachedRenderer()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean checkInputConnectionProxy(View view) {
        E.c cVar = this.f129j;
        if (cVar == null) {
            return super.checkInputConnectionProxy(view);
        }
        io.flutter.plugin.platform.k kVar = cVar.f166s;
        if (view == null) {
            kVar.getClass();
            return false;
        }
        HashMap hashMap = kVar.f674k;
        if (!hashMap.containsKey(view.getContext())) {
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
    /* JADX WARN: Removed duplicated region for block: B:24:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d() {
        boolean z2;
        HashMap hashMap;
        String str;
        boolean z3;
        B.e eVar;
        List enabledSpellCheckerInfos;
        boolean z4;
        boolean isSpellCheckerEnabled;
        char c2 = (getResources().getConfiguration().uiMode & 48) == 32 ? (char) 2 : (char) 1;
        TextServicesManager textServicesManager = this.f138s;
        if (textServicesManager != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                enabledSpellCheckerInfos = textServicesManager.getEnabledSpellCheckerInfos();
                Iterator it = enabledSpellCheckerInfos.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z4 = false;
                        break;
                    } else if (((SpellCheckerInfo) it.next()).getPackageName().equals("com.google.android.inputmethod.latin")) {
                        z4 = true;
                        break;
                    }
                }
                isSpellCheckerEnabled = this.f138s.isSpellCheckerEnabled();
                if (isSpellCheckerEnabled) {
                }
            }
            z2 = true;
            M.n nVar = this.f129j.f162o;
            nVar.getClass();
            hashMap = new HashMap();
            hashMap.put("textScaleFactor", Float.valueOf(getResources().getConfiguration().fontScale));
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            hashMap.put("nativeSpellCheckServiceDefined", Boolean.valueOf(z2));
            hashMap.put("brieflyShowPassword", Boolean.valueOf(Settings.System.getInt(getContext().getContentResolver(), "show_password", 1) != 1));
            hashMap.put("alwaysUse24HourFormat", Boolean.valueOf(DateFormat.is24HourFormat(getContext())));
            if (c2 != 1) {
                str = "light";
            } else {
                if (c2 != 2) {
                    throw null;
                }
                str = "dark";
            }
            hashMap.put("platformBrightness", str);
            Objects.toString(hashMap.get("textScaleFactor"));
            Objects.toString(hashMap.get("alwaysUse24HourFormat"));
            Objects.toString(hashMap.get("platformBrightness"));
            z3 = Build.VERSION.SDK_INT >= 34;
            eVar = nVar.f321b;
            if (z3 || displayMetrics == null) {
                eVar.g(hashMap, null);
            }
            M.m mVar = new M.m(displayMetrics);
            C.b bVar = nVar.f320a;
            ((ConcurrentLinkedQueue) bVar.f13a).add(mVar);
            M.m mVar2 = (M.m) bVar.f15c;
            bVar.f15c = mVar;
            B.a aVar = mVar2 != null ? new B.a(bVar, mVar2, 8, false) : null;
            hashMap.put("configurationId", Integer.valueOf(mVar.f318a));
            eVar.g(hashMap, aVar);
            return;
        }
        z2 = false;
        M.n nVar2 = this.f129j.f162o;
        nVar2.getClass();
        hashMap = new HashMap();
        hashMap.put("textScaleFactor", Float.valueOf(getResources().getConfiguration().fontScale));
        DisplayMetrics displayMetrics2 = getResources().getDisplayMetrics();
        hashMap.put("nativeSpellCheckServiceDefined", Boolean.valueOf(z2));
        hashMap.put("brieflyShowPassword", Boolean.valueOf(Settings.System.getInt(getContext().getContentResolver(), "show_password", 1) != 1));
        hashMap.put("alwaysUse24HourFormat", Boolean.valueOf(DateFormat.is24HourFormat(getContext())));
        if (c2 != 1) {
        }
        hashMap.put("platformBrightness", str);
        Objects.toString(hashMap.get("textScaleFactor"));
        Objects.toString(hashMap.get("alwaysUse24HourFormat"));
        Objects.toString(hashMap.get("platformBrightness"));
        if (Build.VERSION.SDK_INT >= 34) {
        }
        eVar = nVar2.f321b;
        if (z3) {
        }
        eVar.g(hashMap, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
            getKeyDispatcherState().startTracking(keyEvent, this);
        } else if (keyEvent.getAction() == 1) {
            getKeyDispatcherState().handleUpEvent(keyEvent);
        }
        return (c() && this.f135p.d(keyEvent)) || super.dispatchKeyEvent(keyEvent);
    }

    public final void e() {
        if (!c()) {
            Log.w("FlutterView", "Tried to send viewport metrics from Android to Flutter but this FlutterView was not attached to a FlutterEngine.");
            return;
        }
        float f2 = getResources().getDisplayMetrics().density;
        io.flutter.embedding.engine.renderer.g gVar = this.u;
        gVar.f549a = f2;
        gVar.f568t = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        io.flutter.embedding.engine.renderer.h hVar = this.f129j.f149b;
        hVar.getClass();
        int i2 = gVar.f550b;
        if (i2 == 0) {
            int i3 = gVar.f552d;
            int i4 = gVar.f553e;
            if (i3 <= 0 && i4 <= 0) {
                return;
            }
        } else {
            int i5 = gVar.f551c;
            if (i5 == 0) {
                int i6 = gVar.f554f;
                int i7 = gVar.f555g;
                if (i6 <= 0 && i7 <= 0) {
                    return;
                }
            } else if (i2 <= 0 || i5 <= 0 || gVar.f549a <= 0.0f) {
                return;
            }
        }
        ArrayList arrayList = gVar.u;
        arrayList.size();
        ArrayList arrayList2 = gVar.f569v;
        arrayList2.size();
        int size = arrayList2.size() + arrayList.size();
        int[] iArr = new int[size * 4];
        int[] iArr2 = new int[size];
        int[] iArr3 = new int[size];
        for (int i8 = 0; i8 < arrayList.size(); i8++) {
            io.flutter.embedding.engine.renderer.a aVar = (io.flutter.embedding.engine.renderer.a) arrayList.get(i8);
            int i9 = i8 * 4;
            Rect rect = aVar.f536a;
            iArr[i9] = rect.left;
            iArr[i9 + 1] = rect.top;
            iArr[i9 + 2] = rect.right;
            iArr[i9 + 3] = rect.bottom;
            iArr2[i8] = AbstractC0077d.a(aVar.f537b);
            iArr3[i8] = AbstractC0077d.a(aVar.f538c);
        }
        int size2 = arrayList.size() * 4;
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            io.flutter.embedding.engine.renderer.a aVar2 = (io.flutter.embedding.engine.renderer.a) arrayList2.get(i10);
            int i11 = (i10 * 4) + size2;
            Rect rect2 = aVar2.f536a;
            iArr[i11] = rect2.left;
            iArr[i11 + 1] = rect2.top;
            iArr[i11 + 2] = rect2.right;
            iArr[i11 + 3] = rect2.bottom;
            iArr2[arrayList.size() + i10] = AbstractC0077d.a(aVar2.f537b);
            iArr3[arrayList.size() + i10] = AbstractC0077d.a(aVar2.f538c);
        }
        hVar.f570a.setViewportMetrics(gVar.f549a, gVar.f550b, gVar.f551c, gVar.f556h, gVar.f557i, gVar.f558j, gVar.f559k, gVar.f560l, gVar.f561m, gVar.f562n, gVar.f563o, gVar.f564p, gVar.f565q, gVar.f566r, gVar.f567s, gVar.f568t, iArr, iArr2, iArr3, gVar.f552d, gVar.f553e, gVar.f554f, gVar.f555g);
    }

    @Override // android.view.View
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        io.flutter.view.h hVar = this.f137r;
        if (hVar == null || !hVar.f780c.isEnabled()) {
            return null;
        }
        return this.f137r;
    }

    public E.c getAttachedFlutterEngine() {
        return this.f129j;
    }

    public N.f getBinaryMessenger() {
        return this.f129j.f150c;
    }

    public C0012m getCurrentImageSurface() {
        return this.f124e;
    }

    public io.flutter.embedding.engine.renderer.g getViewportMetrics() {
        return this.u;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x01b0, code lost:
    
        r1 = r16.getDisplayCutout();
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x013c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        char c2;
        int i2;
        int captionBar;
        List boundingRects;
        Window window;
        DisplayCutout displayCutout;
        List<Rect> boundingRects2;
        int systemBars;
        Insets insets;
        int i3;
        int i4;
        int i5;
        int i6;
        int ime;
        Insets insets2;
        int i7;
        int i8;
        int i9;
        int i10;
        int systemGestures;
        Insets insets3;
        int i11;
        int i12;
        int i13;
        int i14;
        DisplayCutout displayCutout2;
        Insets waterfallInsets;
        int i15;
        int safeInsetTop;
        int i16;
        int safeInsetRight;
        int i17;
        int safeInsetBottom;
        int i18;
        int safeInsetLeft;
        Insets systemGestureInsets;
        int i19;
        int i20;
        int i21;
        int i22;
        WindowInsets onApplyWindowInsets = super.onApplyWindowInsets(windowInsets);
        int i23 = Build.VERSION.SDK_INT;
        io.flutter.embedding.engine.renderer.g gVar = this.u;
        if (i23 == 29) {
            systemGestureInsets = windowInsets.getSystemGestureInsets();
            i19 = systemGestureInsets.top;
            gVar.f564p = i19;
            i20 = systemGestureInsets.right;
            gVar.f565q = i20;
            i21 = systemGestureInsets.bottom;
            gVar.f566r = i21;
            i22 = systemGestureInsets.left;
            gVar.f567s = i22;
        }
        boolean z2 = (getWindowSystemUiVisibility() & 4) == 0;
        boolean z3 = (getWindowSystemUiVisibility() & 2) == 0;
        if (i23 >= 30) {
            systemBars = WindowInsets.Type.systemBars();
            insets = windowInsets.getInsets(systemBars);
            i3 = insets.top;
            gVar.f556h = i3;
            i4 = insets.right;
            gVar.f557i = i4;
            i5 = insets.bottom;
            gVar.f558j = i5;
            i6 = insets.left;
            gVar.f559k = i6;
            ime = WindowInsets.Type.ime();
            insets2 = windowInsets.getInsets(ime);
            i7 = insets2.top;
            gVar.f560l = i7;
            i8 = insets2.right;
            gVar.f561m = i8;
            i9 = insets2.bottom;
            gVar.f562n = i9;
            i10 = insets2.left;
            gVar.f563o = i10;
            systemGestures = WindowInsets.Type.systemGestures();
            insets3 = windowInsets.getInsets(systemGestures);
            i11 = insets3.top;
            gVar.f564p = i11;
            i12 = insets3.right;
            gVar.f565q = i12;
            i13 = insets3.bottom;
            gVar.f566r = i13;
            i14 = insets3.left;
            gVar.f567s = i14;
            displayCutout2 = windowInsets.getDisplayCutout();
            if (displayCutout2 != null) {
                waterfallInsets = displayCutout2.getWaterfallInsets();
                int i24 = gVar.f556h;
                i15 = waterfallInsets.top;
                int max = Math.max(i24, i15);
                safeInsetTop = displayCutout2.getSafeInsetTop();
                gVar.f556h = Math.max(max, safeInsetTop);
                int i25 = gVar.f557i;
                i16 = waterfallInsets.right;
                int max2 = Math.max(i25, i16);
                safeInsetRight = displayCutout2.getSafeInsetRight();
                gVar.f557i = Math.max(max2, safeInsetRight);
                int i26 = gVar.f558j;
                i17 = waterfallInsets.bottom;
                int max3 = Math.max(i26, i17);
                safeInsetBottom = displayCutout2.getSafeInsetBottom();
                gVar.f558j = Math.max(max3, safeInsetBottom);
                int i27 = gVar.f559k;
                i18 = waterfallInsets.left;
                int max4 = Math.max(i27, i18);
                safeInsetLeft = displayCutout2.getSafeInsetLeft();
                gVar.f559k = Math.max(max4, safeInsetLeft);
            }
        } else {
            if (!z3) {
                Context context = getContext();
                if (context.getResources().getConfiguration().orientation == 2) {
                    int rotation = ((DisplayManager) context.getSystemService("display")).getDisplay(0).getRotation();
                    if (rotation == 1) {
                        c2 = 3;
                    } else if (rotation == 3) {
                        c2 = 2;
                    } else if (rotation == 0 || rotation == 2) {
                        c2 = 4;
                    }
                    gVar.f556h = !z2 ? windowInsets.getSystemWindowInsetTop() : 0;
                    gVar.f557i = (c2 != 3 || c2 == 4) ? 0 : windowInsets.getSystemWindowInsetRight();
                    if (z3) {
                        if ((((double) windowInsets.getSystemWindowInsetBottom()) < ((double) getRootView().getHeight()) * 0.18d ? 0 : windowInsets.getSystemWindowInsetBottom()) == 0) {
                            i2 = windowInsets.getSystemWindowInsetBottom();
                            gVar.f558j = i2;
                            gVar.f559k = (c2 != 2 || c2 == 4) ? 0 : windowInsets.getSystemWindowInsetLeft();
                            gVar.f560l = 0;
                            gVar.f561m = 0;
                            gVar.f562n = ((double) windowInsets.getSystemWindowInsetBottom()) < ((double) getRootView().getHeight()) * 0.18d ? 0 : windowInsets.getSystemWindowInsetBottom();
                            gVar.f563o = 0;
                        }
                    }
                    i2 = 0;
                    gVar.f558j = i2;
                    gVar.f559k = (c2 != 2 || c2 == 4) ? 0 : windowInsets.getSystemWindowInsetLeft();
                    gVar.f560l = 0;
                    gVar.f561m = 0;
                    gVar.f562n = ((double) windowInsets.getSystemWindowInsetBottom()) < ((double) getRootView().getHeight()) * 0.18d ? 0 : windowInsets.getSystemWindowInsetBottom();
                    gVar.f563o = 0;
                }
            }
            c2 = 1;
            gVar.f556h = !z2 ? windowInsets.getSystemWindowInsetTop() : 0;
            gVar.f557i = (c2 != 3 || c2 == 4) ? 0 : windowInsets.getSystemWindowInsetRight();
            if (z3) {
            }
            i2 = 0;
            gVar.f558j = i2;
            gVar.f559k = (c2 != 2 || c2 == 4) ? 0 : windowInsets.getSystemWindowInsetLeft();
            gVar.f560l = 0;
            gVar.f561m = 0;
            gVar.f562n = ((double) windowInsets.getSystemWindowInsetBottom()) < ((double) getRootView().getHeight()) * 0.18d ? 0 : windowInsets.getSystemWindowInsetBottom();
            gVar.f563o = 0;
        }
        ArrayList arrayList = new ArrayList();
        if (i23 >= 28 && displayCutout != null) {
            boundingRects2 = displayCutout.getBoundingRects();
            for (Rect rect : boundingRects2) {
                rect.toString();
                arrayList.add(new io.flutter.embedding.engine.renderer.a(rect, 4, 1));
            }
        }
        ArrayList arrayList2 = gVar.f569v;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        if (Build.VERSION.SDK_INT >= 35) {
            A a2 = this.f119C;
            Context context2 = getContext();
            a2.getClass();
            Activity l2 = a.a.l(context2);
            WindowInsets windowInsets2 = null;
            if (l2 != null && (window = l2.getWindow()) != null) {
                windowInsets2 = window.getDecorView().getRootWindowInsets();
            }
            if (windowInsets2 == null) {
                boundingRects = Collections.emptyList();
            } else {
                captionBar = WindowInsets.Type.captionBar();
                boundingRects = windowInsets2.getBoundingRects(captionBar);
            }
            int i28 = gVar.f556h;
            Iterator it = boundingRects.iterator();
            while (it.hasNext()) {
                i28 = Math.max(i28, ((Rect) it.next()).bottom);
            }
            gVar.f556h = i28;
        }
        e();
        return onApplyWindowInsets;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v5, types: [W.i] */
    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        u uVar;
        W.j jVar = W.j.f394b;
        int i2 = 1;
        super.onAttachedToWindow();
        try {
            C0104g c0104g = InterfaceC0105h.f1283a;
            Context context = getContext();
            c0104g.getClass();
            uVar = new u(i2, new B.a(C0104g.a(context)));
        } catch (NoClassDefFoundError unused) {
            uVar = null;
        }
        this.f139t = uVar;
        Activity l2 = a.a.l(getContext());
        u uVar2 = this.f139t;
        if (uVar2 == null || l2 == null) {
            return;
        }
        this.f144z = new C0018t(0, this);
        Context context2 = getContext();
        Executor a2 = Build.VERSION.SDK_INT >= 28 ? AbstractC0038a.a(context2) : new j.a(new Handler(context2.getMainLooper()));
        C0018t c0018t = this.f144z;
        B.a aVar = (B.a) uVar2.f111c;
        e0.h.e(a2, "executor");
        e0.h.e(c0018t, "consumer");
        C0099b c0099b = (C0099b) aVar.f3c;
        c0099b.getClass();
        n0.b bVar = new n0.b(new C0107j(c0099b, l2, null), jVar, -2, 1);
        q0.d dVar = AbstractC0065y.f897a;
        l0.c cVar = p0.p.f1164a;
        if (cVar.k(C0058q.f883c) != null) {
            throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + cVar).toString());
        }
        if (!cVar.equals(jVar)) {
            W.i c2 = cVar.c(jVar);
            if (!e0.h.a(c2, jVar)) {
                bVar = new n0.b(bVar.f1088f, c2, -2, 1);
            }
        }
        B.a aVar2 = (B.a) aVar.f4d;
        aVar2.getClass();
        ReentrantLock reentrantLock = (ReentrantLock) aVar2.f3c;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = (LinkedHashMap) aVar2.f4d;
        try {
            if (linkedHashMap.get(c0018t) == null) {
                k0.F f2 = new k0.F(a2);
                p0.e eVar = new p0.e(f2.k(C0058q.f883c) != null ? f2 : a.a.s(f2, new k0.N(null)));
                C0097a c0097a = new C0097a(bVar, c0018t, null);
                AbstractC0042a y2 = new Y(AbstractC0060t.f(eVar, jVar), true);
                y2.M(1, y2, c0097a);
                linkedHashMap.put(c0018t, y2);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f129j != null) {
            this.f134o.b(configuration);
            d();
            a.a.c(getContext(), this.f129j);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b1  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        int i2;
        int i3;
        int i4;
        if (!c()) {
            return super.onCreateInputConnection(editorInfo);
        }
        io.flutter.plugin.editing.l lVar = this.f132m;
        C.b bVar = this.f135p;
        io.flutter.plugin.editing.k kVar = lVar.f627e;
        int i5 = kVar.f621a;
        if (i5 == 1) {
            lVar.f632j = null;
            return null;
        }
        int i6 = 4;
        if (i5 == 4) {
            return null;
        }
        if (i5 == 3) {
            if (lVar.f638p) {
                return lVar.f632j;
            }
            lVar.f633k.f(kVar.f622b);
            throw null;
        }
        M.o oVar = lVar.f628f;
        M.p pVar = oVar.f328g;
        int i7 = pVar.f335a;
        if (i7 != 2) {
            if (i7 == 5) {
                int i8 = pVar.f336b ? 4098 : 2;
                if (pVar.f337c) {
                    i2 = i8 | 8192;
                    i6 = i2;
                } else {
                    i6 = i8;
                }
            } else if (i7 == 6) {
                i6 = 3;
            } else if (i7 == 11) {
                i6 = 0;
            } else {
                i2 = i7 == 7 ? 131073 : (i7 == 8 || i7 == 13) ? 33 : (i7 == 9 || i7 == 12) ? 17 : i7 == 10 ? 145 : i7 == 3 ? 97 : i7 == 4 ? 113 : 1;
                if (!oVar.f322a) {
                    if (oVar.f323b) {
                        i2 |= 32768;
                    }
                    i4 = oVar.f324c ? 524416 : 524432;
                    i3 = oVar.f327f;
                    if (i3 != 1) {
                        i2 |= 4096;
                    } else if (i3 == 2) {
                        i2 |= 8192;
                    } else if (i3 == 3) {
                        i2 |= 16384;
                    }
                    i6 = i2;
                }
                i2 |= i4;
                i3 = oVar.f327f;
                if (i3 != 1) {
                }
                i6 = i2;
            }
        }
        editorInfo.inputType = i6;
        editorInfo.imeOptions = 33554432;
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 26 && !oVar.f325d) {
            editorInfo.imeOptions = 50331648;
        }
        int intValue = oVar.f329h.intValue();
        M.o oVar2 = lVar.f628f;
        String str = oVar2.f330i;
        if (str != null) {
            editorInfo.actionLabel = str;
            editorInfo.actionId = intValue;
        }
        editorInfo.imeOptions = intValue | editorInfo.imeOptions;
        if (oVar2.f334m != null) {
            editorInfo.hintLocales = new LocaleList(lVar.f628f.f334m);
        }
        String[] strArr = lVar.f628f.f332k;
        if (strArr != null) {
            editorInfo.contentMimeTypes = strArr;
        }
        if (i9 >= 34) {
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            editorInfo.extras.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", true);
        }
        io.flutter.plugin.editing.c cVar = new io.flutter.plugin.editing.c(this, lVar.f627e.f622b, lVar.f626d, bVar, lVar.f630h, editorInfo);
        io.flutter.plugin.editing.f fVar = lVar.f630h;
        fVar.getClass();
        editorInfo.initialSelStart = Selection.getSelectionStart(fVar);
        io.flutter.plugin.editing.f fVar2 = lVar.f630h;
        fVar2.getClass();
        editorInfo.initialSelEnd = Selection.getSelectionEnd(fVar2);
        lVar.f632j = cVar;
        return cVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C0018t c0018t;
        u uVar = this.f139t;
        if (uVar != null && (c0018t = this.f144z) != null) {
            B.a aVar = (B.a) ((B.a) uVar.f111c).f4d;
            aVar.getClass();
            ReentrantLock reentrantLock = (ReentrantLock) aVar.f3c;
            reentrantLock.lock();
            LinkedHashMap linkedHashMap = (LinkedHashMap) aVar.f4d;
            try {
                k0.K k2 = (k0.K) linkedHashMap.get(c0018t);
                if (k2 != null) {
                    k2.a(null);
                }
            } finally {
                reentrantLock.unlock();
            }
        }
        this.f144z = null;
        this.f139t = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (c()) {
            C0001b c0001b = this.f136q;
            Context context = getContext();
            c0001b.getClass();
            boolean isFromSource = motionEvent.isFromSource(2);
            boolean z2 = motionEvent.getActionMasked() == 7 || motionEvent.getActionMasked() == 8;
            if (isFromSource && z2) {
                int b2 = C0001b.b(motionEvent.getActionMasked());
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(motionEvent.getPointerCount() * 288);
                allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
                c0001b.a(motionEvent, motionEvent.getActionIndex(), b2, 0, C0001b.f60f, allocateDirect, context);
                if (allocateDirect.position() % 288 != 0) {
                    throw new AssertionError("Packet position is not on field boundary.");
                }
                c0001b.f61a.f570a.dispatchPointerDataPacket(allocateDirect, allocateDirect.position());
                return true;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        return !c() ? super.onHoverEvent(motionEvent) : this.f137r.e(motionEvent, false);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        this.A = View.MeasureSpec.getMode(i2);
        this.f118B = View.MeasureSpec.getMode(i3);
        super.onMeasure(i2, i3);
    }

    @Override // android.view.View
    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i2) {
        Rect rect;
        super.onProvideAutofillVirtualStructure(viewStructure, i2);
        io.flutter.plugin.editing.l lVar = this.f132m;
        if (Build.VERSION.SDK_INT < 26) {
            lVar.getClass();
            return;
        }
        if (lVar.f629g != null) {
            String str = (String) lVar.f628f.f331j.f7a;
            AutofillId autofillId = viewStructure.getAutofillId();
            for (int i3 = 0; i3 < lVar.f629g.size(); i3++) {
                int keyAt = lVar.f629g.keyAt(i3);
                B.e eVar = ((M.o) lVar.f629g.valueAt(i3)).f331j;
                if (eVar != null) {
                    viewStructure.addChildCount(1);
                    ViewStructure newChild = viewStructure.newChild(i3);
                    newChild.setAutofillId(autofillId, keyAt);
                    String[] strArr = (String[]) eVar.f8b;
                    if (strArr.length > 0) {
                        newChild.setAutofillHints(strArr);
                    }
                    newChild.setAutofillType(1);
                    newChild.setVisibility(0);
                    String str2 = (String) eVar.f10d;
                    if (str2 != null) {
                        newChild.setHint(str2);
                    }
                    if (str.hashCode() != keyAt || (rect = lVar.f635m) == null) {
                        newChild.setDimens(0, 0, 0, 0, 1, 1);
                        newChild.setAutofillValue(AutofillValue.forText(((M.q) eVar.f9c).f338a));
                    } else {
                        newChild.setDimens(rect.left, rect.top, 0, 0, rect.width(), lVar.f635m.height());
                        newChild.setAutofillValue(AutofillValue.forText(lVar.f630h));
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        io.flutter.embedding.engine.renderer.g gVar = this.u;
        gVar.f550b = i2;
        gVar.f551c = i3;
        boolean z2 = this.f121b;
        if (z2 && this.f118B == 0) {
            gVar.f554f = 0;
            gVar.f555g = 8192;
        } else {
            gVar.f554f = i3;
            gVar.f555g = i3;
        }
        if (z2 && this.A == 0) {
            gVar.f552d = 0;
            gVar.f553e = 8192;
        } else {
            gVar.f552d = i2;
            gVar.f553e = i2;
        }
        if (this.f120a.compareAndSet(false, true)) {
            return;
        }
        e();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ByteBuffer byteBuffer;
        ByteBuffer byteBuffer2;
        int i2;
        if (!c()) {
            return super.onTouchEvent(motionEvent);
        }
        requestUnbufferedDispatch(motionEvent);
        C0001b c0001b = this.f136q;
        Matrix matrix = C0001b.f60f;
        c0001b.getClass();
        int actionMasked = motionEvent.getActionMasked();
        int b2 = C0001b.b(motionEvent.getActionMasked());
        char c2 = 5;
        int i3 = 1;
        boolean z2 = actionMasked == 0 || actionMasked == 5;
        boolean z3 = !z2 && (actionMasked == 1 || actionMasked == 6);
        int toolType = motionEvent.getToolType(motionEvent.getActionIndex());
        if (toolType == 1) {
            c2 = 0;
        } else if (toolType == 2) {
            c2 = 2;
        } else if (toolType == 3) {
            c2 = 1;
        } else if (toolType == 4) {
            c2 = 3;
        }
        int i4 = (z3 && c2 == 0) ? 1 : 0;
        int pointerCount = motionEvent.getPointerCount();
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect((pointerCount + i4) * 288);
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        if (z2) {
            c0001b.a(motionEvent, motionEvent.getActionIndex(), b2, 0, matrix, allocateDirect, null);
            byteBuffer = allocateDirect;
        } else {
            ByteBuffer byteBuffer3 = allocateDirect;
            if (z3) {
                int i5 = 0;
                while (i5 < pointerCount) {
                    if (i5 == motionEvent.getActionIndex() || motionEvent.getToolType(i5) != i3) {
                        byteBuffer2 = byteBuffer3;
                        i2 = pointerCount;
                    } else {
                        byteBuffer2 = byteBuffer3;
                        i2 = pointerCount;
                        c0001b.a(motionEvent, i5, 5, 1, matrix, byteBuffer2, null);
                    }
                    i5++;
                    pointerCount = i2;
                    byteBuffer3 = byteBuffer2;
                    i3 = 1;
                }
                byteBuffer = byteBuffer3;
                c0001b.a(motionEvent, motionEvent.getActionIndex(), b2, 0, matrix, byteBuffer, null);
                if (i4 != 0) {
                    c0001b.a(motionEvent, motionEvent.getActionIndex(), 2, 0, matrix, byteBuffer, null);
                }
            } else {
                byteBuffer = byteBuffer3;
                for (int i6 = 0; i6 < pointerCount; i6++) {
                    c0001b.a(motionEvent, i6, b2, (pointerCount << 8) | 2, matrix, byteBuffer, null);
                }
            }
        }
        if (byteBuffer.position() % 288 != 0) {
            throw new AssertionError("Packet position is not on field boundary");
        }
        c0001b.f61a.f570a.dispatchPointerDataPacket(byteBuffer, byteBuffer.position());
        return true;
    }

    public void setDelegate(A a2) {
        this.f119C = a2;
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        View view = this.f125f;
        if (view instanceof C0014o) {
            ((C0014o) view).setVisibility(i2);
        }
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, java.util.List] */
    public void setWindowInfoListenerDisplayFeatures(C0108k c0108k) {
        ?? r8 = c0108k.f1290a;
        ArrayList arrayList = new ArrayList();
        for (C0100c c0100c : r8) {
            c0100c.f1271a.c().toString();
            C0094b c0094b = c0100c.f1271a;
            int b2 = c0094b.b();
            C0099b c0099b = C0099b.f1264e;
            int i2 = 2;
            int i3 = ((b2 == 0 || c0094b.a() == 0) ? C0099b.f1263d : c0099b) == c0099b ? 3 : 2;
            C0099b c0099b2 = C0099b.f1265f;
            C0099b c0099b3 = c0100c.f1273c;
            if (c0099b3 != c0099b2) {
                i2 = c0099b3 == C0099b.f1266g ? 3 : 1;
            }
            arrayList.add(new io.flutter.embedding.engine.renderer.a(c0094b.c(), i3, i2));
        }
        ArrayList arrayList2 = this.u.u;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        e();
    }

    public y(AbstractActivityC0005f abstractActivityC0005f, C0016q c0016q) {
        super(abstractActivityC0005f, null);
        this.f120a = new AtomicBoolean(true);
        this.f121b = false;
        this.f127h = new HashSet();
        this.f130k = new HashSet();
        this.u = new io.flutter.embedding.engine.renderer.g();
        this.f140v = new u(0, this);
        this.f141w = new v(this, new Handler(Looper.getMainLooper()), 0);
        this.f142x = new w(this);
        this.f143y = new C0006g(1, this);
        this.f119C = new A();
        this.f123d = c0016q;
        this.f125f = c0016q;
        b();
    }
}
