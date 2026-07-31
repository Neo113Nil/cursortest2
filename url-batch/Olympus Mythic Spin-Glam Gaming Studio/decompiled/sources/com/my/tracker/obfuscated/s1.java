package com.my.tracker.obfuscated;

import android.content.Context;
import android.content.Intent;
import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class s1 {
    final Context a;
    final n0 b;
    final e c;

    private s1(e0 e0Var, Context context) {
        this.b = n0.a(e0Var, context);
        this.c = e.a(e0Var, p1.a(context), context);
        this.a = context.getApplicationContext();
    }

    public static s1 a(e0 e0Var, Context context) {
        return new s1(e0Var, context);
    }

    public void b(int i, Intent intent) {
        String str;
        InstallSourceInfo installSourceInfo;
        PackageManager packageManager = this.a.getPackageManager();
        try {
            String packageName = this.a.getPackageName();
            if (Build.VERSION.SDK_INT >= 30) {
                installSourceInfo = packageManager.getInstallSourceInfo(packageName);
                str = installSourceInfo.getInstallingPackageName();
            } else {
                str = packageManager.getInstallerPackageName(packageName);
            }
        } catch (Throwable th) {
            x2.a("PurchaseHandler: can't detect installer package –" + th.getMessage());
            str = "";
        }
        x2.a("PurchaseHandler: installer package is " + str);
        str.getClass();
        if (str.equals("com.huawei.appmarket")) {
            x2.a("PurchaseHandler: appGalleryMarket detected");
            a(i, intent);
        } else if (str.equals("com.android.vending")) {
            x2.a("PurchaseHandler: googleStore detected");
            this.b.a(i, intent);
        } else {
            x2.a("PurchaseHandler: store not detected");
            this.b.a(i, intent);
            a(i, intent);
        }
    }

    public void a() {
        this.b.a();
        e eVar = this.c;
        if (eVar == null) {
            x2.a("PurchaseHandler: can't init appGalleryPurchaseHandler, appGallery purchases dependency not implemented");
        } else {
            eVar.a();
        }
    }

    public void a(JSONObject jSONObject, JSONObject jSONObject2, String str, Map map) {
        this.b.a(jSONObject, jSONObject2, str, map);
    }

    void a(int i, Intent intent) {
        e eVar = this.c;
        if (eVar == null) {
            x2.a("PurchaseHandler: can't do appGalleryPurchaseHandler.onActivityResult(), appGallery purchases dependency not implemented");
        } else {
            eVar.a(i, intent);
        }
    }

    public void a(int i, List list) {
        this.b.a(i, list);
    }

    public void a(Object obj, String str, String str2, String str3, Map map) {
        e eVar = this.c;
        if (eVar == null) {
            x2.a("PurchaseHandler: can't trackAppGalleryPurchase, appGallery purchases dependency not implemented");
        } else {
            eVar.b(obj, str, str2, str3, map);
        }
    }
}
