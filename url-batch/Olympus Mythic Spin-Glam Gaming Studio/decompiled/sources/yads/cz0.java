package yads;

import android.os.IBinder;
import android.os.IInterface;
import com.monetization.ads.core.identifiers.ad.gms.service.GmsServiceAdvertisingInfoReader;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public final class cz0 {
    public final mc a(yy0 yy0Var) {
        try {
            IBinder iBinder = (IBinder) yy0Var.a.poll(5L, TimeUnit.SECONDS);
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
            GmsServiceAdvertisingInfoReader gmsServiceAdvertisingInfoReader = queryLocalInterface instanceof GmsServiceAdvertisingInfoReader ? (GmsServiceAdvertisingInfoReader) queryLocalInterface : null;
            if (gmsServiceAdvertisingInfoReader == null) {
                gmsServiceAdvertisingInfoReader = new GmsServiceAdvertisingInfoReader(iBinder);
            }
            String readAdvertisingId = gmsServiceAdvertisingInfoReader.readAdvertisingId();
            Boolean readAdTrackingLimited = gmsServiceAdvertisingInfoReader.readAdTrackingLimited();
            mc mcVar = (readAdTrackingLimited == null || readAdvertisingId == null) ? null : new mc(readAdvertisingId, readAdTrackingLimited.booleanValue());
            boolean z = ob1.a;
            return mcVar;
        } catch (InterruptedException unused) {
            boolean z2 = ob1.a;
            return null;
        }
    }
}
