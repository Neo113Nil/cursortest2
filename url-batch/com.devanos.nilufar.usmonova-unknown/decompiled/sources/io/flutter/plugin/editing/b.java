package io.flutter.plugin.editing;

import android.graphics.Rect;
import android.os.Build;
import android.text.Selection;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import o.AbstractC1665p0;
import o.C0208Hx;
import o.C0410Ps;
import o.C0713aV;
import o.C0950e6;
import o.C1041fV;
import o.C1173hV;
import o.C1239iV;
import o.C1334k;
import o.C1682pE;
import o.C1818rJ;
import o.C2073vA;
import o.CI;
import o.DI;
import o.InterfaceC2007uA;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class b implements InterfaceC2007uA {
    public final View a;
    public final InputMethodManager b;
    public final AutofillManager c;
    public final C0208Hx d;
    public C1682pE e = new C1682pE(1, 0);
    public C1041fV f;
    public SparseArray g;
    public C2073vA h;
    public boolean i;
    public C0410Ps j;
    public final DI k;
    public final CI l;
    public Rect m;
    public final ImeSyncDeferringInsetsCallback n;

    /* renamed from: o, reason: collision with root package name */
    public C1173hV f9o;
    public boolean p;

    public b(View view, C0208Hx c0208Hx, C1818rJ c1818rJ, DI di, CI ci) {
        this.a = view;
        this.h = new C2073vA(null, view);
        this.b = (InputMethodManager) view.getContext().getSystemService("input_method");
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            this.c = AbstractC1665p0.f(view.getContext().getSystemService(AbstractC1665p0.j()));
        } else {
            this.c = null;
        }
        if (i >= 30) {
            ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = new ImeSyncDeferringInsetsCallback(view);
            this.n = imeSyncDeferringInsetsCallback;
            imeSyncDeferringInsetsCallback.install();
            imeSyncDeferringInsetsCallback.setImeVisibilityListener(new C1239iV(this));
        }
        this.d = c0208Hx;
        c0208Hx.j = new C1239iV(this);
        ((C0950e6) c0208Hx.i).E("TextInputClient.requestExistingInputState", null, null);
        this.k = di;
        di.m = this;
        this.l = ci;
        ci.getClass();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0084, code lost:
    
        if (r7 == r0.e) goto L44;
     */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // o.InterfaceC2007uA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(boolean z) {
        AutofillManager autofillManager;
        AutofillValue forText;
        if (z) {
            String c2073vA = this.h.toString();
            if (Build.VERSION.SDK_INT >= 26 && (autofillManager = this.c) != null && this.g != null) {
                int hashCode = ((String) this.f.j.i).hashCode();
                forText = AutofillValue.forText(c2073vA);
                autofillManager.notifyValueChanged(this.a, hashCode, forText);
            }
        }
        C2073vA c2073vA2 = this.h;
        c2073vA2.getClass();
        int selectionStart = Selection.getSelectionStart(c2073vA2);
        C2073vA c2073vA3 = this.h;
        c2073vA3.getClass();
        int selectionEnd = Selection.getSelectionEnd(c2073vA3);
        C2073vA c2073vA4 = this.h;
        c2073vA4.getClass();
        int composingSpanStart = BaseInputConnection.getComposingSpanStart(c2073vA4);
        C2073vA c2073vA5 = this.h;
        c2073vA5.getClass();
        int composingSpanEnd = BaseInputConnection.getComposingSpanEnd(c2073vA5);
        C2073vA c2073vA6 = this.h;
        c2073vA6.getClass();
        ArrayList arrayList = c2073vA6.l;
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        if (this.f9o != null) {
            if (this.h.toString().equals(this.f9o.a)) {
                C1173hV c1173hV = this.f9o;
                if (selectionStart == c1173hV.b) {
                    if (selectionEnd == c1173hV.c) {
                        if (composingSpanStart == c1173hV.d) {
                        }
                    }
                }
            }
            this.h.toString();
            boolean z2 = this.f.e;
            C0208Hx c0208Hx = this.d;
            if (z2) {
                int i = this.e.b;
                c0208Hx.getClass();
                arrayList2.size();
                HashMap hashMap = new HashMap();
                JSONArray jSONArray = new JSONArray();
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    C0713aV c0713aV = (C0713aV) it.next();
                    c0713aV.getClass();
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("oldText", c0713aV.a.toString());
                        jSONObject.put("deltaText", c0713aV.b.toString());
                        jSONObject.put("deltaStart", c0713aV.c);
                        jSONObject.put("deltaEnd", c0713aV.d);
                        jSONObject.put("selectionBase", c0713aV.e);
                        jSONObject.put("selectionExtent", c0713aV.f);
                        jSONObject.put("composingBase", c0713aV.g);
                        jSONObject.put("composingExtent", c0713aV.h);
                    } catch (JSONException e) {
                        Log.e("TextEditingDelta", "unable to create JSONObject: " + e);
                    }
                    jSONArray.put(jSONObject);
                }
                hashMap.put("deltas", jSONArray);
                ((C0950e6) c0208Hx.i).E("TextInputClient.updateEditingStateWithDeltas", Arrays.asList(Integer.valueOf(i), hashMap), null);
                this.h.l.clear();
            } else {
                int i2 = this.e.b;
                String c2073vA7 = this.h.toString();
                c0208Hx.getClass();
                ((C0950e6) c0208Hx.i).E("TextInputClient.updateEditingState", Arrays.asList(Integer.valueOf(i2), C0208Hx.J0(c2073vA7, selectionStart, selectionEnd, composingSpanStart, composingSpanEnd)), null);
            }
            this.f9o = new C1173hV(this.h.toString(), selectionStart, selectionEnd, composingSpanStart, composingSpanEnd);
            return;
        }
        this.h.l.clear();
    }

    public final void b() {
        this.k.m = null;
        this.l.getClass();
        this.d.j = null;
        c();
        this.h.e(this);
        ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = this.n;
        if (imeSyncDeferringInsetsCallback != null) {
            imeSyncDeferringInsetsCallback.remove();
        }
    }

    public final void c() {
        AutofillManager autofillManager;
        C1041fV c1041fV;
        C1334k c1334k;
        if (Build.VERSION.SDK_INT < 26 || (autofillManager = this.c) == null || (c1041fV = this.f) == null || (c1334k = c1041fV.j) == null || this.g == null) {
            return;
        }
        autofillManager.notifyViewExited(this.a, ((String) c1334k.i).hashCode());
    }

    public final void d(C1041fV c1041fV) {
        C1334k c1334k;
        AutofillValue forText;
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        if (c1041fV == null || (c1334k = c1041fV.j) == null) {
            this.g = null;
            return;
        }
        C1041fV[] c1041fVArr = c1041fV.l;
        SparseArray sparseArray = new SparseArray();
        this.g = sparseArray;
        if (c1041fVArr == null) {
            sparseArray.put(((String) c1334k.i).hashCode(), c1041fV);
            return;
        }
        for (C1041fV c1041fV2 : c1041fVArr) {
            C1334k c1334k2 = c1041fV2.j;
            if (c1334k2 != null) {
                String str = (String) c1334k2.i;
                this.g.put(str.hashCode(), c1041fV2);
                AutofillManager autofillManager = this.c;
                int hashCode = str.hashCode();
                forText = AutofillValue.forText(((C1173hV) c1334k2.k).a);
                autofillManager.notifyValueChanged(this.a, hashCode, forText);
            }
        }
    }
}
