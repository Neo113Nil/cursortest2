package io.bidmachine.analytics.internal.t;

/* loaded from: classes6.dex */
public final class g {
    private final int a;
    private final StringBuffer b;
    private Long c;

    public g(int i, int i2) {
        this.a = i2;
        this.b = new StringBuffer(i);
    }

    public final Long a() {
        return this.c;
    }

    public String toString() {
        return this.b.toString();
    }

    public final void a(String str) {
        if (this.b.length() + str.length() < this.a) {
            this.b.append((CharSequence) str).append('\n');
            this.c = Long.valueOf(System.currentTimeMillis());
        }
    }
}
