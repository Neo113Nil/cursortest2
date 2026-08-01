package e1;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class c implements d1.d {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f1923a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1924b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1925c;
    public final X0.e d;

    public c(CharSequence charSequence, int i, int i2, m mVar) {
        X0.d.e(charSequence, "input");
        this.f1923a = charSequence;
        this.f1924b = i;
        this.f1925c = i2;
        this.d = mVar;
    }

    @Override // d1.d
    public final Iterator iterator() {
        return new b(this);
    }
}
