package com.facebook.ads.redexgen.core;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: assets/audience_network/classes2.dex */
public class VU implements View.OnTouchListener {
    public static String[] A01 = {"BENQAquhgvj7TT9", "G4ABWHEO8pFoECzre8aPRkd5RqzaS810", "PI8RZp2k0CYdM", "EmvTCi8E1ni5QktN6f", "uKZwthLDSYADW2ME8E7na2CL49A5zEt8", "f3ahGFeoLQ7BDTppBYhbDWzCsZGogVaH", "wyETLpONaJd07JaZyOo", "wX7oH8VfboeBvBElZn"};
    public final /* synthetic */ C2702Vz A00;

    public VU(C2702Vz c2702Vz) {
        this.A00 = c2702Vz;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C20736r c20736r;
        C20736r c20736r2;
        c20736r = this.A00.A07;
        if (c20736r != null) {
            int action = motionEvent.getAction();
            String[] strArr = A01;
            if (strArr[0].length() == strArr[2].length()) {
                throw new RuntimeException();
            }
            A01[6] = "VIP8zqVOsYs7o10MZlA";
            if (action == 1) {
                c20736r2 = this.A00.A07;
                c20736r2.A0s();
            }
        }
        return true;
    }
}
