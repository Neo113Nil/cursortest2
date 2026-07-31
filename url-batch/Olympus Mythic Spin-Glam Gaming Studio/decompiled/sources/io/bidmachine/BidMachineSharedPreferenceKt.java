package io.bidmachine;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import io.bidmachine.internal.S;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\nJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0013J\u0015\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0010J\u001d\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0013J\u001d\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010!\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b#\u0010$J#\u0010'\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001f0%¢\u0006\u0004\b'\u0010(J\u001b\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001f0%2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lio/bidmachine/BidMachineSharedPreferenceKt;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "ttlSessionCount", "", "obtainBMIFV", "(Landroid/content/Context;I)Ljava/lang/String;", "generateBMIFV", "", "hasBMIFV", "(Landroid/content/Context;)Z", "getBMIFVTtlSessionCountRemaining", "(Landroid/content/Context;)I", "", "setBMIFVTtlSessionCountRemaining", "(Landroid/content/Context;I)V", "count", "increaseBMIFVTtlSessionCountRemaining", "decreaseBMIFVTtlSessionCountRemaining", "getLastBMIFVTtlSessionCount", "setLastBMIFVTtlSessionCount", "", "sdkInstallTime", "setSdkInstallTime", "(Landroid/content/Context;J)V", "getSdkInstallTime", "(Landroid/content/Context;)J", "Lio/bidmachine/internal/S;", "versionMilestone", "setCurrentVersionMilestone", "(Landroid/content/Context;Lio/bidmachine/internal/S;)V", "getCurrentVersionMilestone", "(Landroid/content/Context;)Lio/bidmachine/internal/S;", "", "historyVersionMilestoneList", "setHistoryVersionMilestoneList", "(Landroid/content/Context;Ljava/util/List;)V", "getHistoryVersionMilestoneList", "(Landroid/content/Context;)Ljava/util/List;", "clear", "(Landroid/content/Context;)V", "bidmachine-android-sdk_ba_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes15.dex */
public final class BidMachineSharedPreferenceKt {

    @NotNull
    public static final BidMachineSharedPreferenceKt INSTANCE = new BidMachineSharedPreferenceKt();

    private BidMachineSharedPreferenceKt() {
    }

    public static /* synthetic */ void decreaseBMIFVTtlSessionCountRemaining$default(BidMachineSharedPreferenceKt bidMachineSharedPreferenceKt, Context context, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 1;
        }
        bidMachineSharedPreferenceKt.decreaseBMIFVTtlSessionCountRemaining(context, i);
    }

    public static /* synthetic */ void increaseBMIFVTtlSessionCountRemaining$default(BidMachineSharedPreferenceKt bidMachineSharedPreferenceKt, Context context, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 1;
        }
        bidMachineSharedPreferenceKt.increaseBMIFVTtlSessionCountRemaining(context, i);
    }

    @VisibleForTesting
    public final /* synthetic */ void clear(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        n.b(context);
    }

    public final /* synthetic */ void decreaseBMIFVTtlSessionCountRemaining(Context context, int count) {
        Intrinsics.checkNotNullParameter(context, "context");
        n.a(context, count);
    }

    public final /* synthetic */ String generateBMIFV(Context context, int ttlSessionCount) {
        Intrinsics.checkNotNullParameter(context, "context");
        String b = n.b(context, ttlSessionCount);
        Intrinsics.checkNotNullExpressionValue(b, "generateBMIFV(context, ttlSessionCount)");
        return b;
    }

    public final /* synthetic */ int getBMIFVTtlSessionCountRemaining(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return n.d(context);
    }

    public final /* synthetic */ S getCurrentVersionMilestone(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return n.f(context);
    }

    public final /* synthetic */ List getHistoryVersionMilestoneList(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        List g = n.g(context);
        Intrinsics.checkNotNullExpressionValue(g, "getHistoryVersionMilestoneList(context)");
        return g;
    }

    public final /* synthetic */ int getLastBMIFVTtlSessionCount(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return n.q(context);
    }

    public final /* synthetic */ long getSdkInstallTime(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return n.t(context);
    }

    public final /* synthetic */ boolean hasBMIFV(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return n.z(context);
    }

    public final /* synthetic */ void increaseBMIFVTtlSessionCountRemaining(Context context, int count) {
        Intrinsics.checkNotNullParameter(context, "context");
        n.c(context, count);
    }

    public final /* synthetic */ String obtainBMIFV(Context context, int ttlSessionCount) {
        Intrinsics.checkNotNullParameter(context, "context");
        String d = n.d(context, ttlSessionCount);
        Intrinsics.checkNotNullExpressionValue(d, "obtainBMIFV(context, ttlSessionCount)");
        return d;
    }

    public final /* synthetic */ void setBMIFVTtlSessionCountRemaining(Context context, int ttlSessionCount) {
        Intrinsics.checkNotNullParameter(context, "context");
        n.e(context, ttlSessionCount);
    }

    public final /* synthetic */ void setCurrentVersionMilestone(Context context, S versionMilestone) {
        Intrinsics.checkNotNullParameter(context, "context");
        n.a(context, versionMilestone);
    }

    public final /* synthetic */ void setHistoryVersionMilestoneList(Context context, List historyVersionMilestoneList) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(historyVersionMilestoneList, "historyVersionMilestoneList");
        n.a(context, historyVersionMilestoneList);
    }

    public final /* synthetic */ void setLastBMIFVTtlSessionCount(Context context, int ttlSessionCount) {
        Intrinsics.checkNotNullParameter(context, "context");
        n.f(context, ttlSessionCount);
    }

    public final /* synthetic */ void setSdkInstallTime(Context context, long sdkInstallTime) {
        Intrinsics.checkNotNullParameter(context, "context");
        n.a(context, sdkInstallTime);
    }
}
