package o;

/* renamed from: o.b4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC0752b4 {
    NO_ARGUMENTS(3),
    /* JADX INFO: Fake field, exist only in values array */
    UNLESS_EMPTY(2),
    /* JADX INFO: Fake field, exist only in values array */
    ALWAYS_PARENTHESIZED(true, true);

    public final boolean h;
    public final boolean i;

    /* synthetic */ EnumC0752b4(int i) {
        this((i & 1) == 0, false);
    }

    EnumC0752b4(boolean z, boolean z2) {
        this.h = z;
        this.i = z2;
    }
}
