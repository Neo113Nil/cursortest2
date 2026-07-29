package o;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import com.google.firebase.messaging.Constants;
import java.util.HashMap;
import java.util.List;

/* renamed from: o.tJ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1950tJ {
    public final PackageManager a;
    public C1343k5 b;
    public HashMap c;
    public final HashMap d = new HashMap();

    public C1950tJ(C0208Hx c0208Hx) {
        this.a = (PackageManager) c0208Hx.i;
        c0208Hx.j = this;
    }

    public final void a(String str, String str2, boolean z, NC nc) {
        if (this.b == null) {
            nc.a(Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Plugin not bound to an Activity", null);
            return;
        }
        HashMap hashMap = this.c;
        if (hashMap == null) {
            nc.a(Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Can not process text actions before calling queryTextActions", null);
            return;
        }
        ResolveInfo resolveInfo = (ResolveInfo) hashMap.get(str);
        if (resolveInfo == null) {
            nc.a(Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Text processing activity not found", null);
            return;
        }
        int hashCode = nc.hashCode();
        this.d.put(Integer.valueOf(hashCode), nc);
        Intent intent = new Intent();
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        intent.setClassName(activityInfo.packageName, activityInfo.name);
        intent.setAction("android.intent.action.PROCESS_TEXT");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.PROCESS_TEXT", str2);
        intent.putExtra("android.intent.extra.PROCESS_TEXT_READONLY", z);
        ((Activity) this.b.h).startActivityForResult(intent, hashCode);
    }

    public final HashMap b() {
        List<ResolveInfo> queryIntentActivities;
        PackageManager.ResolveInfoFlags of;
        HashMap hashMap = this.c;
        PackageManager packageManager = this.a;
        if (hashMap == null) {
            this.c = new HashMap();
            Intent type = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
            if (Build.VERSION.SDK_INT >= 33) {
                of = PackageManager.ResolveInfoFlags.of(0L);
                queryIntentActivities = packageManager.queryIntentActivities(type, of);
            } else {
                queryIntentActivities = packageManager.queryIntentActivities(type, 0);
            }
            for (ResolveInfo resolveInfo : queryIntentActivities) {
                String str = resolveInfo.activityInfo.name;
                resolveInfo.loadLabel(packageManager).toString();
                this.c.put(str, resolveInfo);
            }
        }
        HashMap hashMap2 = new HashMap();
        for (String str2 : this.c.keySet()) {
            hashMap2.put(str2, ((ResolveInfo) this.c.get(str2)).loadLabel(packageManager).toString());
        }
        return hashMap2;
    }
}
