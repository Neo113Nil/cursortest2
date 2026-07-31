package io.intercom.android.sdk.survey.ui.models;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import com.amazon.a.a.h.a;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData;
import io.intercom.android.sdk.models.AttributeType;
import io.intercom.android.sdk.survey.ui.models.Answer;
import io.intercom.android.sdk.ui.common.StringProvider;
import io.intercom.android.sdk.utilities.TimeFormatter;
import java.text.DecimalFormat;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: Answer.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0005\u0006\u0007\b\t\nB\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H&\u0082\u0001\u0005\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lio/intercom/android/sdk/survey/ui/models/Answer;", "", "<init>", "()V", "getLength", "", "DateTimeAnswer", "SingleAnswer", "MultipleAnswer", "NoAnswer", "MediaAnswer", "Lio/intercom/android/sdk/survey/ui/models/Answer$DateTimeAnswer;", "Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer;", "Lio/intercom/android/sdk/survey/ui/models/Answer$MultipleAnswer;", "Lio/intercom/android/sdk/survey/ui/models/Answer$NoAnswer;", "Lio/intercom/android/sdk/survey/ui/models/Answer$SingleAnswer;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class Answer {
    public static final int $stable = 0;

    public /* synthetic */ Answer(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract int getLength();

    private Answer() {
    }

    /* compiled from: Answer.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000e\u001a\u00020\u0005H\u0016J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0010J\u0006\u0010\u0012\u001a\u00020\u0010J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0005H\u0002J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J'\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH×\u0003J\t\u0010\u001d\u001a\u00020\u0005H×\u0001J\t\u0010\u001e\u001a\u00020\u0010H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u001f"}, d2 = {"Lio/intercom/android/sdk/survey/ui/models/Answer$DateTimeAnswer;", "Lio/intercom/android/sdk/survey/ui/models/Answer;", AttributeType.DATE, "", "hours", "", "minutes", "<init>", "(JII)V", "getDate", "()J", "getHours", "()I", "getMinutes", "getLength", "getLocalTime", "", "getDateAsString", "getAnswer", "formatTime", a.b, "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DateTimeAnswer extends Answer {
        public static final int $stable = 0;
        private final long date;
        private final int hours;
        private final int minutes;

        public static /* synthetic */ DateTimeAnswer copy$default(DateTimeAnswer dateTimeAnswer, long j, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                j = dateTimeAnswer.date;
            }
            if ((i3 & 2) != 0) {
                i = dateTimeAnswer.hours;
            }
            if ((i3 & 4) != 0) {
                i2 = dateTimeAnswer.minutes;
            }
            return dateTimeAnswer.copy(j, i, i2);
        }

        /* renamed from: component1, reason: from getter */
        public final long getDate() {
            return this.date;
        }

        /* renamed from: component2, reason: from getter */
        public final int getHours() {
            return this.hours;
        }

        /* renamed from: component3, reason: from getter */
        public final int getMinutes() {
            return this.minutes;
        }

        public final DateTimeAnswer copy(long date, int hours, int minutes) {
            return new DateTimeAnswer(date, hours, minutes);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DateTimeAnswer)) {
                return false;
            }
            DateTimeAnswer dateTimeAnswer = (DateTimeAnswer) other;
            return this.date == dateTimeAnswer.date && this.hours == dateTimeAnswer.hours && this.minutes == dateTimeAnswer.minutes;
        }

        public int hashCode() {
            return (((Long.hashCode(this.date) * 31) + Integer.hashCode(this.hours)) * 31) + Integer.hashCode(this.minutes);
        }

        public String toString() {
            return "DateTimeAnswer(date=" + this.date + ", hours=" + this.hours + ", minutes=" + this.minutes + ')';
        }

        public DateTimeAnswer(long j, int i, int i2) {
            super(null);
            this.date = j;
            this.hours = i;
            this.minutes = i2;
        }

        public final long getDate() {
            return this.date;
        }

        public final int getHours() {
            return this.hours;
        }

        public final int getMinutes() {
            return this.minutes;
        }

        @Override // io.intercom.android.sdk.survey.ui.models.Answer
        public int getLength() {
            return new StringBuilder().append(this.date).append(this.hours).append(this.minutes).toString().length();
        }

        public final String getLocalTime() {
            int i;
            int i2 = this.hours;
            if (i2 == -1 || (i = this.minutes) == -1) {
                return "";
            }
            String formatFromUtcTime = TimeFormatter.formatFromUtcTime(i2, i);
            Intrinsics.checkNotNullExpressionValue(formatFromUtcTime, "formatFromUtcTime(...)");
            return formatFromUtcTime;
        }

        public final String getDateAsString() {
            long j = this.date;
            if (j == -1) {
                return "";
            }
            String formatTimeInMillisAsDate = TimeFormatter.formatTimeInMillisAsDate(j, "YYYY-MM-dd");
            Intrinsics.checkNotNullExpressionValue(formatTimeInMillisAsDate, "formatTimeInMillisAsDate(...)");
            return formatTimeInMillisAsDate;
        }

        public final String getAnswer() {
            return getDateAsString() + 'T' + formatTime(this.hours) + AbstractJsonLexerKt.COLON + formatTime(this.minutes) + ":00Z";
        }

        private final String formatTime(int time) {
            String format = new DecimalFormat("00").format(Integer.valueOf(RangesKt.coerceAtLeast(time, 0)));
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            return format;
        }
    }

    /* compiled from: Answer.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH×\u0003J\t\u0010\u0010\u001a\u00020\tH×\u0001J\t\u0010\u0011\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/intercom/android/sdk/survey/ui/models/Answer$SingleAnswer;", "Lio/intercom/android/sdk/survey/ui/models/Answer;", "answer", "", "<init>", "(Ljava/lang/String;)V", "getAnswer", "()Ljava/lang/String;", "getLength", "", "component1", "copy", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SingleAnswer extends Answer {
        public static final int $stable = 0;
        private final String answer;

        public static /* synthetic */ SingleAnswer copy$default(SingleAnswer singleAnswer, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = singleAnswer.answer;
            }
            return singleAnswer.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAnswer() {
            return this.answer;
        }

        public final SingleAnswer copy(String answer) {
            Intrinsics.checkNotNullParameter(answer, "answer");
            return new SingleAnswer(answer);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SingleAnswer) && Intrinsics.areEqual(this.answer, ((SingleAnswer) other).answer);
        }

        public int hashCode() {
            return this.answer.hashCode();
        }

        public String toString() {
            return "SingleAnswer(answer=" + this.answer + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SingleAnswer(String answer) {
            super(null);
            Intrinsics.checkNotNullParameter(answer, "answer");
            this.answer = answer;
        }

        public final String getAnswer() {
            return this.answer;
        }

        @Override // io.intercom.android.sdk.survey.ui.models.Answer
        public int getLength() {
            return this.answer.length();
        }
    }

    /* compiled from: Answer.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001cB\u001f\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u0004J\u000e\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0006J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0010J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J#\u0010\u0015\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÇ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H×\u0003J\t\u0010\u001a\u001a\u00020\u0012H×\u0001J\t\u0010\u001b\u001a\u00020\u0004H×\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001d"}, d2 = {"Lio/intercom/android/sdk/survey/ui/models/Answer$MultipleAnswer;", "Lio/intercom/android/sdk/survey/ui/models/Answer;", "answers", "", "", "otherAnswer", "Lio/intercom/android/sdk/survey/ui/models/Answer$MultipleAnswer$OtherAnswer;", "<init>", "(Ljava/util/Set;Lio/intercom/android/sdk/survey/ui/models/Answer$MultipleAnswer$OtherAnswer;)V", "getAnswers", "()Ljava/util/Set;", "getOtherAnswer", "()Lio/intercom/android/sdk/survey/ui/models/Answer$MultipleAnswer$OtherAnswer;", "copyWithAnswerToggled", "answer", "copyWithOther", "", "getLength", "", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "OtherAnswer", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MultipleAnswer extends Answer {
        public static final int $stable = 8;
        private final Set<String> answers;
        private final OtherAnswer otherAnswer;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ MultipleAnswer copy$default(MultipleAnswer multipleAnswer, Set set, OtherAnswer otherAnswer, int i, Object obj) {
            if ((i & 1) != 0) {
                set = multipleAnswer.answers;
            }
            if ((i & 2) != 0) {
                otherAnswer = multipleAnswer.otherAnswer;
            }
            return multipleAnswer.copy(set, otherAnswer);
        }

        public final Set<String> component1() {
            return this.answers;
        }

        /* renamed from: component2, reason: from getter */
        public final OtherAnswer getOtherAnswer() {
            return this.otherAnswer;
        }

        public final MultipleAnswer copy(Set<String> answers, OtherAnswer otherAnswer) {
            Intrinsics.checkNotNullParameter(answers, "answers");
            Intrinsics.checkNotNullParameter(otherAnswer, "otherAnswer");
            return new MultipleAnswer(answers, otherAnswer);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MultipleAnswer)) {
                return false;
            }
            MultipleAnswer multipleAnswer = (MultipleAnswer) other;
            return Intrinsics.areEqual(this.answers, multipleAnswer.answers) && Intrinsics.areEqual(this.otherAnswer, multipleAnswer.otherAnswer);
        }

        public int hashCode() {
            return (this.answers.hashCode() * 31) + this.otherAnswer.hashCode();
        }

        public String toString() {
            return "MultipleAnswer(answers=" + this.answers + ", otherAnswer=" + this.otherAnswer + ')';
        }

        /* renamed from: getAnswers, reason: collision with other method in class */
        public final Set<String> m11764getAnswers() {
            return this.answers;
        }

        public /* synthetic */ MultipleAnswer(Set set, OtherAnswer.NotSelected notSelected, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(set, (i & 2) != 0 ? OtherAnswer.NotSelected.INSTANCE : notSelected);
        }

        public final OtherAnswer getOtherAnswer() {
            return this.otherAnswer;
        }

        /* compiled from: Answer.kt */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bB\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016\u0082\u0001\u0003\t\n\u000b¨\u0006\f"}, d2 = {"Lio/intercom/android/sdk/survey/ui/models/Answer$MultipleAnswer$OtherAnswer;", "", "<init>", "()V", InAppPurchaseConstants.METHOD_TO_STRING, "", "NotSelected", "SelectedNoText", "SelectedWithText", "Lio/intercom/android/sdk/survey/ui/models/Answer$MultipleAnswer$OtherAnswer$NotSelected;", "Lio/intercom/android/sdk/survey/ui/models/Answer$MultipleAnswer$OtherAnswer$SelectedNoText;", "Lio/intercom/android/sdk/survey/ui/models/Answer$MultipleAnswer$OtherAnswer$SelectedWithText;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static abstract class OtherAnswer {
            public static final int $stable = 0;

            public /* synthetic */ OtherAnswer(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private OtherAnswer() {
            }

            public String toString() {
                return "";
            }

            /* compiled from: Answer.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/intercom/android/sdk/survey/ui/models/Answer$MultipleAnswer$OtherAnswer$NotSelected;", "Lio/intercom/android/sdk/survey/ui/models/Answer$MultipleAnswer$OtherAnswer;", "<init>", "()V", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class NotSelected extends OtherAnswer {
                public static final int $stable = 0;
                public static final NotSelected INSTANCE = new NotSelected();

                private NotSelected() {
                    super(null);
                }
            }

            /* compiled from: Answer.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/intercom/android/sdk/survey/ui/models/Answer$MultipleAnswer$OtherAnswer$SelectedNoText;", "Lio/intercom/android/sdk/survey/ui/models/Answer$MultipleAnswer$OtherAnswer;", "<init>", "()V", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class SelectedNoText extends OtherAnswer {
                public static final int $stable = 0;
                public static final SelectedNoText INSTANCE = new SelectedNoText();

                private SelectedNoText() {
                    super(null);
                }
            }

            /* compiled from: Answer.kt */
            @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\u0003H\u0016J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH×\u0003J\t\u0010\u000f\u001a\u00020\u0010H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/intercom/android/sdk/survey/ui/models/Answer$MultipleAnswer$OtherAnswer$SelectedWithText;", "Lio/intercom/android/sdk/survey/ui/models/Answer$MultipleAnswer$OtherAnswer;", "text", "", "<init>", "(Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", InAppPurchaseConstants.METHOD_TO_STRING, "component1", "copy", "equals", "", "other", "", "hashCode", "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class SelectedWithText extends OtherAnswer {
                public static final int $stable = 0;
                private final String text;

                public static /* synthetic */ SelectedWithText copy$default(SelectedWithText selectedWithText, String str, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = selectedWithText.text;
                    }
                    return selectedWithText.copy(str);
                }

                /* renamed from: component1, reason: from getter */
                public final String getText() {
                    return this.text;
                }

                public final SelectedWithText copy(String text) {
                    Intrinsics.checkNotNullParameter(text, "text");
                    return new SelectedWithText(text);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof SelectedWithText) && Intrinsics.areEqual(this.text, ((SelectedWithText) other).text);
                }

                public int hashCode() {
                    return this.text.hashCode();
                }

                public final String getText() {
                    return this.text;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public SelectedWithText(String text) {
                    super(null);
                    Intrinsics.checkNotNullParameter(text, "text");
                    this.text = text;
                }

                @Override // io.intercom.android.sdk.survey.ui.models.Answer.MultipleAnswer.OtherAnswer
                public String toString() {
                    return this.text;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MultipleAnswer(Set<String> answers, OtherAnswer otherAnswer) {
            super(null);
            Intrinsics.checkNotNullParameter(answers, "answers");
            Intrinsics.checkNotNullParameter(otherAnswer, "otherAnswer");
            this.answers = answers;
            this.otherAnswer = otherAnswer;
        }

        public final Answer copyWithAnswerToggled(String answer) {
            Intrinsics.checkNotNullParameter(answer, "answer");
            Set mutableSet = CollectionsKt.toMutableSet(this.answers);
            if (this.answers.contains(answer)) {
                mutableSet.remove(answer);
            } else {
                mutableSet.add(answer);
            }
            if (mutableSet.isEmpty() && (this.otherAnswer instanceof OtherAnswer.NotSelected)) {
                return NoAnswer.ResetNoAnswer.INSTANCE;
            }
            return copy$default(this, mutableSet, null, 2, null);
        }

        public final Answer copyWithOther(OtherAnswer otherAnswer) {
            Intrinsics.checkNotNullParameter(otherAnswer, "otherAnswer");
            if (this.answers.isEmpty() && (otherAnswer instanceof OtherAnswer.NotSelected)) {
                return NoAnswer.ResetNoAnswer.INSTANCE;
            }
            return copy$default(this, null, otherAnswer, 1, null);
        }

        public final List<String> getAnswers() {
            List createListBuilder = CollectionsKt.createListBuilder();
            createListBuilder.addAll(CollectionsKt.toList(this.answers));
            OtherAnswer otherAnswer = this.otherAnswer;
            if (!Intrinsics.areEqual(otherAnswer, OtherAnswer.NotSelected.INSTANCE)) {
                if (Intrinsics.areEqual(otherAnswer, OtherAnswer.SelectedNoText.INSTANCE)) {
                    createListBuilder.add("Other");
                } else {
                    if (!(otherAnswer instanceof OtherAnswer.SelectedWithText)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    createListBuilder.add(((OtherAnswer.SelectedWithText) this.otherAnswer).getText());
                }
            }
            return CollectionsKt.build(createListBuilder);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CharSequence getLength$lambda$1(String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it;
        }

        @Override // io.intercom.android.sdk.survey.ui.models.Answer
        public int getLength() {
            return CollectionsKt.joinToString$default(this.answers, null, null, null, 0, null, new Function1() { // from class: io.intercom.android.sdk.survey.ui.models.Answer$MultipleAnswer$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    CharSequence length$lambda$1;
                    length$lambda$1 = Answer.MultipleAnswer.getLength$lambda$1((String) obj);
                    return length$lambda$1;
                }
            }, 31, null).length();
        }
    }

    /* compiled from: Answer.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0006\u0007B\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016\u0082\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Lio/intercom/android/sdk/survey/ui/models/Answer$NoAnswer;", "Lio/intercom/android/sdk/survey/ui/models/Answer;", "<init>", "()V", "getLength", "", "InitialNoAnswer", "ResetNoAnswer", "Lio/intercom/android/sdk/survey/ui/models/Answer$NoAnswer$InitialNoAnswer;", "Lio/intercom/android/sdk/survey/ui/models/Answer$NoAnswer$ResetNoAnswer;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class NoAnswer extends Answer {
        public static final int $stable = 0;

        public /* synthetic */ NoAnswer(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // io.intercom.android.sdk.survey.ui.models.Answer
        public int getLength() {
            return 0;
        }

        private NoAnswer() {
            super(null);
        }

        /* compiled from: Answer.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/intercom/android/sdk/survey/ui/models/Answer$NoAnswer$InitialNoAnswer;", "Lio/intercom/android/sdk/survey/ui/models/Answer$NoAnswer;", "<init>", "()V", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class InitialNoAnswer extends NoAnswer {
            public static final int $stable = 0;
            public static final InitialNoAnswer INSTANCE = new InitialNoAnswer();

            private InitialNoAnswer() {
                super(null);
            }
        }

        /* compiled from: Answer.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/intercom/android/sdk/survey/ui/models/Answer$NoAnswer$ResetNoAnswer;", "Lio/intercom/android/sdk/survey/ui/models/Answer$NoAnswer;", "<init>", "()V", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class ResetNoAnswer extends NoAnswer {
            public static final int $stable = 0;
            public static final ResetNoAnswer INSTANCE = new ResetNoAnswer();

            private ResetNoAnswer() {
                super(null);
            }
        }
    }

    /* compiled from: Answer.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0003\u0014\u0015\u0016B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0016J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÇ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H×\u0003J\t\u0010\u0011\u001a\u00020\nH×\u0001J\t\u0010\u0012\u001a\u00020\u0013H×\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0017"}, d2 = {"Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer;", "Lio/intercom/android/sdk/survey/ui/models/Answer;", "mediaItems", "", "Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$MediaItem;", "<init>", "(Ljava/util/List;)V", "getMediaItems", "()Ljava/util/List;", "getLength", "", "component1", "copy", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "MediaItem", "FileUploadStatus", "FileUploadError", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MediaAnswer extends Answer {
        public static final int $stable = 8;
        private final List<MediaItem> mediaItems;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ MediaAnswer copy$default(MediaAnswer mediaAnswer, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = mediaAnswer.mediaItems;
            }
            return mediaAnswer.copy(list);
        }

        public final List<MediaItem> component1() {
            return this.mediaItems;
        }

        public final MediaAnswer copy(List<MediaItem> mediaItems) {
            Intrinsics.checkNotNullParameter(mediaItems, "mediaItems");
            return new MediaAnswer(mediaItems);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof MediaAnswer) && Intrinsics.areEqual(this.mediaItems, ((MediaAnswer) other).mediaItems);
        }

        public int hashCode() {
            return this.mediaItems.hashCode();
        }

        public String toString() {
            return "MediaAnswer(mediaItems=" + this.mediaItems + ')';
        }

        public final List<MediaItem> getMediaItems() {
            return this.mediaItems;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MediaAnswer(List<MediaItem> mediaItems) {
            super(null);
            Intrinsics.checkNotNullParameter(mediaItems, "mediaItems");
            this.mediaItems = mediaItems;
        }

        @Override // io.intercom.android.sdk.survey.ui.models.Answer
        public int getLength() {
            return this.mediaItems.size();
        }

        /* compiled from: Answer.kt */
        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\tJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u001c\u001a\u00020\u001dH×\u0001J\t\u0010\u001e\u001a\u00020\u001fH×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R+\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\t8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0012\u0010\f¨\u0006 "}, d2 = {"Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$MediaItem;", "", "data", "Lio/intercom/android/sdk/m5/conversation/ui/components/composer/MediaData$Media;", "<init>", "(Lio/intercom/android/sdk/m5/conversation/ui/components/composer/MediaData$Media;)V", "getData", "()Lio/intercom/android/sdk/m5/conversation/ui/components/composer/MediaData$Media;", "<set-?>", "Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadStatus;", "_uploadStatus", "get_uploadStatus", "()Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadStatus;", "set_uploadStatus", "(Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadStatus;)V", "_uploadStatus$delegate", "Landroidx/compose/runtime/MutableState;", "uploadStatus", "getUploadStatus", "uploadStatus$delegate", "Landroidx/compose/runtime/State;", "setUploadStatus", "", "component1", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class MediaItem {
            public static final int $stable = 8;

            /* renamed from: _uploadStatus$delegate, reason: from kotlin metadata */
            private final MutableState _uploadStatus;
            private final MediaData.Media data;

            /* renamed from: uploadStatus$delegate, reason: from kotlin metadata */
            private final State uploadStatus;

            public static /* synthetic */ MediaItem copy$default(MediaItem mediaItem, MediaData.Media media, int i, Object obj) {
                if ((i & 1) != 0) {
                    media = mediaItem.data;
                }
                return mediaItem.copy(media);
            }

            /* renamed from: component1, reason: from getter */
            public final MediaData.Media getData() {
                return this.data;
            }

            public final MediaItem copy(MediaData.Media data) {
                Intrinsics.checkNotNullParameter(data, "data");
                return new MediaItem(data);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof MediaItem) && Intrinsics.areEqual(this.data, ((MediaItem) other).data);
            }

            public int hashCode() {
                return this.data.hashCode();
            }

            public String toString() {
                return "MediaItem(data=" + this.data + ')';
            }

            public MediaItem(MediaData.Media data) {
                Intrinsics.checkNotNullParameter(data, "data");
                this.data = data;
                this._uploadStatus = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(FileUploadStatus.None.INSTANCE, null, 2, null);
                this.uploadStatus = SnapshotStateKt.derivedStateOf(new Function0() { // from class: io.intercom.android.sdk.survey.ui.models.Answer$MediaAnswer$MediaItem$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Answer.MediaAnswer.FileUploadStatus uploadStatus_delegate$lambda$0;
                        uploadStatus_delegate$lambda$0 = Answer.MediaAnswer.MediaItem.uploadStatus_delegate$lambda$0(Answer.MediaAnswer.MediaItem.this);
                        return uploadStatus_delegate$lambda$0;
                    }
                });
            }

            public final MediaData.Media getData() {
                return this.data;
            }

            /* JADX WARN: Multi-variable type inference failed */
            private final FileUploadStatus get_uploadStatus() {
                return (FileUploadStatus) this._uploadStatus.getValue();
            }

            private final void set_uploadStatus(FileUploadStatus fileUploadStatus) {
                this._uploadStatus.setValue(fileUploadStatus);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final FileUploadStatus uploadStatus_delegate$lambda$0(MediaItem this$0) {
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                return this$0.get_uploadStatus();
            }

            public final FileUploadStatus getUploadStatus() {
                return (FileUploadStatus) this.uploadStatus.getValue();
            }

            public final void setUploadStatus(FileUploadStatus uploadStatus) {
                Intrinsics.checkNotNullParameter(uploadStatus, "uploadStatus");
                set_uploadStatus(uploadStatus);
            }
        }

        /* compiled from: Answer.kt */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadStatus;", "", "<init>", "()V", "None", "Queued", "Uploading", "Success", "Error", "Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadStatus$Error;", "Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadStatus$None;", "Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadStatus$Queued;", "Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadStatus$Success;", "Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadStatus$Uploading;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static abstract class FileUploadStatus {
            public static final int $stable = 0;

            public /* synthetic */ FileUploadStatus(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* compiled from: Answer.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadStatus$None;", "Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadStatus;", "<init>", "()V", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class None extends FileUploadStatus {
                public static final int $stable = 0;
                public static final None INSTANCE = new None();

                private None() {
                    super(null);
                }
            }

            private FileUploadStatus() {
            }

            /* compiled from: Answer.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadStatus$Queued;", "Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadStatus;", "<init>", "()V", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class Queued extends FileUploadStatus {
                public static final int $stable = 0;
                public static final Queued INSTANCE = new Queued();

                private Queued() {
                    super(null);
                }
            }

            /* compiled from: Answer.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadStatus$Uploading;", "Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadStatus;", "<init>", "()V", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class Uploading extends FileUploadStatus {
                public static final int $stable = 0;
                public static final Uploading INSTANCE = new Uploading();

                private Uploading() {
                    super(null);
                }
            }

            /* compiled from: Answer.kt */
            @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u0003H×\u0001J\t\u0010\u000f\u001a\u00020\u0010H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadStatus$Success;", "Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadStatus;", "id", "", "<init>", "(I)V", "getId", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class Success extends FileUploadStatus {
                public static final int $stable = 0;
                private final int id;

                public static /* synthetic */ Success copy$default(Success success, int i, int i2, Object obj) {
                    if ((i2 & 1) != 0) {
                        i = success.id;
                    }
                    return success.copy(i);
                }

                /* renamed from: component1, reason: from getter */
                public final int getId() {
                    return this.id;
                }

                public final Success copy(int id) {
                    return new Success(id);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Success) && this.id == ((Success) other).id;
                }

                public int hashCode() {
                    return Integer.hashCode(this.id);
                }

                public String toString() {
                    return "Success(id=" + this.id + ')';
                }

                public Success(int i) {
                    super(null);
                    this.id = i;
                }

                public final int getId() {
                    return this.id;
                }
            }

            /* compiled from: Answer.kt */
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0011H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadStatus$Error;", "Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadStatus;", "error", "Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadError;", "<init>", "(Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadError;)V", "getError", "()Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadError;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class Error extends FileUploadStatus {
                public static final int $stable = 8;
                private final FileUploadError error;

                public static /* synthetic */ Error copy$default(Error error, FileUploadError fileUploadError, int i, Object obj) {
                    if ((i & 1) != 0) {
                        fileUploadError = error.error;
                    }
                    return error.copy(fileUploadError);
                }

                /* renamed from: component1, reason: from getter */
                public final FileUploadError getError() {
                    return this.error;
                }

                public final Error copy(FileUploadError error) {
                    Intrinsics.checkNotNullParameter(error, "error");
                    return new Error(error);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Error) && Intrinsics.areEqual(this.error, ((Error) other).error);
                }

                public int hashCode() {
                    return this.error.hashCode();
                }

                public String toString() {
                    return "Error(error=" + this.error + ')';
                }

                public final FileUploadError getError() {
                    return this.error;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Error(FileUploadError error) {
                    super(null);
                    Intrinsics.checkNotNullParameter(error, "error");
                    this.error = error;
                }
            }
        }

        /* compiled from: Answer.kt */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\t\n\u000b\fB\u0017\b\u0004\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0004\r\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadError;", "", "errorMessages", "", "Lio/intercom/android/sdk/ui/common/StringProvider$StringRes;", "<init>", "(Ljava/util/List;)V", "getErrorMessages", "()Ljava/util/List;", "UploadFailed", "FileLimitExceeded", "UnsupportedFileType", "FileTooLarge", "Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadError$FileLimitExceeded;", "Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadError$FileTooLarge;", "Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadError$UnsupportedFileType;", "Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadError$UploadFailed;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static abstract class FileUploadError {
            public static final int $stable = 8;
            private final List<StringProvider.StringRes> errorMessages;

            public /* synthetic */ FileUploadError(List list, DefaultConstructorMarker defaultConstructorMarker) {
                this(list);
            }

            private FileUploadError(List<StringProvider.StringRes> list) {
                this.errorMessages = list;
            }

            public final List<StringProvider.StringRes> getErrorMessages() {
                return this.errorMessages;
            }

            /* compiled from: Answer.kt */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadError$UploadFailed;", "Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadError;", "message", "", "Lio/intercom/android/sdk/ui/common/StringProvider$StringRes;", "<init>", "(Ljava/util/List;)V", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class UploadFailed extends FileUploadError {
                public static final int $stable = 0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public UploadFailed(List<StringProvider.StringRes> message) {
                    super(message, null);
                    Intrinsics.checkNotNullParameter(message, "message");
                }
            }

            /* compiled from: Answer.kt */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadError$FileLimitExceeded;", "Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadError;", "message", "", "Lio/intercom/android/sdk/ui/common/StringProvider$StringRes;", "<init>", "(Ljava/util/List;)V", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class FileLimitExceeded extends FileUploadError {
                public static final int $stable = 0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public FileLimitExceeded(List<StringProvider.StringRes> message) {
                    super(message, null);
                    Intrinsics.checkNotNullParameter(message, "message");
                }
            }

            /* compiled from: Answer.kt */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadError$UnsupportedFileType;", "Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadError;", "message", "", "Lio/intercom/android/sdk/ui/common/StringProvider$StringRes;", "<init>", "(Ljava/util/List;)V", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class UnsupportedFileType extends FileUploadError {
                public static final int $stable = 0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public UnsupportedFileType(List<StringProvider.StringRes> message) {
                    super(message, null);
                    Intrinsics.checkNotNullParameter(message, "message");
                }
            }

            /* compiled from: Answer.kt */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadError$FileTooLarge;", "Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$FileUploadError;", "message", "", "Lio/intercom/android/sdk/ui/common/StringProvider$StringRes;", "<init>", "(Ljava/util/List;)V", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class FileTooLarge extends FileUploadError {
                public static final int $stable = 0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public FileTooLarge(List<StringProvider.StringRes> message) {
                    super(message, null);
                    Intrinsics.checkNotNullParameter(message, "message");
                }
            }
        }
    }
}
