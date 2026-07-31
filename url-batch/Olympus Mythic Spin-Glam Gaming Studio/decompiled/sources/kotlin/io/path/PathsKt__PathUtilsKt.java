package kotlin.io.path;

import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import org.slf4j.Marker;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PathUtils.kt */
/* loaded from: classes5.dex */
public abstract class PathsKt__PathUtilsKt extends PathsKt__PathRecursiveFunctionsKt {
    public static /* synthetic */ List listDirectoryEntries$default(Path path, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = Marker.ANY_MARKER;
        }
        return listDirectoryEntries(path, str);
    }

    public static final List listDirectoryEntries(Path path, String glob) {
        DirectoryStream newDirectoryStream;
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(glob, "glob");
        newDirectoryStream = Files.newDirectoryStream(path, glob);
        try {
            DirectoryStream m = PathsKt__PathUtilsKt$$ExternalSyntheticApiModelOutline1.m(newDirectoryStream);
            Intrinsics.checkNotNull(m);
            List list = CollectionsKt.toList(m);
            CloseableKt.closeFinally(newDirectoryStream, null);
            return list;
        } finally {
        }
    }
}
