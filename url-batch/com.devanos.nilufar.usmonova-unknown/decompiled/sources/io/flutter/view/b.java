package io.flutter.view;

import android.R;
import android.content.ContentResolver;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import com.google.firebase.database.core.ValidationPath;
import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o.AbstractC1862s0;
import o.AccessibilityManagerAccessibilityStateChangeListenerC1994u0;
import o.AccessibilityManagerTouchExplorationStateChangeListenerC2126w0;
import o.C0950e6;
import o.C1334k;
import o.C1928t0;
import o.C2060v0;
import o.C2258y0;
import o.C2324z0;
import o.EnumC2192x0;
import o.InterfaceC2279yI;
import o.Y1;

/* loaded from: classes.dex */
public final class b extends AccessibilityNodeProvider {
    public static final /* synthetic */ int x = 0;
    public final View a;
    public final C0950e6 b;
    public final AccessibilityManager c;
    public final AccessibilityViewEmbedder d;
    public final InterfaceC2279yI e;
    public final ContentResolver f;
    public final HashMap g;
    public final HashMap h;
    public C2324z0 i;
    public Integer j;
    public int k;
    public String l;
    public C2324z0 m;
    public C2324z0 n;

    /* renamed from: o, reason: collision with root package name */
    public C2324z0 f10o;
    public final ArrayList p;
    public int q;
    public Y1 r;
    public boolean s;
    public boolean t;
    public final AccessibilityManagerAccessibilityStateChangeListenerC1994u0 u;
    public final AccessibilityManagerTouchExplorationStateChangeListenerC2126w0 v;
    public final C2060v0 w;

    public b(View view, C0950e6 c0950e6, AccessibilityManager accessibilityManager, ContentResolver contentResolver, InterfaceC2279yI interfaceC2279yI) {
        int i;
        AccessibilityViewEmbedder accessibilityViewEmbedder = new AccessibilityViewEmbedder(view, 65536);
        this.g = new HashMap();
        this.h = new HashMap();
        this.k = 0;
        this.p = new ArrayList();
        this.q = 0;
        this.s = false;
        this.t = false;
        a aVar = new a(this);
        AccessibilityManagerAccessibilityStateChangeListenerC1994u0 accessibilityManagerAccessibilityStateChangeListenerC1994u0 = new AccessibilityManagerAccessibilityStateChangeListenerC1994u0(this);
        this.u = accessibilityManagerAccessibilityStateChangeListenerC1994u0;
        C2060v0 c2060v0 = new C2060v0(this, new Handler(), 0);
        this.w = c2060v0;
        this.a = view;
        this.b = c0950e6;
        this.c = accessibilityManager;
        this.f = contentResolver;
        this.d = accessibilityViewEmbedder;
        this.e = interfaceC2279yI;
        c0950e6.k = aVar;
        ((FlutterJNI) c0950e6.j).setAccessibilityDelegate(aVar);
        accessibilityManagerAccessibilityStateChangeListenerC1994u0.onAccessibilityStateChanged(accessibilityManager.isEnabled());
        accessibilityManager.addAccessibilityStateChangeListener(accessibilityManagerAccessibilityStateChangeListenerC1994u0);
        AccessibilityManagerTouchExplorationStateChangeListenerC2126w0 accessibilityManagerTouchExplorationStateChangeListenerC2126w0 = new AccessibilityManagerTouchExplorationStateChangeListenerC2126w0(this, accessibilityManager);
        this.v = accessibilityManagerTouchExplorationStateChangeListenerC2126w0;
        accessibilityManagerTouchExplorationStateChangeListenerC2126w0.onTouchExplorationStateChanged(accessibilityManager.isTouchExplorationEnabled());
        accessibilityManager.addTouchExplorationStateChangeListener(accessibilityManagerTouchExplorationStateChangeListenerC2126w0);
        this.k |= 128;
        c2060v0.onChange(false, null);
        contentResolver.registerContentObserver(Settings.Global.getUriFor("transition_animation_scale"), false, c2060v0);
        if (Build.VERSION.SDK_INT >= 31 && view != null && view.getResources() != null) {
            i = view.getResources().getConfiguration().fontWeightAdjustment;
            if (i == Integer.MAX_VALUE || i < 300) {
                this.k &= -9;
            } else {
                this.k |= 8;
            }
            ((FlutterJNI) c0950e6.j).setAccessibilityFeatures(this.k);
        }
        interfaceC2279yI.n(this);
    }

    public static String c(ByteBuffer byteBuffer, String[] strArr) {
        int i = byteBuffer.getInt();
        if (i == -1) {
            return null;
        }
        return strArr[i];
    }

    public final C2258y0 a(int i) {
        Integer valueOf = Integer.valueOf(i);
        HashMap hashMap = this.h;
        C2258y0 c2258y0 = (C2258y0) hashMap.get(valueOf);
        if (c2258y0 != null) {
            return c2258y0;
        }
        C2258y0 c2258y02 = new C2258y0();
        c2258y02.c = -1;
        c2258y02.b = i;
        c2258y02.a = 267386881 + i;
        hashMap.put(Integer.valueOf(i), c2258y02);
        return c2258y02;
    }

    public final C2324z0 b(int i) {
        Integer valueOf = Integer.valueOf(i);
        HashMap hashMap = this.g;
        C2324z0 c2324z0 = (C2324z0) hashMap.get(valueOf);
        if (c2324z0 != null) {
            return c2324z0;
        }
        C2324z0 c2324z02 = new C2324z0(this);
        c2324z02.b = i;
        hashMap.put(Integer.valueOf(i), c2324z02);
        return c2324z02;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        boolean g;
        boolean z;
        String str;
        int i2;
        int i3;
        i(true);
        if (i >= 65536) {
            return this.d.createAccessibilityNodeInfo(i);
        }
        HashMap hashMap = this.g;
        View view = this.a;
        if (i == -1) {
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(view);
            view.onInitializeAccessibilityNodeInfo(obtain);
            if (hashMap.containsKey(0)) {
                obtain.addChild(view, 0);
            }
            obtain.setImportantForAccessibility(false);
            return obtain;
        }
        C2324z0 c2324z0 = (C2324z0) hashMap.get(Integer.valueOf(i));
        if (c2324z0 == null) {
            return null;
        }
        int i4 = c2324z0.i;
        InterfaceC2279yI interfaceC2279yI = this.e;
        if (i4 != -1 && interfaceC2279yI.x(i4)) {
            interfaceC2279yI.L(c2324z0.i);
            return null;
        }
        AccessibilityNodeInfo obtain2 = AccessibilityNodeInfo.obtain(view, i);
        obtain2.setImportantForAccessibility((c2324z0.g(12) || (C2324z0.b(c2324z0) == null && c2324z0.d == 0)) ? false : true);
        obtain2.setViewIdResourceName("");
        String str2 = c2324z0.f251o;
        if (str2 != null) {
            obtain2.setViewIdResourceName(str2);
        }
        obtain2.setPackageName(view.getContext().getPackageName());
        obtain2.setClassName("android.view.View");
        obtain2.setSource(view, i);
        obtain2.setFocusable(c2324z0.i());
        C2324z0 c2324z02 = this.m;
        if (c2324z02 != null) {
            obtain2.setFocused(c2324z02.b == i);
        }
        C2324z0 c2324z03 = this.i;
        if (c2324z03 != null) {
            obtain2.setAccessibilityFocused(c2324z03.b == i);
        }
        if (c2324z0.g(5)) {
            obtain2.setPassword(c2324z0.g(11));
            if (!c2324z0.g(21)) {
                obtain2.setClassName("android.widget.EditText");
            }
            obtain2.setEditable(!c2324z0.g(21));
            int i5 = c2324z0.g;
            if (i5 != -1 && (i3 = c2324z0.h) != -1) {
                obtain2.setTextSelection(i5, i3);
            }
            C2324z0 c2324z04 = this.i;
            if (c2324z04 != null && c2324z04.b == i) {
                obtain2.setLiveRegion(1);
            }
            if (C2324z0.a(c2324z0, EnumC2192x0.MOVE_CURSOR_FORWARD_BY_CHARACTER)) {
                obtain2.addAction(256);
                i2 = 1;
            } else {
                i2 = 0;
            }
            if (C2324z0.a(c2324z0, EnumC2192x0.MOVE_CURSOR_BACKWARD_BY_CHARACTER)) {
                obtain2.addAction(512);
                i2 = 1;
            }
            if (C2324z0.a(c2324z0, EnumC2192x0.MOVE_CURSOR_FORWARD_BY_WORD)) {
                obtain2.addAction(256);
                i2 |= 2;
            }
            if (C2324z0.a(c2324z0, EnumC2192x0.MOVE_CURSOR_BACKWARD_BY_WORD)) {
                obtain2.addAction(512);
                i2 |= 2;
            }
            obtain2.setMovementGranularities(i2);
            if (c2324z0.e >= 0) {
                String str3 = c2324z0.r;
                obtain2.setMaxTextLength(((str3 == null ? 0 : str3.length()) - c2324z0.f) + c2324z0.e);
            }
        }
        if (C2324z0.a(c2324z0, EnumC2192x0.SET_SELECTION)) {
            obtain2.addAction(131072);
        }
        if (C2324z0.a(c2324z0, EnumC2192x0.COPY)) {
            obtain2.addAction(16384);
        }
        if (C2324z0.a(c2324z0, EnumC2192x0.CUT)) {
            obtain2.addAction(65536);
        }
        if (C2324z0.a(c2324z0, EnumC2192x0.PASTE)) {
            obtain2.addAction(32768);
        }
        if (C2324z0.a(c2324z0, EnumC2192x0.SET_TEXT)) {
            obtain2.addAction(2097152);
        }
        if (c2324z0.g(4)) {
            g = true;
        } else {
            String str4 = c2324z0.A;
            g = (str4 == null || str4.isEmpty()) ? c2324z0.g(23) : false;
        }
        if (g) {
            obtain2.setClassName("android.widget.Button");
        }
        if (c2324z0.g(15)) {
            obtain2.setClassName("android.widget.ImageView");
        }
        if (C2324z0.a(c2324z0, EnumC2192x0.DISMISS)) {
            obtain2.setDismissable(true);
            obtain2.addAction(1048576);
        }
        C2324z0 c2324z05 = c2324z0.S;
        if (c2324z05 != null) {
            obtain2.setParent(view, c2324z05.b);
        } else {
            obtain2.setParent(view);
        }
        int i6 = c2324z0.D;
        if (i6 != -1) {
            obtain2.setTraversalAfter(view, i6);
        }
        Rect rect = c2324z0.c0;
        C2324z0 c2324z06 = c2324z0.S;
        if (c2324z06 != null) {
            Rect rect2 = c2324z06.c0;
            Rect rect3 = new Rect(rect);
            rect3.offset(-rect2.left, -rect2.top);
            obtain2.setBoundsInParent(rect3);
        } else {
            obtain2.setBoundsInParent(rect);
        }
        Rect rect4 = new Rect(rect);
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        rect4.offset(iArr[0], iArr[1]);
        obtain2.setBoundsInScreen(rect4);
        obtain2.setVisibleToUser(true);
        obtain2.setEnabled(!c2324z0.g(7) || c2324z0.g(8));
        if (C2324z0.a(c2324z0, EnumC2192x0.TAP)) {
            if (c2324z0.W != null) {
                obtain2.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, c2324z0.W.e));
                obtain2.setClickable(true);
            } else {
                obtain2.addAction(16);
                obtain2.setClickable(true);
            }
        } else if (c2324z0.g(24)) {
            obtain2.addAction(16);
            obtain2.setClickable(true);
        }
        if (C2324z0.a(c2324z0, EnumC2192x0.LONG_PRESS)) {
            if (c2324z0.X != null) {
                obtain2.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, c2324z0.X.e));
                obtain2.setLongClickable(true);
            } else {
                obtain2.addAction(32);
                obtain2.setLongClickable(true);
            }
        }
        EnumC2192x0 enumC2192x0 = EnumC2192x0.SCROLL_LEFT;
        boolean a = C2324z0.a(c2324z0, enumC2192x0);
        EnumC2192x0 enumC2192x02 = EnumC2192x0.SCROLL_DOWN;
        EnumC2192x0 enumC2192x03 = EnumC2192x0.SCROLL_UP;
        EnumC2192x0 enumC2192x04 = EnumC2192x0.SCROLL_RIGHT;
        if (a || C2324z0.a(c2324z0, enumC2192x03) || C2324z0.a(c2324z0, enumC2192x04) || C2324z0.a(c2324z0, enumC2192x02)) {
            obtain2.setScrollable(true);
            if (c2324z0.g(19)) {
                if (C2324z0.a(c2324z0, enumC2192x0) || C2324z0.a(c2324z0, enumC2192x04)) {
                    obtain2.setClassName("android.widget.HorizontalScrollView");
                } else {
                    obtain2.setClassName("android.widget.ScrollView");
                }
            }
        }
        if (j(c2324z0)) {
            if (C2324z0.a(c2324z0, enumC2192x0) || C2324z0.a(c2324z0, enumC2192x04)) {
                if (Build.VERSION.SDK_INT < 33) {
                    obtain2.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, c2324z0.j, false));
                } else {
                    obtain2.setCollectionInfo(AbstractC1862s0.v(c2324z0.j));
                }
            } else if (Build.VERSION.SDK_INT < 33) {
                obtain2.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(c2324z0.j, 1, false));
            } else {
                obtain2.setCollectionInfo(AbstractC1862s0.l(c2324z0.j));
            }
        }
        C2324z0 c2324z07 = c2324z0.S;
        if (c2324z07 != null && j(c2324z07) && c2324z0.S.g(19)) {
            C2324z0 c2324z08 = c2324z0.S;
            ArrayList arrayList = c2324z08.T;
            boolean z2 = (C2324z0.a(c2324z08, enumC2192x0) || C2324z0.a(c2324z08, enumC2192x04)) ? false : true;
            int indexOf = arrayList.indexOf(c2324z0);
            if (z2) {
                if (Build.VERSION.SDK_INT < 33) {
                    obtain2.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(indexOf, 1, 0, 1, c2324z0.g(10)));
                } else {
                    obtain2.setCollectionItemInfo(AbstractC1862s0.m(indexOf, c2324z0.g(10)));
                }
            } else if (Build.VERSION.SDK_INT < 33) {
                obtain2.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, indexOf, 1, c2324z0.g(10)));
            } else {
                obtain2.setCollectionItemInfo(AbstractC1862s0.w(indexOf, c2324z0.g(10)));
            }
        }
        if (C2324z0.a(c2324z0, enumC2192x0) || C2324z0.a(c2324z0, enumC2192x03)) {
            obtain2.addAction(4096);
        }
        if (C2324z0.a(c2324z0, enumC2192x04) || C2324z0.a(c2324z0, enumC2192x02)) {
            obtain2.addAction(8192);
        }
        EnumC2192x0 enumC2192x05 = EnumC2192x0.INCREASE;
        boolean a2 = C2324z0.a(c2324z0, enumC2192x05);
        EnumC2192x0 enumC2192x06 = EnumC2192x0.DECREASE;
        if (a2 || C2324z0.a(c2324z0, enumC2192x06)) {
            obtain2.setClassName("android.widget.SeekBar");
            if (C2324z0.a(c2324z0, enumC2192x05)) {
                obtain2.addAction(4096);
            }
            if (C2324z0.a(c2324z0, enumC2192x06)) {
                obtain2.addAction(8192);
            }
        }
        int i7 = 1;
        if (c2324z0.g(16)) {
            obtain2.setLiveRegion(1);
        }
        if (c2324z0.g(5)) {
            C1334k c1334k = new C1334k(i7, false);
            c1334k.i = c2324z0.r;
            c1334k.j = c2324z0.s;
            c1334k.k = c2324z0.d();
            obtain2.setText(c1334k.d());
            if (Build.VERSION.SDK_INT >= 28) {
                boolean z3 = false;
                int i8 = 1;
                C1334k c1334k2 = new C1334k(i8, z3);
                c1334k2.i = c2324z0.p;
                c1334k2.j = c2324z0.q;
                c1334k2.l = c2324z0.A;
                c1334k2.k = c2324z0.d();
                SpannableString d = c1334k2.d();
                C1334k c1334k3 = new C1334k(i8, z3);
                c1334k3.i = c2324z0.x;
                c1334k3.j = c2324z0.y;
                c1334k3.k = c2324z0.d();
                CharSequence[] charSequenceArr = {d, c1334k3.d()};
                int i9 = 0;
                CharSequence charSequence = null;
                for (int i10 = 2; i9 < i10; i10 = 2) {
                    CharSequence charSequence2 = charSequenceArr[i9];
                    if (charSequence2 != null && charSequence2.length() > 0) {
                        if (charSequence != null && charSequence.length() != 0) {
                            charSequence2 = TextUtils.concat(charSequence, ", ", charSequence2);
                        }
                        charSequence = charSequence2;
                    }
                    i9++;
                }
                z = false;
                obtain2.setHintText(charSequence);
            } else {
                z = false;
            }
        } else {
            z = false;
            if (!c2324z0.g(12)) {
                CharSequence b = C2324z0.b(c2324z0);
                if (Build.VERSION.SDK_INT < 28 && c2324z0.z != null) {
                    b = ((Object) (b != null ? b : "")) + "\n" + c2324z0.z;
                }
                if (b != null) {
                    obtain2.setContentDescription(b);
                }
            }
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 28 && (str = c2324z0.z) != null) {
            obtain2.setTooltipText(str);
            if (C2324z0.b(c2324z0) == null) {
                obtain2.setContentDescription(c2324z0.z);
            }
        }
        boolean g2 = c2324z0.g(1);
        boolean g3 = c2324z0.g(17);
        obtain2.setCheckable((g2 || g3) ? true : z);
        if (g2) {
            obtain2.setChecked(c2324z0.g(2));
            if (c2324z0.g(9)) {
                obtain2.setClassName("android.widget.RadioButton");
            } else {
                obtain2.setClassName("android.widget.CheckBox");
            }
        } else if (g3) {
            obtain2.setChecked(c2324z0.g(18));
            obtain2.setClassName("android.widget.Switch");
        }
        obtain2.setSelected(c2324z0.g(3));
        if (i11 >= 36 && c2324z0.g(27)) {
            obtain2.setExpandedState(c2324z0.g(28) ? 3 : 1);
            if (C2324z0.a(c2324z0, EnumC2192x0.EXPAND)) {
                obtain2.addAction(262144);
            }
            if (C2324z0.a(c2324z0, EnumC2192x0.COLLAPSE)) {
                obtain2.addAction(524288);
            }
        }
        if (i11 >= 28) {
            obtain2.setHeading(c2324z0.C > 0 ? true : z);
        }
        C2324z0 c2324z09 = this.i;
        if (c2324z09 == null || c2324z09.b != i) {
            obtain2.addAction(64);
        } else {
            obtain2.addAction(128);
        }
        ArrayList arrayList2 = c2324z0.V;
        if (arrayList2 != null) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                C2258y0 c2258y0 = (C2258y0) it.next();
                obtain2.addAction(new AccessibilityNodeInfo.AccessibilityAction(c2258y0.a, c2258y0.d));
            }
        }
        Iterator it2 = c2324z0.T.iterator();
        while (it2.hasNext()) {
            C2324z0 c2324z010 = (C2324z0) it2.next();
            if (!c2324z010.g(14)) {
                int i12 = c2324z010.i;
                if (i12 != -1) {
                    interfaceC2279yI.L(i12);
                    interfaceC2279yI.x(c2324z010.i);
                }
                obtain2.addChild(view, c2324z010.b);
            }
        }
        return obtain2;
    }

    public final AccessibilityEvent d(int i, int i2) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
        View view = this.a;
        obtain.setPackageName(view.getContext().getPackageName());
        obtain.setSource(view, i);
        return obtain;
    }

    public final boolean e(MotionEvent motionEvent, boolean z) {
        C2324z0 h;
        if (this.c.isTouchExplorationEnabled()) {
            HashMap hashMap = this.g;
            if (!hashMap.isEmpty()) {
                C2324z0 h2 = ((C2324z0) hashMap.get(0)).h(new float[]{motionEvent.getX(), motionEvent.getY(), 0.0f, 1.0f}, z);
                if (h2 == null || h2.i == -1) {
                    if (motionEvent.getAction() == 9 || motionEvent.getAction() == 7) {
                        float x2 = motionEvent.getX();
                        float y = motionEvent.getY();
                        if (!hashMap.isEmpty() && (h = ((C2324z0) hashMap.get(0)).h(new float[]{x2, y, 0.0f, 1.0f}, z)) != this.f10o) {
                            if (h != null) {
                                g(h.b, 128);
                            }
                            C2324z0 c2324z0 = this.f10o;
                            if (c2324z0 != null) {
                                g(c2324z0.b, 256);
                            }
                            this.f10o = h;
                        }
                    } else {
                        if (motionEvent.getAction() != 10) {
                            motionEvent.toString();
                            return false;
                        }
                        C2324z0 c2324z02 = this.f10o;
                        if (c2324z02 != null) {
                            g(c2324z02.b, 256);
                            this.f10o = null;
                        }
                    }
                    return true;
                }
                if (!z) {
                    return this.d.onAccessibilityHoverEvent(h2.b, motionEvent);
                }
            }
        }
        return false;
    }

    public final boolean f(C2324z0 c2324z0, int i, Bundle bundle, boolean z) {
        int i2;
        int i3 = bundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
        boolean z2 = bundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
        int i4 = c2324z0.g;
        int i5 = c2324z0.h;
        if (i5 >= 0 && i4 >= 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 4) {
                        if (i3 == 8 || i3 == 16) {
                            if (z) {
                                c2324z0.h = c2324z0.r.length();
                            } else {
                                c2324z0.h = 0;
                            }
                        }
                    } else if (z && i5 < c2324z0.r.length()) {
                        Matcher matcher = Pattern.compile("(?!^)(\\n)").matcher(c2324z0.r.substring(c2324z0.h));
                        if (matcher.find()) {
                            c2324z0.h += matcher.start(1);
                        } else {
                            c2324z0.h = c2324z0.r.length();
                        }
                    } else if (!z && c2324z0.h > 0) {
                        Matcher matcher2 = Pattern.compile("(?s:.*)(\\n)").matcher(c2324z0.r.substring(0, c2324z0.h));
                        if (matcher2.find()) {
                            c2324z0.h = matcher2.start(1);
                        } else {
                            c2324z0.h = 0;
                        }
                    }
                } else if (z && i5 < c2324z0.r.length()) {
                    Matcher matcher3 = Pattern.compile("\\p{L}(\\b)").matcher(c2324z0.r.substring(c2324z0.h));
                    matcher3.find();
                    if (matcher3.find()) {
                        c2324z0.h += matcher3.start(1);
                    } else {
                        c2324z0.h = c2324z0.r.length();
                    }
                } else if (!z && c2324z0.h > 0) {
                    Matcher matcher4 = Pattern.compile("(?s:.*)(\\b)\\p{L}").matcher(c2324z0.r.substring(0, c2324z0.h));
                    if (matcher4.find()) {
                        c2324z0.h = matcher4.start(1);
                    }
                }
            } else if (z && i5 < c2324z0.r.length()) {
                c2324z0.h++;
            } else if (!z && (i2 = c2324z0.h) > 0) {
                c2324z0.h = i2 - 1;
            }
            if (!z2) {
                c2324z0.g = c2324z0.h;
            }
        }
        if (i4 != c2324z0.g || i5 != c2324z0.h) {
            String str = c2324z0.r;
            if (str == null) {
                str = "";
            }
            AccessibilityEvent d = d(c2324z0.b, 8192);
            d.getText().add(str);
            d.setFromIndex(c2324z0.g);
            d.setToIndex(c2324z0.h);
            d.setItemCount(str.length());
            h(d);
        }
        C0950e6 c0950e6 = this.b;
        if (i3 == 1) {
            if (z) {
                EnumC2192x0 enumC2192x0 = EnumC2192x0.MOVE_CURSOR_FORWARD_BY_CHARACTER;
                if (C2324z0.a(c2324z0, enumC2192x0)) {
                    c0950e6.t(i, enumC2192x0, Boolean.valueOf(z2));
                    return true;
                }
            }
            if (!z) {
                EnumC2192x0 enumC2192x02 = EnumC2192x0.MOVE_CURSOR_BACKWARD_BY_CHARACTER;
                if (C2324z0.a(c2324z0, enumC2192x02)) {
                    c0950e6.t(i, enumC2192x02, Boolean.valueOf(z2));
                    return true;
                }
            }
        } else if (i3 == 2) {
            if (z) {
                EnumC2192x0 enumC2192x03 = EnumC2192x0.MOVE_CURSOR_FORWARD_BY_WORD;
                if (C2324z0.a(c2324z0, enumC2192x03)) {
                    c0950e6.t(i, enumC2192x03, Boolean.valueOf(z2));
                    return true;
                }
            }
            if (!z) {
                EnumC2192x0 enumC2192x04 = EnumC2192x0.MOVE_CURSOR_BACKWARD_BY_WORD;
                if (C2324z0.a(c2324z0, enumC2192x04)) {
                    c0950e6.t(i, enumC2192x04, Boolean.valueOf(z2));
                    return true;
                }
            }
        } else if (i3 == 4 || i3 == 8 || i3 == 16) {
            return true;
        }
        return false;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i) {
        if (i == 1) {
            C2324z0 c2324z0 = this.m;
            if (c2324z0 != null) {
                return createAccessibilityNodeInfo(c2324z0.b);
            }
        } else if (i != 2) {
            return null;
        }
        C2324z0 c2324z02 = this.i;
        if (c2324z02 != null) {
            return createAccessibilityNodeInfo(c2324z02.b);
        }
        Integer num = this.j;
        if (num != null) {
            return createAccessibilityNodeInfo(num.intValue());
        }
        return null;
    }

    public final void g(int i, int i2) {
        if (this.c.isEnabled()) {
            h(d(i, i2));
        }
    }

    public final void h(AccessibilityEvent accessibilityEvent) {
        if (this.c.isEnabled()) {
            View view = this.a;
            view.getParent().requestSendAccessibilityEvent(view, accessibilityEvent);
        }
    }

    public final void i(boolean z) {
        if (this.s == z) {
            return;
        }
        this.s = z;
        if (z) {
            this.k |= 1;
        } else {
            this.k &= -2;
        }
        ((FlutterJNI) this.b.j).setAccessibilityFeatures(this.k);
    }

    public final boolean j(C2324z0 c2324z0) {
        if (c2324z0.j > 1) {
            C2324z0 c2324z02 = this.i;
            C2324z0 c2324z03 = null;
            if (c2324z02 != null) {
                C2324z0 c2324z04 = c2324z02.S;
                while (true) {
                    if (c2324z04 == null) {
                        c2324z04 = null;
                        break;
                    }
                    if (c2324z04 == c2324z0) {
                        break;
                    }
                    c2324z04 = c2324z04.S;
                }
                if (c2324z04 != null) {
                    return true;
                }
            }
            C2324z0 c2324z05 = this.i;
            C1928t0 c1928t0 = new C1928t0();
            if (c2324z05 != null) {
                C2324z0 c2324z06 = c2324z05.S;
                while (true) {
                    if (c2324z06 == null) {
                        break;
                    }
                    if (c1928t0.test(c2324z06)) {
                        c2324z03 = c2324z06;
                        break;
                    }
                    c2324z06 = c2324z06.S;
                }
                if (c2324z03 != null) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i, int i2, Bundle bundle) {
        if (i >= 65536) {
            boolean performAction = this.d.performAction(i, i2, bundle);
            if (performAction && i2 == 128) {
                this.j = null;
            }
            return performAction;
        }
        Integer valueOf = Integer.valueOf(i);
        HashMap hashMap = this.g;
        C2324z0 c2324z0 = (C2324z0) hashMap.get(valueOf);
        if (c2324z0 != null) {
            EnumC2192x0 enumC2192x0 = EnumC2192x0.INCREASE;
            EnumC2192x0 enumC2192x02 = EnumC2192x0.DECREASE;
            C0950e6 c0950e6 = this.b;
            switch (i2) {
                case 16:
                    c0950e6.s(i, EnumC2192x0.TAP);
                    return true;
                case ValidationPath.MAX_PATH_DEPTH /* 32 */:
                    c0950e6.s(i, EnumC2192x0.LONG_PRESS);
                    return true;
                case 64:
                    if (this.i == null) {
                        this.a.invalidate();
                    }
                    this.i = c2324z0;
                    c0950e6.s(i, EnumC2192x0.DID_GAIN_ACCESSIBILITY_FOCUS);
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("type", "didGainFocus");
                    hashMap2.put("nodeId", Integer.valueOf(c2324z0.b));
                    ((C0950e6) c0950e6.i).M(hashMap2, null);
                    g(i, 32768);
                    if (!C2324z0.a(c2324z0, enumC2192x0) && !C2324z0.a(c2324z0, enumC2192x02)) {
                        return true;
                    }
                    g(i, 4);
                    return true;
                case 128:
                    C2324z0 c2324z02 = this.i;
                    if (c2324z02 != null && c2324z02.b == i) {
                        this.i = null;
                    }
                    Integer num = this.j;
                    if (num != null && num.intValue() == i) {
                        this.j = null;
                    }
                    c0950e6.s(i, EnumC2192x0.DID_LOSE_ACCESSIBILITY_FOCUS);
                    g(i, 65536);
                    return true;
                case 256:
                    return f(c2324z0, i, bundle, true);
                case 512:
                    return f(c2324z0, i, bundle, false);
                case 4096:
                    EnumC2192x0 enumC2192x03 = EnumC2192x0.SCROLL_UP;
                    if (C2324z0.a(c2324z0, enumC2192x03)) {
                        c0950e6.s(i, enumC2192x03);
                        return true;
                    }
                    EnumC2192x0 enumC2192x04 = EnumC2192x0.SCROLL_LEFT;
                    if (C2324z0.a(c2324z0, enumC2192x04)) {
                        c0950e6.s(i, enumC2192x04);
                        return true;
                    }
                    if (C2324z0.a(c2324z0, enumC2192x0)) {
                        c2324z0.r = c2324z0.t;
                        c2324z0.s = c2324z0.u;
                        g(i, 4);
                        c0950e6.s(i, enumC2192x0);
                        return true;
                    }
                    break;
                case 8192:
                    EnumC2192x0 enumC2192x05 = EnumC2192x0.SCROLL_DOWN;
                    if (C2324z0.a(c2324z0, enumC2192x05)) {
                        c0950e6.s(i, enumC2192x05);
                        return true;
                    }
                    EnumC2192x0 enumC2192x06 = EnumC2192x0.SCROLL_RIGHT;
                    if (C2324z0.a(c2324z0, enumC2192x06)) {
                        c0950e6.s(i, enumC2192x06);
                        return true;
                    }
                    if (C2324z0.a(c2324z0, enumC2192x02)) {
                        c2324z0.r = c2324z0.v;
                        c2324z0.s = c2324z0.w;
                        g(i, 4);
                        c0950e6.s(i, enumC2192x02);
                        return true;
                    }
                    break;
                case 16384:
                    c0950e6.s(i, EnumC2192x0.COPY);
                    return true;
                case 32768:
                    c0950e6.s(i, EnumC2192x0.PASTE);
                    return true;
                case 65536:
                    c0950e6.s(i, EnumC2192x0.CUT);
                    return true;
                case 131072:
                    HashMap hashMap3 = new HashMap();
                    if (bundle != null && bundle.containsKey("ACTION_ARGUMENT_SELECTION_START_INT") && bundle.containsKey("ACTION_ARGUMENT_SELECTION_END_INT")) {
                        hashMap3.put("base", Integer.valueOf(bundle.getInt("ACTION_ARGUMENT_SELECTION_START_INT")));
                        hashMap3.put("extent", Integer.valueOf(bundle.getInt("ACTION_ARGUMENT_SELECTION_END_INT")));
                    } else {
                        hashMap3.put("base", Integer.valueOf(c2324z0.h));
                        hashMap3.put("extent", Integer.valueOf(c2324z0.h));
                    }
                    c0950e6.t(i, EnumC2192x0.SET_SELECTION, hashMap3);
                    C2324z0 c2324z03 = (C2324z0) hashMap.get(Integer.valueOf(i));
                    c2324z03.g = ((Integer) hashMap3.get("base")).intValue();
                    c2324z03.h = ((Integer) hashMap3.get("extent")).intValue();
                    return true;
                case 262144:
                    c0950e6.s(i, EnumC2192x0.EXPAND);
                    return true;
                case 524288:
                    c0950e6.s(i, EnumC2192x0.COLLAPSE);
                    return true;
                case 1048576:
                    c0950e6.s(i, EnumC2192x0.DISMISS);
                    return true;
                case 2097152:
                    String string = (bundle == null || !bundle.containsKey("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE")) ? "" : bundle.getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE");
                    c0950e6.t(i, EnumC2192x0.SET_TEXT, string);
                    c2324z0.r = string;
                    c2324z0.s = null;
                    return true;
                case R.id.accessibilityActionShowOnScreen:
                    c0950e6.s(i, EnumC2192x0.SHOW_ON_SCREEN);
                    return true;
                default:
                    C2258y0 c2258y0 = (C2258y0) this.h.get(Integer.valueOf(i2 - 267386881));
                    if (c2258y0 != null) {
                        c0950e6.t(i, EnumC2192x0.CUSTOM_ACTION, Integer.valueOf(c2258y0.b));
                        return true;
                    }
                    break;
            }
        }
        return false;
    }
}
