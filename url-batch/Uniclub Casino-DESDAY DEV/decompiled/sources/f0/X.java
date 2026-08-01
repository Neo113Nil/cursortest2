package f0;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class X {

    /* renamed from: s, reason: collision with root package name */
    public static final List f2013s = Collections.emptyList();

    /* renamed from: a, reason: collision with root package name */
    public final View f2014a;

    /* renamed from: b, reason: collision with root package name */
    public WeakReference f2015b;

    /* renamed from: j, reason: collision with root package name */
    public int f2020j;

    /* renamed from: r, reason: collision with root package name */
    public RecyclerView f2028r;

    /* renamed from: c, reason: collision with root package name */
    public int f2016c = -1;
    public int d = -1;

    /* renamed from: e, reason: collision with root package name */
    public long f2017e = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f2018f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f2019g = -1;
    public X h = null;
    public X i = null;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f2021k = null;

    /* renamed from: l, reason: collision with root package name */
    public final List f2022l = null;

    /* renamed from: m, reason: collision with root package name */
    public int f2023m = 0;

    /* renamed from: n, reason: collision with root package name */
    public O f2024n = null;

    /* renamed from: o, reason: collision with root package name */
    public boolean f2025o = false;

    /* renamed from: p, reason: collision with root package name */
    public int f2026p = 0;

    /* renamed from: q, reason: collision with root package name */
    public int f2027q = -1;

    public X(View view) {
        if (view == null) {
            throw new IllegalArgumentException("itemView may not be null");
        }
        this.f2014a = view;
    }

    public final void a(int i) {
        this.f2020j = i | this.f2020j;
    }

    public final int b() {
        int i = this.f2019g;
        return i == -1 ? this.f2016c : i;
    }

    public final List c() {
        ArrayList arrayList;
        return ((this.f2020j & 1024) != 0 || (arrayList = this.f2021k) == null || arrayList.size() == 0) ? f2013s : this.f2022l;
    }

    public final boolean d(int i) {
        return (i & this.f2020j) != 0;
    }

    public final boolean e() {
        View view = this.f2014a;
        return (view.getParent() == null || view.getParent() == this.f2028r) ? false : true;
    }

    public final boolean f() {
        return (this.f2020j & 1) != 0;
    }

    public final boolean g() {
        return (this.f2020j & 4) != 0;
    }

    public final boolean h() {
        if ((this.f2020j & 16) == 0) {
            WeakHashMap weakHashMap = K.S.f360a;
            if (!this.f2014a.hasTransientState()) {
                return true;
            }
        }
        return false;
    }

    public final boolean i() {
        return (this.f2020j & 8) != 0;
    }

    public final boolean j() {
        return this.f2024n != null;
    }

    public final boolean k() {
        return (this.f2020j & 256) != 0;
    }

    public final boolean l() {
        return (this.f2020j & 2) != 0;
    }

    public final void m(int i, boolean z2) {
        if (this.d == -1) {
            this.d = this.f2016c;
        }
        if (this.f2019g == -1) {
            this.f2019g = this.f2016c;
        }
        if (z2) {
            this.f2019g += i;
        }
        this.f2016c += i;
        View view = this.f2014a;
        if (view.getLayoutParams() != null) {
            ((J) view.getLayoutParams()).f1977c = true;
        }
    }

    public final void n() {
        this.f2020j = 0;
        this.f2016c = -1;
        this.d = -1;
        this.f2017e = -1L;
        this.f2019g = -1;
        this.f2023m = 0;
        this.h = null;
        this.i = null;
        ArrayList arrayList = this.f2021k;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.f2020j &= -1025;
        this.f2026p = 0;
        this.f2027q = -1;
        RecyclerView.j(this);
    }

    public final void o(boolean z2) {
        int i = this.f2023m;
        int i2 = z2 ? i - 1 : i + 1;
        this.f2023m = i2;
        if (i2 < 0) {
            this.f2023m = 0;
            Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            return;
        }
        if (!z2 && i2 == 1) {
            this.f2020j |= 16;
        } else if (z2 && i2 == 0) {
            this.f2020j &= -17;
        }
    }

    public final boolean p() {
        return (this.f2020j & 128) != 0;
    }

    public final boolean q() {
        return (this.f2020j & 32) != 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + Integer.toHexString(hashCode()) + " position=" + this.f2016c + " id=" + this.f2017e + ", oldPos=" + this.d + ", pLpos:" + this.f2019g);
        if (j()) {
            sb.append(" scrap ");
            sb.append(this.f2025o ? "[changeScrap]" : "[attachedScrap]");
        }
        if (g()) {
            sb.append(" invalid");
        }
        if (!f()) {
            sb.append(" unbound");
        }
        if ((this.f2020j & 2) != 0) {
            sb.append(" update");
        }
        if (i()) {
            sb.append(" removed");
        }
        if (p()) {
            sb.append(" ignored");
        }
        if (k()) {
            sb.append(" tmpDetached");
        }
        if (!h()) {
            sb.append(" not recyclable(" + this.f2023m + ")");
        }
        if ((this.f2020j & 512) != 0 || g()) {
            sb.append(" undefined adapter position");
        }
        if (this.f2014a.getParent() == null) {
            sb.append(" no parent");
        }
        sb.append("}");
        return sb.toString();
    }
}
