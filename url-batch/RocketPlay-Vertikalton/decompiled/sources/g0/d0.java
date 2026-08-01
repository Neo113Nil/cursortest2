package g0;

import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public int f2864a;

    /* renamed from: b, reason: collision with root package name */
    public int f2865b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2866c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2867e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f2868f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f2869g;

    public d0(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.f2869g = staggeredGridLayoutManager;
        a();
    }

    public final void a() {
        this.f2864a = -1;
        this.f2865b = Integer.MIN_VALUE;
        this.f2866c = false;
        this.d = false;
        this.f2867e = false;
        int[] iArr = this.f2868f;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
    }
}
