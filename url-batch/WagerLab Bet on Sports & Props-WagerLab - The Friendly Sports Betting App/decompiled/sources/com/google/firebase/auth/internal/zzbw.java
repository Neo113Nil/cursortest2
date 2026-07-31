package com.google.firebase.auth.internal;

import android.app.Application;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.p002firebaseauthapi.zzahs;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.RecaptchaTasksClient;
import java.util.List;
import java.util.Objects;
import org.apache.commons.io.IOUtils;

/* compiled from: com.google.firebase:firebase-auth@@24.0.1 */
/* loaded from: classes6.dex */
final class zzbw implements Continuation<zzahs, Task<RecaptchaTasksClient>> {
    private final /* synthetic */ String zza;
    private final /* synthetic */ zzbx zzb;

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Task<RecaptchaTasksClient> then(Task<zzahs> task) throws Exception {
        if (!task.isSuccessful()) {
            return Tasks.forException(new zzbu((String) Preconditions.checkNotNull(((Exception) Preconditions.checkNotNull(task.getException())).getMessage())));
        }
        zzahs result = task.getResult();
        String zza = result.zza();
        if (com.google.android.gms.internal.p002firebaseauthapi.zzac.zzc(zza)) {
            return Tasks.forException(new zzbu("No Recaptcha Enterprise siteKey configured for tenant/project " + this.zza));
        }
        List<String> zza2 = com.google.android.gms.internal.p002firebaseauthapi.zzt.zza(IOUtils.DIR_SEPARATOR_UNIX).zza((CharSequence) zza);
        String str = zza2.size() != 4 ? null : zza2.get(3);
        if (TextUtils.isEmpty(str)) {
            return Tasks.forException(new Exception("Invalid siteKey format " + zza));
        }
        if (Log.isLoggable("RecaptchaHandler", 4)) {
            Log.i("RecaptchaHandler", "Successfully obtained site key for tenant " + this.zza);
        }
        Task<RecaptchaTasksClient> zza3 = this.zzb.zzb.zza((Application) this.zzb.zza.getApplicationContext(), str);
        zzbx.zza(this.zzb, result, zza3, this.zza);
        return zza3;
    }

    zzbw(zzbx zzbxVar, String str) {
        this.zza = str;
        Objects.requireNonNull(zzbxVar);
        this.zzb = zzbxVar;
    }
}
