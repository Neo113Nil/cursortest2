package com.mobilefuse.sdk.exception;

import com.ironsource.X3;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.exception.TryKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Try.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u001a,\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0005H\u0086\bø\u0001\u0000\u001a4\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u00032\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0005H\u0086\bø\u0001\u0000\u001a4\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u00032\u0006\u0010\b\u001a\u00020\t2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0005H\u0086\bø\u0001\u0000\u001a<\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0005H\u0086\bø\u0001\u0000\u001a\u001a\u0010\n\u001a\u00020\u000b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0005H\u0086\bø\u0001\u0000\u001a\"\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0005H\u0086\bø\u0001\u0000\u001a\"\u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\t2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0005H\u0086\bø\u0001\u0000\u001a*\u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0005H\u0086\bø\u0001\u0000\u001a-\u0010\f\u001a\u0002H\u0003\"\u0004\b\u0000\u0010\u00032\u0006\u0010\r\u001a\u0002H\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0005H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u000e\u001a5\u0010\f\u001a\u0002H\u0003\"\u0004\b\u0000\u0010\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\r\u001a\u0002H\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0005H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u000f\u001a5\u0010\f\u001a\u0002H\u0003\"\u0004\b\u0000\u0010\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u0002H\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0005H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u0010\u001a=\u0010\f\u001a\u0002H\u0003\"\u0004\b\u0000\u0010\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\r\u001a\u0002H\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0005H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u0011\u001a\"\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00052\u000e\b\u0004\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0005H\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0013"}, d2 = {"gracefullyHandleException", "Lcom/mobilefuse/sdk/exception/Either;", "", "T", "block", "Lkotlin/Function0;", X3.f.e, "Lcom/mobilefuse/sdk/exception/ExceptionHandlingStrategy;", "source", "", "handleExceptions", "", "handleExceptionsWithDefault", "defaultValue", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "(Lcom/mobilefuse/sdk/exception/ExceptionHandlingStrategy;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "(Ljava/lang/String;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "(Ljava/lang/String;Lcom/mobilefuse/sdk/exception/ExceptionHandlingStrategy;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "runnableTry", "mobilefuse-sdk-common_release"}, k = 2, mv = {1, 4, 3})
/* loaded from: classes13.dex */
public final class TryKt {

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 3}, xi = 128)
    /* loaded from: classes5.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[ExceptionHandlingStrategy.values().length];
            $EnumSwitchMapping$0 = iArr;
            ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
            iArr[exceptionHandlingStrategy.ordinal()] = 1;
            ExceptionHandlingStrategy exceptionHandlingStrategy2 = ExceptionHandlingStrategy.Ignore;
            iArr[exceptionHandlingStrategy2.ordinal()] = 2;
            int[] iArr2 = new int[ExceptionHandlingStrategy.values().length];
            $EnumSwitchMapping$1 = iArr2;
            iArr2[exceptionHandlingStrategy.ordinal()] = 1;
            iArr2[exceptionHandlingStrategy2.ordinal()] = 2;
            int[] iArr3 = new int[ExceptionHandlingStrategy.values().length];
            $EnumSwitchMapping$2 = iArr3;
            iArr3[exceptionHandlingStrategy.ordinal()] = 1;
            iArr3[exceptionHandlingStrategy2.ordinal()] = 2;
        }
    }

    public static final void handleExceptions(@NotNull Function0 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            block.mo4828invoke();
        } catch (Throwable th) {
            int i = WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public static final void handleExceptions(@NotNull String source, @NotNull Function0 block) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(block, "block");
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            block.mo4828invoke();
        } catch (Throwable th) {
            int i = WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException(source, th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public static final void handleExceptions(@NotNull ExceptionHandlingStrategy strategy, @NotNull Function0 block) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(block, "block");
        try {
            block.mo4828invoke();
        } catch (Throwable th) {
            int i = WhenMappings.$EnumSwitchMapping$0[strategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public static final void handleExceptions(@NotNull String source, @NotNull ExceptionHandlingStrategy strategy, @NotNull Function0 block) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(block, "block");
        try {
            block.mo4828invoke();
        } catch (Throwable th) {
            int i = WhenMappings.$EnumSwitchMapping$0[strategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException(source, th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public static final <T> T handleExceptionsWithDefault(T t, @NotNull Function0 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            return (T) block.mo4828invoke();
        } catch (Throwable th) {
            if (WhenMappings.$EnumSwitchMapping$1[exceptionHandlingStrategy.ordinal()] != 1) {
                return t;
            }
            StabilityHelper.logException("[Automatically caught]", th);
            return t;
        }
    }

    public static final <T> T handleExceptionsWithDefault(@NotNull String source, T t, @NotNull Function0 block) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(block, "block");
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            return (T) block.mo4828invoke();
        } catch (Throwable th) {
            if (WhenMappings.$EnumSwitchMapping$1[exceptionHandlingStrategy.ordinal()] != 1) {
                return t;
            }
            StabilityHelper.logException(source, th);
            return t;
        }
    }

    public static final <T> T handleExceptionsWithDefault(@NotNull ExceptionHandlingStrategy strategy, T t, @NotNull Function0 block) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(block, "block");
        try {
            return (T) block.mo4828invoke();
        } catch (Throwable th) {
            if (WhenMappings.$EnumSwitchMapping$1[strategy.ordinal()] != 1) {
                return t;
            }
            StabilityHelper.logException("[Automatically caught]", th);
            return t;
        }
    }

    public static final <T> T handleExceptionsWithDefault(@NotNull String source, @NotNull ExceptionHandlingStrategy strategy, T t, @NotNull Function0 block) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(block, "block");
        try {
            return (T) block.mo4828invoke();
        } catch (Throwable th) {
            if (WhenMappings.$EnumSwitchMapping$1[strategy.ordinal()] != 1) {
                return t;
            }
            StabilityHelper.logException(source, th);
            return t;
        }
    }

    @NotNull
    public static final Function0 runnableTry(@NotNull final Function0 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return new Function0() { // from class: com.mobilefuse.sdk.exception.TryKt$runnableTry$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo4828invoke() {
                invoke();
                return Unit.INSTANCE;
            }

            public final void invoke() {
                ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
                try {
                    Function0.this.mo4828invoke();
                } catch (Throwable th) {
                    int i = TryKt.WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
                    if (i == 1) {
                        StabilityHelper.logException("[Automatically caught]", th);
                    } else if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
        };
    }

    @NotNull
    public static final <T> Either<Throwable, T> gracefullyHandleException(@NotNull Function0 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            return new SuccessResult(block.mo4828invoke());
        } catch (Throwable th) {
            if (WhenMappings.$EnumSwitchMapping$2[exceptionHandlingStrategy.ordinal()] == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            }
            return new ErrorResult(th);
        }
    }

    @NotNull
    public static final <T> Either<Throwable, T> gracefullyHandleException(@NotNull String source, @NotNull Function0 block) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(block, "block");
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            return new SuccessResult(block.mo4828invoke());
        } catch (Throwable th) {
            if (WhenMappings.$EnumSwitchMapping$2[exceptionHandlingStrategy.ordinal()] == 1) {
                StabilityHelper.logException(source, th);
            }
            return new ErrorResult(th);
        }
    }

    @NotNull
    public static final <T> Either<Throwable, T> gracefullyHandleException(@NotNull ExceptionHandlingStrategy strategy, @NotNull Function0 block) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(block, "block");
        try {
            return new SuccessResult(block.mo4828invoke());
        } catch (Throwable th) {
            if (WhenMappings.$EnumSwitchMapping$2[strategy.ordinal()] == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            }
            return new ErrorResult(th);
        }
    }

    @NotNull
    public static final <T> Either<Throwable, T> gracefullyHandleException(@NotNull String source, @NotNull ExceptionHandlingStrategy strategy, @NotNull Function0 block) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(block, "block");
        try {
            return new SuccessResult(block.mo4828invoke());
        } catch (Throwable th) {
            if (WhenMappings.$EnumSwitchMapping$2[strategy.ordinal()] == 1) {
                StabilityHelper.logException(source, th);
            }
            return new ErrorResult(th);
        }
    }
}
