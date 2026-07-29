package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import o.AY;
import o.AbstractC1555nJ;
import o.C0950e6;
import o.C2293yW;
import o.F7;
import o.RunnableC0749b2;
import o.RunnableC2229xY;

/* loaded from: classes.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i = intent.getExtras().getInt("attemptNumber");
        C2293yW.b(context);
        C0950e6 a2 = F7.a();
        a2.P(queryParameter);
        a2.k = AbstractC1555nJ.b(intValue);
        if (queryParameter2 != null) {
            a2.j = Base64.decode(queryParameter2, 0);
        }
        AY ay = C2293yW.a().d;
        ay.e.execute(new RunnableC2229xY(ay, a2.l(), i, new RunnableC0749b2()));
    }
}
