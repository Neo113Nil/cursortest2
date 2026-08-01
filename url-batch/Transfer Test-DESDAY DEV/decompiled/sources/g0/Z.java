package g0;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class Z {

    /* renamed from: t, reason: collision with root package name */
    public static final List f2391t = Collections.emptyList();

    /* renamed from: a, reason: collision with root package name */
    public final View f2392a;

    /* renamed from: b, reason: collision with root package name */
    public WeakReference f2393b;

    /* renamed from: j, reason: collision with root package name */
    public int f2398j;

    /* renamed from: r, reason: collision with root package name */
    public RecyclerView f2406r;

    /* renamed from: s, reason: collision with root package name */
    public AbstractC0109A f2407s;

    /* renamed from: c, reason: collision with root package name */
    public int f2394c = -1;
    public int d = -1;

    /* renamed from: e, reason: collision with root package name */
    public long f2395e = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f2396f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f2397g = -1;
    public Z h = null;
    public Z i = null;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f2399k = null;

    /* renamed from: l, reason: collision with root package name */
    public final List f2400l = null;

    /* renamed from: m, reason: collision with root package name */
    public int f2401m = 0;

    /* renamed from: n, reason: collision with root package name */
    public O f2402n = null;

    /* renamed from: o, reason: collision with root package name */
    public boolean f2403o = false;

    /* renamed from: p, reason: collision with root package name */
    public int f2404p = 0;

    /* renamed from: q, reason: collision with root package name */
    public int f2405q = -1;

    public Z(View view) {
        if (view == null) {
            throw new IllegalArgumentException("itemView may not be null");
        }
        this.f2392a = view;
    }

    public final void a(int i) {
        this.f2398j = i | this.f2398j;
    }

    public final int b() {
        int i = this.f2397g;
        return i == -1 ? this.f2394c : i;
    }

    public final List c() {
        ArrayList arrayList;
        return ((this.f2398j & 1024) != 0 || (arrayList = this.f2399k) == null || arrayList.size() == 0) ? f2391t : this.f2400l;
    }

    public final boolean d(int i) {
        return (i & this.f2398j) != 0;
    }

    public final boolean e() {
        View view = this.f2392a;
        return (view.getParent() == null || view.getParent() == this.f2406r) ? false : true;
    }

    public final boolean f() {
        return (this.f2398j & 1) != 0;
    }

    public final boolean g() {
        return (this.f2398j & 4) != 0;
    }

    public final boolean h() {
        if ((this.f2398j & 16) == 0) {
            WeakHashMap weakHashMap = K.T.f372a;
            if (!this.f2392a.hasTransientState()) {
                return true;
            }
        }
        return false;
    }

    public final boolean i() {
        return (this.f2398j & 8) != 0;
    }

    public final boolean j() {
        return this.f2402n != null;
    }

    public final boolean k() {
        return (this.f2398j & 256) != 0;
    }

    public final boolean l() {
        return (this.f2398j & 2) != 0;
    }

    public final void m(int i, boolean z2) {
        if (this.d == -1) {
            this.d = this.f2394c;
        }
        if (this.f2397g == -1) {
            this.f2397g = this.f2394c;
        }
        if (z2) {
            this.f2397g += i;
        }
        this.f2394c += i;
        View view = this.f2392a;
        if (view.getLayoutParams() != null) {
            ((J) view.getLayoutParams()).f2353c = true;
        }
    }

    public final void n() {
        if (RecyclerView.f1575x0 && k()) {
            throw new IllegalStateException("Attempting to reset temp-detached ViewHolder: " + this + ". ViewHolders should be fully detached before resetting.");
        }
        this.f2398j = 0;
        this.f2394c = -1;
        this.d = -1;
        this.f2395e = -1L;
        this.f2397g = -1;
        this.f2401m = 0;
        this.h = null;
        this.i = null;
        ArrayList arrayList = this.f2399k;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.f2398j &= -1025;
        this.f2404p = 0;
        this.f2405q = -1;
        RecyclerView.l(this);
    }

    public final void o(boolean z2) {
        int i = this.f2401m;
        int i2 = z2 ? i - 1 : i + 1;
        this.f2401m = i2;
        if (i2 < 0) {
            this.f2401m = 0;
            if (RecyclerView.f1575x0) {
                throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            }
            Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
        } else if (!z2 && i2 == 1) {
            this.f2398j |= 16;
        } else if (z2 && i2 == 0) {
            this.f2398j &= -17;
        }
        if (RecyclerView.f1576y0) {
            Log.d("RecyclerView", "setIsRecyclable val:" + z2 + ":" + this);
        }
    }

    public final boolean p() {
        return (this.f2398j & 128) != 0;
    }

    public final boolean q() {
        return (this.f2398j & 32) != 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + Integer.toHexString(hashCode()) + " position=" + this.f2394c + " id=" + this.f2395e + ", oldPos=" + this.d + ", pLpos:" + this.f2397g);
        if (j()) {
            sb.append(" scrap ");
            sb.append(this.f2403o ? "[changeScrap]" : "[attachedScrap]");
        }
        if (g()) {
            sb.append(" invalid");
        }
        if (!f()) {
            sb.append(" unbound");
        }
        if ((this.f2398j & 2) != 0) {
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
            sb.append(" not recyclable(" + this.f2401m + ")");
        }
        if ((this.f2398j & 512) != 0 || g()) {
            sb.append(" undefined adapter position");
        }
        if (this.f2392a.getParent() == null) {
            sb.append(" no parent");
        }
        sb.append("}");
        return sb.toString();
    }
}
