package com.ironsource;

import android.util.Pair;
import com.ironsource.D7;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;

/* loaded from: classes12.dex */
public class I5 implements Runnable {
    private static final String e = "Content-Type";
    private static final String f = "application/json";
    private D7 a;
    String b;
    String c;
    ArrayList<C4966x5> d;

    public I5(D7 d7, String str, String str2, ArrayList<C4966x5> arrayList) {
        this.a = d7;
        this.b = str;
        this.c = str2;
        this.d = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        D7.a a;
        D7.a aVar = new D7.a(this.d);
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new Pair("Content-Type", "application/json"));
            Qd b = C4589c8.b(this.c, this.b, arrayList);
            a = aVar.a(b.a()).a(b.a);
        } catch (Exception e2) {
            C4782n4.d().a(e2);
            IronLog.INTERNAL.error("EventsSender failed to send events - " + e2.getLocalizedMessage());
            a = aVar.a(e2 instanceof Gc).a(e2);
        }
        D7 d7 = this.a;
        if (d7 != null) {
            d7.a(a);
        }
    }
}
