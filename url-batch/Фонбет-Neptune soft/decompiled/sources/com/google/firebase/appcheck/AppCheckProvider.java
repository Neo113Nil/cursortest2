package com.google.firebase.appcheck;

import com.google.android.gms.tasks.Task;

/* loaded from: classes.dex */
public interface AppCheckProvider {
    Task<AppCheckToken> getToken();
}
