package Q;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f613a;

    /* renamed from: b, reason: collision with root package name */
    public int f614b;

    /* renamed from: c, reason: collision with root package name */
    public float f615c;
    public float d;

    /* renamed from: e, reason: collision with root package name */
    public long f616e;

    /* renamed from: f, reason: collision with root package name */
    public long f617f;

    /* renamed from: g, reason: collision with root package name */
    public long f618g;
    public float h;
    public int i;

    public final float a(long j2) {
        if (j2 < this.f616e) {
            return RecyclerView.f1570A0;
        }
        long j3 = this.f618g;
        if (j3 < 0 || j2 < j3) {
            return h.b((j2 - r0) / this.f613a, RecyclerView.f1570A0, 1.0f) * 0.5f;
        }
        float f2 = this.h;
        return (h.b((j2 - j3) / this.i, RecyclerView.f1570A0, 1.0f) * f2) + (1.0f - f2);
    }
}
