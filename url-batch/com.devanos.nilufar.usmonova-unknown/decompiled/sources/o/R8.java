package o;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class R8 extends AbstractC1478m8 {
    public static final R8 f = new R8(1, 0, 7);

    static {
        new R8(new int[0]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R8(int... iArr) {
        super(Arrays.copyOf(iArr, iArr.length));
        AbstractC0048Bt.n(iArr, "numbers");
    }
}
