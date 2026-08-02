package io.flutter.view;

import D.AbstractC0009j;
import D.u;
import D.v;
import D.y;
import android.R;
import android.content.ContentResolver;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class h extends AccessibilityNodeProvider {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f777x = 0;

    /* renamed from: a, reason: collision with root package name */
    public final y f778a;

    /* renamed from: b, reason: collision with root package name */
    public final C.b f779b;

    /* renamed from: c, reason: collision with root package name */
    public final AccessibilityManager f780c;

    /* renamed from: d, reason: collision with root package name */
    public final AccessibilityViewEmbedder f781d;

    /* renamed from: e, reason: collision with root package name */
    public final io.flutter.plugin.platform.i f782e;

    /* renamed from: f, reason: collision with root package name */
    public final ContentResolver f783f;

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f784g;

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f785h;

    /* renamed from: i, reason: collision with root package name */
    public g f786i;

    /* renamed from: j, reason: collision with root package name */
    public Integer f787j;

    /* renamed from: k, reason: collision with root package name */
    public int f788k;

    /* renamed from: l, reason: collision with root package name */
    public String f789l;

    /* renamed from: m, reason: collision with root package name */
    public g f790m;

    /* renamed from: n, reason: collision with root package name */
    public g f791n;

    /* renamed from: o, reason: collision with root package name */
    public g f792o;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f793p;

    /* renamed from: q, reason: collision with root package name */
    public int f794q;

    /* renamed from: r, reason: collision with root package name */
    public u f795r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f796s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f797t;
    public final c u;

    /* renamed from: v, reason: collision with root package name */
    public final d f798v;

    /* renamed from: w, reason: collision with root package name */
    public final v f799w;

    public h(y yVar, C.b bVar, AccessibilityManager accessibilityManager, ContentResolver contentResolver, io.flutter.plugin.platform.i iVar) {
        int i2;
        AccessibilityViewEmbedder accessibilityViewEmbedder = new AccessibilityViewEmbedder(yVar, 65536);
        this.f784g = new HashMap();
        this.f785h = new HashMap();
        this.f788k = 0;
        this.f793p = new ArrayList();
        this.f794q = 0;
        this.f796s = false;
        this.f797t = false;
        b bVar2 = new b(this);
        c cVar = new c(this);
        this.u = cVar;
        v vVar = new v(this, new Handler(), 1);
        this.f799w = vVar;
        this.f778a = yVar;
        this.f779b = bVar;
        this.f780c = accessibilityManager;
        this.f783f = contentResolver;
        this.f781d = accessibilityViewEmbedder;
        this.f782e = iVar;
        bVar.f15c = bVar2;
        ((FlutterJNI) bVar.f14b).setAccessibilityDelegate(bVar2);
        cVar.onAccessibilityStateChanged(accessibilityManager.isEnabled());
        accessibilityManager.addAccessibilityStateChangeListener(cVar);
        d dVar = new d(this, accessibilityManager);
        this.f798v = dVar;
        dVar.onTouchExplorationStateChanged(accessibilityManager.isTouchExplorationEnabled());
        accessibilityManager.addTouchExplorationStateChangeListener(dVar);
        this.f788k |= 128;
        vVar.onChange(false, null);
        contentResolver.registerContentObserver(Settings.Global.getUriFor("transition_animation_scale"), false, vVar);
        if (Build.VERSION.SDK_INT >= 31 && yVar != null && yVar.getResources() != null) {
            i2 = yVar.getResources().getConfiguration().fontWeightAdjustment;
            if (i2 == Integer.MAX_VALUE || i2 < 300) {
                this.f788k &= -9;
            } else {
                this.f788k |= 8;
            }
            ((FlutterJNI) bVar.f14b).setAccessibilityFeatures(this.f788k);
        }
        iVar.d(this);
    }

    public static String c(ByteBuffer byteBuffer, String[] strArr) {
        int i2 = byteBuffer.getInt();
        if (i2 == -1) {
            return null;
        }
        return strArr[i2];
    }

    public final f a(int i2) {
        HashMap hashMap = this.f785h;
        f fVar = (f) hashMap.get(Integer.valueOf(i2));
        if (fVar != null) {
            return fVar;
        }
        f fVar2 = new f();
        fVar2.f725c = -1;
        fVar2.f724b = i2;
        fVar2.f723a = 267386881 + i2;
        hashMap.put(Integer.valueOf(i2), fVar2);
        return fVar2;
    }

    public final g b(int i2) {
        HashMap hashMap = this.f784g;
        g gVar = (g) hashMap.get(Integer.valueOf(i2));
        if (gVar != null) {
            return gVar;
        }
        g gVar2 = new g(this);
        gVar2.f752b = i2;
        hashMap.put(Integer.valueOf(i2), gVar2);
        return gVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x04fd  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x050d  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0524  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0557  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0276  */
    @Override // android.view.accessibility.AccessibilityNodeProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i2) {
        int i3;
        String str;
        boolean G2;
        boolean E2;
        boolean E3;
        g gVar;
        int i4;
        g gVar2;
        boolean E4;
        boolean z2;
        boolean E5;
        e eVar;
        boolean k2;
        e eVar2;
        boolean E6;
        g gVar3;
        e eVar3;
        boolean k3;
        e eVar4;
        boolean E7;
        boolean E8;
        boolean E9;
        String str2;
        String str3;
        int i5;
        boolean E10;
        boolean E11;
        boolean E12;
        boolean E13;
        g gVar4;
        ArrayList arrayList;
        ArrayList arrayList2;
        Iterator it;
        boolean E14;
        int i6;
        int i7;
        int i8;
        int i9;
        ArrayList arrayList3;
        int i10;
        String str4;
        int i11;
        int i12;
        boolean E15;
        boolean E16;
        boolean E17;
        boolean E18;
        String str5;
        String str6;
        String str7;
        g gVar5;
        ArrayList arrayList4;
        boolean z3;
        boolean E19;
        boolean E20;
        boolean E21;
        boolean E22;
        int i13;
        int i14;
        int i15;
        int i16;
        f fVar;
        f fVar2;
        String str8;
        f fVar3;
        f fVar4;
        String str9;
        boolean E23;
        g gVar6;
        int i17;
        g gVar7;
        int i18;
        boolean E24;
        boolean E25;
        boolean E26;
        int i19;
        int i20;
        int i21;
        String str10;
        String str11;
        int length;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        String str12;
        int i30;
        int i31;
        i(true);
        if (i2 >= 65536) {
            return this.f781d.createAccessibilityNodeInfo(i2);
        }
        HashMap hashMap = this.f784g;
        View view = this.f778a;
        boolean z4 = false;
        if (i2 == -1) {
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(view);
            view.onInitializeAccessibilityNodeInfo(obtain);
            if (hashMap.containsKey(0)) {
                obtain.addChild(view, 0);
            }
            obtain.setImportantForAccessibility(false);
            return obtain;
        }
        g gVar8 = (g) hashMap.get(Integer.valueOf(i2));
        if (gVar8 == null) {
            return null;
        }
        i3 = gVar8.f760i;
        io.flutter.plugin.platform.i iVar = this.f782e;
        if (i3 != -1) {
            i30 = gVar8.f760i;
            if (iVar.h(i30)) {
                i31 = gVar8.f760i;
                iVar.f(i31);
                return null;
            }
        }
        AccessibilityNodeInfo obtain2 = AccessibilityNodeInfo.obtain(view, i2);
        obtain2.setImportantForAccessibility((gVar8.E(12) || (g.v(gVar8) == null && gVar8.f755d == 0)) ? false : true);
        obtain2.setViewIdResourceName("");
        str = gVar8.f766o;
        if (str != null) {
            str12 = gVar8.f766o;
            obtain2.setViewIdResourceName(str12);
        }
        obtain2.setPackageName(view.getContext().getPackageName());
        obtain2.setClassName("android.view.View");
        obtain2.setSource(view, i2);
        G2 = gVar8.G();
        obtain2.setFocusable(G2);
        g gVar9 = this.f790m;
        if (gVar9 != null) {
            i29 = gVar9.f752b;
            obtain2.setFocused(i29 == i2);
        }
        g gVar10 = this.f786i;
        if (gVar10 != null) {
            i28 = gVar10.f752b;
            obtain2.setAccessibilityFocused(i28 == i2);
        }
        E2 = gVar8.E(5);
        if (E2) {
            E24 = gVar8.E(11);
            obtain2.setPassword(E24);
            E25 = gVar8.E(21);
            if (!E25) {
                obtain2.setClassName("android.widget.EditText");
            }
            E26 = gVar8.E(21);
            obtain2.setEditable(!E26);
            i19 = gVar8.f758g;
            if (i19 != -1) {
                i25 = gVar8.f759h;
                if (i25 != -1) {
                    i26 = gVar8.f758g;
                    i27 = gVar8.f759h;
                    obtain2.setTextSelection(i26, i27);
                }
            }
            g gVar11 = this.f786i;
            if (gVar11 != null) {
                i24 = gVar11.f752b;
                if (i24 == i2) {
                    obtain2.setLiveRegion(1);
                }
            }
            if (g.k(gVar8, e.MOVE_CURSOR_FORWARD_BY_CHARACTER)) {
                obtain2.addAction(256);
                i20 = 1;
            } else {
                i20 = 0;
            }
            if (g.k(gVar8, e.MOVE_CURSOR_BACKWARD_BY_CHARACTER)) {
                obtain2.addAction(512);
                i20 = 1;
            }
            if (g.k(gVar8, e.MOVE_CURSOR_FORWARD_BY_WORD)) {
                obtain2.addAction(256);
                i20 |= 2;
            }
            if (g.k(gVar8, e.MOVE_CURSOR_BACKWARD_BY_WORD)) {
                obtain2.addAction(512);
                i20 |= 2;
            }
            obtain2.setMovementGranularities(i20);
            i21 = gVar8.f756e;
            if (i21 >= 0) {
                str10 = gVar8.f769r;
                if (str10 == null) {
                    length = 0;
                } else {
                    str11 = gVar8.f769r;
                    length = str11.length();
                }
                i22 = gVar8.f757f;
                int i32 = length - i22;
                i23 = gVar8.f756e;
                obtain2.setMaxTextLength(i23 + i32);
            }
        }
        if (g.k(gVar8, e.SET_SELECTION)) {
            obtain2.addAction(131072);
        }
        if (g.k(gVar8, e.COPY)) {
            obtain2.addAction(16384);
        }
        if (g.k(gVar8, e.CUT)) {
            obtain2.addAction(65536);
        }
        if (g.k(gVar8, e.PASTE)) {
            obtain2.addAction(32768);
        }
        if (g.k(gVar8, e.SET_TEXT)) {
            obtain2.addAction(2097152);
        }
        if (g.o(gVar8)) {
            obtain2.setClassName("android.widget.Button");
        }
        E3 = gVar8.E(15);
        if (E3) {
            obtain2.setClassName("android.widget.ImageView");
        }
        if (g.k(gVar8, e.DISMISS)) {
            obtain2.setDismissable(true);
            obtain2.addAction(1048576);
        }
        gVar = gVar8.f742S;
        if (gVar != null) {
            gVar7 = gVar8.f742S;
            i18 = gVar7.f752b;
            obtain2.setParent(view, i18);
        } else {
            obtain2.setParent(view);
        }
        i4 = gVar8.f730D;
        if (i4 != -1) {
            i17 = gVar8.f730D;
            obtain2.setTraversalAfter(view, i17);
        }
        Rect f2 = g.f(gVar8);
        gVar2 = gVar8.f742S;
        if (gVar2 != null) {
            gVar6 = gVar8.f742S;
            Rect f3 = g.f(gVar6);
            Rect rect = new Rect(f2);
            rect.offset(-f3.left, -f3.top);
            obtain2.setBoundsInParent(rect);
        } else {
            obtain2.setBoundsInParent(f2);
        }
        Rect rect2 = new Rect(f2);
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        rect2.offset(iArr[0], iArr[1]);
        obtain2.setBoundsInScreen(rect2);
        obtain2.setVisibleToUser(true);
        E4 = gVar8.E(7);
        if (E4) {
            E23 = gVar8.E(8);
            if (!E23) {
                z2 = false;
                obtain2.setEnabled(z2);
                if (g.k(gVar8, e.TAP)) {
                    E5 = gVar8.E(24);
                    if (E5) {
                        obtain2.addAction(16);
                        obtain2.setClickable(true);
                    }
                } else {
                    fVar3 = gVar8.f746W;
                    if (fVar3 != null) {
                        fVar4 = gVar8.f746W;
                        str9 = fVar4.f727e;
                        obtain2.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, str9));
                        obtain2.setClickable(true);
                    } else {
                        obtain2.addAction(16);
                        obtain2.setClickable(true);
                    }
                }
                if (g.k(gVar8, e.LONG_PRESS)) {
                    fVar = gVar8.f747X;
                    if (fVar != null) {
                        fVar2 = gVar8.f747X;
                        str8 = fVar2.f727e;
                        obtain2.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, str8));
                        obtain2.setLongClickable(true);
                    } else {
                        obtain2.addAction(32);
                        obtain2.setLongClickable(true);
                    }
                }
                eVar = e.SCROLL_LEFT;
                k2 = g.k(gVar8, eVar);
                e eVar5 = e.SCROLL_DOWN;
                e eVar6 = e.SCROLL_UP;
                eVar2 = e.SCROLL_RIGHT;
                if (!k2 || g.k(gVar8, eVar6) || g.k(gVar8, eVar2) || g.k(gVar8, eVar5)) {
                    obtain2.setScrollable(true);
                    E6 = gVar8.E(19);
                    if (E6) {
                        if (g.k(gVar8, eVar) || g.k(gVar8, eVar2)) {
                            obtain2.setClassName("android.widget.HorizontalScrollView");
                        } else {
                            obtain2.setClassName("android.widget.ScrollView");
                        }
                    }
                }
                if (j(gVar8)) {
                    if (g.k(gVar8, eVar) || g.k(gVar8, eVar2)) {
                        if (Build.VERSION.SDK_INT < 33) {
                            i14 = gVar8.f761j;
                            obtain2.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, i14, false));
                        } else {
                            AbstractC0009j.h();
                            i13 = gVar8.f761j;
                            obtain2.setCollectionInfo(D.r.r(i13));
                        }
                    } else if (Build.VERSION.SDK_INT < 33) {
                        i16 = gVar8.f761j;
                        obtain2.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(i16, 1, false));
                    } else {
                        AbstractC0009j.h();
                        i15 = gVar8.f761j;
                        obtain2.setCollectionInfo(D.r.j(i15));
                    }
                }
                gVar3 = gVar8.f742S;
                if (gVar3 != null && j(gVar3) && gVar8.f742S.E(19)) {
                    gVar5 = gVar8.f742S;
                    arrayList4 = gVar5.f743T;
                    z3 = g.k(gVar5, eVar) && !g.k(gVar5, eVar2);
                    int indexOf = arrayList4.indexOf(gVar8);
                    if (z3) {
                        if (Build.VERSION.SDK_INT < 33) {
                            E20 = gVar8.E(10);
                            z4 = false;
                            obtain2.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, indexOf, 1, E20));
                        } else {
                            z4 = false;
                            AbstractC0009j.e();
                            E19 = gVar8.E(10);
                            obtain2.setCollectionItemInfo(D.r.s(indexOf, E19));
                        }
                    } else if (Build.VERSION.SDK_INT < 33) {
                        E22 = gVar8.E(10);
                        obtain2.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(indexOf, 1, 0, 1, E22));
                    } else {
                        AbstractC0009j.e();
                        E21 = gVar8.E(10);
                        obtain2.setCollectionItemInfo(D.r.k(indexOf, E21));
                    }
                }
                if (!g.k(gVar8, eVar) || g.k(gVar8, eVar6)) {
                    obtain2.addAction(4096);
                }
                if (!g.k(gVar8, eVar2) || g.k(gVar8, eVar5)) {
                    obtain2.addAction(8192);
                }
                eVar3 = e.INCREASE;
                k3 = g.k(gVar8, eVar3);
                eVar4 = e.DECREASE;
                if (!k3 || g.k(gVar8, eVar4)) {
                    obtain2.setClassName("android.widget.SeekBar");
                    if (g.k(gVar8, eVar3)) {
                        obtain2.addAction(4096);
                    }
                    if (g.k(gVar8, eVar4)) {
                        obtain2.addAction(8192);
                    }
                }
                E7 = gVar8.E(16);
                if (E7) {
                    obtain2.setLiveRegion(1);
                }
                E8 = gVar8.E(5);
                if (E8) {
                    E9 = gVar8.E(12);
                    if (!E9) {
                        CharSequence v2 = g.v(gVar8);
                        if (Build.VERSION.SDK_INT < 28) {
                            str2 = gVar8.f776z;
                            if (str2 != null) {
                                CharSequence charSequence = v2 != null ? v2 : "";
                                StringBuilder sb = new StringBuilder();
                                sb.append((Object) charSequence);
                                sb.append("\n");
                                str3 = gVar8.f776z;
                                sb.append(str3);
                                v2 = sb.toString();
                            }
                        }
                        if (v2 != null) {
                            obtain2.setContentDescription(v2);
                        }
                    }
                } else {
                    obtain2.setText(g.t(gVar8));
                    if (Build.VERSION.SDK_INT >= 28) {
                        obtain2.setHintText(g.u(gVar8));
                    }
                }
                i5 = Build.VERSION.SDK_INT;
                if (i5 >= 28) {
                    str5 = gVar8.f776z;
                    if (str5 != null) {
                        str6 = gVar8.f776z;
                        obtain2.setTooltipText(str6);
                        if (g.v(gVar8) == null) {
                            str7 = gVar8.f776z;
                            obtain2.setContentDescription(str7);
                        }
                    }
                }
                E10 = gVar8.E(1);
                E11 = gVar8.E(17);
                obtain2.setCheckable((!E10 || E11) ? true : z4);
                if (!E10) {
                    E17 = gVar8.E(2);
                    obtain2.setChecked(E17);
                    E18 = gVar8.E(9);
                    if (E18) {
                        obtain2.setClassName("android.widget.RadioButton");
                    } else {
                        obtain2.setClassName("android.widget.CheckBox");
                    }
                } else if (E11) {
                    E12 = gVar8.E(18);
                    obtain2.setChecked(E12);
                    obtain2.setClassName("android.widget.Switch");
                }
                E13 = gVar8.E(3);
                obtain2.setSelected(E13);
                if (i5 >= 36) {
                    E15 = gVar8.E(27);
                    if (E15) {
                        E16 = gVar8.E(28);
                        obtain2.setExpandedState(E16 ? 3 : 1);
                        if (g.k(gVar8, e.EXPAND)) {
                            obtain2.addAction(262144);
                        }
                        if (g.k(gVar8, e.COLLAPSE)) {
                            obtain2.addAction(524288);
                        }
                    }
                }
                if (i5 >= 28) {
                    i12 = gVar8.f729C;
                    obtain2.setHeading(i12 > 0 ? true : z4);
                }
                gVar4 = this.f786i;
                if (gVar4 != null) {
                    i11 = gVar4.f752b;
                    if (i11 == i2) {
                        obtain2.addAction(128);
                        arrayList = gVar8.f745V;
                        if (arrayList != null) {
                            arrayList3 = gVar8.f745V;
                            Iterator it2 = arrayList3.iterator();
                            while (it2.hasNext()) {
                                f fVar5 = (f) it2.next();
                                i10 = fVar5.f723a;
                                str4 = fVar5.f726d;
                                obtain2.addAction(new AccessibilityNodeInfo.AccessibilityAction(i10, str4));
                            }
                        }
                        arrayList2 = gVar8.f743T;
                        it = arrayList2.iterator();
                        while (it.hasNext()) {
                            g gVar12 = (g) it.next();
                            E14 = gVar12.E(14);
                            if (!E14) {
                                i6 = gVar12.f760i;
                                if (i6 != -1) {
                                    i8 = gVar12.f760i;
                                    iVar.f(i8);
                                    i9 = gVar12.f760i;
                                    iVar.h(i9);
                                }
                                i7 = gVar12.f752b;
                                obtain2.addChild(view, i7);
                            }
                        }
                        return obtain2;
                    }
                }
                obtain2.addAction(64);
                arrayList = gVar8.f745V;
                if (arrayList != null) {
                }
                arrayList2 = gVar8.f743T;
                it = arrayList2.iterator();
                while (it.hasNext()) {
                }
                return obtain2;
            }
        }
        z2 = true;
        obtain2.setEnabled(z2);
        if (g.k(gVar8, e.TAP)) {
        }
        if (g.k(gVar8, e.LONG_PRESS)) {
        }
        eVar = e.SCROLL_LEFT;
        k2 = g.k(gVar8, eVar);
        e eVar52 = e.SCROLL_DOWN;
        e eVar62 = e.SCROLL_UP;
        eVar2 = e.SCROLL_RIGHT;
        if (!k2) {
        }
        obtain2.setScrollable(true);
        E6 = gVar8.E(19);
        if (E6) {
        }
        if (j(gVar8)) {
        }
        gVar3 = gVar8.f742S;
        if (gVar3 != null) {
            gVar5 = gVar8.f742S;
            arrayList4 = gVar5.f743T;
            if (g.k(gVar5, eVar)) {
            }
            int indexOf2 = arrayList4.indexOf(gVar8);
            if (z3) {
            }
        }
        if (!g.k(gVar8, eVar)) {
        }
        obtain2.addAction(4096);
        if (!g.k(gVar8, eVar2)) {
        }
        obtain2.addAction(8192);
        eVar3 = e.INCREASE;
        k3 = g.k(gVar8, eVar3);
        eVar4 = e.DECREASE;
        if (!k3) {
        }
        obtain2.setClassName("android.widget.SeekBar");
        if (g.k(gVar8, eVar3)) {
        }
        if (g.k(gVar8, eVar4)) {
        }
        E7 = gVar8.E(16);
        if (E7) {
        }
        E8 = gVar8.E(5);
        if (E8) {
        }
        i5 = Build.VERSION.SDK_INT;
        if (i5 >= 28) {
        }
        E10 = gVar8.E(1);
        E11 = gVar8.E(17);
        obtain2.setCheckable((!E10 || E11) ? true : z4);
        if (!E10) {
        }
        E13 = gVar8.E(3);
        obtain2.setSelected(E13);
        if (i5 >= 36) {
        }
        if (i5 >= 28) {
        }
        gVar4 = this.f786i;
        if (gVar4 != null) {
        }
        obtain2.addAction(64);
        arrayList = gVar8.f745V;
        if (arrayList != null) {
        }
        arrayList2 = gVar8.f743T;
        it = arrayList2.iterator();
        while (it.hasNext()) {
        }
        return obtain2;
    }

    public final AccessibilityEvent d(int i2, int i3) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i3);
        y yVar = this.f778a;
        obtain.setPackageName(yVar.getContext().getPackageName());
        obtain.setSource(yVar, i2);
        return obtain;
    }

    public final boolean e(MotionEvent motionEvent, boolean z2) {
        g F2;
        if (!this.f780c.isTouchExplorationEnabled()) {
            return false;
        }
        HashMap hashMap = this.f784g;
        if (hashMap.isEmpty()) {
            return false;
        }
        g F3 = ((g) hashMap.get(0)).F(new float[]{motionEvent.getX(), motionEvent.getY(), 0.0f, 1.0f}, z2);
        if (F3 != null && F3.f760i != -1) {
            if (z2) {
                return false;
            }
            return this.f781d.onAccessibilityHoverEvent(F3.f752b, motionEvent);
        }
        if (motionEvent.getAction() == 9 || motionEvent.getAction() == 7) {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            if (!hashMap.isEmpty() && (F2 = ((g) hashMap.get(0)).F(new float[]{x2, y2, 0.0f, 1.0f}, z2)) != this.f792o) {
                if (F2 != null) {
                    g(F2.f752b, 128);
                }
                g gVar = this.f792o;
                if (gVar != null) {
                    g(gVar.f752b, 256);
                }
                this.f792o = F2;
            }
        } else {
            if (motionEvent.getAction() != 10) {
                motionEvent.toString();
                return false;
            }
            g gVar2 = this.f792o;
            if (gVar2 != null) {
                g(gVar2.f752b, 256);
                this.f792o = null;
            }
        }
        return true;
    }

    public final boolean f(g gVar, int i2, Bundle bundle, boolean z2) {
        int i3;
        int i4 = bundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
        boolean z3 = bundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
        int i5 = gVar.f758g;
        int i6 = gVar.f759h;
        if (i6 >= 0 && i5 >= 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 4) {
                        if (i4 == 8 || i4 == 16) {
                            if (z2) {
                                gVar.f759h = gVar.f769r.length();
                            } else {
                                gVar.f759h = 0;
                            }
                        }
                    } else if (z2 && i6 < gVar.f769r.length()) {
                        Matcher matcher = Pattern.compile("(?!^)(\\n)").matcher(gVar.f769r.substring(gVar.f759h));
                        if (matcher.find()) {
                            gVar.f759h += matcher.start(1);
                        } else {
                            gVar.f759h = gVar.f769r.length();
                        }
                    } else if (!z2 && gVar.f759h > 0) {
                        Matcher matcher2 = Pattern.compile("(?s:.*)(\\n)").matcher(gVar.f769r.substring(0, gVar.f759h));
                        if (matcher2.find()) {
                            gVar.f759h = matcher2.start(1);
                        } else {
                            gVar.f759h = 0;
                        }
                    }
                } else if (z2 && i6 < gVar.f769r.length()) {
                    Matcher matcher3 = Pattern.compile("\\p{L}(\\b)").matcher(gVar.f769r.substring(gVar.f759h));
                    matcher3.find();
                    if (matcher3.find()) {
                        gVar.f759h += matcher3.start(1);
                    } else {
                        gVar.f759h = gVar.f769r.length();
                    }
                } else if (!z2 && gVar.f759h > 0) {
                    Matcher matcher4 = Pattern.compile("(?s:.*)(\\b)\\p{L}").matcher(gVar.f769r.substring(0, gVar.f759h));
                    if (matcher4.find()) {
                        gVar.f759h = matcher4.start(1);
                    }
                }
            } else if (z2 && i6 < gVar.f769r.length()) {
                gVar.f759h++;
            } else if (!z2 && (i3 = gVar.f759h) > 0) {
                gVar.f759h = i3 - 1;
            }
            if (!z3) {
                gVar.f758g = gVar.f759h;
            }
        }
        if (i5 != gVar.f758g || i6 != gVar.f759h) {
            String str = gVar.f769r;
            if (str == null) {
                str = "";
            }
            AccessibilityEvent d2 = d(gVar.f752b, 8192);
            d2.getText().add(str);
            d2.setFromIndex(gVar.f758g);
            d2.setToIndex(gVar.f759h);
            d2.setItemCount(str.length());
            h(d2);
        }
        C.b bVar = this.f779b;
        if (i4 == 1) {
            if (z2) {
                e eVar = e.MOVE_CURSOR_FORWARD_BY_CHARACTER;
                if (g.k(gVar, eVar)) {
                    bVar.c(i2, eVar, Boolean.valueOf(z3));
                    return true;
                }
            }
            if (!z2) {
                e eVar2 = e.MOVE_CURSOR_BACKWARD_BY_CHARACTER;
                if (g.k(gVar, eVar2)) {
                    bVar.c(i2, eVar2, Boolean.valueOf(z3));
                    return true;
                }
            }
        } else if (i4 == 2) {
            if (z2) {
                e eVar3 = e.MOVE_CURSOR_FORWARD_BY_WORD;
                if (g.k(gVar, eVar3)) {
                    bVar.c(i2, eVar3, Boolean.valueOf(z3));
                    return true;
                }
            }
            if (!z2) {
                e eVar4 = e.MOVE_CURSOR_BACKWARD_BY_WORD;
                if (g.k(gVar, eVar4)) {
                    bVar.c(i2, eVar4, Boolean.valueOf(z3));
                    return true;
                }
            }
        } else if (i4 == 4 || i4 == 8 || i4 == 16) {
            return true;
        }
        return false;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i2) {
        if (i2 == 1) {
            g gVar = this.f790m;
            if (gVar != null) {
                return createAccessibilityNodeInfo(gVar.f752b);
            }
        } else if (i2 != 2) {
            return null;
        }
        g gVar2 = this.f786i;
        if (gVar2 != null) {
            return createAccessibilityNodeInfo(gVar2.f752b);
        }
        Integer num = this.f787j;
        if (num != null) {
            return createAccessibilityNodeInfo(num.intValue());
        }
        return null;
    }

    public final void g(int i2, int i3) {
        if (this.f780c.isEnabled()) {
            h(d(i2, i3));
        }
    }

    public final void h(AccessibilityEvent accessibilityEvent) {
        if (this.f780c.isEnabled()) {
            View view = this.f778a;
            view.getParent().requestSendAccessibilityEvent(view, accessibilityEvent);
        }
    }

    public final void i(boolean z2) {
        if (this.f796s == z2) {
            return;
        }
        this.f796s = z2;
        if (z2) {
            this.f788k |= 1;
        } else {
            this.f788k &= -2;
        }
        ((FlutterJNI) this.f779b.f14b).setAccessibilityFeatures(this.f788k);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001b, code lost:
    
        if (r0 != null) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean j(g gVar) {
        if (gVar.f761j <= 1) {
            return false;
        }
        g gVar2 = this.f786i;
        g gVar3 = null;
        if (gVar2 != null) {
            g gVar4 = gVar2.f742S;
            while (true) {
                if (gVar4 == null) {
                    gVar4 = null;
                    break;
                }
                if (gVar4 == gVar) {
                    break;
                }
                gVar4 = gVar4.f742S;
            }
        }
        g gVar5 = this.f786i;
        a aVar = new a();
        if (gVar5 != null) {
            g gVar6 = gVar5.f742S;
            while (true) {
                if (gVar6 == null) {
                    break;
                }
                if (aVar.test(gVar6)) {
                    gVar3 = gVar6;
                    break;
                }
                gVar6 = gVar6.f742S;
            }
            if (gVar3 != null) {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i2, int i3, Bundle bundle) {
        if (i2 >= 65536) {
            boolean performAction = this.f781d.performAction(i2, i3, bundle);
            if (performAction && i3 == 128) {
                this.f787j = null;
            }
            return performAction;
        }
        HashMap hashMap = this.f784g;
        g gVar = (g) hashMap.get(Integer.valueOf(i2));
        if (gVar == null) {
            return false;
        }
        e eVar = e.INCREASE;
        e eVar2 = e.DECREASE;
        C.b bVar = this.f779b;
        switch (i3) {
            case 16:
                bVar.b(i2, e.TAP);
                return true;
            case 32:
                bVar.b(i2, e.LONG_PRESS);
                return true;
            case 64:
                if (this.f786i == null) {
                    this.f778a.invalidate();
                }
                this.f786i = gVar;
                bVar.b(i2, e.DID_GAIN_ACCESSIBILITY_FOCUS);
                HashMap hashMap2 = new HashMap();
                hashMap2.put("type", "didGainFocus");
                hashMap2.put("nodeId", Integer.valueOf(gVar.f752b));
                ((B.e) bVar.f13a).g(hashMap2, null);
                g(i2, 32768);
                if (g.k(gVar, eVar) || g.k(gVar, eVar2)) {
                    g(i2, 4);
                }
                return true;
            case 128:
                g gVar2 = this.f786i;
                if (gVar2 != null && gVar2.f752b == i2) {
                    this.f786i = null;
                }
                Integer num = this.f787j;
                if (num != null && num.intValue() == i2) {
                    this.f787j = null;
                }
                bVar.b(i2, e.DID_LOSE_ACCESSIBILITY_FOCUS);
                g(i2, 65536);
                return true;
            case 256:
                return f(gVar, i2, bundle, true);
            case 512:
                return f(gVar, i2, bundle, false);
            case 4096:
                e eVar3 = e.SCROLL_UP;
                if (g.k(gVar, eVar3)) {
                    bVar.b(i2, eVar3);
                } else {
                    e eVar4 = e.SCROLL_LEFT;
                    if (g.k(gVar, eVar4)) {
                        bVar.b(i2, eVar4);
                    } else {
                        if (!g.k(gVar, eVar)) {
                            return false;
                        }
                        gVar.f769r = gVar.f771t;
                        gVar.f770s = gVar.u;
                        g(i2, 4);
                        bVar.b(i2, eVar);
                    }
                }
                return true;
            case 8192:
                e eVar5 = e.SCROLL_DOWN;
                if (g.k(gVar, eVar5)) {
                    bVar.b(i2, eVar5);
                } else {
                    e eVar6 = e.SCROLL_RIGHT;
                    if (g.k(gVar, eVar6)) {
                        bVar.b(i2, eVar6);
                    } else {
                        if (!g.k(gVar, eVar2)) {
                            return false;
                        }
                        gVar.f769r = gVar.f772v;
                        gVar.f770s = gVar.f773w;
                        g(i2, 4);
                        bVar.b(i2, eVar2);
                    }
                }
                return true;
            case 16384:
                bVar.b(i2, e.COPY);
                return true;
            case 32768:
                bVar.b(i2, e.PASTE);
                return true;
            case 65536:
                bVar.b(i2, e.CUT);
                return true;
            case 131072:
                HashMap hashMap3 = new HashMap();
                if (bundle != null && bundle.containsKey("ACTION_ARGUMENT_SELECTION_START_INT") && bundle.containsKey("ACTION_ARGUMENT_SELECTION_END_INT")) {
                    hashMap3.put("base", Integer.valueOf(bundle.getInt("ACTION_ARGUMENT_SELECTION_START_INT")));
                    hashMap3.put("extent", Integer.valueOf(bundle.getInt("ACTION_ARGUMENT_SELECTION_END_INT")));
                } else {
                    hashMap3.put("base", Integer.valueOf(gVar.f759h));
                    hashMap3.put("extent", Integer.valueOf(gVar.f759h));
                }
                bVar.c(i2, e.SET_SELECTION, hashMap3);
                g gVar3 = (g) hashMap.get(Integer.valueOf(i2));
                gVar3.f758g = ((Integer) hashMap3.get("base")).intValue();
                gVar3.f759h = ((Integer) hashMap3.get("extent")).intValue();
                return true;
            case 262144:
                bVar.b(i2, e.EXPAND);
                return true;
            case 524288:
                bVar.b(i2, e.COLLAPSE);
                return true;
            case 1048576:
                bVar.b(i2, e.DISMISS);
                return true;
            case 2097152:
                String string = (bundle == null || !bundle.containsKey("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE")) ? "" : bundle.getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE");
                bVar.c(i2, e.SET_TEXT, string);
                gVar.f769r = string;
                gVar.f770s = null;
                return true;
            case R.id.accessibilityActionShowOnScreen:
                bVar.b(i2, e.SHOW_ON_SCREEN);
                return true;
            default:
                f fVar = (f) this.f785h.get(Integer.valueOf(i3 - 267386881));
                if (fVar == null) {
                    return false;
                }
                bVar.c(i2, e.CUSTOM_ACTION, Integer.valueOf(fVar.f724b));
                return true;
        }
    }
}
