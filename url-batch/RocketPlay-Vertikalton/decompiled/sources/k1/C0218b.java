package k1;

import i1.f;
import java.util.Random;

/* renamed from: k1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0218b extends AbstractC0217a {

    /* renamed from: c, reason: collision with root package name */
    public final C1.c f3278c = new C1.c(1);

    @Override // k1.AbstractC0217a
    public final Random a() {
        Object obj = this.f3278c.get();
        f.d(obj, "get(...)");
        return (Random) obj;
    }
}
