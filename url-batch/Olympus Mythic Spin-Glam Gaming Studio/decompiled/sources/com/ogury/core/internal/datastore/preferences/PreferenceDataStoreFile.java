package com.ogury.core.internal.datastore.preferences;

import android.content.Context;
import com.ogury.core.internal.datastore.datastore.DataStoreFile;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-f6b89802f4bb37a88df877e1128ae5b0c949df87377d83c36e528e9a9b869b70 */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"preferencesDataStoreFile", "Ljava/io/File;", "Landroid/content/Context;", "name", "", "sdk-core_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PreferenceDataStoreFile {
    @NotNull
    public static final File preferencesDataStoreFile(@NotNull Context context, @NotNull String name) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        return DataStoreFile.dataStoreFile(context, name + ".json");
    }
}
