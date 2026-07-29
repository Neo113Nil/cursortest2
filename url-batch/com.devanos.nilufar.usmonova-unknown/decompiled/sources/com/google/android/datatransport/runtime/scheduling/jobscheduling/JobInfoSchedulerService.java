package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import o.AY;
import o.AbstractC1555nJ;
import o.C0950e6;
import o.C2293yW;
import o.F7;
import o.RunnableC1866s2;
import o.RunnableC2229xY;

/* loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {
    public static final /* synthetic */ int h = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i = jobParameters.getExtras().getInt("priority");
        int i2 = jobParameters.getExtras().getInt("attemptNumber");
        C2293yW.b(getApplicationContext());
        C0950e6 a = F7.a();
        a.P(string);
        a.k = AbstractC1555nJ.b(i);
        if (string2 != null) {
            a.j = Base64.decode(string2, 0);
        }
        AY ay = C2293yW.a().d;
        ay.e.execute(new RunnableC2229xY(ay, a.l(), i2, new RunnableC1866s2(this, 7, jobParameters)));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
