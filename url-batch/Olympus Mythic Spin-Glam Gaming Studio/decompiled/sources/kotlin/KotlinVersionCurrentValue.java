package kotlin;

/* compiled from: KotlinVersion.kt */
/* loaded from: classes4.dex */
final class KotlinVersionCurrentValue {
    public static final KotlinVersionCurrentValue INSTANCE = new KotlinVersionCurrentValue();

    private KotlinVersionCurrentValue() {
    }

    public static final KotlinVersion get() {
        return new KotlinVersion(2, 1, 21);
    }
}
