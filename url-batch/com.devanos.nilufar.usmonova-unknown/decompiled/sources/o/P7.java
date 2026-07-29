package o;

import android.window.BackEvent;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class P7 {
    public final C0950e6 a;

    public P7(C1183hf c1183hf, int i) {
        switch (i) {
            case 1:
                C0140Fh c0140Fh = new C0140Fh(11);
                C0950e6 c0950e6 = new C0950e6(c1183hf, "flutter/navigation", C0460Rq.G, 16);
                this.a = c0950e6;
                c0950e6.Q(c0140Fh);
                break;
            default:
                C1097gL c1097gL = new C1097gL(20);
                C0950e6 c0950e62 = new C0950e6(c1183hf, "flutter/backgesture", C1367kT.h, 16);
                this.a = c0950e62;
                c0950e62.Q(c1097gL);
                break;
        }
    }

    public static HashMap a(BackEvent backEvent) {
        float touchX;
        float touchY;
        float progress;
        int swipeEdge;
        HashMap hashMap = new HashMap(3);
        touchX = backEvent.getTouchX();
        touchY = backEvent.getTouchY();
        hashMap.put("touchOffset", (Float.isNaN(touchX) || Float.isNaN(touchY)) ? null : Arrays.asList(Float.valueOf(touchX), Float.valueOf(touchY)));
        progress = backEvent.getProgress();
        hashMap.put("progress", Float.valueOf(progress));
        swipeEdge = backEvent.getSwipeEdge();
        hashMap.put("swipeEdge", Integer.valueOf(swipeEdge));
        return hashMap;
    }
}
