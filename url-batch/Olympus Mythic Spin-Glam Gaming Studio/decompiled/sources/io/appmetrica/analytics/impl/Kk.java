package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleCounterReport;

/* loaded from: classes11.dex */
public final class Kk {
    public static C5326f6 a(ServiceModuleCounterReport serviceModuleCounterReport) {
        String value;
        C5326f6 c5326f6 = new C5326f6("", "", 0);
        c5326f6.d = serviceModuleCounterReport.getType();
        String name = serviceModuleCounterReport.getName();
        if (name != null) {
            c5326f6.a = name;
        }
        if (serviceModuleCounterReport.getValueBytes() == null && (value = serviceModuleCounterReport.getValue()) != null) {
            c5326f6.b = value;
        }
        byte[] valueBytes = serviceModuleCounterReport.getValueBytes();
        if (valueBytes != null) {
            c5326f6.setValueBytes(valueBytes);
        }
        return c5326f6;
    }
}
