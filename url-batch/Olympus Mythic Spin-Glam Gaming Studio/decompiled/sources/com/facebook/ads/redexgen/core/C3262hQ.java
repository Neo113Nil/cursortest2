package com.facebook.ads.redexgen.core;

import com.facebook.ads.AdListener;

/* renamed from: com.facebook.ads.redexgen.X.hQ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C3262hQ extends WP {
    public static String[] A02 = {"aYZ348mE1NYrFcMBoebQMkiZFG78oX5w", "qZgy2fVZKkcRQxGeLIPji8yDZzfZsU0K", "FW", "4WpWxoGmbDHaVYPSEbV5W", "JuvmjYnKk99PR9XqbJ5bpADbGT7vNhdJ", "90qKQYWe37jbHMTFJzGbdEUnuOp61wed", "dYksIGNGyyMeZtC5mrM4so", "pL5NnltKvH9DFuMzl1s9TskXUqu4u7R4"};
    public final /* synthetic */ C3258hM A00;
    public final /* synthetic */ C2690Vm A01;

    public C3262hQ(C3258hM c3258hM, C2690Vm c2690Vm) {
        this.A00 = c3258hM;
        this.A01 = c2690Vm;
    }

    @Override // com.facebook.ads.redexgen.core.WP
    public final void A01() {
        C2579Rd c2579Rd;
        C2579Rd c2579Rd2;
        C2579Rd c2579Rd3;
        c2579Rd = this.A00.A01;
        if (c2579Rd.A06() != null) {
            c2579Rd2 = this.A00.A01;
            AdListener A06 = c2579Rd2.A06();
            c2579Rd3 = this.A00.A01;
            if (A02[2].length() != 2) {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[3] = "zGBwvDJj20KV94Zd2N0fZ";
            strArr[6] = "5j2wCmqr0QfuHbPw5sx74i";
            A06.onError(c2579Rd3.A07(), XE.A00(this.A01));
        }
    }
}
