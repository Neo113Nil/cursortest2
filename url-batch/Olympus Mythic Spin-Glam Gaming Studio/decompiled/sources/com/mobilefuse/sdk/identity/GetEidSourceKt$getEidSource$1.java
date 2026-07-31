package com.mobilefuse.sdk.identity;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GetEidSource.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "", "invoke"}, k = 3, mv = {1, 4, 3})
/* loaded from: classes3.dex */
public final /* synthetic */ class GetEidSourceKt$getEidSource$1 extends FunctionReferenceImpl implements Function0 {
    GetEidSourceKt$getEidSource$1(EidService eidService) {
        super(0, eidService, EidService.class, "getEidsAsHttpQueryParams", "getEidsAsHttpQueryParams()Ljava/util/Map;", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    /* renamed from: invoke */
    public final Map<String, String> mo4828invoke() {
        return ((EidService) this.receiver).getEidsAsHttpQueryParams();
    }
}
