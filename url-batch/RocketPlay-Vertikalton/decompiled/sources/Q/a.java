package Q;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f1036a;

    /* renamed from: b, reason: collision with root package name */
    public int f1037b;

    /* renamed from: c, reason: collision with root package name */
    public float f1038c;
    public float d;

    /* renamed from: e, reason: collision with root package name */
    public long f1039e;

    /* renamed from: f, reason: collision with root package name */
    public long f1040f;

    /* renamed from: g, reason: collision with root package name */
    public long f1041g;
    public float h;
    public int i;

    public final float a(long j2) {
        if (j2 < this.f1039e) {
            return RecyclerView.f1949A0;
        }
        long j3 = this.f1041g;
        if (j3 < 0 || j2 < j3) {
            return g.b((j2 - r0) / this.f1036a, RecyclerView.f1949A0, 1.0f) * 0.5f;
        }
        float f2 = this.h;
        return (g.b((j2 - j3) / this.i, RecyclerView.f1949A0, 1.0f) * f2) + (1.0f - f2);
    }
}
