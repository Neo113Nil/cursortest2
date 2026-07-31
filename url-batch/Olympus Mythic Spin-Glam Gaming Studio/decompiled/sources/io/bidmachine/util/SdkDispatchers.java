package io.bidmachine.util;

import com.ironsource.X3;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;

/* compiled from: SdkDispatchers.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B/\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0007R\u001b\u0010\b\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u000e\u0010\nR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0010\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0011\u0010\nR\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lio/bidmachine/util/SdkDispatchers;", "", "mainProvider", "Lkotlin/Function0;", "Lkotlinx/coroutines/CoroutineDispatcher;", "ioProvider", "defaultProvider", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "default", "getDefault", "()Lkotlinx/coroutines/CoroutineDispatcher;", "default$delegate", "Lkotlin/Lazy;", "io", "getIo", "io$delegate", X3.i.Z, "getMain", "main$delegate", "Companion", "bidmachine-android-sdk_bd_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes14.dex */
public final class SdkDispatchers {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: default, reason: not valid java name */
    @NotNull
    private static final SdkDispatchers f3722default = new SdkDispatchers(new Function0() { // from class: io.bidmachine.util.SdkDispatchers$Companion$default$1
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final CoroutineDispatcher mo4828invoke() {
            return Dispatchers.getMain();
        }
    }, new Function0() { // from class: io.bidmachine.util.SdkDispatchers$Companion$default$2
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final CoroutineDispatcher mo4828invoke() {
            return Dispatchers.getIO();
        }
    }, new Function0() { // from class: io.bidmachine.util.SdkDispatchers$Companion$default$3
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: invoke */
        public final CoroutineDispatcher mo4828invoke() {
            return Dispatchers.getDefault();
        }
    });

    /* renamed from: default$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy default;

    @NotNull
    private final Function0 defaultProvider;

    /* renamed from: io$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy io;

    @NotNull
    private final Function0 ioProvider;

    /* renamed from: main$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy main;

    @NotNull
    private final Function0 mainProvider;

    public SdkDispatchers(@NotNull Function0 mainProvider, @NotNull Function0 ioProvider, @NotNull Function0 defaultProvider) {
        Intrinsics.checkNotNullParameter(mainProvider, "mainProvider");
        Intrinsics.checkNotNullParameter(ioProvider, "ioProvider");
        Intrinsics.checkNotNullParameter(defaultProvider, "defaultProvider");
        this.mainProvider = mainProvider;
        this.ioProvider = ioProvider;
        this.defaultProvider = defaultProvider;
        this.main = LazyKt.lazy(new Function0() { // from class: io.bidmachine.util.SdkDispatchers$main$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* renamed from: invoke */
            public final CoroutineDispatcher mo4828invoke() {
                Function0 function0;
                function0 = SdkDispatchers.this.mainProvider;
                return (CoroutineDispatcher) function0.mo4828invoke();
            }
        });
        this.io = LazyKt.lazy(new Function0() { // from class: io.bidmachine.util.SdkDispatchers$io$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* renamed from: invoke */
            public final CoroutineDispatcher mo4828invoke() {
                Function0 function0;
                function0 = SdkDispatchers.this.ioProvider;
                return (CoroutineDispatcher) function0.mo4828invoke();
            }
        });
        this.default = LazyKt.lazy(new Function0() { // from class: io.bidmachine.util.SdkDispatchers$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* renamed from: invoke */
            public final CoroutineDispatcher mo4828invoke() {
                Function0 function0;
                function0 = SdkDispatchers.this.defaultProvider;
                return (CoroutineDispatcher) function0.mo4828invoke();
            }
        });
    }

    @NotNull
    public final CoroutineDispatcher getMain() {
        return (CoroutineDispatcher) this.main.getValue();
    }

    @NotNull
    public final CoroutineDispatcher getIo() {
        return (CoroutineDispatcher) this.io.getValue();
    }

    @NotNull
    public final CoroutineDispatcher getDefault() {
        return (CoroutineDispatcher) this.default.getValue();
    }

    /* compiled from: SdkDispatchers.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/bidmachine/util/SdkDispatchers$Companion;", "", "()V", "default", "Lio/bidmachine/util/SdkDispatchers;", "getDefault", "()Lio/bidmachine/util/SdkDispatchers;", "bidmachine-android-sdk_bd_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @NotNull
        public final SdkDispatchers getDefault() {
            return SdkDispatchers.f3722default;
        }
    }
}
