package io.bidmachine.util;

import kotlin.Metadata;

/* compiled from: ResultCallback.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003J\u0015\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00028\u0001H&¢\u0006\u0002\u0010\u0007J\u0015\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lio/bidmachine/util/ResultCallback;", "SuccessType", "ErrorType", "", "onError", "", "error", "(Ljava/lang/Object;)V", "onSuccess", "result", "bidmachine-android-sdk_bd_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes12.dex */
public interface ResultCallback<SuccessType, ErrorType> {
    void onError(ErrorType error);

    void onSuccess(SuccessType result);
}
