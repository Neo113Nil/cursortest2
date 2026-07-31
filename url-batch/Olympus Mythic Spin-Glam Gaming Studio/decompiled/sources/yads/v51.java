package yads;

import android.content.Context;
import androidx.core.content.FileProvider;
import java.io.File;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* loaded from: classes4.dex */
public final class v51 {
    public final Context a;
    public final p51 b;

    public v51(Context context, p51 p51Var) {
        this.a = context;
        this.b = p51Var;
    }

    public final u51 a(String str) {
        try {
            File a = this.b.a();
            File parentFile = a.getParentFile();
            long freeSpace = parentFile != null ? parentFile.getFreeSpace() : 0L;
            byte[] bytes = str.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            if (bytes.length >= freeSpace) {
                return new r51("Not enough space error");
            }
            FilesKt.writeBytes(a, bytes);
            return new t51(FileProvider.getUriForFile(this.a, this.a.getPackageName() + ".monetization.ads.inspector.fileprovider", a));
        } catch (Exception unused) {
            boolean z = ob1.a;
            return new r51("Failed to save report");
        }
    }
}
