package com.safedk.android.analytics.brandsafety;

import com.safedk.android.analytics.events.MaxEvents;
import com.safedk.android.utils.Logger;
import java.util.Iterator;

/* loaded from: classes12.dex */
public class q {
    public static final int a = 50;
    public static final int b = 10;
    public static final int c = 30000;
    private static final String d = "MaxEventsManager";
    private static final Object e = new Object();
    private static q f;
    private MaxEvents g = new MaxEvents(50);
    private MaxEvents h = new MaxEvents(5);

    private q() {
    }

    public static q a() {
        q qVar;
        synchronized (e) {
            if (f == null) {
                f = new q();
            }
            qVar = f;
        }
        return qVar;
    }

    public synchronized void a(com.safedk.android.analytics.events.a aVar) {
        this.g.add(aVar);
    }

    public void b(com.safedk.android.analytics.events.a aVar) {
        Logger.d(d, "Adding MAX Will display event. #event is ", Integer.valueOf(this.h.size()), ",  maxEvent=", aVar.toString());
        this.h.add(aVar);
    }

    public MaxEvents b() {
        MaxEvents d2 = d();
        if (d2.size() >= 10) {
            return d2;
        }
        return a(10);
    }

    private synchronized MaxEvents d() {
        MaxEvents maxEvents;
        long currentTimeMillis = System.currentTimeMillis();
        Logger.d(d, "");
        maxEvents = new MaxEvents(50);
        Iterator<com.safedk.android.analytics.events.a> it = this.g.iterator();
        while (it.hasNext()) {
            com.safedk.android.analytics.events.a next = it.next();
            if (currentTimeMillis - (next.c() * 1000) < 30000) {
                Logger.d(d, "getEventFromLastInterval Adding max event ts = ", Long.valueOf(currentTimeMillis), ", ", next.toString());
                maxEvents.add(next);
            }
        }
        return maxEvents;
    }

    public synchronized MaxEvents a(int i) {
        MaxEvents maxEvents;
        maxEvents = new MaxEvents(i);
        for (int size = this.g.size() < 10 ? 0 : this.g.size() - 10; size < this.g.size(); size++) {
            Logger.d(d, "getLastXEvents adding max event index ", Integer.valueOf(size), " ", this.g.get(size).toString());
            maxEvents.add(new com.safedk.android.analytics.events.a(this.g.get(size)));
        }
        return maxEvents;
    }

    public MaxEvents c() {
        return this.h;
    }
}
