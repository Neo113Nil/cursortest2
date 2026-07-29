package o;

/* renamed from: o.Ue, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0526Ue extends Error {
    public C0526Ue() {
        super("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0526Ue(String str) {
        super(str);
        AbstractC0048Bt.n(str, "message");
    }
}
