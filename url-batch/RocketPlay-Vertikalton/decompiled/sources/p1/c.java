package p1;

import h1.p;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class c implements o1.d {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f3810a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3811b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3812c;
    public final i1.g d;

    /* JADX WARN: Multi-variable type inference failed */
    public c(CharSequence charSequence, int i, int i2, p pVar) {
        i1.f.e(charSequence, "input");
        this.f3810a = charSequence;
        this.f3811b = i;
        this.f3812c = i2;
        this.d = (i1.g) pVar;
    }

    @Override // o1.d
    public final Iterator iterator() {
        return new b(this);
    }
}
