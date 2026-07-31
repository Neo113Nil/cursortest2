package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.cache.CachedDataProvider;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes10.dex */
public final class Hl implements Hn {
    public static final long d = TimeUnit.SECONDS.toMillis(20);
    public final Context a;
    public final PermissionExtractor b;
    public final CachedDataProvider.CachedData c;

    public Hl(Context context) {
        long j = d;
        this.c = new CachedDataProvider.CachedData(j, j, "sim-info");
        this.a = context;
        this.b = Ka.k().j();
    }

    public final Cl b() {
        return new Cl((Integer) SystemServiceUtils.accessSystemServiceByNameSafely(this.a, "phone", "getting SimMcc", "TelephonyManager", new Dl()), (Integer) SystemServiceUtils.accessSystemServiceByNameSafely(this.a, "phone", "getting SimMnc", "TelephonyManager", new El()), ((Boolean) SystemServiceUtils.accessSystemServiceByNameSafelyOrDefault(this.a, "phone", "getting NetworkRoaming", "TelephonyManager", Boolean.FALSE, new Gl(this))).booleanValue(), (String) SystemServiceUtils.accessSystemServiceByNameSafely(this.a, "phone", "getting SimOperatorName", "TelephonyManager", new Fl()));
    }

    @Override // io.appmetrica.analytics.impl.Hn
    @Nullable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final synchronized List<Cl> a() {
        List<Cl> list;
        try {
            List<Cl> list2 = (List) this.c.getData();
            if (list2 != null) {
                boolean isEmpty = list2.isEmpty();
                list = list2;
                if (isEmpty) {
                    list = list2;
                    if (this.c.shouldUpdateData()) {
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            if (Ka.I.u.a().n.d) {
                if (AndroidUtils.isApiAchieved(23)) {
                    if (this.b.hasPermission(this.a, "android.permission.READ_PHONE_STATE")) {
                        arrayList.addAll(Il.a(this.a));
                    }
                    if (arrayList.size() == 0) {
                        arrayList.add(b());
                    }
                } else {
                    arrayList.add(b());
                }
            }
            this.c.setData(arrayList);
            list = arrayList;
        } catch (Throwable th) {
            throw th;
        }
        return list;
    }
}
