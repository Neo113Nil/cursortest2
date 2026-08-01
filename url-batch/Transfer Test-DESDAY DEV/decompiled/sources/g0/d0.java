package g0;

import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public int f2424a;

    /* renamed from: b, reason: collision with root package name */
    public int f2425b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2426c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2427e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f2428f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f2429g;

    public d0(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.f2429g = staggeredGridLayoutManager;
        a();
    }

    public final void a() {
        this.f2424a = -1;
        this.f2425b = Integer.MIN_VALUE;
        this.f2426c = false;
        this.d = false;
        this.f2427e = false;
        int[] iArr = this.f2428f;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
    }
}
