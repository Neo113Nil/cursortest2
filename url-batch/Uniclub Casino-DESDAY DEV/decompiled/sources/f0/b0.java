package f0;

import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public int f2039a;

    /* renamed from: b, reason: collision with root package name */
    public int f2040b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2041c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2042e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f2043f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f2044g;

    public b0(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.f2044g = staggeredGridLayoutManager;
        a();
    }

    public final void a() {
        this.f2039a = -1;
        this.f2040b = Integer.MIN_VALUE;
        this.f2041c = false;
        this.d = false;
        this.f2042e = false;
        int[] iArr = this.f2043f;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
    }
}
