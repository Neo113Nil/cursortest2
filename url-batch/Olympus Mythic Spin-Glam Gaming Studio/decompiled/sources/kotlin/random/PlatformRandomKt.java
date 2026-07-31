package kotlin.random;

/* compiled from: PlatformRandom.kt */
/* loaded from: classes15.dex */
public abstract class PlatformRandomKt {
    public static final double doubleFromParts(int i, int i2) {
        return ((i << 27) + i2) / 9.007199254740992E15d;
    }
}
