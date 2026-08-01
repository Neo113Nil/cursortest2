package i1;

import g1.f;
import java.util.Random;

/* loaded from: classes.dex */
public final class c extends a {

    /* renamed from: c, reason: collision with root package name */
    public final b f2619c = new b();

    @Override // i1.a
    public final Random a() {
        Object obj = this.f2619c.get();
        f.d(obj, "get(...)");
        return (Random) obj;
    }
}
