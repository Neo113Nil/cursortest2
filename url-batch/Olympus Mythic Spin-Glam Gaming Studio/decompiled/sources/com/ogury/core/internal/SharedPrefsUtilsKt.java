package com.ogury.core.internal;

import android.content.Context;
import java.io.File;
import kotlin.Metadata;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-f6b89802f4bb37a88df877e1128ae5b0c949df87377d83c36e528e9a9b869b70 */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"deleteLegacySharedPreferences", "", "Landroid/content/Context;", "sharedPreferencesName", "", "sdk-core_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SharedPrefsUtilsKt {
    public static final void deleteLegacySharedPreferences(@NotNull Context context, @NotNull String sharedPreferencesName) {
        File file;
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(sharedPreferencesName, "sharedPreferencesName");
        try {
            File parentFile = context.getFilesDir().getParentFile();
            File file2 = null;
            File resolve = parentFile != null ? FilesKt.resolve(parentFile, "shared_prefs") : null;
            if (resolve != null) {
                file = FilesKt.resolve(resolve, sharedPreferencesName + ".xml");
            } else {
                file = null;
            }
            if (file != null && file.exists()) {
                file.delete();
            }
            if (resolve != null) {
                file2 = FilesKt.resolve(resolve, sharedPreferencesName + ".xml.bak");
            }
            if (file2 == null || !file2.exists()) {
                return;
            }
            file2.delete();
        } catch (Exception unused) {
        }
    }
}
