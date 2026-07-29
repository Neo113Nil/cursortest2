package o;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* renamed from: o.tI, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1949tI extends J {
    @Override // o.J
    public final Random b() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        AbstractC0048Bt.m(current, "current(...)");
        return current;
    }
}
