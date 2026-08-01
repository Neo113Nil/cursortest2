package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.util.Log;
import defpackage.mz;
import defpackage.p01;
import defpackage.x40;
import defpackage.xh0;
import java.io.File;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Bundle extras;
        File codeCacheDir;
        Context createDeviceProtectedStorageContext;
        Context createDeviceProtectedStorageContext2;
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
            mz.Z(context, new xh0(), new p01(15, this), true);
            return;
        }
        if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
            Bundle extras2 = intent.getExtras();
            if (extras2 != null) {
                String string = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
                if (!"WRITE_SKIP_FILE".equals(string)) {
                    if ("DELETE_SKIP_FILE".equals(string)) {
                        new File(context.getFilesDir(), "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
                        Log.d("ProfileInstaller", "RESULT_DELETE_SKIP_FILE_SUCCESS");
                        setResultCode(11);
                        return;
                    }
                    return;
                }
                p01 p01Var = new p01(15, this);
                try {
                    mz.L(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
                    p01Var.d(10, null);
                    return;
                } catch (PackageManager.NameNotFoundException e) {
                    p01Var.d(7, e);
                    return;
                }
            }
            return;
        }
        if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
            p01 p01Var2 = new p01(15, this);
            if (Build.VERSION.SDK_INT < 24) {
                p01Var2.d(13, null);
                return;
            } else {
                Process.sendSignal(Process.myPid(), 10);
                p01Var2.d(12, null);
                return;
            }
        }
        if (!"androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) || (extras = intent.getExtras()) == null) {
            return;
        }
        String string2 = extras.getString("EXTRA_BENCHMARK_OPERATION");
        p01 p01Var3 = new p01(15, this);
        if (!"DROP_SHADER_CACHE".equals(string2)) {
            p01Var3.d(16, null);
            return;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            createDeviceProtectedStorageContext2 = context.createDeviceProtectedStorageContext();
            codeCacheDir = createDeviceProtectedStorageContext2.getCacheDir();
        } else if (i >= 24) {
            createDeviceProtectedStorageContext = context.createDeviceProtectedStorageContext();
            codeCacheDir = createDeviceProtectedStorageContext.getCodeCacheDir();
        } else {
            codeCacheDir = i == 23 ? context.getCodeCacheDir() : context.getCacheDir();
        }
        if (x40.x(codeCacheDir)) {
            p01Var3.d(14, null);
        } else {
            p01Var3.d(15, null);
        }
    }
}
