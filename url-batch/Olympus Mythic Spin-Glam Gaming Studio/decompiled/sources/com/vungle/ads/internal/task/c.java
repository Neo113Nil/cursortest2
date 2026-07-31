package com.vungle.ads.internal.task;

import android.content.Context;
import android.os.Bundle;
import com.vungle.ads.BuildConfig;
import com.vungle.ads.internal.persistence.FilePreferences;
import com.vungle.ads.internal.util.PathProvider;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;
import java.io.File;
import java.io.IOException;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes13.dex */
public final class c implements d {
    public final Context a;
    public final PathProvider b;

    static {
        new a();
    }

    public c(Context context, PathProvider pathProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pathProvider, "pathProvider");
        this.a = context;
        this.b = pathProvider;
    }

    @Override // com.vungle.ads.internal.task.d
    public final int a(Bundle bundle, h jobRunner) {
        File file;
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(jobRunner, "jobRunner");
        File vmDir = this.b.getVmDir();
        String string = bundle.getString("AD_ID_KEY");
        if (string == null || (file = this.b.b(string)) == null) {
            file = vmDir;
        }
        boolean z = u.a;
        t.a("CleanupJob", "CleanupJob: Current directory snapshot");
        try {
            if (!Intrinsics.areEqual(file, vmDir)) {
                com.vungle.ads.internal.util.n.a(file, (Set) null);
                return 0;
            }
            a();
            com.vungle.ads.internal.util.n.b(file, SetsKt.setOf((Object[]) new String[]{"omsdk.js", "omsdk-session.js"}));
            return 0;
        } catch (IOException unused) {
            return 1;
        }
    }

    public final void a() {
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, new b(this.a));
        int a = ((FilePreferences) lazy.getValue()).a("VERSION_CODE", -1);
        if (a < 70704) {
            if (a < 70000) {
                boolean z = u.a;
                t.a("CleanupJob", "CleanupJob: drop old files data");
                File file = new File(this.a.getNoBackupFilesDir(), "vungle_db");
                if (file.exists()) {
                    com.vungle.ads.internal.util.n.a(file, (Set) null);
                    com.vungle.ads.internal.util.n.a(new File(file.getPath() + "-journal"), (Set) null);
                } else {
                    this.a.deleteDatabase("vungle_db");
                }
                String string = this.a.getSharedPreferences("com.vungle.sdk", 0).getString("cache_path", null);
                this.a.deleteSharedPreferences("com.vungle.sdk");
                File noBackupFilesDir = this.a.getNoBackupFilesDir();
                Intrinsics.checkNotNullExpressionValue(noBackupFilesDir, "context.noBackupFilesDir");
                com.vungle.ads.internal.util.n.a(new File(noBackupFilesDir, "vungle_settings"), (Set) null);
                if (string != null) {
                    com.vungle.ads.internal.util.n.a(new File(string), (Set) null);
                }
            }
            if (a < 70100) {
                com.vungle.ads.internal.util.n.a(new File(this.a.getApplicationInfo().dataDir, "vungle"), (Set) null);
            }
            if (a < 70301) {
                try {
                    com.vungle.ads.internal.util.n.a(new File(this.b.a(), "vungleSettings"), (Set) null);
                    com.vungle.ads.internal.util.n.a(new File(this.b.a(), "failedTpatSet"), (Set) null);
                } catch (Exception e) {
                    boolean z2 = u.a;
                    t.a("CleanupJob", "Failed to delete temp data", e);
                }
            }
            if (a < 70500) {
                File noBackupFilesDir2 = this.a.getNoBackupFilesDir();
                try {
                    com.vungle.ads.internal.util.n.a(new File(noBackupFilesDir2, "failedTpats"), (Set) null);
                    com.vungle.ads.internal.util.n.a(new File(noBackupFilesDir2, "failedGenericTpats"), (Set) null);
                } catch (Exception e2) {
                    boolean z3 = u.a;
                    t.a("CleanupJob", "Failed to delete 742 tpat data", e2);
                }
            }
            if (a < 70600) {
                File noBackupFilesDir3 = this.a.getNoBackupFilesDir();
                try {
                    com.vungle.ads.internal.util.n.a(new File(noBackupFilesDir3, "vungle_cache/downloads"), (Set) null);
                    com.vungle.ads.internal.util.n.a(new File(noBackupFilesDir3, "vungle_cache/js"), (Set) null);
                } catch (Exception e3) {
                    boolean z4 = u.a;
                    t.a("CleanupJob", "Failed to delete 750 data", e3);
                }
            }
            ((FilePreferences) lazy.getValue()).b("VERSION_CODE", BuildConfig.VERSION_CODE).b();
        }
    }
}
