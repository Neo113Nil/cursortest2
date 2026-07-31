package com.amazon.device.simplesignin.a.a.c;

import android.os.RemoteException;
import android.util.Log;
import com.amazon.d.a.j;
import com.amazon.device.simplesignin.a.a.c;
import com.amazon.device.simplesignin.a.a.d;
import com.amazon.device.simplesignin.model.RequestStatus;
import com.amazon.device.simplesignin.model.request.SSIEventRequest;
import com.amazon.device.simplesignin.model.response.RecordMetricsEventResponse;
import java.util.Map;

/* compiled from: RecordMetricsEventCommand.java */
/* loaded from: classes3.dex */
public class b extends c {
    private static final String b = "SSI_PublishMetric";
    private static final String c = "1.0";
    private static final String d = "b";

    b(a aVar, SSIEventRequest sSIEventRequest) {
        super(aVar, b, "1.0");
        super.a(com.amazon.device.simplesignin.a.a.a.t, sSIEventRequest.getEvent().toString());
        super.a(com.amazon.device.simplesignin.a.a.a.u, sSIEventRequest.getEpochTimestamp());
        if (sSIEventRequest.getFailureReason() != null) {
            super.a(com.amazon.device.simplesignin.a.a.a.v, sSIEventRequest.getFailureReason().toString());
        } else {
            super.a(com.amazon.device.simplesignin.a.a.a.v, "NA");
        }
    }

    @Override // com.amazon.a.a.n.a.h
    protected boolean b(j jVar) throws RemoteException {
        Map b2 = jVar.b();
        if (!b2.containsKey("success")) {
            a(RequestStatus.FAILURE);
            return false;
        }
        b(RequestStatus.SUCCESSFUL);
        return Boolean.parseBoolean(b2.get("success").toString());
    }

    @Override // com.amazon.device.simplesignin.a.a.c
    protected void a(RequestStatus requestStatus) {
        b(requestStatus);
    }

    private void b(RequestStatus requestStatus) {
        d dVar = (d) j();
        Log.i(d, "Response for request id: " + dVar.e() + " is: " + requestStatus.toString());
        RecordMetricsEventResponse recordMetricsEventResponse = new RecordMetricsEventResponse();
        recordMetricsEventResponse.setRequestId(dVar.e());
        recordMetricsEventResponse.setRequestStatus(requestStatus);
        super.a(recordMetricsEventResponse);
    }
}
