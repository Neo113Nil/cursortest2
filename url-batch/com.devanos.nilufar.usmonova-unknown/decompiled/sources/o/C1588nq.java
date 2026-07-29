package o;

/* renamed from: o.nq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1588nq implements DC {
    public static final C1588nq b = new C1588nq(0);
    public final /* synthetic */ int a;

    public /* synthetic */ C1588nq(int i) {
        this.a = i;
    }

    @Override // o.DC
    public final C2018uL a(Class cls) {
        switch (this.a) {
            case 0:
                if (!AbstractC2181wq.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (C2018uL) AbstractC2181wq.d(cls.asSubclass(AbstractC2181wq.class)).c(3);
                } catch (Exception e) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // o.DC
    public final boolean b(Class cls) {
        switch (this.a) {
            case 0:
                return AbstractC2181wq.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
