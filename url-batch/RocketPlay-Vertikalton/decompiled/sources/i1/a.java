package i1;

import java.io.Serializable;

/* loaded from: classes.dex */
public abstract class a implements n1.a, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public transient n1.a f3039a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3040b;

    /* renamed from: c, reason: collision with root package name */
    public final Class f3041c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f3042e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f3043f;

    public a(Object obj, Class cls, String str, String str2, boolean z2) {
        this.f3040b = obj;
        this.f3041c = cls;
        this.d = str;
        this.f3042e = str2;
        this.f3043f = z2;
    }

    public final b a() {
        Class cls = this.f3041c;
        if (!this.f3043f) {
            return j.a(cls);
        }
        j.f3052a.getClass();
        return new h(cls);
    }
}
