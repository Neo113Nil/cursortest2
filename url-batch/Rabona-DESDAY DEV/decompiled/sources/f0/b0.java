package f0;

import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public int f2037a;

    /* renamed from: b, reason: collision with root package name */
    public int f2038b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2039c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2040e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f2041f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f2042g;

    public b0(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.f2042g = staggeredGridLayoutManager;
        a();
    }

    public final void a() {
        this.f2037a = -1;
        this.f2038b = Integer.MIN_VALUE;
        this.f2039c = false;
        this.d = false;
        this.f2040e = false;
        int[] iArr = this.f2041f;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
    }
}
