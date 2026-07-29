package o;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: o.yL, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2282yL implements FilenameFilter {
    public final /* synthetic */ String a;

    public C2282yL(String str) {
        this.a = str;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return str.startsWith(this.a);
    }
}
