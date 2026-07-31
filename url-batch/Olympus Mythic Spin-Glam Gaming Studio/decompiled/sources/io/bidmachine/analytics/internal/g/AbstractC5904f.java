package io.bidmachine.analytics.internal.g;

import io.bidmachine.analytics.ReaderConfig;
import io.bidmachine.analytics.internal.g.C5903e;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: io.bidmachine.analytics.internal.g.f, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC5904f {
    public static final C5903e.a a(ReaderConfig.Rule rule) {
        if (rule instanceof ReaderConfig.Rule.GeneralRule) {
            ReaderConfig.Rule.GeneralRule generalRule = (ReaderConfig.Rule.GeneralRule) rule;
            return new C5903e.a.C1734a(generalRule.getTag(), generalRule.getPath());
        }
        if (!(rule instanceof ReaderConfig.Rule.PurRule)) {
            throw new NoWhenBranchMatchedException();
        }
        ReaderConfig.Rule.PurRule purRule = (ReaderConfig.Rule.PurRule) rule;
        return new C5903e.a.b(purRule.getTag(), purRule.getPath(), purRule.getQuery(), purRule.getShouldReport());
    }
}
