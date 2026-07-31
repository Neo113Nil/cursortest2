package yads;

import java.io.File;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
public final class cv0 extends Lambda implements Function0 {
    public final /* synthetic */ fv0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cv0(fv0 fv0Var) {
        super(0);
        this.b = fv0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        return new File(this.b.a.getFilesDir(), "downloaded_fonts");
    }
}
