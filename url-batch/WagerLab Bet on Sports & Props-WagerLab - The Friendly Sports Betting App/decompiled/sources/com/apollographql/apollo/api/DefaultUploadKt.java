package com.apollographql.apollo.api;

import kotlin.Metadata;
import okio.FileSystem;
import okio.Path;

/* compiled from: DefaultUpload.concurrent.kt */
@Metadata(d1 = {"com/apollographql/apollo/api/DefaultUploadKt__DefaultUpload_concurrentKt"}, k = 4, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DefaultUploadKt {
    public static final Upload toUpload(Path path, String str, FileSystem fileSystem) {
        return DefaultUploadKt__DefaultUpload_concurrentKt.toUpload(path, str, fileSystem);
    }
}
