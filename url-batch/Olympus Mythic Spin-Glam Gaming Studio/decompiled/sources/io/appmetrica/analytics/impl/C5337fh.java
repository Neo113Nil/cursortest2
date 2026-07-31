package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.pm.FeatureInfo;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.fh, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C5337fh extends AbstractC5208ah {
    public final SafePackageManager b;

    public C5337fh(C5532n5 c5532n5) {
        this(c5532n5, new SafePackageManager());
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004d A[Catch: all -> 0x00c0, TryCatch #0 {all -> 0x00c0, blocks: (B:9:0x0043, B:11:0x004d, B:12:0x0051, B:13:0x005a, B:15:0x0060, B:17:0x0083, B:19:0x0088, B:22:0x008c), top: B:8:0x0043 }] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0051 A[Catch: all -> 0x00c0, TryCatch #0 {all -> 0x00c0, blocks: (B:9:0x0043, B:11:0x004d, B:12:0x0051, B:13:0x005a, B:15:0x0060, B:17:0x0083, B:19:0x0088, B:22:0x008c), top: B:8:0x0043 }] */
    @Override // io.appmetrica.analytics.impl.AbstractC5208ah
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(@NonNull C5326f6 c5326f6) {
        HashSet hashSet;
        ArrayList b;
        C5532n5 c5532n5 = this.a;
        if (c5532n5.t.c() && c5532n5.y()) {
            C5621qf c5621qf = c5532n5.c;
            String e = this.a.c.e();
            try {
                if (!TextUtils.isEmpty(e)) {
                    try {
                        hashSet = new HashSet();
                        JSONArray jSONArray = new JSONArray(e);
                        for (int i = 0; i < jSONArray.length(); i++) {
                            hashSet.add(new C5511ma(jSONArray.getJSONObject(i)));
                        }
                    } catch (Throwable unused) {
                    }
                    b = b();
                    if (CollectionUtils.areCollectionsEqual(hashSet, b)) {
                        JSONArray jSONArray2 = new JSONArray();
                        Iterator it = b.iterator();
                        while (it.hasNext()) {
                            C5511ma c5511ma = (C5511ma) it.next();
                            c5511ma.getClass();
                            JSONObject put = new JSONObject().put("name", c5511ma.a).put("required", c5511ma.c);
                            int i2 = c5511ma.b;
                            if (i2 != -1) {
                                put.put("version", i2);
                            }
                            jSONArray2.put(put);
                        }
                        C5326f6 a = C5326f6.a(c5326f6, new JSONObject().put("features", jSONArray2).toString());
                        E9 e9 = c5532n5.n;
                        e9.a(a, C5470kl.a(e9.c.b(a), a.i));
                        int i3 = e9.j;
                        e9.l = i3;
                        e9.a.a(i3);
                        c5621qf.i(jSONArray2.toString());
                    } else {
                        c5532n5.v();
                    }
                }
                b = b();
                if (CollectionUtils.areCollectionsEqual(hashSet, b)) {
                }
            } catch (Throwable unused2) {
            }
            hashSet = null;
        }
        return false;
    }

    public final ArrayList b() {
        FeatureInfo[] featureInfoArr;
        try {
            C5532n5 c5532n5 = this.a;
            SafePackageManager safePackageManager = this.b;
            Context context = c5532n5.a;
            PackageInfo packageInfo = safePackageManager.getPackageInfo(context, context.getPackageName(), 16384);
            ArrayList arrayList = new ArrayList();
            AbstractC5485la c5433ja = AndroidUtils.isApiAchieved(24) ? new C5433ja() : new C5459ka();
            if (packageInfo != null && (featureInfoArr = packageInfo.reqFeatures) != null) {
                for (FeatureInfo featureInfo : featureInfoArr) {
                    arrayList.add(c5433ja.a(featureInfo));
                }
            }
            return arrayList;
        } catch (Throwable unused) {
            return null;
        }
    }

    @VisibleForTesting
    public C5337fh(C5532n5 c5532n5, @NonNull SafePackageManager safePackageManager) {
        super(c5532n5);
        this.b = safePackageManager;
    }
}
