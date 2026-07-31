package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;

/* renamed from: io.appmetrica.analytics.impl.e6, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C5300e6 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        G9 g9;
        Bundle readBundle = parcel.readBundle(T6.class.getClassLoader());
        if (readBundle.containsKey("CounterReport.Source")) {
            int i = readBundle.getInt("CounterReport.Source");
            G9[] values = G9.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    g9 = G9.NATIVE;
                    break;
                }
                g9 = values[i2];
                if (g9.a == i) {
                    break;
                }
                i2++;
            }
        } else {
            g9 = null;
        }
        C5326f6 c5326f6 = new C5326f6("", "", 0);
        EnumC5798xb enumC5798xb = EnumC5798xb.EVENT_TYPE_UNDEFINED;
        c5326f6.d = readBundle.getInt("CounterReport.Type", -1);
        c5326f6.e = readBundle.getInt("CounterReport.CustomType");
        c5326f6.b = StringUtils.ifIsNullToDef(readBundle.getString("CounterReport.Value"), "");
        c5326f6.c = readBundle.getString("CounterReport.Environment");
        c5326f6.a = readBundle.getString("CounterReport.Event");
        c5326f6.f = C5326f6.a(readBundle);
        c5326f6.g = readBundle.getInt("CounterReport.TRUNCATED");
        c5326f6.h = readBundle.getString("CounterReport.ProfileID");
        c5326f6.i = readBundle.getLong("CounterReport.CreationElapsedRealtime");
        c5326f6.j = readBundle.getLong("CounterReport.CreationTimestamp");
        c5326f6.k = Aa.a(Integer.valueOf(readBundle.getInt("CounterReport.UniquenessStatus")));
        c5326f6.l = g9;
        c5326f6.m = readBundle.getBundle("CounterReport.Payload");
        c5326f6.n = readBundle.containsKey("CounterReport.AttributionIdChanged") ? Boolean.valueOf(readBundle.getBoolean("CounterReport.AttributionIdChanged")) : null;
        c5326f6.o = readBundle.containsKey("CounterReport.OpenId") ? Integer.valueOf(readBundle.getInt("CounterReport.OpenId")) : null;
        c5326f6.p = CollectionUtils.bundleToMap(readBundle.getBundle("CounterReport.Extras"));
        return c5326f6;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new C5326f6[i];
    }
}
