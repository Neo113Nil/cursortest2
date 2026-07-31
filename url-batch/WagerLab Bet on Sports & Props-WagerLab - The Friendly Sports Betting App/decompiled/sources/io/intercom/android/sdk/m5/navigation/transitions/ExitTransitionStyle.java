package io.intercom.android.sdk.m5.navigation.transitions;

import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import io.intercom.android.sdk.m5.navigation.transitions.ExitTransitionStyle;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TransitionStyle.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\n\u0010\t\u001a\u0004\u0018\u00010\nH&j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\u000b"}, d2 = {"Lio/intercom/android/sdk/m5/navigation/transitions/ExitTransitionStyle;", "", "<init>", "(Ljava/lang/String;I)V", "SLIDE_DOWN", "SLIDE_OUT_RIGHT", "SLIDE_OUT_LEFT", "NONE", "NULL", "transition", "Landroidx/compose/animation/ExitTransition;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class ExitTransitionStyle {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ExitTransitionStyle[] $VALUES;
    public static final ExitTransitionStyle SLIDE_DOWN = new SLIDE_DOWN("SLIDE_DOWN", 0);
    public static final ExitTransitionStyle SLIDE_OUT_RIGHT = new SLIDE_OUT_RIGHT("SLIDE_OUT_RIGHT", 1);
    public static final ExitTransitionStyle SLIDE_OUT_LEFT = new SLIDE_OUT_LEFT("SLIDE_OUT_LEFT", 2);
    public static final ExitTransitionStyle NONE = new ExitTransitionStyle("NONE", 3) { // from class: io.intercom.android.sdk.m5.navigation.transitions.ExitTransitionStyle.NONE
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // io.intercom.android.sdk.m5.navigation.transitions.ExitTransitionStyle
        public ExitTransition transition() {
            return ExitTransition.INSTANCE.getNone();
        }
    };
    public static final ExitTransitionStyle NULL = new ExitTransitionStyle("NULL", 4) { // from class: io.intercom.android.sdk.m5.navigation.transitions.ExitTransitionStyle.NULL
        @Override // io.intercom.android.sdk.m5.navigation.transitions.ExitTransitionStyle
        public ExitTransition transition() {
            return null;
        }

        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }
    };

    private static final /* synthetic */ ExitTransitionStyle[] $values() {
        return new ExitTransitionStyle[]{SLIDE_DOWN, SLIDE_OUT_RIGHT, SLIDE_OUT_LEFT, NONE, NULL};
    }

    public /* synthetic */ ExitTransitionStyle(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i);
    }

    public static EnumEntries<ExitTransitionStyle> getEntries() {
        return $ENTRIES;
    }

    public abstract ExitTransition transition();

    private ExitTransitionStyle(String str, int i) {
    }

    /* compiled from: TransitionStyle.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"io/intercom/android/sdk/m5/navigation/transitions/ExitTransitionStyle.SLIDE_DOWN", "Lio/intercom/android/sdk/m5/navigation/transitions/ExitTransitionStyle;", "transition", "Landroidx/compose/animation/ExitTransition;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class SLIDE_DOWN extends ExitTransitionStyle {
        /* JADX INFO: Access modifiers changed from: private */
        public static final int transition$lambda$0(int i) {
            return i;
        }

        SLIDE_DOWN(String str, int i) {
            super(str, i, null);
        }

        @Override // io.intercom.android.sdk.m5.navigation.transitions.ExitTransitionStyle
        public ExitTransition transition() {
            return EnterExitTransitionKt.slideOutVertically(AnimationSpecKt.tween$default(0, 0, null, 7, null), new Function1() { // from class: io.intercom.android.sdk.m5.navigation.transitions.ExitTransitionStyle$SLIDE_DOWN$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int transition$lambda$0;
                    transition$lambda$0 = ExitTransitionStyle.SLIDE_DOWN.transition$lambda$0(((Integer) obj).intValue());
                    return Integer.valueOf(transition$lambda$0);
                }
            });
        }
    }

    static {
        ExitTransitionStyle[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    /* compiled from: TransitionStyle.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"io/intercom/android/sdk/m5/navigation/transitions/ExitTransitionStyle.SLIDE_OUT_RIGHT", "Lio/intercom/android/sdk/m5/navigation/transitions/ExitTransitionStyle;", "transition", "Landroidx/compose/animation/ExitTransition;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class SLIDE_OUT_RIGHT extends ExitTransitionStyle {
        /* JADX INFO: Access modifiers changed from: private */
        public static final int transition$lambda$0(int i) {
            return i;
        }

        SLIDE_OUT_RIGHT(String str, int i) {
            super(str, i, null);
        }

        @Override // io.intercom.android.sdk.m5.navigation.transitions.ExitTransitionStyle
        public ExitTransition transition() {
            return EnterExitTransitionKt.slideOutHorizontally(AnimationSpecKt.tween$default(0, 0, null, 7, null), new Function1() { // from class: io.intercom.android.sdk.m5.navigation.transitions.ExitTransitionStyle$SLIDE_OUT_RIGHT$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int transition$lambda$0;
                    transition$lambda$0 = ExitTransitionStyle.SLIDE_OUT_RIGHT.transition$lambda$0(((Integer) obj).intValue());
                    return Integer.valueOf(transition$lambda$0);
                }
            });
        }
    }

    /* compiled from: TransitionStyle.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"io/intercom/android/sdk/m5/navigation/transitions/ExitTransitionStyle.SLIDE_OUT_LEFT", "Lio/intercom/android/sdk/m5/navigation/transitions/ExitTransitionStyle;", "transition", "Landroidx/compose/animation/ExitTransition;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class SLIDE_OUT_LEFT extends ExitTransitionStyle {
        /* JADX INFO: Access modifiers changed from: private */
        public static final int transition$lambda$0(int i) {
            return -i;
        }

        SLIDE_OUT_LEFT(String str, int i) {
            super(str, i, null);
        }

        @Override // io.intercom.android.sdk.m5.navigation.transitions.ExitTransitionStyle
        public ExitTransition transition() {
            return EnterExitTransitionKt.slideOutHorizontally(AnimationSpecKt.tween$default(0, 0, null, 7, null), new Function1() { // from class: io.intercom.android.sdk.m5.navigation.transitions.ExitTransitionStyle$SLIDE_OUT_LEFT$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int transition$lambda$0;
                    transition$lambda$0 = ExitTransitionStyle.SLIDE_OUT_LEFT.transition$lambda$0(((Integer) obj).intValue());
                    return Integer.valueOf(transition$lambda$0);
                }
            });
        }
    }

    public static ExitTransitionStyle valueOf(String str) {
        return (ExitTransitionStyle) Enum.valueOf(ExitTransitionStyle.class, str);
    }

    public static ExitTransitionStyle[] values() {
        return (ExitTransitionStyle[]) $VALUES.clone();
    }
}
