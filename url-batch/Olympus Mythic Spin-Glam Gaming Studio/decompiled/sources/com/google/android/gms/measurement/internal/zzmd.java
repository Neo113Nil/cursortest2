package com.google.android.gms.measurement.internal;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.os.PersistableBundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzih;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes6.dex */
public final class zzmd extends zzg {
    private JobScheduler zza;

    public zzmd(zzio zzioVar) {
        super(zzioVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzg
    protected final void zzd() {
        this.zza = (JobScheduler) this.zzu.zzaT().getSystemService("jobscheduler");
    }

    @Override // com.google.android.gms.measurement.internal.zzg
    protected final boolean zzf() {
        return true;
    }

    final int zzh() {
        return "measurement-client".concat(String.valueOf(this.zzu.zzaT().getPackageName())).hashCode();
    }

    final zzih zzi() {
        zza();
        zzg();
        zzio zzioVar = this.zzu;
        if (!zzioVar.zzf().zzx(null, zzgi.zzaR)) {
            return zzih.CLIENT_FLAG_OFF;
        }
        if (this.zza == null) {
            return zzih.MISSING_JOB_SCHEDULER;
        }
        if (!zzioVar.zzf().zzE()) {
            return zzih.NOT_ENABLED_IN_MANIFEST;
        }
        zzio zzioVar2 = this.zzu;
        return zzioVar2.zzh().zzj() >= 119000 ? !zzqf.zzas(zzioVar.zzaT(), "com.google.android.gms.measurement.AppMeasurementJobService") ? zzih.MEASUREMENT_SERVICE_NOT_ENABLED : !zzioVar2.zzu().zzad() ? zzih.NON_PLAY_MODE : zzih.CLIENT_UPLOAD_ELIGIBLE : zzih.SDK_TOO_OLD;
    }

    public final void zzj(long j) {
        zza();
        zzg();
        JobScheduler jobScheduler = this.zza;
        if (jobScheduler != null && jobScheduler.getPendingJob(zzh()) != null) {
            this.zzu.zzaW().zzj().zza("[sgtm] There's an existing pending job, skip this schedule.");
            return;
        }
        zzih zzi = zzi();
        if (zzi != zzih.CLIENT_UPLOAD_ELIGIBLE) {
            this.zzu.zzaW().zzj().zzb("[sgtm] Not eligible for Scion upload", zzi.name());
            return;
        }
        zzio zzioVar = this.zzu;
        zzioVar.zzaW().zzj().zzb("[sgtm] Scheduling Scion upload, millis", Long.valueOf(j));
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.SCION_UPLOAD");
        zzioVar.zzaW().zzj().zzb("[sgtm] Scion upload job scheduled with result", ((JobScheduler) Preconditions.checkNotNull(this.zza)).schedule(new JobInfo.Builder(zzh(), new ComponentName(zzioVar.zzaT(), "com.google.android.gms.measurement.AppMeasurementJobService")).setRequiredNetworkType(1).setMinimumLatency(j).setOverrideDeadline(j + j).setExtras(persistableBundle).build()) == 1 ? "SUCCESS" : "FAILURE");
    }
}
