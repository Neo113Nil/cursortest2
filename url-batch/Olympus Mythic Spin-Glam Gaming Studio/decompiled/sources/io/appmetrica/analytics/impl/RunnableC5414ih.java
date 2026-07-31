package io.appmetrica.analytics.impl;

import com.yandex.div.core.DivActionHandler;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.KotlinVersion;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;

/* renamed from: io.appmetrica.analytics.impl.ih, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class RunnableC5414ih implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        TimePassedChecker timePassedChecker = new TimePassedChecker();
        SystemTimeProvider systemTimeProvider = new SystemTimeProvider();
        C5698tf y = Ka.I.y();
        if (timePassedChecker.didTimePassMillis(y.f(), TimeUnit.DAYS.toMillis(1L), "[ReportKotlinVersionTask]")) {
            KotlinVersion kotlinVersion = KotlinVersion.CURRENT;
            Pair pair = TuplesKt.to("major", Integer.valueOf(kotlinVersion.getMajor()));
            Pair pair2 = TuplesKt.to("minor", Integer.valueOf(kotlinVersion.getMinor()));
            Pair pair3 = TuplesKt.to(DivActionHandler.DivActionReason.PATCH, Integer.valueOf(kotlinVersion.getPatch()));
            StringBuilder sb = new StringBuilder();
            sb.append(kotlinVersion.getMajor());
            sb.append('.');
            sb.append(kotlinVersion.getMinor());
            sb.append('.');
            sb.append(kotlinVersion.getPatch());
            Map mapOf = MapsKt.mapOf(pair, pair2, pair3, TuplesKt.to("version", sb.toString()));
            C5340fk c5340fk = Dj.a;
            c5340fk.getClass();
            c5340fk.a(new C5314ek("kotlin_version", mapOf));
            y.a(systemTimeProvider.currentTimeMillis());
        }
    }
}
