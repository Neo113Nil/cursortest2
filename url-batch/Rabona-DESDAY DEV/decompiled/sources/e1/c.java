package e1;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class c implements d1.d {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f1921a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1922b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1923c;
    public final X0.e d;

    public c(CharSequence charSequence, int i, int i2, m mVar) {
        X0.d.e(charSequence, "input");
        this.f1921a = charSequence;
        this.f1922b = i;
        this.f1923c = i2;
        this.d = mVar;
    }

    @Override // d1.d
    public final Iterator iterator() {
        return new b(this);
    }
}
