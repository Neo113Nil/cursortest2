package com.my.tracker.obfuscated;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.my.tracker.MyTrackerConfig;
import com.my.tracker.obfuscated.j;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes13.dex */
public final class k {
    private static final j a = new j(Collections.EMPTY_LIST);

    private static String a(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((j.a) it.next()).a);
        }
        return TextUtils.join(StringUtils.COMMA, arrayList);
    }

    private static List b(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            PackageInfo packageInfo = (PackageInfo) it.next();
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            if ((applicationInfo.flags & 1) == 0) {
                arrayList.add(new j.a(applicationInfo.packageName, v2.b(packageInfo.firstInstallTime)));
            }
        }
        return arrayList;
    }

    public j a(MyTrackerConfig.InstalledPackagesProvider installedPackagesProvider, Context context) {
        List<PackageInfo> list;
        if (installedPackagesProvider == null) {
            return a;
        }
        try {
            list = installedPackagesProvider.getInstalledPackages();
        } catch (Throwable unused) {
            x2.b("MyTracker error: exception at InstalledPackagesProvider::getInstalledPackages()");
            list = null;
        }
        if (list != null && !list.isEmpty()) {
            List b = b(list);
            if (b.isEmpty()) {
                return a;
            }
            String a2 = a(b);
            String g = p1.a(context).g();
            String a3 = b0.a(a2);
            if (g.equals(a3)) {
                x2.a("AppsDataProvider: Apps hash did not changed");
                return a;
            }
            x2.a("AppsDataProvider: Apps hash changed");
            p1.a(context).h(a3);
            return new j(b);
        }
        return a;
    }
}
