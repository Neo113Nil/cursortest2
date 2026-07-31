package io.appmetrica.analytics.impl;

import com.ironsource.X3;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessorsHolder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.y5, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C5818y5 implements ModuleAdRevenueProcessor, ModuleAdRevenueProcessorsHolder {
    public final ArrayList a = new ArrayList();

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor
    @NotNull
    public final String getDescription() {
        return CollectionsKt.joinToString$default(this.a, null, "Composite processor with " + this.a.size() + " children: [", X3.j.e, 0, null, C5792x5.a, 25, null);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor
    public final boolean process(@NotNull Object... objArr) {
        Object obj;
        boolean process;
        LoggerStorage.getMainPublicOrAnonymousLogger().info("Processing Ad Revenue for " + Arrays.toString(objArr), new Object[0]);
        Iterator it = this.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            ModuleAdRevenueProcessor moduleAdRevenueProcessor = (ModuleAdRevenueProcessor) obj;
            try {
                process = moduleAdRevenueProcessor.process(Arrays.copyOf(objArr, objArr.length));
                if (!process) {
                    LoggerStorage.getMainPublicOrAnonymousLogger().info("Ad Revenue was not processed by " + moduleAdRevenueProcessor.getDescription(), new Object[0]);
                }
            } catch (Throwable th) {
                LoggerStorage.getMainPublicOrAnonymousLogger().error(th, "Got exception from processor " + moduleAdRevenueProcessor.getDescription(), new Object[0]);
            }
            if (process) {
                break;
            }
        }
        boolean z = ((ModuleAdRevenueProcessor) obj) != null;
        if (!z) {
            LoggerStorage.getMainPublicOrAnonymousLogger().info("Ad Revenue was not processed by " + getDescription() + " since processor for " + Arrays.toString(objArr) + " was not found", new Object[0]);
        }
        return z;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessorsHolder
    public final void register(@NotNull ModuleAdRevenueProcessor moduleAdRevenueProcessor) {
        this.a.add(moduleAdRevenueProcessor);
    }
}
