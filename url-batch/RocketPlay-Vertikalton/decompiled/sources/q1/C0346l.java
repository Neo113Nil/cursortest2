package q1;

/* renamed from: q1.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0346l extends i1.g implements h1.p {

    /* renamed from: c, reason: collision with root package name */
    public static final C0346l f3906c = new C0346l(2, 0);
    public static final C0346l d = new C0346l(2, 1);

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3907b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0346l(int i, int i2) {
        super(i);
        this.f3907b = i2;
    }

    @Override // h1.p
    public final Object d(Object obj, Object obj2) {
        switch (this.f3907b) {
            case 0:
                return ((Z0.i) obj).h((Z0.g) obj2);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                return bool;
            default:
                return ((Z0.i) obj).h((Z0.g) obj2);
        }
    }
}
