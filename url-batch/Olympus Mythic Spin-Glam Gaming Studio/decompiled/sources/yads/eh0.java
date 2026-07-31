package yads;

import android.content.Context;
import java.io.File;

/* loaded from: classes10.dex */
public final class eh0 {
    public static File a(Context context, String str) {
        return new File(context.getCacheDir().getPath() + File.separator + str);
    }
}
