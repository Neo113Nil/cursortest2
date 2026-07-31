package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.intrinsics.CancellableKt;
import kotlinx.coroutines.intrinsics.UndispatchedKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CoroutineStart.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JV\u0010\r\u001a\u00020\f\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u00052\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00062\u0006\u0010\n\u001a\u00028\u00002\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007H\u0087\u0002¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0018"}, d2 = {"Lkotlinx/coroutines/CoroutineStart;", "", "<init>", "(Ljava/lang/String;I)V", "R", "T", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "block", "receiver", "completion", "", "invoke", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)V", "", "isLazy", "()Z", "isLazy$annotations", "()V", "DEFAULT", "LAZY", "ATOMIC", "UNDISPATCHED", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CoroutineStart {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CoroutineStart[] $VALUES;
    public static final CoroutineStart DEFAULT = new CoroutineStart("DEFAULT", 0);
    public static final CoroutineStart LAZY = new CoroutineStart("LAZY", 1);
    public static final CoroutineStart ATOMIC = new CoroutineStart("ATOMIC", 2);
    public static final CoroutineStart UNDISPATCHED = new CoroutineStart("UNDISPATCHED", 3);

    /* compiled from: CoroutineStart.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CoroutineStart.values().length];
            try {
                iArr[CoroutineStart.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CoroutineStart.ATOMIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CoroutineStart.UNDISPATCHED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CoroutineStart.LAZY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final /* synthetic */ CoroutineStart[] $values() {
        return new CoroutineStart[]{DEFAULT, LAZY, ATOMIC, UNDISPATCHED};
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static /* synthetic */ void isLazy$annotations() {
    }

    private CoroutineStart(String str, int i) {
    }

    static {
        CoroutineStart[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public final <R, T> void invoke(@NotNull Function2 block, R receiver, @NotNull Continuation completion) {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            CancellableKt.startCoroutineCancellable(block, receiver, completion);
            return;
        }
        if (i == 2) {
            ContinuationKt.startCoroutine(block, receiver, completion);
        } else if (i == 3) {
            UndispatchedKt.startCoroutineUndispatched(block, receiver, completion);
        } else if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final boolean isLazy() {
        return this == LAZY;
    }

    public static CoroutineStart valueOf(String str) {
        return (CoroutineStart) Enum.valueOf(CoroutineStart.class, str);
    }

    public static CoroutineStart[] values() {
        return (CoroutineStart[]) $VALUES.clone();
    }
}
