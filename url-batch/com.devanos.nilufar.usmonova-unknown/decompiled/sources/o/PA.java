package o;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class PA extends TA {
    public final /* synthetic */ int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PA(VA va, ConcurrentHashMap concurrentHashMap, InterfaceC2114vp interfaceC2114vp, int i) {
        super(va, concurrentHashMap, interfaceC2114vp);
        this.k = i;
    }

    public static /* synthetic */ void a(int i) {
        String str = i != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 3 ? 3 : 2];
        if (i == 1) {
            objArr[0] = "map";
        } else if (i == 2) {
            objArr[0] = "computation";
        } else if (i != 3) {
            objArr[0] = "storageManager";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
        }
        if (i != 3) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
        } else {
            objArr[1] = "computeIfAbsent";
        }
        if (i == 2) {
            objArr[2] = "computeIfAbsent";
        } else if (i != 3) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i == 3) {
            throw new IllegalStateException(format);
        }
    }

    @Override // o.TA, o.InterfaceC2114vp
    public Object invoke(Object obj) {
        switch (this.k) {
            case 1:
                Object invoke = super.invoke(obj);
                if (invoke != null) {
                    return invoke;
                }
                throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull", "invoke"));
            default:
                return super.invoke(obj);
        }
    }
}
