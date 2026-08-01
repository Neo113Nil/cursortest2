package q1;

import java.util.concurrent.CancellationException;

/* renamed from: q1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0343i {

    /* renamed from: a, reason: collision with root package name */
    public final Object f3898a;

    /* renamed from: b, reason: collision with root package name */
    public final K f3899b;

    /* renamed from: c, reason: collision with root package name */
    public final h1.l f3900c;
    public final Object d;

    /* renamed from: e, reason: collision with root package name */
    public final Throwable f3901e;

    public C0343i(Object obj, K k2, h1.l lVar, Object obj2, Throwable th) {
        this.f3898a = obj;
        this.f3899b = k2;
        this.f3900c = lVar;
        this.d = obj2;
        this.f3901e = th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Throwable] */
    public static C0343i a(C0343i c0343i, K k2, CancellationException cancellationException, int i) {
        Object obj = c0343i.f3898a;
        if ((i & 2) != 0) {
            k2 = c0343i.f3899b;
        }
        K k3 = k2;
        h1.l lVar = c0343i.f3900c;
        Object obj2 = c0343i.d;
        CancellationException cancellationException2 = cancellationException;
        if ((i & 16) != 0) {
            cancellationException2 = c0343i.f3901e;
        }
        c0343i.getClass();
        return new C0343i(obj, k3, lVar, obj2, cancellationException2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0343i)) {
            return false;
        }
        C0343i c0343i = (C0343i) obj;
        return i1.f.a(this.f3898a, c0343i.f3898a) && i1.f.a(this.f3899b, c0343i.f3899b) && i1.f.a(this.f3900c, c0343i.f3900c) && i1.f.a(this.d, c0343i.d) && i1.f.a(this.f3901e, c0343i.f3901e);
    }

    public final int hashCode() {
        Object obj = this.f3898a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        K k2 = this.f3899b;
        int hashCode2 = (hashCode + (k2 == null ? 0 : k2.hashCode())) * 31;
        h1.l lVar = this.f3900c;
        int hashCode3 = (hashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Object obj2 = this.d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f3901e;
        return hashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f3898a + ", cancelHandler=" + this.f3899b + ", onCancellation=" + this.f3900c + ", idempotentResume=" + this.d + ", cancelCause=" + this.f3901e + ')';
    }

    public /* synthetic */ C0343i(Object obj, K k2, h1.l lVar, CancellationException cancellationException, int i) {
        this(obj, (i & 2) != 0 ? null : k2, (i & 4) != 0 ? null : lVar, (Object) null, (i & 16) != 0 ? null : cancellationException);
    }
}
