package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.tb, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C5694tb implements Parcelable {
    public static final Parcelable.Creator<C5694tb> CREATOR = new C5668sb();
    public final ResultReceiver a;
    public final List b;
    public final HashMap c;
    public final boolean d;

    public C5694tb(T6 t6, List list, Map map, boolean z) {
        this.b = list;
        this.a = t6;
        this.c = map == null ? new HashMap() : new HashMap(map);
        this.d = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("io.appmetrica.analytics.internal.CounterConfiguration.receiver", this.a);
        if (this.b != null) {
            bundle.putStringArrayList("io.appmetrica.analytics.internal.CounterConfiguration.identifiersList", new ArrayList<>(this.b));
        }
        HashMap hashMap = this.c;
        if (hashMap != null) {
            bundle.putString("io.appmetrica.analytics.internal.CounterConfiguration.clidsForVerification", Wm.a((Map) hashMap));
        }
        bundle.putBoolean("io.appmetrica.analytics.internal.CounterConfiguration.forceRefreshConfiguration", this.d);
        parcel.writeBundle(bundle);
    }

    public C5694tb(Parcel parcel) {
        Bundle readBundle = parcel.readBundle(T6.class.getClassLoader());
        if (readBundle != null) {
            this.a = (ResultReceiver) readBundle.getParcelable("io.appmetrica.analytics.internal.CounterConfiguration.receiver");
            this.b = readBundle.getStringArrayList("io.appmetrica.analytics.internal.CounterConfiguration.identifiersList");
            this.c = Wm.a(readBundle.getString("io.appmetrica.analytics.internal.CounterConfiguration.clidsForVerification"));
            this.d = readBundle.getBoolean("io.appmetrica.analytics.internal.CounterConfiguration.forceRefreshConfiguration");
            return;
        }
        this.c = new HashMap();
    }
}
