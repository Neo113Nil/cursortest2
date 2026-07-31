package io.intercom.android.sdk.survey;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SurveyViewModel.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lio/intercom/android/sdk/survey/ValidationError;", "", "<init>", "()V", "Unchecked", "ValidationStringError", "NoValidationError", "Lio/intercom/android/sdk/survey/ValidationError$NoValidationError;", "Lio/intercom/android/sdk/survey/ValidationError$Unchecked;", "Lio/intercom/android/sdk/survey/ValidationError$ValidationStringError;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class ValidationError {
    public static final int $stable = 0;

    public /* synthetic */ ValidationError(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: SurveyViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/intercom/android/sdk/survey/ValidationError$Unchecked;", "Lio/intercom/android/sdk/survey/ValidationError;", "<init>", "()V", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Unchecked extends ValidationError {
        public static final int $stable = 0;
        public static final Unchecked INSTANCE = new Unchecked();

        private Unchecked() {
            super(null);
        }
    }

    private ValidationError() {
    }

    /* compiled from: SurveyViewModel.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u001a\b\u0002\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u001b\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00060\u0005HÆ\u0003J/\u0010\u0010\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u001a\b\u0002\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00060\u0005HÇ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H×\u0003J\t\u0010\u0015\u001a\u00020\u0003H×\u0001J\t\u0010\u0016\u001a\u00020\u0007H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR#\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lio/intercom/android/sdk/survey/ValidationError$ValidationStringError;", "Lio/intercom/android/sdk/survey/ValidationError;", "stringRes", "", "params", "", "Lkotlin/Pair;", "", "<init>", "(ILjava/util/List;)V", "getStringRes", "()I", "getParams", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ValidationStringError extends ValidationError {
        public static final int $stable = 8;
        private final List<Pair<String, String>> params;
        private final int stringRes;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ValidationStringError copy$default(ValidationStringError validationStringError, int i, List list, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = validationStringError.stringRes;
            }
            if ((i2 & 2) != 0) {
                list = validationStringError.params;
            }
            return validationStringError.copy(i, list);
        }

        /* renamed from: component1, reason: from getter */
        public final int getStringRes() {
            return this.stringRes;
        }

        public final List<Pair<String, String>> component2() {
            return this.params;
        }

        public final ValidationStringError copy(int stringRes, List<Pair<String, String>> params) {
            Intrinsics.checkNotNullParameter(params, "params");
            return new ValidationStringError(stringRes, params);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ValidationStringError)) {
                return false;
            }
            ValidationStringError validationStringError = (ValidationStringError) other;
            return this.stringRes == validationStringError.stringRes && Intrinsics.areEqual(this.params, validationStringError.params);
        }

        public int hashCode() {
            return (Integer.hashCode(this.stringRes) * 31) + this.params.hashCode();
        }

        public String toString() {
            return "ValidationStringError(stringRes=" + this.stringRes + ", params=" + this.params + ')';
        }

        public final int getStringRes() {
            return this.stringRes;
        }

        public /* synthetic */ ValidationStringError(int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, (i2 & 2) != 0 ? CollectionsKt.emptyList() : list);
        }

        public final List<Pair<String, String>> getParams() {
            return this.params;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ValidationStringError(int i, List<Pair<String, String>> params) {
            super(null);
            Intrinsics.checkNotNullParameter(params, "params");
            this.stringRes = i;
            this.params = params;
        }
    }

    /* compiled from: SurveyViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/intercom/android/sdk/survey/ValidationError$NoValidationError;", "Lio/intercom/android/sdk/survey/ValidationError;", "<init>", "()V", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NoValidationError extends ValidationError {
        public static final int $stable = 0;
        public static final NoValidationError INSTANCE = new NoValidationError();

        private NoValidationError() {
            super(null);
        }
    }
}
