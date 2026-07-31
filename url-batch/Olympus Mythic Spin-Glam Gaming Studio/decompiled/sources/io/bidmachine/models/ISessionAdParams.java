package io.bidmachine.models;

import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes13.dex */
public interface ISessionAdParams<SelfType> {
    @NonNull
    @Deprecated
    SelfType setClickRate(@Nullable @FloatRange Float f);

    @NonNull
    @Deprecated
    SelfType setCompletionRate(@Nullable @FloatRange Float f);

    @NonNull
    @Deprecated
    SelfType setImpressionCount(@IntRange @Nullable Integer num);

    @NonNull
    @Deprecated
    SelfType setIsUserClickedOnLastAd(@Nullable Boolean bool);

    @NonNull
    SelfType setSessionDuration(@IntRange @Nullable Integer num);
}
