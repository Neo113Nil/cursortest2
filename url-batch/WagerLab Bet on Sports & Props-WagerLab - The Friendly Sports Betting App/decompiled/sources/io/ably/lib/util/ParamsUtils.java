package io.ably.lib.util;

import io.ably.lib.types.ClientOptions;
import io.ably.lib.types.Param;

/* loaded from: classes7.dex */
public class ParamsUtils {
    public static Param[] enrichParams(Param[] paramArr, ClientOptions clientOptions) {
        if (clientOptions.pushFullWait) {
            paramArr = Param.push(paramArr, "fullWait", "true");
        }
        return clientOptions.addRequestIds ? Param.set(paramArr, Crypto.generateRandomRequestId()) : paramArr;
    }
}
