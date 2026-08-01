package o1;

import java.util.concurrent.CancellationException;

/* renamed from: o1.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0293j {

    /* renamed from: a, reason: collision with root package name */
    public final Object f3319a;

    /* renamed from: b, reason: collision with root package name */
    public final C0287d f3320b;

    /* renamed from: c, reason: collision with root package name */
    public final f1.l f3321c;
    public final Object d;

    /* renamed from: e, reason: collision with root package name */
    public final Throwable f3322e;

    public C0293j(Object obj, C0287d c0287d, f1.l lVar, Object obj2, Throwable th) {
        this.f3319a = obj;
        this.f3320b = c0287d;
        this.f3321c = lVar;
        this.d = obj2;
        this.f3322e = th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Throwable] */
    public static C0293j a(C0293j c0293j, C0287d c0287d, CancellationException cancellationException, int i) {
        Object obj = c0293j.f3319a;
        if ((i & 2) != 0) {
            c0287d = c0293j.f3320b;
        }
        C0287d c0287d2 = c0287d;
        f1.l lVar = c0293j.f3321c;
        Object obj2 = c0293j.d;
        CancellationException cancellationException2 = cancellationException;
        if ((i & 16) != 0) {
            cancellationException2 = c0293j.f3322e;
        }
        c0293j.getClass();
        return new C0293j(obj, c0287d2, lVar, obj2, cancellationException2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0293j)) {
            return false;
        }
        C0293j c0293j = (C0293j) obj;
        return g1.f.a(this.f3319a, c0293j.f3319a) && g1.f.a(this.f3320b, c0293j.f3320b) && g1.f.a(this.f3321c, c0293j.f3321c) && g1.f.a(this.d, c0293j.d) && g1.f.a(this.f3322e, c0293j.f3322e);
    }

    public final int hashCode() {
        Object obj = this.f3319a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        C0287d c0287d = this.f3320b;
        int hashCode2 = (hashCode + (c0287d == null ? 0 : c0287d.hashCode())) * 31;
        f1.l lVar = this.f3321c;
        int hashCode3 = (hashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Object obj2 = this.d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f3322e;
        return hashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f3319a + ", cancelHandler=" + this.f3320b + ", onCancellation=" + this.f3321c + ", idempotentResume=" + this.d + ", cancelCause=" + this.f3322e + ')';
    }

    public /* synthetic */ C0293j(Object obj, C0287d c0287d, f1.l lVar, CancellationException cancellationException, int i) {
        this(obj, (i & 2) != 0 ? null : c0287d, (i & 4) != 0 ? null : lVar, (Object) null, (i & 16) != 0 ? null : cancellationException);
    }
}
