package o;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* loaded from: classes.dex */
public final class D20 extends com.google.android.gms.common.internal.a {
    public final WU y;

    public D20(Context context, Looper looper, C0950e6 c0950e6, WU wu, C1274j20 c1274j20, C1274j20 c1274j202) {
        super(context, looper, 270, c0950e6, c1274j20, c1274j202);
        this.y = wu;
    }

    @Override // o.D4
    public final int f() {
        return 203400000;
    }

    @Override // com.google.android.gms.common.internal.a
    public final IInterface o(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return queryLocalInterface instanceof C2263y20 ? (C2263y20) queryLocalInterface : new C2263y20(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    @Override // com.google.android.gms.common.internal.a
    public final C0300Ll[] p() {
        return AbstractC0868ct.l;
    }

    @Override // com.google.android.gms.common.internal.a
    public final Bundle q() {
        this.y.getClass();
        return new Bundle();
    }

    @Override // com.google.android.gms.common.internal.a
    public final String r() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // com.google.android.gms.common.internal.a
    public final String s() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // com.google.android.gms.common.internal.a
    public final boolean t() {
        return true;
    }
}
