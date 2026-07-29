package o;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: o.es, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0998es {
    public int a;
    public int b;
    public final Object c;

    public C0998es(Context context) {
        this.b = 0;
        this.c = context;
    }

    public synchronized int a() {
        PackageInfo packageInfo;
        if (this.a == 0) {
            try {
                packageInfo = Z10.a((Context) this.c).a.getPackageManager().getPackageInfo("com.google.android.gms", 0);
            } catch (PackageManager.NameNotFoundException e) {
                Log.w("Metadata", "Failed to find package ".concat(e.toString()));
                packageInfo = null;
            }
            if (packageInfo != null) {
                this.a = packageInfo.versionCode;
            }
        }
        return this.a;
    }

    public synchronized int b() {
        int i = this.b;
        if (i != 0) {
            return i;
        }
        Context context = (Context) this.c;
        PackageManager packageManager = context.getPackageManager();
        if (Z10.a(context).a.getPackageManager().checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("Metadata", "Google Play services missing or without correct permission.");
            return 0;
        }
        int i2 = 1;
        if (!PX.d0()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                this.b = i2;
                return i2;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers != null && !queryBroadcastReceivers.isEmpty()) {
            i2 = 2;
            this.b = i2;
            return i2;
        }
        Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
        if (true == PX.d0()) {
            i2 = 2;
        }
        this.b = i2;
        return i2;
    }

    public C0998es(int i, String str, double d, double d2, double d3, double d4, int i2, int i3, ByteBuffer byteBuffer) {
        this.a = i;
        this.c = str;
        this.b = i2;
    }

    public C0998es() {
        this.c = new C0998es[256];
        this.a = 0;
        this.b = 0;
    }

    public C0998es(int i, int i2) {
        this.c = null;
        this.a = i;
        int i3 = i2 & 7;
        this.b = i3 == 0 ? 8 : i3;
    }
}
