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
    public static final List f2005s = Collections.emptyList();

    /* renamed from: a, reason: collision with root package name */
    public final View f2006a;

    /* renamed from: b, reason: collision with root package name */
    public WeakReference f2007b;

    /* renamed from: j, reason: collision with root package name */
    public int f2012j;

    /* renamed from: r, reason: collision with root package name */
    public RecyclerView f2020r;

    /* renamed from: c, reason: collision with root package name */
    public int f2008c = -1;
    public int d = -1;

    /* renamed from: e, reason: collision with root package name */
    public long f2009e = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f2010f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f2011g = -1;
    public X h = null;
    public X i = null;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f2013k = null;

    /* renamed from: l, reason: collision with root package name */
    public final List f2014l = null;

    /* renamed from: m, reason: collision with root package name */
    public int f2015m = 0;

    /* renamed from: n, reason: collision with root package name */
    public O f2016n = null;

    /* renamed from: o, reason: collision with root package name */
    public boolean f2017o = false;

    /* renamed from: p, reason: collision with root package name */
    public int f2018p = 0;

    /* renamed from: q, reason: collision with root package name */
    public int f2019q = -1;

    public X(View view) {
        if (view == null) {
            throw new IllegalArgumentException("itemView may not be null");
        }
        this.f2006a = view;
    }

    public final void a(int i) {
        this.f2012j = i | this.f2012j;
    }

    public final int b() {
        int i = this.f2011g;
        return i == -1 ? this.f2008c : i;
    }

    public final List c() {
        ArrayList arrayList;
        return ((this.f2012j & 1024) != 0 || (arrayList = this.f2013k) == null || arrayList.size() == 0) ? f2005s : this.f2014l;
    }

    public final boolean d(int i) {
        return (i & this.f2012j) != 0;
    }

    public final boolean e() {
        View view = this.f2006a;
        return (view.getParent() == null || view.getParent() == this.f2020r) ? false : true;
    }

    public final boolean f() {
        return (this.f2012j & 1) != 0;
    }

    public final boolean g() {
        return (this.f2012j & 4) != 0;
    }

    public final boolean h() {
        if ((this.f2012j & 16) == 0) {
            WeakHashMap weakHashMap = K.T.f381a;
            if (!this.f2006a.hasTransientState()) {
                return true;
            }
        }
        return false;
    }

    public final boolean i() {
        return (this.f2012j & 8) != 0;
    }

    public final boolean j() {
        return this.f2016n != null;
    }

    public final boolean k() {
        return (this.f2012j & 256) != 0;
    }

    public final boolean l() {
        return (this.f2012j & 2) != 0;
    }

    public final void m(int i, boolean z2) {
        if (this.d == -1) {
            this.d = this.f2008c;
        }
        if (this.f2011g == -1) {
            this.f2011g = this.f2008c;
        }
        if (z2) {
            this.f2011g += i;
        }
        this.f2008c += i;
        View view = this.f2006a;
        if (view.getLayoutParams() != null) {
            ((J) view.getLayoutParams()).f1969c = true;
        }
    }

    public final void n() {
        this.f2012j = 0;
        this.f2008c = -1;
        this.d = -1;
        this.f2009e = -1L;
        this.f2011g = -1;
        this.f2015m = 0;
        this.h = null;
        this.i = null;
        ArrayList arrayList = this.f2013k;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.f2012j &= -1025;
        this.f2018p = 0;
        this.f2019q = -1;
        RecyclerView.j(this);
    }

    public final void o(boolean z2) {
        int i = this.f2015m;
        int i2 = z2 ? i - 1 : i + 1;
        this.f2015m = i2;
        if (i2 < 0) {
            this.f2015m = 0;
            Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            return;
        }
        if (!z2 && i2 == 1) {
            this.f2012j |= 16;
        } else if (z2 && i2 == 0) {
            this.f2012j &= -17;
        }
    }

    public final boolean p() {
        return (this.f2012j & 128) != 0;
    }

    public final boolean q() {
        return (this.f2012j & 32) != 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + Integer.toHexString(hashCode()) + " position=" + this.f2008c + " id=" + this.f2009e + ", oldPos=" + this.d + ", pLpos:" + this.f2011g);
        if (j()) {
            sb.append(" scrap ");
            sb.append(this.f2017o ? "[changeScrap]" : "[attachedScrap]");
        }
        if (g()) {
            sb.append(" invalid");
        }
        if (!f()) {
            sb.append(" unbound");
        }
        if ((this.f2012j & 2) != 0) {
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
            sb.append(" not recyclable(" + this.f2015m + ")");
        }
        if ((this.f2012j & 512) != 0 || g()) {
            sb.append(" undefined adapter position");
        }
        if (this.f2006a.getParent() == null) {
            sb.append(" no parent");
        }
        sb.append("}");
        return sb.toString();
    }
}
