package o;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.database.Cursor;
import android.os.PersistableBundle;
import android.util.Base64;
import android.util.Log;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Set;
import java.util.zip.Adler32;

/* renamed from: o.Fu, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0153Fu {
    public final Context a;
    public final InterfaceC0480Sk b;
    public final D7 c;

    public C0153Fu(Context context, InterfaceC0480Sk interfaceC0480Sk, D7 d7) {
        this.a = context;
        this.b = interfaceC0480Sk;
        this.c = d7;
    }

    public final void a(F7 f7, int i, boolean z) {
        Context context = this.a;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        String str = f7.a;
        String str2 = f7.a;
        adler32.update(str.getBytes(Charset.forName("UTF-8")));
        ByteBuffer allocate = ByteBuffer.allocate(4);
        EnumC1489mJ enumC1489mJ = f7.c;
        adler32.update(allocate.putInt(AbstractC1555nJ.a(enumC1489mJ)).array());
        byte[] bArr = f7.b;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (!z) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                JobInfo next = it.next();
                int i2 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i2 >= i) {
                        AbstractC0868ct.q("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", f7);
                        return;
                    }
                }
            }
        }
        Cursor rawQuery = ((C1495mP) this.b).b().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str2, String.valueOf(AbstractC1555nJ.a(enumC1489mJ))});
        try {
            Long valueOf = rawQuery.moveToNext() ? Long.valueOf(rawQuery.getLong(0)) : 0L;
            rawQuery.close();
            long longValue = valueOf.longValue();
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            D7 d7 = this.c;
            builder.setMinimumLatency(d7.a(enumC1489mJ, longValue, i));
            Set set = ((E7) d7.b.get(enumC1489mJ)).c;
            if (set.contains(EnumC0708aQ.h)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(EnumC0708aQ.j)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(EnumC0708aQ.i)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i);
            persistableBundle.putString("backendName", str2);
            persistableBundle.putInt("priority", AbstractC1555nJ.a(enumC1489mJ));
            if (bArr != null) {
                persistableBundle.putString("extras", Base64.encodeToString(bArr, 0));
            }
            builder.setExtras(persistableBundle);
            Object[] objArr = {f7, Integer.valueOf(value), Long.valueOf(d7.a(enumC1489mJ, longValue, i)), valueOf, Integer.valueOf(i)};
            String B = AbstractC0868ct.B("JobInfoScheduler");
            if (Log.isLoggable(B, 3)) {
                Log.d(B, String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr));
            }
            jobScheduler.schedule(builder.build());
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }
}
