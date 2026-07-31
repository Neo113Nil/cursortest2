package com.google.android.gms.tasks;

import androidx.annotation.NonNull;

/* compiled from: com.google.android.gms:play-services-tasks@@18.2.1 */
/* loaded from: classes15.dex */
public interface Continuation<TResult, TContinuationResult> {
    TContinuationResult then(@NonNull Task<TResult> task) throws Exception;
}
