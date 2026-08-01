package l1;

import i1.f;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import k1.AbstractC0217a;

/* renamed from: l1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0292a extends AbstractC0217a {
    @Override // k1.AbstractC0217a
    public final Random a() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        f.d(current, "current(...)");
        return current;
    }
}
