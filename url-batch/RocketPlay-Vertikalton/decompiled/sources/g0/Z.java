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
    public static final List f2829t = Collections.emptyList();

    /* renamed from: a, reason: collision with root package name */
    public final View f2830a;

    /* renamed from: b, reason: collision with root package name */
    public WeakReference f2831b;

    /* renamed from: j, reason: collision with root package name */
    public int f2836j;

    /* renamed from: r, reason: collision with root package name */
    public RecyclerView f2844r;

    /* renamed from: s, reason: collision with root package name */
    public AbstractC0131A f2845s;

    /* renamed from: c, reason: collision with root package name */
    public int f2832c = -1;
    public int d = -1;

    /* renamed from: e, reason: collision with root package name */
    public long f2833e = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f2834f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f2835g = -1;
    public Z h = null;
    public Z i = null;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f2837k = null;

    /* renamed from: l, reason: collision with root package name */
    public final List f2838l = null;

    /* renamed from: m, reason: collision with root package name */
    public int f2839m = 0;

    /* renamed from: n, reason: collision with root package name */
    public C0145O f2840n = null;

    /* renamed from: o, reason: collision with root package name */
    public boolean f2841o = false;

    /* renamed from: p, reason: collision with root package name */
    public int f2842p = 0;

    /* renamed from: q, reason: collision with root package name */
    public int f2843q = -1;

    public Z(View view) {
        if (view == null) {
            throw new IllegalArgumentException("itemView may not be null");
        }
        this.f2830a = view;
    }

    public final void a(int i) {
        this.f2836j = i | this.f2836j;
    }

    public final int b() {
        int i = this.f2835g;
        return i == -1 ? this.f2832c : i;
    }

    public final List c() {
        ArrayList arrayList;
        return ((this.f2836j & 1024) != 0 || (arrayList = this.f2837k) == null || arrayList.size() == 0) ? f2829t : this.f2838l;
    }

    public final boolean d(int i) {
        return (i & this.f2836j) != 0;
    }

    public final boolean e() {
        View view = this.f2830a;
        return (view.getParent() == null || view.getParent() == this.f2844r) ? false : true;
    }

    public final boolean f() {
        return (this.f2836j & 1) != 0;
    }

    public final boolean g() {
        return (this.f2836j & 4) != 0;
    }

    public final boolean h() {
        if ((this.f2836j & 16) == 0) {
            WeakHashMap weakHashMap = K.T.f633a;
            if (!this.f2830a.hasTransientState()) {
                return true;
            }
        }
        return false;
    }

    public final boolean i() {
        return (this.f2836j & 8) != 0;
    }

    public final boolean j() {
        return this.f2840n != null;
    }

    public final boolean k() {
        return (this.f2836j & 256) != 0;
    }

    public final boolean l() {
        return (this.f2836j & 2) != 0;
    }

    public final void m(int i, boolean z2) {
        if (this.d == -1) {
            this.d = this.f2832c;
        }
        if (this.f2835g == -1) {
            this.f2835g = this.f2832c;
        }
        if (z2) {
            this.f2835g += i;
        }
        this.f2832c += i;
        View view = this.f2830a;
        if (view.getLayoutParams() != null) {
            ((C0140J) view.getLayoutParams()).f2791c = true;
        }
    }

    public final void n() {
        if (RecyclerView.f1954x0 && k()) {
            throw new IllegalStateException("Attempting to reset temp-detached ViewHolder: " + this + ". ViewHolders should be fully detached before resetting.");
        }
        this.f2836j = 0;
        this.f2832c = -1;
        this.d = -1;
        this.f2833e = -1L;
        this.f2835g = -1;
        this.f2839m = 0;
        this.h = null;
        this.i = null;
        ArrayList arrayList = this.f2837k;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.f2836j &= -1025;
        this.f2842p = 0;
        this.f2843q = -1;
        RecyclerView.l(this);
    }

    public final void o(boolean z2) {
        int i = this.f2839m;
        int i2 = z2 ? i - 1 : i + 1;
        this.f2839m = i2;
        if (i2 < 0) {
            this.f2839m = 0;
            if (RecyclerView.f1954x0) {
                throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            }
            Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
        } else if (!z2 && i2 == 1) {
            this.f2836j |= 16;
        } else if (z2 && i2 == 0) {
            this.f2836j &= -17;
        }
        if (RecyclerView.f1955y0) {
            Log.d("RecyclerView", "setIsRecyclable val:" + z2 + ":" + this);
        }
    }

    public final boolean p() {
        return (this.f2836j & 128) != 0;
    }

    public final boolean q() {
        return (this.f2836j & 32) != 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + Integer.toHexString(hashCode()) + " position=" + this.f2832c + " id=" + this.f2833e + ", oldPos=" + this.d + ", pLpos:" + this.f2835g);
        if (j()) {
            sb.append(" scrap ");
            sb.append(this.f2841o ? "[changeScrap]" : "[attachedScrap]");
        }
        if (g()) {
            sb.append(" invalid");
        }
        if (!f()) {
            sb.append(" unbound");
        }
        if ((this.f2836j & 2) != 0) {
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
            sb.append(" not recyclable(" + this.f2839m + ")");
        }
        if ((this.f2836j & 512) != 0 || g()) {
            sb.append(" undefined adapter position");
        }
        if (this.f2830a.getParent() == null) {
            sb.append(" no parent");
        }
        sb.append("}");
        return sb.toString();
    }
}
