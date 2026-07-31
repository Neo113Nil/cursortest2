package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.annotations.DoNotInline;
import java.io.File;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@DoNotInline
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\t¨\u0006\r"}, d2 = {"Lio/appmetrica/analytics/impl/b7;", "Lio/appmetrica/analytics/impl/a7;", "Landroid/content/Context;", "context", "", "simpleName", "Ljava/io/File;", "a", "Lio/appmetrica/analytics/impl/Sg;", "Lio/appmetrica/analytics/impl/Sg;", "relativePathFormer", "<init>", "(Lio/appmetrica/analytics/impl/Sg;)V", "analytics_binaryProdRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: io.appmetrica.analytics.impl.b7, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C5224b7 implements InterfaceC5198a7 {

    /* renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Sg relativePathFormer;

    public C5224b7(@NotNull Sg sg2) {
        this.relativePathFormer = sg2;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5198a7
    @NotNull
    public File a(@NotNull Context context, @NotNull String simpleName) {
        return new File(context.getNoBackupFilesDir(), this.relativePathFormer.a(simpleName));
    }
}
