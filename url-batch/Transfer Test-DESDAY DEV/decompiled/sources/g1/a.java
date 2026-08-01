package g1;

import java.io.Serializable;

/* loaded from: classes.dex */
public abstract class a implements l1.a, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public transient l1.a f2572a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2573b;

    /* renamed from: c, reason: collision with root package name */
    public final Class f2574c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2575e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f2576f;

    public a(Object obj, Class cls, String str, String str2, boolean z2) {
        this.f2573b = obj;
        this.f2574c = cls;
        this.d = str;
        this.f2575e = str2;
        this.f2576f = z2;
    }

    public final b a() {
        Class cls = this.f2574c;
        if (!this.f2576f) {
            return j.a(cls);
        }
        j.f2584a.getClass();
        return new h(cls);
    }
}
