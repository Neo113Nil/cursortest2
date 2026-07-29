package o;

/* loaded from: classes.dex */
public class SA extends RA implements XE {
    @Override // o.RA, o.InterfaceC1455lp
    public final Object invoke() {
        Object invoke = super.invoke();
        if (invoke != null) {
            return invoke;
        }
        throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue", "invoke"));
    }
}
