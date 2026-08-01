package I;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f232e = new byte[1792];

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f233a;

    /* renamed from: b, reason: collision with root package name */
    public final int f234b;

    /* renamed from: c, reason: collision with root package name */
    public int f235c;
    public char d;

    static {
        for (int i = 0; i < 1792; i++) {
            f232e[i] = Character.getDirectionality(i);
        }
    }

    public a(CharSequence charSequence) {
        this.f233a = charSequence;
        this.f234b = charSequence.length();
    }

    public final byte a() {
        int i = this.f235c - 1;
        CharSequence charSequence = this.f233a;
        char charAt = charSequence.charAt(i);
        this.d = charAt;
        if (Character.isLowSurrogate(charAt)) {
            int codePointBefore = Character.codePointBefore(charSequence, this.f235c);
            this.f235c -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.f235c--;
        char c2 = this.d;
        return c2 < 1792 ? f232e[c2] : Character.getDirectionality(c2);
    }
}
