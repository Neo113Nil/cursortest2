package f0;

import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public int f2034a;

    /* renamed from: b, reason: collision with root package name */
    public int f2035b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2036c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2037e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f2038f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f2039g;

    public b0(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.f2039g = staggeredGridLayoutManager;
        a();
    }

    public final void a() {
        this.f2034a = -1;
        this.f2035b = Integer.MIN_VALUE;
        this.f2036c = false;
        this.d = false;
        this.f2037e = false;
        int[] iArr = this.f2038f;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
    }
}
