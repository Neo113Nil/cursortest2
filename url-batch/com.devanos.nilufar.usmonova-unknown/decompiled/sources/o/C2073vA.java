package o;

import android.text.Selection;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: o.vA, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2073vA extends SpannableStringBuilder {
    public int h = 0;
    public int i = 0;
    public final ArrayList j = new ArrayList();
    public final ArrayList k = new ArrayList();
    public final ArrayList l = new ArrayList();
    public String m;
    public String n;

    /* renamed from: o, reason: collision with root package name */
    public int f231o;
    public int p;
    public int q;
    public int r;
    public final C1941tA s;

    public C2073vA(C1173hV c1173hV, View view) {
        this.s = new C1941tA(view, this);
        if (c1173hV != null) {
            f(c1173hV);
        }
    }

    public final void a(InterfaceC2007uA interfaceC2007uA) {
        if (this.i > 0) {
            Log.e("ListenableEditingState", "adding a listener " + interfaceC2007uA.toString() + " in a listener callback");
        }
        if (this.h <= 0) {
            this.j.add(interfaceC2007uA);
        } else {
            Log.w("ListenableEditingState", "a listener was added to EditingState while a batch edit was in progress");
            this.k.add(interfaceC2007uA);
        }
    }

    public final void b() {
        this.h++;
        if (this.i > 0) {
            Log.e("ListenableEditingState", "editing state should not be changed in a listener callback");
        }
        if (this.h != 1 || this.j.isEmpty()) {
            return;
        }
        this.n = toString();
        this.f231o = Selection.getSelectionStart(this);
        this.p = Selection.getSelectionEnd(this);
        this.q = BaseInputConnection.getComposingSpanStart(this);
        this.r = BaseInputConnection.getComposingSpanEnd(this);
    }

    public final void c() {
        int i = this.h;
        if (i == 0) {
            Log.e("ListenableEditingState", "endBatchEdit called without a matching beginBatchEdit");
            return;
        }
        ArrayList arrayList = this.j;
        ArrayList arrayList2 = this.k;
        if (i == 1) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                InterfaceC2007uA interfaceC2007uA = (InterfaceC2007uA) it.next();
                this.i++;
                interfaceC2007uA.a(true);
                this.i--;
            }
            if (!arrayList.isEmpty()) {
                arrayList.size();
                d(!toString().equals(this.n), (this.f231o == Selection.getSelectionStart(this) && this.p == Selection.getSelectionEnd(this)) ? false : true, (this.q == BaseInputConnection.getComposingSpanStart(this) && this.r == BaseInputConnection.getComposingSpanEnd(this)) ? false : true);
            }
        }
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        this.h--;
    }

    public final void d(boolean z, boolean z2, boolean z3) {
        if (z || z2 || z3) {
            Iterator it = this.j.iterator();
            while (it.hasNext()) {
                InterfaceC2007uA interfaceC2007uA = (InterfaceC2007uA) it.next();
                this.i++;
                interfaceC2007uA.a(z);
                this.i--;
            }
        }
    }

    public final void e(InterfaceC2007uA interfaceC2007uA) {
        if (this.i > 0) {
            Log.e("ListenableEditingState", "removing a listener " + interfaceC2007uA.toString() + " in a listener callback");
        }
        this.j.remove(interfaceC2007uA);
        if (this.h > 0) {
            this.k.remove(interfaceC2007uA);
        }
    }

    public final void f(C1173hV c1173hV) {
        b();
        replace(0, length(), (CharSequence) c1173hV.a);
        int i = c1173hV.b;
        if (i >= 0) {
            Selection.setSelection(this, i, c1173hV.c);
        } else {
            Selection.removeSelection(this);
        }
        int i2 = c1173hV.d;
        int i3 = c1173hV.e;
        if (i2 < 0 || i2 >= i3) {
            BaseInputConnection.removeComposingSpans(this);
        } else {
            this.s.setComposingRegion(i2, i3);
        }
        this.l.clear();
        c();
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        super.setSpan(obj, i, i2, i3);
        String c2073vA = toString();
        int selectionStart = Selection.getSelectionStart(this);
        int selectionEnd = Selection.getSelectionEnd(this);
        int composingSpanStart = BaseInputConnection.getComposingSpanStart(this);
        int composingSpanEnd = BaseInputConnection.getComposingSpanEnd(this);
        C0713aV c0713aV = new C0713aV();
        c0713aV.e = selectionStart;
        c0713aV.f = selectionEnd;
        c0713aV.g = composingSpanStart;
        c0713aV.h = composingSpanEnd;
        c0713aV.a = c2073vA;
        c0713aV.b = "";
        c0713aV.c = -1;
        c0713aV.d = -1;
        this.l.add(c0713aV);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final String toString() {
        String str = this.m;
        if (str != null) {
            return str;
        }
        String spannableStringBuilder = super.toString();
        this.m = spannableStringBuilder;
        return spannableStringBuilder;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        if (this.i > 0) {
            Log.e("ListenableEditingState", "editing state should not be changed in a listener callback");
        }
        String c2073vA = toString();
        int i5 = i2 - i;
        boolean z = i5 != i4 - i3;
        for (int i6 = 0; i6 < i5 && !z; i6++) {
            z |= charAt(i + i6) != charSequence.charAt(i3 + i6);
        }
        if (z) {
            this.m = null;
        }
        int selectionStart = Selection.getSelectionStart(this);
        int selectionEnd = Selection.getSelectionEnd(this);
        int composingSpanStart = BaseInputConnection.getComposingSpanStart(this);
        int composingSpanEnd = BaseInputConnection.getComposingSpanEnd(this);
        SpannableStringBuilder replace = super.replace(i, i2, charSequence, i3, i4);
        int selectionStart2 = Selection.getSelectionStart(this);
        int selectionEnd2 = Selection.getSelectionEnd(this);
        int composingSpanStart2 = BaseInputConnection.getComposingSpanStart(this);
        int composingSpanEnd2 = BaseInputConnection.getComposingSpanEnd(this);
        C0713aV c0713aV = new C0713aV();
        c0713aV.e = selectionStart2;
        c0713aV.f = selectionEnd2;
        c0713aV.g = composingSpanStart2;
        c0713aV.h = composingSpanEnd2;
        String charSequence2 = charSequence.toString();
        c0713aV.a = c2073vA;
        c0713aV.b = charSequence2;
        c0713aV.c = i;
        c0713aV.d = i2;
        this.l.add(c0713aV);
        if (this.h > 0) {
            return replace;
        }
        d(z, (Selection.getSelectionStart(this) == selectionStart && Selection.getSelectionEnd(this) == selectionEnd) ? false : true, (BaseInputConnection.getComposingSpanStart(this) == composingSpanStart && BaseInputConnection.getComposingSpanEnd(this) == composingSpanEnd) ? false : true);
        return replace;
    }
}
