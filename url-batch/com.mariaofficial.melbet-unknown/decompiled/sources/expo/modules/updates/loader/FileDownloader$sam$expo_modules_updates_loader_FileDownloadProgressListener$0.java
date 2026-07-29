package expo.modules.updates.loader;

import expo.modules.updates.loader.FileDownloadProgressListener;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FileDownloader.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
final class FileDownloader$sam$expo_modules_updates_loader_FileDownloadProgressListener$0 implements FileDownloadProgressListener, FunctionAdapter {
    private final /* synthetic */ Function1 function;

    FileDownloader$sam$expo_modules_updates_loader_FileDownloadProgressListener$0(Function1 function) {
        Intrinsics.checkNotNullParameter(function, "function");
        this.function = function;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof FileDownloadProgressListener) && (obj instanceof FunctionAdapter)) {
            return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    public final Function<?> getFunctionDelegate() {
        return this.function;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // expo.modules.updates.loader.FileDownloadProgressListener
    public final /* synthetic */ void onProgressUpdate(double d) {
        this.function.invoke(Double.valueOf(d));
    }

    @Override // expo.modules.updates.loader.FileDownloadProgressListener
    public void update(long j, long j2) {
        FileDownloadProgressListener.DefaultImpls.update(this, j, j2);
    }
}
