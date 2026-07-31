package yads;

import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes12.dex */
public final class zu2 implements p30 {
    public final String a;
    public final SSLSocketFactory b;

    public zu2(String str, SSLSocketFactory sSLSocketFactory) {
        this.a = str;
        this.b = sSLSocketFactory;
    }

    @Override // yads.p30
    public final q30 a() {
        return new xu2(this.a, new y01(), this.b);
    }
}
