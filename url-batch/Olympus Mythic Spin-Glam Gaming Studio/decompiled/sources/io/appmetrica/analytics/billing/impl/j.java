package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.billinginterface.internal.ProductInfo;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoSender;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentModuleReporter;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleCounterReport;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes12.dex */
public final class j implements BillingInfoSender {
    public final ServiceComponentModuleReporter a;
    public final Executor b;
    public final o c;

    public j(@NotNull ServiceComponentModuleReporter serviceComponentModuleReporter, @NotNull Executor executor, @NotNull o oVar) {
        this.a = serviceComponentModuleReporter;
        this.b = executor;
        this.c = oVar;
    }

    public static final void a(j jVar, ProductInfo productInfo) {
        ServiceComponentModuleReporter serviceComponentModuleReporter = jVar.a;
        ServiceModuleCounterReport.Builder withType = ServiceModuleCounterReport.INSTANCE.newBuilder().withType(40976);
        jVar.c.getClass();
        serviceComponentModuleReporter.handleReport(withType.withValueBytes(o.a(productInfo)).build());
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoSender
    public final void sendInfo(@NotNull List<? extends ProductInfo> list) {
        for (final ProductInfo productInfo : list) {
            this.b.execute(new Runnable() { // from class: io.appmetrica.analytics.billing.impl.j$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    j.a(j.this, productInfo);
                }
            });
        }
    }

    public /* synthetic */ j(ServiceComponentModuleReporter serviceComponentModuleReporter, Executor executor, o oVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(serviceComponentModuleReporter, executor, (i & 4) != 0 ? new o() : oVar);
    }
}
