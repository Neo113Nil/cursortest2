package io.bidmachine.util;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ProcessUrlResult.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lio/bidmachine/util/ProcessUrlResult;", "", "isSuccess", "", "systemComponent", "Lio/bidmachine/util/SystemComponent;", "(ZLio/bidmachine/util/SystemComponent;)V", "()Z", "getSystemComponent", "()Lio/bidmachine/util/SystemComponent;", "Companion", "bidmachine-android-sdk_bd_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class ProcessUrlResult {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final ProcessUrlResult FAIL;

    @NotNull
    private static final ProcessUrlResult SUCCESS;
    private final boolean isSuccess;

    @Nullable
    private final SystemComponent systemComponent;

    public ProcessUrlResult(boolean z, @Nullable SystemComponent systemComponent) {
        this.isSuccess = z;
        this.systemComponent = systemComponent;
    }

    public /* synthetic */ ProcessUrlResult(boolean z, SystemComponent systemComponent, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? null : systemComponent);
    }

    @Nullable
    public final SystemComponent getSystemComponent() {
        return this.systemComponent;
    }

    /* renamed from: isSuccess, reason: from getter */
    public final boolean getIsSuccess() {
        return this.isSuccess;
    }

    /* compiled from: ProcessUrlResult.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lio/bidmachine/util/ProcessUrlResult$Companion;", "", "()V", "FAIL", "Lio/bidmachine/util/ProcessUrlResult;", "getFAIL", "()Lio/bidmachine/util/ProcessUrlResult;", "SUCCESS", "getSUCCESS", "bidmachine-android-sdk_bd_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @NotNull
        public final ProcessUrlResult getSUCCESS() {
            return ProcessUrlResult.SUCCESS;
        }

        @NotNull
        public final ProcessUrlResult getFAIL() {
            return ProcessUrlResult.FAIL;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        int i = 2;
        SUCCESS = new ProcessUrlResult(true, 0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
        FAIL = new ProcessUrlResult(false, 0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
    }
}
