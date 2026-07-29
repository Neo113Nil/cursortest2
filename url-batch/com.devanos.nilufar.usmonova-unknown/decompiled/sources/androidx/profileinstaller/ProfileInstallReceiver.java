package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Process;
import android.util.Log;
import java.io.File;
import o.AbstractC0022At;
import o.AbstractC1473m3;
import o.C1818rJ;
import o.ExecutorC2280yJ;

/* loaded from: classes.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Bundle extras;
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
            AbstractC0022At.N(context, new ExecutorC2280yJ(), new C1818rJ(2, this), true);
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
                C1818rJ c1818rJ = new C1818rJ(2, this);
                try {
                    AbstractC0022At.A(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
                    c1818rJ.j(10, null);
                    return;
                } catch (PackageManager.NameNotFoundException e) {
                    c1818rJ.j(7, e);
                    return;
                }
            }
            return;
        }
        if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
            Process.sendSignal(Process.myPid(), 10);
            Log.d("ProfileInstaller", "");
            setResultCode(12);
        } else {
            if (!"androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) || (extras = intent.getExtras()) == null) {
                return;
            }
            String string2 = extras.getString("EXTRA_BENCHMARK_OPERATION");
            C1818rJ c1818rJ2 = new C1818rJ(2, this);
            if (!"DROP_SHADER_CACHE".equals(string2)) {
                c1818rJ2.j(16, null);
            } else if (AbstractC1473m3.v(context.createDeviceProtectedStorageContext().getCodeCacheDir())) {
                c1818rJ2.j(14, null);
            } else {
                c1818rJ2.j(15, null);
            }
        }
    }
}
