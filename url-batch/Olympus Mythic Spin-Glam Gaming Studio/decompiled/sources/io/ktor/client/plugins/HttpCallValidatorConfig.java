package io.ktor.client.plugins;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HttpCallValidator.kt */
/* loaded from: classes5.dex */
public final class HttpCallValidatorConfig {
    private final List responseValidators = new ArrayList();
    private final List responseExceptionHandlers = new ArrayList();
    private boolean expectSuccess = true;

    public final List getResponseValidators$ktor_client_core() {
        return this.responseValidators;
    }

    public final List getResponseExceptionHandlers$ktor_client_core() {
        return this.responseExceptionHandlers;
    }

    public final boolean getExpectSuccess$ktor_client_core() {
        return this.expectSuccess;
    }

    public final void setExpectSuccess$ktor_client_core(boolean z) {
        this.expectSuccess = z;
    }

    public final void validateResponse(Function2 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        this.responseValidators.add(block);
    }
}
