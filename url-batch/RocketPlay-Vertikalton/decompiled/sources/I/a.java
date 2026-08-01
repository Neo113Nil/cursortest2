package I;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f570e = new byte[1792];

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f571a;

    /* renamed from: b, reason: collision with root package name */
    public final int f572b;

    /* renamed from: c, reason: collision with root package name */
    public int f573c;
    public char d;

    static {
        for (int i = 0; i < 1792; i++) {
            f570e[i] = Character.getDirectionality(i);
        }
    }

    public a(CharSequence charSequence) {
        this.f571a = charSequence;
        this.f572b = charSequence.length();
    }

    public final byte a() {
        int i = this.f573c - 1;
        CharSequence charSequence = this.f571a;
        char charAt = charSequence.charAt(i);
        this.d = charAt;
        if (Character.isLowSurrogate(charAt)) {
            int codePointBefore = Character.codePointBefore(charSequence, this.f573c);
            this.f573c -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.f573c--;
        char c2 = this.d;
        return c2 < 1792 ? f570e[c2] : Character.getDirectionality(c2);
    }
}
